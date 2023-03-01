package org.example.HW1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Подсчитать количество вхождения каждого слова
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> mapStr = new HashMap<>();
        String strOrigin = "Россия идет вперед всей планеты. Планета — это не Россия.";
        strOrigin = strOrigin.replaceAll("\\p{Punct}", "");
        String[] strSplit = strOrigin.toLowerCase().split(" ");
        for (String str : strSplit) {
            mapStr.putIfAbsent(str, 0);
            mapStr.put(str, mapStr.get(str) + 1);
        }
        for (var entry : mapStr.entrySet()) {
            System.out.println(entry.getKey() + " " + "встретилась" + entry.getValue() + " " + "раз(а)");
        }
    }
}
