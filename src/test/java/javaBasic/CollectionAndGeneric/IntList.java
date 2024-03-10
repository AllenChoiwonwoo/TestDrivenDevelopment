package javaBasic.CollectionAndGeneric;

import java.time.chrono.MinguoDate;

public class IntList {

    private int[] array = new int[3];
    private int current = 0;

    public void add(int numb){
        array[current] = numb;
        current++;
    }

    public int size() {
        return current;
    }

    public void clear() {
        current = 0;
    }

    public int get(int i) {
        if (current <= i)
            throw new IndexOutOfBoundsException();
        return array[i];
    }
}
