package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtility extends Utility {

  public static void explicitWaitUntilVisible(int seconds, By locator) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
  }

  public static void fluentWaitUntilVisible(int seconds, By locator) {
    FluentWait fluentWait = new FluentWait(driver)
            .withTimeout(Duration.ofSeconds(seconds))
            .pollingEvery(Duration.ofMillis(500))
            .ignoring(NoSuchElementException.class,
                    StaleElementReferenceException.class);
    fluentWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
  }
}
