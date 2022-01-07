package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class Log4jDemo {
	private static Logger logger=LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n  Hello World...!  \n");
		logger.trace("This is Trace message");
		logger.error("This is Error message");
		logger.warn("This is Warning message");
		logger.fatal("This is Fatal message");
		
		System.out.println("\n Completed \n");
	}

}
