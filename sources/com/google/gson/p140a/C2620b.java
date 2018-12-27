package com.google.gson.p140a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.google.gson.a.b */
public @interface C2620b {
    /* renamed from: a */
    Class<?> m12854a();

    /* renamed from: b */
    boolean m12855b() default true;
}
