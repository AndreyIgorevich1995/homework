package com.jetpack.trc.view.authorization;


import com.jetpack.trc.Main;
import com.jetpack.trc.controller.ControllerTeacherEnglish;
import com.jetpack.trc.model.exception.IdException;

import java.util.Scanner;

public class ViewAuthorizationTeacherEnglish {
    private Scanner scanner;
    private ControllerTeacherEnglish controllerTeacherEnglish = new ControllerTeacherEnglish();

    public ViewAuthorizationTeacherEnglish() {
        System.out.println("Введите Ваш ID");
        scanner = new Scanner(System.in);
        /**
         * variable "a" is the user ID
         * @throws IdException if "There is no user with this ID"
         */
        int a = scanner.nextInt();
        try {
            if (Main.teacherEnglish.size() < a || a <= 0) {
                throw new IdException();
            }
        } catch (IdException e) {
            System.out.println("Пользователь с таким ID отсутствует");
            System.out.println();
            new ViewAuthorizationTeacherEnglish();
        }
        System.out.println(controllerTeacherEnglish.printResult(a));
        System.out.println("Успеваемость Ваших студентов:");
        Main.teacherEnglish.get(a - 1).toStringResults();
    }
}

