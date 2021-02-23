package task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String regex = "\\bfor|on|by|For\\b";

    public static void main(String[] args) {
        String text = "For the time being, Java Guardians sees the situation as status quo. " + "\"If after all this we see" +
                "no real activity or details after JavaOne, it will be very worrisome indeed,\" " +
                "Rahman said. An online petition has been posted on by Java EE Guardians urging Oracle to move forward with EE or " +
                "turn the work over to others. As of Tuesday, the petition had more than 3200 signatures. " +
                "Java EE Guardians has pondered developing enterprise-level Java improvements on its own.";

        System.out.println(text.replaceAll(regex, "Java"));

//        final Pattern pattern = Pattern.compile(regex);
//        final Matcher matcher = pattern.matcher(text);
//
//        StringBuffer stringBuilder = new StringBuffer();
//
//        while (matcher.find()) {
//            matcher.appendReplacement(stringBuilder, "Java");
//        }
//
//        matcher.appendTail(stringBuilder);
//        System.out.println(stringBuilder);

    }
}
