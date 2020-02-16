package com.anbetrack.BaseUtilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsOnElement {
	
public static WebDriver driver;

public static WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver", "E:/mavenproject/Drivers/chromedriver.exe");
	driver= new ChromeDriver();
	return driver;
}

public static boolean elementFound(WebElement element) {
boolean res = false;
try {
res = element.isDisplayed();
} catch (Exception e) {
e.printStackTrace();
}
return res;
}
public static void setText(WebElement element, String name) {
if (name != null && elementFound(element)) {
element.clear();
element.sendKeys(name);
}
}
public static void setByJs(WebElement element, String name) {
JavascriptExecutor executor = (JavascriptExecutor)driver;
if (name != null && elementFound(element)) {
element.clear();
executor.executeScript("arguments[0].getAttribute('value')",element);
}
}
public static String getAttribute(WebElement element) {
String name = null;
if (elementFound(element)) {
name = element.getAttribute("value");
}
return name;
}
public static String getText(WebElement element) {
String name = null;
if (elementFound(element)) {
name = element.getText();
}
return name;
}
public static void click(WebElement element) {
if (elementFound(element)) {
 element.click();
}
}
public static void clickbyJs(WebElement element) {
	JavascriptExecutor executor = (JavascriptExecutor)driver;
if (elementFound(element)) {
	executor.executeScript("arguments[0].click();", element);
}
}
public static void getScreenShot(String screenShotFileName) {
File screenShotLocation = new File("./screenshot/" + screenShotFileName
+ ".png");
TakesScreenshot screenshot = (TakesScreenshot) driver;
File file = screenshot.getScreenshotAs(OutputType.FILE);
try {
FileUtils.copyFile(file, screenShotLocation);
} catch (IOException e) {
e.printStackTrace();
}
}
public static void uploadFiles(File path) {
try {
Robot robot = new Robot();
robot.setAutoDelay(3000);
StringSelection selection = new StringSelection(
path.getAbsolutePath());
Toolkit.getDefaultToolkit().getSystemClipboard()
.setContents(selection, null);
// press control+v
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.setAutoDelay(3000);
// release control+v
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyRelease(KeyEvent.VK_V);
// press enter
robot.setAutoDelay(3000);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
} catch (AWTException e) {

e.printStackTrace();
}
}
public static List<HashMap<String, String>> readValueFromExcelSheet() {
List<HashMap<String, String>> mapDatasList = new ArrayList();
try {
File excelLocaltion = new File("./Excel/Facebook.xlsx");
String sheetName = "Datas";
FileInputStream f = new FileInputStream(
excelLocaltion.getAbsolutePath());
Workbook w = new XSSFWorkbook(f);
Sheet sheet = w.getSheet(sheetName);
Row headerRow = sheet.getRow(0);
for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
Row currentRow = sheet.getRow(i);
HashMap<String, String> mapDatas = new HashMap<String, String>();
for (int j = 0; j < headerRow.getPhysicalNumberOfCells(); j++) {
Cell currentCell = currentRow.getCell(j);
switch (currentCell.getCellType()) {
case Cell.CELL_TYPE_STRING:
mapDatas.put(headerRow.getCell(j).getStringCellValue(),
currentCell.getStringCellValue());
break;
case Cell.CELL_TYPE_NUMERIC:
mapDatas.put(headerRow.getCell(j).getStringCellValue(),
String.valueOf(currentCell
.getNumericCellValue()));
break;
}
}
mapDatasList.add(mapDatas);
}
} catch (Throwable e) {
e.printStackTrace();
}
return mapDatasList;
}

public String getReportConfigPath(){
	 String reportConfigPath = "E:/Velmurugan/AnbETrack/src/main/java/com/anbetrack/config/extent-config.xml";
	 if(reportConfigPath!= null) return reportConfigPath;
	 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
	}
}
