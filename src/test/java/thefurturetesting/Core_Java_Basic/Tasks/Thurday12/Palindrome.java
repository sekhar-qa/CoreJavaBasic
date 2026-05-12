package thefurturetesting.Core_Java_Basic.Tasks.Thurday12;

public class Palindrome {

    public static void main(String[] args) {

//        Original String
        String name ="MADAM";

//        Empty string to store the reverse value
        String rev ="";

//        Rev logic here
        for(int i = name.length()-1; i >= 0; i--){

            rev = rev + name.charAt(i);
        }
        // Compare original and reverse
        if(name.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
