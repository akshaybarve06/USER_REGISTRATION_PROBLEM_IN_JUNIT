package Test;

import org.junit.Assert;
import org.junit.Test;
import Main.UserRegistration;

public class UserRegistrationTest {

    UserRegistration object=new UserRegistration();
    @Test
    public void givenUserFirstName_validThenTrue(){
        boolean firstName=object.checkName("SampleFirstName");
        Assert.assertTrue(firstName);
    }
    @Test
    public void givenUserFirstName_invalidThenFalse(){
        boolean firstName=object.checkName("samplefirstname");
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenUserLastName_validThenTrue(){
        boolean lastName=object.checkName("SampleLastName");
        Assert.assertTrue(lastName);
    }
    @Test
    public void givenUserLastName_invalidThenFalse(){
        boolean lastName=object.checkName("samplelastname");
        Assert.assertTrue(lastName);
    }

}
