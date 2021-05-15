package Validatorforemail;

public class MainApp {
    public static void main(String[] args) {

        Node s0 = new Node("S0",false);
        Node s1 = new Node("S1",false);
        Node s2 = new Node("S2",false);
        Node s3 = new Node("S3",false);
        Node s4 = new Node("S4",false);
        Node s5 = new Node("S5",false);
        Node s6 = new Node("S6",true);
        Node s7 = new Node("S7",true);
        Node s8 = new Node("S8",true);
        Node s9 = new Node("S9",true);

        s0.addTransitionLetter(s1);
        s1.addTransitionSymbol('.',s0);
        s1.addTransitionLetter(s1);
        s1.addTransitionSymbol('@',s2);
        s2.addTransitionLetter(s3);
        s3.addTransitionLetter(s3);
        s3.addTransitionSymbol('.',s4);
        s4.addTransitionLetter(s5);
        s5.addTransitionLetter(s6);
        s6.addTransitionLetter(s7);
        s7.addTransitionLetter(s8);
        s8.addTransitionLetter(s9);

        String expression = "Stec.LTD@yandex.ru";

        Validator validator = new Validator(s0);
        validator.isValidExpression(validator.convertExpression(expression));

    }
}
