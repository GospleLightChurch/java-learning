package org.gyt.wq;

import org.gyt.task.validator.TaskValidatorFactory;


/**
 * Created by Administrator on 2016/11/21.
 */
public class WqValidation {
    public static void main(String[] args) {
        TaskValidatorFactory.newTask5Validator(new WqTask5Impl()).validate();
    }
}
