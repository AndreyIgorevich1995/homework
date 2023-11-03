package com.jetpack.trc.view.authorization;

import com.jetpack.trc.Main;
import com.jetpack.trc.controller.ControllerRating;
import com.jetpack.trc.controller.ControllerResults;
import com.jetpack.trc.controller.ControllerStudent;
import com.jetpack.trc.model.tests.TestsEnglish;
import com.jetpack.trc.model.tests.TestsMath;
import com.jetpack.trc.view.View;

import java.util.Arrays;
import java.util.Scanner;

public class ViewAuthorizationStudent {
    private Scanner scanner;
    private ControllerStudent controllerStudent = new ControllerStudent();

    public ViewAuthorizationStudent() {
        System.out.println("Введите Ваш ID");
        scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(controllerStudent.printResult(a));
        System.out.println("Пересдать какой-либо тест?");
        System.out.println("Введите '1', чтобы пройти тест. '2', чтобы посмотреть рейтинг студентов Вашей группы или '3', чтобы выйти");
        int b = scanner.nextInt();
        if (b == 1) {
            System.out.println("Выберите тест по математике или английскому");
            System.out.println("1 - по математике");
            System.out.println("2 - по английскому");
            int c = scanner.nextInt();
            if (c == 1) {
                System.out.println("Выберите название теста и введите номер");
                System.out.println(Arrays.toString(TestsMath.getTests()));
                int d = scanner.nextInt();
                System.out.println("Приступайте к выполнению - вводите ответы");

                for (int i = 0; i < TestsMath.getListQuestions().get(d - 1).length; i++) {
                    System.out.println(TestsMath.getListQuestions().get(d - 1)[i]);
                    int e = scanner.nextInt();
                    Main.students.get(a).getListResultsTestsMath().get(d - 1).set(i, e);
                }
                Main.students.get(a).setGradesTestMath(new ControllerResults().gradesTestMath(Main.students.get(a).getListResultsTestsMath()));

            } else if (c == 2) {
                System.out.println("Выберите название теста и введите номер");
                System.out.println(Arrays.toString(TestsEnglish.getTests()));
                int d = scanner.nextInt();
                System.out.println("Приступайте к выполнению - вводите номер слова, перевод которого - Вы считаете правильным");

                for (int i = 0; i < TestsEnglish.getListQuestions().get(d - 1).length; i++) {
                    System.out.println(TestsEnglish.getListQuestions().get(d - 1)[i]);
                    System.out.println("Введите номер слова, переводом которого является данное слово");
                    System.out.println(Arrays.toString(TestsEnglish.getListAnswers().get(d - 1)));
                    int e = scanner.nextInt();
                    Main.students.get(a).getListResultsTestsEnglish().get(d - 1).set(i, e);
                }
                Main.students.get(a).setGradesTestEnglish(new ControllerResults().gradesTestEnglish(Main.students.get(a).getListResultsTestsEnglish()));
            }
        } else if (b == 2) {
            new ControllerRating().rating(Main.students, Main.students.get(a).getGroup());
            new ControllerRating().printRating();
        } else {
            System.exit(0);
        }
        Main.students.get(a).setRating(new ControllerResults().rating(Main.students.get(a).getGradesTests()));
    }
}
