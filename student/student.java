import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student's name:");
        String name = sc.nextLine();

        System.out.println("Enter the student's grade:");
        int grade = sc.nextInt();

        System.out.println("Student's name: " + name);
        System.out.println("Student's grade: " + grade);

        if (grade >= 90) {
            System.out.println("Excellent");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("Good");
        } else if (grade >= 75 && grade <= 79) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}

