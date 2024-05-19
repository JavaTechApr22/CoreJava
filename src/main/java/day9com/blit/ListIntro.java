package day9com.blit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ListIntro {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Hamed");
        names.add("umer");
        names.add("shafiq");
        names.add("yakob");

        System.out.println(names);

        System.out.println(names.size());

        names.add(1, "dlet");
        System.out.println(names);

        System.out.println(names.contains("umer"));
        names.clear();
        System.out.println(names);

        LinkedList<Integer> Students = new LinkedList<>();
//        Students.addFirst();
//        Students.addLast();

//        Stack:
//
//LIFO : LAST IN FIRST OUT

//        pop
//        push
//        peek



    }
}
