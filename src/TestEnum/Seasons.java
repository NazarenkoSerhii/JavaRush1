package TestEnum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Seasons {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;
    public static List<Seasons> asList(){
        ArrayList<Seasons> list = new ArrayList<>();
        Collections.addAll(list,values());
        return list;
    }

}
