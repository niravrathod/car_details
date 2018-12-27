package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@zzaer
public final class zzxa implements zzvl, zzwz {
    /* renamed from: a */
    private final zzwy f21371a;
    /* renamed from: b */
    private final HashSet<SimpleEntry<String, zzu<? super zzwy>>> f21372b = new HashSet();

    public zzxa(zzwy zzwy) {
        this.f21371a = zzwy;
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

    /* renamed from: b */
    public final void mo2749b(String str) {
        this.f21371a.mo2749b(str);
    }

    /* renamed from: a */
    public final void mo4821a(String str, zzu<? super zzwy> zzu) {
        this.f21371a.mo4821a(str, zzu);
        this.f21372b.add(new SimpleEntry(str, zzu));
    }

    /* renamed from: b */
    public final void mo4822b(String str, zzu<? super zzwy> zzu) {
        this.f21371a.mo4822b(str, zzu);
        this.f21372b.remove(new SimpleEntry(str, zzu));
    }

    /* renamed from: a */
    public final void mo4823a() {
        Iterator it = this.f21372b.iterator();
        while (it.hasNext()) {
            SimpleEntry simpleEntry = (SimpleEntry) it.next();
            String str = "Unregistering eventhandler: ";
            String valueOf = String.valueOf(((zzu) simpleEntry.getValue()).toString());
            zzalg.m21225a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.f21371a.mo4822b((String) simpleEntry.getKey(), (zzu) simpleEntry.getValue());
        }
        this.f21372b.clear();
    }
}
