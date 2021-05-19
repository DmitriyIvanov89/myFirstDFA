package Validatorforemail;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFirstDFA {

    private static final Logger logger = Logger.getLogger(MyFirstDFA.class.getName());

    public static void main(String[] args) {

        String email = "Stec.LTD@yandex.ru";
        logger.log(Level.INFO, "Received email: {0}", email);

        DFAValidator dfaValidator = new DFAValidator();
        dfaValidator.init();

        if (dfaValidator.validate(email)) {
            logger.log(Level.INFO, "Completed successfully");
            System.out.println("Correct email");
        } else {
            logger.log(Level.INFO, "Received wrong email");
            System.out.println("Wrong email");
        }
    }
}
