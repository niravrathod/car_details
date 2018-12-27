package com.google.android.youtube.player.internal;

import com.google.android.youtube.player.C2532d;
import com.google.android.youtube.player.C2532d.C2531a;

/* renamed from: com.google.android.youtube.player.internal.a */
public abstract class C4155a implements C2532d {
    /* renamed from: a */
    private C2531a f17674a;
    /* renamed from: b */
    private boolean f17675b;

    /* renamed from: a */
    protected boolean m22892a() {
        return !this.f17675b;
    }

    /* renamed from: b */
    public final void m22893b() {
        if (m22892a()) {
            this.f17675b = true;
            this.f17674a = null;
            m22895d();
        }
    }

    /* renamed from: c */
    public final void m22894c() {
        if (m22892a()) {
            aa.m12464a("The finalize() method for a YouTubeThumbnailLoader has work to do. You should have called release().", new Object[0]);
            m22893b();
        }
    }

    /* renamed from: d */
    public abstract void m22895d();
}
