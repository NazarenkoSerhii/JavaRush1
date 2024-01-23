package TestMap;

import java.util.*;

public class HashMapMain {
    public  static HashMap <String, String> hashMap = new HashMap<>();
    public static void addElementToHashMap(){
        hashMap.put("John", "40");
        hashMap.put("Sarah", "39");
        hashMap.put("Jack", "35");
    }
    public static void printElement(){
        for (String key:hashMap.keySet()){
            int value = Integer.valueOf(hashMap.get(key));
            System.out.println(key + " --> " + value);
        }
        System.out.println("=====================");
    }
    public static Integer getAverageMark(){
        int x = 0;
        for(String value:hashMap.values()){
            x+=Integer.valueOf(value);
        }
        return x/ hashMap.size();
    }
    public static void printElementNew(){
        for (Map.Entry<String,String > entry:hashMap.entrySet()){ // Map.Entry<String,String > можно заменить на var
            String key = entry.getKey();                           // (var entry:hashMap.entrySet())
            String value = entry.getValue();
            System.out.println(key+" --> "+value);
        }
    }
    public static void main(String[] args) {
        addElementToHashMap();
        printElement();
        System.out.println("Среднее значение --> "+getAverageMark());
        printElementNew();

        System.out.println("================================");

        System.out.println(hashMap.containsKey("John"));
        System.out.println(hashMap.size());
        System.out.println(hashMap.get("John"));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.entrySet());// Set<Map.Entry<String,String>> hashSet = new HashSet<>();

    }

}
