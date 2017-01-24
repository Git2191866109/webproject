package com.weibo.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by wei.ma on 2017/1/24.
 */
public class ServerListerner implements ServletContextListener {
    protected final Logger logger = LogManager.getLogger(this.getClass());

    public void contextDestroyed(ServletContextEvent contextEvent) {
    }

    public void contextInitialized(ServletContextEvent contextEvent) {
        logger.info("=================================");
        logger.info("系统[{}]启动完成!!!", contextEvent.getServletContext().getServletContextName());
        logger.info("=================================");
    }
}