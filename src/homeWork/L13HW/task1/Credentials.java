package homeWork.L13HW.task1;

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
            if (checkPattern(PATTERN_LOGIN, login)) {
                throw new WrongLoginException(ERROR_LOGIN);
            }

            if (checkPattern(PATTERN_PASSWORD, password)) {
                throw new WrongPasswordException(ERROR_PASSWORD);
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException(ERROR_PASSWORD2);
            }

            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());

            return false;
        }
    }
}
