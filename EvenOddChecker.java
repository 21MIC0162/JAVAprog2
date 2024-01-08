public class EvenOddChecker {
    public static void main(String[] args) {
        // Predefined numbers
        int number1 = 24;
        int number2 = 37;

        // Check if the numbers are even or odd
        checkAndPrint(number1);
        checkAndPrint(number2);
    }

    // Function to check if a number is even and print the result
    private static void checkAndPrint(int num) {
        if (isEven(num)) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }

    // Function to check if a number is even
    private static boolean isEven(int num) {
        // Check if the remainder when divided by 2 is 0
        return num % 2 == 0;
    }
}
