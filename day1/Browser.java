package week2.day1;

public class Browser {

    // Method 1: launchBrowser with return type String
    public String launchBrowser(String browserName) {
        System.out.println("Browser launched successfully");
        return browserName;
    }

    // Method 2: loadUrl without return type
    public void loadUrl() {
        System.out.println("Application url loaded successfully");
    }

    // Main method to execute both methods from the same class
    public static void main(String[] args) {
        Browser browser = new Browser(); // Creating object
        String name = browser.launchBrowser("Chrome");
        System.out.println("Browser name: " + name);
        browser.loadUrl();
    }
}

