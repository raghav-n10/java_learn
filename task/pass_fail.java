
import java.util.Scanner;

class pass_fail{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ra = s.nextInt();
        if(ra>=40)
        System.out.println("Pass");
        else
        System.out.println("Fail");
    }
}