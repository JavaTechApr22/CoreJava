package day4com.blit;

public class Tv {
    //    Tv -> has Attributes -> type, model, os, size, mfgYear, specs, color
//    Objects  -> olg -> tcl -> samsung
    String type;
    String model;
    String os;
    int size;
    int mfgYear;
    String specs;
    String color;
    int changeChannel;

    public Tv (String type,  String model, String os, int size,int mfgYear, String specs, String color, int changeChannel){
//        this = this says i am representing this class
//        this.type= type;
        this.model=model;
        this.os=os;
        this.size=size;
        this.mfgYear=mfgYear;
        this.specs=specs;
        this.color=color;
        this.changeChannel=changeChannel;

    }
// watching

    public void displayAllTheAttributes (){
        System.out.println(type);
        System.out.println(model);
        System.out.println(os);
        System.out.println(size);
        System.out.println(mfgYear);
        System.out.println(specs);
        System.out.println(color);
    }

//    create a function watching

    public void changeChannel (int newChannelNo){
        changeChannel=newChannelNo;
        System.out.println(changeChannel);
    }

}
