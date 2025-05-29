package Datadrivenusingapachepoi;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datadrivenusingpoi {
	
	static List<String> usernamelist = new ArrayList<String>();
	static List<String> passwordlist = new ArrayList<String>();
	
	public void readexcelvalue() throws IOException {
		FileInputStream excel = new FileInputStream("C:\\Users\\user\\Desktop\\Learning\\DataDriven1.xls");
		//using oldversion so using HSSF..need to import Workbook of poi lib
		Workbook workbook = new HSSFWorkbook(excel);
		Sheet sheet = workbook.getSheet("Sheet1");

		//using iterator method, we are reading all the rows in a excel
		Iterator <Row> rowiterator =  sheet.iterator();
		//then navigating each row, one by one using hasnext
		//rowiterator.hasNext() ->true or false
		//hasnext will navigate if next row contains value..if no values, it will come out
		while (rowiterator.hasNext()) {
			//storing first entire row in rowvalue using next
			Row rowvalue = (Row) rowiterator.next();
			//using  cellIterator method, we are reading all the cells value in a row
			Iterator <Cell> celliterator = rowvalue.cellIterator();
			//then navigating each cell, one by one using hasnext
			//celliterator.hasNext() ->true or false
			//hasnext will navigate if next cell contains value..if no values, it will come out
			int i = 2;
			while (celliterator.hasNext()) {
				//storing first cells value in cell using next
				//getStringCellValue get the value as string from the cells
				if (i%2==0) {
					usernamelist.add(celliterator.next().getStringCellValue());
				}else {
					passwordlist.add(celliterator.next().getStringCellValue());
				}
				i++;
				//System.out.println(cell);
			}

		}

	}
  
	public void Login(String uName, String Pw) {
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
	
	//need to execute 2 times , bec correct & incorrect credential, so using for 
	public void execute() {
		for (int i = 0; i < usernamelist.size(); i++) {
			//calling login method & pass the values
			Login(usernamelist.get(i), passwordlist.get(i));
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Datadrivenusingpoi datadrivenusingpoi = new Datadrivenusingpoi();

		datadrivenusingpoi.readexcelvalue();
		System.out.println(datadrivenusingpoi.usernamelist);
		System.out.println(datadrivenusingpoi.passwordlist);
		datadrivenusingpoi.execute();
	}

}
