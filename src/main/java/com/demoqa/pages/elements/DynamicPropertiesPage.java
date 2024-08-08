package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.WaitUtility.*;

public class DynamicPropertiesPage extends ElementsPage {

  private By visibleAfterButton = By.id("visibleAfter");

  public String getVisibleAfterButtonText() {
    explicitWaitUntilVisible(5, visibleAfterButton);
    String visibleText = getText(visibleAfterButton);
    System.out.println("Button Text: " + visibleText);
    return visibleText;
  }
}
