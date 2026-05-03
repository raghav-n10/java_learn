import java.util.Scanner;
class bank{
    public static void main(String[] args) {
        int pin = 1111;
        Scanner ra = new Scanner(System.in);
        System.out.println("Enter Ur Pin");
        int u_pin = ra.nextInt();
        atm t = new atm();
        int choice;
        if(u_pin==pin){
            do { 
                System.out.println("1.Check Balance\n2.Deposit\n3.Exit");
                System.out.print("Enter ur Choice(1/2/3): ");
                choice = ra.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Your Current Balance: "+t.getbalance());
                        break;
                    case 2:
                        System.out.print("Enter ur Amount to deposit: ");
                        int a = ra.nextInt();
                        t.deposit(a);
                        break;
                    case 3:
                        System.out.println("Logout from current session");
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
            } while (choice!=3);
        }
        else{
            System.out.println("Incorrect Pin!!");
        }

    }
}
class atm{
    private double balance = 1001.11;
    double getbalance(){
        return balance;
    }
    void deposit(int amt){
        balance+=amt;
        System.out.println("Amount deposited successfully");
    }
}