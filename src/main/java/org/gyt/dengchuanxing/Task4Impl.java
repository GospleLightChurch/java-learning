package org.gyt.dengchuanxing;

import org.gyt.task.Task4;

/**
 * Created by Administrator on 2016/11/28.
 */
public class Task4Impl implements Task4 {

    public String getFib(int number) {
        String text= "";
        for(int i = 0; i < number; i++)
        {
            text += String.valueOf(GetFibNum(i)) + ",";
        }

        return text.substring(0,text.length()-1);
    }

    public int GetFibNum(int index)
    {
        int result = -1;
        if(index == 0)
        {
            result = 0;
        }
        else if(index == 1 || index == 2)
        {
            result = 1;
        }
        else
        {
            result = GetFibNum(index - 2) + GetFibNum(index - 1);
        }

        return result;
    }
}
