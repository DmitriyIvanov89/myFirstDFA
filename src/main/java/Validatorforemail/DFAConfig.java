package Validatorforemail;

import java.util.ArrayList;
import java.util.List;

public class DFAConfig {

    private List<JsonState> stateDefinition;
    private List<JsonTransitions> transitions;
    private String startId;

    public DFAConfig(List<JsonState> stateDefinition, List<JsonTransitions> transitions, String startId) {
        this.stateDefinition = new ArrayList<JsonState>();
        this.transitions = new ArrayList<JsonTransitions>();
        this.startId = startId;
    }

    public String getStartId() {
        return startId;
    }

    public List<JsonState> getStateDefinition() {
        return stateDefinition;
    }

    public List<JsonTransitions> getTransitions() {
        return transitions;
    }

    @Override
    public String toString() {
        return String.format("States:%s" + "\n", stateDefinition);
    }

    public class JsonTransitions {

        String from;
        String to;
        Character by;

        public JsonTransitions(String from, String to, Character symbol) {
            this.from = from;
            this.to = to;
            this.by = symbol;
        }

        public String getFrom() {
            return from;
        }

        public String getTo() {
            return to;
        }

        public Character getBy() {
            return by;
        }

        @Override
        public String toString() {
            return String.format("from:%s,by:%s,to:%s" + "\n", from, by, to);
        }

    }

    public class JsonState {

        private String id;
        private boolean finite;

        public JsonState(String id, boolean finite) {
            this.id = id;
            this.finite = finite;
        }

        public String getId() {
            return id;
        }

        public boolean isFinite() {
            return finite;
        }

        @Override
        public String toString() {
            return String.format("id:%s, finite:%s," + "\n", id, finite);
        }
    }
}