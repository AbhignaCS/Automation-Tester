package selected;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_tableXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\LTI\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		List<WebElement> col=driver.findElements(By.xpath("html/body/div[2]/div[5]/table[1]/tbody[1]/tr/td"));
		for(WebElement w:col)
			System.out.println(w.getText());

	}

}
