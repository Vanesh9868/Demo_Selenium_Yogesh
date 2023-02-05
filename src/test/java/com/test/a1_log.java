package com.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a1_log {

	public static void main(String[] args) {

		Logger log = LogManager.getLogger(a1_log.class);

		log.fatal("i am fatal");
		log.error("i am error");
		log.warn("i am warn");
		log.info("i am info");
		log.debug("i am debug");
		log.trace("i am trace");

	}

}

/*
 * OFF 0 FATAL 100 ERROR 200 WARN 300 INFO 400 DEBUG 500 TRACE 600 ALL
 * 
 */
