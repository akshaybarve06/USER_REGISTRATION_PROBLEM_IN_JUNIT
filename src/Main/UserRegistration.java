package Main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    String namePattern="^[A-Z][a-zA-Z]{2,}$";
    String emailPattern="^[a-zA-Z]+([+]?[-]?[.]?[_]?[a-zA-Z0-9]+)?[@]{1}[a-z]+[.]{1}[a-z]{2,}([.]?[a-z]+)?$";
    String mobilePattern="[0-9]{2}[ ]{1}[0-9]{10}$";
    String passwordPattern1="[a-zA-Z0-9]{8,}$";
    String passwordPattern2="^([a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*)+$";
    String passwordPattern3="^([A-Z0-9]*[A-Z]+[a-zA-Z0-9]*[0-9]+[a-zA-Z0-9]*)|([a-zA-Z0-9]*[0-9]+[a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*)$";


    public static void main(String[] args) {
        System.out.println("Welcome To User Registration");
    }
    public boolean checkName(String name) {
        return Pattern.matches(namePattern,name);
    }
    public boolean checkEmail(String email) {
        return Pattern.matches(emailPattern,email);
    }
    public boolean checkMobile(String mobile) {
        return Pattern.matches(mobilePattern,mobile);
    }
    public boolean checkPassword1(String password1) {
        return Pattern.matches(passwordPattern1,password1);
    }
    public boolean checkPassword2(String password2) {
        if (password2.length() >= 8)
            return (Pattern.matches(passwordPattern2, password2));
        else
            return false;
    }
    public boolean checkPassword3(String password3) {
        if (password3.length() >= 8)
            return (Pattern.matches(passwordPattern3, password3));
        else
            return false;
    }

}
