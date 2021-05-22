package Validatorforemail;

import java.util.ArrayList;
import java.util.List;

public class StateConfig {

    private List<JsonState> stateDefinition;
    private List<Transitions> transitions;
    private String startId;

    public StateConfig(List<JsonState> stateDefinition, List<Transitions> transitions, String startId) {
        this.stateDefinition = new ArrayList<JsonState>();
        this.transitions = new ArrayList<Transitions>();
        this.startId = startId;
    }

    public String getStartId() {
        return startId;
    }

    public List<JsonState> getStateDefinition() {
        return stateDefinition;
    }

    public List<Transitions> getTransitions() {
        return transitions;
    }

    @Override
    public String toString() {
        return String.format("States:%s" + "\n", stateDefinition);
    }

}