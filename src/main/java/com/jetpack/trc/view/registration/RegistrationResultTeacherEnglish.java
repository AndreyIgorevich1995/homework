package com.jetpack.trc.view.registration;

import com.jetpack.trc.Main;
import com.jetpack.trc.model.user.TeacherEnglish;
import com.jetpack.trc.model.user.TeacherMath;

import java.util.Scanner;

public class RegistrationResultTeacherEnglish {


    public RegistrationResultTeacherEnglish() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Ваше имя");
        String name = scanner.nextLine();

        System.out.println("Введите Вашу фамилию");
        String surName = scanner.nextLine();

        Main.teacherEnglish.add(new TeacherEnglish(Main.teacherEnglish.size() + 1, name, surName));
        System.out.println("Регистрация прошла успешно!");
        System.out.println("Ваш ID: " + Main.teacherEnglish.size());
    }
}