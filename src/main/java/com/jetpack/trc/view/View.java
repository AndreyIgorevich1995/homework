package com.jetpack.trc.view;

import com.jetpack.trc.model.exception.FalseStartException;
import com.jetpack.trc.view.authorization.ViewSelectAuthorization;
import com.jetpack.trc.view.registration.RegistrationResult;

import java.util.Scanner;

public class View {
    private Scanner scanner;

    /**
     * To register a new user, press "1".
     * To authorize you need to press "2"
     * @throws FalseStartException if you don't press either 1 or 2
     */
    public View() {
        System.out.println("Введите '1', чтобы войти в систему или '2', чтобы зарегистрироваться");
        scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        try {
            if (a == 1) {
                new ViewSelectAuthorization();
            } else if (a == 2) {
                new RegistrationResult();
            } else {
                throw new FalseStartException(a);
            }
        } catch (FalseStartException e) {
            System.out.println("Надо было ввести 1 или 2. Было введено : " + a);
            System.out.println();
            new View();
        }
    }
}
