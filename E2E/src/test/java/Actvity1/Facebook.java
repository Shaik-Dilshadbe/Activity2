package Actvity1;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook {
		public static void main(String args[]) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dilsha\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://google.com");
			driver.get("https://facebook.com");
		}

}
