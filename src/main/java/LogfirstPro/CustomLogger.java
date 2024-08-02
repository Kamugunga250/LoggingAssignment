/**
 * 
 */
package LogfirstPro;

import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Level;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
public class CustomLogger {
	private static final Logger logger = Logger.getLogger(CustomLogger.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
            // Create a ConsoleHandler
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setFormatter(new CustomFormatter());
            logger.addHandler(consoleHandler);

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

    static class CustomFormatter extends Formatter {
        @Override
        public String format(LogRecord record) {
            return String.format("%1$tF %1$tT [%2$s] %3$s %n",
                record.getMillis(),
                record.getLevel().getName(),
                formatMessage(record));
        }
    }
}