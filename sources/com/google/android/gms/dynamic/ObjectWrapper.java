package com.google.android.gms.dynamic;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import java.lang.reflect.Field;

@KeepForSdk
public final class ObjectWrapper<T> extends Stub {
    /* renamed from: a */
    private final T f19627a;

    private ObjectWrapper(T t) {
        this.f19627a = t;
    }

    @KeepForSdk
    /* renamed from: a */
    public static <T> IObjectWrapper m26019a(T t) {
        return new ObjectWrapper(t);
    }

    @KeepForSdk
    /* renamed from: a */
    public static <T> T m26020a(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).f19627a;
        }
        iObjectWrapper = iObjectWrapper.asBinder();
        Field[] declaredFields = iObjectWrapper.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("Unexpected number of IObjectWrapper declared fields: ");
            stringBuilder.append(length);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        } else {
            field.setAccessible(true);
            try {
                return field.get(iObjectWrapper);
            } catch (IObjectWrapper iObjectWrapper2) {
                throw new IllegalArgumentException("Binder object is null.", iObjectWrapper2);
            } catch (IObjectWrapper iObjectWrapper22) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", iObjectWrapper22);
            }
        }
    }
}
