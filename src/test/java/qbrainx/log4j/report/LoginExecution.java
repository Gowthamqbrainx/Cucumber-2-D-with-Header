package qbrainx.log4j.report;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginExecution extends UtilityClass {

	LoginPage page;
	
	private static Logger log = LogManager.getLogger("LoginExecution.class");
	
	@BeforeClass
	private void beforeExecution() {
	launchBrowser("https://adactin.com/HotelApp/index.php");
	log.info("\n browser launched successfully \n");
	}
	
	@Test
	private void testCase1() {
	page = new LoginPage();
	fill(page.getUser(), "GOWTHAMK");
	log.error("\n user has entered an invalid username \n");
	fill(page.getPass(), "Myvizhi@1194");
	log.warn("\n User has entered an invalid password");
	btnclk(page.getBtnlgn());
	}
	
}
