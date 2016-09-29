package utils;

import data.enums.Browsers;

/**
 * Created by bzawa on 9/29/2016.
 */
public class SystemProperties {

    private static final String BROWSER = "browser";

    private SystemProperties() {
    }

    public static Browsers getBrowserProperty() {
        String browserProperty = System.getProperty(BROWSER);
        if (browserProperty == null) {
            throw new IllegalStateException("-Dbrowser property can't be null please use '-Dbrowser=chrome' or '-Dbrowser=firefox'");
        }else if(browserProperty.equalsIgnoreCase("chrome")){
            return Browsers.CHROME;
        }else if(browserProperty.equalsIgnoreCase("firefox")){
            return Browsers.FIREFOX;
        }else{
            throw new IllegalStateException("-Dbrowser must be '-Dbrowser=chrome' or '-Dbrowser=firefox'");
        }
    }

}
