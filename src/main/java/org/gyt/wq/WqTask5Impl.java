package org.gyt.wq;

import org.gyt.task.Task5;

/**
 * Created by Administrator on 2016/11/26.
 */
public class WqTask5Impl implements Task5{

    public String getResult(int from, int to) {
        String s = "";
        for (int i = from; i <= to; i++) {
            if (isPrimeNumber(i)) {
                s += i + ",";
                }else if(from < 0 && to < 0){
                    return s;
            }
            }
            s=s.substring(0,s.length()-1);
        return s;
    }
    private boolean isPrimeNumber(int number) {
        if (number < 2){
            return false;
        }
        if (number == 2){
            return true;
        }
        if (number % 2 == 0){
            return false;
        }
        for (int i = 3;i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
   /* public static void main(String[] args) {
        WqTask5Impl wq5=new WqTask5Impl();
        System.out.println(wq5.getResult(-100,10));
    }*/
}
