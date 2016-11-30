package org.gyt.wq;

import org.gyt.task.Task4;

/**
 * Created by Administrator on 2016/11/26.
 */
public class WqTask4Impl implements Task4{

    public String getFib(int number) {
        String n = "";
        for (int i = 0; i< number; i++){
            n+=i+1;
        }
        return n;
    }
    public static void main(String[] args) {
       WqTask4Impl w4=new WqTask4Impl();
        System.out.println(w4.getFib(20));
    }
}
