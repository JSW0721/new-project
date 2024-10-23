package Chap10.Implement;

public interface Storage<T> {
    void add(T item, int index);
    T get(int index);
}
