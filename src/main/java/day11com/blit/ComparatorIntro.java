package day11com.blit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorIntro {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student(1,"Alice"));
        s.add(new Student(4,"Bob"));
        s.add(new Student(2,"John"));
        s.add(new Student(3,"Loius"));

        Collections.sort(s, new IdComparator());

        for (Student ss : s){
            System.out.println(ss.getId() +"="+ ss.getName());
        }
    }
}
