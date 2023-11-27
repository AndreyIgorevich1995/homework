package com.jetpack.trc.view.authorization;

import com.jetpack.trc.Main;
import com.jetpack.trc.controller.ControllerRating;
import com.jetpack.trc.controller.ControllerResults;
import com.jetpack.trc.controller.ControllerStudent;
import com.jetpack.trc.model.exception.*;
import com.jetpack.trc.model.tests.TestsEnglish;
import com.jetpack.trc.model.tests.TestsMath;

import java.util.Arrays;
import java.util.Scanner;

public class ViewAuthorizationStudent {
    private Scanner scanner;
    private ControllerStudent controllerStudent = new ControllerStudent();

    public ViewAuthorizationStudent() {
        System.out.println("Введите Ваш ID");
        scanner = new Scanner(System.in);
        /**
         * variable "a" is the user ID
         * @throws IdException if "There is no user with this ID"
         */
        int a = scanner.nextInt();
        try {
            if (!Main.students.containsKey(a)) {
                throw new IdException();
            }
        } catch (IdException e) {
            System.out.println("Пользователь с таким ID отсутствует");
            System.out.println();
            new ViewAuthorizationStudent();
        }
        System.out.println(controllerStudent.printResult(a));
        System.out.println("Пересдать какой-либо тест?");
        System.out.println("Введите '1', чтобы пройти тест. '2', чтобы посмотреть рейтинг студентов Вашей группы или '3', чтобы выйти");
        /**
         * variable "b" is 1 if take the test
         * 2 if see the rating of students in your group
         * 3 if go out
         */
        int b = scanner.nextInt();
        if (b == 1) {
            System.out.println("Выберите тест по математике или английскому");
            System.out.println("1 - по математике");
            System.out.println("2 - по английскому");
            /**
             * variable "с" is 1 if math test
             * 2 if english test
             * @throws TestsSizeException if "There is no such element in the list of tests"
             */
            int c = scanner.nextInt();
            if (c == 1) {
                System.out.println("Выберите название теста и введите номер");
                System.out.println(Arrays.toString(TestsMath.getTests()));
                /**
                 * variable "d" is selected test number
                 * @throws TestsSizeException if "There is no such element in the list of tests"
                 */
                int d = scanner.nextInt();
                try {
                    if (TestsMath.getListQuestions().size() < d || d <= 0) {
                        throw new TestsSizeException();
                    }
                } catch (TestsSizeException e) {
                    System.out.println("Нет такого элемента в списке тестов");
                    System.out.println();
                    new ViewAuthorizationStudent();
                }
                System.out.println("Приступайте к выполнению - вводите ответы");
                for (int i = 0; i < TestsMath.getListQuestions().get(d - 1).length; i++) {
                    System.out.println(TestsMath.getListQuestions().get(d - 1)[i]);
                    /**
                     * variable "e" is correct answer
                     */
                    int e = scanner.nextInt();
                    Main.students.get(a).getListResultsTestsMath().get(d - 1).set(i, e);
                }
                Main.students.get(a).setGradesTestMath(new ControllerResults().gradesTestMath(Main.students.get(a).getListResultsTestsMath()));
            } else if (c == 2) {
                System.out.println("Выберите название теста и введите номер");
                System.out.println(Arrays.toString(TestsEnglish.getTests()));
                int d = scanner.nextInt();

                try {
                    if (TestsEnglish.getListQuestions().size() < d || d <= 0) {
                        throw new TestsSizeException();
                    }
                } catch (TestsSizeException e) {
                    System.out.println("Нет такого элемента в списке тестов");
                    System.out.println();
                    new ViewAuthorizationStudent();
                }
                System.out.println("Приступайте к выполнению - вводите номер слова, перевод которого - Вы считаете правильным");
                for (int i = 0; i < TestsEnglish.getListQuestions().get(d - 1).length; i++) {
                    System.out.println(TestsEnglish.getListQuestions().get(d - 1)[i]);
                    System.out.println("Введите номер слова, переводом которого является данное слово");
                    System.out.println(Arrays.toString(TestsEnglish.getListAnswers().get(d - 1)));
                    int e = scanner.nextInt();
                    Main.students.get(a).getListResultsTestsEnglish().get(d - 1).set(i, e);
                }
                Main.students.get(a).setGradesTestEnglish(new ControllerResults().gradesTestEnglish(Main.students.get(a).getListResultsTestsEnglish()));
            } else {
                try {
                    throw new FalseStartException(a);
                } catch (FalseStartException e) {
                    System.out.println("Надо было ввести 1 или 2. Было введено : " + c);
                    System.out.println();
                    new ViewAuthorizationStudent();
                }
            }
        } else if (b == 2) {
            ControllerRating controllerRating = new ControllerRating(Main.students.get(a).getGroup());
            ControllerRating.rating(controllerRating.getGrades(), 0, controllerRating.getGrades().size() - 1);
            controllerRating.printRating();
        } else if (b == 3) {
            System.exit(0);
        } else {
            try {
                throw new StudentMenuException(a);
            } catch (StudentMenuException e) {
                System.out.println("Надо было ввести 1, 2 или 3. Было введено : " + b);
                System.out.println();
                new ViewAuthorizationStudent();
            }
        }
        Main.students.get(a).setRating(new ControllerResults().rating(Main.students.get(a).getGradesTests()));
    }
}
