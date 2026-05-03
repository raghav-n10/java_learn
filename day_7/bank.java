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
                System.out.println("1.Check Balance\n2.Deposit\n3.Withdraw\n4.Exit");
                System.out.print("Enter ur Choice(1/2/3/4): ");
                choice = ra.nextInt();
                switch (choice) {
                    case 1 ->
                        System.out.println("Your Current Balance: "+t.getbalance());  
                    case 2 ->{
                        System.out.print("Enter ur Amount to deposit: ");
                        int a = ra.nextInt();
                        t.deposit(a);
                    }
                    case 3 ->{
                        System.out.print("Enter ur Amount to withdraw: ");
                        int a = ra.nextInt();
                        t.withdraw(a);
                    }  
                    case 4 ->
                        System.out.println("Logout from current session");   
                    default ->
                        System.out.println("Invalid Choice");      
                }
            } while (choice!=4);
        }
        else{
            System.out.println("Incorrect Pin!!");
        }
    }
}
class atm{
    private double balance = 1001;
    double getbalance(){
        return balance;
    }
    void deposit(int amt){
        balance+=amt;
        System.out.println("Amount deposited successfully");
    }
    void withdraw(int amt) {
        if(balance>=amt){
            balance-=amt;
            System.out.println("Take the amount in the dashboard");
        }
        else{
            System.out.println("Insufficient Balance");
        }
        
    }
}