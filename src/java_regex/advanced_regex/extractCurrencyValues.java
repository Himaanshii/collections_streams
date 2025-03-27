package java_regex.advanced_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractCurrencyValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text");
        String s= sc.nextLine();
        String regex = "\\$?\\d+\\.\\d{2}";
        Pattern p = Pattern.compile(regex); // compile regex
        Matcher m = p.matcher(s); // creates matcher object
        while(m.find()){
            System.out.println("Currency Value found: "+ m.group());
        }
    }
}
