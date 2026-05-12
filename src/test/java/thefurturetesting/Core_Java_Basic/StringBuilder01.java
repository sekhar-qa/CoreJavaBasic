package thefurturetesting.Core_Java_Basic;

public class StringBuilder01 {



/*
Why we StringBuilder
    Faster
    Better performance
    Used when frequent modifications


 */



//    StringBuilder is mutable.
//    Mutable means data can change without object creation.

    public static void main(String[] args) {


        String name ="Sekhar";
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Selenium");

        System.out.println(sb);


//        StringBuilder sb1 = new StringBuilder();
//        sb1.append("Test Started\n");
//        sb1.append("Login Successully\n");
//        sb1.append("Dashboard verification");
//
//        System.out.println(sb1);

    }
}
