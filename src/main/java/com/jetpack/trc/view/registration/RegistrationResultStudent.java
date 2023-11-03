package com.jetpack.trc.view.registration;

import com.jetpack.trc.Main;
import com.jetpack.trc.model.user.Student;

import java.util.Scanner;

public class RegistrationResultStudent {
//    private JLabel info;
//    private TextField textField;
//    private Button button;
//private Scanner scanner = new Scanner(System.in);
    public RegistrationResultStudent() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите номер Вашей группы");
//        scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Введите Ваше имя");
        String name = scanner1.nextLine();

        System.out.println("Введите Вашу фамилию");
        String surName = scanner1.nextLine();

        Main.students.put(Main.students.size()+1, new Student(Main.students.size() + 1, a, name, surName));
//        Main.students.add(new Student(Main.students.size() + 1, a));
        System.out.println("Регистрация прошла успешно!");
        System.out.println("Ваш ID: " + Main.students.size());
    }
}
