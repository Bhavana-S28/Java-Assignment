public class ObjectBasics1 {
    public static void main(String[] args) {
        // Input text
        String text = "To be or not to be, that is the question;"
                + " Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        // Variables to count spaces, vowels, and total letters
        int spaces = 0, vowels = 0, letters = 0;

        // Convert text to lowercase to simplify checking
        text = text.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i); // Get the character at the current index

            // Check if the character is a letter
            if (Character.isLetter(c)) {
                letters++; // Increment letter count

                // Check if the character is a vowel
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++; // Increment vowel count
                }
            }

            // Check if the character is a space
            if (c == ' ') {
                spaces++; // Increment space count
            }
        }

        // Output the results
        System.out.println("The text contained vowels: " + vowels);
        System.out.println("Consonants: " + (letters - vowels));
        System.out.println("Spaces: " + spaces);
    }
}
