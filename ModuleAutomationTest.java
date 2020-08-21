package crossAyast;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class ModuleAutomationTest {

	WebDriver driver = null;

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Selenium New\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@Test
	public void Test1() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/a[@class='login']")).click();
		// Enter a valid User ID in User id field
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

		System.out.println(" Click on page");

		driver.findElement(By.id("email")).sendKeys("jiteshpal158@gmail.com");
		System.out.println("Valid User ID Entered ");

		// Enter a valid password in the password Text box
		driver.findElement(By.id("passwd")).sendKeys("9819894310");
		System.out.println("Valid Password Entered ");

		// Enter Sign in Button login successfully
		driver.findElement(By.id("SubmitLogin")).click();
		System.out.println("Login Successfully");

		// Click on Women details

		WebElement ele = driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();

		Thread.sleep(5000);
		System.out.println("Click on Casual dress");

		// Click on Casual dress
		driver.findElement(By.xpath("//li[@class='sfHover']//a[contains(text(),'Casual Dresses')]")).click();

		System.out.println("Clicked on Casual dress for further execution");

		// Click on Quick view
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")).click();

		System.out.println("Select on printed dress");

		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(0);

		// Click on Quantity
		Thread.sleep(1000);

		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		System.out.println(" Quantity should be 2 for booking");

		System.out.println("Add to cart and click for further");

		// Click on Add Cart
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();

		Thread.sleep(3000);
		System.out.println(" click on proceed to check out");
		// Click on Payment check button
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();

		// Again Click on Proceed to check out
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();

		Thread.sleep(3000);
		// Again Click on Proceed to check out
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();

		Thread.sleep(3000);
		// Again Click on Proceed to Check out
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();

		Thread.sleep(3000);
		// Click on checkbox for further process for agreement process
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input"));
		WebElement check = null;
		check.click();

		Thread.sleep(3000);
		// Click on Proceed to check out
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();

		Thread.sleep(3000);
		// Click on Pay by bank wire
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();

		Thread.sleep(3000);
		// Click on I conform my order
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();

		Thread.sleep(3000);
		// Click on User Name
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).click();

		Thread.sleep(3000);
		// Click on Order History and Details
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")).click();

	}

	@AfterClass
	public void afterClass() {

		driver.findElement(By.className("logout")).click();
		System.out.println("Logout successfully.");

		driver.quit();
		System.out.println("Test script executed successfully.");
	}

}
