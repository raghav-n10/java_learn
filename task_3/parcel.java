class parcel{
    public static void main(String[] args) {
        int ra[] = {1001,1002,1003,1004,1005};
        ra[3] = 1007;
        System.out.println("Updated Parcel Number: ");
        for (int i = 0; i < ra.length; i++) {
            System.out.println(ra[i]);
        }

    }
}