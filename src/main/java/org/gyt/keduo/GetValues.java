package org.gyt.keduo;

import org.gyt.task.Task3;

/**
 * 第三次作业
 * 输出字符串
 * Created by Administrator on 16-11-24.
 */
public class GetValues implements Task3{

    private String ch = null ;

    public String getValues( int num ){
        if( num < 0){
            System.out.println("Down Error");
        }
        if( num >100 ){
            System.out.println("Up Error");
        }
        for ( int i=1; i<=num; i++){
            ch = ch + "," + Integer.toString( i );
            System.out.println( ch );
        }
        return ch;
    }
}
