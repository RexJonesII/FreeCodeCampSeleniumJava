package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends Utility {

  public static void scrollToElementJS(By locator) {
    WebElement element = driver.findElement(locator);
    String jsScript = "arguments[0].scrollIntoView();";
    ((JavascriptExecutor)driver).executeScript(jsScript, element);
  }

  public static void clickJS(By locator) {
    WebElement element = driver.findElement(locator);
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("arguments[0].click();", element);
  }
}
