package task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String login = "abc";
        String password = "abcd123";

        Pattern p1 = Pattern.compile("[A-Za-z]+");
        Matcher m1 = p1.matcher(login);

        Pattern p2 = Pattern.compile("\\w{6,16}");
        Matcher m2 = p2.matcher(password);

        System.out.println(m1.matches());
        System.out.println(m2.matches());
    }
}
