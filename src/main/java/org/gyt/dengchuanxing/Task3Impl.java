package org.gyt.dengchuanxing;

import org.gyt.task.Task3;

public class Task3Impl implements Task3 {
    public String getValues(int count) {
        String result = "";
        for(int i = 0; i <= count; i++)
        {
            result += String.valueOf(i) + ",";

        }

        return result.substring(0,result.length()-1);
    }

}
