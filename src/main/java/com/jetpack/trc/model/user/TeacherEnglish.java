package com.jetpack.trc.model.user;

import com.jetpack.trc.Main;
import com.jetpack.trc.controller.ControllerResults;

import java.util.*;

public class TeacherEnglish /*extends Teacher */ {
    private int ID;
    private String name;
    private String surname;
    private Map<Integer, List<Integer>> resultsTest1English;
    private Map<Integer, List<Integer>> resultsTest2English;
    private Map<Integer, List<Integer>> resultsTest3English;
    private List<Map<Integer, List<Integer>>> totalResult;

    public TeacherEnglish(int ID, String name, String surname) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        for (int i = 1; i <= Main.students.size(); i++) {
            List<Integer> x = new ArrayList<>();

            for (int j = 1; j <= Main.students.size(); j++) {
                x.add(Main.students.get(j).getID());
            }
            resultsTest1English = new ControllerResults().resultsTestEnglish(x, Main.students.get(i).getResultsTestEnglish1());
            resultsTest2English = new ControllerResults().resultsTestEnglish(x, Main.students.get(i).getResultsTestEnglish2());
            resultsTest3English = new ControllerResults().resultsTestEnglish(x, Main.students.get(i).getResultsTestEnglish3());
        }
        totalResult = new ArrayList();
        totalResult.add(resultsTest1English);
        totalResult.add(resultsTest2English);
        totalResult.add(resultsTest3English);
    }

    public void toStringResults() {
        System.out.println("Результаты тестов по английскому: ");
        for (int k = 0; k < totalResult.size(); k++) {
            List<Integer> keys = new ArrayList<>();
            keys.addAll(totalResult.get(k).keySet());

            List<List<Integer>> values = new ArrayList<>();
            values.addAll(totalResult.get(k).values());

            for (int i = 0; i < keys.size(); i++) {
                System.out.print("тест номер " + (k + 1) + " студента, ID которого: " + keys.get(i) + ": результаты ");
//                for (int n = 0; n < values.get(i).length; n++) {
                for (int n = 0; n < values.get(i).size(); n++) {
//                    System.out.print(values.get(i)[n]);
                    System.out.print(values.get(i).get(n));
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "TeacherEnglish{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
}
