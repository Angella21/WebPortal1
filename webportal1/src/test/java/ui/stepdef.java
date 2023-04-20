package ui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdef {

	//Logger log = (Logger) LogManager.getLogger(stepdef.class);
	 private static Logger log = LogManager.getLogger(stepdef.class);

	

	@Test
	public static void logiin() {
	WebDriverManager.edgedriver().setup();
		 EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	log.info("najava");
	System.out.println("Finish");
	
}
}


