import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static UserRegistration inputString;


    public static boolean checkFirstName(String firstName) {
        String nameCondition = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(nameCondition);
        Matcher checkFirstNameMach = pattern.matcher(firstName);
        if (checkFirstNameMach.matches()) {
            System.out.println("Happy Mood");
        } else {
            System.out.println("Sad Mood");
        }
        return checkFirstNameMach.matches();
    }

    public static boolean checkLastName(String lastName) {

        String nameCondition = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(nameCondition);
        Matcher checkLastName = pattern.matcher(lastName);
        if (checkLastName.matches()) {
            System.out.println("Happy Mood");
        } else {
            System.out.println("Sad Mood");
        }
        return checkLastName.matches();
    }

    public static boolean checkEmail(String email) {
        String nameCondition = "^[a-zA-Z0-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
        Pattern pattern = Pattern.compile(nameCondition);
        Matcher checkEmail = pattern.matcher(email);
        if (checkEmail.matches()) {
            System.out.println("Happy Mood");
        } else {
            System.out.println("Sad Mood");
        }
        return checkEmail.matches();
    }

    public static boolean phoneNumber(String phoneNumber) {
        String nameCondition = "^(91 )[0-9]{10}$";
        Pattern pattern = Pattern.compile(nameCondition);
        Matcher checkPhoneNumber = pattern.matcher(phoneNumber);
        if (checkPhoneNumber.matches()) {
            System.out.println("Happy Mood");
        } else {
            System.out.println("Sad Mood");
        }
        return checkPhoneNumber.matches();
    }

    public static boolean passWord(String password) {
        String nameCondition = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*+=]*[@#$%^&*+=][^@#$%^&*+=]*$).{8,}$";
        Pattern pattern = Pattern.compile(nameCondition);
        Matcher checkPassword = pattern.matcher(password);
        if (checkPassword.matches()) {
            System.out.println("Happy Mood");
        } else {
            System.out.println("Sad Mood");
        }
        return checkPassword.matches();
    }
}
