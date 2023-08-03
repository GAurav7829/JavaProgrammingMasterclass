package com.JavaProgrammingMasterclass._4classesInheritance;

import com.JavaProgrammingMasterclass._4classesInheritance.record.Student;

public class _03RecordExample {
    public static void main(String[] args) {
        Student student = new Student("1","grv");

        System.out.println(student);

        String id = student.id();
        System.out.println(id);
        String name = student.name();
        System.out.println(name);

    }
}
