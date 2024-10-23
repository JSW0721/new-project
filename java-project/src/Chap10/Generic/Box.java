package Chap10.Generic;

public class Box<T>{
    private T object;
    public void set(T object){
       this.object = object;
    }
    public T get(){
        return this.object;
    }
    public Box<T> boxing(T t) {
        return null;
    }
}
