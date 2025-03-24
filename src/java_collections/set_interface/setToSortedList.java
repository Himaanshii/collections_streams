package java_collections.set_interface;

import java.util.*;
public class setToSortedList {
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
        System.out.println("Elements of sorted list of a set are ");
        System.out.println(tosort(set1));
    }
    public static List<Integer> tosort(Set<Integer> set1) {
        List<Integer> ls = new ArrayList<>(set1);
        Collections.sort(ls);
        return ls;
    }

}
