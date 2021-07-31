import java.util.Scanner;
public class S {
public static void main(String[] args) {
    int a111b  ;
    Scanner input = new Scanner(System.in);
    a111b = input.nextInt();
    switch (a111b) {
        case(1): {
            System.out.println("Preparing Cappuccino");
            break;
        }
        case(2):{
            System.out.println("Preparing Espresso");
            break;
        }
        case(3):{
            System.out.println("Preparing Latte");
            break;
        }
        case(4):{
            System.out.println("Preparing Milk");
            break;
        }
        default:{
            System.out.println("Drink not available");
            break;
        }

    }
    }
}