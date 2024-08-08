package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {

  @Test
  public void testWebTable() {
    String email = "kierra@example.com";
    String expectedAge = "34";

    var webTablePage = homePage.goToElements().clickWebTables();
    webTablePage.clickEdit(email);
    webTablePage.setAge("34");
    webTablePage.clickSubmitButton();
    String actualAge = webTablePage.getTableAge(email);
    Assert.assertEquals(actualAge, expectedAge,
            "\n Actual & Expected Ages Do Not Match \n");
  }
}
