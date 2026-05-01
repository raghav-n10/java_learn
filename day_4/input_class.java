import java.util.Scanner;
class input_class{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ur Name: ");
        String ra = s.nextLine();
        System.out.println("Enter ur Age: ");
        int ra1 = s.nextInt();
        System.out.println("Enter ur Mobile No: ");
        long ra2 = s.nextLong();
        s.nextLine();
        System.out.println("Enter ur email address: ");
        String ra3 = s.nextLine();
        System.out.println("Enter ur Salary: ");
        double ra4 = s.nextDouble();

        System.out.println("User Info");
        System.out.println("Name: "+ra);
        System.out.println("Age: "+ra1);
        System.out.println("Mobile No: "+ra2);
        System.out.println("Email Address: "+ra3);
        System.out.println("Salary: "+ra4);
    }
}