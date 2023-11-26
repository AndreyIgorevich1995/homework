package com.jetpack.trc.view;

//import view.authorization.ViewSelectAuthorization;
//import view.registration.RegistrationResult;

import com.jetpack.trc.model.exception.FalseStartException;
import com.jetpack.trc.view.authorization.ViewSelectAuthorization;
import com.jetpack.trc.view.registration.RegistrationResult;

import java.util.Scanner;

//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;

public class View {
    //    private JButton registrationButton;
//    private JButton signInButton;
//    private JLabel info;
    private Scanner scanner;

    public View() {
        System.out.println("Введите '1', чтобы войти в систему или '2', чтобы зарегистрироваться");
        scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 1) {
            new ViewSelectAuthorization();
        } else if(a == 2){
            new RegistrationResult();
        } else {
            throw new FalseStartException(a);
        }
//        else {
//            new Exception();
//        }
    }

}