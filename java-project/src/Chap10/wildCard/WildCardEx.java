package Chap10.wildCard;

import java.util.Arrays;

public class WildCardEx{
    public static void registerPerson(Course<?> t){
        System.out.println(t.getName() + ":" + Arrays.toString(t.getStudents()));
    }

    public static void registerPerson2(Course<? extends Student> t){
        System.out.println(t.getName() + ":" + Arrays.toString(t.getStudents()));
    }

    public static void registerPerson3(Course<? super Worker> t){
        System.out.println(t.getName() + ":" + Arrays.toString(t.getStudents()));
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인 과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<>("직장인 과정", 4);
        workerCourse.add(new Worker("직장인1"));

        Course<Student> StudentCourse = new Course<>("학생 과정", 4);
        StudentCourse.add(new Student("학생1"));
        StudentCourse.add(new HighStudent("고등학생1"));

        Course<HighStudent> HighStudentCourse = new Course<>("고등 학생 과정", 4);
        HighStudentCourse.add(new HighStudent("고등학생2"));


        registerPerson(personCourse);
        registerPerson(workerCourse);
        registerPerson(StudentCourse);
        registerPerson(HighStudentCourse);

        System.out.println("+++++++++++++++++++++++++++++++++++");

        //registerPerson2(personCourse); 타입 제한으로 인한 컴파일 오류 발생
        //registerPerson2(WorkerCourse); 타입 제한으로 인한 컴파일 오류 발생
        registerPerson2(StudentCourse);
        registerPerson2(HighStudentCourse);

        System.out.println("+++++++++++++++++++++++++++++++++++");

        registerPerson3(personCourse);
        registerPerson3(workerCourse);
        //registerPerson3(StudentCourse); 타입 제한으로 인한 컴파일 오류 발생
        //registerPerson3(HighStudentCourse); 타입 제한으로 인한 컴파일 오류 발생
    }
}
