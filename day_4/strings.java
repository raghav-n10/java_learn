class strings{
    public static void main(String[] args) {
        String a = "   ";
        String ra = new String("Maan Karate");
        System.out.println(ra);
        System.out.println(ra.length());
        System.out.println(ra.isEmpty());
        System.out.println(a.isBlank());

        //comparison
        System.out.println(ra.equals("Maan Karate"));
        System.out.println(ra.equalsIgnoreCase("maan karate"));
        System.out.println(ra.compareTo(a));
        System.out.println(ra.contains(" "));

        //Extraction
        System.out.println(ra.charAt(5));
        System.out.println(ra.substring(0, 5));
        System.out.println(ra.indexOf("M"));
        System.out.println(ra.lastIndexOf("a"));

        //Modification
        System.out.println(ra.trim());
        System.out.println(ra.strip());
        System.out.println(ra.repeat(2));
        System.out.println(ra.replace('a', 'o'));
        System.out.println(ra.toUpperCase());
        System.out.println(ra.toLowerCase());

    }
}