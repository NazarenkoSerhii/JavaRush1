package ModTwoLyambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {             // anonimniy class
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(); // list.of() не использовать =>> return immutable collection
        Collections.addAll(arrayList, "one", "two", "three", "one");
//        Collections.sort(arrayList,new MyCustomComparator());       // my comparator
        Collections.sort(arrayList, new Comparator<String>() {   // anonimniy class zamena  my comparatora
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        Comparator<String> stringComparator = (String a, String b) ->   // лямбда выражение для абстрактного метода
                a.length() - b.length();                                // compare    -> - arrow
        Collections.sort(arrayList, stringComparator);

        System.out.println(arrayList);

        //Consumer -  void someMethod(some value) ==  (value)->{ implementation }

        arrayList.forEach(i -> System.out.println(i)); //
        arrayList.forEach(System.out::println);        // "method reference ссылка на метод" - альтернативный вид записи

        Stream<String> stream = arrayList.stream();    // вариант 1
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Stream<int[]> arrStream = Stream.of(arr);       // вариант 2
        IntStream stream1 = Arrays.stream(arr);         // вариант 3

        //function -  T someMethod(T value) ==> (value) ->{return value}
        // intermediate method return object который implement interface Stream
        // terminal - return конечное значение,другого типа или void
        arrayList.stream().
                map(i -> i.toUpperCase())                                             // map - intermediate method
                .filter(i -> i.length() < 4)                     // predicate -  if(){} // filter - intermediate method
                .forEach(System.out::println);              // method reference     // foreach - terminal method
        // аналог
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).toUpperCase();                       // аналог
            if (arrayList.get(i).length() < 4) {
                System.out.println(arrayList.get(i));
            }
        }
        System.out.println("===========================");
        // stream concat - объединяет два стрима в один
        Stream<String> concatStream = Stream.concat(Stream.of("one", "two", "three", "four"),
                Stream.of("three", "four", "five"));
        concatStream
                .distinct()
                .forEach(System.out::println);
        System.out.println("===========================");

        //                .collect(Collectors.toList());              // safe to List

        // проверка на null  class Optional
        String s = null;
        Optional<String> sOptional = Optional.ofNullable(s);
        //System.out.println(sOptional.get());
        String str = sOptional.orElseThrow(()->new RuntimeException());
        System.out.println(str);
    }
}
