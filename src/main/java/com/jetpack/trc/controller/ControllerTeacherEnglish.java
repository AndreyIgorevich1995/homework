package com.jetpack.trc.controller;

import com.jetpack.trc.Main;

public class ControllerTeacherEnglish {
    /**
     * here the TeacherEnglish returns with ID = x
     */
    public String printResult(int x) {
        Object object = new Object();
        for (int i = 0; i < Main.teacherEnglish.size(); i++) {
            if (Main.teacherEnglish.get(i).getID() == x) {
                object = Main.teacherEnglish.get(i);
            }
        }
        return object.toString();
    }
}
