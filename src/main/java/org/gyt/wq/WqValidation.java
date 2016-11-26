package org.gyt.wq;


/**
 * Created by Administrator on 2016/11/21.
 */
public class WqValidation extends WqTask3Impl {
    public static void main(String[] args){
        WqValidation wq =new WqValidation();
        System.out.println(wq.getValues(10));
        System.out.println(wq.getValues(20));
        System.out.println(wq.getValues(50));

    }
}
