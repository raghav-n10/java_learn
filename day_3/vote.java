class vote{
    public static void main(String[] args) {
        int age = 21;
        check_eligible(age);
    }
    static void check_eligible(int age){
        if (age<18){
            System.out.println("Not Eligible for voting");
        }
        else{
            System.out.println("Eligible for voting");
        }
    }
}