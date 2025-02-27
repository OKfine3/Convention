package edu.ustb.crypto.convention.utils;

import edu.ustb.crypto.convention.config.Mapping;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

public class YamlReader {

    /**
     * 加载 yaml 文件
     * @param filePath
     * @param type
     * @param <T>
     * @return
     */
    public static <T> T loadYaml(String filePath, Class<T> type) {
        Yaml yaml = new Yaml();

        try (InputStream inputStream = YamlReader.class.getClassLoader().getResourceAsStream(filePath)) {
            if (inputStream == null) {
                throw new IllegalArgumentException("File not found: " + filePath);
            }
            return yaml.loadAs(inputStream, type);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load YAML file: " + filePath, e);
        }
    }
}
