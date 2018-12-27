package com.facebook.ads.internal.p101q.p103b;

import android.graphics.Bitmap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.ads.internal.q.b.e */
public class C1943e {
    /* renamed from: a */
    static final int f5960a = Runtime.getRuntime().availableProcessors();
    /* renamed from: b */
    static final ExecutorService f5961b = Executors.newFixedThreadPool(f5960a);
    /* renamed from: c */
    private static volatile boolean f5962c = true;
    /* renamed from: d */
    private final Bitmap f5963d;
    /* renamed from: e */
    private Bitmap f5964e;
    /* renamed from: f */
    private final C1939a f5965f = new C3827d();

    public C1943e(Bitmap bitmap) {
        this.f5963d = bitmap;
    }

    /* renamed from: a */
    public Bitmap m7345a() {
        return this.f5964e;
    }

    /* renamed from: a */
    public Bitmap m7346a(int i) {
        this.f5964e = this.f5965f.mo1406a(this.f5963d, (float) i);
        return this.f5964e;
    }
}
