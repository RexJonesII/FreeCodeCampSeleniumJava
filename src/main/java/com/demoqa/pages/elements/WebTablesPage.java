package com.demoqa.pages.elements;

import org.openqa.selenium.By;

public class WebTablesPage extends ElementsPage {

  private By registrationAgeField = By.id("age");
  private By submitButton = By.id("submit");

  public void clickEdit(String email) {
    By edit = By.xpath("//div[text()='"+ email +"']//following::span[@title='Edit']");
    click(edit);
  }

  public void setAge(String age) {
    set(registrationAgeField, age);
  }

  public void clickSubmitButton() {
    click(submitButton);
  }

  public String getTableAge(String email) {
    By tableAge = By.xpath("//div[text()='"+ email +"']//preceding::div[1]");
    return find(tableAge).getText();
  }
}
