package week3.day2;

public class ReportGenerator {
	  // First overloaded method: accepts two Strings
    public void reportStep(String msg, String status) {
        System.out.println("ReportStep called with 2 arguments:");
        System.out.println("Message: " + msg);
        System.out.println("Status: " + status);
    }

    // Second overloaded method: accepts two Strings and a boolean
    public void reportStep(String msg, String status, boolean snap) {
        System.out.println("ReportStep called with 3 arguments:");
        System.out.println("Message: " + msg);
        System.out.println("Status: " + status);
        System.out.println("Snapshot taken: " + snap);
    }

    // Main method to demonstrate method overloading
    public static void main(String[] args) {
        // Create an object of the class
        ReportGenerator rg = new ReportGenerator();

        // Call the version with 2 arguments
        rg.reportStep("Login successful", "PASS");

        // Call the version with 3 arguments
        rg.reportStep("Page loaded", "PASS", true);
    }
}
