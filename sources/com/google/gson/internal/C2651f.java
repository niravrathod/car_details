package com.google.gson.internal;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.gson.internal.f */
public final class C2651f {
    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f11220a;
    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f11221b;

    static {
        Map hashMap = new HashMap(16);
        Map hashMap2 = new HashMap(16);
        C2651f.m12952a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        C2651f.m12952a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        C2651f.m12952a(hashMap, hashMap2, Character.TYPE, Character.class);
        C2651f.m12952a(hashMap, hashMap2, Double.TYPE, Double.class);
        C2651f.m12952a(hashMap, hashMap2, Float.TYPE, Float.class);
        C2651f.m12952a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        C2651f.m12952a(hashMap, hashMap2, Long.TYPE, Long.class);
        C2651f.m12952a(hashMap, hashMap2, Short.TYPE, Short.class);
        C2651f.m12952a(hashMap, hashMap2, Void.TYPE, Void.class);
        f11220a = Collections.unmodifiableMap(hashMap);
        f11221b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m12952a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: a */
    public static boolean m12953a(Type type) {
        return f11220a.containsKey(type);
    }

    /* renamed from: a */
    public static <T> Class<T> m12951a(Class<T> cls) {
        Class<T> cls2 = (Class) f11220a.get(C2639a.m12930a((Object) cls));
        return cls2 == null ? cls : cls2;
    }
}
