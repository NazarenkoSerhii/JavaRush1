package ModTwoTestGenerics;

import java.util.ArrayList;

public class ArrayToCollection {

    public   ArrayList<Integer> arrayToCollection(int[] array){
        ArrayList <Integer>arrayList = new ArrayList();
        for (int i=0;i<array.length;i++){
            if(array[i]%2==0){
                arrayList.add(array[i]);
            }
        }
        return arrayList;
    }
}
