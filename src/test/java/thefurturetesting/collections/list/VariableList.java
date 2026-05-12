package thefurturetesting.collections.list;

import java.util.ArrayList;
import java.util.List;

public class VariableList {

    public static void main(String[] args) {

/*
Collections is stored multiple data dynamically

In List
    Allows duplicate values
    Stores order data
    maintaince insertion order
 */
        List<String> name = new ArrayList<>();
        name.add("Sekhar");
        name.add("Sekhar");
        name.add("123");
        name.add("QA");
        name.add("software");

        System.out.println(name);

    }


}
