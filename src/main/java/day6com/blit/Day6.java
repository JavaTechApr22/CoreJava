package day6com.blit;

import java.util.Scanner;

public final class Day6 {

    public static void main(String[] args) {

//     Scanner :
//   	Scanner class is used to get user input
//  	its imported from java.util
//          Strings = .nextline();
//          but other all data types need to call their next methods
//        .nextint();
//        .nextdouble();
//          and then again call the nextline(); method.


        Scanner sc1 = new Scanner(System.in);
//        system.in = means we are saying that system will provide you the information
        Student student1 = new Student();
//        1= create the sout of print statements first
        System.out.println("Enter you id: ");
//        2= then use the scanner object
        int sid = sc1.nextInt();
//        3= then call the next line methods on that scanner object
        sc1.nextLine();
//        4-  then call the set method, and it will set the new values from user
        student1.setId(sid);

        System.out.println("Enter your name: ");
        String sName = sc1.nextLine();
        student1.setName(sName);

        System.out.println("Enter your age: ");
        int sAge = sc1.nextInt();
        sc1.nextLine();
        student1.setAge(sAge);

        System.out.println("Enter your Gpa: ");
        int sGpa = sc1.nextInt();
        sc1.nextLine();
        student1.setGpa(sGpa);
//        then create a tostring method in Student class
//        then it will print the stored values too..
        System.out.println(student1);

        // take a input
//	      -> firstName
//	      -> lastNAme
//	      -> phonenumber
//	      -> email
//	      -> dob 12-4-2022
//	      -> age
//	      -> address

    }


}