package javaBasic.CollectionAndGeneric;

public class ObjectList {

    private Object[] array = new Object[3];
    private int current = 0;

    public void add(Object numb){
        array[current] = numb;
        current++;
    }

    public int size() {
        return current;
    }

    public void clear() {
        current = 0;
    }

    public Object get(int i) {
        if (current <= i)
            throw new IndexOutOfBoundsException();
        return array[i];
    }
}
