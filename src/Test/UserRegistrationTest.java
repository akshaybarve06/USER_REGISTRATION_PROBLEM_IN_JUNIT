package Test;

import org.junit.Assert;
import org.junit.Test;
import Main.UserRegistration;

public class UserRegistrationTest {

    UserRegistration object = new UserRegistration();

    @Test
    public void userFirstName_ValidThenTrue() {
        boolean firstName = object.checkName("SampleFirstName");
        Assert.assertTrue(firstName);
    }

    @Test
    public void userFirstName_InvalidThenFalse() {
        boolean firstName = object.checkName("samplefirstname");
        Assert.assertFalse(firstName);
    }

    @Test
    public void userLastName_ValidThenTrue() {
        boolean lastName = object.checkName("SampleLastName");
        Assert.assertTrue(lastName);
    }

    @Test
    public void userLastName_InvalidThenFalse() {
        boolean lastName = object.checkName("samplelastname");
        Assert.assertFalse(lastName);
    }
}
