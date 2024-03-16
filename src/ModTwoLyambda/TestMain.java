package ModTwoLyambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestMain {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "seven", "one", "two", "three");


        TestComparator testComparator = new TestComparator();
        Collections.sort(arrayList, testComparator);
        System.out.println(arrayList);

        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        System.out.println(arrayList);

        arrayList.forEach(i -> System.out.print(i + " "));

        Stream<String> stream1 = arrayList.stream();
        stream1
                .map(i -> i.toUpperCase())
                .filter(i -> i.length() < 4)
                .forEach(System.out::println);

        int[] array = {1, 2, 3, 4, 5, 6, 8, 7};
        Stream<int[]> streamArray = Stream.of(array);
        Stream streamConcat = Stream.concat(streamArray, Stream.of(6, 7, 8, 9, 10, 11, 12, 13, 15, 14));
        streamConcat
                .distinct()
                .forEach(System.out::println);



    }
}
