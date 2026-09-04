import java.util.Scanner;

public class StudentScoreCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char grade = 'A';

        System.out.print("Student Name: ");
        String name = input.nextLine();

        System.out.print("Section: ");
        int section = input.nextInt();

        System.out.print("Math Score: ");
        int mathscore = input.nextInt();

        System.out.print("Science Score: ");
        int sciencescore = input.nextInt();

        System.out.print("English Score: ");
        int englishscore = input.nextInt();

        int totalScore = mathscore + sciencescore + englishscore;
        double averageScore = totalScore / 3;

        System.out.println();
        System.out.println("============================================");
        System.out.println("             STUDENT INFORMATION");
        System.out.println("============================================");
        System.out.println("Student Name: " + name);
        System.out.println("Section: " + section);
        System.out.println("Math Score: " + mathscore);
        System.out.println("Science Score: " + sciencescore);
        System.out.println("English Score: " + englishscore);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);
        System.out.println("============================================");

        input.close();
    }
}
