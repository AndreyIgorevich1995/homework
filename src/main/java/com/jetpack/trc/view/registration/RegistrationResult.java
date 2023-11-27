package com.jetpack.trc.view.registration;

import com.jetpack.trc.model.exception.FalseAuthorizationException;

import java.util.Scanner;

public class RegistrationResult {
    private Scanner scanner;
    /**
     * if a student choose 1
     * if the English teacher choose 2
     * if the math teacher choose 3
     * if admin choose 4
     * @throws FalseAuthorizationException if you don't press either 1, 2, 3 or 4
     */
    public RegistrationResult() {
        System.out.println("Выберите Ваш статус");
        System.out.println("1 - Student");
        System.out.println("2 - TeacherEnglish");
        System.out.println("3 - TeacherMath");
        System.out.println("4 - Administrator");
        scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 1) {
            new RegistrationResultStudent();
        } else if (a == 2) {
            new RegistrationResultTeacherEnglish();
        } else if (a == 3) {
            new RegistrationResultTeacherMath();
        } else if (a == 4) {
            new RegistrationResultAdministrator();
        } else {
            try {
                throw new FalseAuthorizationException(a);
            } catch (FalseAuthorizationException e) {
                System.out.println("Надо было ввести 1, 2, 3 или 4. Было введено : " + a);
                System.out.println();
                new RegistrationResult();
            }

        }
    }
}
