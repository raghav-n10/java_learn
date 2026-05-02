import java.util.Scanner;
class todo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the No of Task: ");
        int t = s.nextInt();
        s.nextLine(); 
        String alltask = "";
        for (int i = 1; i <= t; i++) {
            System.out.print("Enter Task " + i + " : ");
            String str = s.nextLine(); 
            alltask = alltask + i + ". " + str + "\n";
        }
        System.out.println("\nYour to-do list:");
        System.out.println(alltask);
    }
}