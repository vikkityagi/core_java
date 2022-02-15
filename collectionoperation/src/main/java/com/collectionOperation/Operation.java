package com.collectionOperation;
import java.util.*;
public class Operation {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(2);
        list.add(1);

//
//        check data type
//        System.out.println(list+" type of "+((Object)list.getClass().getSimpleName() ));
//        convert list
//        String[] arr=list.toArray(new String[list.size()]);
//        System.out.println(Arrays.toString(arr)+" type of "+((Object)arr.getClass().getSimpleName() ));
//        ListIterator<String> iter=list.listIterator();
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }
//        while(iter.hasPrevious()){
//            System.out.println(iter.previous());
//        }
//        while(iter.hasNext()){
//            System.out.println(iter.nextIndex());
//        }

//        sort array list in desecending order

        Collections.sort(list);
        for (int iter:list){
            System.out.println(iter);
        }


    }
}
