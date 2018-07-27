package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jclass1 {
	private static Logger log= LogManager.getLogger(Log4jclass1.class.getName());

	public static void main(String[] args) {
		System.out.println("Hi");
	    log.error("This is error");
		log.info("This is info");
		log.fatal("This is fatal");
		log.debug("This is debug");

	}

}


