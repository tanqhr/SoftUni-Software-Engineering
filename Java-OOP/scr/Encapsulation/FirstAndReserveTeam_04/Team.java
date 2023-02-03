package FirstAndReserveTeam_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {

    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        this.name=name;
        this.firstTeam=new ArrayList<>();
        this.reserveTeam=new ArrayList<>();
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(reserveTeam);
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }
    public void addPlayer(Person person){
        if(person.getAge()< 40){
            firstTeam.add(person);
        }else{
            reserveTeam.add(person);
        }
    }

    public String getName() {
        return name;
    }

   public void setName(String name) {
        this.name = name;
    }


}
