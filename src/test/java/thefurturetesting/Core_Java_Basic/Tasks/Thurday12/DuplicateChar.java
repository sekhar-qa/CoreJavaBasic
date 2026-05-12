package thefurturetesting.Core_Java_Basic.Tasks.Thurday12;

public class DuplicateChar {

    public static void main(String[] args) {


        String name ="SEKHAR REDDY";

         char[] ch = name.toCharArray();

        System.out.println("Duplicate charater values are:");

        for(int i = 0; i < ch.length; i++){

            for(int j =i+1;j < ch.length; j++){

                if(ch[i] == ch[j]){

                    if(ch[i] != ' '){

                        System.out.println(ch[j]);
                    }
                    break;
                }
            }
        }
    }
}
