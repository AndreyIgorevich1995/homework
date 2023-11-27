package com.jetpack.trc.view.registration;

import com.jetpack.trc.Main;
import com.jetpack.trc.model.user.TeacherMath;

import java.util.Scanner;

public class RegistrationResultTeacherMath {

    public RegistrationResultTeacherMath() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Ваше имя");
        /**
         * variable "name" is your name
         */
        String name = scanner.nextLine();

        System.out.println("Введите Вашу фамилию");
        /**
         * variable "surName" is your surName
         */
        String surName = scanner.nextLine();

        Main.teacherMaths.add(new TeacherMath(Main.teacherMaths.size() + 1, name, surName));
        System.out.println("Регистрация прошла успешно!");
        System.out.println("Ваш ID: " + Main.teacherMaths.size());
    }
}