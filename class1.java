class class1{
    public static void main(String[] args) {
        english a = new english();
        a.add();
        System.out.println(a.a);
        System.out.println(english.s);
    }
}

class english{
    int a = 20;
    static String s = "I am Antman";
    void add(){
        int a = 10;
        System.out.println(a);
    }
}
