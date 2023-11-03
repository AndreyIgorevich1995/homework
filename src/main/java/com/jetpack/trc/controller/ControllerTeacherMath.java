package com.jetpack.trc.controller;

import com.jetpack.trc.Main;

public class ControllerTeacherMath {
    public String printResult(int x) {
        Object object = new Object();
        for (int i = 0; i < Main.teacherMaths.size(); i++) {
            if (Main.teacherMaths.get(i).getID() == x) {
                object = Main.teacherMaths.get(i);
            }
        }
        return object.toString();
    }
}