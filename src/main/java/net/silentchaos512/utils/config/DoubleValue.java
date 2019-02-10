package net.silentchaos512.utils.config;

import com.electronwill.nightconfig.core.CommentedConfig;
import com.electronwill.nightconfig.core.ConfigSpec;

import java.util.function.Consumer;

public class DoubleValue extends ConfigValue<Double> {
    DoubleValue(ConfigSpecWrapper builder, String path, Consumer<ConfigSpec> handleSpec, Consumer<CommentedConfig> handleConfig) {
        super(builder, path, handleSpec, handleConfig);
    }

    public static Builder<Double> builder(ConfigSpecWrapper wrapper, String path) {
        return new Builder<>(wrapper, path);
    }
}
