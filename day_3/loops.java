import java.util.Scanner;
class loops{
    public static void main(String[] args) {
        Scanner ra = new Scanner(System.in);
        int n;
        do { 
           n = ra.nextInt();
           System.out.println("User Input: "+n); 
        } while (n!=0);
        
    }
}

// while (n!=0) { 
//             n = ra.nextInt();
//             System.out.println("User Input: "+n); 
//         }