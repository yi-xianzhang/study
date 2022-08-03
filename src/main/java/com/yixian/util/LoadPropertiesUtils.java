package com.yixian.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

/**
 * @program: JavaSeStudy
 * @description: 加载properties文件的工具类
 * @author: zhang_hj
 * @create: 2022-07-26 19:59
 * @version: 1.0.0
 */
@SuppressWarnings("all")
public class LoadPropertiesUtils {

    /**
     * 通过传入的{@link Class}的路径获取到类的路径,加载在其路径下的properties文件，并获取key
     * 对应的value值，
     * @param <T>  泛型
     * @param key  键
     * @return     值
     * @throws IOException
     */
     public static <T> String getValue(String propertiesName,
                                       String key) throws IOException {
        Objects.requireNonNull(propertiesName,"propertiesName不能为空");
        Objects.requireNonNull(key,"key不能为空");
        String path = LoadPropertiesUtils.class.getResource("/").getPath();
        String srcFile = path + propertiesName;
        InputStream is = new FileInputStream(new File(srcFile));
        Properties properties = new Properties();
        properties.load(is);
        return properties.getProperty(key);
    }

    /**
     * 通过传入的{@link Class}的路径获取到类的路径,加载在其路径下的properties文件，并获取key
     * 对应的value值，
     * @param <T>  泛型
     * @param key  键
     * @return     值
     * @throws IOException
     */
    public static <T> String getValue2(String propertiesName,
                                      String key) throws IOException {
        Objects.requireNonNull(propertiesName,"propertiesName不能为空");
        Objects.requireNonNull(key,"key不能为空");
        final String path =
                LoadPropertiesUtils.class.getClassLoader().getResource(
                        propertiesName).getPath();
        InputStream is = new FileInputStream(new File(path));
        Properties properties = new Properties();
        properties.load(is);
        return properties.getProperty(key);
    }

}

