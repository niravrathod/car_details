package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public class Storage {
    /* renamed from: a */
    private static final Lock f7871a = new ReentrantLock();
    @GuardedBy("sLk")
    /* renamed from: b */
    private static Storage f7872b;
    /* renamed from: c */
    private final Lock f7873c = new ReentrantLock();
    @GuardedBy("mLk")
    /* renamed from: d */
    private final SharedPreferences f7874d;

    @KeepForSdk
    /* renamed from: a */
    public static Storage m8832a(Context context) {
        Preconditions.checkNotNull(context);
        f7871a.lock();
        try {
            if (f7872b == null) {
                f7872b = new Storage(context.getApplicationContext());
            }
            context = f7872b;
            return context;
        } finally {
            f7871a.unlock();
        }
    }

    @VisibleForTesting
    private Storage(Context context) {
        this.f7874d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: a */
    public GoogleSignInAccount m8836a() {
        return m8831a(m8834b("defaultGoogleSignInAccount"));
    }

    @javax.annotation.Nullable
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: a */
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount m8831a(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = android.text.TextUtils.isEmpty(r3);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = "googleSignInAccount";
        r3 = m8833a(r0, r3);
        r3 = r2.m8834b(r3);
        if (r3 == 0) goto L_0x001a;
    L_0x0014:
        r3 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.m25979a(r3);	 Catch:{ JSONException -> 0x0019 }
        return r3;
    L_0x0019:
        return r1;
    L_0x001a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.Storage.a(java.lang.String):com.google.android.gms.auth.api.signin.GoogleSignInAccount");
    }

    @Nullable
    /* renamed from: b */
    private final String m8834b(String str) {
        this.f7873c.lock();
        try {
            str = this.f7874d.getString(str, null);
            return str;
        } finally {
            this.f7873c.unlock();
        }
    }

    /* renamed from: b */
    public final void m8837b() {
        String b = m8834b("defaultGoogleSignInAccount");
        m8835c("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(b)) {
            m8835c(m8833a("googleSignInAccount", b));
            m8835c(m8833a("googleSignInOptions", b));
        }
    }

    /* renamed from: c */
    private final void m8835c(String str) {
        this.f7873c.lock();
        try {
            this.f7874d.edit().remove(str).apply();
        } finally {
            this.f7873c.unlock();
        }
    }

    /* renamed from: a */
    private static String m8833a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }
}
