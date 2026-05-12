package thefurturetesting.Core_Java_Basic.Tasks.Thurday12;

public class ReverseString {
    /*
    Creating a class named ReverseString.
    Main method.
Java starts execution from here.
Declaring a string variable.
name stores the value SEKHAR
Empty string created.
Used to store reversed output.
Explanation:
name.length() → gives total characters.
-1 because index starts from 0.
Loop starts from last character.
i-- means moving backward.
SEKHAR Index Values
Character	Index
S	0
E	1
K	2
H	3
A	4
R	5

Loop starts from index 5.
Explanation:
charAt(i) gets character at current index.
Characters added one by one.
     */

    public static void main(String[] args) {

//        // Original string
        String str ="Sekhar";

//        Empty string to store rev value/// Empty string to store reversed value
        String rev ="";

//         Loop starts from last character
        for(int i=str.length()-1;i>=0; i--){

//       Add each character to reverse string
            rev += str.charAt(i);
        }
        // Print reversed string
        System.out.println(rev);
    }
}
