import java.util.Scanner;

public class employee_salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Employee's name: ");
        String name = sc.nextLine();

        System.out.println("Enter the Employee's salary: ");
        double salary = sc.nextDouble();

        System.out.println(" ");
        System.out.println("Employee's name: " + name);
        System.out.println("Employee's salary: " + salary);

        if (salary >= 50000) {
            System.out.println("High Salary");
        } else if (salary >= 30000 && salary < 50000) {
            System.out.println("Average salary");
        } else {
            System.out.println("Low salary");
        }

    }
    
}
