package com.bumptech.glide.load.engine.p061b;

import android.util.Log;
import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.load.engine.p061b.C1242a.C1241b;
import com.bumptech.glide.p050a.C1124a;
import com.bumptech.glide.p050a.C1124a.C1123d;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.b.e */
public class C3470e implements C1242a {
    /* renamed from: a */
    private final C1252j f14429a;
    /* renamed from: b */
    private final File f14430b;
    /* renamed from: c */
    private final long f14431c;
    /* renamed from: d */
    private final C1245c f14432d = new C1245c();
    /* renamed from: e */
    private C1124a f14433e;

    /* renamed from: a */
    public static C1242a m17645a(File file, long j) {
        return new C3470e(file, j);
    }

    @Deprecated
    protected C3470e(File file, long j) {
        this.f14430b = file;
        this.f14431c = j;
        this.f14429a = new C1252j();
    }

    /* renamed from: a */
    private synchronized C1124a m17644a() {
        if (this.f14433e == null) {
            this.f14433e = C1124a.m4665a(this.f14430b, 1, 1, this.f14431c);
        }
        return this.f14433e;
    }

    /* renamed from: a */
    public File mo1018a(C1216c c1216c) {
        String a = this.f14429a.m5088a(c1216c);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Get: Obtained: ");
            stringBuilder.append(a);
            stringBuilder.append(" for for Key: ");
            stringBuilder.append(c1216c);
            Log.v("DiskLruCacheWrapper", stringBuilder.toString());
        }
        try {
            C1123d a2 = m17644a().m4683a(a);
            if (a2 != null) {
                return a2.m4662a(0);
            }
            return null;
        } catch (Throwable e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo1019a(C1216c c1216c, C1241b c1241b) {
        String a = this.f14429a.m5088a(c1216c);
        this.f14432d.m5069a(a);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Put: Obtained: ");
                stringBuilder.append(a);
                stringBuilder.append(" for for Key: ");
                stringBuilder.append(c1216c);
                Log.v("DiskLruCacheWrapper", stringBuilder.toString());
            }
            try {
                c1216c = m17644a();
                if (c1216c.m4683a(a) == null) {
                    c1216c = c1216c.m4685b(a);
                    if (c1216c != null) {
                        if (c1241b.mo1032a(c1216c.m4644a(0)) != null) {
                            c1216c.m4645a();
                        }
                        c1216c.m4647c();
                        this.f14432d.m5070b(a);
                        return;
                    }
                    c1241b = new StringBuilder();
                    c1241b.append("Had two simultaneous puts for: ");
                    c1241b.append(a);
                    throw new IllegalStateException(c1241b.toString());
                }
            } catch (C1216c c1216c2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5) != null) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", c1216c2);
                }
            } catch (Throwable th) {
                c1216c2.m4647c();
            }
        } finally {
            this.f14432d.m5070b(a);
        }
    }
}
