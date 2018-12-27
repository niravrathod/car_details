package com.airbnb.lottie.p035c;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.model.C0981a;
import com.airbnb.lottie.model.content.C0987h;
import com.airbnb.lottie.p036d.C0953e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.ad */
public class ad implements aj<C0987h> {
    /* renamed from: a */
    public static final ad f14027a = new ad();

    /* renamed from: b */
    public /* synthetic */ Object mo875b(JsonReader jsonReader, float f) {
        return m16972a(jsonReader, f);
    }

    private ad() {
    }

    /* renamed from: a */
    public C0987h m16972a(JsonReader jsonReader, float f) {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List list = null;
        List list2 = null;
        List list3 = list2;
        boolean z = false;
        while (jsonReader.hasNext()) {
            Object obj;
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode == 99) {
                if (nextName.equals("c")) {
                    obj = null;
                    switch (obj) {
                        case null:
                            z = jsonReader.nextBoolean();
                            break;
                        case 1:
                            list = C0940p.m4051a(jsonReader, f);
                            break;
                        case 2:
                            list2 = C0940p.m4051a(jsonReader, f);
                            break;
                        case 3:
                            list3 = C0940p.m4051a(jsonReader, f);
                            break;
                        default:
                            break;
                    }
                }
            } else if (hashCode == 105) {
                if (nextName.equals("i")) {
                    obj = 2;
                    switch (obj) {
                        case null:
                            z = jsonReader.nextBoolean();
                            break;
                        case 1:
                            list = C0940p.m4051a(jsonReader, f);
                            break;
                        case 2:
                            list2 = C0940p.m4051a(jsonReader, f);
                            break;
                        case 3:
                            list3 = C0940p.m4051a(jsonReader, f);
                            break;
                        default:
                            break;
                    }
                }
            } else if (hashCode == 111) {
                if (nextName.equals("o")) {
                    obj = 3;
                    switch (obj) {
                        case null:
                            z = jsonReader.nextBoolean();
                            break;
                        case 1:
                            list = C0940p.m4051a(jsonReader, f);
                            break;
                        case 2:
                            list2 = C0940p.m4051a(jsonReader, f);
                            break;
                        case 3:
                            list3 = C0940p.m4051a(jsonReader, f);
                            break;
                        default:
                            break;
                    }
                }
            } else if (hashCode == 118) {
                if (nextName.equals("v")) {
                    obj = 1;
                    switch (obj) {
                        case null:
                            z = jsonReader.nextBoolean();
                            break;
                        case 1:
                            list = C0940p.m4051a(jsonReader, f);
                            break;
                        case 2:
                            list2 = C0940p.m4051a(jsonReader, f);
                            break;
                        case 3:
                            list3 = C0940p.m4051a(jsonReader, f);
                            break;
                        default:
                            break;
                    }
                }
            }
            obj = -1;
            switch (obj) {
                case null:
                    z = jsonReader.nextBoolean();
                    break;
                case 1:
                    list = C0940p.m4051a(jsonReader, f);
                    break;
                case 2:
                    list2 = C0940p.m4051a(jsonReader, f);
                    break;
                case 3:
                    list3 = C0940p.m4051a(jsonReader, f);
                    break;
                default:
                    break;
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty() != null) {
            return new C0987h(new PointF(), false, Collections.emptyList());
        } else {
            jsonReader = list.size();
            PointF pointF = (PointF) list.get(0);
            List arrayList = new ArrayList(jsonReader);
            for (int i = 1; i < jsonReader; i++) {
                PointF pointF2 = (PointF) list.get(i);
                int i2 = i - 1;
                arrayList.add(new C0981a(C0953e.m4095a((PointF) list.get(i2), (PointF) list3.get(i2)), C0953e.m4095a(pointF2, (PointF) list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = (PointF) list.get(0);
                jsonReader--;
                arrayList.add(new C0981a(C0953e.m4095a((PointF) list.get(jsonReader), (PointF) list3.get(jsonReader)), C0953e.m4095a(pointF3, (PointF) list2.get(0)), pointF3));
            }
            return new C0987h(pointF, z, arrayList);
        }
    }
}
