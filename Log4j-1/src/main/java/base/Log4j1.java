package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Log4j1 {

	// Log levels =>
	//	OFF
	//	DEBUG
	//	INFO
	//	WARN
	//	ERROR
	//	FATAL
	public static void main(String[] args) throws IOException {
		System.out.println("=============>>>>");
		
		Properties props = readProperty();
		String val = (String)props.get("log4j.rootLogger");
		
		
		System.out.println("ROOT LOGGER ="+val);
		Logger log=Logger.getLogger(Log4j1.class);
		log.debug("DEBUG");
		log.info("INFO");
		log.warn("WARN");
		log.error("ERROR");
		log.fatal("FATAL");
	}

	public static Properties readProperty() throws IOException {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			String filePath="C:\\Users\\ip6sa\\Documents\\SAM\\Projects\\Log4j_Practice\\Log4j-1\\src\\main\\resources\\log4j.properties";
			fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			fis.close();
		}
		return prop;
	}

}
