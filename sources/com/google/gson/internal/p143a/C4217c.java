package com.google.gson.internal.p143a;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: com.google.gson.internal.a.c */
final class C4217c extends C2638b {
    /* renamed from: a */
    private static Class f17781a;
    /* renamed from: b */
    private final Object f17782b = C4217c.m23138b();
    /* renamed from: c */
    private final Field f17783c = C4217c.m23139c();

    C4217c() {
    }

    /* renamed from: a */
    public void mo3340a(AccessibleObject accessibleObject) {
        if (!m23141b(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Gson couldn't modify fields for ");
                stringBuilder.append(accessibleObject);
                stringBuilder.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
                throw new JsonIOException(stringBuilder.toString(), e);
            }
        }
    }

    /* renamed from: b */
    boolean m23141b(java.lang.reflect.AccessibleObject r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r10 = this;
        r0 = r10.f17782b;
        r1 = 0;
        if (r0 == 0) goto L_0x0058;
    L_0x0005:
        r0 = r10.f17783c;
        if (r0 == 0) goto L_0x0058;
    L_0x0009:
        r0 = f17781a;	 Catch:{ Exception -> 0x0058 }
        r2 = "objectFieldOffset";	 Catch:{ Exception -> 0x0058 }
        r3 = 1;	 Catch:{ Exception -> 0x0058 }
        r4 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0058 }
        r5 = java.lang.reflect.Field.class;	 Catch:{ Exception -> 0x0058 }
        r4[r1] = r5;	 Catch:{ Exception -> 0x0058 }
        r0 = r0.getMethod(r2, r4);	 Catch:{ Exception -> 0x0058 }
        r2 = r10.f17782b;	 Catch:{ Exception -> 0x0058 }
        r4 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x0058 }
        r5 = r10.f17783c;	 Catch:{ Exception -> 0x0058 }
        r4[r1] = r5;	 Catch:{ Exception -> 0x0058 }
        r0 = r0.invoke(r2, r4);	 Catch:{ Exception -> 0x0058 }
        r0 = (java.lang.Long) r0;	 Catch:{ Exception -> 0x0058 }
        r4 = r0.longValue();	 Catch:{ Exception -> 0x0058 }
        r0 = f17781a;	 Catch:{ Exception -> 0x0058 }
        r2 = "putBoolean";	 Catch:{ Exception -> 0x0058 }
        r6 = 3;	 Catch:{ Exception -> 0x0058 }
        r7 = new java.lang.Class[r6];	 Catch:{ Exception -> 0x0058 }
        r8 = java.lang.Object.class;	 Catch:{ Exception -> 0x0058 }
        r7[r1] = r8;	 Catch:{ Exception -> 0x0058 }
        r8 = java.lang.Long.TYPE;	 Catch:{ Exception -> 0x0058 }
        r7[r3] = r8;	 Catch:{ Exception -> 0x0058 }
        r8 = java.lang.Boolean.TYPE;	 Catch:{ Exception -> 0x0058 }
        r9 = 2;	 Catch:{ Exception -> 0x0058 }
        r7[r9] = r8;	 Catch:{ Exception -> 0x0058 }
        r0 = r0.getMethod(r2, r7);	 Catch:{ Exception -> 0x0058 }
        r2 = r10.f17782b;	 Catch:{ Exception -> 0x0058 }
        r6 = new java.lang.Object[r6];	 Catch:{ Exception -> 0x0058 }
        r6[r1] = r11;	 Catch:{ Exception -> 0x0058 }
        r11 = java.lang.Long.valueOf(r4);	 Catch:{ Exception -> 0x0058 }
        r6[r3] = r11;	 Catch:{ Exception -> 0x0058 }
        r11 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x0058 }
        r6[r9] = r11;	 Catch:{ Exception -> 0x0058 }
        r0.invoke(r2, r6);	 Catch:{ Exception -> 0x0058 }
        return r3;
    L_0x0058:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.a.c.b(java.lang.reflect.AccessibleObject):boolean");
    }

    /* renamed from: b */
    private static java.lang.Object m23138b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = "sun.misc.Unsafe";	 Catch:{ Exception -> 0x001a }
        r1 = java.lang.Class.forName(r1);	 Catch:{ Exception -> 0x001a }
        f17781a = r1;	 Catch:{ Exception -> 0x001a }
        r1 = f17781a;	 Catch:{ Exception -> 0x001a }
        r2 = "theUnsafe";	 Catch:{ Exception -> 0x001a }
        r1 = r1.getDeclaredField(r2);	 Catch:{ Exception -> 0x001a }
        r2 = 1;	 Catch:{ Exception -> 0x001a }
        r1.setAccessible(r2);	 Catch:{ Exception -> 0x001a }
        r1 = r1.get(r0);	 Catch:{ Exception -> 0x001a }
        return r1;
    L_0x001a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.a.c.b():java.lang.Object");
    }

    /* renamed from: c */
    private static java.lang.reflect.Field m23139c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = java.lang.reflect.AccessibleObject.class;	 Catch:{ NoSuchFieldException -> 0x0009 }
        r1 = "override";	 Catch:{ NoSuchFieldException -> 0x0009 }
        r0 = r0.getDeclaredField(r1);	 Catch:{ NoSuchFieldException -> 0x0009 }
        return r0;
    L_0x0009:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.a.c.c():java.lang.reflect.Field");
    }
}
