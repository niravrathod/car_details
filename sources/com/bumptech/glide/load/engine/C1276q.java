package com.bumptech.glide.load.engine;

import android.support.v4.p017f.C0431k.C0430a;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.engine.C1264g.C1263a;
import com.bumptech.glide.load.p057a.C1190e;
import com.bumptech.glide.p055g.C1178i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.q */
public class C1276q<Data, ResourceType, Transcode> {
    /* renamed from: a */
    private final Class<Data> f4026a;
    /* renamed from: b */
    private final C0430a<List<Throwable>> f4027b;
    /* renamed from: c */
    private final List<? extends C1264g<Data, ResourceType, Transcode>> f4028c;
    /* renamed from: d */
    private final String f4029d;

    public C1276q(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C1264g<Data, ResourceType, Transcode>> list, C0430a<List<Throwable>> c0430a) {
        this.f4026a = cls;
        this.f4027b = c0430a;
        this.f4028c = (List) C1178i.m4883a((Collection) list);
        list = new StringBuilder();
        list.append("Failed LoadPath{");
        list.append(cls.getSimpleName());
        list.append("->");
        list.append(cls2.getSimpleName());
        list.append("->");
        list.append(cls3.getSimpleName());
        list.append("}");
        this.f4029d = list.toString();
    }

    /* renamed from: a */
    public C1277s<Transcode> m5150a(C1190e<Data> c1190e, C3452e c3452e, int i, int i2, C1263a<ResourceType> c1263a) {
        List list = (List) C1178i.m4880a(this.f4027b.mo338a());
        try {
            c1190e = m5149a(c1190e, c3452e, i, i2, c1263a, list);
            return c1190e;
        } finally {
            this.f4027b.mo339a(list);
        }
    }

    /* renamed from: a */
    private C1277s<Transcode> m5149a(C1190e<Data> c1190e, C3452e c3452e, int i, int i2, C1263a<ResourceType> c1263a, List<Throwable> list) {
        List<Throwable> list2 = list;
        int size = this.f4028c.size();
        C1277s<Transcode> c1277s = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                c1277s = ((C1264g) r1.f4028c.get(i3)).m5131a((C1190e) c1190e, i, i2, c3452e, (C1263a) c1263a);
            } catch (GlideException e) {
                list2.add(e);
            }
            if (c1277s != null) {
                break;
            }
        }
        if (c1277s != null) {
            return c1277s;
        }
        throw new GlideException(r1.f4029d, new ArrayList(list2));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LoadPath{decodePaths=");
        stringBuilder.append(Arrays.toString(this.f4028c.toArray()));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
