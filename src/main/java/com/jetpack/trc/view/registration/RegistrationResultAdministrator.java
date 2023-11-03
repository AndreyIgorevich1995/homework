package com.jetpack.trc.view.registration;

import com.jetpack.trc.Main;
import com.jetpack.trc.model.user.Administrator;
import com.jetpack.trc.model.user.Student;

import java.util.Scanner;

public class RegistrationResultAdministrator {


    public RegistrationResultAdministrator() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите Ваше имя");
        String name = scanner.nextLine();

        System.out.println("Введите Вашу фамилию");
        String surName = scanner.nextLine();

        Main.administrators.add(new Administrator(Main.administrators.size() + 1, name, surName));
        System.out.println("Регистрация прошла успешно!");
        System.out.println("Ваш ID: " + Main.administrators.size());
    }
}
