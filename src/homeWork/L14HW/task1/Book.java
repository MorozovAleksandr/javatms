package homeWork.L14HW.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Book {
    private final String PATTERN_REPLACE = "[^a-zA-Z0-9'\\s-]";
    private final String PATTERN_SPLIT = "[\\s-]+";
    private String book;

    public Book(String pathBook) {
        setBook(pathBook);
    }

    public String getBook() {
        return book;
    }

    private void setBook(String pathBook) {
        try {
            this.book = Files.readString(Paths.get(pathBook));
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
        }
    }

    public String getLongestWord() {
        String[] words = book.replaceAll(PATTERN_REPLACE, "").split(PATTERN_SPLIT);
        Optional<String> longest = Arrays.stream(words).max(Comparator.comparingInt(String::length));

        return longest.orElse("");
    }
}
