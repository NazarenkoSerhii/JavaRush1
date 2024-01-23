package TestString;

public class StringFormat {
    public static void main(String[] args) {
//        String name="Diego";
//        int age = 25;
//        int weight= 80;
//        String friends= "Amigo";
//        String s =String.format("name %s,age %d,weight %d,friends %s",name,age,weight,friends);
//        System.out.println(s);


        System.out.println(format("NSA", 10000));
    }
    public static String format(String name, int salary){
        String shablon = "Меня зовут %S. Я получаю %d$ в месяц";
        return String.format(shablon,name,salary);

    }

}
