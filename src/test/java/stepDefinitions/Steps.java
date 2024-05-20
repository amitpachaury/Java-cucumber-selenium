package stepDefinitions;


import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import pageObjects.demoAsp;

import java.util.Map;
public class Steps {
	
       public WebDriver driver;
       public demoAsp dp;
	
    @Given("User Launch Chrome Browser")
        public void user_Launch_Chrome_Browser_and_open_URL() {
     	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver");

    	driver = new ChromeDriver();
    	
    	dp = new demoAsp(driver);
  
        }
    
    @When("User open URL {string}")
    public void User_open_URL(String url) {
	driver.get(url);
	driver.manage().window().maximize();
	dp.clickCookieOkbtn();
	
     }

    @When("User Search for the Input ID {string} and get result")
        public void user_Search_for_the_Input_ID(String inputID) throws InterruptedException {
        dp.clickDropdownArrow();
        dp.selectDrpdownValue(); 
        
        Thread.sleep(3000);
        
        String before_page = "//*[@id='Grid1']/div[4]/div[2]/button[text()='";
        String after_page = "']";
        
        
        String inputIdXpath = "//*[@id='Grid1']/div[3]/div[2]/div/table/tbody/tr/td[1]";
        
        List<String> person;
        int page = 1;
        
        System.out.println("Input Id number: " +inputID );
        
        do {
        	
        ////Fetch all the table InputID and save as a list
        List<WebElement> inputList = driver.findElements(By.xpath(inputIdXpath));
         
        //Use the java stream to filter and map the inputId
        
        person = inputList.stream().filter(s -> s.getText().contentEquals(inputID)).
        map(s ->dp.getPersonName(s)).collect(Collectors.toList());
        person.forEach(a ->System.out.println("Person: " + a));
        
      
        List<String>food = inputList.stream().filter(s -> s.getText().contentEquals(inputID)).
        map(s ->dp.getFoodName(s)).collect(Collectors.toList());
        food.forEach(a ->System.out.println("Food : " + a));
        
        
        List<String>country = inputList.stream().filter(s -> s.getText().contentEquals(inputID)).
        map(s ->dp.getCountryName(s)).collect(Collectors.toList());
        country.forEach(a ->System.out.println("Country :" + a));
        
        List<String>date = inputList.stream().filter(s -> s.getText().contentEquals(inputID)).
        map(s ->dp.getDate(s)).collect(Collectors.toList());
        date.forEach(a ->System.out.println("Date : " + a));
                
        List<String>location = inputList.stream().filter(s -> s.getText().contentEquals(inputID)).
        map(s ->dp.getLocation(s)).collect(Collectors.toList());
        location.forEach(a ->System.out.println("Location : " + a));
                        
        List<String>chef = inputList.stream().filter(s -> s.getText().contentEquals(inputID)).
        map(s ->dp.getChefName(s)).collect(Collectors.toList());
        chef.forEach(a ->System.out.println("Chef : " + a));
        
        
        // this is for pagination 
        if(person.size()<1)
        {
        String j = ++page + "";
        String actual_page = before_page+j+after_page;
        driver.findElement(By.xpath(actual_page)).click();
        Thread.sleep(3000);   	     
        }
        
        }
        
        while(person.size()<1);
     
        }
    
    @And("close browser")
	public void close_browser() {
		
		driver.quit();
			
	}

}
