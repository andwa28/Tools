package com.andwa.util.lazy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.LazyLoader;

import java.util.function.Supplier;

public class Proxys {
    public static <T> T lazyOf(Supplier<T> supplier, Class<T> clazz) {
        return (T) Enhancer.create(clazz, (LazyLoader) supplier::get);
    }
}
