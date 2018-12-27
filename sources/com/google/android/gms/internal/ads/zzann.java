package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@zzaer
public final class zzann {
    /* renamed from: a */
    private Map<Integer, Bitmap> f8925a = new ConcurrentHashMap();
    /* renamed from: b */
    private AtomicInteger f8926b = new AtomicInteger(0);

    /* renamed from: a */
    public final int m9927a(Bitmap bitmap) {
        if (bitmap == null) {
            zzaok.m10001b("Bitmap is null. Skipping putting into the Memory Map.");
            return -1;
        }
        int andIncrement = this.f8926b.getAndIncrement();
        this.f8925a.put(Integer.valueOf(andIncrement), bitmap);
        return andIncrement;
    }

    /* renamed from: a */
    public final Bitmap m9928a(Integer num) {
        return (Bitmap) this.f8925a.get(num);
    }

    /* renamed from: b */
    public final void m9929b(Integer num) {
        this.f8925a.remove(num);
    }
}
