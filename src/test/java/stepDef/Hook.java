package stepDef;


import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;

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
            case "stg":
                url = "https://www.stage.taltektc.com";
                Email_Address="spdt1511@gmail.com";
                Password = "Dhruv#05";
                break;
            case "prod":
                url = "https://www.prod.taltektc.com";
                Email_Address="spdt1511@gmail.com";
                Password = "Dhruv#05";
                break;
        }
        driver.get(url);

    }

    @After
    public void aftereachTest(){
        //driver.quit();

    }

}

