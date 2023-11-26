package com.jetpack.trc.view.authorization;

import com.jetpack.trc.model.exception.FalseAuthorizationException;
import com.jetpack.trc.model.exception.FalseStartException;
import com.jetpack.trc.model.user.TeacherMath;

import java.util.Scanner;

public class ViewSelectAuthorization {
    //    private JLabel info;
////    private TextField textField;
//    private Button buttonStudent;
//    private Button buttonTeacher;
//    private Button buttonAdministrator;
    private Scanner scanner;

    public ViewSelectAuthorization() {
        System.out.println("Выберите Ваш статус");
        System.out.println("1 - Student");
        System.out.println("2 - TeacherEnglish");
        System.out.println("3 - TeacherMath");
        System.out.println("4 - Administrator");
        scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 1) {
            new ViewAuthorizationStudent();
        } else if (a == 2) {
            new ViewAuthorizationTeacherEnglish();
        } else if (a == 3) {
            new ViewAuthorizationTeacherMath();
        } else if (a == 4) {
            new ViewAuthorizationAdministrator();
        }else {
            throw new FalseAuthorizationException(a);
        }
    }
}
