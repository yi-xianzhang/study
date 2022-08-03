package com.yixian;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 日志接口
 * @create : 2022-07-14 19:14
 */
@SuppressWarnings("all")
public interface ILoggerAble {

    /**
     * 日志文件
     */
    Logger LOGGER = LoggerFactory.getLogger(ILoggerAble.class);

    /**
     * 打印日志头信息
     * @param  title   标题
     */
    static void start(String title) {
        final Logger LOGGER = LoggerFactory.getLogger(ILoggerAble.class);
        LOGGER.info("=========================================================");
        int maxLen = 53  - title.length();
        StringBuffer strTemp = new StringBuffer(53);
        int index = 0;
        while (index < (maxLen / 2)) {
            strTemp.append(" ");
            index ++;
        }
        strTemp.append(title);
        LOGGER.info(strTemp.toString());
        LOGGER.info("=========================================================");
    }
}
