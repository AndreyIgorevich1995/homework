package com.jetpack.trc.model.user;

import com.jetpack.trc.controller.ControllerResults;
import com.jetpack.trc.model.tests.TestsEnglish;
import com.jetpack.trc.model.tests.TestsMath;

import java.util.*;

public class Student {
    private String name;
    private String surname;
    private int a[];
    private int b;
    private int i;
    private int c[];
    private int d;
    private Map<Integer, int[]> historyResultsTests;
    private int gradeTest1English;
    private List<Integer> resultsTestEnglish1;
    private List<Integer> resultsTestEnglish2;
    private List<Integer> resultsTestEnglish3;
    private List<Integer> resultsTestMath1;
    private List<Integer> resultsTestMath2;
    private List<Integer> resultsTestMath3;
    private List<List<Integer>> listResultsTestsEnglish;   //список результатов всех тестов по английскому
    private List<List<Integer>> listResultsTestsMath;   //список результатов всех тестов по математике
    private List<List<Integer>> listResultsTests;   //список результатов всех тестов

    private List<Integer> gradesTestEnglish;   //список оценок за тесты по английскому
    private List<Integer> gradesTestMath;   //список оценок за тесты по математике
    private List<List<Integer>> gradesTests;   //список оценок за все тесты
    private float rating;
    private int ID;
    private int group;

    public Student(int ID, int group, String name, String surname) {
        this.ID = ID;
        this.group = group;
        this.name = name;
        this.surname = surname;
        resultsTestEnglish1 = new ArrayList<Integer>(Collections.nCopies(TestsEnglish.getQuestions1().length, 0));
        resultsTestEnglish2 = new ArrayList<Integer>(Collections.nCopies(TestsEnglish.getQuestions2().length, 0));
        resultsTestEnglish3 = new ArrayList<Integer>(Collections.nCopies(TestsEnglish.getQuestions3().length, 0));
        resultsTestMath1 = new ArrayList<Integer>(Collections.nCopies(TestsMath.getQuestions1().length, 0));
        resultsTestMath2 = new ArrayList<Integer>(Collections.nCopies(TestsMath.getQuestions2().length, 0));
        resultsTestMath3 = new ArrayList<Integer>(Collections.nCopies(TestsMath.getQuestions3().length, 0));

        listResultsTests = Arrays.asList(
                resultsTestEnglish1, resultsTestEnglish2, resultsTestEnglish3,
                resultsTestMath1, resultsTestMath2, resultsTestMath3);

        listResultsTestsEnglish = Arrays.asList(resultsTestEnglish1, resultsTestEnglish2, resultsTestEnglish3);

        listResultsTestsMath = Arrays.asList(resultsTestMath1, resultsTestMath2, resultsTestMath3);


        gradesTestMath = new ControllerResults().gradesTestMath(listResultsTestsMath);
        gradesTestEnglish = new ControllerResults().gradesTestEnglish(listResultsTestsEnglish);
        gradesTests = Arrays.asList(gradesTestMath, gradesTestEnglish);
        rating = new ControllerResults().rating(gradesTests);
        historyResultsTests = new HashMap<>();
    }


    @Override
    public String toString() {
        return "Student{" + "group=" + group + ", ID=" + ID + '}' + "\n" +
                "список тестов по английскому и количество вопросов соответственно" + "\n" +
                Arrays.toString(TestsEnglish.getTests()) + "\n" +
                TestsEnglish.getQuestions1().length + " " +
                TestsEnglish.getQuestions2().length + " " +
                TestsEnglish.getQuestions3().length + "\n" +
                "список тестов по математике и количество вопросов соответственно" + "\n" +
                Arrays.toString(TestsMath.getTests()) + "\n" +
                TestsMath.getQuestions1().length + " " +
                TestsMath.getQuestions2().length + " " +
                TestsMath.getQuestions3().length;
    }

    public String toStringgg() {
        return "Student{" + "group=" + group + ", ID=" + ID + ", name=" + name + ", surname=" + surname + '}';
    }


    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int[] getC() {
        return c;
    }

    public void setC(int[] c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public Map<Integer, int[]> getHistoryResultsTests() {
        return historyResultsTests;
    }

    public void setHistoryResultsTests(Map<Integer, int[]> historyResultsTests) {
        this.historyResultsTests = historyResultsTests;
    }

    public int getGradeTest1English() {
        return gradeTest1English;
    }

    public void setGradeTest1English(int gradeTest1English) {
        this.gradeTest1English = gradeTest1English;
    }

    public List<Integer> getResultsTestEnglish1() {
        return resultsTestEnglish1;
    }

    public void setResultsTestEnglish1(List<Integer> resultsTestEnglish1) {
        this.resultsTestEnglish1 = resultsTestEnglish1;
    }

    public List<Integer> getResultsTestEnglish2() {
        return resultsTestEnglish2;
    }

    public void setResultsTestEnglish2(List<Integer> resultsTestEnglish2) {
        this.resultsTestEnglish2 = resultsTestEnglish2;
    }

    public List<Integer> getResultsTestEnglish3() {
        return resultsTestEnglish3;
    }

    public void setResultsTestEnglish3(List<Integer> resultsTestEnglish3) {
        this.resultsTestEnglish3 = resultsTestEnglish3;
    }

    public List<Integer> getResultsTestMath1() {
        return resultsTestMath1;
    }

    public void setResultsTestMath1(List<Integer> resultsTestMath1) {
        this.resultsTestMath1 = resultsTestMath1;
    }

    public List<Integer> getResultsTestMath2() {
        return resultsTestMath2;
    }

    public void setResultsTestMath2(List<Integer> resultsTestMath2) {
        this.resultsTestMath2 = resultsTestMath2;
    }

    public List<Integer> getResultsTestMath3() {
        return resultsTestMath3;
    }

    public void setResultsTestMath3(List<Integer> resultsTestMath3) {
        this.resultsTestMath3 = resultsTestMath3;
    }

    public List<List<Integer>> getListResultsTestsEnglish() {
        return listResultsTestsEnglish;
    }

    public void setListResultsTestsEnglish(List<List<Integer>> listResultsTestsEnglish) {
        this.listResultsTestsEnglish = listResultsTestsEnglish;
    }

    public List<List<Integer>> getListResultsTestsMath() {
        return listResultsTestsMath;
    }

    public void setListResultsTestsMath(List<List<Integer>> listResultsTestsMath) {
        this.listResultsTestsMath = listResultsTestsMath;
    }

    public List<List<Integer>> getListResultsTests() {
        return listResultsTests;
    }

    public void setListResultsTests(List<List<Integer>> listResultsTests) {
        this.listResultsTests = listResultsTests;
    }

    public List<Integer> getGradesTestEnglish() {
        return gradesTestEnglish;
    }

    public void setGradesTestEnglish(List<Integer> gradesTestEnglish) {
        this.gradesTestEnglish = gradesTestEnglish;
    }

    public List<Integer> getGradesTestMath() {
        return gradesTestMath;
    }

    public void setGradesTestMath(List<Integer> gradesTestMath) {
        this.gradesTestMath = gradesTestMath;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public List<List<Integer>> getGradesTests() {
        return gradesTests;
    }

    public void setGradesTests(List<List<Integer>> gradesTests) {
        this.gradesTests = gradesTests;
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
