import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {
    UserRegistration userRegistration;

    @Before
    public void init() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void firstNameTest_ShouldReturnTrue() {
        try {
            boolean value = userRegistration.checkFirstName("Akshay");
            Assert.assertTrue(value);
        } catch (InvalidDetailsException e) {

        }
    }
    @Test
    public void givenValidFirstName_shouldReturnFalse(){
        try {
            boolean result = userRegistration.checkFirstName("akshay");
            Assert.assertFalse(result);
        }catch (Exception e){

        }
    }

    @Test
    public void lastNameTest2_ShouldReturnTrue() {
        try {
            boolean value = userRegistration.checkLastName("Zagade");
            Assert.assertTrue(value);
        } catch (InvalidDetailsException e) {

        }
    }

    @Test
    public void givenInvalidLastName_shouldReturnFalse() {
        try {
            boolean result = userRegistration.checkLastName("zagade");
            Assert.assertFalse(result);
        } catch (Exception e) {

        }
    }

    @Test
    public void emailTest3_ShouldReturnTrue() {
        try {
            boolean value = userRegistration.checkEmail("abc.xyz@gmail.com");
            Assert.assertTrue(value);
        } catch (InvalidDetailsException e) {

        }
    }
    @Test
    public void givenInvalidEmail_shouldReturnFalse() {
        try {
            boolean result = userRegistration.checkEmail("AKShay@");
            Assert.assertFalse(result);
        }catch (Exception e){

        }
    }


    @Test
    public void numberTest4_ShouldReturnTrue()  {
        try {
            boolean value = userRegistration.phoneNumber("91 9284046592");
            Assert.assertTrue(value);
        } catch (InvalidDetailsException e) {
            System.out.println("Invalid Input");
        }
    }
    @Test
    public void givenInvalidMobileNumber_shouldReturnFalse() {
        try {
            boolean result = userRegistration.phoneNumber("73504477");
            Assert.assertFalse(result);
        }catch (Exception e){

        }
    }

    @Test
    public void passWordTest5_ShouldReturnTrue()  {
        try {
            boolean value = userRegistration.passWord("Akshay@1997");
            Assert.assertTrue(value);
        } catch (InvalidDetailsException e) {

        }
    }
    @Test
    public void givenInvalidPassword_shouldReturnFalse() {
        try {
            boolean result = userRegistration.passWord("Akshay123");
            Assert.assertFalse(result);
        }catch (Exception e){

        }
    }
}
