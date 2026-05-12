package thefurturetesting.collections.set;

import java.util.HashSet;
import java.util.Set;

public class Set_Variable {

    public static void main(String[] args) {

        Set<String> data = new HashSet<>();

        data.add("Sekhar");
        data.add("Sekhar");
        data.add("Greesh");
        data.add("Bishwajit");
        System.out.println(data.size());
        System.out.println(data);
    }
}
