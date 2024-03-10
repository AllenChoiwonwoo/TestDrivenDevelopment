package javaBasic.CollectionAndGeneric;


import org.junit.jupiter.api.Test;

public class ListTest {

    @Test
    void objectListTest(){
        ObjectList list = new ObjectList() ;

        list.add(3);
        list.add(5);

        System.out.printf("size = %d\n", list.size());
        System.out.printf("get 1 = %d\n" , list.get(1));
        int numb1 = (Integer) list.get(0);
        System.out.println(numb1 );

        list.clear();

        System.out.printf("size = %d\n", list.size());
    }
    @Test
    void GenericListTest(){
        GList<Integer> list = new GList<>() ;

        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);

        System.out.printf("size = %d\n", list.size());
        System.out.printf("get 1 = %d\n" , list.get(1));
        int numb1 = list.get(0);
        System.out.println(numb1 );

        list.clear();

        System.out.printf("size = %d\n", list.size());
    }


}
