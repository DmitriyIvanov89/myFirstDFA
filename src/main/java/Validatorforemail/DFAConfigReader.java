package Validatorforemail;

import com.google.gson.Gson;
import java.io.FileReader;

public class DFAConfigReader {

    private String configPath;

    public DFAConfigReader(String configPath) {
        this.configPath = configPath;
    }

    public DFAConfig ReadDFAFromJson() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(configPath)) {
            DFAConfig dfaConfig = gson.fromJson(reader, DFAConfig.class);
            return dfaConfig;
        } catch (Exception e) {
            System.out.println("Wrong parsing!" + e.toString());
        }
        return null;
    }

}
