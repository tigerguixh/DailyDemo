package com.example.ioc_apu;

/**
 *
 *      注入接口
 */

public interface ViewInject<T> {
    void inject(T target, Object source);
}
