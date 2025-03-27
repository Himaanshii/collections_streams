package java_regex.basic_regex;
import java.util.*;
import java.util.regex.*;
public class replaceMultipleSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        String modifiedText = text.replaceAll("\\s+", " ").trim();

        System.out.println("Modified Output:");
        System.out.println(modifiedText);
    }
}
