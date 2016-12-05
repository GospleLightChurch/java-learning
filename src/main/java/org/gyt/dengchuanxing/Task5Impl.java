package org.gyt.dengchuanxing;

import org.gyt.task.Task5;


public class Task5Impl implements Task5 {
    public String getResult(int from, int to) {
        String result = "";
        for (int i = from; i<= to ; i ++)
        {
            if(isPrimeNum(i))
            {
                result +=  String.valueOf(i) + ",";
            }
        }
        return  result.substring(0,result.length()-1);
    }

    private boolean isPrimeNum(int num) {
        boolean result = true;

        if(num == 0 || num == 1)
        {
            result = false;
        }
        else if(num == 2)
        {
            result = true;
        }
        else if(num % 2 == 0)
        {
            result = false;
        }
        else
        {
            result = true;
        }

        return result;
    }
}
