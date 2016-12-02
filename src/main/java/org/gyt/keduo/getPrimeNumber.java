package org.gyt.keduo;
import org.gyt.task.Task5;

/**
 * Created by Administrator on 16-11-29.
 *
 */
public class getPrimeNumber implements Task5 {
    public String getResult( int from , int to ) {
        StringBuilder stringBuilder = new StringBuilder();
        for( int i = from ; i <= to ; i++){
            if( isPrimeNumber( i )){
                stringBuilder.append( i ).append(",");
            }
        }
        if( stringBuilder.length() > 0 ){
            stringBuilder.deleteCharAt( stringBuilder.length() - 1 );
        }
        return  stringBuilder.toString();
    }
    private boolean isPrimeNumber(int num){
        if( num < 2 ){
            return false;
        }
        if( num == 2 ){
            return true;
        }
        if( num % 2 == 0 ){
            return false;
        }
        for( int i = 3 ; i <= Math.floor(Math.sqrt( num )) ; i++){
            if( num % i == 0 ){
                return false;
            }
        }
        return true;
    }
}
