package thefurturetesting.Core_Java_Basic.Tasks.Thurday12;

public class DuplicateCharacters {

    public static void main(String[] args) {

//        Input String
        String name ="Sekhar reddy";

//        Convert String into characterarray
        char[] ch = name.toCharArray();

        System.out.println("Duplicated charaters are");

//        outer loop
        for(int i = 0; i < ch.length;i++){
//            Inner loop
            for(int j = i + 1; j < ch.length; j++){

//                // Compare characters
                if(ch[i] == ch[j]){

//                    Ignore space
                    if(ch[i] != ' '){

                        System.out.println(ch[j]);
                    }
                    break;
                }
            }
        }
    }
}
