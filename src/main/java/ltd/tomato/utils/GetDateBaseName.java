package ltd.tomato.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author tomato
 * @create 2018-09-03 上午11:34
 *
 * 用于解决sort传入字段名与数据库不同问题,properties文件右边写数据库字段名
 */
public class GetDateBaseName {

    /**
     * sort字段名 --> 数据库字段名
     *
     * @param sortName sort传入字段名
     * @return 数据库字段名
     * @throws IOException 处理异常
     */
    public static String getSortName(String sortName) throws IOException {
        String fileName = "sortName.properties";
        String path="properties/"+ fileName;
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream input = classLoader.getResourceAsStream(path);
        Properties properties = new Properties();
        properties.load(input);
        return properties.getProperty(sortName);
    }
}
