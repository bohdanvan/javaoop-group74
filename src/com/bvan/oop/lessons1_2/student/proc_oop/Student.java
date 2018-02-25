package com.bvan.oop.lessons1_2.student.proc_oop;

/**
 * @author bvanchuhov
 */
public class Student { // DTO - data transfer object (very procedural approach)

    private String name;
    private String email;
    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", level=" + level +
                '}';
    }
}
