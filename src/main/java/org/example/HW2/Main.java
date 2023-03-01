package org.example.HW2;


import java.util.*;

/**
 * Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом)
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> mapStr = new HashMap<>();
        Scanner console = new Scanner(System.in);
        String searchWord = console.nextLine();
        String strOrigin = "Россия идет вперед всей планеты. Планета — это не Россия.";
        strOrigin = strOrigin.replaceAll("\\p{Punct}", "");
        String[] strSplit = strOrigin.toLowerCase().split(" ");
        System.out.println(Arrays.toString(strSplit));
        mapStr.put(searchWord, 0);
        for (String str : strSplit) {
            if (mapStr.containsKey(str)){
                mapStr.put(str, mapStr.get(str) + 1);
            }
        }
        System.out.println(mapStr.entrySet());
    }
}


