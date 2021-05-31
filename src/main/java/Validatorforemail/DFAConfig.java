package Validatorforemail;

import java.util.ArrayList;
import java.util.List;

public class DFAConfig {

    private List<DFAState> stateDefinition;
    private List<Transitions> transitions;
    private String startId;

    public DFAConfig(List<DFAState> stateDefinition, List<Transitions> transitions, String startId) {
        this.stateDefinition = new ArrayList<DFAState>();
        this.transitions = new ArrayList<Transitions>();
        this.startId = startId;
    }

    public String getStartId() {
        return startId;
    }

    public List<DFAState> getStateDefinition() {
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

    public class DFAState {

        private String id;
        private boolean finite;

        public DFAState(String id, boolean finite) {
            this.id = id;
            this.finite = finite;
        }

        public String getId() {
            return id;
        }

        public boolean isFinite() {
            return finite;
        }
    }
}