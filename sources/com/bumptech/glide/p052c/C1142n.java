package com.bumptech.glide.p052c;

import android.util.Log;
import com.bumptech.glide.p055g.C1180j;
import com.bumptech.glide.request.C1310b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.c.n */
public class C1142n {
    /* renamed from: a */
    private final Set<C1310b> f3734a = Collections.newSetFromMap(new WeakHashMap());
    /* renamed from: b */
    private final List<C1310b> f3735b = new ArrayList();
    /* renamed from: c */
    private boolean f3736c;

    /* renamed from: a */
    public void m4763a(C1310b c1310b) {
        this.f3734a.add(c1310b);
        if (this.f3736c) {
            c1310b.mo1078b();
            if (Log.isLoggable("RequestTracker", 2)) {
                Log.v("RequestTracker", "Paused, delaying request");
            }
            this.f3735b.add(c1310b);
            return;
        }
        c1310b.mo1073a();
    }

    /* renamed from: b */
    public boolean m4765b(C1310b c1310b) {
        return m4761a(c1310b, true);
    }

    /* renamed from: a */
    private boolean m4761a(C1310b c1310b, boolean z) {
        boolean z2 = true;
        if (c1310b == null) {
            return true;
        }
        boolean remove = this.f3734a.remove(c1310b);
        if (!this.f3735b.remove(c1310b)) {
            if (!remove) {
                z2 = false;
            }
        }
        if (z2) {
            c1310b.mo1078b();
            if (z) {
                c1310b.mo1084h();
            }
        }
        return z2;
    }

    /* renamed from: a */
    public void m4762a() {
        this.f3736c = true;
        for (C1310b c1310b : C1180j.m4894a(this.f3734a)) {
            if (c1310b.mo1079c()) {
                c1310b.mo1078b();
                this.f3735b.add(c1310b);
            }
        }
    }

    /* renamed from: b */
    public void m4764b() {
        this.f3736c = false;
        for (C1310b c1310b : C1180j.m4894a(this.f3734a)) {
            if (!(c1310b.mo1080d() || c1310b.mo1079c())) {
                c1310b.mo1073a();
            }
        }
        this.f3735b.clear();
    }

    /* renamed from: c */
    public void m4766c() {
        for (C1310b a : C1180j.m4894a(this.f3734a)) {
            m4761a(a, false);
        }
        this.f3735b.clear();
    }

    /* renamed from: d */
    public void m4767d() {
        for (C1310b c1310b : C1180j.m4894a(this.f3734a)) {
            if (!(c1310b.mo1080d() || c1310b.mo1082f())) {
                c1310b.mo1078b();
                if (this.f3736c) {
                    this.f3735b.add(c1310b);
                } else {
                    c1310b.mo1073a();
                }
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("{numRequests=");
        stringBuilder.append(this.f3734a.size());
        stringBuilder.append(", isPaused=");
        stringBuilder.append(this.f3736c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
