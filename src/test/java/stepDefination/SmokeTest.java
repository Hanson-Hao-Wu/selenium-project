package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	WebDriver driver;
	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://secure.caaniagara.ca/jsp_forms/login.jsp");
		driver.get("https://newlandgroup.basecamphq.com/login");
	}

	@When("^Input username and password$")
	public void input_username_and_password() throws Throwable {
		/*driver.findElement(By.name("MembershipNum")).sendKeys("0391725");
		driver.findElement(By.name("PersonNum")).sendKeys("015");
		driver.findElement(By.name("Password")).sendKeys("Evan1124");*/
		driver.findElement(By.name("username")).sendKeys("hao@newland.com");
		driver.findElement(By.name("password")).sendKeys("wuhao1985");
		
	}
	
	@When("^Input \"(.*?)\" and \"(.*?)\"$")
	public void input_and(String username, String password) throws Throwable {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user should login successfully$")
	public void user_should_login_successfully() throws Throwable {
		driver.findElement(By.name("commit")).click();
		
	}
	
	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {
		driver.quit();
	}
}
