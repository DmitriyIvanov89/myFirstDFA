package Validatorforemail;

public class Validator {

    private Node currentNode;

    public Validator(Node startNode) {
        currentNode = startNode;
    }

    public char[] convertExpression(String expression) {
        return expression.toCharArray();
    }

    public boolean isValidExpression(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (currentNode.isValidTransition(arr[i])) {
                currentNode = currentNode.transition(arr[i]);
            } else {
                return false;
            }
        }
        if (currentNode.getNodeFinished()) {
            System.out.println("Correct expression");
        } else {
            System.out.println("Wrong expression");
            return false;
        }
        return true;
    }

}
