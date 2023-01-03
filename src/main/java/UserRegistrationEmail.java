import java.util.regex.Pattern;

public class UserRegistrationEmail {
    public boolean validateEmail(String email) {
        return Pattern.matches("^[a-z]{3}[0-1]{0,3}[+.-]{0,1}[0-1]{0,3}[@]{1}[0-9]{0,1}[a-z]{0,5}[.]{1}[a-z]{3}[.]{0,1}[a-z]{0,3}$", email);
    }
}
