package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@zzaer
@ParametersAreNonnullByDefault
public final class zzvt implements zzvl, zzvr {
    /* renamed from: a */
    private final zzasg f21369a;
    /* renamed from: b */
    private final Context f21370b;

    public zzvt(Context context, zzaop zzaop, zzck zzck, zzv zzv) {
        this.f21370b = context;
        zzbv.zzel();
        this.f21369a = zzasm.m10092a(context, zzatt.m10128a(), "", false, false, zzck, zzaop, null, null, null, zzhv.m10677a());
        this.f21369a.getView().setWillNotDraw(true);
    }

    /* renamed from: a */
    public final void mo4786a(String str, String str2) {
        zzvm.m11149a((zzvl) this, str, str2);
    }

    /* renamed from: a */
    public final void mo4743a(String str, Map map) {
        zzvm.m11150a((zzvl) this, str, map);
    }

    /* renamed from: a */
    public final void mo2748a(String str, JSONObject jSONObject) {
        zzvm.m11152b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final void mo4750b(String str, JSONObject jSONObject) {
        zzvm.m11151a((zzvl) this, str, jSONObject);
    }

    /* renamed from: a */
    private static void m28381a(Runnable runnable) {
        zzkd.m10709a();
        if (zzaoa.m9965b()) {
            runnable.run();
        } else {
            zzalo.f8872a.post(runnable);
        }
    }

    /* renamed from: b */
    public final void mo2749b(String str) {
        m28381a(new vd(this, str));
    }

    /* renamed from: a */
    public final void mo4817a(String str) {
        m28381a(new vg(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    /* renamed from: c */
    public final void mo4819c(String str) {
        m28381a(new vh(this, str));
    }

    /* renamed from: d */
    public final void mo4820d(String str) {
        m28381a(new vi(this, str));
    }

    /* renamed from: a */
    public final void mo4821a(String str, zzu<? super zzwy> zzu) {
        this.f21369a.mo4740a(str, new vj(this, zzu));
    }

    /* renamed from: b */
    public final void mo4822b(String str, zzu<? super zzwy> zzu) {
        this.f21369a.mo4741a(str, new ve(zzu));
    }

    /* renamed from: a */
    public final void mo4816a(zzvs zzvs) {
        zzatn u = this.f21369a.mo4782u();
        zzvs.getClass();
        u.mo2394a(vf.m21021a(zzvs));
    }

    /* renamed from: b */
    public final zzwz mo4818b() {
        return new zzxa(this);
    }

    /* renamed from: a */
    public final void mo4815a() {
        this.f21369a.destroy();
    }

    /* renamed from: e */
    final /* synthetic */ void m28395e(String str) {
        this.f21369a.mo2749b(str);
    }
}
