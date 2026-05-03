import java.util.Arrays;
class lib{
    public static void main(String[] args) {
        int ra[] = {401,402,407,408,405,406};
        Arrays.sort(ra);
        System.out.println("Book ID's Sorted:");
        for (int i = 0; i < ra.length; i++) {
            System.out.println(ra[i]);
        }
    }
}