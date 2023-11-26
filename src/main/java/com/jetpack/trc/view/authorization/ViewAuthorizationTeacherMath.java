package com.jetpack.trc.view.authorization;

import com.jetpack.trc.Main;
import com.jetpack.trc.controller.ControllerTeacherMath;
import com.jetpack.trc.model.exception.IdException;
import com.jetpack.trc.model.user.TeacherEnglish;
import com.jetpack.trc.model.user.TeacherMath;

import java.util.Scanner;

public class ViewAuthorizationTeacherMath {
    private Scanner scanner;
    private ControllerTeacherMath controllerTeacherMath = new ControllerTeacherMath();

    public ViewAuthorizationTeacherMath() {
        System.out.println("Введите Ваш ID");
        scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(Main.teacherMaths.size()<a || a<=0){
            throw new IdException();
        }
        System.out.println(controllerTeacherMath.printResult(a));
        System.out.println("Успеваемость Ваших студентов:");
        Main.teacherMaths.get(a-1).toStringResults();
//        for (int i = 0; i < Main.teacherMaths.size(); i++) {
//            if (Main.teacherMaths.get(i).getID() == a-1) {
//                Main.teacherMaths.get(i).toStringResults();
//            }
//        }
    }
}