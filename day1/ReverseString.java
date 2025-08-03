package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// Step 1: Declare the input string
        String company = "testleaf";

        // Step 2: Convert the string to a character array
        char[] characters = company.toCharArray();

        // Step 3: Use a loop to iterate from the end to the start
        System.out.print("Reversed String: ");
        for (int i = characters.length - 1; i >= 0; i--) {
            System.out.print(characters[i]);
        }

	}

}
