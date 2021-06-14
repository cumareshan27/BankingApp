package com.revature.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppLogger {
	// Create a public static final Logger Object - single logger object to use throughout our entire program
	public final static Logger logger = LogManager.getLogger(AppLogger.class);

}
