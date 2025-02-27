package edu.ustb.crypto.convention.utils;

import edu.ustb.crypto.convention.config.Mapping;
import org.junit.Test;

import static edu.ustb.crypto.convention.utils.YamlReader.loadYaml;

/**
 * @auther lwj
 * @date 2025/2/26 15:29
 */
public class UtilsTest {
    @Test
    public void yamlTest() {
        String filePath = "mapping_files/conventionMapping.yaml"; // 替换为你的 YAML 文件路径
        // 解析为 Config 类型
        Mapping config = loadYaml(filePath, Mapping.class);
        System.out.println(config);

        // 你也可以解析为其他类型
        // OtherType otherConfig = loadYaml(filePath, OtherType.class);
        // System.out.println(otherConfig);
    }
}
