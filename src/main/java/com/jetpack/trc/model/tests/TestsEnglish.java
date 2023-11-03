package com.jetpack.trc.model.tests;

import java.util.Arrays;
import java.util.List;

//public class TestsEnglish extends Tests {
public class TestsEnglish {
    private static String[] Tests = {"Местоимения личные", "Местоимения указательные", "Существительные"};

    private static String[] Questions1 = {"We", "I", "Hi", "She"};                   //массив вопросов
    private static String[] Questions2 = {"This", "That", "These", "Those"};         //массив вопросов
    private static String[] Questions3 = {"Город", "Страна", "Река", "Гора"};        //массив вопросов
    private static List<String[]> listQuestions = Arrays.asList(Questions1, Questions2, Questions3);

    private static String[] Answers1 = {"Мы", "Я", "Он", "Она"};         //массив ответов
    private static String[] Answers2 = {"Это", "То", "Эти", "Те"};         //массив ответов
    private static String[] Answers3 = {"City", "Country", "River", "Mountain"};         //массив ответов
    private static List<String[]> listAnswers = Arrays.asList(Answers1, Answers2, Answers3);

//    public TestsEnglish(float resultsTest, int grade) {
//        super(resultsTest, grade);
//    }

    public TestsEnglish() {
    }

    public static String[] getTests() {
        return Tests;
    }

    public static String[] getQuestions1() {
        return Questions1;
    }

    public static String[] getQuestions2() {
        return Questions2;
    }

    public static String[] getQuestions3() {
        return Questions3;
    }

    public static String[] getAnswers1() {
        return Answers1;
    }

    public static String[] getAnswers2() {
        return Answers2;
    }

    public static String[] getAnswers3() {
        return Answers3;
    }

    public static List<String[]> getListQuestions() {
        return listQuestions;
    }

    public static List<String[]> getListAnswers() {
        return listAnswers;
    }
}