package config;

import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.support.EnvironmentModel;

import java.io.File;
import java.io.IOException;

public class Config {

    static final ObjectMapper mapper = new ObjectMapper(new YAMLFactory()).findAndRegisterModules();
    public static final EnvironmentModel environmentModel;

    static {
        try {
            environmentModel = mapper.readValue(new File("src/main/resources/environment.yml"), EnvironmentModel.class);
        } catch (IOException e) {
            throw new RuntimeException("Error reading configuration file:" + e.getMessage(), e);
        }
    }
}
