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
		System.out.println("=============>>>>");
		log.debug("DEBUG");
		log.info("INFO");
		log.warn("WARN");
		log.error("ERROR");
		log.fatal("FATAL");
	}
}
