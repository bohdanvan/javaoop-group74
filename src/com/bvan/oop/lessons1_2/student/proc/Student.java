package com.bvan.oop.lessons1_2.student.proc;

/**
 * @author bvanchuhov
 */
public class Student {

    public String name;
    public String email;
    public int level;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", level=" + level +
                '}';
    }
}
