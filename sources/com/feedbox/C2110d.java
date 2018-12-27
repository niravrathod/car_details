package com.feedbox;

import android.app.Application;
import com.androidnetworking.C1037a;
import com.feedbox.p121a.C2099a;
import com.feedbox.p121a.C2099a.C2095a;
import com.feedbox.p121a.p122a.C2097b;
import com.feedbox.p123b.C2106d;
import io.branch.referral.Branch;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.feedbox.d */
public final class C2110d {
    /* renamed from: c */
    public static final C3932a f6448c = new C3932a();
    /* renamed from: a */
    public Application f6449a;
    /* renamed from: b */
    public String f6450b;
    /* renamed from: d */
    private int f6451d;
    /* renamed from: e */
    private boolean f6452e;

    /* renamed from: com.feedbox.d$a */
    public static final class C3932a extends C2106d<C2110d> {
        private C3932a() {
            super(VideoApp$Companion$1.f21122a);
        }
    }

    /* renamed from: com.feedbox.d$b */
    public static final class C3933b implements C2095a<C2097b> {
        /* renamed from: a */
        public void m19576a(C2097b c2097b) {
            C2885g.m13910b(c2097b, "t");
        }

        /* renamed from: a */
        public void mo1230a(String str) {
            C2885g.m13910b(str, "message");
        }

        C3933b() {
        }
    }

    /* renamed from: a */
    public final Application m7676a() {
        Application application = this.f6449a;
        if (application == null) {
            C2885g.m13911b("application");
        }
        return application;
    }

    /* renamed from: b */
    public final String m7678b() {
        String str = this.f6450b;
        if (str == null) {
            C2885g.m13911b("appId");
        }
        return str;
    }

    /* renamed from: c */
    public final int m7679c() {
        return this.f6451d;
    }

    /* renamed from: d */
    public final boolean m7680d() {
        return this.f6452e;
    }

    /* renamed from: a */
    public final void m7677a(Application application, String str, int i, boolean z) {
        C2885g.m13910b(application, "application");
        C2885g.m13910b(str, "appId");
        this.f6449a = application;
        this.f6450b = str;
        this.f6451d = i;
        this.f6452e = z;
        C1037a.m4414a(application.getApplicationContext());
        Branch.m23432j();
        Branch.m23417c(application.getApplicationContext());
        C2099a.f6431a.m7660a((C2095a) new C3933b());
    }
}
