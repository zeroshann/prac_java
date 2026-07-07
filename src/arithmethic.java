public class arithmethic {
    
    public static void main(String[] args) {
        //create variables of different data types
        int num1 = 10;
        int num2 = 5;

        //perform arithmetic operations
        int sum = num1 + num2; // addition
        int difference = num1 - num2; // subtraction
        int product = num1 * num2; // multiplication
        int quotient = num1 / num2; // division
        int modulus = num1 % num2; // modulus
        int increment = ++num1; // increment
        int decrement = --num2; // decrement

        //display results
        System.out.println("Sum: " + sum); // Outputs 15
        System.out.println("Difference: " + difference); // Outputs 5
        System.out.println("Product: " + product); // Outputs 50
        System.out.println("Quotient: " + quotient); // Outputs 2
        System.out.println("Modulus: " + modulus); // Outputs 0
        System.out.println("Increment: " + increment); // Outputs 11
        System.out.println("Decrement: " + decrement); // Outputs 4
    }
}
