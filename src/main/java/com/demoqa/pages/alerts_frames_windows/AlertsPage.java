package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class AlertsPage extends Alerts_Frames_WindowsPage {

  private By informationAlertButton = By.id("alertButton");
  private By confirmationAlertButton = By.id("confirmButton");
  private By confirmationResult = By.id("confirmResult");
  private By promptAlertButton = By.id("promtButton");
  private By promptResult = By.id("promptResult");

  public String getPromptAlertResult() {
    return find(promptResult).getText();
  }

  public void clickPromptAlertButton() {
    click(promptAlertButton);
  }

  public void clickInformationAlertButton() {
    click(informationAlertButton);
  }

  public void clickConfirmationAlertButton() {
    click(confirmationAlertButton);
  }

  public String getConfirmationResult() {
    return find(confirmationResult).getText();
  }

}
