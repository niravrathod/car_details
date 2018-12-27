package com.airbnb.lottie.p035c;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.model.content.C0986c;
import com.airbnb.lottie.p036d.C0953e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.l */
public class C3300l implements aj<C0986c> {
    /* renamed from: a */
    private int f14031a;

    /* renamed from: b */
    public /* synthetic */ Object mo875b(JsonReader jsonReader, float f) {
        return m16982a(jsonReader, f);
    }

    public C3300l(int i) {
        this.f14031a = i;
    }

    /* renamed from: a */
    public C0986c m16982a(JsonReader jsonReader, float f) {
        List arrayList = new ArrayList();
        Object obj = jsonReader.peek() == JsonToken.BEGIN_ARRAY ? 1 : null;
        if (obj != null) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (obj != null) {
            jsonReader.endArray();
        }
        if (this.f14031a == -1) {
            this.f14031a = arrayList.size() / 4;
        }
        jsonReader = new float[this.f14031a];
        int[] iArr = new int[this.f14031a];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f14031a * 4; i3++) {
            int i4 = i3 / 4;
            double floatValue = (double) ((Float) arrayList.get(i3)).floatValue();
            switch (i3 % 4) {
                case 0:
                    jsonReader[i4] = (float) floatValue;
                    break;
                case 1:
                    Double.isNaN(floatValue);
                    i = (int) (floatValue * 255.0d);
                    break;
                case 2:
                    Double.isNaN(floatValue);
                    i2 = (int) (floatValue * 255.0d);
                    break;
                case 3:
                    Double.isNaN(floatValue);
                    iArr[i4] = Color.argb(255, i, i2, (int) (floatValue * 255.0d));
                    break;
                default:
                    break;
            }
        }
        C0986c c0986c = new C0986c(jsonReader, iArr);
        m16981a(c0986c, arrayList);
        return c0986c;
    }

    /* renamed from: a */
    private void m16981a(C0986c c0986c, List<Float> list) {
        int i = this.f14031a * 4;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = (double) ((Float) list.get(i)).floatValue();
                } else {
                    dArr2[i2] = (double) ((Float) list.get(i)).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < c0986c.m4255c(); i3++) {
                list = c0986c.m4254b()[i3];
                c0986c.m4254b()[i3] = Color.argb(m16980a((double) c0986c.m4253a()[i3], dArr, dArr2), Color.red(list), Color.green(list), Color.blue(list));
            }
        }
    }

    /* renamed from: a */
    private int m16980a(double d, double[] dArr, double[] dArr2) {
        double[] dArr3 = dArr;
        double[] dArr4 = dArr2;
        for (int i = 1; i < dArr3.length; i++) {
            int i2 = i - 1;
            double d2 = dArr3[i2];
            double d3 = dArr3[i];
            if (dArr3[i] >= d) {
                return (int) (C0953e.m4089a(dArr4[i2], dArr4[i], (d - d2) / (d3 - d2)) * 255.0d);
            }
        }
        return (int) (dArr4[dArr4.length - 1] * 255.0d);
    }
}
