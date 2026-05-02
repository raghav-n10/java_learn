class str{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Ooty-Sabari");
        System.out.println("Main String: "+sb);
        sb.replace(0, 3, "Erod");
        System.out.println("Replaced string: "+sb);
        sb.reverse();
        System.out.println("Reversed String: "+sb);
        System.out.println(sb.capacity());
        sb.reverse();
        sb.insert(3, "y");
        System.out.println("Inserted String: "+sb);
        sb.delete(0, 2);
        System.out.println("Deleted String: "+sb);
        System.out.println("Character at index 7: "+sb.charAt(7));
        sb.trimToSize();
        System.out.println(sb.capacity());
    
    }
}