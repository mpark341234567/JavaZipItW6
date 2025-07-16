package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ZipTest {
    @Test
    void testZipListsWithSameType() {
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);
        List<Integer> expected = List.of(1, 4, 2, 5, 3, 6);
        assertEquals(expected, Zip.zipLists(list1, list2));
    }
    @Test
    void testZipListsWithSameType2() {
        List<String> list1 = List.of("a", "b", "c");
        List<String> list2 = List.of("d", "e", "f");
        List<String> expected = List.of("a", "d", "b", "e", "c", "f");
        assertEquals(expected, Zip.zipLists(list1, list2));
    }
    @Test
    void testZipListsWithSameType3() {
        List<Character> list1 = List.of('X', '3', 'A');
        List<Character> list2 = List.of('O', '4', '&');
        List<Character> expected = List.of('X', 'O', '3', '4', 'A', '&');
        assertEquals(expected, Zip.zipLists(list1, list2));
    }
    @Test
    void testZipListsWithSameType4() {
        List<Double> list1 = List.of(1.1, 2.2);
        List<Double> list2 = List.of(3.3, 4.4, 5.5);
        List<Double> expected = List.of(1.1, 3.3, 2.2, 4.4, 5.5);
        assertEquals(expected, Zip.zipLists(list1, list2));
    }
    @Test
    void testZipListsWithDifferentSizes() {
        List<Integer> list1 = List.of(1, 2);
        List<Integer> list2 = List.of(3, 4, 5);
        List<Integer> expected = List.of(1, 3, 2, 4, 5);
        assertEquals(expected, Zip.zipLists(list1, list2));
    }
    @Test
    void testZipListsWithDifferentSizes2() {
        List<String> list1 = List.of("x");
        List<String> list2 = List.of("z", "a", "b");
        List<String> expected = List.of("x", "z", "a", "b");
        assertEquals(expected, Zip.zipLists(list1, list2));
    }
    @Test
    void testZipListsWithEmptyList() {
        List<Integer> list1 = List.of();
        List<Integer> list2 = List.of(1, 2, 3);
        List<Integer> expected = List.of(1, 2, 3);
        assertEquals(expected, Zip.zipLists(list1, list2));
    }
    @Test
    void testZipListsWithBothEmpty() {
        List<Integer> list1 = List.of();
        List<Integer> list2 = List.of();
        List<Integer> expected = List.of();
        assertEquals(expected, Zip.zipLists(list1, list2));
    }
}
