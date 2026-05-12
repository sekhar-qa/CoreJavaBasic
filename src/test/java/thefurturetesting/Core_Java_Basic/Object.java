package thefurturetesting.Core_Java_Basic;

public class Object {

/*
Object is an instance of a class.
Objects help access class variables and methods

In our framework, we create page class objects dynamically during execution


For examples:

LoginPage object
DashboardPage object
HomePage object

From here without object creation, we cannot access non-static methods.

 */

    int a = 10;
    String name = "Sekhar";

    public void test(int a, String name){
        System.out.println("This is testing Objects");
    }

    public static void main(String[] args) {
        Object ob = new Object(); // Objects Creation using class name;

//        LoginPage loginpage = new LoginPage(driver);
//        loginPage.login("admin","admin123");
        ob.test(10,"Sk");


    }
}
