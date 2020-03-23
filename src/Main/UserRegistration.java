package Main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    String namePattern="^[A-Z][a-zA-Z]{2,}$";
    String emailPattern="^[a-zA-Z]+([+]?[-]?[.]?[_]?[a-zA-Z0-9]+)?[@]{1}[a-z]+[.]{1}[a-z]{2,}([.]?[a-z]+)?$";
    String mobilePattern="[0-9]{2}[ ]{1}[0-9]{10}$";
    String passwordPattern="[a-zA-Z0-9]{8,}$";

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
    public boolean checkPassword(String password) {
        return Pattern.matches(passwordPattern,password);
    }

}
