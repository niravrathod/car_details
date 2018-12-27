package com.airbnb.lottie.p035c;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.model.p038a.C3315e;
import com.airbnb.lottie.p036d.C0954f;
import com.airbnb.lottie.p037e.C0959a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.a */
public class C0929a {
    /* renamed from: a */
    public static C3315e m4020a(JsonReader jsonReader, C0955d c0955d) {
        List arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(C0947w.m4074a(jsonReader, c0955d));
            }
            jsonReader.endArray();
            C0942r.m4064a(arrayList);
        } else {
            arrayList.add(new C0959a(C0940p.m4053b(jsonReader, C0954f.m4101a())));
        }
        return new C3315e(arrayList);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    static com.airbnb.lottie.model.p038a.C0980m<android.graphics.PointF, android.graphics.PointF> m4021b(android.util.JsonReader r10, com.airbnb.lottie.C0955d r11) {
        /*
        r10.beginObject();
        r0 = 0;
        r1 = 0;
        r2 = r1;
        r3 = r2;
        r4 = r3;
        r1 = 0;
    L_0x0009:
        r5 = r10.peek();
        r6 = android.util.JsonToken.END_OBJECT;
        if (r5 == r6) goto L_0x0071;
    L_0x0011:
        r5 = r10.nextName();
        r6 = -1;
        r7 = r5.hashCode();
        r8 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r9 = 1;
        if (r7 == r8) goto L_0x0037;
    L_0x001f:
        switch(r7) {
            case 120: goto L_0x002d;
            case 121: goto L_0x0023;
            default: goto L_0x0022;
        };
    L_0x0022:
        goto L_0x0041;
    L_0x0023:
        r7 = "y";
        r5 = r5.equals(r7);
        if (r5 == 0) goto L_0x0041;
    L_0x002b:
        r5 = 2;
        goto L_0x0042;
    L_0x002d:
        r7 = "x";
        r5 = r5.equals(r7);
        if (r5 == 0) goto L_0x0041;
    L_0x0035:
        r5 = 1;
        goto L_0x0042;
    L_0x0037:
        r7 = "k";
        r5 = r5.equals(r7);
        if (r5 == 0) goto L_0x0041;
    L_0x003f:
        r5 = 0;
        goto L_0x0042;
    L_0x0041:
        r5 = -1;
    L_0x0042:
        switch(r5) {
            case 0: goto L_0x006c;
            case 1: goto L_0x005a;
            case 2: goto L_0x0049;
            default: goto L_0x0045;
        };
    L_0x0045:
        r10.skipValue();
        goto L_0x0009;
    L_0x0049:
        r5 = r10.peek();
        r6 = android.util.JsonToken.STRING;
        if (r5 != r6) goto L_0x0055;
    L_0x0051:
        r10.skipValue();
        goto L_0x0065;
    L_0x0055:
        r4 = com.airbnb.lottie.p035c.C0932d.m4033a(r10, r11);
        goto L_0x0009;
    L_0x005a:
        r5 = r10.peek();
        r6 = android.util.JsonToken.STRING;
        if (r5 != r6) goto L_0x0067;
    L_0x0062:
        r10.skipValue();
    L_0x0065:
        r1 = 1;
        goto L_0x0009;
    L_0x0067:
        r3 = com.airbnb.lottie.p035c.C0932d.m4033a(r10, r11);
        goto L_0x0009;
    L_0x006c:
        r2 = com.airbnb.lottie.p035c.C0929a.m4020a(r10, r11);
        goto L_0x0009;
    L_0x0071:
        r10.endObject();
        if (r1 == 0) goto L_0x007b;
    L_0x0076:
        r10 = "Lottie doesn't support expressions.";
        r11.m4112a(r10);
    L_0x007b:
        if (r2 == 0) goto L_0x007e;
    L_0x007d:
        return r2;
    L_0x007e:
        r10 = new com.airbnb.lottie.model.a.i;
        r10.<init>(r3, r4);
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.c.a.b(android.util.JsonReader, com.airbnb.lottie.d):com.airbnb.lottie.model.a.m<android.graphics.PointF, android.graphics.PointF>");
    }
}
