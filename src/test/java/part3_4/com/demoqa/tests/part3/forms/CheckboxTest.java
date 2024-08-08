package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckboxTest extends BaseTest {

  @Test
  public void testCheckbox() {
    var formsPage = homePage.goToForms().clickPracticeForm();
    formsPage.clickSportsCheckbox();
    formsPage.clickReadingCheckbox();
    formsPage.clickMusicCheckbox();
    formsPage.unclickReadingCheckbox();

    boolean isReadingCheckboxSelected = formsPage.isReadingSelected();
    Assert.assertFalse(isReadingCheckboxSelected,
            "\n Reading Checkbox Is Selected \n");
  }
}
