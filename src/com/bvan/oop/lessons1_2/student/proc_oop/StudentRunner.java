package com.bvan.oop.lessons1_2.student.proc_oop;

/**
 * @author bvanchuhov
 */
public class StudentRunner {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Taras");
        student.setEmail("taras@gmail.com");
        student.setLevel(10);

        System.out.println(student);
    }
}
