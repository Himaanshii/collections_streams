package java_regex.basic_regex;
import java.util.*;
import java.util.regex.*;

public class validateLicensePlateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter License Plate Number to validate ");
        String s = sc.nextLine();
        String regex = "^[A-Z]{2}\\d{4}$"; // \\d{4} means it matches exactlt 4 digits
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if(m.matches()){
            System.out.println("valid");
        }else{
            System.out.println("Invalid");
        }

    }
}
