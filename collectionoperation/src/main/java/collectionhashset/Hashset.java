package collectionhashset;
import java.util.*;
public class Hashset {
    public static void main(String args[]){
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("C");

        Set<String> set= new HashSet<>(list);

//        add element into the set
        set.add("8");
        set.add("5");
        set.add("7");
        set.add("2");
        set.add("1");

//        remove element into the array list


        System.out.println(set);
    }
}
