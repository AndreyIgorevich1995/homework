package com.jetpack.trc.controller;

import com.jetpack.trc.Main;
import com.jetpack.trc.model.user.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ControllerRating {
    private List<Student> grades = new ArrayList<>();

    public List<Student> rating(Map<Integer, Student> student, int a/*, int leftBorder, int rightBorder*/) {
//        List<Student> grades = new ArrayList<>();
        for (int i = 1; i < student.size(); i++) {
            if (Main.students.get(i).getGroup() == a) {
                grades.add(Main.students.get(i));
            }
        }
        int leftBorder = 0;
        int rightBorder = grades.size() - 1;
        int leftMarker = leftBorder;
        int rightMarker = rightBorder - 1;
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
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    Student tmp = grades.get(leftMarker);
                    grades.set(leftMarker, grades.get(rightMarker));
                    grades.set(rightMarker, tmp);
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
//        if (leftMarker < rightBorder) {
//            rating(student, a, leftMarker, rightBorder);
//        }
//        if (leftBorder < rightMarker) {
//            rating(student, a, leftMarker, rightBorder);
//        }
        if (leftMarker < rightBorder) {
            rating(student, a);
        }
        if (leftBorder < rightMarker) {
            rating(student, a);
        }
        return grades;
    }

    public void printRating() {
        for (int i = 0; i < grades.size(); i++) {
            grades.get(i).toStringgg();
            System.out.println("рейтинг" + grades.get(i).getRating());
        }
    }

    public List<Student> getGrades() {
        return grades;
    }

    public void setGrades(List<Student> grades) {
        this.grades = grades;
    }
}