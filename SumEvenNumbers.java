public class SumEvenNumbers {
    // Create a method to sum even numbers in an array
    public static void main(String[] args) {
        int sum = 0;  // The sum of even numbers
        int number = 2;  // The number to check
        // Loop through the array of numbers
        while (number <= 100) {
            sum += number;  // ]The number is even, so add it to the sum
            number += 2;  // The next number to check is 2 more than the current number
        }
        // Print the sum of even numbers
        System.out.println("The sum of all even numbers between 1 and 100 is: " + sum);
    }
}

