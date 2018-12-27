package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class du {
    /* renamed from: a */
    long f8011a;
    /* renamed from: b */
    final String f8012b;
    /* renamed from: c */
    final String f8013c;
    /* renamed from: d */
    final long f8014d;
    /* renamed from: e */
    final long f8015e;
    /* renamed from: f */
    final long f8016f;
    /* renamed from: g */
    final long f8017g;
    /* renamed from: h */
    final List<zzl> f8018h;

    private du(String str, String str2, long j, long j2, long j3, long j4, List<zzl> list) {
        this.f8012b = str;
        if ("".equals(str2) != null) {
            str2 = null;
        }
        this.f8013c = str2;
        this.f8014d = j;
        this.f8015e = j2;
        this.f8016f = j3;
        this.f8017g = j4;
        this.f8018h = list;
    }

    du(String str, zzc zzc) {
        List list;
        zzc zzc2 = zzc;
        String str2 = zzc2.f9327b;
        long j = zzc2.f9328c;
        long j2 = zzc2.f9329d;
        long j3 = zzc2.f9330e;
        long j4 = zzc2.f9331f;
        if (zzc2.f9333h != null) {
            list = zzc2.f9333h;
        } else {
            Map map = zzc2.f9332g;
            List arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                arrayList.add(new zzl((String) entry.getKey(), (String) entry.getValue()));
            }
            list = arrayList;
        }
        this(str, str2, j, j2, j3, j4, list);
        this.f8011a = (long) zzc2.f9326a.length;
    }

    /* renamed from: a */
    static du m8918a(eg egVar) {
        if (zzam.m21264a((InputStream) egVar) == 538247942) {
            return new du(zzam.m21266a(egVar), zzam.m21266a(egVar), zzam.m21272b((InputStream) egVar), zzam.m21272b((InputStream) egVar), zzam.m21272b((InputStream) egVar), zzam.m21272b((InputStream) egVar), zzam.m21273b(egVar));
        }
        throw new IOException();
    }

    /* renamed from: a */
    final boolean m8919a(OutputStream outputStream) {
        try {
            zzam.m21267a(outputStream, 538247942);
            zzam.m21269a(outputStream, this.f8012b);
            zzam.m21269a(outputStream, this.f8013c == null ? "" : this.f8013c);
            zzam.m21268a(outputStream, this.f8014d);
            zzam.m21268a(outputStream, this.f8015e);
            zzam.m21268a(outputStream, this.f8016f);
            zzam.m21268a(outputStream, this.f8017g);
            List<zzl> list = this.f8018h;
            if (list != null) {
                zzam.m21267a(outputStream, list.size());
                for (zzl zzl : list) {
                    zzam.m21269a(outputStream, zzl.m10728a());
                    zzam.m21269a(outputStream, zzl.m10729b());
                }
            } else {
                zzam.m21267a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (OutputStream outputStream2) {
            zzaf.m9510b("%s", outputStream2.toString());
            return false;
        }
    }
}
