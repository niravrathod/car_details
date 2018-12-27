package com.bumptech.glide.load.engine;

import android.support.v4.p017f.C0431k.C0430a;
import android.util.Log;
import com.bumptech.glide.load.C1280f;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.p057a.C1190e;
import com.bumptech.glide.load.resource.p066e.C1300e;
import com.bumptech.glide.p055g.C1178i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.g */
public class C1264g<DataType, ResourceType, Transcode> {
    /* renamed from: a */
    private final Class<DataType> f4003a;
    /* renamed from: b */
    private final List<? extends C1280f<DataType, ResourceType>> f4004b;
    /* renamed from: c */
    private final C1300e<ResourceType, Transcode> f4005c;
    /* renamed from: d */
    private final C0430a<List<Throwable>> f4006d;
    /* renamed from: e */
    private final String f4007e;

    /* renamed from: com.bumptech.glide.load.engine.g$a */
    interface C1263a<ResourceType> {
        /* renamed from: a */
        C1277s<ResourceType> mo989a(C1277s<ResourceType> c1277s);
    }

    public C1264g(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends C1280f<DataType, ResourceType>> list, C1300e<ResourceType, Transcode> c1300e, C0430a<List<Throwable>> c0430a) {
        this.f4003a = cls;
        this.f4004b = list;
        this.f4005c = c1300e;
        this.f4006d = c0430a;
        list = new StringBuilder();
        list.append("Failed DecodePath{");
        list.append(cls.getSimpleName());
        list.append("->");
        list.append(cls2.getSimpleName());
        list.append("->");
        list.append(cls3.getSimpleName());
        list.append("}");
        this.f4007e = list.toString();
    }

    /* renamed from: a */
    public C1277s<Transcode> m5131a(C1190e<DataType> c1190e, int i, int i2, C3452e c3452e, C1263a<ResourceType> c1263a) {
        return this.f4005c.mo1072a(c1263a.mo989a(m5129a(c1190e, i, i2, c3452e)), c3452e);
    }

    /* renamed from: a */
    private C1277s<ResourceType> m5129a(C1190e<DataType> c1190e, int i, int i2, C3452e c3452e) {
        List list = (List) C1178i.m4880a(this.f4006d.mo338a());
        try {
            c1190e = m5130a((C1190e) c1190e, i, i2, c3452e, list);
            return c1190e;
        } finally {
            this.f4006d.mo339a(list);
        }
    }

    /* renamed from: a */
    private C1277s<ResourceType> m5130a(C1190e<DataType> c1190e, int i, int i2, C3452e c3452e, List<Throwable> list) {
        int size = this.f4004b.size();
        C1277s<ResourceType> c1277s = null;
        for (int i3 = 0; i3 < size; i3++) {
            C1280f c1280f = (C1280f) this.f4004b.get(i3);
            try {
                if (c1280f.mo1051a(c1190e.mo966a(), c3452e)) {
                    c1277s = c1280f.mo1050a(c1190e.mo966a(), i, i2, c3452e);
                }
            } catch (Throwable e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to decode data for ");
                    stringBuilder.append(c1280f);
                    Log.v("DecodePath", stringBuilder.toString(), e);
                }
                list.add(e);
            }
            if (c1277s != null) {
                break;
            }
        }
        if (c1277s != null) {
            return c1277s;
        }
        throw new GlideException(this.f4007e, new ArrayList(list));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DecodePath{ dataClass=");
        stringBuilder.append(this.f4003a);
        stringBuilder.append(", decoders=");
        stringBuilder.append(this.f4004b);
        stringBuilder.append(", transcoder=");
        stringBuilder.append(this.f4005c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
