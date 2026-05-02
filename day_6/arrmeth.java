import  java.util.Arrays;
class arrmeth{
    public static void main(String[] args) {
        int original[] = {1,3,2,5,4};
        int clo[] = original.clone();
        int new1[] = new int[original.length];
        Arrays.sort(original);
        System.out.println("Sorted Array: "+Arrays.toString(original));

        

        System.out.println("Cloned Array: ");
        // for (int i = 0; i < clo.length; i++) {
        //     System.out.println(clo[i]);
        // }
        System.out.println(Arrays.toString(clo));
        System.out.println("array copy method: ");
        System.arraycopy(original, 2, new1, 1, 3);
        // for (int i = 0; i < new1.length; i++) {
        //     System.out.println(new1[i]);
        // }
        System.out.println(Arrays.toString(new1));
        System.out.println("array copyOf method: ");
        int arr2[] = Arrays.copyOf(original, 2);
        // for (int i = 0; i < arr2.length; i++) {
        //     System.out.println(arr2[i]);
        // }
        System.out.println(Arrays.toString(arr2));
    }
}