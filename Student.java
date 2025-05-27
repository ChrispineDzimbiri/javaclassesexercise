/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author USER
 */
public class Student extends Person {
    String studentId;
    String course;

    Student(String name, int age, String gender, String studentId, String course) {
        super(name, age, gender);
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}
