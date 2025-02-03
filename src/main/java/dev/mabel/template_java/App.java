package dev.mabel.template_java;

import java.util.List;

public final class App {
    private App() {}

    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable();
         List<String> table = mt.generateTable(5);
         table.forEach(System.out::println);

    }
}
