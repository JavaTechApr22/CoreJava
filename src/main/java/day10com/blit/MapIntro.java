package day10com.blit;

import com.sun.jdi.Value;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapIntro {
    public static void main(String[] args) {
//        we have couples here = key and value pairs 1=hamed
//        1- hashmap
//        2- linkedhashmap
//        3- treemap
        TreeMap<Integer,String> map1 = new TreeMap<>(Comparator.reverseOrder());
//             1  =hamed
        map1.put(2,"Omer");
        map1.put(7,"Nick");
        map1.put(5,"dlet");
        System.out.println(map1);

        map1.put(2, "mike");
        System.out.println(map1);

        System.out.println(map1.containsKey(3));
        System.out.println(map1.containsValue("Daradar"));

//        Iteration : its like a for loop which means : a running block of code
//
//        for (Integer key : map1.keySet()){
//            System.out.println(key);
//        }
//
//        for (String Value : map1.values()){
//            System.out.println(Value);
//        }
//        for (Map.Entry<Integer,String> map3 : map1.entrySet()){
//            System.out.println(map3.getKey());
//            System.out.println(map3.getValue());
//        }

//        show me just the values



//		     hashMap                               LinkedHashMap                         TreeMap
//		 we can store null values                we can store null values        we can not store null values
//      does not follow insertion order        does follow insertion order         does follow sorting order

    }
}
