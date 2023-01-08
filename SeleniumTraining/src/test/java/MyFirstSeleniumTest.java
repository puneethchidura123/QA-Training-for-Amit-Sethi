import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\QA-Training-for-Amit-Sethi\\SeleniumTraining\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String WebsiteURL = "https://automationteststore.com/";
		
		driver.get(WebsiteURL);
		
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println("title :: "+title);
		
		Thread.sleep(5000);
		
		
		String LoginOrRegisterXpath = "//*[@id='customer_menu_top']/li/a";
		
		WebElement LoginOrRegisterLink = driver.findElement(By.xpath(LoginOrRegisterXpath));
		LoginOrRegisterLink.click();
		Thread.sleep(5000);
		
		driver.close();
		
		

	}

}
