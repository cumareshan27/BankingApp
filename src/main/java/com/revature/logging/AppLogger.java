package com.revature.logging;

import java.lang.System.Logger;
import java.util.logging.LogManager;

public class AppLogger {
	// Create a public static final Logger Object - single logger object to use throughout our entire program
	public final static Logger logger = LogManager.getLogger(AppLogger.class);

}
