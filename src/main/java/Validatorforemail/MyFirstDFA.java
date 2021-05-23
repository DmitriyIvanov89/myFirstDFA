package Validatorforemail;

public class MyFirstDFA {

    public static void main(String[] args) {

        DFAConfigReader dfaConfig = new DFAConfigReader();
        DFAConfig stateConfig = dfaConfig.initStateFromJson();

        System.out.println(stateConfig.getStateDefinition().toString());
        System.out.println("Start id:" + stateConfig.getStartId().toString());
        System.out.println("Transitions:" + stateConfig.getTransitions().toString());

//        DFAbyJson dfAbyJson = new DFAbyJson();
//        dfAbyJson.init(stateConfig);

    }
}
