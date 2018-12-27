package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@zzaer
public final class zzamq {
    /* renamed from: a */
    private final Object f8899a = new Object();
    @GuardedBy("mLock")
    /* renamed from: b */
    private String f8900b = "";
    @GuardedBy("mLock")
    /* renamed from: c */
    private String f8901c = "";
    @GuardedBy("mLock")
    /* renamed from: d */
    private boolean f8902d = false;
    @VisibleForTesting
    /* renamed from: e */
    private String f8903e = "";

    /* renamed from: a */
    public final void m9904a(Context context, String str, String str2) {
        if (!m9898b(context, str, str2)) {
            m9897a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.f8903e)) {
            zzaok.m10001b("Creative is not pushed for this device.");
            m9897a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.f8903e)) {
            zzaok.m10001b("The app is not linked for creative preview.");
            m9902e(context, str, str2);
        } else {
            if ("0".equals(this.f8903e) != null) {
                zzaok.m10001b("Device is linked for in app preview.");
                m9897a(context, "The device is successfully linked for creative preview.", false, true);
            }
        }
    }

    /* renamed from: a */
    public final void m9905a(Context context, String str, String str2, @Nullable String str3) {
        boolean b = m9907b();
        if (m9900c(context, str, str2)) {
            if (!(b || TextUtils.isEmpty(str3))) {
                m9906b(context, str2, str3, str);
            }
            zzaok.m10001b("Device is linked for debug signals.");
            m9897a(context, "The device is successfully linked for troubleshooting.", (boolean) null, true);
            return;
        }
        m9902e(context, str, str2);
    }

    @VisibleForTesting
    /* renamed from: b */
    private final boolean m9898b(Context context, String str, String str2) {
        context = m9901d(context, m9899c(context, (String) zzkd.m10713e().m10897a(zznw.ch), str, str2).toString(), str2);
        if (TextUtils.isEmpty(context) != null) {
            zzaok.m10001b("Not linked for in app preview.");
            return false;
        }
        try {
            str = new JSONObject(context.trim());
            context = str.optString("gct");
            this.f8903e = str.optString("status");
            synchronized (this.f8899a) {
                this.f8901c = context;
            }
            return true;
        } catch (Context context2) {
            zzaok.m10004c("Fail to get in app preview response json.", context2);
            return false;
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    private final boolean m9900c(Context context, String str, String str2) {
        context = m9901d(context, m9899c(context, (String) zzkd.m10713e().m10897a(zznw.ci), str, str2).toString(), str2);
        if (TextUtils.isEmpty(context) != null) {
            zzaok.m10001b("Not linked for debug signals.");
            return false;
        }
        try {
            context = "1".equals(new JSONObject(context.trim()).optString("debug_mode"));
            synchronized (this.f8899a) {
                this.f8902d = context;
            }
            return context;
        } catch (Context context2) {
            zzaok.m10004c("Fail to get debug mode response json.", context2);
            return false;
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    private static String m9901d(Context context, String str, String str2) {
        String str3;
        Map hashMap = new HashMap();
        hashMap.put("User-Agent", zzbv.zzek().m9840b(context, str2));
        context = new zzamz(context).m9920a(str, hashMap);
        try {
            return (String) context.get((long) ((Integer) zzkd.m10713e().m10897a(zznw.ck)).intValue(), TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            str3 = "Timeout while retriving a response from: ";
            str = String.valueOf(str);
            zzaok.m10002b(str.length() != 0 ? str3.concat(str) : new String(str3), e);
            context.cancel(true);
            return null;
        } catch (Throwable e2) {
            str3 = "Interrupted while retriving a response from: ";
            str = String.valueOf(str);
            zzaok.m10002b(str.length() != 0 ? str3.concat(str) : new String(str3), e2);
            context.cancel(true);
            return null;
        } catch (Context context2) {
            str2 = "Error retriving a response from: ";
            str = String.valueOf(str);
            zzaok.m10002b(str.length() != 0 ? str2.concat(str) : new String(str2), context2);
            return null;
        }
    }

    /* renamed from: e */
    private final void m9902e(Context context, String str, String str2) {
        zzbv.zzek();
        zzalo.m9790a(context, m9899c(context, (String) zzkd.m10713e().m10897a(zznw.cg), str, str2));
    }

    /* renamed from: b */
    public final void m9906b(Context context, String str, String str2, String str3) {
        str3 = m9899c(context, (String) zzkd.m10713e().m10897a(zznw.cj), str3, str).buildUpon();
        str3.appendQueryParameter("debugData", str2);
        zzbv.zzek();
        zzalo.m9791a(context, str, str3.build().toString());
    }

    /* renamed from: c */
    private final Uri m9899c(Context context, String str, String str2, String str3) {
        str = Uri.parse(str).buildUpon();
        str.appendQueryParameter("linkedDeviceId", m9896a(context));
        str.appendQueryParameter("adSlotPath", str2);
        str.appendQueryParameter("afmaVersion", str3);
        return str.build();
    }

    /* renamed from: a */
    private final String m9896a(Context context) {
        synchronized (this.f8899a) {
            if (TextUtils.isEmpty(this.f8900b)) {
                zzbv.zzek();
                this.f8900b = zzalo.m9810c(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.f8900b)) {
                    zzbv.zzek();
                    this.f8900b = zzalo.m9781a();
                    zzbv.zzek();
                    zzalo.m9807b(context, "debug_signals_id.txt", this.f8900b);
                }
            }
            context = this.f8900b;
        }
        return context;
    }

    /* renamed from: a */
    public final String m9903a() {
        String str;
        synchronized (this.f8899a) {
            str = this.f8901c;
        }
        return str;
    }

    /* renamed from: b */
    public final boolean m9907b() {
        boolean z;
        synchronized (this.f8899a) {
            z = this.f8902d;
        }
        return z;
    }

    @VisibleForTesting
    /* renamed from: a */
    private final void m9897a(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzalo.f8872a.post(new dr(this, context, str, z, z2));
        } else {
            zzaok.m10005d("Can not create dialog without Activity Context");
        }
    }
}
