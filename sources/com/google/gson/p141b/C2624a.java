package com.google.gson.p141b;

import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.C2639a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.gson.b.a */
public class C2624a<T> {
    final int hashCode;
    final Class<? super T> rawType;
    final Type type;

    protected C2624a() {
        this.type = C2624a.getSuperclassTypeParameter(getClass());
        this.rawType = C$Gson$Types.m12910e(this.type);
        this.hashCode = this.type.hashCode();
    }

    C2624a(Type type) {
        this.type = C$Gson$Types.m12909d((Type) C2639a.m12930a((Object) type));
        this.rawType = C$Gson$Types.m12910e(this.type);
        this.hashCode = this.type.hashCode();
    }

    static Type getSuperclassTypeParameter(Class<?> cls) {
        cls = cls.getGenericSuperclass();
        if (!(cls instanceof Class)) {
            return C$Gson$Types.m12909d(((ParameterizedType) cls).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type) {
        boolean z = false;
        if (type == null) {
            return false;
        }
        if (this.type.equals(type)) {
            return true;
        }
        if (this.type instanceof Class) {
            return this.rawType.isAssignableFrom(C$Gson$Types.m12910e(type));
        }
        if (this.type instanceof ParameterizedType) {
            return C2624a.isAssignableFrom(type, (ParameterizedType) this.type, new HashMap());
        }
        if (this.type instanceof GenericArrayType) {
            if (this.rawType.isAssignableFrom(C$Gson$Types.m12910e(type)) && C2624a.isAssignableFrom(type, (GenericArrayType) this.type) != null) {
                z = true;
            }
            return z;
        }
        throw C2624a.buildUnexpectedTypeError(this.type, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    @Deprecated
    public boolean isAssignableFrom(C2624a<?> c2624a) {
        return isAssignableFrom(c2624a.getType());
    }

    private static boolean isAssignableFrom(Type type, GenericArrayType genericArrayType) {
        genericArrayType = genericArrayType.getGenericComponentType();
        if (!(genericArrayType instanceof ParameterizedType)) {
            return true;
        }
        if (type instanceof GenericArrayType) {
            type = ((GenericArrayType) type).getGenericComponentType();
        } else if (type instanceof Class) {
            type = (Class) type;
            while (type.isArray()) {
                type = type.getComponentType();
            }
        }
        return C2624a.isAssignableFrom(type, (ParameterizedType) genericArrayType, new HashMap());
    }

    private static boolean isAssignableFrom(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        int i = 0;
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class e = C$Gson$Types.m12910e(type);
        ParameterizedType parameterizedType2 = null;
        if (type instanceof ParameterizedType) {
            parameterizedType2 = (ParameterizedType) type;
        }
        if (parameterizedType2 != null) {
            type = parameterizedType2.getActualTypeArguments();
            TypeVariable[] typeParameters = e.getTypeParameters();
            for (int i2 = 0; i2 < type.length; i2++) {
                Object obj = type[i2];
                TypeVariable typeVariable = typeParameters[i2];
                while (obj instanceof TypeVariable) {
                    Type type2 = (Type) map.get(((TypeVariable) obj).getName());
                }
                map.put(typeVariable.getName(), obj);
            }
            if (C2624a.typeEquals(parameterizedType2, parameterizedType, map) != null) {
                return true;
            }
        }
        type = e.getGenericInterfaces();
        int length = type.length;
        while (i < length) {
            if (C2624a.isAssignableFrom(type[i], parameterizedType, new HashMap(map))) {
                return true;
            }
            i++;
        }
        return C2624a.isAssignableFrom(e.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    private static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        parameterizedType = parameterizedType.getActualTypeArguments();
        parameterizedType2 = parameterizedType2.getActualTypeArguments();
        for (int i = 0; i < parameterizedType.length; i++) {
            if (!C2624a.matches(parameterizedType[i], parameterizedType2[i], map)) {
                return false;
            }
        }
        return true;
    }

    private static AssertionError buildUnexpectedTypeError(Type type, Class<?>... clsArr) {
        StringBuilder stringBuilder = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class name : clsArr) {
            stringBuilder.append(name.getName());
            stringBuilder.append(", ");
        }
        stringBuilder.append("but got: ");
        stringBuilder.append(type.getClass().getName());
        stringBuilder.append(", for type token: ");
        stringBuilder.append(type.toString());
        stringBuilder.append('.');
        return new AssertionError(stringBuilder.toString());
    }

    private static boolean matches(Type type, Type type2, Map<String, Type> map) {
        if (!type2.equals(type)) {
            if (!(type instanceof TypeVariable) || type2.equals(map.get(((TypeVariable) type).getName())) == null) {
                return null;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final boolean equals(Object obj) {
        return (!(obj instanceof C2624a) || C$Gson$Types.m12904a(this.type, ((C2624a) obj).type) == null) ? null : true;
    }

    public final String toString() {
        return C$Gson$Types.m12911f(this.type);
    }

    public static C2624a<?> get(Type type) {
        return new C2624a(type);
    }

    public static <T> C2624a<T> get(Class<T> cls) {
        return new C2624a(cls);
    }

    public static C2624a<?> getParameterized(Type type, Type... typeArr) {
        return new C2624a(C$Gson$Types.m12897a(null, type, typeArr));
    }

    public static C2624a<?> getArray(Type type) {
        return new C2624a(C$Gson$Types.m12896a(type));
    }
}
