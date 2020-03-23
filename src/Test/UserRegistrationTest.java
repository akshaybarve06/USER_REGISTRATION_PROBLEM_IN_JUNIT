package Test;

import org.junit.Assert;
import org.junit.Test;
import Main.UserRegistration;

public class UserRegistrationTest {

    UserRegistration object=new UserRegistration();
    @Test
    public void userFirstName_ValidThenTrue(){
        boolean firstName=object.checkName("SampleFirstName");
        Assert.assertTrue(firstName);
    }
    @Test
    public void userFirstName_InvalidThenFalse(){
        boolean firstName=object.checkName("samplefirstname");
        Assert.assertFalse(firstName);
    }
    @Test
    public void userLastName_ValidThenTrue(){
        boolean lastName=object.checkName("SampleLastName");
        Assert.assertTrue(lastName);
    }
    @Test
    public void userLastName_InvalidThenFalse(){
        boolean lastName=object.checkName("samplelastname");
        Assert.assertFalse(lastName);
    }
    @Test
    public void email_ValidThenTrue() {
        String validEmails[]={"abc.xyz@bl.co.in","abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com",
                "abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au",
                "abc@gmail.com.com","abc+100@gmail.com"};
        for(int index=0;index<validEmails.length;index++){
            boolean email=object.checkEmail(validEmails[index]);
            Assert.assertTrue(email);
        }
    }
    @Test
    public void email_InvalidThenFalse() {
        String invalidEmails[]={"abc","abc()*@gmail.com","abc@.com.my","abc123@gmail.a",
                "abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com",
                "abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com",
                "abc@gmail.com.1a","abc@gmail.com.aa.au"};
        for(int index1=0;index1<invalidEmails.length;index1++) {
            boolean Email = object.checkEmail(invalidEmails[index1]);
            Assert.assertFalse(Email);
        }
    }
}
