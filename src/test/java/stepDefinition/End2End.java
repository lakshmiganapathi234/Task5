package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class End2End {
	
	WebDriver driver;
	
	@Given("open the Browser")
	public void chrome(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("Open the application")
	public void openApp() {
		driver.get("https://www.saucedemo.com/");
	}
	
	@And("Login to the Application")
	public void Login() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@Then("Add Products to cart")
	public void AddProducts() {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
	}
	
	@And("Go to cart")
	public void GoCart() {
		driver.findElement(By.id("shopping_cart_container")).click();
	}
	
	@And("Remove some products")
	public void RemoveProd() {
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
	}
	
	@Then("checkout")
	public void checkout() {
		driver.findElement(By.id("checkout")).click();
	}
	
	@And("Add shipping Details")
	public void addDetails() {
		driver.findElement(By.id("first-name")).sendKeys("LAKSHMI GANAPATHI");
		driver.findElement(By.id("last-name")).sendKeys("KAVURU");
		driver.findElement(By.id("postal-code")).sendKeys("534247");
		driver.findElement(By.id("continue")).click();
	}
	
	@And("Finish Shopping")
	public void finish() {
		driver.findElement(By.id("finish")).click();
	}

}
