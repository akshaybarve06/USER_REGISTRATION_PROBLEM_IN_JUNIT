package Test.java;

import org.junit.Assert;
import org.junit.Test;
import Main.java.UserRegistration;

public class UserRegistrationTest {

    UserRegistration userObject=new UserRegistration();
    //FirstName Tests
    @Test
    public void userFirstName_ValidThenTrue(){
        boolean firstName=userObject.checkName("SampleFirstName");
        Assert.assertTrue(firstName);
    }
    @Test
    public void userFirstName_InvalidThenFalse(){
        boolean firstName=userObject.checkName("samplefirstname");
        Assert.assertFalse(firstName);
    }
    //LastName Tests
    @Test
    public void userLastName_ValidThenTrue(){
        boolean lastName=userObject.checkName("SampleLastName");
        Assert.assertTrue(lastName);
    }
    @Test
    public void userLastName_InvalidThenFalse(){
        boolean lastName=userObject.checkName("samplelastname");
        Assert.assertFalse(lastName);
    }
    //Email Tests
    @Test
    public void email_ValidThenTrue() {
        String validEmails[]={"abc.xyz@bl.co.in","abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com",
                "abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au",
                "abc@gmail.com.com","abc+100@gmail.com"};
        for(int index=0;index<validEmails.length;index++){
            boolean email=userObject.checkEmail(validEmails[index]);
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
            boolean Email = userObject.checkEmail(invalidEmails[index1]);
            Assert.assertFalse(Email);
        }
    }
    //Mobile Number Pattern
    @Test
    public void mobileNumber_ValidThenTrue() {
        boolean MobileNumber=userObject.checkMobile("91 1234567890");
        Assert.assertTrue(MobileNumber);
    }
    @Test
    public void mobileNumber_ValidThenFalse() {
        boolean MobileNumber=userObject.checkMobile("234567890");
        Assert.assertFalse(MobileNumber);
    }
    //Password Pattern 1
    @Test
    public void password_ValidThenTrue() {
        boolean Password=userObject.checkPassword("abababababab");
        Assert.assertTrue(Password);
    }
    @Test
    public void password_InvalidThenFalse() {
        boolean Password=userObject.checkPassword("abab");
        Assert.assertFalse(Password);
    }
    //Password Pattern 2
    @Test
    public void password2_ValidThenTrue() {
        boolean Password2=userObject.checkPassword("AkshayBarve");
        Assert.assertTrue(Password2);
    }
    @Test
    public void password2_InvalidThenFalse() {
        boolean Password2=userObject.checkPassword("akshaybarve");
        Assert.assertFalse(Password2);
    }
    //Password Pattern 3
    @Test
    public void password3_ValidThenTrue() {
        boolean Password3=userObject.checkPassword("AkshayBarve554");
        Assert.assertTrue(Password3);
    }
    @Test
    public void password3_InvalidThenFalse() {
        boolean Password3=userObject.checkPassword("abababab454");
        Assert.assertFalse(Password3);
    }
    //Password Pattern 4
    @Test
    public void password4_ValidThenTrue() {
        boolean Password4=userObject.checkPassword("AkshayBarve@06");
        Assert.assertTrue(Password4);
    }
    @Test
    public void password4_InvalidThenFalse() {
        boolean Password4=userObject.checkPassword("Akshay@Barve@08");
        Assert.assertFalse(Password4);
    }
}
