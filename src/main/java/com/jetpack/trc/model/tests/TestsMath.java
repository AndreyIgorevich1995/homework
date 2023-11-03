package com.jetpack.trc.model.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

//public class TestsMath extends Tests {
public class TestsMath {
    private static String[] Tests = {"Сумма", "Произведение", "Частное"};

    private static String[] Questions1 = {"2+2", "1+5", "151+5", "20+2"};         //массив вопросов
    private static String[] Questions2 = {"2*5", "20*20", "10*5", "20*5"};         //массив вопросов
    private static String[] Questions3 = {"12/2", "21/3", "28/4", "55/5"};         //массив вопросов
    private static List<String[]> listQuestions = Arrays.asList(Questions1, Questions2, Questions3);

    private static String[] Answers1 = {"4", "6", "156", "22"};         //массив ответов
    private static String[] Answers2 = {"10", "400", "50", "100"};         //массив ответов
    private static String[] Answers3 = {"6", "7", "7", "11"};         //массив ответов
    private static List<String[]> listAnswers = Arrays.asList(Answers1, Answers2, Answers3);
//private static int[] Answers1 = {4, 6, 156, 22};         //массив ответов
//    private static int[] Answers2 = {10, 400, 50, 100};         //массив ответов
//    private static int[] Answers3 = {6, 7, 7, 11};         //массив ответов
//    private static List<int[]> listAnswers = Arrays.asList(Answers1, Answers2, Answers3);

//    public TestsMath(float resultsTest, int grade) {
//        super(resultsTest, grade);
//    }

    public TestsMath() {
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

