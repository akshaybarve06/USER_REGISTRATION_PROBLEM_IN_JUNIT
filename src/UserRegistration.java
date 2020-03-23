import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    static String namePattern="^[A-Z][a-zA-Z]{2,}$";
    static String emailPattern="^[a-zA-Z]+([+]?[-]?[.]?[_]?[a-zA-Z0-9]+)?[@]{1}[a-z]+[.]{1}[a-z]{2,}([.]?[a-z]+)?$";
    static String mobilePattern="[0-9]{2}[ ]{1}[0-9]{10}$";
    static String passwordPattern="^([a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*[0-9]*[a-zA-Z0-9]*[@#$&]*[a-zA-Z0-9]*)|([a-zA-Z0-9]*[@#$&]*[a-zA-Z0-9]*[A-Z]*[a-zA-Z0-9]*[0-9]+[a-zA-Z0-9]*)|([a-zA-Z0-9]*[0-9]*[a-zA-Z0-9]*[@#$&]+[a-zA-Z0-9]*[A-Z]*[a-zA-Z0-9]*)$";


    public static void main(String[] args) {
        UserRegistration user=new UserRegistration();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome To User Registration");

        System.out.println("Enter First Name");
        String firstName=sc.next();
        user.checkPattern(namePattern, firstName);

        System.out.println("Enter Last Name");
        String lastName=sc.next();
        user.checkPattern(namePattern, lastName);

        System.out.println("Enter Email");
        String email=sc.next();
        user.checkPattern(emailPattern, email);

        System.out.println("Enter Mobile Number");
        String mobile=sc.next();
        user.checkPattern(mobilePattern, mobile);

        System.out.println("Enter Password");
        String password=sc.next();
        user.checkPassword(passwordPattern, password);
    }

    private void checkPassword(String pattern, String input) {
        if (input.length()>=8) {
            if (Pattern.matches(pattern, input))
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
        else
            System.out.println("Invalid");
    }

    private void checkPattern(String pattern, String input) {
        if (Pattern.matches(pattern,input))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
