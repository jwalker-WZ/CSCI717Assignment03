public class EncryptionMachine {

	
	    // 1️⃣ Class constants (must be at the top, inside the class)
	    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	    public static int SHIFT = 3; // NOTE: Jonathan Walker changed to remove 'Final' for testing

	    // 2️⃣ Helper method: encrypt a single letter
	    public static char encryptLetter(char letter) {
	        int index = ALPHABET.indexOf(letter);
	        int newIndex = (index + SHIFT) % ALPHABET.length();
	        return ALPHABET.charAt(newIndex);
	    }

	    // 3️⃣ Helper method: encrypt a word
	    public static String encryptWord(String word) {
	        StringBuilder encrypted = new StringBuilder();
	        for (int i = 0; i < word.length(); i++) {
	            encrypted.append(encryptLetter(word.charAt(i)));
	        }
	        return encrypted.toString();
	    }

	    // 4️⃣ Main method
	    public static void main(String[] args) {
	        System.out.println("Welcome to the CSCI717 Encryption Machine Construction");
	        System.out.println("The program lets you encrypt a message");
	        System.out.println("with a key for your recipient to decrypt!");

	        // Fixed key
	        String key = "csci";
	        String encryptedKey = encryptWord(key);
	        System.out.println("Enter key: " + key);
	        System.out.println("\"" + key + "\" has been encrypted to: " + encryptedKey);

	        // Fixed 10-word message
	        String[] words = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog", "java"};
	        System.out.println("\nEncrypting 10 sample words automatically...");

	        for (String word : words) {
	            String encryptedWord = encryptWord(word);
	            System.out.println("\"" + word + "\" has been encrypted to: " + encryptedWord);
	        }

	        System.out.println("\nMessage fully encrypted. Happy secret messaging!");
	    }
	}




