package homeWork.L16HW;

import java.util.HashMap;
import java.util.Map;

public class L16HW {
    public static void main(String[] args) {
        // task1();

        // task2();

        additional();
    }

    /*----task 1----*/
    public static void task1() {
        String[] arrString = {"a", "b", "a", "c", "b", "d", "D"};

        System.out.println(wordMultiple(arrString));
    }

    public static Map<String, Boolean> wordMultiple(String[] lines) {
        Map<String, Boolean> wordsMap = new HashMap<>();

        for (String word : lines) {
            // wordsMap.put(word, wordsMap.containsKey(word));
            wordsMap.compute(word, (key, count) -> !(count == null));
        }

        return wordsMap;
    }
    /*----task 1----*/

    /*----task 2----*/
    public static void task2() {
        String[] lines = {"man", "moon", "good", "night"};

        System.out.println(pairs(lines));
    }

    public static Map<String, String> pairs(String[] lines) {
        Map<String, String> pairsMap = new HashMap<>();
        for (String word : lines) {
            int stepForLastChar = word.length() >= 2 ? 1 : 0;

            pairsMap.put(String.valueOf(word.charAt(0)), String.valueOf(word.charAt(word.length() - stepForLastChar)));
        }

        return pairsMap;
    }
    /*----task 2----*/

    /*----START additional task----*/
    // TODO: Думаю есть более элегантное решение
    public static void additional() {
        String bracketsStr = "([{{[(())]}}])";

        Map<Character, Character> bracketsMap = new HashMap<>() {{
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }};

        if (!parityCheck(bracketsStr)) {
            System.out.println("Не сбалансирована");

            return;
        }

        System.out.println(checkBalanceBracket(bracketsStr, bracketsMap) ? "Сбалансирована" : "Не сбалансирована");
    }

    public static boolean checkBalanceBracket(String bracketsStr, Map<Character, Character> bracketsMap) {
        for (int i = 1; i < bracketsStr.length() / 2; i++) {
            char leftOfCenter = bracketsStr.charAt((bracketsStr.length() / 2) - i);
            char rightOfCenter = bracketsStr.charAt((bracketsStr.length() / 2) + (i - 1));

            if (bracketsMap.get(leftOfCenter) != rightOfCenter) {
                return false;
            }
        }

        return true;
    }

    public static boolean parityCheck(String str) {
        return str.length() % 2 == 0;
    }
    /*----END additional task ----*/
}
