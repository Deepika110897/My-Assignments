package week3.day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
	        String text = "We learn Java basics as part of java sessions in java week1";
	        String[] words = text.split(" ");
	        int count;

	        for (int i = 0; i < words.length; i++) {
	            count = 1;
	            for (int j = i + 1; j < words.length; j++) {
	                if (words[i].equalsIgnoreCase(words[j])) {
	                    count++;
	                    words[j] = "";  // Replace duplicate word with empty string
	                }
	            }
	            // Optional: Print count of duplicates
	            // if(count > 1) System.out.println(words[i] + " appears " + count + " times");
	        }

	        // Print result
	        for (int i = 0; i < words.length; i++) {
	            System.out.print(words[i] + " ");
	        }
	    }

	}


