package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.z */
final class C2606z implements Runnable {
    /* renamed from: a */
    private final long f11071a;
    /* renamed from: b */
    private final WakeLock f11072b = ((PowerManager) m12797a().getSystemService("power")).newWakeLock(1, "fiid-sync");
    /* renamed from: c */
    private final FirebaseInstanceId f11073c;
    /* renamed from: d */
    private final C2599o f11074d;
    /* renamed from: e */
    private final ab f11075e;

    @VisibleForTesting
    C2606z(FirebaseInstanceId firebaseInstanceId, C2599o c2599o, ab abVar, long j) {
        this.f11073c = firebaseInstanceId;
        this.f11074d = c2599o;
        this.f11075e = abVar;
        this.f11071a = j;
        this.f11072b.setReferenceCounted(null);
    }

    public final void run() {
        this.f11072b.acquire();
        try {
            this.f11073c.m12675a(true);
            if (!this.f11073c.m12683i()) {
                this.f11073c.m12675a(false);
            } else if (m12798b()) {
                if (m12795c() && m12796d() && this.f11075e.m12693a(this.f11073c)) {
                    this.f11073c.m12675a(false);
                } else {
                    this.f11073c.m12671a(this.f11071a);
                }
                this.f11072b.release();
            } else {
                new aa(this).m12688a();
                this.f11072b.release();
            }
        } finally {
            this.f11072b.release();
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    private final boolean m12795c() {
        try {
            if (!this.f11073c.m12684j()) {
                this.f11073c.m12685k();
            }
            return true;
        } catch (IOException e) {
            String str = "FirebaseInstanceId";
            String str2 = "Build channel failed: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return false;
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    private final boolean m12796d() {
        C2605y e = this.f11073c.m12680e();
        if (e != null && !e.m12794b(this.f11074d.m12759b())) {
            return true;
        }
        String f;
        try {
            f = this.f11073c.m12681f();
            if (f == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (e == null || !(e == null || f.equals(e.f11068a))) {
                Context a = m12797a();
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", f);
                C2603w.m12777b(a, intent);
                C2603w.m12775a(a, new Intent("com.google.firebase.iid.TOKEN_REFRESH"));
            }
            return true;
        } catch (Exception e2) {
            String str = "FirebaseInstanceId";
            f = "Token retrieval failed: ";
            String valueOf = String.valueOf(e2.getMessage());
            Log.e(str, valueOf.length() == 0 ? new String(f) : f.concat(valueOf));
            return false;
        }
    }

    /* renamed from: a */
    final Context m12797a() {
        return this.f11073c.m12676b().m12607a();
    }

    /* renamed from: b */
    final boolean m12798b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m12797a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
