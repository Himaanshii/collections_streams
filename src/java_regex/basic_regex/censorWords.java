package java_regex.basic_regex;
import java.util.*;
import java.util.regex.Pattern;

public class censorWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        List<String> badWords = Arrays.asList("damn", "stupid");
        String regex = "\\b(" + String.join("|", badWords) + ")\\b";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        String censoredText = p.matcher(text).replaceAll("****");

        System.out.println("Censored Output:");
        System.out.println(censoredText);
    }
}
