package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoAsp {
	
WebDriver ldriver; 
	
	public demoAsp(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id='btnCookie']")
	WebElement cookiesbtn;
	
	@FindBy(xpath="//*[@id='Grid1PageSize-awed']/div[1]")
	WebElement drpdownArrow;
	
	@FindBy(xpath="//*[@id='Grid1PageSize-dropmenu']/div[2]/ul/li[4]")
	WebElement drpdownSelect;

	
    public void clickCookieOkbtn() {
		
    	cookiesbtn.click();
	}
	public void clickDropdownArrow() {
		
		drpdownArrow.click();
		
	}
	
	public void selectDrpdownValue() {
		drpdownSelect.click();
	}
	
	public String getPersonName(WebElement s) {
		
		String personName = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return personName;
	}
	public String getFoodName(WebElement s) {
		String foodName = s.findElement(By.xpath("following-sibling::td[2]")).getText();
		
		return foodName;
	}
	
	public String getCountryName(WebElement s) {
		
        String countryName = s.findElement(By.xpath("following-sibling::td[3]")).getText();
		
		return countryName;
	}
	
	public String getDate(WebElement s) {
		
        String date = s.findElement(By.xpath("following-sibling::td[4]")).getText();
		
		return date;
	}
	
	public String getLocation(WebElement s) {
		
        String location = s.findElement(By.xpath("following-sibling::td[5]")).getText();
		
		return location;
	}
	
	public String getChefName(WebElement s) {
		
        String countryName = s.findElement(By.xpath("following-sibling::td[6]")).getText();
		
		return countryName;
	}

}
