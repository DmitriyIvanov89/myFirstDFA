package Validatorforemail;

import java.util.HashMap;
import java.util.Map;

public class DFAValidator {

    String startState;

    public DFAValidator(DFAConfig config) {
        startState = config.getStartId();
        for (int i = 0; i < config.getTransitions().size(); i++) {

        }
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
