/**
 * 
 */
package LogfirstPro;

import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Level;

public class FileLogger {

	 private static final Logger logger = Logger.getLogger(FileLogger.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
            // Create a FileHandler
            FileHandler fileHandler = new FileHandler("app.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

            logger.setLevel(Level.ALL); // Set the logging level

            logger.severe("Severe Message");
            logger.warning("Warning Message");
            logger.info("Info Message");
            logger.config("Config Message");
            logger.fine("Fine Message");
            logger.finer("Finer Message");
            logger.finest("Finest Message");

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error occurred", e);
        }
    }
}