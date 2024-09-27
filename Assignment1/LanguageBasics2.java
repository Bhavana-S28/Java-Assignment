public class LanguageBasics2 {
    public static void main(String[] args) {
        int nValues = 50;

        // Loop through numbers from 2 to nValues
        outer: for (int i = 2; i <= nValues; i++) {
            // Loop through potential divisors from 2 up to the square root of i
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    // If divisible, continue to the next number (labeled continue)
                    continue outer;
                }
            }
            // If no divisors found, i is prime
            System.out.println(i);
        }
    }
}
