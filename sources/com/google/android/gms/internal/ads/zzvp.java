package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public class zzvp<ReferenceT> {
    /* renamed from: a */
    private final Map<String, CopyOnWriteArrayList<zzu<? super ReferenceT>>> f9814a = new HashMap();
    /* renamed from: b */
    private ReferenceT f9815b;

    /* renamed from: a */
    public final void m11156a(ReferenceT referenceT) {
        this.f9815b = referenceT;
    }

    /* renamed from: a */
    public final boolean m11159a(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return null;
        }
        String path = uri.getPath();
        zzbv.zzek();
        mo4743a(path, zzalo.m9786a(uri));
        return true;
    }

    /* renamed from: a */
    private final synchronized void mo4743a(String str, Map<String, String> map) {
        if (zzaok.m10000a(2)) {
            String str2 = "Received GMSG: ";
            String valueOf = String.valueOf(str);
            zzalg.m21225a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            for (String valueOf2 : map.keySet()) {
                String str3 = (String) map.get(valueOf2);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf2).length() + 4) + String.valueOf(str3).length());
                stringBuilder.append("  ");
                stringBuilder.append(valueOf2);
                stringBuilder.append(": ");
                stringBuilder.append(str3);
                zzalg.m21225a(stringBuilder.toString());
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f9814a.get(str);
        if (copyOnWriteArrayList != null) {
            str = copyOnWriteArrayList.iterator();
            while (str.hasNext()) {
                zzapn.f8961a.execute(new vc(this, (zzu) str.next(), map));
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m11157a(String str, zzu<? super ReferenceT> zzu) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f9814a.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f9814a.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(zzu);
    }

    /* renamed from: b */
    public final synchronized void m11160b(String str, zzu<? super ReferenceT> zzu) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f9814a.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(zzu);
        }
    }

    /* renamed from: a */
    public final synchronized void m11158a(String str, Predicate<zzu<? super ReferenceT>> predicate) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f9814a.get(str);
        if (copyOnWriteArrayList != null) {
            Collection arrayList = new ArrayList();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                zzu zzu = (zzu) it.next();
                if (predicate.apply(zzu)) {
                    arrayList.add(zzu);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
    }

    /* renamed from: c */
    public final synchronized void m11161c() {
        this.f9814a.clear();
    }

    /* renamed from: a */
    final /* synthetic */ void m11155a(zzu zzu, Map map) {
        zzu.zza(this.f9815b, map);
    }
}
