package org.gyt.keduo;

import org.gyt.keduo.*;
import org.gyt.task.validator.TaskValidatorFactory;

public class KeDuoValidation {
    public static void main(String[] args) {
        //TaskValidatorFactory.newTask3Validator(new GetValues()).validate();
        TaskValidatorFactory.newTask5Validator(new getPrimeNumber()).validate();
        TaskValidatorFactory.newTask4Validator(new getFibonacci()).validate();
    }
}
