package com.google.android.exoplayer2.p126c;

import android.annotation.TargetApi;
import android.os.Trace;

/* renamed from: com.google.android.exoplayer2.c.r */
public final class C2184r {
    /* renamed from: a */
    public static void m8036a(String str) {
        if (C2186s.f6761a >= 18) {
            C2184r.m8038b(str);
        }
    }

    /* renamed from: a */
    public static void m8035a() {
        if (C2186s.f6761a >= 18) {
            C2184r.m8037b();
        }
    }

    @TargetApi(18)
    /* renamed from: b */
    private static void m8038b(String str) {
        Trace.beginSection(str);
    }

    @TargetApi(18)
    /* renamed from: b */
    private static void m8037b() {
        Trace.endSection();
    }
}
