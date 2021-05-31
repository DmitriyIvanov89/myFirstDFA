package Validatorforemail;

import java.util.HashMap;
import java.util.Map;

public class DFAValidator {

    private State startState;
    private Map<String, State> dfa;

    public DFAValidator(DFAConfig config) {
        this.dfa = new HashMap<>();

        for (DFAConfig.DFAState state : config.getStateDefinition()) {
            dfa.put(state.getId(), new State(state.getId(), state.isFinite()));
        }

        this.startState = dfa.get(config.getStartId());

        for (DFAConfig.Transitions transit : config.getTransitions()) {
            dfa.get(transit.getFrom()).addTransition(transit.getSymbol(), dfa.get(transit.getTo()));
        }
    }

    public Map<String, State> getDfa() {
        return dfa;
    }

    public State getStartState() {
        return startState;
    }
}
