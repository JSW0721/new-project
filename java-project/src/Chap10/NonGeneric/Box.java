package Chap10.NonGeneric;

public class Box {
    private Object object;
    public void set(Object object){
        this.object = object;
    }
    public Object get(){
        return this.object;
    }
}
