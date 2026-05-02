import java.util.*;
public class foodexpense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double foodtotal = 0;
        double traveltotal = 0;
        double shoptotal = 0;

        System.out.println("Enter category (Food/Travel/Shopping). Type 0 to end: ");
        String category = sc.nextLine();

        while (!category.equals("0")) {
            System.out.println("Enter the amount");
            double amt = sc.nextDouble();
            sc.nextLine(); 
            total+=amt;
            if (category.equals("food")) {
                foodtotal += amt;
            }
            if (category.equals("travel")) {
                traveltotal += amt;
            }
            if (category.equals("shopping")) {
                shoptotal += amt;
            }
            System.out.println(category + " - " +amt);
            System.out.println("Total Expense: " +total);

            System.out.println("Enter category (Food/Travel/Shopping). Type 0 to end: ");
            category = sc.nextLine();

            
        }  
    }
}