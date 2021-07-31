import java.util.Scanner;
public class  IF2 {
    public static void main(String[] args) {
        int A;
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        if (A%2 == 0) {
            System.out.println("The number entered is even");
        }
        else {
            System.out.println("The number entered is odd");
        }
    }

}