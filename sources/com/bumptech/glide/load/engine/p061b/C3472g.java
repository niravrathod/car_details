package com.bumptech.glide.load.engine.p061b;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.load.engine.p061b.C1248h.C1247a;
import com.bumptech.glide.p055g.C1175f;

/* renamed from: com.bumptech.glide.load.engine.b.g */
public class C3472g extends C1175f<C1216c, C1277s<?>> implements C1248h {
    /* renamed from: a */
    private C1247a f14436a;

    /* renamed from: a */
    public /* synthetic */ C1277s mo1023a(C1216c c1216c) {
        return (C1277s) super.m4875c(c1216c);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ C1277s mo1026b(C1216c c1216c, C1277s c1277s) {
        return (C1277s) super.m4874b(c1216c, c1277s);
    }

    public C3472g(long j) {
        super(j);
    }

    /* renamed from: a */
    public void mo1025a(C1247a c1247a) {
        this.f14436a = c1247a;
    }

    /* renamed from: a */
    protected void m17653a(C1216c c1216c, C1277s<?> c1277s) {
        if (this.f14436a != null && c1277s != null) {
            this.f14436a.mo1041b(c1277s);
        }
    }

    /* renamed from: a */
    protected int m17649a(C1277s<?> c1277s) {
        if (c1277s == null) {
            return super.mo1022a((Object) null);
        }
        return c1277s.mo1047e();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo1024a(int i) {
        if (i >= 40) {
            m4869a();
        } else if (i >= 20 || i == 15) {
            m4870a(m4872b() / 2);
        }
    }
}
