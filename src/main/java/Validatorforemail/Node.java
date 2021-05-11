package Validatorforemail;

import java.util.HashMap;
import java.util.Map;

public class Node {

    private boolean isFinish;
    private Map<Character,Node> transitions;
    private String name;

    public Node(String name,boolean isFinish) {
        this.isFinish = isFinish;
        this.name = name;
        this.transitions = new HashMap<>();
    }

    public void addTransitionSymbol(Character symbol, Node nextNode) {
        this.transitions.put(symbol,nextNode);
    }

    public void addTransitionLetter(Node nextNode) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        char[] symbolLetter = letters.toCharArray();
        for (int i = 0; i < symbolLetter.length; i++) {
            this.transitions.put(symbolLetter[i],nextNode);
        }
    }

    public boolean isValidTransition(Character symbol) {
        if (this.transitions.containsKey(symbol)) {
            return true;
        } else {
            System.out.println("Not found transition from " + this);
            return false;
        }
    }

    public Node transition(Character symbol) {
        if (this.isValidTransition(symbol)) {
            return transitions.get(symbol);
        } else {
            return this;
        }
    }

    public boolean getNodeFinished() {
        return this.isFinish;
    }

    @Override
    public String toString() {
        return "Node :" + name;
    }
}
