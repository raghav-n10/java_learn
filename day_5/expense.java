import java.util.Scanner;
class expense{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ra;
        int ra1;
        int total=0,choice;
        do { 
            System.out.println("Enter ur Expense Name: ");
            ra = sc.nextLine();
            System.out.println("Enter ur Expense amount: ");
            ra1 = sc.nextInt();
            System.out.println(ra+" "+ra1);
            total+=ra1;
            System.out.println("If Continue Press 1 else Press 0");
            choice = sc.nextInt();
            sc.nextLine();
        } while (choice!=0);
        System.out.println("Total Amount: "+total);
    }
}