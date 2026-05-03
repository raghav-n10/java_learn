class math{
    public static void main(String[] args) {
        int ra = 10;
        int ra1 = 20;
        int abs = -93;
        System.out.println("Absolute Value: "+Math.abs(abs));
        System.out.println("Minimum Value: "+Math.min(ra, ra1));
        System.out.println("Maximum Value: "+Math.max(ra, ra1));
        double ar = 25.78;
        System.out.println("Floor function: "+Math.floor(ar));
        System.out.println("Round function: "+Math.round(ar));
        System.out.println("Ceil function: "+Math.ceil(ar));
        double angle = 0;
        double radians = Math.toRadians(angle);
        System.out.println("Sine value: "+Math.sin(radians));
        System.out.println("Cosine value: "+Math.cos(radians));
        System.out.println("Tangent value: "+Math.tan(radians));

        System.out.println("Square Root Value: "+Math.sqrt(ar));
        System.out.println("Cube Root Value: "+Math.cbrt(ar));
        System.out.println("Power Value: "+Math.pow(4,2));
    }
}