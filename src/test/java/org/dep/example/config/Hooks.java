package org.dep.example.config;

import io.cucumber.core.api.Scenario;
import io.cucumber.core.event.Status;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

  @Before
  public void initScenario() {
    System.out.println("InitScenario");
    WebDriverManager.resetWebDriver();
    PageObjectManager.resetPageObjects();
    System.out.println("end of initScenario");
    File directory = new File("./src");
    System.out.println(directory.getAbsolutePath());
  }

  @AfterStep()
  public void takeScreenShotOnFailure(Scenario scenario) {
    if (scenario.getStatus().equals(Status.FAILED)) {
      takeScreenshot(scenario);
    }
  }

  @After()
  public void closeBrowser(Scenario scenario) {
    System.out.println("klj");
    WebDriverManager.getWebDriver().close();
  }

  private void takeScreenshot(Scenario scenario) {
    final byte[] screenshot = ((TakesScreenshot) WebDriverManager.getWebDriver())
        .getScreenshotAs(OutputType.BYTES);
    String currentDate = new SimpleDateFormat("_yyyy-MM-dd_HH:mm:ss").format(new Date());
    scenario.embed(screenshot, "image/png", scenario.getName() + "" + currentDate);
  }
}
