package base;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2 {
	private static final Logger log=LogManager.getLogger(Log4j2.class);

	// Log levels =>
	//	OFF
	//	DEBUG
	//	INFO
	//	WARN
	//	ERROR
	//	FATAL
	public static void main(String[] args) throws IOException {
		// to see the log msges upgrade java version using mvn update
		System.out.println("=============>>>>");
		log.debug("DEBUG method called");
		log.info("INFO method called");
		log.warn("WARN method called");
		log.error("ERROR method called");
		log.fatal("FATAL method called");
		
		System.out.println();
		printLog();
	}
	
	public static void printLog() {
		log.info("INFO method called from other method");
	}
}
