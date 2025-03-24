package java_collections.set_interface;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class symmetricDifference {
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
        System.out.println("symmetric Difference of two sets are ");
        System.out.println(toFindDifference(set1, set2));
    }

    public static Set<Integer> toFindDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> union = union(set1,set2);
        Set<Integer> intersection = intersection(set1,set2);
        Set<Integer> difference = new HashSet<>(union);
        // remove all elements of set2 from set1
        difference.removeAll(intersection);
        return difference;


    }
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2); // return all union elements
        return union;
    }
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> intersection = new HashSet<>(set1);
        // gives intersection of two sets
        intersection.retainAll(set2);
        return intersection;

    }

}
