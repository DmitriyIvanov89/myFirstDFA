package Validatorforemail;

public class MyFirstDFA {

    public static void main(String[] args) {

        DFAConfigReader reader = new DFAConfigReader("d:\\my\\myFirstDFA\\src\\main\\resources\\dfa.json");
        DFAConfig config = reader.ReadDFAFromJson();

        System.out.println("Start state: " + config.getStartId().toString());

        for (DFAConfig.State states : config.getStateDefinition()) {
            System.out.println(states);
        }

        for (DFAConfig.Transitions tranzit : config.getTransitions()) {
            System.out.println(tranzit);
        }

    }
}
