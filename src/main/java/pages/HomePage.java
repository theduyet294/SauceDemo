package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

	public By linkLogin = By.linkText("Login");

	public HomePage(WebDriver dr) {
		super(dr);
	}

	public LoginPage clickOnRegisterLink() {

		driverWeb.findElement(linkLogin).click();
		return new LoginPage(driverWeb);
	}
}
