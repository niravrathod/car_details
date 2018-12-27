package com.bumptech.glide.load.engine.p060a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.engine.a.k */
public class C3464k implements C1232e {
    /* renamed from: a */
    private static final Config f14405a = Config.ARGB_8888;
    /* renamed from: b */
    private final C1236l f14406b;
    /* renamed from: c */
    private final Set<Config> f14407c;
    /* renamed from: d */
    private final long f14408d;
    /* renamed from: e */
    private final C1235a f14409e;
    /* renamed from: f */
    private long f14410f;
    /* renamed from: g */
    private long f14411g;
    /* renamed from: h */
    private int f14412h;
    /* renamed from: i */
    private int f14413i;
    /* renamed from: j */
    private int f14414j;
    /* renamed from: k */
    private int f14415k;

    /* renamed from: com.bumptech.glide.load.engine.a.k$a */
    private interface C1235a {
        /* renamed from: a */
        void mo1016a(Bitmap bitmap);

        /* renamed from: b */
        void mo1017b(Bitmap bitmap);
    }

    /* renamed from: com.bumptech.glide.load.engine.a.k$b */
    private static final class C3463b implements C1235a {
        /* renamed from: a */
        public void mo1016a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo1017b(Bitmap bitmap) {
        }

        C3463b() {
        }
    }

    C3464k(long j, C1236l c1236l, Set<Config> set) {
        this.f14408d = j;
        this.f14410f = j;
        this.f14406b = c1236l;
        this.f14407c = set;
        this.f14409e = new C3463b();
    }

    public C3464k(long j) {
        this(j, C3464k.m17617f(), C3464k.m17618g());
    }

    /* renamed from: b */
    public long m17623b() {
        return this.f14410f;
    }

    /* renamed from: a */
    public synchronized void mo1005a(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (bitmap.isRecycled()) {
            throw new IllegalStateException("Cannot pool recycled bitmap");
        } else {
            StringBuilder stringBuilder;
            if (bitmap.isMutable() && ((long) this.f14406b.mo1001c(bitmap)) <= this.f14410f) {
                if (this.f14407c.contains(bitmap.getConfig())) {
                    int c = this.f14406b.mo1001c(bitmap);
                    this.f14406b.mo998a(bitmap);
                    this.f14409e.mo1016a(bitmap);
                    this.f14414j++;
                    this.f14411g += (long) c;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Put bitmap in pool=");
                        stringBuilder.append(this.f14406b.mo1000b(bitmap));
                        Log.v("LruBitmapPool", stringBuilder.toString());
                    }
                    m17615d();
                    m17612c();
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Reject bitmap from pool, bitmap: ");
                stringBuilder.append(this.f14406b.mo1000b(bitmap));
                stringBuilder.append(", is mutable: ");
                stringBuilder.append(bitmap.isMutable());
                stringBuilder.append(", is allowed config: ");
                stringBuilder.append(this.f14407c.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", stringBuilder.toString());
            }
            bitmap.recycle();
        }
    }

    /* renamed from: c */
    private void m17612c() {
        m17608a(this.f14410f);
    }

    /* renamed from: a */
    public Bitmap mo1002a(int i, int i2, Config config) {
        Bitmap d = m17614d(i, i2, config);
        if (d == null) {
            return C3464k.m17611c(i, i2, config);
        }
        d.eraseColor(0);
        return d;
    }

    /* renamed from: b */
    public Bitmap mo1006b(int i, int i2, Config config) {
        Bitmap d = m17614d(i, i2, config);
        return d == null ? C3464k.m17611c(i, i2, config) : d;
    }

    /* renamed from: c */
    private static Bitmap m17611c(int i, int i2, Config config) {
        if (config == null) {
            config = f14405a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @TargetApi(26)
    /* renamed from: a */
    private static void m17609a(Config config) {
        if (VERSION.SDK_INT >= 26 && config == Config.HARDWARE) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot create a mutable Bitmap with config: ");
            stringBuilder.append(config);
            stringBuilder.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: d */
    private synchronized Bitmap m17614d(int i, int i2, Config config) {
        Bitmap a;
        C3464k.m17609a(config);
        a = this.f14406b.mo997a(i, i2, config != null ? config : f14405a);
        if (a == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Missing bitmap=");
                stringBuilder.append(this.f14406b.mo999b(i, i2, config));
                Log.d("LruBitmapPool", stringBuilder.toString());
            }
            this.f14413i++;
        } else {
            this.f14412h++;
            this.f14411g -= (long) this.f14406b.mo1001c(a);
            this.f14409e.mo1017b(a);
            C3464k.m17610b(a);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Get bitmap=");
            stringBuilder.append(this.f14406b.mo999b(i, i2, config));
            Log.v("LruBitmapPool", stringBuilder.toString());
        }
        m17615d();
        return a;
    }

    /* renamed from: b */
    private static void m17610b(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        C3464k.m17613c(bitmap);
    }

    @TargetApi(19)
    /* renamed from: c */
    private static void m17613c(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: a */
    public void mo1003a() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m17608a(0);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo1004a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("trimMemory, level=");
            stringBuilder.append(i);
            Log.d("LruBitmapPool", stringBuilder.toString());
        }
        if (i >= 40) {
            mo1003a();
        } else if (i >= 20 || i == 15) {
            m17608a(m17623b() / 2);
        }
    }

    /* renamed from: a */
    private synchronized void m17608a(long j) {
        while (this.f14411g > j) {
            Bitmap a = this.f14406b.mo996a();
            if (a == null) {
                if (Log.isLoggable("LruBitmapPool", 5) != null) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m17616e();
                }
                this.f14411g = 0;
                return;
            }
            this.f14409e.mo1017b(a);
            this.f14411g -= (long) this.f14406b.mo1001c(a);
            this.f14415k++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Evicting bitmap=");
                stringBuilder.append(this.f14406b.mo1000b(a));
                Log.d("LruBitmapPool", stringBuilder.toString());
            }
            m17615d();
            a.recycle();
        }
    }

    /* renamed from: d */
    private void m17615d() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m17616e();
        }
    }

    /* renamed from: e */
    private void m17616e() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hits=");
        stringBuilder.append(this.f14412h);
        stringBuilder.append(", misses=");
        stringBuilder.append(this.f14413i);
        stringBuilder.append(", puts=");
        stringBuilder.append(this.f14414j);
        stringBuilder.append(", evictions=");
        stringBuilder.append(this.f14415k);
        stringBuilder.append(", currentSize=");
        stringBuilder.append(this.f14411g);
        stringBuilder.append(", maxSize=");
        stringBuilder.append(this.f14410f);
        stringBuilder.append("\nStrategy=");
        stringBuilder.append(this.f14406b);
        Log.v("LruBitmapPool", stringBuilder.toString());
    }

    /* renamed from: f */
    private static C1236l m17617f() {
        if (VERSION.SDK_INT >= 19) {
            return new C3467n();
        }
        return new C3456c();
    }

    @TargetApi(26)
    /* renamed from: g */
    private static Set<Config> m17618g() {
        Set hashSet = new HashSet(Arrays.asList(Config.values()));
        if (VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        if (VERSION.SDK_INT >= 26) {
            hashSet.remove(Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
