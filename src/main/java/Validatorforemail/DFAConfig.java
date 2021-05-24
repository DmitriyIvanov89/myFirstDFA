package Validatorforemail;

import java.util.List;

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

        String from;
        String to;
        Character by;

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
            return String.format("State from:%s, by:%s, to:%s" + "\n", from, by, to);
        }
    }

    public class JsonState {

        private String id;
        private boolean finite;

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