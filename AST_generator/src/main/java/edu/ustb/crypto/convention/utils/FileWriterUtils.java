package edu.ustb.crypto.convention.utils;

import edu.ustb.crypto.convention.compile.entity.Contract;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @auther lwj
 * @date 2025/3/3 15:07
 */
public class FileWriterUtils {

    public static void generateContract(Contract newContract, String filePath) throws IOException {
        // 检查参数是否为空
        if (newContract == null) {
            throw new IllegalArgumentException("Contract 不能为空");
        }

        /*Path path = Paths.get(filePath);
        if (!Files.exists(path.getParent())) {
            Files.createDirectories(path.getParent());
        }*/

        // 使用try-with-resources自动关闭资源
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // 获取合约对象的字符串表示
            String content = newContract.toString();
            // 将内容写入文件
            writer.write(content);
            System.out.println("文件已写入" + filePath);
        } catch (IOException e) {
            // 异常处理（可根据需要调整）
            System.err.println("写入文件时发生错误: " + e.getMessage());
            e.printStackTrace();
        }

        /*// 使用 try-with-resources 确保资源正确关闭
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // 写入 Contract 的 toString 表示
            writer.write(newContract.toString());

            System.out.println("Contract 已成功写入到文件：" + filePath);
        } catch (IOException e) {
            System.err.println("写入文件时发生错误：" + e.getMessage());
        }*/
    }
}
