package Validatorforemail;

import java.util.Map;

public class DFAValidator {

    private DFAConfig.State startState;
    private Map<DFAConfig.State, DFAConfig.State> dfa;

    public DFAValidator(DFAConfig config) {

    }

    public DFAConfig.State getStartState() {
        return startState;
    }

    public Map<DFAConfig.State, DFAConfig.State> getDfa() {
        return dfa;
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
