package thefurturetesting.Core_Java_Basic;

public class Polymorphism {

//    One method is behaving in multiple forms'
/*
Method Overloading/Compile ->Same Methods name and different parameters
Method Overriding/Runtime ->Child class changes in already present in the parent class


Method Overloading
        In Real time framework examples
            -public void click(By locator);
            -public void click(WebElment element);
            -public void click(String xpath);

 Method Overriding
        class BasePage{
        public void login(){
        System.out.println("Chrome browser");
        }
        }
        class SSOLoginPage extends BasePage{
        @Override
        public void login(){
        System.out.println("SSOChrome browser");
        }
        }

 */
}
