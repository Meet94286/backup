import java.util.Scanner;
public class Eif3 {

    public static void main(String[] args) {

        String name;
        int marks;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        marks = input.nextInt();
        if ((marks>100)) {
            System.out.println("The grade scored by " + name + " is A");
        }
        else if ((80<marks) && (marks<=100)) {
            System.out.println("The grade scored by " + name + " is B");
        }
        else if ((60<marks) && (marks<=80)) {
            System.out.println("The grade scored by " + name + " is C");
        }
        else if ((40<marks) && (marks<=60)) {
            System.out.println("The grade scored by " + name + " is D");
        }
        else if (marks<=40) {
            System.out.println("The grade scored by " + name + " is E");
        }
        else {
            System.out.println("The grade scored by " + name + " is F");
        }




    }
}