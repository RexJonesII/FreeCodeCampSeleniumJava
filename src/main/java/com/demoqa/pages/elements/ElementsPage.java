package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {

  private By webTablesMenuItem = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
  private By linksMenuItem = By.xpath("//li[@id='item-5']/span[text()='Links']");
  private By dynamicPropertiesMenuItem = By.xpath("//li[@id='item-8']/span[text()='Dynamic Properties']");
  private By textBoxMenuItem = By.xpath("//li[@id='item-0']/span[text()='Text Box']");

  public TextBoxPage clickTextBox() {
    scrollToElementJS(textBoxMenuItem);
    click(textBoxMenuItem);
    return new TextBoxPage();
  }

  public DynamicPropertiesPage clickDynamicProperties() {
    scrollToElementJS(dynamicPropertiesMenuItem);
    click(dynamicPropertiesMenuItem);
    return new DynamicPropertiesPage();
  }

  public WebTablesPage clickWebTables () {
    click(webTablesMenuItem);
    return new WebTablesPage();
  }

  public LinksPage clickLinks() {
    click(linksMenuItem);
    return new LinksPage();
  }
}
