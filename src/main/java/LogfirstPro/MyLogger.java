package LogfirstPro;

import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.io.IOException;
import java.util.logging.Level;
public class MyLogger {
	 private static final Logger logger = Logger.getLogger(MyLogger.class.getName());

	    public static void main(String[] args) {
	        logger.setLevel(Level.ALL); // Set the logging level

	        logger.severe("Severe Message");
	        logger.warning("Warning Message");
	        logger.info("Info Message");
	        logger.config("Config Message");
	        logger.fine("Fine Message");
	        logger.finer("Finer Message");
	        logger.finest("Finest Message");
	    }
	}
