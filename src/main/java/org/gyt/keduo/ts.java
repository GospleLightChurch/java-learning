package org.gyt.keduo;

public class ts {

    void call(){
        System.out.println("dog call");
    }
    void noCall(String a){

       System.out.println( a +" is a dog no call");
    }
    public static void main(String[] args){
        ts dog = new ts();
        dog.call();
        dog.noCall("Ab");
    }
}
