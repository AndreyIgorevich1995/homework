package com.jetpack.trc.view.authorization;

import com.jetpack.trc.model.exception.FalseAuthorizationException;
import com.jetpack.trc.model.exception.FalseStartException;

import java.util.Scanner;

public class ViewSelectAuthorization {
    private Scanner scanner;
    /**
     * if a student choose 1
     * if the English teacher choose 2
     * if the math teacher choose 3
     * if admin choose 4
     * @throws FalseAuthorizationException if you don't press either 1, 2, 3 or 4
     */
    public ViewSelectAuthorization() {
        System.out.println("Выберите Ваш статус");
        System.out.println("1 - Student");
        System.out.println("2 - TeacherEnglish");
        System.out.println("3 - TeacherMath");
        System.out.println("4 - Administrator");
        scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        try {
            if (a == 1) {
                new ViewAuthorizationStudent();
            } else if (a == 2) {
                new ViewAuthorizationTeacherEnglish();
            } else if (a == 3) {
                new ViewAuthorizationTeacherMath();
            } else if (a == 4) {
                new ViewAuthorizationAdministrator();
            } else {
                throw new FalseAuthorizationException(a);
            }
        } catch (FalseAuthorizationException e) {
            System.out.println("Надо было ввести 1, 2, 3 или 4. Было введено : " + a);
            System.out.println();
            new ViewSelectAuthorization();
        }
    }
}
