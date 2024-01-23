package TestMap;


import java.util.*;

public class TreeMapMain {


    public static void main(String[] args) {
        TreeMap<Person, String> treeMap = new TreeMap<>();

        treeMap.put(new Person("AAA", "AAAA"), "aaa");
        treeMap.put(new Person("BBB", "BBBB"), "bbb");
        treeMap.put(new Person("DDD", "DDDD"), "ddd");
        treeMap.put(new Person("CCC", "CCCC"), "ccc");


        for (Map.Entry<Person, String> entry : treeMap.entrySet()) {
            String key = String.valueOf(entry.getKey());
            String value = entry.getValue();
            System.out.println(key + " ---> " + value);
        }




    }


}

