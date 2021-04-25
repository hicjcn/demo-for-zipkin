package cn.jcera.core.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 统一日志记录的位置
 *
 * @author liuyiling
 * @date on 2018/7/8
 */
public class ApiLogger {

    /**
     * 会按照 com.xmair.core.util 去找logger
     */
    public static Logger packageLogger = LoggerFactory.getLogger(ApiLogger.class);

    /**
     * 刘艺凌的logger
     * 或直接指定名称的Logger，liuyiling-logger在log.xml中配置
     */
    public static Logger liuyilingLog = LoggerFactory.getLogger("liuyiling-logger");

    /**
     * 业务日志的logger
     */
    public static Logger bizLog = LoggerFactory.getLogger("bizLog");

    /**
     * redis的logger
     */
    public static Logger redisLog = LoggerFactory.getLogger("redisLog");

    /**
     * database的logger
     */
    public static Logger databaseLog = LoggerFactory.getLogger("databaseLog");

    /**
     * rocketmq的logger
     */
    public static Logger rocketmqLog = LoggerFactory.getLogger("rocketmqLog");
    /**
     * kafka的logger
     */
    public static Logger kafkaLog = LoggerFactory.getLogger("kafkaLog");
    /**
     * http的logger
     */
    public static Logger httpLog = LoggerFactory.getLogger("httpLog");
}
