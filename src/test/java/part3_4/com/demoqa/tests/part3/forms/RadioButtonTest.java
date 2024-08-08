package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {

  @Test
  public void testRadioButton() {
    var formsPage = homePage.goToForms().clickPracticeForm();
    formsPage.clickFemaleRadioButton();
    boolean isFemaleRadioButtonSelected = formsPage.isFemaleSelected();
    Assert.assertTrue(isFemaleRadioButtonSelected,
            "\n Female Radio Button Is Not Selected \n");
  }
}
