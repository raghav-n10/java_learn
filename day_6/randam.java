
import java.util.Random;

class randam{
    public static void main(String[] args) {
        Random ra = new Random();
        int a = ra.nextInt(19);
        double gaus = ra.nextGaussian();
        boolean b = ra.nextBoolean();
        System.out.println("Integer: "+a+"\n"+"Gaussian: "+gaus+"\n"+"Boolean Value: "+b);
    }
}