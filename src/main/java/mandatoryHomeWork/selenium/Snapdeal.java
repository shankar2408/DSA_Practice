package mandatoryHomeWork.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Loading the Snapdeal URL

		driver.get("https://www.snapdeal.com/");

		// Go to Mens Fashion
		WebElement mensfashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		mensfashion.click();

		Thread.sleep(3000);

		// Go to Sports Shoes
		WebElement sportshoe = driver.findElement(By.linkText("Sports Shoes"));
		sportshoe.click();

		// Get the count of the sports shoes
		String count = driver.findElement(By.xpath("//span[@class= 'category-name category-count']")).getText();
		System.out.println(count);

		// Click Training shoes
		WebElement trainingshoe = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		trainingshoe.click();

		// Sort by Low to High
		WebElement sortby = driver.findElement(By.xpath("//span[text()='Sort by:']"));
		sortby.click();

		// Check if the items displayed are sorted correctly
		WebElement lowtohigh = driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]"));
		lowtohigh.click();

		String sort = driver.findElement(By.xpath("//div[@class='sort-selected']")).getText();
		System.out.println(sort);

		if (sort.contains("Price Low To High")) {
			System.out.println("items are sorted from low to high");
		} else {
			System.out.println("items are not sorted from low to high");
		}

		// Select the price range (900-1200)

		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();

		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900");

		driver.findElement(By.xpath("//input[@name='toVal']")).clear();

		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200");

		Thread.sleep(2000);

		// Filter with color Navy and verify the all applied filters

		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();

		String colour = driver.findElement(By.xpath("//a[text()=' Navy']")).getText();
		if (colour.contains("Navy")) {
			System.out.println("colour is filtered as Navy");
		} else {
			System.out.println("colour is not filtered as Navy");
		}

		Thread.sleep(3000);

		// Mouse Hover on first resulting Training shoes
		WebElement picture = driver.findElement(By.tagName("picture"));
		Actions action = new Actions(driver);
		action.moveToElement(picture).perform();

		// click QuickView button
		driver.findElement(By.xpath("//div[contains(text(),\"Quick View\")]")).click();

		// Print the cost and the discount percentage

		String cost = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();

		String Discountprice = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();

		System.out.println("cost of the shoes is" + " " + cost);

		System.out.println("Discount price of the shoes is" + " " + Discountprice);

		// Take the snapshot of the shoes
		TakesScreenshot screenshot = (TakesScreenshot) driver;

		File source = screenshot.getScreenshotAs(OutputType.FILE);

		File dest = new File("D://sample.png");

		FileHandler.copy(source, dest);

		// Close the current window
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();

		// Close the main window
		driver.close();

	}

}