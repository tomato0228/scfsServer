package ltd.tomato.utils;

import java.util.UUID;

/**
 * @author tomato
 * @create 2018-09-03 上午11:16
 */
public class UUIDUtils {

    /**
     * 比较普通的序列号生成方法
     *
     * @return 序列号
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 带长度的序列号生成方法
     *
     * @return length长度的序列号
     */
    public static String getUUID(int length) {
        return UUID.randomUUID().toString().replace("-", "").substring(0, length);
    }

    /**
     * 带长度的数字序列号生成方法
     *
     * @return length长度的数字序列号
     */
    public static Integer getUUIDNumber(int length) {
        return Integer.parseInt(UUID.randomUUID().toString().replaceAll("[a-z|-]", "").substring(0, 5));
    }
}
