package java_regex.basic_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractCapitalizedWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String regex = "[A-Z]+[a-zA-Z]{1,}";
        String text = sc.nextLine();
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println("Capitalized letter found : "+ m.group());
        }
    }
}
