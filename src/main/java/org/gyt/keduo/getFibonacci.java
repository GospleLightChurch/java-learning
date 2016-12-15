package org.gyt.keduo;
import org.gyt.task.Task4;
/**
 * Created by Administrator on 16-11-30.
 */
public class getFibonacci implements Task4{
    private int f1 = 1;
    private int f2 = 1;
    private int f3 = 0;
    private int count = 2;
    public String getFib( int num ){
        StringBuilder stringBuilder = new StringBuilder();
        if( num <= 0 ){
            return "";
        }
        if( num == 1 ){
            return "1";
        }
        if( num == 2 ){
            return "1,1";
        }
        while( count < num ){

            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            stringBuilder.append(f3).append( "," );
            count++;
        }
        stringBuilder.insert(0,"1,1,");
        if( stringBuilder.length() > 0 ){
            stringBuilder.deleteCharAt( stringBuilder.length() -1 );
        }
        return stringBuilder.toString();
    }
}
