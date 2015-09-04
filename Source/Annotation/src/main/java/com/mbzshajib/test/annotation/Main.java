package com.mbzshajib.test.annotation;

import com.mbzshajib.test.annotation.annotation.Currency;
import com.mbzshajib.test.annotation.test.FieldTest;

import java.lang.reflect.Field;

/**
 * *****************************************************************
 * Copyright  2015.
 * Author - Md. Badi-Uz-Zaman Shajib
 * Email  - mbzshajib@gmail.com
 * GitHub - https://github.com/mbzshajib 
 * date: 9/4/2015
 * time: 5:05 PM
 * ****************************************************************
 */
     

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        FieldTest fieldTest = new FieldTest();
        Field fields = fieldTest.getClass().getField(Currency.class.getName());
        System.out.println(fields);
//        for(Field field: fields){
//            System.out.println(field.getAnnotations().length);
//        }
    }
}
