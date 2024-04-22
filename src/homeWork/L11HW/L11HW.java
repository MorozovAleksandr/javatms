package homeWork.L11HW;

import java.util.*;

public class L11HW {
    public static void main(String[] args) {
        // task1();

        additionalTask();
    }

    public static String[] getLines() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string: ");
        String s2 = sc.nextLine();
        System.out.print("Enter string: ");
        String s3 = sc.nextLine();

        return new String[]{s1, s2, s3};
    }

    public static String getLongest(String[] lines) {
        int maxLength = 0;
        String longest = "";

        for (String line : lines) {
            if (line.length() > maxLength) {
                maxLength = line.length();
                longest = line;
            }
        }

        return longest;
    }

    public static String[] sortLines(String[] lines) {
        Arrays.sort(lines, Comparator.comparingInt(String::length));

        return lines;
    }

    public static void averageLength(String[] lines) {
        double average = 0.0;
        int sumLength = 0;
        ArrayList<String> list = new ArrayList<>();

        for (String line : lines) {
            sumLength += line.length();
        }

        average = (double) sumLength / lines.length;

        for (String line : lines) {
            sumLength += line.length();

            if (line.length() < average) {
                list.add(line);
            }
        }

        System.out.println(list);
    }

    public static boolean hasAllUniqueChars(String str) {
        Set<Character> chars = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!chars.add(c)) {
                return false;
            }
        }
        return true;
    }

    public static String checkUniqueChars(String[] lines) {
        for (String line : lines) {
            if (hasAllUniqueChars(line)) {
                return line;
            }
        }

        return "Нету уникальных символов";
    }

    public static String duplicateChar(String line) {
        char[] arrChar = line.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : arrChar) {
            sb.append(c).append(c);
        }

        return sb.toString();
    }

    public static void task1() {
        String[] lines = getLines();

        // 1.1
        String longest = getLongest(lines);
        System.out.println(longest);

        // 1.2
        String[] sortedLines = sortLines(lines);
        System.out.println(Arrays.toString(sortedLines));

        // 1.3
        averageLength(lines);

        // 1.4
        System.out.println(checkUniqueChars(lines));

        // 1.5
        System.out.println(duplicateChar("PRIVET"));
    }

    public static void checkPalindrome(String str, int wordNumber) {
        StringBuilder sbReverse = new StringBuilder();
        StringBuilder sbOriginal = new StringBuilder();
        String[] words = str.split(" ");

        if (words.length < wordNumber) {
            System.out.println("Нету слова под этим номером");

            return;
        }

        sbReverse.append(words[wordNumber - 1]).reverse();
        sbOriginal.append(words[wordNumber - 1]);

        if (sbReverse.toString().equalsIgnoreCase(sbOriginal.toString())) {
            System.out.println(sbOriginal + " - палиндром");
        } else {
            System.out.println(sbOriginal + " - не палиндром");
        }
    }

    public static void additionalTask() {
        checkPalindrome("Привет Лол", 2);
    }
}
