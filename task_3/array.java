import  java.util.Arrays;
class array{
    public static void main(String[] args) {
        int original[] = {1,2,3,4,5};
        int clo[] = original.clone();
        int new1[] = new int[original.length];
        System.out.println("Cloned Array: ");
        System.out.println(Arrays.toString(clo));
        System.out.println("array copy method: ");
        System.arraycopy(original, 0, new1, 0, 5);
        System.out.println(Arrays.toString(new1));
        System.out.println("array copyOf method: ");
        int arr2[] = Arrays.copyOf(original, 5);
        System.out.println(Arrays.toString(arr2));
    }
}