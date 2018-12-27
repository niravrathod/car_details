package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

@zzaer
public final class zzamt extends zzaj {
    /* renamed from: a */
    private final Context f19890a;

    /* renamed from: a */
    public static zzv m26277a(Context context) {
        context = new zzv(new zzam(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzamt(context, new zzas()));
        context.m11145a();
        return context;
    }

    private zzamt(Context context, zzar zzar) {
        super(zzar);
        this.f19890a = context;
    }

    /* renamed from: a */
    public final zzp mo2294a(zzr<?> zzr) {
        if (zzr.m11038i() && zzr.m11031c() == 0) {
            if (Pattern.matches((String) zzkd.m10713e().m10897a(zznw.ca), zzr.m11034e())) {
                zzkd.m10709a();
                if (zzaoa.m9969c(this.f19890a, 13400000)) {
                    zzp a = new zztc(this.f19890a).mo2294a((zzr) zzr);
                    String str;
                    if (a != null) {
                        str = "Got gmscore asset response: ";
                        zzr = String.valueOf(zzr.m11034e());
                        zzalg.m21225a(zzr.length() != 0 ? str.concat(zzr) : new String(str));
                        return a;
                    }
                    String str2 = "Failed to get gmscore asset response: ";
                    str = String.valueOf(zzr.m11034e());
                    zzalg.m21225a(str.length() != 0 ? str2.concat(str) : new String(str2));
                }
            }
        }
        return super.mo2294a(zzr);
    }
}
