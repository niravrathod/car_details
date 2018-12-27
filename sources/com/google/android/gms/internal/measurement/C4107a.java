package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzem.C2472b;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.a */
final class C4107a extends C2472b {
    /* renamed from: c */
    private final /* synthetic */ Context f17408c;
    /* renamed from: d */
    private final /* synthetic */ String f17409d;
    /* renamed from: e */
    private final /* synthetic */ String f17410e;
    /* renamed from: f */
    private final /* synthetic */ Bundle f17411f;
    /* renamed from: g */
    private final /* synthetic */ zzem f17412g;

    C4107a(zzem zzem, Context context, String str, String str2, Bundle bundle) {
        this.f17412g = zzem;
        this.f17408c = context;
        this.f17409d = str;
        this.f17410e = str2;
        this.f17411f = bundle;
        super(zzem);
    }

    /* renamed from: b */
    public final void mo2919b() {
        try {
            this.f17412g.f10144f = new HashMap();
            this.f17412g.f10148j = this.f17412g.m11927a(this.f17408c);
            if (this.f17412g.f10148j == null) {
                Log.w(this.f17412g.f10141c, "Failed to connect to measurement client.");
                return;
            }
            String str;
            String str2;
            String c;
            if (zzem.m11919b(this.f17409d, this.f17410e)) {
                String str3 = this.f17410e;
                str = this.f17409d;
                str2 = str3;
                c = this.f17412g.f10141c;
            } else {
                c = null;
                str = c;
                str2 = str;
            }
            int b = zzem.m11924f(this.f17408c);
            int c2 = zzem.m11923e(this.f17408c);
            this.f17412g.f10148j.mo3120a(ObjectWrapper.m26019a(this.f17408c), new zzek(13001, (long) Math.max(b, c2), c2 < b, c, str, str2, this.f17411f), this.a);
        } catch (Exception e) {
            this.f17412g.m11913a(e, true, false);
        }
    }
}
