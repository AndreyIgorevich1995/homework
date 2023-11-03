package com.jetpack.trc.view.registration;
//import com.jetpack.trc.Main;
//import model.Administrator;
//import model.Teacher;
//import model.User;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;

import com.jetpack.trc.Main;
import com.jetpack.trc.model.user.Administrator;
//import com.jetpack.trc.model.user.Teacher;
import com.jetpack.trc.model.user.TeacherEnglish;
import com.jetpack.trc.model.user.TeacherMath;

import java.util.Scanner;

public class RegistrationResult {
    //    private JLabel info;
//    private JButton teacher;
//    private JButton student;
//    private JButton administrator;
    private Scanner scanner;

    public RegistrationResult() {
        System.out.println("Выберите Ваш статус");
        System.out.println("1 - Student");
        System.out.println("2 - TeacherEnglish");
        System.out.println("3 - TeacherMath");
        System.out.println("4 - Administrator");
        scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 1) {
            new RegistrationResultStudent();
        } else if (a == 2) {
            new RegistrationResultTeacherEnglish();
        } else if (a == 3) {
            new RegistrationResultTeacherMath();
        } else if (a == 4) {
            new RegistrationResultAdministrator();
        }
    }
}
