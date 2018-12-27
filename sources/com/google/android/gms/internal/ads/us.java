package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
final class us {
    /* renamed from: a */
    private final LinkedList<ut> f8409a = new LinkedList();
    /* renamed from: b */
    private zzjk f8410b;
    /* renamed from: c */
    private final String f8411c;
    /* renamed from: d */
    private final int f8412d;
    /* renamed from: e */
    private boolean f8413e;

    us(zzjk zzjk, String str, int i) {
        Preconditions.checkNotNull(zzjk);
        Preconditions.checkNotNull(str);
        this.f8410b = zzjk;
        this.f8411c = str;
        this.f8412d = i;
    }

    /* renamed from: a */
    final zzjk m9388a() {
        return this.f8410b;
    }

    /* renamed from: b */
    final int m9391b() {
        return this.f8412d;
    }

    /* renamed from: c */
    final String m9392c() {
        return this.f8411c;
    }

    /* renamed from: a */
    final ut m9387a(zzjk zzjk) {
        if (zzjk != null) {
            this.f8410b = zzjk;
        }
        return (ut) this.f8409a.remove();
    }

    /* renamed from: d */
    final int m9393d() {
        return this.f8409a.size();
    }

    /* renamed from: e */
    final int m9394e() {
        Iterator it = this.f8409a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((ut) it.next()).f8418e) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    final boolean m9390a(zztr zztr) {
        ut utVar = new ut(this, zztr);
        this.f8409a.add(utVar);
        return utVar.m9398a();
    }

    /* renamed from: f */
    final int m9395f() {
        Iterator it = this.f8409a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((ut) it.next()).m9398a()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    final void m9389a(zztr zztr, zzjk zzjk) {
        this.f8409a.add(new ut(this, zztr, zzjk));
    }

    /* renamed from: g */
    final void m9396g() {
        this.f8413e = true;
    }

    /* renamed from: h */
    final boolean m9397h() {
        return this.f8413e;
    }
}
