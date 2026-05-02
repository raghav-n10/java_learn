class cons{
    public static void main(String[] args) {
        con o = new con("Vishal");
        con o2 = new con();
        con o3 = new con(o);
        System.out.println(o.name);
        System.out.println(o3.name);
    }
}
class con{
    String name;
    con() {
        System.out.println("Hello");
    }
    con(String n) {
        name = n;
    }
    con(con j){
        name = j.name;
    }
    
}