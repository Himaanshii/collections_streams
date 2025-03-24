package java_collections.list_interface.reverse_list;
import java.util.*;
public class reverseLinkedList
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ls = new LinkedList<>();
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        for(int i =0; i<n; i++){
            int a = sc.nextInt();
            ls.add(a);
        }
        System.out.println("Reversed LinkedList");
        reverse(ls);
    }
    public static void reverse(LinkedList<Integer> ls){
        for(int i =ls.size()-1; i>=0; i--){
            System.out.print(ls.get(i)+" ");
        }
    }
}
