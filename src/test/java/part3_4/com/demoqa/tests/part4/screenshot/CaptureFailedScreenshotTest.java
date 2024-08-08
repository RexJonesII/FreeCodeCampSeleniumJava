package part3_4.com.demoqa.tests.part4.screenshot;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CaptureFailedScreenshotTest extends BaseTest {

  @Test
  public void testClickingSubmitButtonWithoutJavaScriptExecutor() {
    var practiceFormPage = homePage.goToForms().clickPracticeForm();
    practiceFormPage.clickSubmitButton();
  }
}
