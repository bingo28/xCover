package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XCover {
	WebDriver driver;

	public XCover(WebDriver driver) {
		this.driver = driver;
	}

	By quote = By.xpath("//*[@id=\"nav-get-quote-button\"]");
	By product = By.xpath("//*[@id=\"electronics-insurance\"]");
	By nextButton = By.xpath("//button[@type='submit']");
	By address = By.xpath("//input[@placeholder='e.g. 680 George Street, Sydney NSW, Australia']");
	By brand = By.xpath("//input[@placeholder='e.g. Apple']");
	By model = By.xpath("//input[@placeholder='e.g. iPhone XR']");
	By price = By.xpath("//input[@placeholder='A$']");
	By date = By.xpath("//input[@placeholder='dd/mm/yyyy']");
	By dateLastUsed = By.xpath("//input[@placeholder='dd/mm/yy']");
	By condition = By.cssSelector(
			"#\\30 3168021-4be5-4408-ae47-65c8dfeae406 > div > div.react-select__value-container.css-1hwfws3");

	public WebElement quoteButton() {
		return driver.findElement(quote);
	}

	public WebElement dateLastUsed() {
		return driver.findElement(dateLastUsed);
	}

	public WebElement product() {
		return driver.findElement(product);
	}

	public WebElement nextButton() {
		return driver.findElement(nextButton);
	}

	public WebElement address() {
		return driver.findElement(address);
	}

	public WebElement brand() {
		return driver.findElement(brand);
	}

	public WebElement model() {
		return driver.findElement(model);
	}

	public WebElement price() {
		return driver.findElement(price);
	}

	public WebElement date() {
		return driver.findElement(date);
	}

	public WebElement condition() {
		return driver.findElement(condition);
	}
}
