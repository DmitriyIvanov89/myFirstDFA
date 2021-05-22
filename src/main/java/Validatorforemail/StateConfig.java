package Validatorforemail;

import java.util.ArrayList;
import java.util.List;

public class StateConfig {

    private List<JsonState> stateDefinition;
    private String startState;

    public StateConfig(List<JsonState> stateDefinition, String startState) {
        this.stateDefinition = new ArrayList<JsonState>();
        this.startState = startState;
    }

    public String getStartState() {
        return startState;
    }

    public List<JsonState> getStateDefinition() {
        return stateDefinition;
    }

    @Override
    public String toString() {
        return String.format("States:%s" + "\n", stateDefinition);
    }

}