
import java.util.Scanner;

class len{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ra = sc.nextLine();
        if(ra.length()<5){
            System.out.println("Short");
        }
        else{
            System.out.println("Long");
        }
    }
}