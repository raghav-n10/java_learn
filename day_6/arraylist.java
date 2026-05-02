import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> ra = new ArrayList<>();
        ra.add(18);
        ra.add(45);
        ra.add(7);
        ra.add(93);

        Integer[] a = ra.toArray(new Integer[0]);
        Arrays.sort(a);
        System.out.println("Sorting using array: "+Arrays.toString(a)); 

        Collections.sort(ra);
        System.out.println("Sorted Array: "+ra);
        System.out.println("Contains 45: "+ra.contains(45));
        
        System.out.println("Array Element: "+ra);
        ra.set(3,33);
        System.out.println("Modified Array: "+ra);
        ra.remove(2);
        System.out.println("Removed array: "+ra);
    }
}