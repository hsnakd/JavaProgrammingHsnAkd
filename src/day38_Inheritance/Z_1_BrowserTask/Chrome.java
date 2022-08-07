package day38_Inheritance.Z_1_BrowserTask;

public class Chrome extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome browser");
    }
}
/*
2. Create the following subclasses of Browser and override the methods if needed:

			1. Chrome extends Browser
					methods:
						openBrowser(): prints "opening chrome browser"
						closeBrowser():  prints "closing chrome browser"


 */