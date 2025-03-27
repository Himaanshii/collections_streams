package java_regex.advanced_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateIPv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter IPv4 Address");
        String s= sc.nextLine();
        String regex ="^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
        Pattern p = Pattern.compile(regex); // compile regex
        Matcher m = p.matcher(s); // creates matcher object
        if(m.matches()){
            System.out.println(s+" is Valid IPv4 Address");
        }else{
            System.out.println("Invalid");
        }
    }
}
