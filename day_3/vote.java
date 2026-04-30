
import java.util.Scanner;

class vote{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if (age<18){
            System.out.println("Not Eligible for voting");
        }
        else{
            System.out.println("Eligible for voting");
        }
        
    }
}