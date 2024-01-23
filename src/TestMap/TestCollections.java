package TestMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5);
        ArrayList<Integer> listCopy = new ArrayList<>();
        Collections.addAll(listCopy, 1,2,3,4,5,7,8,9,10);
        Collections.copy(listCopy,list);
        Collections.reverse(listCopy);
//        Collections.sort(list);

        Collections.replaceAll(listCopy,3,5);

              for (int i : listCopy)
            System.out.print(i+ " ");
        System.out.println();
              Collections.sort(listCopy);
              for (int i : listCopy)
            System.out.print(i+ " ");
    }
}