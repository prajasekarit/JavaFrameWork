package com.test.stepdefinition;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import PageObjects.*;

@SuppressWarnings("unused")
@RunWith(Cucumber.class)
public class SDsGoogleSearch extends base {

	GoogleSearch gsa;
	SoftAssert softAssertion;
	
	
	public static org.apache.logging.log4j.Logger log=LogManager.getLogger(base.class.getName());
	
	@Test
	 @Given("^Initialize the (.+) browser$")
	    public void initialize_the_browser(String browser) throws Throwable {
			
			log.info("Initialize -Driver");
			driver = initializeDriver(browser);

	    }

	@Test
	    @When("^Google.com is launched send the literal (.+) in Google text box and Enter the search button$")
	    public void googlecom_is_launched_send_the_literal_in_google_text_box_and_enter_the_search_button(String searchterm) throws Throwable {
				
			log.info("After Google is launced");
	    	gsa = new GoogleSearch(driver);
	    	gsa.getSearchBox().sendKeys(searchterm);
			gsa.SearchBox_Enter().click();
	
	}

	@Test
	    @Then("^Verify the links with the Literal (.+) and confirm the number of links displayed is more than one$")
	    public void verify_the_links_with_the_literal_and_confirm_the_number_of_links_displayed_is_more_than_one(String searchgumtree) throws Throwable {
			
	    	gsa = new GoogleSearch(driver);
	    	int size = gsa.GUM_TREE_SIZE();
	    	log.info("Number of times the GUM TREE Text displayed in First page is : " + size);
			//AssertJUnit.assertTrue(size > 0);
	    	System.out.println("Number of times the GUM TREE Text displayed in First page is : " + size);
		    Assert.assertTrue(size>0);

	    }

	@Test
	    @Then("^Close Browsers$")
	    public void close_browsers() throws Throwable {
			log.info("Closing the Browser");
			driver.close();
			driver=null;
	    }

	    @And("^Navigate to (.+) Site$")
	    public void navigate_to_site(String url) throws Throwable {
	    
	    	log.info(url + " :before");
			driver.manage().window().maximize();
		
			driver.get(url);
			log.info(url + " :after");
	    }

	    @Test
	    @And("^verify that the title is getting is displayed$")
	    public void verify_that_the_title_is_getting_is_displayed() throws Throwable {
			
			String googleSearch = driver.getCurrentUrl();
			gsa = new GoogleSearch(driver);
			
			List<WebElement> findGUM_Tree_Elements = gsa.GUM_TREE_SIZE_A();
			
			System.out.println("Gum tree elements:"+ findGUM_Tree_Elements.size());
		
			for (int i = 0; i < findGUM_Tree_Elements.size(); i++) 
			{
				String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
				
				WebElement link = gsa.GUM_TREE_SIZE_A().get(i);
				
				Actions newTab = new Actions(driver);
				
				newTab.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(link).build().perform();
				//newTab.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(link).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
					
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
				
				 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				//below code will switch to new tab
				driver.switchTo().window(tabs.get(1));
				System.out.println(driver.getTitle());
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println(" : Actual Header Getting Displayed: "+ driver.getTitle());
				log.info("Actual Header Getting Displayed: "+ driver.getTitle());
			    softAssertion.assertEquals("Used Cars for Sale in London | Great Local Deals | Gumtree", driver.getTitle());
				
				//perform whatever actions you want in new tab then close it
				driver.close();
				
				//Switch back to your original tab
				driver.switchTo().window(tabs.get(0));
				
			
			  
			}
						
			//open in new Tab and Get the Title
			/*for(int i=0;i<gsa.GUM_TREE_SIZE_A().size();i++)
			{
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			    System.out.println(gsa.GUM_TREE_SIZE_A().get(i).getText());
			  //  gsa.GUM_TREE_SIZE_A().get(i).sendKeys(clickonlinkTab);
			   Actions action = new Actions(driver);
			   action.contextClick(gsa.GUM_TREE_SIZE_A().get(i)).perform();
			   action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
				//action.clickAndHold(gsa.GUM_TREE_SIZE_A().get(i)).sendKeys(Keys.ENTER).build().perform();
			   
			}// opens all the tabs
			Set<String> abc=driver.getWindowHandles();//4
			Iterator<String> it=abc.iterator();
			
			while(it.hasNext())
			{
				
			   driver.switchTo().window(it.next());
			   System.out.println(driver.getTitle());
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   System.out.println(" : Actual Header Getting Displayed: "+ driver.getTitle());
			   log.info("Actual Header Getting Displayed: "+ driver.getTitle());
			   softAssertion.assertEquals("Used Cars for Sale in London | Great Local Deals | Gumtree", driver.getTitle());
			
			}*/
	    }

	    @Given("^Validate the Application$")
	    public void validate_the_application() throws Throwable {
	       System.out.println("This is the PRE REQUESITE part of the Test scenarios");
	    }
}
