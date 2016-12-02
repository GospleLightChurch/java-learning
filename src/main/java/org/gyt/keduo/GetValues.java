package org.gyt.keduo;

import org.gyt.task.Task3;

/**
 * 第三次作业
 * 输出字符串
 * Created by Administrator on 16-11-24.
 */
public class GetValues implements Task3 {

    private String ch = "";

    public String getValues(int num) {
        if (num <= 0) {
            ch = "";
        }else {
            for (int i = 0; i < num; i++) {
                ch += (i+1)+",";
            }
            ch = ch.substring(0, ch.length() - 1);
        }
        return ch;
    }
}
