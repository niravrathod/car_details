package com.google.android.youtube.player.internal;

import android.os.IBinder;
import com.google.android.youtube.player.internal.C2557x.C4182a;
import java.lang.reflect.Field;

/* renamed from: com.google.android.youtube.player.internal.y */
public final class C4721y<T> extends C4182a {
    /* renamed from: a */
    private final T f20774a;

    private C4721y(T t) {
        this.f20774a = t;
    }

    /* renamed from: a */
    public static <T> C2557x m27413a(T t) {
        return new C4721y(t);
    }

    /* renamed from: a */
    public static <T> T m27414a(C2557x c2557x) {
        if (c2557x instanceof C4721y) {
            return ((C4721y) c2557x).f20774a;
        }
        IBinder asBinder = c2557x.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (field.isAccessible()) {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (Throwable e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (Throwable e2) {
                throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
            } catch (Throwable e22) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e22);
            }
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
}
