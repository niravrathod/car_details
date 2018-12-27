package com.google.android.gms.internal.config;

import android.content.Context;
import android.util.Log;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzan implements Runnable {
    /* renamed from: a */
    private final Context f9922a;
    /* renamed from: b */
    private final zzao f9923b;
    /* renamed from: c */
    private final zzao f9924c;
    /* renamed from: d */
    private final zzao f9925d;
    /* renamed from: e */
    private final zzar f9926e;

    public zzan(Context context, zzao zzao, zzao zzao2, zzao zzao3, zzar zzar) {
        this.f9922a = context;
        this.f9923b = zzao;
        this.f9924c = zzao2;
        this.f9925d = zzao3;
        this.f9926e = zzar;
    }

    /* renamed from: a */
    private static zzas m11343a(zzao zzao) {
        zzas zzas = new zzas();
        if (zzao.m11344a() != null) {
            Map a = zzao.m11344a();
            List arrayList = new ArrayList();
            if (a != null) {
                for (String str : a.keySet()) {
                    List arrayList2 = new ArrayList();
                    Map map = (Map) a.get(str);
                    if (map != null) {
                        for (String str2 : map.keySet()) {
                            zzat zzat = new zzat();
                            zzat.f20461a = str2;
                            zzat.f20462b = (byte[]) map.get(str2);
                            arrayList2.add(zzat);
                        }
                    }
                    zzav zzav = new zzav();
                    zzav.f20467a = str;
                    zzav.f20468b = (zzat[]) arrayList2.toArray(new zzat[arrayList2.size()]);
                    arrayList.add(zzav);
                }
            }
            zzas.f20457a = (zzav[]) arrayList.toArray(new zzav[arrayList.size()]);
        }
        if (zzao.m11349b() != null) {
            List b = zzao.m11349b();
            zzas.f20459c = (byte[][]) b.toArray(new byte[b.size()][]);
        }
        zzas.f20458b = zzao.m11352d();
        return zzas;
    }

    public final void run() {
        zzbh zzaw = new zzaw();
        if (this.f9923b != null) {
            zzaw.f20469a = m11343a(this.f9923b);
        }
        if (this.f9924c != null) {
            zzaw.f20470b = m11343a(this.f9924c);
        }
        if (this.f9925d != null) {
            zzaw.f20471c = m11343a(this.f9925d);
        }
        if (this.f9926e != null) {
            zzau zzau = new zzau();
            zzau.f20463a = this.f9926e.m11353a();
            zzau.f20464b = this.f9926e.m11360b();
            zzaw.f20472d = zzau;
        }
        if (!(this.f9926e == null || this.f9926e.m11361c() == null)) {
            List arrayList = new ArrayList();
            Map c = this.f9926e.m11361c();
            for (String str : c.keySet()) {
                if (c.get(str) != null) {
                    zzax zzax = new zzax();
                    zzax.f20477c = str;
                    zzax.f20476b = ((zzal) c.get(str)).m11342b();
                    zzax.f20475a = ((zzal) c.get(str)).m11341a();
                    arrayList.add(zzax);
                }
            }
            zzaw.f20473e = (zzax[]) arrayList.toArray(new zzax[arrayList.size()]);
        }
        byte[] bArr = new byte[zzaw.m11419d()];
        try {
            zzaz a = zzaz.m11381a(bArr, 0, bArr.length);
            zzaw.mo2912a(a);
            a.m11390a();
            try {
                FileOutputStream openFileOutput = this.f9922a.openFileOutput("persisted_config", 0);
                openFileOutput.write(bArr);
                openFileOutput.close();
            } catch (Throwable e) {
                Log.e("AsyncPersisterTask", "Could not persist config.", e);
            }
        } catch (Throwable e2) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e2);
        }
    }
}
