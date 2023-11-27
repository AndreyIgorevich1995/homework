package com.jetpack.trc.controller;

import com.jetpack.trc.model.tests.TestsEnglish;
import com.jetpack.trc.model.tests.TestsMath;

import java.util.*;

public class ControllerResults {
    /**
     * here is a list of test results in English
     */
    public Map<Integer, List<Integer>> resultsTestEnglish(List<Integer> id, List<Integer> a) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < id.size(); i++) {
            map.put(id.get(i), a);
        }
        return map;
    }

    /**
     * here is a list of test results in Math
     */
    public Map<Integer, List<Integer>> resultsTestMath(List<Integer> id, List<Integer> a) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < id.size(); i++) {
            map.put(id.get(i), a);
        }
        return map;
    }

    /**
     * here is a list of grades for Math tests
     */
    public List<Integer> gradesTestMath(List<List<Integer>> listResultsTests) {
        List<Integer> grades = new ArrayList<>();
        for (int i = 0; i < listResultsTests.size(); i++) {
            float sum = 0;
            for (int j = 0; j < listResultsTests.get(i).size(); j++) {
                if (Integer.toString(listResultsTests.get(i).get(j)).equals(TestsMath.getListAnswers().get(i)[j])) {
                    sum++;
                }
            }
            float x = (sum / listResultsTests.get(i).size()) * 100;
            if (x < 50) {
                grades.add(2);
            } else if ((x >= 50) && (x < 75)) {
                grades.add(3);
            } else if ((x >= 75) && (x < 100)) {
                grades.add(4);
            } else grades.add(50);
        }
        return grades;
    }

    /**
     * here is a list of grades for English tests
     */
    public List<Integer> gradesTestEnglish(List<List<Integer>> listResultsTests) {
        List<Integer> grades = new ArrayList<>();
        for (int i = 0; i < listResultsTests.size(); i++) {
            float sum = 0;
            for (int i1 = 0; i1 < listResultsTests.get(i).size(); i1++) {
                try {
                    if (TestsEnglish.getListAnswers().get(i)[i1].equals(TestsEnglish.getListAnswers().get(i)[listResultsTests.get(i).get(i1) - 1])) {
                        sum++;
                    }
                } catch (Exception w) {
                }
            }
            float x = (sum / listResultsTests.get(i).size()) * 100;
            if (x < 50) {
                grades.add(2);
            } else if ((50 <= x) && (x < 75)) {
                grades.add(3);
            } else if ((75 <= x) && (x < 100)) {
                grades.add(4);
            } else grades.add(5);
        }
        return grades;
    }

    /**
     * here formed rating
     */
    public float rating(List<List<Integer>> gradesTest) {
        float rating;
        float sum = 0;
        float size = 0;
        for (int i = 0; i < gradesTest.size(); i++) {
            for (int i1 = 0; i1 < gradesTest.get(i).size(); i1++) {
                sum += gradesTest.get(i).get(i1);
                size = size + gradesTest.get(i).size();
            }
        }
        rating = sum / size;
        return rating;
    }
}
