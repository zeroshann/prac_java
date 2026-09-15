import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give a number from 1 to 100: ");
        int number = sc.nextInt();

        System.out.println("The number you entered is: " + number);

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");


        sc.close();
        }
    }
}
