package java_regex.advanced_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateSSN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter SSN");
        String s= sc.nextLine();
        String regex ="\\d{3}-\\d{2}-\\d{4}";
        Pattern p = Pattern.compile(regex); // compile regex
        Matcher m = p.matcher(s); // creates matcher object
        if(m.matches()){
            System.out.println(s+" is Valid SSN");
        }else{
            System.out.println("Invalid");
        }
    }
}
