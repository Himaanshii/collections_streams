package java_collections.set_interface;
import java.sql.SQLOutput;
import java.util.*;
public class ifSetsEqual {
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
        System.out.println("Check if sets are equal");
        boolean result = ifEqual(set1, set2);
        if(result){
            System.out.println("true");
        } else{
            System.out.println("false");
        }


    }
    public static boolean ifEqual(Set<Integer> set1, Set<Integer> set2){
        List<Integer> ls1 = new ArrayList<>(set1);
        List<Integer> ls2 = new ArrayList<>(set2);
        if(ls1.size() != ls2.size()){
            return false;
        }
        Collections.sort(ls1);
        Collections.sort(ls2);
        if(ls1.equals(ls2)){
            return true;
        }
        return false;
    }

}
