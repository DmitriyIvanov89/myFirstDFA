package Validatorforemail;

import java.io.File;
import java.io.IOException;

public class MyFirstDFA {

    public static void main(String[] args) throws IOException {

        DFAConfigReader reader = new DFAConfigReader("d:\\my\\myFirstDFA\\src\\main\\resources\\dfa.json");
        DFAConfig config = reader.ReadDFAFromJson();

        System.out.println("Start state: " + config.getStartId().toString());

        for (DFAConfig.JsonState states : config.getStateDefinition()) {
            System.out.println(states);
        }

        for (DFAConfig.Transitions tranzit : config.getTransitions()) {
            System.out.println(tranzit);
        }

    }
}
