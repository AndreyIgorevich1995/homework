package com.jetpack.trc.view.authorization;

import com.jetpack.trc.Main;
import com.jetpack.trc.controller.ControllerAdministrator;
import com.jetpack.trc.model.exception.IdException;

import java.util.Scanner;

public class ViewAuthorizationAdministrator {
    ControllerAdministrator controllerAdministrator = new ControllerAdministrator();
    private Scanner scanner;

    public ViewAuthorizationAdministrator() {
        System.out.println("Введите Ваш ID");
        scanner = new Scanner(System.in);
        /**
         * variable "a" is the user ID
         * @throws IdException if "There is no user with this ID"
         */
        int a = scanner.nextInt();
        try {
            if (Main.administrators.size() < a || a <= 0) {
                throw new IdException();
            }
        } catch (IdException e) {
            System.out.println("Пользователь с таким ID отсутствует");
            System.out.println();
            new ViewAuthorizationAdministrator();
        }
        System.out.println(controllerAdministrator.printResult(a));
    }
}
