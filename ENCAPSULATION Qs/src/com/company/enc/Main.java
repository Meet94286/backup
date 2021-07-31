package com.company.enc;

public class Main {
    public static void main(String[] args) {
/*Q1  /*nt[] arr = ArrayBuilder.getArray(10, 20, 30, 40);
        for (int ele: arr) {
            System.out.println(ele);  */
PaymentService OnlinePaymentService = new PaymentService(){
    public String pay(int money) {
        return "paid " + money + " " + "rupees online";
    }
};
        System.out.println(OnlinePaymentService.pay(1000));
}}








       /* Dog dog = new Dog(4, 2, "BILLI");
        System.out.println(dog.details());
        System.out.println(dog.walk());
        dog.walk();
        dog.eat();
        dog.jump();
        dog.activity();
        Dog dog1 = new Dog();
        dog1.jump();
        operator add = new operator() {
            @Override
            public int operate(int a  , int b) {
                return a + b;
            }
        };
        operator sub = new operator() {
            @Override
            public int operate(int a, int b) {
               return a - b;
            }
        };
        System.out.println(sub.operate(50,6));*/






       /* String A = "1234";
        printPermutn(A, " ");

    }

    /*    //C1
       /* System.out.println(CalcUtil.add(10,20));
        System.out.println(CalcUtil.sub(10,5));
        System.out.println(CalcUtil.mul(10,20));
        System.out.println(CalcUtil.div(10,5));*/

        //C2
           /*Order order = new Order(2, "meet");
        System.out.println(order.getId());
        System.out.println(order.getName());*/

        //C3
              /* Table table = new Table();
        Table.Row row0 = new Table.Row(2, "meet");
        Table.Row row1 = new Table.Row(3, "arjun");
        Table.Row row2 = new Table.Row(4, "keyur");

        table.addRow(row0);
        table.addRow(row1);
        table.addRow(row2);

        Table.Row row;

       // row = table.getRow(0);

        row = table.getRow(0);
        System.out.println("Row Number: " + row.getRowNumber() + ", Row Data: " + row.getData());
        row = table.getRow(1);
        System.out.println("Row Number: " + row.getRowNumber() + ", Row Data: " + row.getData());
        row = table.getRow(2);
        System.out.println("Row Number: " + row.getRowNumber() + ", Row Data: " + row.getData());*/

       /* Rectangle rectangle = new Rectangle(5, 7);
        int area  = (rectangle.getLength()  * rectangle.getBreath());
        System.out.println(area);
        rectangle.setLength(50);
        rectangle.setBreath(60);
        //System.out.println(rectangle.getBreath());
        //System.out.println(rectangle.getLength());
        int area2  = (rectangle.getLength()  * rectangle.getBreath());
        System.out.println(area2);*/



static void printPermutn(String str, String ans){
        if (str.length() == 0){
            System.out.print(ans + "");
            return;
        }
        for (int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            String ros = str.substring(0,i) + str.substring(i+1);
            printPermutn(ros,ans + ch);
        }
    }}








    /*{

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);


            // Recurvise call
            printPermutn(ros, ans  + ch);
        }
    }

    // Driver code
    public static void main(String[] args) {
    String s = "A123";
        printPermutn(s, "");
        //System.out.println(s);
    }*/

