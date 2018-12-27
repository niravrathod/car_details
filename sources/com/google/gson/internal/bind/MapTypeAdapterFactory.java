package com.google.gson.internal.bind;

import com.google.gson.C2629e;
import com.google.gson.C2657k;
import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.C2640b;
import com.google.gson.internal.C2648c;
import com.google.gson.internal.C2649d;
import com.google.gson.internal.C2654g;
import com.google.gson.p141b.C2624a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class MapTypeAdapterFactory implements C2661r {
    /* renamed from: a */
    final boolean f17815a;
    /* renamed from: b */
    private final C2640b f17816b;

    /* renamed from: com.google.gson.internal.bind.MapTypeAdapterFactory$a */
    private final class C4228a<K, V> extends C2660q<Map<K, V>> {
        /* renamed from: a */
        final /* synthetic */ MapTypeAdapterFactory f17811a;
        /* renamed from: b */
        private final C2660q<K> f17812b;
        /* renamed from: c */
        private final C2660q<V> f17813c;
        /* renamed from: d */
        private final C2649d<? extends Map<K, V>> f17814d;

        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23166a(jsonReader);
        }

        public C4228a(MapTypeAdapterFactory mapTypeAdapterFactory, C2629e c2629e, Type type, C2660q<K> c2660q, Type type2, C2660q<V> c2660q2, C2649d<? extends Map<K, V>> c2649d) {
            this.f17811a = mapTypeAdapterFactory;
            this.f17812b = new C4241h(c2629e, c2660q, type);
            this.f17813c = new C4241h(c2629e, c2660q2, type2);
            this.f17814d = c2649d;
        }

        /* renamed from: a */
        public Map<K, V> m23166a(JsonReader jsonReader) {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> map = (Map) this.f17814d.mo3341a();
            Object b;
            StringBuilder stringBuilder;
            if (peek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    b = this.f17812b.mo3332b(jsonReader);
                    if (map.put(b, this.f17813c.mo3332b(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("duplicate key: ");
                        stringBuilder.append(b);
                        throw new JsonSyntaxException(stringBuilder.toString());
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    C2648c.INSTANCE.promoteNameToValue(jsonReader);
                    b = this.f17812b.mo3332b(jsonReader);
                    if (map.put(b, this.f17813c.mo3332b(jsonReader)) != null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("duplicate key: ");
                        stringBuilder.append(b);
                        throw new JsonSyntaxException(stringBuilder.toString());
                    }
                }
                jsonReader.endObject();
            }
            return map;
        }

        /* renamed from: a */
        public void m23168a(JsonWriter jsonWriter, Map<K, V> map) {
            if (map == null) {
                jsonWriter.nullValue();
            } else if (this.f17811a.f17815a) {
                List arrayList = new ArrayList(map.size());
                List arrayList2 = new ArrayList(map.size());
                map = map.entrySet().iterator();
                int i = 0;
                int i2 = 0;
                while (map.hasNext()) {
                    int i3;
                    Entry entry = (Entry) map.next();
                    C2657k a = this.f17812b.m12976a(entry.getKey());
                    arrayList.add(a);
                    arrayList2.add(entry.getValue());
                    if (!a.m12967g()) {
                        if (!a.m12968h()) {
                            i3 = 0;
                            i2 |= i3;
                        }
                    }
                    i3 = 1;
                    i2 |= i3;
                }
                if (i2 != 0) {
                    jsonWriter.beginArray();
                    map = arrayList.size();
                    while (i < map) {
                        jsonWriter.beginArray();
                        C2654g.m12956a((C2657k) arrayList.get(i), jsonWriter);
                        this.f17813c.mo3331a(jsonWriter, arrayList2.get(i));
                        jsonWriter.endArray();
                        i++;
                    }
                    jsonWriter.endArray();
                } else {
                    jsonWriter.beginObject();
                    map = arrayList.size();
                    while (i < map) {
                        jsonWriter.name(m23165a((C2657k) arrayList.get(i)));
                        this.f17813c.mo3331a(jsonWriter, arrayList2.get(i));
                        i++;
                    }
                    jsonWriter.endObject();
                }
            } else {
                jsonWriter.beginObject();
                map = map.entrySet().iterator();
                while (map.hasNext()) {
                    Entry entry2 = (Entry) map.next();
                    jsonWriter.name(String.valueOf(entry2.getKey()));
                    this.f17813c.mo3331a(jsonWriter, entry2.getValue());
                }
                jsonWriter.endObject();
            }
        }

        /* renamed from: a */
        private String m23165a(C2657k c2657k) {
            if (c2657k.m12969i()) {
                c2657k = c2657k.m12973m();
                if (c2657k.m23367p()) {
                    return String.valueOf(c2657k.mo3333a());
                }
                if (c2657k.m23366o()) {
                    return Boolean.toString(c2657k.mo3338f());
                }
                if (c2657k.m23368q()) {
                    return c2657k.mo3334b();
                }
                throw new AssertionError();
            } else if (c2657k.m12970j() != null) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }
    }

    public MapTypeAdapterFactory(C2640b c2640b, boolean z) {
        this.f17816b = c2640b;
        this.f17815a = z;
    }

    /* renamed from: a */
    public <T> C2660q<T> mo3339a(C2629e c2629e, C2624a<T> c2624a) {
        Type type = c2624a.getType();
        if (!Map.class.isAssignableFrom(c2624a.getRawType())) {
            return null;
        }
        Type[] b = C$Gson$Types.m12907b(type, C$Gson$Types.m12910e(type));
        return new C4228a(this, c2629e, b[0], m23170a(c2629e, b[0]), b[1], c2629e.m12873a(C2624a.get(b[1])), this.f17816b.m12935a((C2624a) c2624a));
    }

    /* renamed from: a */
    private C2660q<?> m23170a(C2629e c2629e, Type type) {
        if (type != Boolean.TYPE) {
            if (type != Boolean.class) {
                return c2629e.m12873a(C2624a.get(type));
            }
        }
        return C2647i.f11199f;
    }
}
