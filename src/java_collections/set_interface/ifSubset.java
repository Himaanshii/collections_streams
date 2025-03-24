package java_collections.set_interface;
import java.util.*;
public class ifSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer>  set1 = new HashSet<>();
        System.out.println("Enter size of set1");
        int n1 = sc.nextInt();
        System.out.println("enter elements of set1");
        for(int i =0; i<n1; i++){
            int a = sc.nextInt();
            set1.add(a);
        }

        Set<Integer>  set2 = new HashSet<>();
        System.out.println("Enter size of set2");
        int n2 = sc.nextInt();
        System.out.println("enter elements of set2");
        for(int i =0; i<n2; i++){
            int a = sc.nextInt();
            set2.add(a);
        }
        System.out.println("If first set is subset of another ? "+ checkIfSubset(set1,set2));
    }
    public static boolean checkIfSubset(Set<Integer> set1, Set<Integer> set2){
        boolean result = set2.containsAll(set1);
        return result;
    }
}
