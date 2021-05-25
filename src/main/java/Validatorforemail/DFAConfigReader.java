package Validatorforemail;

import com.google.gson.Gson;

import java.io.*;
import java.util.Objects;

public class DFAConfigReader {

    private String configPath;

    public DFAConfigReader(String configPath) {
        this.configPath = configPath;
    }

    public DFAConfig ReadDFAFromJson() throws IOException {
        try (FileReader reader = new FileReader(configPath)) {
            return new Gson().fromJson(reader, DFAConfig.class);
        }
    }
}
