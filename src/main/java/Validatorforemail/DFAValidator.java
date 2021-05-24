package Validatorforemail;

import java.util.List;
import java.util.Map;

public class DFAValidator {

    private State startState;
    private Map<DFAConfig.JsonState, DFAConfig.JsonTransitions> initialDFA;

    public DFAValidator(DFAConfig config) {
        //startState = config.getStartId();
        for (DFAConfig.JsonTransitions tranzit : config.getTransitions()){
            System.out.println(tranzit);
        }
    }

    public boolean validate(String str) {
        State curState = startState;

        for (int i = 0; i < str.length(); i++) {
            curState = curState.getTransition(str.charAt(i));
            if (curState == null) {
                return false;
            }
        }
        return curState.isFinite();
    }

    private void addTransitionsByAllLetters(State from, State to) {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            from.addTransition(letter, to);
        }

        for (char letter = 'a'; letter <= 'z'; letter++) {
            from.addTransition(letter, to);
        }
    }

}
