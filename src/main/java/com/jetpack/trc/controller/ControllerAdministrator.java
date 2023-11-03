package com.jetpack.trc.controller;

import com.jetpack.trc.Main;

public class ControllerAdministrator {
    public String printResult(int x) {
        StringBuilder a = new StringBuilder();
        a.append("Список студентов");
        a.append("\n");
        for (int i = 0; i < Main.students.size(); i++) {
            a.append(Main.students.get(i).toStringgg());
            a.append("\n");
        }

        a.append("Список преподавателей по английскому: ");
        a.append("\n");
        for (int i = 0; i < Main.teacherEnglish.size(); i++) {
            a.append(Main.teacherEnglish.get(i));
            a.append("\n");
        }
        a.append("Список преподавателей по математике: ");
        a.append("\n");
        for (int i = 0; i < Main.teacherMaths.size(); i++) {
            a.append(Main.teacherMaths.get(i));
            a.append("\n");
        }
    return a.toString();
    }
}
