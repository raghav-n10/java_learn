
import java.util.Scanner;

class number{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ra = s.nextInt();
        if(ra<0)
        System.out.println(ra+" is negative number");
        else if(ra==0)
        System.out.println(ra+" is zero");
        else
        System.out.println(ra+" is positive number");

    }
}