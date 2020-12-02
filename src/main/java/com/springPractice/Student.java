package com.springPractice;

import java.util.List;

public class Student {



    private  int rollNo;
    private String name;
    private List<Integer> marks;

    public Student(int rollNo, String name, List<Integer> marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }


}
