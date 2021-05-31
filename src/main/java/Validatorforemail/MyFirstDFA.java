package Validatorforemail;

import java.io.IOException;

public class MyFirstDFA {

    private final static String CONFIG_PATH = "d:\\my\\myFirstDFA\\src\\main\\resources\\dfa.json";

    public static void main(String[] args) throws IOException {

        String email = "A..AA@A.AA";

        DFAConfigReader reader = new DFAConfigReader(CONFIG_PATH);
        DFAConfig config = reader.ReadDFAFromJson();

        DFAValidator dfaValidator = new DFAValidator(config);

        if (!dfaValidator.validate(email)) {
            System.out.println("Wrong email!");
        } else {
            System.out.println("Correct email");
        }
    }
}
