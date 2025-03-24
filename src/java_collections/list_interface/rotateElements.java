package java_collections.list_interface;
import java.util.*;
public class rotateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number by which array must be rotated ");
        int k = sc.nextInt();
        System.out.println("Rotated array by "+k);
        TorotateArray(arr,k);

    }
    public static void TorotateArray(int[] arr, int k){
        int[] resultArray = new int[arr.length];
        for(int i =0; i< arr.length; i++){
            resultArray[(i+k+1)%arr.length] = arr[i];
        }
        for(int i =0; i<arr.length; i++){
            System.out.print(resultArray[i]+" ");
        }
    }
}
