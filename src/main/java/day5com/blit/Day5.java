package day5com.blit;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Day5 {
    public static void main(String[] args) {
//        Arrays

//        Arrays are fixed in size
//        same data type can only be stored
//         clssname  objname = new classname();
//       	it will give you certain methods to do certain actions.

        //	     dataType[] arrayVariableName = new  dataType[sizeOfArray];
        String[]    c               =  new  String[10];

        c[0] = "dlet";
        c[1]= "hamed";

//                    make 10 persons with 10 names (string)

//                     100, 200, 300 - 1000  (int)
        System.out.println(Arrays.toString(c));

        System.out.println("-----------------------------------");
//        dataType[] arrayVariableName = { };

        int [] d = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        System.out.println(d[6]);
        System.out.println(Arrays.toString(d));

        System.out.println("-----------------------------------");

        String [] s = {"hamed", "shafiq", "omerCoder","dlet"};

        for (int i = 0; i<s.length; i++){
            System.out.println(s[i]);
        }
//        System.out.println(Arrays.toString(s));

        System.out.println("-----------------------------------");

        Grandchild obj1 = new Grandchild();
        obj1.honk();

        Child obj2 = new Child();
        obj2.honk();

    }
}
