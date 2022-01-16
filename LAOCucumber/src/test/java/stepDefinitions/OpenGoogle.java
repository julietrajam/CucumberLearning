package stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class OpenGoogle {
	
public ChromeDriver driver;
	
	@Given("Open the browser")
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Given("user is entering google.com")
	public void user_is_entering_google_com() {
	   
		driver.get("https://www.google.com/");
		
	}
	@When("the user clicks the searchbox")
	public void the_user_clicks_the_searchbox() {
		
		driver.findElement(By.name("q")).click();
	   
	}
	@And("types the search term as {string}")
	public void types_the_search_term_as(String searchTerm) {
	   
		driver.findElement(By.name("q")).sendKeys(searchTerm);
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
	}
	@Then("the user should be able to see the search results for Juliet")
	public void the_user_should_be_able_to_see_the_search_results_for_juliet() {
	  Boolean link=driver.findElement(By.partialLinkText("Juli")).isDisplayed();
	  if(link)
		  System.out.println("Result displayed");
		
	}


	
}
