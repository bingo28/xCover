package testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import objectrepository.XCover;

public class XCoverQuote {

	@Test
	public void Login() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.xcover.com/en");
		driver.manage().window().maximize();
		XCover rd = new XCover(driver);
		rd.quoteButton().click();
		rd.product().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", rd.nextButton());

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement addressElement = wait.until(ExpectedConditions.elementToBeClickable(rd.address()));
		addressElement.sendKeys("28/38 Great Western Highway Parra");
		addressElement.sendKeys(Keys.ARROW_DOWN);
		addressElement.sendKeys(Keys.ENTER);
		jse.executeScript("arguments[0].click();", rd.nextButton());

		WebElement brand = wait.until(ExpectedConditions.elementToBeClickable(rd.brand()));
		brand.sendKeys("Apple");
		jse.executeScript("arguments[0].click();", rd.nextButton());

		WebElement model = wait.until(ExpectedConditions.elementToBeClickable(rd.model()));
		model.sendKeys("iPhone 12");
		jse.executeScript("arguments[0].click();", rd.nextButton());

		WebElement price = wait.until(ExpectedConditions.elementToBeClickable(rd.price()));
		price.sendKeys("1200");
		jse.executeScript("arguments[0].click();", rd.nextButton());

		WebElement date = wait.until(ExpectedConditions.elementToBeClickable(rd.date()));
		date.click();
		driver.findElement(By.cssSelector(
				"#Main > div > form > div > div.styled__StyledFormGroup-x3w5k1-0.dUwzQP.form-group > div > div > div > div > div > div > div.SingleDatePicker_picker.SingleDatePicker_picker_1.SingleDatePicker_picker__directionLeft.SingleDatePicker_picker__directionLeft_2 > div > div > div > div.DayPicker_focusRegion.DayPicker_focusRegion_1 > div.DayPicker_transitionContainer.DayPicker_transitionContainer_1.DayPicker_transitionContainer__horizontal.DayPicker_transitionContainer__horizontal_2 > div > div:nth-child(2) > div > table > tbody > tr:nth-child(1) > td.CalendarDay.CalendarDay_1.CalendarDay__default.CalendarDay__default_2.CalendarDay__lastDayOfWeek.CalendarDay__lastDayOfWeek_3"))
				.click();
		jse.executeScript("arguments[0].click();", rd.nextButton());

		driver.findElement(By.xpath("//*[contains(text(),'This is required')]/preceding-sibling::div/div")).click();
		WebElement el = driver
				.findElement(By.xpath("//*[contains(text(),'This is required')]/preceding-sibling::div/div"));
		el.sendKeys(Keys.ENTER);
		jse.executeScript("arguments[0].click();", rd.nextButton());

		WebElement dateLastUsed = wait.until(ExpectedConditions.elementToBeClickable(rd.dateLastUsed()));
		dateLastUsed.click();
		driver.findElement(By.cssSelector(
				"#Main > div > form > div > div.styled__StyledFormGroup-x3w5k1-0.dUwzQP.form-group > div > div > div > div > div > div > div.SingleDatePicker_picker.SingleDatePicker_picker_1.SingleDatePicker_picker__directionLeft.SingleDatePicker_picker__directionLeft_2 > div > div > div > div.DayPicker_focusRegion.DayPicker_focusRegion_1 > div.DayPicker_transitionContainer.DayPicker_transitionContainer_1.DayPicker_transitionContainer__horizontal.DayPicker_transitionContainer__horizontal_2 > div > div:nth-child(2) > div > table > tbody > tr:nth-child(1) > td.CalendarDay.CalendarDay_1.CalendarDay__default.CalendarDay__default_2.CalendarDay__lastDayOfWeek.CalendarDay__lastDayOfWeek_3"))
				.click();
		jse.executeScript("arguments[0].click();", rd.nextButton());

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"Main\"]/div/section/header/h1/span")));
		File destFile = new File("D://test.png");
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, destFile);

	}

}
