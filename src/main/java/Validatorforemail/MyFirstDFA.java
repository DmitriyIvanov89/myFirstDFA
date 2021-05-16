package Validatorforemail;

public class MyFirstDFA {
    public static void main(String[] args) {

        String email = "Stec.LTD@yandex.ru";

        DFAValidator dfaValidator = new DFAValidator();
        dfaValidator.init();
        if (dfaValidator.validate(email)) {
            System.out.println("Correct email");
        } else {
            System.out.println("Wrong email");
        }
    }
}
