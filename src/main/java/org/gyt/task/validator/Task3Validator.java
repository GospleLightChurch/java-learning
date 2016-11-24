package org.gyt.task.validator;

import org.gyt.task.Task3;
import org.omg.CORBA.StringHolder;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Task3Validator implements TaskValidator {

    private Task3 task;

    public Task3Validator(Task3 task) {
        this.task = task;
    }

    public void validate(){
        try{
            task.getValues( 5 );
            task.getValues( -1 );
            task.getValues( 1000 );

            assertEquals(",1,2,3,4,5",task.getValues( 5 ),0);
            assertEquals("Down Error",task.getValues(-1),0);
            assertEquals("Up Error",task.getValues(1000),0);
            TaskValidatorUtils.getLogger().info(String.format("success",task.getClass().getName()));
        }catch (AssertionError e){
            TaskValidatorUtils.getLogger().info(String.format("failure",task.getClass().getName(),e.getMessage()));
            e.printStackTrace();
        }
    }
}