package day8com.blit;

public class Day8 {
    public static void main(String[] args) {


//        Exceptions :
//    there are 2 typesof exceptions:
//    1- checked exceptions:
//    checked at compile time ,
//    declared using a 'throws' keyword
//    methods that might throw an checked exceptions must be handled using try/catch block
//    2 - Unchecked exception:
//    not checked at the compile time it comes in the runtime
//    declared using a 'throw' keyword
//    caught explicitly
        int a = 100;
        int b = 10;
//    Errors:
        div(a,b);
        try {
            div(a,b);
        }catch (Exception e){
            System.out.println(e);
        }finally {
        }

    }

    public static void div(int a, int b) {
        System.out.println(a/b);
    }

}