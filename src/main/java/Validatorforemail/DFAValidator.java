package Validatorforemail;

import java.util.Map;

public class DFAValidator {

    private String startState;
    private DFAConfig config;
    private Map<DFAConfig.JsonState, DFAConfig.JsonTransitions> initialDFA;

    public DFAValidator(DFAConfig dfaConfig) {
        this.startState = config.getStartId();
        this.config = dfaConfig;
    }

//    public boolean validate(String str) {
//
//
//        for (int i = 0; i < str.length(); i++) {
//            curState = curState.getTransition(str.charAt(i));
//            if (curState == null) {
//                return false;
//            }
//        }
//        return curState.isFinite();
//    }

    private void addTransitionsByAllLetters(State from, State to) {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            from.addTransition(letter, to);
        }

        for (char letter = 'a'; letter <= 'z'; letter++) {
            from.addTransition(letter, to);
        }
    }

}
