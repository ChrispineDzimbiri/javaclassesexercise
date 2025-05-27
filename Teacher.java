/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author USER
 */
public class Teacher extends Person {
    String employeeId;
    String subject;

    Teacher(String name, int age, String gender, String employeeId, String subject) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.subject = subject;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Subject: " + subject);
    }
}
