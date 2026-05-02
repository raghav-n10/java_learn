import java.util.Scanner;
class arrays{
    public static void main(String[] args) {
        int ra[] = new int[5];
        int temp;
        ra[0]=1;ra[1]=3;ra[2]=4;ra[3]=2;ra[4]=5;
        System.out.println("Array: ");
        for (int i = 0; i <ra.length; i++) {
            System.out.println(ra[i]);
        }
        ra[1]=18;
        System.out.println("Modified Array: ");
        for (int i = 0; i <ra.length; i++) {
            System.out.println(ra[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target element: ");
        int ra1 = sc.nextInt();
        int c=0;
        for (int i = 0; i < ra.length; i++){
            if(ra1 == ra[i]){
                System.out.println("Index pos of target: "+i);
                c++;
            }
            
        }
        if(c==0){System.out.println("Target not found");}
        
        
        for (int a = 0; a < ra.length; a++){
            for (int j = a; j < ra.length; j++){
                if(ra[a]>ra[j]){
                    temp = ra[a];
                    ra[a] = ra[j];
                    ra[j] = temp;
                }
        }
        }
        System.out.println("Sorted Array: ");
        for (int i = 0; i <ra.length; i++) {
            System.out.println(ra[i]+" ");
        }

    }
}