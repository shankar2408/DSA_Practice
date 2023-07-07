package mandatoryHomeWork.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@class='chNavText darkGreyText']")).click();
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		
		driver.findElement(By.xpath("//ul[@role='listbox']/li[8]")).click();
		
		driver.findElement(By.xpath("//span[text()='To']")).click();
		
		driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
		
		driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[3]")).click();
		
		WebElement date =driver.findElement(By.xpath("(//div[@class='DayPicker-Week'])[4]/div[2]"));
		date.click();
		
		WebElement date1 =driver.findElement(By.xpath("(//div[@class='DayPicker-Week'])[4]/div[2]"));
		date1.click();
		
		driver.findElement(By.xpath("//span[text()='Travellers & Class']")).click();
		
		driver.findElement(By.xpath("//ul[@class='guestCounter font12 darkText gbCounter']/li[2]")).click();
		
		driver.findElement(By.xpath("(//ul[@class='guestCounter font12 darkText gbCounter'])[2]/li[1]")).click();
		
		driver.findElement(By.xpath("(//ul[@class='guestCounter font12 darkText gbCounter'])[3]/li[2]")).click();
		
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
		
		String searchresult = driver.findElement(By.xpath("//div[@class='listingRhs']/p")).getText();
		System.out.println("Search results are fetched as" + " " + searchresult );
		
		driver.findElement(By.xpath("(//span[text()='View Flight Details'])[1]")).click();
		
		Boolean flightdetails = driver.findElement(By.xpath("(//a[text()='FLIGHT DETAILS'])[1]")).isDisplayed();
		System.out.println(flightdetails + "flight details are displayed");
		
		driver.findElement(By.xpath("(//span[text()='View Prices'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[@class='viewFareBtnCol  ']/div/following-sibling::button)[2]")).click();
		
String oldwindow = driver.getWindowHandle();
		
		Set<String> newwindow = driver.getWindowHandles();
		
		for (String allwindows : newwindow) {
			driver.switchTo().window(allwindows);
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//button[text()='+ ADD NEW ADULT']")).click();
		
		//driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@placeholder='First & Middle Name'])[1]"));
		firstname.sendKeys("Priyanka");
		
		WebElement lastname = driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]"));
		lastname.sendKeys("G");
		
		WebElement gender = driver.findElement(By.xpath("(//div[@class='adultItem']/div/div/label[2])[1]"));
		gender.click();
		
		//
		
        driver.findElement(By.xpath("//button[text()='+ ADD NEW INFANT']")).click();
		
		
        Thread.sleep(2000);
        
		WebElement firstname1 = driver.findElement(By.xpath("(//input[@placeholder='First & Middle Name'])[2]"));
		firstname1.sendKeys("Shalu");
		
		WebElement lastname1 = driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[2]"));
		lastname1.sendKeys("A");
		
		Thread.sleep(3000);
		
		WebElement gender2 = driver.findElement(By.xpath("(//div[@class='adultItem']/div/div/label[2])[2]"));
		gender2.click();
		
		WebElement date11 = driver.findElement(By.xpath("//div[text()='Date']"));
		date11.click();
		
		driver.findElement(By.xpath("//div[@class='dropdown__menu-list css-11unzgr']/div[2]")).click();
		
		
		WebElement month = driver.findElement(By.xpath("//div[text()='Month']"));
		month.click();
		driver.findElement(By.xpath("(//div[@class='dropdown__menu-list css-11unzgr']/div[2]")).click();
		
	//	WebElement year = driver.findElement(By.xpath("//div[text()='Year']"));
	//	year.click();
	//	driver.findElement(By.xpath("(//div[@class='dropdown__single-value css-1uccc91-singleValue'])[3]")).click();
		
	//	WebElement email = driver.findElement(By.xpath("//div[@class='adultItem']/div/div/label[2]"));
	//	email.click();
		
		WebElement mobilenumbr = driver.findElement(By.xpath("//input[@placeholder='Mobile No']"));
		mobilenumbr.sendKeys("9878675678");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		checkbox.sendKeys("test@gmail.com");
		
		WebElement checkbox1 = driver.findElement(By.xpath("//div[@class='emailIds-dropdown']/div[@class='emailId']"));
		checkbox1.click();
		
		Thread.sleep(3000);
		
		
		
		WebElement continue1 = driver.findElement(By.xpath("//button[text()='Continue']"));
		continue1.click();
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,350)", "");
		//Thread.sleep(3000);
		

	}

}