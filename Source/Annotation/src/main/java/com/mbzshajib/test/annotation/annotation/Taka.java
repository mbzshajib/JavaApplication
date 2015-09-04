package com.mbzshajib.test.annotation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * *****************************************************************
 * Copyright  2015.
 * Author - Md. Badi-Uz-Zaman Shajib
 * Email  - mbzshajib@gmail.com
 * GitHub - https://github.com/mbzshajib
 * date: 9/4/2015
 * time: 5:07 PM
 * ****************************************************************
 */


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Taka {
    String name() default "Taka";

    String country() default "Bangladesh";

    String code() default "50";

}
