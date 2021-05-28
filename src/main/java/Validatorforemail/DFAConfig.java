package Validatorforemail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DFAConfig {

    private List<State> stateDefinition;
    private List<Transitions> transitions;
    private String startId;

    public DFAConfig(List<State> stateDefinition, List<Transitions> transitions, String startId) {
        this.stateDefinition = new ArrayList<State>();
        this.transitions = new ArrayList<Transitions>();
        this.startId = startId;
    }

    public String getStartId() {
        return startId;
    }

    public List<State> getStateDefinition() {
        return stateDefinition;
    }

    public List<Transitions> getTransitions() {
        return transitions;
    }

    public class Transitions {

        private String from;
        private Character symbol;
        private String to;

        public String getFrom() {
            return from;
        }

        public String getTo() {
            return to;
        }

        public Character getSymbol() {
            return symbol;
        }
    }

    public class State {

        private String id;
        private boolean finite;
        private Map<Character, State> transition;

        public State(String id, boolean finite) {
            this.id = id;
            this.finite = finite;
            this.transition = new HashMap<>();
        }

        public String getId() {
            return id;
        }

        public boolean isFinite() {
            return finite;
        }

        public void addTransition(Character symbol, State nextState) {
            transition.put(symbol, nextState);
        }

        public State getTransition(Character symbol) {
            return transition.get(symbol);
        }

        @Override
        public String toString() {
            return String.format("%s", id);
        }
    }
}