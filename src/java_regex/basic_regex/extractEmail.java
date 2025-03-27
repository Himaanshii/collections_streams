package java_regex.basic_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        String text = sc.nextLine();
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println("Email Address found: "+ m.group());
        }
    }
}
