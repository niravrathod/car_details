package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

@zzaer
public final class zznr {
    /* renamed from: a */
    private final Collection<zznl<?>> f9666a = new ArrayList();
    /* renamed from: b */
    private final Collection<zznl<String>> f9667b = new ArrayList();
    /* renamed from: c */
    private final Collection<zznl<String>> f9668c = new ArrayList();

    /* renamed from: a */
    public final void m10891a(zznl zznl) {
        this.f9666a.add(zznl);
    }

    /* renamed from: b */
    public final void m10893b(zznl<String> zznl) {
        this.f9667b.add(zznl);
    }

    /* renamed from: c */
    public final void m10894c(zznl<String> zznl) {
        this.f9668c.add(zznl);
    }

    /* renamed from: a */
    public final void m10890a(Editor editor, int i, JSONObject jSONObject) {
        for (zznl zznl : this.f9666a) {
            if (zznl.m10888c() == 1) {
                zznl.mo2171a(editor, zznl.mo2170a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzaok.m10003c("Flag Json is null.");
        }
    }

    /* renamed from: a */
    public final List<String> m10889a() {
        List<String> arrayList = new ArrayList();
        for (zznl a : this.f9667b) {
            String str = (String) zzkd.m10713e().m10897a(a);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List<String> m10892b() {
        List<String> a = m10889a();
        for (zznl a2 : this.f9668c) {
            String str = (String) zzkd.m10713e().m10897a(a2);
            if (str != null) {
                a.add(str);
            }
        }
        return a;
    }
}
