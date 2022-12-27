import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {
    @Test
    public void firstNameTest_ShouldReturnTrue() {
        boolean value = UserRegistration.checkFirstName("Akshay");
        //test output
        assertEquals(true, value);
    }

    @Test
    public void lastNameTest2_ShouldReturnTrue() {
        boolean value = UserRegistration.checkLastName("Zagade");
        assertEquals(true, value);
    }

    @Test
    public void emailTest3_ShouldReturnTrue() {
        boolean value = UserRegistration.checkEmail("abc.xyz@gmail.com");
        assertEquals(true, value);
    }

    @Test
    public void numberTest4_ShouldReturnTrue() {
        boolean value = UserRegistration.phoneNumber("91 9284046592");
        assertEquals(true, value);
    }

    @Test
    public void passWordTest5_ShouldReturnTrue() {
        boolean value = UserRegistration.passWord("Yogesh@5213");
        assertEquals(true, value);
    }

}
