package dev.mabel.test_java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Arrays;

import dev.mabel.template_java.MultiplicationTable;

public class TestMultiplicationTable {

    @Test
    void testMultiplicationTable_positiveNumber() {
        MultiplicationTable mt = new MultiplicationTable();
        List<String> expected = Arrays.asList(
            "5 x 1 = 5",
            "5 x 2 = 10",
            "5 x 3 = 15",
            "5 x 4 = 20",
            "5 x 5 = 25",
            "5 x 6 = 30",
            "5 x 7 = 35",
            "5 x 8 = 40",
            "5 x 9 = 45",
            "5 x 10 = 50"
        );
        List<String> actual = mt.generateTable(5);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateTable_zero() {
        MultiplicationTable mt = new MultiplicationTable();
        List<String> expected = Arrays.asList(
                "0 x 1 = 0",
                "0 x 2 = 0",
                "0 x 3 = 0",
                "0 x 4 = 0",
                "0 x 5 = 0",
                "0 x 6 = 0",
                "0 x 7 = 0",
                "0 x 8 = 0",
                "0 x 9 = 0",
                "0 x 10 = 0"
        );
        List<String> actual = mt.generateTable(0);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateTable_negativeNumber() {
      MultiplicationTable mt = new MultiplicationTable();
      assertThrows(IllegalArgumentException.class, () -> mt.generateTable(-5));
    }
}
