package Validatorforemail;

import java.util.HashMap;
import java.util.Map;

public class DFAValidator {

    private String startStateId;
    private Map<DFAConfig.JsonState, DFAConfig.JsonState> dfa;

    public DFAValidator(DFAConfig config) {
        this.startStateId = config.getStartId();
        this.dfa = new HashMap<>();

        for (DFAConfig.JsonState state : config.getStateDefinition()) {
            dfa.put(state, null);
        }


    }

    public String getStartStateId() {
        return startStateId;
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
