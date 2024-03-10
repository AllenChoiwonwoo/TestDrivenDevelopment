package javaBasic.Generic;

import java.util.ArrayList;
import java.util.Arrays;

public class allentest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Integer[] array = new Integer[3];
        array[0] = 4;
        array[1] = 5;
        array[2] = 6;
        array = arrayList.toArray(array);
        System.out.println(array);
        Arrays.stream(array).toList().forEach(System.out::println);
    }
}
