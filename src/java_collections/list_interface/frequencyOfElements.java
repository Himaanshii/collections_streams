package java_collections.list_interface;
import java.util.*;
public class frequencyOfElements {
    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<>();
        ls.add("apple");
        ls.add("banana");
        ls.add("apple");
        ls.add("orange");
        toFindFrequency(ls);
    }
    public static void toFindFrequency(ArrayList<String> ls){
        HashMap<String, Integer> map = new HashMap<>();
        for(int i =0; i<ls.size(); i++){

            if(!map.containsKey(ls.get(i))){
                map.put(ls.get(i),1);
            }
            else{
                map.put(ls.get(i),map.get(ls.get(i))+1);
            }
        }
        System.out.print(map);

    }
}
