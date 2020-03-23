package Main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    static String namePattern="^[A-Z][a-zA-Z]{2,}$";

    public static void main(String[] args) {
        System.out.println("Welcome To User Registration");
    }
    public boolean checkName(String firstName) {
        return Pattern.matches(namePattern,firstName);
    }
}
