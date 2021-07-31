import java.util.Scanner;
public class S2 {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if(number == 1) {
            System.out.println("Hufflepuff");
        }
        else if(number == 2) {
            System.out.println("Gryffindor");
        }
        else if(number == 3) {
            System.out.println("Slytherin");
        }
        else if(number == 4) {
            System.out.println("Ravenclaw");
        }
        else {
            System.out.println("Number is greater than 4");
        }





    }
}

