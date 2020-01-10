package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {

	
	public WebDriver driver;

	private By SearchBox = By.cssSelector("input.gLFyf.gsfi");
	private By SearchBox_Enter = By.cssSelector("input.gNO89b");
	private By GUM_TREE = By.xpath("//*[contains(text(),'gumtree')]");
	private By GUM_TREE_SIZEA=By.xpath("//h3[contains(text(),'Used Cars for Sale in London | Great Local Deals |')]");
	//private By GUM_TREE_SIZEA=By.partialLinkText("//cite[contains(text(),'www.gumtree.com')]");
	public GoogleSearch(WebDriver driver) {

		this.driver=driver;
	}

	
	public WebElement SearchBox_Enter() {
		return driver.findElement(SearchBox_Enter);
	}

	public int GUM_TREE_SIZE() {
		return driver.findElements(GUM_TREE).size();
	}

	public List<WebElement> GUM_TREE_SIZE_A() {
		return driver.findElements(GUM_TREE_SIZEA);
	}
	public WebElement getSearchBox() {
		// TODO Auto-generated method stub
		System.out.println("Inside Search Box Check");
		return driver.findElement(SearchBox);
	}

}
