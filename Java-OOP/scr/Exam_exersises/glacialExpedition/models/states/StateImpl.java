package glacialExpedition.models.states;

import glacialExpedition.common.ExceptionMessages;

import java.util.ArrayList;
import java.util.Collection;

public class StateImpl implements State{
    private String name;
    private Collection <String> exhibits;

    public StateImpl(String name) {
        this.setName(name);
        exhibits = new ArrayList<>();

    }

    @Override
    public Collection<String> getExhibits() {
        return exhibits;
    }

    @Override
    public String getName() {
        return this.name;
    }
    protected void setName(String name) {
        if (name == null || name.trim().equals("")) {
            throw new NullPointerException(ExceptionMessages.STATE_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }
}
