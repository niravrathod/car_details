package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

@zzaer
public class zzjs {
    /* renamed from: a */
    private final zzji f9568a;
    /* renamed from: b */
    private final zzjh f9569b;
    /* renamed from: c */
    private final zzmp f9570c;
    /* renamed from: d */
    private final zzsj f9571d;
    /* renamed from: e */
    private final zzaim f9572e;
    /* renamed from: f */
    private final zzajm f9573f;
    /* renamed from: g */
    private final zzabv f9574g;
    /* renamed from: h */
    private final zzsk f9575h;

    public zzjs(zzji zzji, zzjh zzjh, zzmp zzmp, zzsj zzsj, zzaim zzaim, zzajm zzajm, zzabv zzabv, zzsk zzsk) {
        this.f9568a = zzji;
        this.f9569b = zzjh;
        this.f9570c = zzmp;
        this.f9571d = zzsj;
        this.f9572e = zzaim;
        this.f9573f = zzajm;
        this.f9574g = zzabv;
        this.f9575h = zzsk;
    }

    /* renamed from: b */
    private static void m10699b(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzkd.m10709a().m9973a(context, zzkd.m10715g().f19893a, "gmob-apps", bundle, true);
    }

    /* renamed from: a */
    public final zzkp m10706a(Context context, String str, zzyn zzyn) {
        return (zzkp) new rq(this, context, str, zzyn).m9372a(context, null);
    }

    /* renamed from: a */
    public final zzqo m10707a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzqo) new rs(this, frameLayout, frameLayout2, context).m9372a(context, null);
    }

    /* renamed from: a */
    public final zzqt m10708a(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        return (zzqt) new ru(this, view, hashMap, hashMap2).m9372a(view.getContext(), null);
    }

    /* renamed from: a */
    public final zzabw m10705a(Activity activity) {
        rw rnVar = new rn(this, activity);
        String str = "com.google.android.gms.ads.internal.overlay.useClientJar";
        Intent intent = activity.getIntent();
        boolean z = false;
        if (intent.hasExtra(str)) {
            z = intent.getBooleanExtra(str, false);
        } else {
            zzaok.m10003c("useClientJar flag not found in activity intent extras.");
        }
        return (zzabw) rnVar.m9372a(activity, z);
    }
}
