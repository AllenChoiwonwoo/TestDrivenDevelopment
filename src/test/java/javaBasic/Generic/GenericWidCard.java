package javaBasic.Generic;

public class GenericWidCard {

    class Category<T> {
        private T t;
        public void set(T t){
            this.t = t;
        }
        public T get(){
            return t;
        }
    }

}
