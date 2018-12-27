package com.feedbox.p123b;

import android.content.Context;
import android.preference.PreferenceManager;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.feedbox.b.c */
public final class C2105c {
    /* renamed from: a */
    public static final C2105c f6441a = new C2105c();
    /* renamed from: b */
    private static final String f6442b = f6442b;
    /* renamed from: c */
    private static final String f6443c = f6443c;

    private C2105c() {
    }

    /* renamed from: a */
    public final String m7669a() {
        return f6442b;
    }

    /* renamed from: b */
    public final String m7671b() {
        return f6443c;
    }

    /* renamed from: a */
    public final String m7670a(Context context, String str) {
        C2885g.m13910b(context, "context");
        C2885g.m13910b(str, "key");
        Object string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, "");
        C2885g.m13907a(string, "PreferenceManager.getDef…ntext).getString(key, \"\")");
        return string;
    }
}
