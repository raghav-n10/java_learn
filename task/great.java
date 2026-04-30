
import java.util.Scanner;

class great{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int a = s.nextInt();
        if(r==a)
        System.out.println("Equal");
        else if(r>a)
        System.out.println(r+" is greater");
        else
        System.out.println(a+" is greater");
    }
}