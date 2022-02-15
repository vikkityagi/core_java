package collectionmap;
import java.util.*;
public class Map1 {
    public static void main(String args[]){
        Map<String,String> map=new HashMap();
        map.put("A","Amit");
        map.put("B","Rahul");
        map.put("C","Jai");
        map.put("D","Amit");
        //Elements can traverse in any order

        Set set=map.entrySet();
        Iterator iter=set.iterator();
        Map.Entry entry=(Map.Entry)iter.next();
        System.out.println(entry.getKey()+"       "+entry.getValue());
        Map.Entry entry2=(Map.Entry)iter.next();
        System.out.println(entry2.getKey()+"       "+entry2.getValue());
        Map.Entry entry3=(Map.Entry)iter.next();
        System.out.println(entry3.getKey()+"       "+entry3.getValue());
//        System.out.println(iter.next());
//        System.out.println(iter.next());

    }
}
