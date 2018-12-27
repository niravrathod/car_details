package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.List;

final class de implements zzou {
    /* renamed from: a */
    private final /* synthetic */ List f16453a;
    /* renamed from: b */
    private final /* synthetic */ zzot f16454b;
    /* renamed from: c */
    private final /* synthetic */ Context f16455c;

    de(zzalo zzalo, List list, zzot zzot, Context context) {
        this.f16453a = list;
        this.f16454b = zzot;
        this.f16455c = context;
    }

    /* renamed from: b */
    public final void mo1943b() {
    }

    /* renamed from: a */
    public final void mo1942a() {
        for (String str : this.f16453a) {
            String str2 = "Pinging url: ";
            String valueOf = String.valueOf(str);
            zzaok.m10005d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            this.f16454b.m21798a(Uri.parse(str), null, null);
        }
        this.f16454b.m21795a((Activity) this.f16455c);
    }
}
