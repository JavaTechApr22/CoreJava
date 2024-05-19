package day9com.blit;

import java.util.*;

public class SetIntro {
    public static void main(String[] args) {
//        GenericsClass <Integer> obj1 = new GenericsClass<>(8);
        Set <Integer> set1 = new HashSet<>();

        set1.add(null);
        set1.add(2);
        set1.add(54);
        set1.add(21);
        set1.add(65); // chwebicuwoeiufc

        set1.add(65);

        System.out.println(set1);

        set1.remove(21);
        System.out.println(set1);

        System.out.println(set1.contains(65));
        System.out.println(set1.isEmpty());

        set1.clear();

        // LinkedHashSet maintains the insertion order
        //  it needs more memory than hashset

//        tree set:
        SortedSet<Integer> set2 = new TreeSet<>(); // normal tree set min -- max order
//        SortedSet<Integer> set2 = new TreeSet<>(Comparator.reverseOrder());  if you want max -- min order

        set2.add(65);
        set2.add(45);
        set2.add(70);

        System.out.println(set2);


//        hashSet                                 LinkedHashSet                        treeSet
//		uses arrays                                linkedList                       balancedBinary trees
//		can store null values                  can store null values            can not store null values
//		doesnot follow insertion order        follows insertion order             follows sorting order

//        all the items are unique-> every data has its unique name in memory

    }
}
