package Resource;

//import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.logging.log4j.core.util.FileUtils;
//import org.apache.logging.log4j.core.util.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.WebDriverException;

public class Base {
	public static WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{
	//Chrome
	prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Dilsha\\Eclipse_Projects\\E2E\\src\\main\\java\\Resource\\DataProperties");
	prop.load(fis);
	String browserName =prop.getProperty("browser");
	System.out.println(browserName);
	if(browserName.equals("chrome")) {
		//Execute in Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilsha\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	else if(browserName.equals("firefox")) {
		//Execute in FireFox Driver
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dilsha\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;
}
/*public void getScreenshot()
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.//copyFile(src,new File("C:\\Users\\Dilsha\\test\\screenshot.png"));
	FileUtils.copyFile(src,new File("C:\\Users\\Dilsha\\test\\screenshot.png"));

}*/
}
