import  java.util.Scanner;
public class Eif {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        if ((n1<n2) && (n2<n3)) {
            System.out.println("The numbers entered are in increasing order");
        }
        else if ((n1>n2) && (n2>n3)) {
            System.out.println("The numbers entered are in decreasing order");
        }
        else {
            System.out.println("Please enter valid numbers");
        }

    }
}