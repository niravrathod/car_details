package com.bumptech.glide.p052c;

import android.content.Context;
import android.support.v4.content.C0389b;
import android.util.Log;
import com.bumptech.glide.p052c.C3360c.C1133a;

/* renamed from: com.bumptech.glide.c.f */
public class C3361f implements C1134d {
    /* renamed from: a */
    public C3360c mo944a(Context context, C1133a c1133a) {
        Object obj = C0389b.m1435b(context, "android.permission.ACCESS_NETWORK_STATE") == 0 ? 1 : null;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", obj != null ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return obj != null ? new C4503e(context, c1133a) : new C4504j();
    }
}
