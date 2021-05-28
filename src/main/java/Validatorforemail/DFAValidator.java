package Validatorforemail;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DFAValidator {

    private DFAConfig.State startState;
    private Map<String, DFAConfig.State> dfa;

    public DFAValidator(DFAConfig config) {
        this.dfa = new HashMap<>();

        for (DFAConfig.State state : config.getStateDefinition()) {
            dfa.put(state.getId(), state);
        }

        this.startState = dfa.get(config.getStartId());

        for (DFAConfig.Transitions tranzit : config.getTransitions()) {
            dfa.get(tranzit.getFrom()).addTransition(tranzit.getSymbol(), dfa.get(tranzit.getTo()));
        }
    }

    public Map<String, DFAConfig.State> getDfa() {
        return dfa;
    }

    public DFAConfig.State getStartState() {
        return startState;
    }


//    private void addTransitionsByAllLetters(State from, State to) {
//        for (char letter = 'A'; letter <= 'Z'; letter++) {
//            from.addTransition(letter, to);
//        }
//
//        for (char letter = 'a'; letter <= 'z'; letter++) {
//            from.addTransition(letter, to);
//        }
//    }

}
