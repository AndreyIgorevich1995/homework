package com.jetpack.trc.controller;

import com.jetpack.trc.Main;
import com.jetpack.trc.model.user.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ControllerRating {
    //    private List<Student> grades = new ArrayList<>();
    private List<Student> grades = new ArrayList<>();

    public ControllerRating(int a) {
        for (int i = 1; i < Main.students.size() + 1; i++) {
            if (Main.students.get(i).getGroup() == a) {
                grades.add(Main.students.get(i));
            }
        }
    }

    //    public static List<Student> rating(List<Student> grades) {
    public static void rating(List<Student> grades, int leftIndex, int rightIndex) {
        if (grades.size() == 0 || leftIndex >= rightIndex) return;

//        int leftIndex = 0;
//        int rightIndex = grades.size() - 1;
        int leftMarkerIndex = leftIndex;
        int rightMarkerIndex = rightIndex;
        float pivot = grades.get((leftIndex + rightIndex) / 2).getRating();


        while (leftMarkerIndex <= rightMarkerIndex) {
            while (grades.get(leftMarkerIndex).getRating() < pivot) leftMarkerIndex++;
            while (grades.get(rightMarkerIndex).getRating() > pivot) rightMarkerIndex--;
            if (leftMarkerIndex <= rightMarkerIndex) {
                Student tmp = grades.get(leftMarkerIndex);
                grades.set(leftMarkerIndex, grades.get(rightMarkerIndex));
                grades.set(rightMarkerIndex, tmp);
                leftMarkerIndex++;
                rightMarkerIndex--;
            }
        }
        if (leftIndex < rightMarkerIndex) rating(grades, leftIndex, rightMarkerIndex);
        if (rightIndex > leftMarkerIndex) rating(grades, leftMarkerIndex, rightIndex);
    }

    //    public List<Student> rating(Map<Integer, Student> student, int a/*, int leftBorder, int rightBorder*/) {
    /*public static List<Student> rating(List<Student> grades*//*, int a, int leftBorder, int rightBorder*//*) {
        int leftBorder = 0;
//        int rightBorder = grades.size();
        int rightBorder = grades.size() - 1;
        int leftMarker = leftBorder;
//        int rightMarker = rightBorder - 1;
        int rightMarker = rightBorder;
        float pivot = grades.get((leftMarker + rightMarker) / 2).getRating();
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (grades.get(leftMarker).getRating() < pivot) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (grades.get(rightMarker).getRating() > pivot) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (grades.get(leftMarker).getRating() <= grades.get(rightMarker).getRating()) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (grades.get(leftMarker).getRating() < grades.get(rightMarker).getRating()) {
                    Student tmp = grades.get(leftMarker);
                    grades.set(leftMarker, grades.get(rightMarker));
                    grades.set(rightMarker, tmp);
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (grades.get(leftMarker).getRating() <= grades.get(rightMarker).getRating());

        // Выполняем рекурсивно для частей
//        if (leftMarker < rightBorder) {
//            rating(student, a, leftMarker, rightBorder);
//        }
//        if (leftBorder < rightMarker) {
//            rating(student, a, leftMarker, rightBorder);
//        }
//        if (leftMarker < rightBorder) {
        if (grades.get(leftMarker).getRating() < grades.get(rightBorder).getRating()) {
//            rating(grades, a);
            rating(grades);
        }
//        if (leftBorder < rightMarker) {
        if (grades.get(leftBorder).getRating() < grades.get(rightMarker).getRating()) {
//            rating(grades, a);
            rating(grades);
        }
        return grades;
    }*/

    public void printRating() {
        for (int i = 0; i < grades.size(); i++) {
            grades.get(i).toStringgg();
            System.out.println("рейтинг студента, ID которого: " + grades.get(i).getID() + ": " + grades.get(i).getRating());
        }
    }

    public List<Student> getGrades() {
        return grades;
    }

    public void setGrades(List<Student> grades) {
        this.grades = grades;
    }
}