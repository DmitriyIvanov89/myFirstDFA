package Validatorforemail;

public class MyFirstDFA {

    public static void main(String[] args) {

        DFAConfigReader dfaConfig = new DFAConfigReader("d:\\my\\myFirstDFA\\src\\main\\resources\\dfa.json");
        DFAConfig stateConfig = dfaConfig.initDFAFromJson();

        System.out.println("Start id: " + stateConfig.getStartId().toString());

        for (DFAConfig.JsonState states : stateConfig.getStateDefinition()) {
            System.out.println(states);
        }

        for (DFAConfig.JsonTransitions tranzit : stateConfig.getTransitions()) {
            System.out.println(tranzit);
        }
    }
}
