package com.jetpack.trc.view.registration;

import com.jetpack.trc.Main;
import com.jetpack.trc.model.user.Student;

import java.util.Scanner;

public class RegistrationResultStudent {
    public RegistrationResultStudent() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите номер Вашей группы");
        /**
         * variable "a" is your group number
         */
        int a = scanner.nextInt();

        System.out.println("Введите Ваше имя");
        /**
         * variable "name" is your name
         */
        String name = scanner1.nextLine();

        System.out.println("Введите Вашу фамилию");
        /**
         * variable "surName" is your surName
         */
        String surName = scanner1.nextLine();

        Main.students.put(Main.students.size() + 1, new Student(Main.students.size() + 1, a, name, surName));
        System.out.println("Регистрация прошла успешно!");
        System.out.println("Ваш ID: " + Main.students.size());
    }
}
