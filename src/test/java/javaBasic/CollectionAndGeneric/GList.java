package javaBasic.CollectionAndGeneric;

public class GList<T> {

    private int capacity = 3;
    private int amount = 5;
    private Object[] array = new Object[capacity];
    private int current = 0;

    public GList(){
    }

    public GList(int capacity){
        this.capacity = capacity;
    }

    public void add(T numb){
        if (capacity <= current){
            Object[] tmpArray = new Object[capacity+amount];
            for (int i = 0; i < current; i++) {
                tmpArray[i] = array[i];
            }
            array = tmpArray;
            capacity+=amount;
        }
        array[current] = numb;
        current++;
    }

    public int size() {
        return current;
    }

    public void clear() {
        current = 0;
    }

    public T get(int i) {
        if (current <= i)
            throw new IndexOutOfBoundsException();
        return (T) array[i];
    }
}
