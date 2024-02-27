package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericTest {

    public static void main(String[] args) {
//        List stringList = new ArrayList<>();
//        stringList.add("1");
//        String result = stringList.get(0);

        List<String> stringList2 = new ArrayList<>();
        stringList2.add("1");
        String result2 = stringList2.get(0);

        Object[] objects = new Integer[1];

//        List<Objects> objects = new ArrayList<Integer>(); // ERROR

    }
    class Noodle {

    }
    class Ramen extends Noodle {

    }
    class Coke {

    }

    class NoodleCategory<T> { // 현재는 아무 객체나 사용될 수 있다.
        private T t;
        public void set(T t){
            this.t = t;
        }
        public T get(){
            return t;
        }

        public <T> void printClassName(T t){
            System.out.println("클래스 필드 정의된 타입 "+ this.t.getClass().getName());
            System.out.println("제네릭 메서드에 정의된 타입 "+ t.getClass().getName());

        }
    }

    class NoodleCategory2<T extends Noodle> { // ramen 은 가능, coke 는 불가능
        private T t;
        public void set(T t){
            this.t = t;
        }
        public T get(){
            return t;
        }
    }
}
