package homeWork.L13HW.task1;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Credentials {
    private final static String PATTERN_LOGIN = "^[^\\s]{1,19}$";
    private final static String PATTERN_PASSWORD = "^(?=.*\\d)[^\\s]{1,19}$";
    private final static String ERROR_LOGIN = "Длина login должна быть меньше 20 символов и не должен содержать пробелы";
    private final static String ERROR_PASSWORD = "Длина password должна быть меньше 20 символов, не должен содержать пробелов и должен содержать хотя бы одну цифру";
    private final static String ERROR_PASSWORD2 = "Пароли не совпадают";

    private static boolean checkPattern(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return !matcher.matches();
    }

    static public boolean checkCredentials(String login, String password, String confirmPassword) {
        try {
            ArrayList<Exception> exceptions = new ArrayList<>();

            if (checkPattern(PATTERN_LOGIN, login)) {
                exceptions.add(new WrongLoginException(ERROR_LOGIN));
            }

            if (checkPattern(PATTERN_PASSWORD, password)) {
                exceptions.add(new WrongPasswordException(ERROR_PASSWORD));
            }

            if (!password.equals(confirmPassword)) {
                exceptions.add(new WrongPasswordException(ERROR_PASSWORD2));
            }

            if (!exceptions.isEmpty()) {
                throw new WrongCredentialsExceptions(exceptions.toArray(new Exception[0]));
            }

            return true;
        } catch (WrongCredentialsExceptions exceptions) {
            // Обрабатываем массив ошибок, чтобы юзер получал сразу все ошибки
            for (Exception exception : exceptions.getExceptions()) {
                System.out.println(exception.getMessage());
            }

            return false;
        }
    }
}
