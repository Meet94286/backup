import java.util.Scanner;
public class S3 {
    public static void main(String[] args) {
        int n;
        String home = "";
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        switch (n) {
            case (1):
                home = "meet";
                break;

            case (2):
                home = "kosha";
                break;

            case (3):
                home = "hiii";
                break;

            case (4):
                home = "java";
                break;

            default:
                System.out.println("Number is greater than 4");
                break;

        }
            System.out.println(home);


    }
}











