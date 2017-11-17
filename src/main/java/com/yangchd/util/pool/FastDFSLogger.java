package com.yangchd.util.pool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yangchd  2017/11/17.
 */
public class FastDFSLogger {

    private static final String GATEWAY_LOGGER_NAME = "fastdfs_logger";
    private static final Logger LOGGER = LoggerFactory.getLogger(GATEWAY_LOGGER_NAME);

    public static void info(String msg) {
        LOGGER.info(msg);
    }

    public static void debug(String msg) {
        LOGGER.debug(msg);
    }

    public static Logger getGatewaylogger() {
        return LOGGER;
    }

    public static void error(String msg, Throwable t) {
        LOGGER.error(msg, t);
    }

    public static void error(String msg) {
        LOGGER.error(msg);
    }

    public static void error(Throwable e) {
        LOGGER.error("Throwable: "+e.getMessage(), e);
    }

    public static boolean isDebugEnabled() {
        return LOGGER.isDebugEnabled();
    }

    public static boolean isInfoEnabled() {
        return LOGGER.isInfoEnabled();
    }

    public static void warn(String string) {
        LOGGER.warn(string);
    }

    public static boolean isWarnEnabled() {
        return LOGGER.isWarnEnabled();
    }

    public static boolean isErrorEnabled() {
        return LOGGER.isErrorEnabled();
    }
}
