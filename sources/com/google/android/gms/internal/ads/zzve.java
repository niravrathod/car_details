package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@zzaer
@ParametersAreNonnullByDefault
public final class zzve extends zzvp<zzwy> implements zzvl, zzvr {
    /* renamed from: a */
    private final zzaug f21367a;
    /* renamed from: b */
    private zzvs f21368b;

    public zzve(Context context, zzaop zzaop) {
        try {
            this.f21367a = new zzaug(context, new vb());
            this.f21367a.setWillNotDraw(true);
            this.f21367a.addJavascriptInterface(new va(this), "GoogleJsInterface");
            zzbv.zzek().m9834a(context, zzaop.f19893a, this.f21367a.getSettings());
            super.m11156a((Object) this);
        } catch (Context context2) {
            zzaop = new zzasq("Init failed.", context2);
        }
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
    public final void mo4817a(String str) {
        mo4819c(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", new Object[]{str}));
    }

    /* renamed from: c */
    public final void mo4819c(String str) {
        zzapn.f8961a.execute(new uw(this, str));
    }

    /* renamed from: d */
    public final void mo4820d(String str) {
        zzapn.f8961a.execute(new ux(this, str));
    }

    /* renamed from: a */
    public final void mo4816a(zzvs zzvs) {
        this.f21368b = zzvs;
    }

    /* renamed from: a */
    public final void mo4815a() {
        this.f21367a.destroy();
    }

    /* renamed from: b */
    public final zzwz mo4818b() {
        return new zzxa(this);
    }

    /* renamed from: b */
    public final void mo2749b(String str) {
        zzapn.f8961a.execute(new uy(this, str));
    }

    /* renamed from: e */
    final /* synthetic */ void m28377e(String str) {
        this.f21367a.mo2409b(str);
    }

    /* renamed from: f */
    final /* synthetic */ void m28378f(String str) {
        this.f21367a.loadUrl(str);
    }

    /* renamed from: g */
    final /* synthetic */ void m28379g(String str) {
        this.f21367a.loadData(str, "text/html", "UTF-8");
    }
}
