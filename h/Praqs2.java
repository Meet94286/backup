import java.util.Scanner;
public class Praqs2 {
    public static void main(String[] args) {
        float  l;
        float  b;
        Scanner input = new Scanner(System.in);
        l = input.nextFloat();
        b = input.nextFloat();
        if (l == b) {
            System.out.println("Square");
        }
        else if ((l>b) && (l!=b))  {
            System.out.println("Rectangle");
        }


    }
}