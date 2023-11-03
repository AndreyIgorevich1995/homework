package com.jetpack.trc.model.user;

import com.jetpack.trc.Main;
import com.jetpack.trc.controller.ControllerResults;

import java.util.*;

public class TeacherMath /*extends Teacher */{
    private String name;
    private String surname;
    private int ID;
    private Map<Integer, List<Integer>> resultsTest1Math;
    private Map<Integer, List<Integer>> resultsTest2Math;
    private Map<Integer, List<Integer>> resultsTest3Math;
    private List<Map> totalResult;

    public TeacherMath(int ID, String name, String surname) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
//        super(ID, name, surname);
        for (int i = 1; i <= Main.students.size(); i++) {
            List<Integer> x = new ArrayList<>();

            List<Integer> y1 = new ArrayList<>();
            y1 = Main.students.get(i).getResultsTestMath1();

            List<Integer> y2 = new ArrayList<>();
            y1 = Main.students.get(i).getResultsTestMath2();

            List<Integer> y3 = new ArrayList<>();
            y1 = Main.students.get(i).getResultsTestMath3();

//            int[] y1 = new int[Main.students.get(i).getResultsTestMath1().length];
//            y1 = Main.students.get(i).getResultsTestMath1();
//
//            int[] y2 = new int[Main.students.get(i).getResultsTestMath2().length];
//            y2 = Main.students.get(i).getResultsTestMath2();
//
//            int[] y3 = new int[Main.students.get(i).getResultsTestMath3().length];
//            y3 = Main.students.get(i).getResultsTestMath3();

            for (int j = 1; j <= Main.students.size(); j++) {
                x.add(Main.students.get(j).getID());
            }

            resultsTest1Math = new ControllerResults().resultsTestMath(x, Main.students.get(i).getResultsTestMath1());
            resultsTest2Math = new ControllerResults().resultsTestMath(x, Main.students.get(i).getResultsTestMath2());
            resultsTest3Math = new ControllerResults().resultsTestMath(x, Main.students.get(i).getResultsTestMath3());
        }
        totalResult = new ArrayList();
        totalResult.add(resultsTest1Math);
        totalResult.add(resultsTest2Math);
        totalResult.add(resultsTest3Math);
    }

    public void toStringResults() {
        System.out.println("Результаты тестов по математике: ");
        for (int k = 0; k < totalResult.size(); k++) {
            List<Integer> keys = new ArrayList<>();
            keys.addAll(totalResult.get(k).keySet());

            ArrayList<int[]> values = new ArrayList<>();
            values.addAll(totalResult.get(k).values());

            for (int i = 0; i < keys.size(); i++) {
                System.out.print("тест номер " + (k + 1) + " студента, ID которого: " + keys.get(i) + ": результаты ");
                for (int i1 = 0; i1 < values.get(i).length; i1++) {
                    System.out.print(values.get(i)[i1]);
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "TeacherMath{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Map> getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(List<Map> totalResult) {
        this.totalResult = totalResult;
    }
}