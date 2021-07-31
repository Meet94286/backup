import java.util.Scanner;
public class Praqs5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double income = scan.nextDouble();
        int age = scan.nextInt();
        double Tax = 0.0;
        int Taxrate = 0;
        if((income<=250000) && (age>=80))
        {
            Taxrate = 0;
        }
        if ((income>=250001) && (income<=300000))
        {
            if (age < 60) {
                Taxrate = 10;
            } else {
                Taxrate = 0;
            }
        }
        if ((income>=300001) && (income<=500000)) {
            if (age < 80) {
                Taxrate = 10;
            } else {
                Taxrate = 0;
            }
        }
        if ((500001<=1000000) && (age<=80)) {
            Taxrate = 20;
        }
        if ((income>=1000000) && (age<=80)) {
            Taxrate = 30;
        }
        if (age<60) {
            if(income<250000) {
                Taxrate = 0;
            }
            else if ((income>=250000) && (income<500000)) {
                Taxrate = 10;
            }
            else if ((income>=500001) && (income<=1000000)) {
                Taxrate = 20;
            }
            else {
                Taxrate = 0;
            }

        }
        else {
            System.out.println("Entered income is 1 crore or entered age is greater than 60");
        }
        switch (Taxrate) {
            case (0):
                Tax = 0;
                break;
            case (10):
                Tax = 0.10 * (500000- 250000)	;
                break;
            case (20):
                Tax =(0.10 * (500000- 250000)) + (0.20 * (income - 500000));
                break;
            default:
                Tax = 0;
                break;
        }
        System.out.println(Tax);
        scan.close();


    }
}

