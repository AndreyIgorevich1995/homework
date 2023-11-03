package com.jetpack.trc.view.authorization;

import com.jetpack.trc.controller.ControllerAdministrator;

import java.util.Scanner;

public class ViewAuthorizationAdministrator {
//    private JLabel info;
//    private TextField textField;
//    private Button button;
    ControllerAdministrator controllerAdministrator = new ControllerAdministrator();
    private Scanner scanner;
    public ViewAuthorizationAdministrator() {
        System.out.println("Введите Ваш ID");
        scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(controllerAdministrator.printResult(a));
    }
}
