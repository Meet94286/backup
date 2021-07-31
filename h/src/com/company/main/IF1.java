import java.util.Scanner;
public class  IF1 {
    public static void main(String[] args) {
        int A;
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        if (A<0) {
            System.out.println("The number entered is negative");
        }
        else {
            System.out.println("The number entered is positive");
        }
    }

}

