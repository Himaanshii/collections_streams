package java_collections.list_interface;
import java.util.*;
public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Integer> input = new LinkedHashSet<>();
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            input.add(a);
        }
        System.out.println(input);

    }
}
