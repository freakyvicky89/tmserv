package net.ddns.freakyvicky.tmserv.util;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationService {

    private static final String TMSERV_PROPERTIES = "tmserv.properties";

    private Configuration configuration;

    public ConfigurationService() throws ConfigurationException {

        Parameters params = new Parameters();

        FileBasedConfigurationBuilder<FileBasedConfiguration> builder =
                new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
                        .configure(params.properties()
                                .setFileName(TMSERV_PROPERTIES));

        configuration = builder.getConfiguration();

    }

    public double getDouble(Property property) {
        return configuration.getDouble(property.getName());
    }

    public boolean getBoolean(Property property) {
        return configuration.getBoolean(property.getName());
    }

    public int getInteger(Property property) {
        return configuration.getInt(property.getName());
    }

}
