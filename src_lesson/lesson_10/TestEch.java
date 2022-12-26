package lesson_10;

public class TestEch {

    public static void main(String[] args) {
        Ech ech;

        // Polymorphism: transition into many forms
        boolean isEnoughTime = true;
        if (isEnoughTime)
            ech = new NongNoc();
        else
            ech = new TrungEch();

        /*
            Example:
            AppiumDriver driver = new AndroidDriver();
            // AndroidDriver driver = new AndroidDriver();

            if (isAndroid)
                driver = new AndroidDriver();
            else
                driver = new IOSDriver():
        */
    }
}
