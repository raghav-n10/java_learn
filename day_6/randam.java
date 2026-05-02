
import java.util.Arrays;
import java.util.Random;
class randam{
    public static void main(String[] args) {
        Random ra = new Random();
        int a = ra.nextInt(19);
        double gaus = ra.nextGaussian();
        boolean b = ra.nextBoolean();
        double d = ra.nextDouble();
        byte bt[] = new byte[5];
        ra.nextBytes(bt);

        System.out.println("Integer: "+a+"\n"+"Gaussian: "+gaus+"\n"+"Boolean Value: "+b+"\n"+"Double Value: "+d);
        System.out.println("Bytes value: "+Arrays.toString(bt));
    }
}