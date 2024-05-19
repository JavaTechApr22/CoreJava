package day4com.blit;

public class Day4 {
    public static void main(String[] args) {

//        Objects  -> olg -> tcl -> samsung

//        classname objname = new classname();

        Tv        olg =  new Tv("OLED TV", "LG OLED","webOS", 65, 2020, "4K resolution", "Black", 5 );

//            ojbname.attributes

//        olg.type = "OLED TV";
//        olg.model = "LG OLED";
//        olg.os = "webOS";
//        olg.size = 65; // Screen size in inches
//        olg.mfgYear = 2020;
//        olg.specs = "4K resolution";
//        olg.color = "Black";
//        System.out.println(olg);
//
//        System.out.println(olg.type);
//        System.out.println(olg.model);
//        System.out.println(olg.os);
//        System.out.println(olg.size);
//        System.out.println(olg.mfgYear);
//        System.out.println(olg.specs);
//        System.out.println(olg.color);

//    something that perfoms a specific task.
        olg.displayAllTheAttributes();
        olg.changeChannel(10);


//        classname objname = new classname();
//        Tv          tcl = new TV();

        //		public void methodName(type variableName, ....){
//
//		body of a method

//		}

//      call a method=
//    objname.methodname();

//    public int methodname1(int a , int b){
//
//        return a-b;
//    }


//        ACCESS MODIFIERS= controls the access level
//        4 types:
//        1- public: can be accessed within whole java project anywhere
//        2- private : he will be accessible with in that declared class. (where its declared)
//        3- default :this will be accessible with in the same package, if you dont specify a modifier
////		              Java will assign a default modifier.
//        4- protected: this will be  accessible with in the same package and subclasses.

//      Static vs NON static:

//      Keyword called static
//      static members(attributes or methods) its always public.
//      static members(attributes or methods) always associated with the class itself.
//      static members(attributes or methods) can only be accessed by class reference.
    }
}