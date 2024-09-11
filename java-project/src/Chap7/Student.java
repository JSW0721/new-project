package Chap7;

public class Student extends Person {
    //Student()
    //Super() => Person()
    /*
    * Student()
    * {super();
    * }
    * */
    int StudentNo;

    Student(String name, String snn,int StudentNo){
        super(name,snn);
        this.StudentNo = StudentNo;
    }
}
