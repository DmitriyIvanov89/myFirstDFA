package Validatorforemail;

import java.util.HashMap;
import java.util.Map;

public class DFAValidator {

    String startState;
    Map<DFAConfig.JsonState, DFAConfig.Transitions> init;

    public DFAValidator(DFAConfig config) {
        this.init = new HashMap<>();
        this.startState = config.getStartId();
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
