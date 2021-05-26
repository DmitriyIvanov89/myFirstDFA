package Validatorforemail;

import java.util.Map;

public class DFAValidator {

    private DFAConfig.JsonState startState;
    private Map<DFAConfig.JsonState, DFAConfig.JsonState> dfa;

    public DFAValidator(DFAConfig config) {

    }

    public DFAConfig.JsonState getStartState() {
        return startState;
    }

    public Map<DFAConfig.JsonState, DFAConfig.JsonState> getDfa() {
        return dfa;
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
