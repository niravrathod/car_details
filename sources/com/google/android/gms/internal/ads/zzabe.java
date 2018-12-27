package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.C2397R;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@zzaer
public final class zzabe extends zzabr {
    /* renamed from: a */
    private final Map<String, String> f16727a;
    /* renamed from: b */
    private final Context f16728b;
    /* renamed from: c */
    private String f16729c = m21061d("description");
    /* renamed from: d */
    private long f16730d = m21062e("start_ticks");
    /* renamed from: e */
    private long f16731e = m21062e("end_ticks");
    /* renamed from: f */
    private String f16732f = m21061d("summary");
    /* renamed from: g */
    private String f16733g = m21061d("location");

    public zzabe(zzasg zzasg, Map<String, String> map) {
        super(zzasg, "createCalendarEvent");
        this.f16727a = map;
        this.f16728b = zzasg.mo4199d();
    }

    /* renamed from: d */
    private final String m21061d(String str) {
        return TextUtils.isEmpty((CharSequence) this.f16727a.get(str)) ? "" : (String) this.f16727a.get(str);
    }

    /* renamed from: e */
    private final long m21062e(java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = r4.f16727a;
        r5 = r0.get(r5);
        r5 = (java.lang.String) r5;
        r0 = -1;
        if (r5 != 0) goto L_0x000d;
    L_0x000c:
        return r0;
    L_0x000d:
        r2 = java.lang.Long.parseLong(r5);	 Catch:{ NumberFormatException -> 0x0012 }
        return r2;
    L_0x0012:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabe.e(java.lang.String):long");
    }

    /* renamed from: a */
    public final void m21063a() {
        if (this.f16728b == null) {
            m9445a("Activity context is not available.");
            return;
        }
        zzbv.zzek();
        if (zzalo.m9820f(this.f16728b).m10874d()) {
            zzbv.zzek();
            Builder e = zzalo.m9816e(this.f16728b);
            Resources g = zzbv.zzeo().m9722g();
            e.setTitle(g != null ? g.getString(C2397R.string.s5) : "Create calendar event");
            e.setMessage(g != null ? g.getString(C2397R.string.s6) : "Allow Ad to create a calendar event?");
            e.setPositiveButton(g != null ? g.getString(C2397R.string.s3) : "Accept", new C2439k(this));
            e.setNegativeButton(g != null ? g.getString(C2397R.string.s4) : "Decline", new C2440l(this));
            e.create().show();
            return;
        }
        m9445a("This feature is not available on the device.");
    }

    @TargetApi(14)
    /* renamed from: b */
    final Intent m21064b() {
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra("title", this.f16729c);
        data.putExtra("eventLocation", this.f16733g);
        data.putExtra("description", this.f16732f);
        if (this.f16730d > -1) {
            data.putExtra("beginTime", this.f16730d);
        }
        if (this.f16731e > -1) {
            data.putExtra("endTime", this.f16731e);
        }
        data.setFlags(268435456);
        return data;
    }
}
