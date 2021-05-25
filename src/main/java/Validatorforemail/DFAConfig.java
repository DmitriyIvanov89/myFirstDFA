package Validatorforemail;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DFAConfig {

    private List<JsonState> stateDefinition;
    private List<Transitions> transitions;
    private String startId;

    public DFAConfig(List<JsonState> stateDefinition, List<Transitions> transitions, String startId) {
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

        @Override
        public String toString() {
            return String.format("State from: %s, by symbol: %s, to: %s", from, symbol, to);
        }
    }

    public class JsonState {

        private String id;
        private boolean finite;
        private Map<JsonState, Character> jsTransitions;

        public String getId() {
            return id;
        }

        public boolean isFinite() {
            return finite;
        }

        public Map<JsonState, Character> getJsTransitions() {
            return jsTransitions;
        }

        public void addTransition(JsonState nextState, Character symbol) {
            this.jsTransitions.put(nextState, symbol);
        }

        @Override
        public String toString() {
            return String.format("id: %s, finite: %s", id, finite);
        }
    }
}