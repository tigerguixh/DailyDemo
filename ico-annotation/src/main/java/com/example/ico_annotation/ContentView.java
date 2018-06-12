package com.example.ico_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *      绑定ContentView的注解
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface ContentView {
    int value();

}
