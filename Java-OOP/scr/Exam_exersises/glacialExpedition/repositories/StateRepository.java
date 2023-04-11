package glacialExpedition.repositories;

import glacialExpedition.models.states.State;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StateRepository implements Repository<State>{
    private Collection<State>states;

    public StateRepository() {
        states = new ArrayList<>();
    }

    @Override
    public Collection<State> getCollection() {
        return Collections.unmodifiableCollection(states);
    }

    @Override
    public void add(State entity) {
        states.add(entity);

    }

    @Override
    public boolean remove(State entity) {
        return states.remove(entity);
    }

    @Override
    public State byName(String name) {
        for (State state : states) {
            if(state.getName().equals(name)){
                return state;
            }

        }
        return null;
        //states.stream().filter(s->s.getName().equals(name)).findFirst().orElse(null);
    }
}
