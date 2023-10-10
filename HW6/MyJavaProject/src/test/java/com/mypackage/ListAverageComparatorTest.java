package com.mypackage;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

public class ListAverageComparatorTest {
    @Test
    public void testCompareAveragesFirstListGreater() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2);

        ListAverageComparator comparator = new ListAverageComparator();
        String result = comparator.compareAverages(list1, list2);

        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAveragesSecondListGreater() {
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        ListAverageComparator comparator = new ListAverageComparator();
        String result = comparator.compareAverages(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAveragesEqualAverages() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        ListAverageComparator comparator = new ListAverageComparator();
        String result = comparator.compareAverages(list1, list2);

        assertEquals("Средние значения равны", result);
    }
}
