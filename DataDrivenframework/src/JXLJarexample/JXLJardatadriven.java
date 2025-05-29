package JXLJarexample;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXLJardatadriven {


	String [][] data = null;

	public String[][] getexceldata() throws BiffException, IOException {

		FileInputStream excel = new FileInputStream("C:\\Users\\user\\Desktop\\Learning\\DataDriven.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		//we can use index or sheet name as present in excel
		Sheet sheet = workbook.getSheet(0);
		int rowcount = sheet.getRows();
		int columncount = sheet.getColumns();

		//creating 2 dimensional array, array storeage/limit based on rowcount & columncount
		//rowcount value is 5 including headers
		//so rowcount-1 used...in array we only need 4 row, 2 column..that why
		String testdata[][] = new String[rowcount-1][columncount];

		//here we are using i as 1 bec first row in excel sheet is column name, so directly read from 2nd row
		for (int i = 1; i < rowcount; i++) {
			for (int j = 0; j < columncount; j++) {
				//while storing in array, use i-1	
				//rowcount value is 5 including headers
				//so rowcount-1 used...in array we only need 4 row, 2 column..that why
				//note:getCell(j, i)..bec reading start from (0,1) cells in excel..i & j exchanged
				testdata[i-1][j] = sheet.getCell(j, i).getContents();
			}
		}
		
	
		return testdata;
	}

	@DataProvider(name="Credential")
	public String[][] dataprovider() throws BiffException, IOException {
		//getting the getexceldata() method return value & stored in data
		data = getexceldata();
		return data;
	}

	@Test(dataProvider = "Credential")
	public void correctcredential(String uName, String Pw) {
		System.out.println("Hello Suku");

		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver.exe");
		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// Launch Website
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//wait
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("username")));

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(uName);
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys(Pw);
		WebElement btnlogin = driver.findElement(By.xpath("//button"));
		btnlogin.click();
	}

}
