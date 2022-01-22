package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Log4j1 {
	private static final Logger log=Logger.getLogger(Log4j1.class);

	// Log levels =>
	//	OFF
	//	DEBUG
	//	INFO
	//	WARN
	//	ERROR
	//	FATAL
	public static void main(String[] args) throws IOException {
		System.out.println("=============>>>>");
		
//		Properties props = readProperty();
//		String val = (String)props.get("log4j.rootLogger");
		
		Properties props = readProperty1();
		String val = (String)props.get("log4j.rootLogger");
		
		
		System.out.println("ROOT LOGGER ="+val);
		log.debug("DEBUG");
		log.info("INFO");
		log.warn("WARN");
		log.error("ERROR");
		log.fatal("FATAL");
	}

	// Reading file with full path
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

	
	// Reading file with classpath
		public static Properties readProperty1() throws IOException {
			Properties prop=null;
			InputStream is = null;
	        try {
	            prop = new Properties();
	            is = new Log4j1().getClass().getResourceAsStream("/log4j.properties");
	            prop.load(is);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			return prop;
		}
	

}
