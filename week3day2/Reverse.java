package week3.day2;

public class Reverse {

	public static void main(String[] args) {
	        String test = "I am a software tester";
	        String[] words = test.split(" ");  // Split the sentence into words

	        for (int i = 0; i < words.length; i++) {
	            if (i % 2 == 1) {  // Check if the index is odd
	                // Reverse the word at odd index
	                char[] chars = words[i].toCharArray();
	                for (int j = chars.length - 1; j >= 0; j--) {
	                    System.out.print(chars[j]);
	                }
	            } else {
	                // Print the word at even index as it is
	                System.out.print(words[i]);
	            }
	            // Add space after each word
	            System.out.print(" ");
	        }
	    }

	}


