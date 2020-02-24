package qbrainx.demo;

import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;

public class Log4jDemo {

public static Logger log = LogManager.getLogger(Log4jDemo.class);
	
	@Test
		private void launch() {
			

	
		System.out.println("\n Hello to all \n");
		
		log.info(" User has to book an ticket in Adactin page ");
		log.error(" This ia an error 404 ");
		log.fatal(" This is an fatal message ");

	}

}
