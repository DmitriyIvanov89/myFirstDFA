package Validatorforemail;

import java.io.IOException;
import java.util.Map;
import java.util.Stack;

public class MyFirstDFA {

    public static void main(String[] args) throws IOException {

        DFAConfigReader reader = new DFAConfigReader("d:\\my\\myFirstDFA\\src\\main\\resources\\dfa.json");
        DFAConfig config = reader.ReadDFAFromJson();

        DFAValidator dfaValidator = new DFAValidator(config);
        for (Map.Entry<String, DFAConfig.State> map : dfaValidator.getDfa().entrySet()) {
            System.out.println(map);
        }
    }
}
