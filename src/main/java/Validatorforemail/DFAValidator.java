package Validatorforemail;

public class DFAValidator {

    private State startState;

    public void init() {
        State s0 = new State("S0", false);
        State s1 = new State("S1", false);
        State s2 = new State("S2", false);
        State s3 = new State("S3", false);
        State s4 = new State("S4", false);
        State s5 = new State("S5", false);
        State s6 = new State("S6", true);
        State s7 = new State("S7", true);
        State s8 = new State("S8", true);
        State s9 = new State("S9", true);

        addTransitionsByAllLetters(s0, s1);
        s1.addTransition('.', s0);
        addTransitionsByAllLetters(s1, s1);
        s1.addTransition('@', s2);
        addTransitionsByAllLetters(s2, s3);
        addTransitionsByAllLetters(s3, s3);
        s3.addTransition('.', s4);
        addTransitionsByAllLetters(s4, s5);
        addTransitionsByAllLetters(s5, s6);
        addTransitionsByAllLetters(s6, s7);
        addTransitionsByAllLetters(s7, s8);
        addTransitionsByAllLetters(s8, s9);

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
