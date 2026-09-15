import java.util.Scanner;

public class OrderQuiz {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter Order Number: ");
         String orderNum = input.nextLine();
         System.out.print("Enter Customer Name: ");
         String customerName = input.nextLine();
         System.out.print("Enter Item Name: ");
         String itemName = input.nextLine();
         System.out.print("Enter Quantity: ");
         int quantity = input.nextInt();
         System.out.print("Enter Price: ");
         double price = input.nextDouble();
         System.out.print("Enter Order Type (D for Dine-in, T for Takeout): ");
         char orderType = input.next().charAt(0);
         input.close();
         
         System.out.println("\n===== ORDER INFORMATION =====");
         System.out.printf("Order Number : ORD-2026", orderNum);
         System.out.printf("Customer  : AnaReyes ", customerName);
         System.out.printf("Item   :   Chicken Mea1 ", itemName);
         System.out.printf("Quantity     : 2", quantity);
         System.out.printf("Price        :185.50", price);
         System.out.printf("Order Type   : D", orderType);
     }
 }

