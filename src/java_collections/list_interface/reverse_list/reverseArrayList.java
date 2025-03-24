package java_collections.list_interface.reverse_list;
import java.util.*;
public class reverseArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<>();
        System.out.println("Enter size of Arraylist");
        int n = sc.nextInt();
        System.out.println("enter elements");
        for(int i =0; i<n; i++){
            int a = sc.nextInt();
            ls.add(a);
        }
        System.out.println("Reversed Arraylist");
        reverse(ls);
    }
    public static void reverse(ArrayList<Integer> ls){
        for(int i=ls.size()-1; i>=0; i--){
            System.out.println(ls.get(i));
        }
    }
}
