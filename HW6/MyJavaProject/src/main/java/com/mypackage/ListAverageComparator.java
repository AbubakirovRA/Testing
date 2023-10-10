package com.mypackage;

import java.util.List;

public class ListAverageComparator {
    /**
     * Сравнивает средние значения двух списков.
     *
     * @param list1 Первый список для сравнения.
     * @param list2 Второй список для сравнения.
     * @return Возвращает отрицательное значение,
     *         если среднее значение list1 меньше среднего значения list2,
     *         положительное значение, если среднее значение list1 больше
     *         среднего значения list2, и ноль, если средние значения равны.
     */

    public String compareAverages(final List<Integer> list1,
    final List<Integer> list2) {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

    private double calculateAverage(final List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum / list.size();
    }
}


