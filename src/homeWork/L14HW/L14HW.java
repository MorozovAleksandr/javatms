package homeWork.L14HW;

import homeWork.L14HW.task1.Book;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class L14HW {
    private static final String ROMEO_PATH = "src/homeWork/L14HW/task1/romeo-and-juliet.txt";
    private static final String LONGEST_WORD_PATH = "src/homeWork/L14HW/task1/longestWord.txt";
    private static final String DOCUMENTS_PATH = "src/homeWork/L14HW/additionalTask/documents.txt";
    private static final String CORRECT_DOCUMENTS_PATH = "src/homeWork/L14HW/additionalTask/correctDocuments.txt";
    private static final String INCORRECT_DOCUMENTS_PATH = "src/homeWork/L14HW/additionalTask/incorrectDocuments.txt";
    private static final int DOCUMENT_LENGTH = 15;

    public static void main(String[] args) {
        // task1();

        additionalTask();
    }

    public static void task1() {
        Book book = new Book(ROMEO_PATH);

        try (FileWriter fw = new FileWriter(LONGEST_WORD_PATH)) {
            fw.write(book.getLongestWord());
            fw.flush();
        } catch (Exception e) {
            System.out.println("Произошла ошибка при записи файла: " + e.getMessage());
        }
    }

    public static void additionalTask() {
        try {
            // TODO: Лень задавать путь через консоль :D
            String[] documents = readDocumentsFromFile(DOCUMENTS_PATH);
            Map<Boolean, List<String>> partitionedDocuments = partitionDocuments(documents);

            writeDocumentsToFile(partitionedDocuments.get(true), CORRECT_DOCUMENTS_PATH);
            writeDocumentsToFile(partitionedDocuments.get(false), INCORRECT_DOCUMENTS_PATH);
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении или записи файла: " + e.getMessage());
        }
    }

    private static String[] readDocumentsFromFile(String filePath) throws IOException {
        return Files.readString(Paths.get(filePath)).split("\\s+");
    }

    private static Map<Boolean, List<String>> partitionDocuments(String[] documents) {
        Pattern pattern = Pattern.compile("^(contract|docnum)");

        // Преобразуем в коллекцию Map
        return Arrays.stream(documents)
                .map(doc -> isValidDocument(doc, pattern) ? doc : getIncorrectDocumentMessage(doc, pattern))
                .collect(Collectors.partitioningBy(doc -> isValidDocument(doc, pattern)));
    }

    private static String getIncorrectDocumentMessage(String document, Pattern pattern) {
        StringBuilder incorrectDocumentMessage = new StringBuilder(document).append(" -");
        Matcher m = pattern.matcher(document);
        boolean isMatch = m.find();
        boolean isCorrectLength = document.length() == DOCUMENT_LENGTH;

        if (!isMatch) {
            incorrectDocumentMessage.append(" неверное название документа");
        }

        if (!isCorrectLength) {
            incorrectDocumentMessage.append((!isMatch ? "," : "")).append(" длина номера документа должна быть ").append(DOCUMENT_LENGTH).append(" символов");
        }

        return incorrectDocumentMessage.toString();
    }


    private static boolean isValidDocument(String document, Pattern pattern) {
        Matcher m = pattern.matcher(document);
        boolean isMatch = m.find();
        boolean isCorrectLength = document.length() == DOCUMENT_LENGTH;
        return isMatch && isCorrectLength;
    }

    private static void writeDocumentsToFile(List<String> documents, String filePath) throws IOException {
        Files.write(Paths.get(filePath), documents);
    }
}
