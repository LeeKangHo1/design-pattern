package ch05;

import ch05.teacher.HTMLTeacher;
import ch05.teacher.JavaTeacher;
import ch05.teacher.PythonTeacher;

// main
public class App {
    public static void main(String[] args) {
        JavaTeacher t1 = new JavaTeacher();
        t1.수업하기();

        PythonTeacher t2 = new PythonTeacher();
        t2.수업하기();

        HTMLTeacher t3 = new HTMLTeacher();
        t3.수업하기();
    }
}
