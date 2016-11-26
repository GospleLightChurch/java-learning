package org.gyt.aaric;

import org.gyt.task.validator.TaskValidatorFactory;
import org.gyt.wq.WqTask3Impl;

public class AaricValidation {
    public static void main(String[] args) {
        TaskValidatorFactory.newTask1Validator(new Task1Impl()).validate();
        TaskValidatorFactory.newTask2Validator(new Task2Impl()).validate();
        TaskValidatorFactory.newTask3Validator(new WqTask3Impl()).validate();
        TaskValidatorFactory.newTask4Validator(new Task4Impl()).validate();
        TaskValidatorFactory.newTask5Validator(new Task5Impl()).validate();
    }
}
