package week3.day2;

public class Browser {
	 String browserName;
	    String browserVersion;

	    public Browser(String name, String version) {
	        this.browserName = name;
	        this.browserVersion = version;
	    }

	    public void openURL() {
	        System.out.println(browserName + " is opening a URL.");
	    }

	    public void closeBrowser() {
	        System.out.println(browserName + " is closing.");
	    }

	    public void navigateBack() {
	        System.out.println(browserName + " is navigating back.");
	    }
}
