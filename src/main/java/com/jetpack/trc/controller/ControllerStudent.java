package com.jetpack.trc.controller;

import com.jetpack.trc.Main;

public class ControllerStudent {
    public String printResult(int x) {
        Object object = new Object();
        for (int i = 1; i < Main.students.size() + 1; i++) {
            if (Main.students.get(i).getID() == x) {
                object = Main.students.get(i);
            }
        }
        return object.toString();
    }
}
