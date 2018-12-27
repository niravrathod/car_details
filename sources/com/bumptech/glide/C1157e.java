package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.C3490i;
import com.bumptech.glide.load.engine.p060a.C1230b;
import com.bumptech.glide.request.C1313e;
import com.bumptech.glide.request.p067a.C1303e;
import com.bumptech.glide.request.p067a.C4786i;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.e */
public class C1157e extends ContextWrapper {
    /* renamed from: a */
    static final C1181h<?, ?> f3783a = new C3357b();
    /* renamed from: b */
    private final Handler f3784b = new Handler(Looper.getMainLooper());
    /* renamed from: c */
    private final C1230b f3785c;
    /* renamed from: d */
    private final Registry f3786d;
    /* renamed from: e */
    private final C1303e f3787e;
    /* renamed from: f */
    private final C1313e f3788f;
    /* renamed from: g */
    private final Map<Class<?>, C1181h<?, ?>> f3789g;
    /* renamed from: h */
    private final C3490i f3790h;
    /* renamed from: i */
    private final int f3791i;

    public C1157e(Context context, C1230b c1230b, Registry registry, C1303e c1303e, C1313e c1313e, Map<Class<?>, C1181h<?, ?>> map, C3490i c3490i, int i) {
        super(context.getApplicationContext());
        this.f3785c = c1230b;
        this.f3786d = registry;
        this.f3787e = c1303e;
        this.f3788f = c1313e;
        this.f3789g = map;
        this.f3790h = c3490i;
        this.f3791i = i;
    }

    /* renamed from: a */
    public C1313e m4817a() {
        return this.f3788f;
    }

    /* renamed from: a */
    public <T> C1181h<?, T> m4815a(Class<T> cls) {
        C1181h<?, T> c1181h = (C1181h) this.f3789g.get(cls);
        if (c1181h == null) {
            for (Entry entry : this.f3789g.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    C1181h c1181h2 = (C1181h) entry.getValue();
                }
            }
        }
        return c1181h == null ? f3783a : c1181h;
    }

    /* renamed from: a */
    public <X> C4786i<ImageView, X> m4816a(ImageView imageView, Class<X> cls) {
        return this.f3787e.m5256a(imageView, cls);
    }

    /* renamed from: b */
    public C3490i m4818b() {
        return this.f3790h;
    }

    /* renamed from: c */
    public Registry m4819c() {
        return this.f3786d;
    }

    /* renamed from: d */
    public int m4820d() {
        return this.f3791i;
    }

    /* renamed from: e */
    public C1230b m4821e() {
        return this.f3785c;
    }
}
