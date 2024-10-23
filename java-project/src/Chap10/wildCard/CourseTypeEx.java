package Chap10.wildCard;

public class CourseTypeEx {
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
    }
}
