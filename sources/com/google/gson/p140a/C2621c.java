package com.google.gson.p140a;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.google.gson.a.c */
public @interface C2621c {
    /* renamed from: a */
    String m12856a();

    /* renamed from: b */
    String[] m12857b() default {};
}
