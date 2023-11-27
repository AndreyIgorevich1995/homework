package com.jetpack.trc;

import com.jetpack.trc.model.user.*;
import com.jetpack.trc.view.View;

import java.util.*;

/**
 *In this class the program starts
 */
public class Main {
    /**
     *These lists are user start lists
     */
    public static Map<Integer, Student> students = new HashMap<>();
    public static List<TeacherEnglish> teacherEnglish = new ArrayList();
    public static List<TeacherMath> teacherMaths = new ArrayList();
    public static List<Administrator> administrators = new ArrayList();


    public static void main(String[] args) {
        /**
         *These lists are user start lists
         */
        students.put(1, new Student(1, 1, "Igor", "Vasin"));
        students.put(2, new Student(2, 1, "Andrey", "Serov"));
        students.put(3, new Student(3, 2, "Andrey", "Orishin"));
        students.put(4, new Student(4, 2, "Petr", "Vorobiov"));
        students.put(5, new Student(5, 2, "Petr", "Otvorotov"));
        students.put(6, new Student(6, 2, "Petr", "Otvorotov"));
        students.put(7, new Student(7, 2, "Petr", "Otvorotov"));
        teacherEnglish.add(new TeacherEnglish(1, "Evgeniy", "Zeler"));
        teacherMaths.add(new TeacherMath(1, "Evgeniy", "Zeler"));
        administrators.add(new Administrator(1, "Evgeniy", "Zeler"));
        /**
         * This object start a message in the console
         */
        new View();
    }
}