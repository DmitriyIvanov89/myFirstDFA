package Validatorforemail;

import com.google.gson.Gson;

import java.io.FileReader;

public class DFAConfigReader {

    public DFAConfig initStateFromJson() {

        Gson gson = new Gson();
        try (FileReader reader = new FileReader("E:\\IT\\JAVA\\my_project\\\\dfa_repo\\src\\main\\resources\\dfa.json")) {
            DFAConfig dfaConfig = gson.fromJson(reader, DFAConfig.class);
            return dfaConfig;
        } catch (Exception e) {
            System.out.println("Wrong parsing!" + e.toString());
        }
        return null;
    }

}
