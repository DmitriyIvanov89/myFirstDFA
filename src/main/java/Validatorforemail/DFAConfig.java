package Validatorforemail;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DFAConfig {

    private List<JsonState> stateDefinition;
    private List<JsonTransitions> transitions;
    private String startId;

    public String getStartId() {
        return startId;
    }

    public List<JsonState> getStateDefinition() {
        return stateDefinition;
    }

    public List<JsonTransitions> getTransitions() {
        return transitions;
    }

    public class JsonTransitions {

        JsonState from;
        JsonState to;
        Character symbol;

        public JsonState getFrom() {
            return from;
        }

        public JsonState getTo() {
            return to;
        }

        public Character getSymbol() {
            return symbol;
        }

        @Override
        public String toString() {
            return String.format("State from: %s, by: %s, to: %s", from, symbol, to);
        }
    }

    public class JsonState {

        private String id;
        private boolean finite;
        private Map<JsonState, Character> jsTransitions;

        public JsonState(Map<Character, JsonState> transitions) {
            this.jsTransitions = new HashMap<JsonState, Character>();
        }

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