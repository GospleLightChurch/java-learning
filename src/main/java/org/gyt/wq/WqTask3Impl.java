package org.gyt.wq;

import org.gyt.task.Task3;

/**
 * Created by Administrator on 2016/11/21.
 */
public class WqTask3Impl implements Task3 {

    public String getValues(int count) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            str.append(i);
            if (i != count) {
                str.append(',');
            }
        }
        return str.toString();
    }
}
