package org.gyt.wq;

import org.gyt.task.Task3;

/**
 * Created by Administrator on 2016/11/21.
 */
public class WqTask3Impl implements Task3 {

    public String getValues(int count) {
        String  s = new String();
        for(int i = 1;i<=count;i++){
            if(i==count){
                s += i;
            }else {
                s += i + ",";
            }
        }
        return s;
    }
}
