package glacialExpedition.core;

import glacialExpedition.common.ConstantMessages;
import glacialExpedition.common.ExceptionMessages;
import glacialExpedition.models.explorers.AnimalExplorer;
import glacialExpedition.models.explorers.Explorer;
import glacialExpedition.models.explorers.GlacierExplorer;
import glacialExpedition.models.explorers.NaturalExplorer;
import glacialExpedition.models.mission.Mission;
import glacialExpedition.models.mission.MissionImpl;
import glacialExpedition.models.states.State;
import glacialExpedition.models.states.StateImpl;
import glacialExpedition.repositories.ExplorerRepository;
import glacialExpedition.repositories.Repository;
import glacialExpedition.repositories.StateRepository;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



public class ControllerImpl implements Controller {
    private ExplorerRepository explorerRepository;
    private StateRepository stateRepository;
    int countDiscoveredPlanets=0;

    public ControllerImpl() {
        explorerRepository = new ExplorerRepository();
        stateRepository = new StateRepository();
    }

    @Override
    public String addExplorer(String type, String explorerName) {
        Explorer explorer;
        if(type.equals("AnimalExplorer")){
             explorer =new AnimalExplorer(explorerName);
        }else if(type.equals("GlacierExplorer")){
             explorer = new GlacierExplorer(explorerName);
        }else if(type.equals("NaturalExplorer")){
             explorer = new NaturalExplorer(explorerName);
        }else{
            throw new IllegalArgumentException(ExceptionMessages.EXPLORER_INVALID_TYPE);
        }
        explorerRepository.add(explorer);
        return String.format(ConstantMessages.EXPLORER_ADDED,type,explorerName);
    }

    @Override
    public String addState(String stateName, String... exhibits) {
        State state = new StateImpl(stateName);
        Collections.addAll(state.getExhibits(),exhibits);
       // for (String exhibit : exhibits) {
           // state.getExhibits().add(exhibit);

        //}
        stateRepository.add(state);

        return String.format(ConstantMessages.STATE_ADDED,stateName);
    }

    @Override
    public String retireExplorer(String explorerName) {
        Explorer retiredExplorer=explorerRepository.byName(explorerName);
        if(retiredExplorer==null){
            throw new IllegalArgumentException(String.format(ExceptionMessages.EXPLORER_DOES_NOT_EXIST,explorerName));
        }
        explorerRepository.remove(retiredExplorer);
        return String.format(ConstantMessages.EXPLORER_RETIRED,explorerName);
    }

    @Override
    public String exploreState(String stateName) {
        List<Explorer> validExplorer= explorerRepository.getCollection().stream().filter(e->e.getEnergy()>50).collect(Collectors.toList());
        if(validExplorer.isEmpty()){
            throw new IllegalArgumentException(ExceptionMessages.STATE_EXPLORERS_DOES_NOT_EXISTS);
        }
        Mission mission = new MissionImpl();
        State stateToExplore = stateRepository.byName(stateName);
        mission.explore(stateToExplore,validExplorer);
        long countTiredExplorers= validExplorer.stream().filter(e->e.getEnergy()==0).count();
        countDiscoveredPlanets++;
        return String.format(ConstantMessages.STATE_EXPLORER,stateName,countTiredExplorers);
    }

    @Override
    public String finalResult() {
        StringBuilder builder=new StringBuilder();
        builder.append(String.format(ConstantMessages.FINAL_STATE_EXPLORED,countDiscoveredPlanets)).append(System.lineSeparator());
        builder.append(ConstantMessages.FINAL_EXPLORER_INFO).append(System.lineSeparator());
        builder.append(explorerRepository.toString());



        return builder.toString().trim();
    }
}
