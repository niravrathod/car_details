package com.google.gson;

import com.google.gson.internal.C2640b;
import com.google.gson.internal.C2651f;
import com.google.gson.internal.C2654g;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.C2647i;
import com.google.gson.internal.bind.C4234a;
import com.google.gson.internal.bind.C4235b;
import com.google.gson.internal.bind.C4238e;
import com.google.gson.internal.bind.C4239f;
import com.google.gson.internal.bind.C4240g;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.p141b.C2624a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.google.gson.e */
public final class C2629e {
    /* renamed from: r */
    private static final C2624a<?> f11104r = C2624a.get(Object.class);
    /* renamed from: a */
    final List<C2661r> f11105a;
    /* renamed from: b */
    final Excluder f11106b;
    /* renamed from: c */
    final C2628d f11107c;
    /* renamed from: d */
    final Map<Type, C2631g<?>> f11108d;
    /* renamed from: e */
    final boolean f11109e;
    /* renamed from: f */
    final boolean f11110f;
    /* renamed from: g */
    final boolean f11111g;
    /* renamed from: h */
    final boolean f11112h;
    /* renamed from: i */
    final boolean f11113i;
    /* renamed from: j */
    final boolean f11114j;
    /* renamed from: k */
    final boolean f11115k;
    /* renamed from: l */
    final String f11116l;
    /* renamed from: m */
    final int f11117m;
    /* renamed from: n */
    final int f11118n;
    /* renamed from: o */
    final LongSerializationPolicy f11119o;
    /* renamed from: p */
    final List<C2661r> f11120p;
    /* renamed from: q */
    final List<C2661r> f11121q;
    /* renamed from: s */
    private final ThreadLocal<Map<C2624a<?>, C4211a<?>>> f11122s;
    /* renamed from: t */
    private final Map<C2624a<?>, C2660q<?>> f11123t;
    /* renamed from: u */
    private final C2640b f11124u;
    /* renamed from: v */
    private final JsonAdapterAnnotationTypeAdapterFactory f11125v;

    /* renamed from: com.google.gson.e$1 */
    class C42061 extends C2660q<Number> {
        /* renamed from: a */
        final /* synthetic */ C2629e f17760a;

        C42061(C2629e c2629e) {
            this.f17760a = c2629e;
        }

        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23091a(jsonReader);
        }

