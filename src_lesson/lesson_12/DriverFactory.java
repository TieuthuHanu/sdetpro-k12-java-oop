package lesson_12;

public class DriverFactory {

    public static AppiumDriver getAppiumDriver(Platform platform) {
        AppiumDriver appiumDriver;
        switch (platform) {
            case IOS:
                appiumDriver = new IOSDriver();
                break;
            case ANDROID:
                appiumDriver = new AndroidDriver();
                break;
            default:
                throw new IllegalArgumentException("Please provide correct platform");
        }
        return appiumDriver;
    }
}
