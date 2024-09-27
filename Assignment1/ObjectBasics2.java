
public class ObjectBasics2 {
    public static void main(String[] args) {
        // Input text (same soliloquy as before)
        String text = "To be or not to be, that is the question;"
                + " Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        // Step 1: Remove punctuation and split text into words
        text = text.replaceAll("[^a-zA-Z\\s]", ""); // Remove punctuation marks
        String[] words = text.split("\\s+"); // Split by spaces, ignoring multiple spaces

        // Step 2: Sort the array using bubble sort
        bubbleSort(words);

        // Step 3: Output the sorted words
        System.out.println("Sorted words:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    // Bubble sort algorithm to sort an array of strings
    public static void bubbleSort(String[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false; // Flag to check if any swap occurred
            for (int i = 0; i < n - 1; i++) {
                // Compare successive elements and swap if necessary
                if (array[i].compareToIgnoreCase(array[i + 1]) > 0) {
                    // Swap array[i] and array[i + 1]
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true; // A swap occurred
                }
            }
        } while (swapped); // Repeat until no swaps occur
    }
}
