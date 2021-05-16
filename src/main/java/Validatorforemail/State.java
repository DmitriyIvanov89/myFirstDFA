package Validatorforemail;

import java.util.HashMap;
import java.util.Map;

public class State {

    private boolean finite;
    private Map<Character, State> transitions;
    private String id;

    public State(String name, boolean isFinish) {
        this.finite = isFinish;
        this.id = name;
        this.transitions = new HashMap<>();
    }

    public void addTransition(Character symbol, State nextState) {
        this.transitions.put(symbol, nextState);
    }

    public State getTransition(Character symbol) {
        return transitions.get(symbol);
    }

    public boolean isFinite() {
        return finite;
    }

    @Override
    public String toString() {
        return String.format("State:%s", id);
    }
}
