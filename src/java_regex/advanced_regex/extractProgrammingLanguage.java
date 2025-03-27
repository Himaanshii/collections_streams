package java_regex.advanced_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractProgrammingLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text");
        String s= sc.nextLine();
        String regex = "\\b(Java|Python|JavaScript|Go|C|C\\+\\+|Ruby)\\b";
        Pattern p = Pattern.compile(regex); // compile regex
        Matcher m = p.matcher(s); // creates matcher object
        while(m.find()){
            System.out.println("Programming Language found: "+ m.group());
        }
    }
}
