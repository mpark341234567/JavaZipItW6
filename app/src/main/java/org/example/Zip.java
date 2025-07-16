package org.example;

import java.util.List;
import java.util.ArrayList;

public class Zip<T> {
    public static <T> List<T> zipLists(List<T> list1, List<T> list2) throws IllegalArgumentException {
    //     if ((!list1.isEmpty()) && (!list2.isEmpty())) {
    //         Class<?> class1 = list1.get(0).getClass();
    //         Class<?> class2 = list2.get(0).getClass();
    //         if (!class1.equals(class2)) {
    //         throw new IllegalArgumentException("Both lists must be of the same type.");
    //     }
    // }
        List<T> zippedList = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < list1.size() | j < list2.size()) {
            if (i < list1.size()) {
                zippedList.add(list1.get(i));
                i++;
            }
            if (j < list2.size()) {
                zippedList.add(list2.get(j));
                j++;
            }
        }    
        return zippedList;
    }
}
