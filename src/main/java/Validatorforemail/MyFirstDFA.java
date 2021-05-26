package Validatorforemail;

import java.io.IOException;

public class MyFirstDFA {

    public static void main(String[] args) throws IOException {

        DFAConfigReader reader = new DFAConfigReader("d:\\my\\myFirstDFA\\src\\main\\resources\\dfa.json");
        DFAConfig config = reader.ReadDFAFromJson();

    }
}
