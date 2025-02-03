package dev.mabel.template_java;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    public List<String> generateTable(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        List<String> table = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            table.add(String.format("%d x %d = %d", n, i, n * i));
        }
        return table;
    }

}
