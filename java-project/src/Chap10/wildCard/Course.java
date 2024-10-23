package Chap10.wildCard;

public class Course<T>{
    private String name;
    private T[] students;//Person[]

    public Course(String name, int capacity) {
        this.name = name;//입력받은 이름으로 초기화
        this.students = (T[])new Object[capacity];
    }
    public String getName() {
        return name;
    }
    public T[] getStudents() {
        return students;
    }

    void add(T t){
        for (int i = 0; i < students.length; i++){
            if (students[i] == null){
                students[i] = t;
                break;
            }
        }
    }
}
