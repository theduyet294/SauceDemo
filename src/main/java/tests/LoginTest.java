package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import tests.models.ModelsProcess;
import tests.models.Login;

public class LoginTest extends TestCase{
	
	/*Test Steps
	 * 1.Open website
	 * 2. Input all valid data
	 * 3. Click Login
	 * 4. Login succesfully
	 */
	@Test
	public void LoginSuccessfully() {
		ModelsProcess  modelsProcess = new ModelsProcess();
		String testData = "LoginData.csv";
		Login login = modelsProcess.convertRegisterFromCsv(testData);
		
		LoginPage loginPage = new LoginPage(testBase.driver);
		loginPage.inputData(login);
	}
}
