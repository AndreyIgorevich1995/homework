package com.jetpack.trc.view.authorization;

//import com.jetpack.trc.controller.ControllerTeacher;

import com.jetpack.trc.Main;
import com.jetpack.trc.controller.ControllerTeacherEnglish;
import com.jetpack.trc.model.tests.TestsEnglish;
import com.jetpack.trc.model.user.TeacherEnglish;
import com.jetpack.trc.model.user.TeacherMath;

import java.util.Scanner;

public class ViewAuthorizationTeacherEnglish {
    private Scanner scanner;
    private ControllerTeacherEnglish controllerTeacherEnglish = new ControllerTeacherEnglish();

    public ViewAuthorizationTeacherEnglish() {
        System.out.println("Введите Ваш ID");
        scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(controllerTeacherEnglish.printResult(a));
        System.out.println("Успеваемость Ваших студентов:");
        Main.teacherEnglish.get(a-1).toStringResults();
//        for (int i = 0; i < Main.teacherEnglish.size(); i++) {
//            if (Main.teacherEnglish.get(i).getID() == (a-1)) {
//                System.out.println("s");
//                Main.teacherEnglish.get(i).toStringResults();
//            }
//        }
    }
}

