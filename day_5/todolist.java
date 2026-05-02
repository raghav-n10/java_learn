import java.util.Scanner;
class todolist{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ur Task: ");
        String ra = s.nextLine();
        anaconda RA = new anaconda();
        RA.todo(ra);
    }
}
class anaconda{
    void todo(String ra){
        if(ra.isBlank()){
            System.out.println("Task Not Entered");
            return;
        }
        else
        System.out.println("Entered Task: "+ra);
    System.out.println("Thank You");
    }
}