        /* renamed from: a */
        public Double m23091a(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: a */
        public void m23092a(JsonWriter jsonWriter, Number number) {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            C2629e.m12869a(number.doubleValue());
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.e$2 */
    class C42072 extends C2660q<Number> {
        /* renamed from: a */
        final /* synthetic */ C2629e f17761a;

        C42072(C2629e c2629e) {
            this.f17761a = c2629e;
        }

        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23095a(jsonReader);
        }

        /* renamed from: a */
        public Float m23095a(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: a */
        public void m23096a(JsonWriter jsonWriter, Number number) {
            if (number == null) {
                jsonWriter.nullValue();
                return;
            }
            C2629e.m12869a((double) number.floatValue());
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.e$3 */
    static class C42083 extends C2660q<Number> {
        C42083() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23099a(jsonReader);
        }

        /* renamed from: a */
        public Number m23099a(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Long.valueOf(jsonReader.nextLong());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: a */
        public void m23100a(JsonWriter jsonWriter, Number number) {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.toString());
            }
        }
    }

    /* renamed from: com.google.gson.e$a */
    static class C4211a<T> extends C2660q<T> {
        /* renamed from: a */
        private C2660q<T> f17764a;

        C4211a() {
        }

        /* renamed from: a */
        public void m23111a(C2660q<T> c2660q) {
            if (this.f17764a == null) {
                this.f17764a = c2660q;
                return;
            }
            throw new AssertionError();
        }

        /* renamed from: b */
        public T mo3332b(JsonReader jsonReader) {
            if (this.f17764a != null) {
                return this.f17764a.mo3332b(jsonReader);
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public void mo3331a(JsonWriter jsonWriter, T t) {
            if (this.f17764a != null) {
                this.f17764a.mo3331a(jsonWriter, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C2629e() {
        this(Excluder.f17772a, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    C2629e(Excluder excluder, C2628d c2628d, Map<Type, C2631g<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LongSerializationPolicy longSerializationPolicy, String str, int i, int i2, List<C2661r> list, List<C2661r> list2, List<C2661r> list3) {
        Excluder excluder2 = excluder;
        C2628d c2628d2 = c2628d;
        Map<Type, C2631g<?>> map2 = map;
        boolean z8 = z2;
        boolean z9 = z7;
        this.f11122s = new ThreadLocal();
        this.f11123t = new ConcurrentHashMap();
        this.f11106b = excluder2;
        this.f11107c = c2628d2;
        this.f11108d = map2;
        this.f11124u = new C2640b(map);
        this.f11109e = z;
        this.f11110f = z8;
        this.f11111g = z3;
        this.f11112h = z4;
        this.f11113i = z5;
        this.f11114j = z6;
        this.f11115k = z9;
        this.f11119o = longSerializationPolicy;
        this.f11116l = str;
        this.f11117m = i;
        this.f11118n = i2;
        this.f11120p = list;
        this.f11121q = list2;
        List arrayList = new ArrayList();
        arrayList.add(C2647i.f11192Y);
        arrayList.add(C4238e.f17876a);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(C2647i.f11171D);
        arrayList.add(C2647i.f11206m);
        arrayList.add(C2647i.f11200g);
        arrayList.add(C2647i.f11202i);
        arrayList.add(C2647i.f11204k);
        C2660q a = C2629e.m12866a(longSerializationPolicy);
        arrayList.add(C2647i.m12944a(Long.TYPE, Long.class, a));
        arrayList.add(C2647i.m12944a(Double.TYPE, Double.class, m12868a(z9)));
        arrayList.add(C2647i.m12944a(Float.TYPE, Float.class, m12872b(z9)));
        arrayList.add(C2647i.f11217x);
        arrayList.add(C2647i.f11208o);
        arrayList.add(C2647i.f11210q);
        arrayList.add(C2647i.m12943a(AtomicLong.class, C2629e.m12867a(a)));
        arrayList.add(C2647i.m12943a(AtomicLongArray.class, C2629e.m12871b(a)));
        arrayList.add(C2647i.f11212s);
        arrayList.add(C2647i.f11219z);
        arrayList.add(C2647i.f11173F);
        arrayList.add(C2647i.f11175H);
        arrayList.add(C2647i.m12943a(BigDecimal.class, C2647i.f11169B));
        arrayList.add(C2647i.m12943a(BigInteger.class, C2647i.f11170C));
        arrayList.add(C2647i.f11177J);
        arrayList.add(C2647i.f11179L);
        arrayList.add(C2647i.f11183P);
        arrayList.add(C2647i.f11185R);
        arrayList.add(C2647i.f11190W);
        arrayList.add(C2647i.f11181N);
        arrayList.add(C2647i.f11197d);
        arrayList.add(C4235b.f17863a);
        arrayList.add(C2647i.f11188U);
        arrayList.add(C4240g.f17880a);
        arrayList.add(C4239f.f17878a);
        arrayList.add(C2647i.f11186S);
        arrayList.add(C4234a.f17860a);
        arrayList.add(C2647i.f11195b);
        arrayList.add(new CollectionTypeAdapterFactory(this.f11124u));
        arrayList.add(new MapTypeAdapterFactory(this.f11124u, z2));
        this.f11125v = new JsonAdapterAnnotationTypeAdapterFactory(this.f11124u);
        arrayList.add(this.f11125v);
        arrayList.add(C2647i.f11193Z);
        arrayList.add(new ReflectiveTypeAdapterFactory(this.f11124u, c2628d, excluder, this.f11125v));
        this.f11105a = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private C2660q<Number> m12868a(boolean z) {
        if (z) {
            return C2647i.f11215v;
        }
        return new C42061(this);
    }

    /* renamed from: b */
    private C2660q<Number> m12872b(boolean z) {
        if (z) {
            return C2647i.f11214u;
        }
        return new C42072(this);
    }

    /* renamed from: a */
    static void m12869a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(d);
            stringBuilder.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private static C2660q<Number> m12866a(LongSerializationPolicy longSerializationPolicy) {
        if (longSerializationPolicy == LongSerializationPolicy.DEFAULT) {
            return C2647i.f11213t;
        }
        return new C42083();
    }

    /* renamed from: a */
    private static C2660q<AtomicLong> m12867a(final C2660q<Number> c2660q) {
        return new C2660q<AtomicLong>() {
            /* renamed from: b */
            public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
                return m23103a(jsonReader);
            }

            /* renamed from: a */
            public void m23105a(JsonWriter jsonWriter, AtomicLong atomicLong) {
                c2660q.mo3331a(jsonWriter, Long.valueOf(atomicLong.get()));
            }

            /* renamed from: a */
            public AtomicLong m23103a(JsonReader jsonReader) {
                return new AtomicLong(((Number) c2660q.mo3332b(jsonReader)).longValue());
            }
        }.m12977a();
    }

    /* renamed from: b */
    private static C2660q<AtomicLongArray> m12871b(final C2660q<Number> c2660q) {
        return new C2660q<AtomicLongArray>() {
            /* renamed from: b */
            public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
                return m23107a(jsonReader);
            }

            /* renamed from: a */
            public void m23109a(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) {
                jsonWriter.beginArray();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    c2660q.mo3331a(jsonWriter, Long.valueOf(atomicLongArray.get(i)));
                }
                jsonWriter.endArray();
            }

            /* renamed from: a */
            public AtomicLongArray m23107a(JsonReader jsonReader) {
                List arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) c2660q.mo3332b(jsonReader)).longValue()));
                }
                jsonReader.endArray();
                jsonReader = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(jsonReader);
                for (int i = 0; i < jsonReader; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }
        }.m12977a();
    }

    /* renamed from: a */
    public <T> C2660q<T> m12873a(C2624a<T> c2624a) {
        C2660q<T> c2660q = (C2660q) this.f11123t.get(c2624a == null ? f11104r : c2624a);
        if (c2660q != null) {
            return c2660q;
        }
        Map map = (Map) this.f11122s.get();
        Object obj = null;
        if (map == null) {
            map = new HashMap();
            this.f11122s.set(map);
            obj = 1;
        }
        C4211a c4211a = (C4211a) map.get(c2624a);
        if (c4211a != null) {
            return c4211a;
        }
        try {
            C2660q<T> hasNext;
            c4211a = new C4211a();
            map.put(c2624a, c4211a);
            Iterator it = this.f11105a.iterator();
            while (true) {
                hasNext = it.hasNext();
                if (hasNext != null) {
                    hasNext = ((C2661r) it.next()).mo3339a(this, c2624a);
                    if (hasNext != null) {
                        break;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("GSON cannot handle ");
                stringBuilder.append(c2624a);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            c4211a.m23111a(hasNext);
            this.f11123t.put(c2624a, hasNext);
            return hasNext;
        } finally {
            map.remove(c2624a);
            if (obj != null) {
                this.f11122s.remove();
            }
        }
    }

    /* renamed from: a */
    public <T> C2660q<T> m12874a(C2661r c2661r, C2624a<T> c2624a) {
        if (!this.f11105a.contains(c2661r)) {
            c2661r = this.f11125v;
        }
        Object obj = null;
        for (C2661r c2661r2 : this.f11105a) {
            if (obj != null) {
                C2660q<T> a = c2661r2.mo3339a(this, c2624a);
                if (a != null) {
                    return a;
                }
            } else if (c2661r2 == c2661r) {
                obj = 1;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GSON cannot serialize ");
        stringBuilder.append(c2624a);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public <T> C2660q<T> m12875a(Class<T> cls) {
        return m12873a(C2624a.get((Class) cls));
    }

    /* renamed from: a */
    public String m12883a(Object obj) {
        if (obj == null) {
            return m12882a(C4256l.f17892a);
        }
        return m12884a(obj, obj.getClass());
    }

    /* renamed from: a */
    public String m12884a(Object obj, Type type) {
        Appendable stringWriter = new StringWriter();
        m12888a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void m12888a(Object obj, Type type, Appendable appendable) {
        try {
            m12887a(obj, type, m12877a(C2654g.m12955a(appendable)));
        } catch (Throwable e) {
            throw new JsonIOException(e);
        }
    }

    /* renamed from: a */
    public void m12887a(Object obj, Type type, JsonWriter jsonWriter) {
        type = m12873a(C2624a.get(type));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f11112h);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f11109e);
        try {
            type.mo3331a(jsonWriter, obj);
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        } catch (Throwable e) {
            throw new JsonIOException(e);
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    /* renamed from: a */
    public String m12882a(C2657k c2657k) {
        Appendable stringWriter = new StringWriter();
        m12886a(c2657k, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void m12886a(C2657k c2657k, Appendable appendable) {
        try {
            m12885a(c2657k, m12877a(C2654g.m12955a(appendable)));
        } catch (Throwable e) {
            throw new JsonIOException(e);
        }
    }

    /* renamed from: a */
    public JsonWriter m12877a(Writer writer) {
        if (this.f11111g) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.f11113i != null) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setSerializeNulls(this.f11109e);
        return jsonWriter;
    }

    /* renamed from: a */
    public JsonReader m12876a(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.f11114j);
        return jsonReader;
    }

    /* renamed from: a */
    public void m12885a(C2657k c2657k, JsonWriter jsonWriter) {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f11112h);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f11109e);
        try {
            C2654g.m12956a(c2657k, jsonWriter);
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        } catch (Throwable e) {
            throw new JsonIOException(e);
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    /* renamed from: a */
    public <T> T m12880a(String str, Class<T> cls) {
        return C2651f.m12951a((Class) cls).cast(m12881a(str, (Type) cls));
    }

    /* renamed from: a */
    public <T> T m12881a(String str, Type type) {
        if (str == null) {
            return null;
        }
        return m12879a(new StringReader(str), type);
    }

    /* renamed from: a */
    public <T> T m12879a(Reader reader, Type type) {
        JsonReader a = m12876a(reader);
        Object a2 = m12878a(a, type);
        C2629e.m12870a(a2, a);
        return a2;
    }

    /* renamed from: a */
    private static void m12870a(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (Throwable e) {
                throw new JsonSyntaxException(e);
            } catch (Throwable e2) {
                throw new JsonIOException(e2);
            }
        }
    }

    /* renamed from: a */
    public <T> T m12878a(JsonReader jsonReader, Type type) {
        boolean isLenient = jsonReader.isLenient();
        boolean z = true;
        jsonReader.setLenient(true);
        try {
            jsonReader.peek();
            z = false;
            type = m12873a(C2624a.get(type)).mo3332b(jsonReader);
            jsonReader.setLenient(isLenient);
            return type;
        } catch (Throwable e) {
            if (z) {
                jsonReader.setLenient(isLenient);
                return null;
            }
            throw new JsonSyntaxException(e);
        } catch (Throwable e2) {
            throw new JsonSyntaxException(e2);
        } catch (Throwable e22) {
            throw new JsonSyntaxException(e22);
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{serializeNulls:");
        stringBuilder.append(this.f11109e);
        stringBuilder.append(",factories:");
        stringBuilder.append(this.f11105a);
        stringBuilder.append(",instanceCreators:");
        stringBuilder.append(this.f11124u);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
