package com.jetpack.trc.controller;

import com.jetpack.trc.Main;
import com.jetpack.trc.model.user.Student;

import java.util.ArrayList;
import java.util.List;

public class ControllerRating {
    private List<Student> grades = new ArrayList<>();

    /**
     * in this method we fill in the list of students of the group(a)
     */
    public ControllerRating(int a) {
        for (int i = 1; i < Main.students.size() + 1; i++) {
            if (Main.students.get(i).getGroup() == a) {
                grades.add(Main.students.get(i));
            }
        }
    }

    /**
     * in this method the list of students is sorted
     */
    public static void rating(List<Student> grades, int leftIndex, int rightIndex) {
        if (grades.size() == 0 || leftIndex >= rightIndex) return;
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

    /**
     * this method displays a list of students to the console
     */

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