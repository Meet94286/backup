import java.util.Scanner;
public class que {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("x");
        System.out.println("y");
        System.out.println("z");
        int a = input.nextInt();
        float f = input.nextFloat();
        double d = input.nextDouble();
        float x = (int) a;
        int y = (int) f;
        float z = (float) d;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}


