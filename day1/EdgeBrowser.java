package week2.day1;

public class EdgeBrowser {

    public static void main(String[] args) {
        Browser browser = new Browser(); // Creating object of Browser class
        String name = browser.launchBrowser("Edge");
        System.out.println("Browser name: " + name);
        browser.loadUrl();
    }
}
