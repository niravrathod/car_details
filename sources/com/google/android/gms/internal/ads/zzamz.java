package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzamz {
    /* renamed from: a */
    private static zzv f8917a;
    /* renamed from: b */
    private static final Object f8918b = new Object();
    @Deprecated
    /* renamed from: c */
    private static final zzanf<Void> f8919c = new dv();

    public zzamz(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        m9917a(context);
    }

    @Deprecated
    /* renamed from: a */
    public final <T> zzapi<T> m9919a(String str, zzanf<T> zzanf) {
        zzapi zzaps = new zzaps();
        f8917a.m11144a(new zzanh(str, zzaps));
        return zzaox.m10023a(zzaox.m10022a(zzaps, new dx(this, zzanf), zzalm.f8869a), Throwable.class, new dw(this, zzanf), zzapn.f8962b);
    }

    /* renamed from: a */
    public final zzapi<String> m9918a(int i, String str, Map<String, String> map, byte[] bArr) {
        String str2 = str;
        zzapi eaVar = new ea();
        zzamz zzamz = this;
        zzy dyVar = new dy(this, str2, eaVar);
        zzaoe zzaoe = new zzaoe(null);
        zzr dzVar = new dz(this, i, str, eaVar, dyVar, bArr, map, zzaoe);
        if (zzaoe.m9991c()) {
            try {
                zzaoe.m9993a(str2, "GET", dzVar.mo4155b(), dzVar.mo4154a());
            } catch (Throwable e) {
                zzaok.m10007e(e.getMessage());
            }
        }
        f8917a.m11144a(dzVar);
        return eaVar;
    }

    /* renamed from: a */
    public final zzapi<String> m9920a(String str, Map<String, String> map) {
        return m9918a(0, str, map, null);
    }

    @VisibleForTesting
    /* renamed from: a */
    private static zzv m9917a(Context context) {
        synchronized (f8918b) {
            if (f8917a == null) {
                zznw.m10901a(context);
                if (((Boolean) zzkd.m10713e().m10897a(zznw.bZ)).booleanValue()) {
                    context = zzamt.m26277a(context);
                } else {
                    context = new zzv(new zzam(new File(context.getCacheDir(), "volley")), new zzaj(new zzas()));
                    context.m11145a();
                }
                f8917a = context;
            }
            context = f8917a;
        }
        return context;
    }
}
