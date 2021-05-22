package Validatorforemail;

public class MyFirstDFA {

    //private static final Logger logger = Logger.getLogger(MyFirstDFA.class.getName());

    public static void main(String[] args) {

//        String email = "Stec.LTD@yandex.ru";
//        //logger.log(Level.INFO, "Received email: {0}", email);
//
//        DFAValidator dfaValidator = new DFAValidator();
//        dfaValidator.init();
//
//        if (dfaValidator.validate(email)) {
//            //logger.log(Level.INFO, "Completed successfully");
//            System.out.println("Correct email");
//        } else {
//            //logger.log(Level.INFO, "Received wrong email");
//            System.out.println("Wrong email");
//        }

        DFAConfig dfaConfig = new DFAConfig();
        StateConfig stateConfig = dfaConfig.initStateFromJson();

        System.out.println(stateConfig.toString());
        System.out.println("Start state:" + stateConfig.getStartState().toString());

    }
}
