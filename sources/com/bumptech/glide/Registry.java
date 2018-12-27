package com.bumptech.glide;

import android.support.v4.p017f.C0431k.C0430a;
import com.bumptech.glide.load.C1194a;
import com.bumptech.glide.load.C1280f;
import com.bumptech.glide.load.C3499g;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C1264g;
import com.bumptech.glide.load.engine.C1276q;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.load.p057a.C1190e;
import com.bumptech.glide.load.p057a.C1190e.C1189a;
import com.bumptech.glide.load.p057a.C1191f;
import com.bumptech.glide.load.p059b.C1206n;
import com.bumptech.glide.load.p059b.C1207o;
import com.bumptech.glide.load.p059b.C1210p;
import com.bumptech.glide.load.resource.p066e.C1300e;
import com.bumptech.glide.load.resource.p066e.C1302f;
import com.bumptech.glide.p054e.C1149a;
import com.bumptech.glide.p054e.C1150b;
import com.bumptech.glide.p054e.C1151c;
import com.bumptech.glide.p054e.C1152d;
import com.bumptech.glide.p054e.C1154e;
import com.bumptech.glide.p054e.C1156f;
import com.bumptech.glide.p055g.p056a.C1167a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Registry {
    /* renamed from: a */
    private final C1210p f3640a = new C1210p(this.f3649j);
    /* renamed from: b */
    private final C1149a f3641b = new C1149a();
    /* renamed from: c */
    private final C1154e f3642c = new C1154e();
    /* renamed from: d */
    private final C1156f f3643d = new C1156f();
    /* renamed from: e */
    private final C1191f f3644e = new C1191f();
    /* renamed from: f */
    private final C1302f f3645f = new C1302f();
    /* renamed from: g */
    private final C1150b f3646g = new C1150b();
    /* renamed from: h */
    private final C1152d f3647h = new C1152d();
    /* renamed from: i */
    private final C1151c f3648i = new C1151c();
    /* renamed from: j */
    private final C0430a<List<Throwable>> f3649j = C1167a.m4840a();

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to find any ModelLoaders for model: ");
            stringBuilder.append(obj);
            super(stringBuilder.toString());
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to find any ModelLoaders for model: ");
            stringBuilder.append(cls);
            stringBuilder.append(" and data: ");
            stringBuilder.append(cls2);
            super(stringBuilder.toString());
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to find result encoder for resource class: ");
            stringBuilder.append(cls);
            stringBuilder.append(", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
            super(stringBuilder.toString());
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to find source encoder for data class: ");
            stringBuilder.append(cls);
            super(stringBuilder.toString());
        }
    }

    public Registry() {
        m4632a(Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
    }

    /* renamed from: a */
    public <Data> Registry m4626a(Class<Data> cls, C1194a<Data> c1194a) {
        this.f3641b.m4797a(cls, c1194a);
        return this;
    }

    /* renamed from: a */
    public <Data, TResource> Registry m4629a(Class<Data> cls, Class<TResource> cls2, C1280f<Data, TResource> c1280f) {
        m4631a("legacy_append", cls, cls2, c1280f);
        return this;
    }

    /* renamed from: a */
    public <Data, TResource> Registry m4631a(String str, Class<Data> cls, Class<TResource> cls2, C1280f<Data, TResource> c1280f) {
        this.f3642c.m4809a(str, c1280f, cls, cls2);
        return this;
    }

    /* renamed from: a */
    public final Registry m4632a(List<String> list) {
        List arrayList = new ArrayList(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f3642c.m4810a(arrayList);
        return this;
    }

    /* renamed from: a */
    public <TResource> Registry m4627a(Class<TResource> cls, C3499g<TResource> c3499g) {
        this.f3643d.m4814a(cls, c3499g);
        return this;
    }

    /* renamed from: a */
    public Registry m4625a(C1189a<?> c1189a) {
        this.f3644e.m4938a((C1189a) c1189a);
        return this;
    }

    /* renamed from: a */
    public <TResource, Transcode> Registry m4630a(Class<TResource> cls, Class<Transcode> cls2, C1300e<TResource, Transcode> c1300e) {
        this.f3645f.m5254a(cls, cls2, c1300e);
        return this;
    }

    /* renamed from: a */
    public Registry m4624a(ImageHeaderParser imageHeaderParser) {
        this.f3646g.m4799a(imageHeaderParser);
        return this;
    }

    /* renamed from: a */
    public <Model, Data> Registry m4628a(Class<Model> cls, Class<Data> cls2, C1207o<Model, Data> c1207o) {
        this.f3640a.m4970a(cls, cls2, c1207o);
        return this;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C1276q<Data, TResource, Transcode> m4634a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1276q<Data, TResource, Transcode> a = this.f3648i.m4801a(cls, cls2, cls3);
        if (this.f3648i.m4803a(a)) {
            return null;
        }
        if (a == null) {
            List c = m4623c(cls, cls2, cls3);
            if (c.isEmpty()) {
                a = null;
            } else {
                C1276q<Data, TResource, Transcode> c1276q = new C1276q(cls, cls2, cls3, c, this.f3649j);
            }
            this.f3648i.m4802a(cls, cls2, cls3, a);
        }
        return a;
    }

    /* renamed from: c */
    private <Data, TResource, Transcode> List<C1264g<Data, TResource, Transcode>> m4623c(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<C1264g<Data, TResource, Transcode>> arrayList = new ArrayList();
        for (TResource tResource : this.f3642c.m4811b(cls, cls2)) {
            for (Class cls4 : this.f3645f.m5255b(tResource, cls3)) {
                arrayList.add(new C1264g(cls, tResource, cls4, this.f3642c.m4808a(cls, tResource), this.f3645f.m5253a(tResource, cls4), this.f3649j));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public <Model, TResource, Transcode> List<Class<?>> m4639b(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.f3647h.m4804a(cls, cls2);
        if (a == null) {
            a = new ArrayList();
            for (Class b : this.f3640a.m4968a((Class) cls)) {
                for (Class cls4 : this.f3642c.m4811b(b, cls2)) {
                    if (!(this.f3645f.m5255b(cls4, cls3).isEmpty() || a.contains(cls4))) {
                        a.add(cls4);
                    }
                }
            }
            this.f3647h.m4805a(cls, cls2, Collections.unmodifiableList(a));
        }
        return a;
    }

    /* renamed from: a */
    public boolean m4636a(C1277s<?> c1277s) {
        return this.f3643d.m4813a(c1277s.mo1045c()) != null ? true : null;
    }

    /* renamed from: b */
    public <X> C3499g<X> m4638b(C1277s<X> c1277s) {
        C3499g<X> a = this.f3643d.m4813a(c1277s.mo1045c());
        if (a != null) {
            return a;
        }
        throw new NoResultEncoderAvailableException(c1277s.mo1045c());
    }

    /* renamed from: a */
    public <X> C1194a<X> m4633a(X x) {
        C1194a<X> a = this.f3641b.m4796a(x.getClass());
        if (a != null) {
            return a;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    /* renamed from: b */
    public <X> C1190e<X> m4637b(X x) {
        return this.f3644e.m4937a((Object) x);
    }

    /* renamed from: c */
    public <Model> List<C1206n<Model, ?>> m4640c(Model model) {
        List<C1206n<Model, ?>> a = this.f3640a.m4969a((Object) model);
        if (!a.isEmpty()) {
            return a;
        }
        throw new NoModelLoaderAvailableException(model);
    }

    /* renamed from: a */
    public List<ImageHeaderParser> m4635a() {
        List<ImageHeaderParser> a = this.f3646g.m4798a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new NoImageHeaderParserException();
    }
}
