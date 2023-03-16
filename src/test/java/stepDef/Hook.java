package stepDef;


import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends Config {
    //QA: https://www.qa.taltektc.com
    //stage: https://www.stage.taltektc.com
    //prod: https://www.prod.taltektc.com
    public static String url;
    public static String driverType= System.getProperty("browser");
    public static String envType = System.getProperty("env");




    @Before
    public void beforeeachTest(){
        driver = setupBrowser(driverType);
        switch (envType){
            case "qa":
                url = "https://www.qa.taltektc.com";
                Email_Address="qa.spdt1511@gmail.com";
                Password = "sap123";
                break;
            case "stage":
                url = "https://www.stage.taltektc.com";
                Email_Address="stage.spdt1511@gmail.com";
                Password = "sap123";
                break;
            case "prod":
                url = "https://www.prod.taltektc.com";
                Email_Address="prod.spdt1511@gmail.com";
                Password = "Dhruv#05";
                break;
        }
        driver.get(url);

    }

    @After
    public void aftereachTest(Scenario scenario){
        try{
            if (scenario.isFailed()) {

                final byte[] screenshot= ((TakesScreenshot) driver)

                .getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
            }


        }finally {

        }
        //driver.quit();

    }

}

