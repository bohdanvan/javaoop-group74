package com.bvan.oop.lessons1_2.student.proc;

/**
 * @author bvanchuhov
 */
public class StudentRunner {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Vlad";
        student.email = "vlad@gmail.com";
        student.level = 10;

        System.out.println(student);
    }
}
