package week3.day2;

public class BrowserInheritanceDemo {
	 public static void main(String[] args) {
	        Chrome chrome = new Chrome("120.0");
	        Edge edge = new Edge("115.2");
	        Safari safari = new Safari("14.1");

	        // Calling inherited and specific methods
	        chrome.openURL();
	        chrome.openIncognito();
	        chrome.clearCache();
	        chrome.navigateBack();
	        chrome.closeBrowser();

	        System.out.println();

	        edge.openURL();
	        edge.takeSnap();
	        edge.clearCookies();
	        edge.navigateBack();
	        edge.closeBrowser();

	        System.out.println();

	        safari.openURL();
	        safari.readerMode();
	        safari.fullScreenMode();
	        safari.navigateBack();
	        safari.closeBrowser();
	    }
}
