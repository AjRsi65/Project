package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

	
	
WebDriver driver;
	
	@FindBy( id= "id_login")
	 WebElement username; 
	 
	 @FindBy(id = "id_password")
	 WebElement password;
	 
	 @FindBy(xpath= "/html/body/div[7]/div/div/div/div[1]/form/input[2]") 
	 WebElement Signin ;
	 
	 public  SigninPage()
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\singa\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");	
	        driver =new ChromeDriver(options);
	        
	        driver.get("https://www.hackerearth.com/login/");
	        driver.manage().window().maximize();
	        
	        PageFactory.initElements(driver, this );
	 }
	        
	        public void launchApplication()
	        
		    {
	        	
		    	driver.get("https://www.hackerearth.com/login/");
		    }

		    public void closeBrowser() {
				driver.close();
		    }
		    
		 
		     public void enterUserName(String un)    
		     {
		    	 username.sendKeys(un);
		    	 
		     }
		     
		     public void enterPassword(String pwd)
		     {
		    	 password.sendKeys(pwd);
		     }
		     
		     public void clickButton()
		     {
		    	 Signin.click();
		     }
	 
}

