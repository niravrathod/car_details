package com.google.gson.internal.bind;

import com.google.gson.C2628d;
import com.google.gson.C2629e;
import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.C2640b;
import com.google.gson.internal.C2649d;
import com.google.gson.internal.C2651f;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.p143a.C2638b;
import com.google.gson.p140a.C2620b;
import com.google.gson.p140a.C2621c;
import com.google.gson.p141b.C2624a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements C2661r {
    /* renamed from: a */
    private final C2640b f17826a;
    /* renamed from: b */
    private final C2628d f17827b;
    /* renamed from: c */
    private final Excluder f17828c;
    /* renamed from: d */
    private final JsonAdapterAnnotationTypeAdapterFactory f17829d;
    /* renamed from: e */
    private final C2638b f17830e = C2638b.m12928a();

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b */
    static abstract class C2641b {
        /* renamed from: h */
        final String f11162h;
        /* renamed from: i */
        final boolean f11163i;
        /* renamed from: j */
        final boolean f11164j;

        /* renamed from: a */
        abstract void mo3342a(JsonReader jsonReader, Object obj);

        /* renamed from: a */
        abstract void mo3343a(JsonWriter jsonWriter, Object obj);

        /* renamed from: a */
        abstract boolean mo3344a(Object obj);

        protected C2641b(String str, boolean z, boolean z2) {
            this.f11162h = str;
            this.f11163i = z;
            this.f11164j = z2;
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a */
    public static final class C4230a<T> extends C2660q<T> {
        /* renamed from: a */
        private final C2649d<T> f17824a;
        /* renamed from: b */
        private final Map<String, C2641b> f17825b;

        C4230a(C2649d<T> c2649d, Map<String, C2641b> map) {
            this.f17824a = c2649d;
            this.f17825b = map;
        }

        /* renamed from: b */
        public T mo3332b(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Object a = this.f17824a.mo3341a();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    C2641b c2641b = (C2641b) this.f17825b.get(jsonReader.nextName());
                    if (c2641b != null) {
                        if (c2641b.f11164j) {
                            c2641b.mo3342a(jsonReader, a);
                        }
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return a;
            } catch (Throwable e) {
                throw new JsonSyntaxException(e);
            } catch (JsonReader jsonReader2) {
                throw new AssertionError(jsonReader2);
            }
        }

        /* renamed from: a */
        public void mo3331a(JsonWriter jsonWriter, T t) {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (C2641b c2641b : this.f17825b.values()) {
                    if (c2641b.mo3344a(t)) {
                        jsonWriter.name(c2641b.f11162h);
                        c2641b.mo3343a(jsonWriter, (Object) t);
                    }
                }
                jsonWriter.endObject();
            } catch (JsonWriter jsonWriter2) {
                throw new AssertionError(jsonWriter2);
            }
        }
    }

    public ReflectiveTypeAdapterFactory(C2640b c2640b, C2628d c2628d, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f17826a = c2640b;
        this.f17827b = c2628d;
        this.f17828c = excluder;
        this.f17829d = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* renamed from: a */
    public boolean m23183a(Field field, boolean z) {
        return m23181a(field, z, this.f17828c);
    }

    /* renamed from: a */
    static boolean m23181a(Field field, boolean z, Excluder excluder) {
        return (excluder.m23134a(field.getType(), z) || excluder.m23135a(field, z) != null) ? null : true;
    }

    /* renamed from: a */
    private List<String> m23179a(Field field) {
        C2621c c2621c = (C2621c) field.getAnnotation(C2621c.class);
        if (c2621c == null) {
            return Collections.singletonList(this.f17827b.mo4413a(field));
        }
        field = c2621c.m12856a();
        String[] b = c2621c.m12857b();
        if (b.length == 0) {
            return Collections.singletonList(field);
        }
        List<String> arrayList = new ArrayList(b.length + 1);
        arrayList.add(field);
        for (Object add : b) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    public <T> C2660q<T> mo3339a(C2629e c2629e, C2624a<T> c2624a) {
        Class rawType = c2624a.getRawType();
        if (Object.class.isAssignableFrom(rawType)) {
            return new C4230a(this.f17826a.m12935a((C2624a) c2624a), m23180a(c2629e, (C2624a) c2624a, rawType));
        }
        return null;
    }

    /* renamed from: a */
    private C2641b m23178a(C2629e c2629e, Field field, String str, C2624a<?> c2624a, boolean z, boolean z2) {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        C2629e c2629e2 = c2629e;
        C2624a c2624a2 = c2624a;
        final boolean a = C2651f.m12953a(c2624a.getRawType());
        Field field2 = field;
        C2620b c2620b = (C2620b) field.getAnnotation(C2620b.class);
        C2660q a2 = c2620b != null ? reflectiveTypeAdapterFactory.f17829d.m23164a(reflectiveTypeAdapterFactory.f17826a, c2629e, c2624a2, c2620b) : null;
        final boolean z3 = a2 != null;
        if (a2 == null) {
            a2 = c2629e.m12873a(c2624a2);
        }
        final C2660q c2660q = a2;
        field2 = field;
        c2629e2 = c2629e;
        final C2624a<?> c2624a3 = c2624a;
        return new C2641b(this, str, z, z2) {
            /* renamed from: g */
            final /* synthetic */ ReflectiveTypeAdapterFactory f17823g;

            /* renamed from: a */
            void mo3343a(JsonWriter jsonWriter, Object obj) {
                C2660q c2660q;
                obj = field2.get(obj);
                if (z3) {
                    c2660q = c2660q;
                } else {
                    c2660q = new C4241h(c2629e2, c2660q, c2624a3.getType());
                }
                c2660q.mo3331a(jsonWriter, obj);
            }

            /* renamed from: a */
            void mo3342a(JsonReader jsonReader, Object obj) {
                jsonReader = c2660q.mo3332b(jsonReader);
                if (jsonReader != null || !a) {
                    field2.set(obj, jsonReader);
                }
            }

            /* renamed from: a */
            public boolean mo3344a(Object obj) {
                boolean z = false;
                if (!this.i) {
                    return false;
                }
                if (field2.get(obj) != obj) {
                    z = true;
                }
                return z;
            }
        };
    }

    /* renamed from: a */
    private Map<String, C2641b> m23180a(C2629e c2629e, C2624a<?> c2624a, Class<?> cls) {
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        Map<String, C2641b> linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = c2624a.getType();
        C2624a c2624a2 = c2624a;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                AccessibleObject accessibleObject = declaredFields[i];
                boolean a = m23183a((Field) accessibleObject, true);
                boolean a2 = m23183a((Field) accessibleObject, z);
                if (a || a2) {
                    C2641b c2641b;
                    reflectiveTypeAdapterFactory.f17830e.mo3340a(accessibleObject);
                    Type a3 = C$Gson$Types.m12900a(c2624a2.getType(), cls2, accessibleObject.getGenericType());
                    List a4 = m23179a(accessibleObject);
                    int size = a4.size();
                    C2641b c2641b2 = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = (String) a4.get(i2);
                        boolean z2 = i2 != 0 ? false : a;
                        String str2 = str;
                        c2641b = c2641b2;
                        int i3 = i2;
                        int i4 = size;
                        List list = a4;
                        AccessibleObject accessibleObject2 = accessibleObject;
                        c2641b2 = c2641b == null ? (C2641b) linkedHashMap.put(str2, m23178a(c2629e, accessibleObject, str2, C2624a.get(a3), z2, a2)) : c2641b;
                        i2 = i3 + 1;
                        a = z2;
                        a4 = list;
                        size = i4;
                        accessibleObject = accessibleObject2;
                    }
                    c2641b = c2641b2;
                    if (c2641b != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(type);
                        stringBuilder.append(" declares multiple JSON fields named ");
                        stringBuilder.append(c2641b.f11162h);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                i++;
                z = false;
            }
            c2624a2 = C2624a.get(C$Gson$Types.m12900a(c2624a2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = c2624a2.getRawType();
        }
        return linkedHashMap;
    }
}
