package java_regex.basic_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractDate {
    public static void main(String[] args) {
        // It only checks date format and not logical date .
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        String text = sc.nextLine();
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println("Date found : "+ m.group());
        }
    }
}
