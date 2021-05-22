package Validatorforemail;

import com.google.gson.Gson;
import java.io.FileReader;

public class DFAConfig {

    public StateConfig initStateFromJson() {

        Gson gson = new Gson();
        try (FileReader reader = new FileReader("E:\\IT\\JAVA\\my_project\\\\dfa_repo\\src\\main\\resources\\dfa.json")) {
            StateConfig stateConfig = gson.fromJson(reader, StateConfig.class);
            return stateConfig;
        } catch (Exception e) {
            System.out.println("Parsing fuck!!!" + e.toString());
        }
        return null;
    }

}
