import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static UserRegistration inputString;


    public  boolean checkFirstName(String firstName) throws InvalidDetailsException{
        String nameCondition = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(nameCondition);
        Matcher checkFirstNameMach = pattern.matcher(firstName);
        if (checkFirstNameMach.matches()) {
            System.out.println("First name  is correct");
        } else {
            throw new InvalidDetailsException("InvalidDetailsException");
        }
        return checkFirstNameMach.matches();
    }

    public  boolean checkLastName(String lastName) throws InvalidDetailsException {

        String nameCondition = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(nameCondition);
        Matcher checkLastName = pattern.matcher(lastName);
        if (checkLastName.matches()) {
            System.out.println("Last name  is correct");
        } else {
           throw new InvalidDetailsException("InvalidDetailsException");
        }
        return checkLastName.matches();
    }

    public  boolean checkEmail(String email) throws InvalidDetailsException {
        String nameCondition = "^[a-zA-Z0-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
        Pattern pattern = Pattern.compile(nameCondition);
        Matcher checkEmail = pattern.matcher(email);
        if (checkEmail.matches()) {
            System.out.println("Valid email");
        } else {
            throw new InvalidDetailsException("InvalidDetailsException");
        }
        return checkEmail.matches();
    }

    public  boolean phoneNumber(String phoneNumber) throws InvalidDetailsException {
        String nameCondition = "^(91 )[0-9]{10}$";
        Pattern pattern = Pattern.compile(nameCondition);
        Matcher checkPhoneNumber = pattern.matcher(phoneNumber);
        if (checkPhoneNumber.matches()) {
            System.out.println("valid phone number");
        } else {
            throw new InvalidDetailsException("InvalidDetailsException");
        }
        return checkPhoneNumber.matches();
    }

    public  boolean passWord(String password)throws InvalidDetailsException {
        String nameCondition = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*+=]*[@#$%^&*+=][^@#$%^&*+=]*$).{8,}$";
        Pattern pattern = Pattern.compile(nameCondition);
        Matcher checkPassword = pattern.matcher(password);
        if (checkPassword.matches()) {
            System.out.println("v");
        } else {
            throw new InvalidDetailsException("valid password number");
        }
        return checkPassword.matches();
    }
}
