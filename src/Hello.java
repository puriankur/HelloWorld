import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hello {

	public static void main(String[] args) {
		
		//Added a comment
		//System.out.println("Hello, World!");
				
		WebDriver wd_firefox = new FirefoxDriver();
		wd_firefox.get("http://www.gmail.com");

/*		System.out.println(wd_firefox.getCurrentUrl());
		System.out.println("This result is from Firefox browser!");
		System.out.println(wd_firefox.getTitle());
		wd_firefox.quit();*/		
		
		//wd_firefox.findElement(By.xpath(".//*[@id='Email']")).sendKeys("email1");
		//wd_firefox.findElement(By.id("Email")).sendKeys("email2");
		wd_firefox.findElement(By.cssSelector("#Email")).sendKeys("email5");  //Custom CSS: Use Hash '#' for ID and Dot '.' for Class 
		//wd_firefox.findElement(By.name("Email")).sendKeys("email3");
		//wd_firefox.findElement(By.cssSelector("input[type='email']")).sendKeys("email4"); //Custom CSS path(format): [attribute='value']      
		//wd_firefox.findElement(By.name("signIn")).click();
		//wd_firefox.findElement(By.className("rc-button")).click();
		wd_firefox.findElement(By.cssSelector(".rc-button.rc-button-submit")).click(); //Custom CSS: Use Dot '.' for Class
		wd_firefox.findElement(By.linkText("Need help?")).click();
		
		
		//ChromeDriver Path - For Chrome(and IE) we need to add a separate System.setProperty
/*		System.setProperty("webdriver.chrome.driver", "/Users/ankurpuri/Documents/EclipseIDE/selenium-2.53.0/chromedriver");
				
		WebDriver wd_chrome = new ChromeDriver();
		wd_chrome.get("http://www.google.com");
		System.out.println(wd_chrome.getCurrentUrl());
		System.out.println("This result is from Chrome browser!");*/
 
	
	}

}
