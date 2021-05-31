package Validatorforemail;

import java.io.IOException;

public class MyFirstDFA {

    private final static String CONFIG_PATH = "d:\\my\\myFirstDFA\\src\\main\\resources\\dfa.json";

    public static void main(String[] args) throws IOException {

        DFAConfigReader reader = new DFAConfigReader(CONFIG_PATH);
        DFAConfig config = reader.ReadDFAFromJson();

        DFAValidator dfaValidator = new DFAValidator(config);
        
    }
}
