package com.jetpack.trc.view.authorization;

import com.jetpack.trc.Main;
import com.jetpack.trc.controller.ControllerTeacherMath;
import com.jetpack.trc.model.exception.IdException;

import java.util.Scanner;

public class ViewAuthorizationTeacherMath {
    private Scanner scanner;
    private ControllerTeacherMath controllerTeacherMath = new ControllerTeacherMath();

    public ViewAuthorizationTeacherMath() {
        System.out.println("Введите Ваш ID");
        scanner = new Scanner(System.in);
        /**
         * variable "a" is the user ID
         * @throws IdException if "There is no user with this ID"
         */
        int a = scanner.nextInt();
        try {
            if (Main.teacherMaths.size() < a || a <= 0) {
                throw new IdException();
            }
        } catch (IdException e) {
            System.out.println("Пользователь с таким ID отсутствует");
            System.out.println();
            new ViewAuthorizationTeacherMath();
        }
        System.out.println(controllerTeacherMath.printResult(a));
        System.out.println("Успеваемость Ваших студентов:");
        Main.teacherMaths.get(a - 1).toStringResults();
    }
}