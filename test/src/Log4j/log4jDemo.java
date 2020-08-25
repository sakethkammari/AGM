package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class log4jDemo {
	
	private static Logger logger=LogManager.getLogger(log4jDemo.class);
	public static void main(String args[])
	{
		System.out.println("\n hello logger! \n");
		logger.trace("this is info trace");    // root level
		logger.warn("this is info warn");
		logger.error("this is info error");
		logger.info("this is info info");
		logger.fatal("this is info fatal");
		String logT="loggtt";
		ThreadContext.put("ROUTINGKEY", logT);
		 System.out.println("COMPLETE");
	}

}
//    logger.file.level = off
//    rootLogger.level = trace