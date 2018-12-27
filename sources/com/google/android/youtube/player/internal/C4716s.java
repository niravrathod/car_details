package com.google.android.youtube.player.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.youtube.player.internal.C2545p.C4177a;
import com.google.android.youtube.player.internal.C2554v.C2552a;
import com.google.android.youtube.player.internal.C2554v.C2553b;
import com.google.android.youtube.player.internal.C4179t.C4717d;

/* renamed from: com.google.android.youtube.player.internal.s */
public final class C4716s extends C4179t<C2545p> implements C4157e {
    /* renamed from: b */
    private final String f20763b;
    /* renamed from: c */
    private final String f20764c;
    /* renamed from: d */
    private final String f20765d;
    /* renamed from: e */
    private boolean f20766e;

    public C4716s(Context context, String str, String str2, String str3, C2552a c2552a, C2553b c2553b) {
        super(context, c2552a, c2553b);
        this.f20763b = (String) C2534c.m12477a((Object) str);
        this.f20764c = C2534c.m12479a(str2, (Object) "callingPackage cannot be null or empty");
        this.f20765d = C2534c.m12479a(str3, (Object) "callingAppVersion cannot be null or empty");
    }

    /* renamed from: k */
    private final void m27394k() {
        m22996i();
        if (this.f20766e) {
            throw new IllegalStateException("Connection client has been released");
        }
    }

    /* renamed from: a */
    public final IBinder mo4406a() {
        m27394k();
        try {
            return ((C2545p) m22997j()).mo3294a();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface mo4407a(IBinder iBinder) {
        return C4177a.m22974a(iBinder);
    }

    /* renamed from: a */
    protected final void mo4408a(C2541l c2541l, C4717d c4717d) {
        c2541l.mo3285a(c4717d, 1202, this.f20764c, this.f20765d, this.f20763b, null);
    }

    /* renamed from: a */
    public final void mo4409a(boolean r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.m22993f();
        if (r0 == 0) goto L_0x0012;
    L_0x0006:
        r0 = r1.m22997j();	 Catch:{ RemoteException -> 0x000f }
        r0 = (com.google.android.youtube.player.internal.C2545p) r0;	 Catch:{ RemoteException -> 0x000f }
        r0.mo3296a(r2);	 Catch:{ RemoteException -> 0x000f }
    L_0x000f:
        r2 = 1;
        r1.f20766e = r2;
    L_0x0012:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.internal.s.a(boolean):void");
    }

    /* renamed from: b */
    protected final String mo4410b() {
        return "com.google.android.youtube.player.internal.IYouTubeService";
    }

    /* renamed from: c */
    protected final String mo4411c() {
        return "com.google.android.youtube.api.service.START";
    }

    /* renamed from: d */
    public final void mo3298d() {
        if (!this.f20766e) {
            mo4409a(true);
        }
        super.mo3298d();
    }
}
