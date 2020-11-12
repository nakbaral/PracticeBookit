package com.bookit.step_definitions;

import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.DBUtility;
import com.bookit.utilities.Driver;
import com.bookit.utilities.Environment;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    /**
     * This hook will be executed only for scenarios that are annotated with @db tag
     */
    @Before("@db")
    public void dbSetup() {
        DBUtility.createDBConnection(Environment.DB_HOST, Environment.DB_USERNAME, Environment.DB_PASSWORD);
    }

    /**
     * This hook will be executed only for scenarios that are annotated with @db tag
     */
    @After("@db")
    public void dbTearDown() {
        DBUtility.destroy();
    }

    /**
     * This hook will be executed only for scenarios that are annotated with @ui tag
     */
    @Before("@ui")
    public void uiSetup() {
        String browser = ConfigurationReader.getProperty("browser").toLowerCase();
        if (!browser.contains("ios") && !browser.contains("android")){
            Driver.getDriver().manage().window().maximize();
        } }
        /**
     * This hook will be executed only for scenarios that are annotated with @ui tag
     */
    @After("@ui")
    public void uiTearDown() {
        Driver.closeDriver();

      /* Marufjoon
      public class Hooks {
    @Before(order = 0)
    public void setUpScenario() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @After
    public void tearDownScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
       */
    }
}