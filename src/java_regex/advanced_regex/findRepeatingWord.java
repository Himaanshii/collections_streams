package java_regex.advanced_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findRepeatingWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text");
        String s= sc.nextLine();
        String regex = "\\b(\\w+)\\s+\\1\\b";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // compile regex
        Matcher m = p.matcher(s); // creates matcher object
        while(m.find()){
            System.out.println("Word found: "+ m.group(1));
        }
    }
}
