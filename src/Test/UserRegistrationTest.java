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

}
