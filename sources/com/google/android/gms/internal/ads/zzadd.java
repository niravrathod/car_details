package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbb;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

@zzaer
public final class zzadd implements Callable<zzakm> {
    @VisibleForTesting
    /* renamed from: a */
    private static long f8507a = 10;
    /* renamed from: b */
    private final Context f8508b;
    /* renamed from: c */
    private final zzamz f8509c;
    /* renamed from: d */
    private final zzbb f8510d;
    /* renamed from: e */
    private final zzck f8511e;
    /* renamed from: f */
    private final zzadw f8512f;
    /* renamed from: g */
    private final Object f8513g = new Object();
    /* renamed from: h */
    private final zzakn f8514h;
    /* renamed from: i */
    private final zzoj f8515i;
    /* renamed from: j */
    private boolean f8516j;
    /* renamed from: k */
    private int f8517k;
    /* renamed from: l */
    private List<String> f8518l;
    /* renamed from: m */
    private JSONObject f8519m;
    /* renamed from: n */
    private String f8520n;
    /* renamed from: o */
    private String f8521o;

    public zzadd(Context context, zzbb zzbb, zzamz zzamz, zzck zzck, zzakn zzakn, zzoj zzoj) {
        this.f8508b = context;
        this.f8510d = zzbb;
        this.f8509c = zzamz;
        this.f8514h = zzakn;
        this.f8511e = zzck;
        this.f8515i = zzoj;
        this.f8512f = zzbb.zzds();
        this.f8516j = null;
        this.f8517k = -2;
        this.f8518l = null;
        this.f8520n = null;
        this.f8521o = null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final com.google.android.gms.internal.ads.zzakm m9463a() {
        /*
        r15 = this;
        r0 = 0;
        r1 = 0;
        r2 = r15.f8510d;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r11 = r2.getUuid();	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r2 = r15.m9474b();	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r2 != 0) goto L_0x006e;
    L_0x000e:
        r2 = new org.json.JSONObject;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3 = r15.f8514h;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3 = r3.f8807b;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3 = r3.f19787b;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r2.<init>(r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3 = new org.json.JSONObject;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = r15.f8514h;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = r4.f8807b;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = r4.f19787b;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3.<init>(r4);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = r3.length();	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r4 == 0) goto L_0x0040;
    L_0x002a:
        r4 = "ads";
        r3 = r3.optJSONArray(r4);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r3 == 0) goto L_0x0037;
    L_0x0032:
        r3 = r3.optJSONObject(r0);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        goto L_0x0038;
    L_0x0037:
        r3 = r1;
    L_0x0038:
        if (r3 == 0) goto L_0x0040;
    L_0x003a:
        r3 = r3.length();	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r3 != 0) goto L_0x0044;
    L_0x0040:
        r3 = 3;
        r15.m9468a(r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
    L_0x0044:
        r3 = r15.f8512f;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r2 = r3.mo2221a(r2);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3 = f8507a;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r5 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r2 = r2.get(r3, r5);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r2 = (org.json.JSONObject) r2;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3 = "success";
        r3 = r2.optBoolean(r3, r0);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r3 == 0) goto L_0x006e;
    L_0x005c:
        r3 = "json";
        r2 = r2.getJSONObject(r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3 = "ads";
        r2 = r2.optJSONArray(r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r2 = r2.getJSONObject(r0);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r8 = r2;
        goto L_0x006f;
    L_0x006e:
        r8 = r1;
    L_0x006f:
        if (r8 == 0) goto L_0x0078;
    L_0x0071:
        r2 = "enable_omid";
        r2 = r8.optBoolean(r2);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        goto L_0x0079;
    L_0x0078:
        r2 = 0;
    L_0x0079:
        if (r2 != 0) goto L_0x0081;
    L_0x007b:
        r3 = com.google.android.gms.internal.ads.zzaox.m10019a(r1);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
    L_0x007f:
        r12 = r3;
        goto L_0x00af;
    L_0x0081:
        r3 = "omid_settings";
        r3 = r8.optJSONObject(r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r3 != 0) goto L_0x008e;
    L_0x0089:
        r3 = com.google.android.gms.internal.ads.zzaox.m10019a(r1);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        goto L_0x007f;
    L_0x008e:
        r4 = "omid_html";
        r3 = r3.optString(r4);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = android.text.TextUtils.isEmpty(r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r4 == 0) goto L_0x009f;
    L_0x009a:
        r3 = com.google.android.gms.internal.ads.zzaox.m10019a(r1);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        goto L_0x007f;
    L_0x009f:
        r4 = com.google.android.gms.internal.ads.zzaox.m10019a(r1);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r5 = new com.google.android.gms.internal.ads.x;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r5.<init>(r15, r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3 = com.google.android.gms.internal.ads.zzapn.f8961a;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3 = com.google.android.gms.internal.ads.zzaox.m10021a(r4, r5, r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        goto L_0x007f;
    L_0x00af:
        r3 = r15.m9474b();	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r3 != 0) goto L_0x016d;
    L_0x00b5:
        if (r8 != 0) goto L_0x00b9;
    L_0x00b7:
        goto L_0x016d;
    L_0x00b9:
        r3 = "template_id";
        r3 = r8.getString(r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = "instream";
        r5 = "type";
        r5 = r8.optString(r5);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = r4.equals(r5);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r5 = r15.f8514h;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r5 = r5.f8806a;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r5 = r5.f19757y;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r5 == 0) goto L_0x00dc;
    L_0x00d3:
        r5 = r15.f8514h;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r5 = r5.f8806a;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r5 = r5.f19757y;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r5 = r5.f20341b;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        goto L_0x00dd;
    L_0x00dc:
        r5 = 0;
    L_0x00dd:
        r6 = r15.f8514h;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r6 = r6.f8806a;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r6 = r6.f19757y;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r6 == 0) goto L_0x00ee;
    L_0x00e5:
        r6 = r15.f8514h;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r6 = r6.f8806a;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r6 = r6.f19757y;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r6 = r6.f20343d;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        goto L_0x00ef;
    L_0x00ee:
        r6 = 0;
    L_0x00ef:
        if (r4 == 0) goto L_0x00f8;
    L_0x00f1:
        r3 = new com.google.android.gms.internal.ads.zzadc;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3.<init>();	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        goto L_0x016e;
    L_0x00f8:
        r4 = "2";
        r4 = r4.equals(r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r4 == 0) goto L_0x010a;
    L_0x0100:
        r3 = new com.google.android.gms.internal.ads.zzadx;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = r15.f8514h;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = r4.f8815j;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3.<init>(r5, r6, r4);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        goto L_0x016e;
    L_0x010a:
        r4 = "1";
        r4 = r4.equals(r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r4 == 0) goto L_0x011c;
    L_0x0112:
        r3 = new com.google.android.gms.internal.ads.zzady;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = r15.f8514h;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = r4.f8815j;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3.<init>(r5, r6, r4);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        goto L_0x016e;
    L_0x011c:
        r4 = "3";
        r3 = r4.equals(r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r3 == 0) goto L_0x016a;
    L_0x0124:
        r3 = "custom_template_id";
        r3 = r8.getString(r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = new com.google.android.gms.internal.ads.zzaps;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4.<init>();	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r6 = com.google.android.gms.internal.ads.zzalo.f8872a;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r7 = new com.google.android.gms.internal.ads.z;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r7.<init>(r15, r4, r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r6.post(r7);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r6 = f8507a;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3 = r4.get(r6, r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r3 == 0) goto L_0x0149;
    L_0x0143:
        r3 = new com.google.android.gms.internal.ads.zzadz;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3.<init>(r5);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        goto L_0x016e;
    L_0x0149:
        r3 = "No handler for custom template: ";
        r4 = "custom_template_id";
        r4 = r8.getString(r4);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r5 = r4.length();	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r5 == 0) goto L_0x0160;
    L_0x015b:
        r3 = r3.concat(r4);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        goto L_0x0166;
    L_0x0160:
        r4 = new java.lang.String;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4.<init>(r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3 = r4;
    L_0x0166:
        com.google.android.gms.internal.ads.zzaok.m10003c(r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        goto L_0x016d;
    L_0x016a:
        r15.m9468a(r0);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
    L_0x016d:
        r3 = r1;
    L_0x016e:
        r4 = r15.m9474b();	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r4 != 0) goto L_0x01e7;
    L_0x0174:
        if (r3 == 0) goto L_0x01e7;
    L_0x0176:
        if (r8 != 0) goto L_0x017a;
    L_0x0178:
        goto L_0x01e7;
    L_0x017a:
        r4 = "tracking_urls_and_actions";
        r4 = r8.getJSONObject(r4);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r5 = "impression_tracking_urls";
        r5 = r4.optJSONArray(r5);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r5 != 0) goto L_0x018a;
    L_0x0188:
        r6 = r1;
        goto L_0x01a0;
    L_0x018a:
        r6 = r5.length();	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r6 = new java.lang.String[r6];	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r7 = 0;
    L_0x0191:
        r9 = r5.length();	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r7 >= r9) goto L_0x01a0;
    L_0x0197:
        r9 = r5.getString(r7);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r6[r7] = r9;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r7 = r7 + 1;
        goto L_0x0191;
    L_0x01a0:
        if (r6 != 0) goto L_0x01a4;
    L_0x01a2:
        r5 = r1;
        goto L_0x01a8;
    L_0x01a4:
        r5 = java.util.Arrays.asList(r6);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
    L_0x01a8:
        r15.f8518l = r5;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r5 = "active_view";
        r4 = r4.optJSONObject(r5);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r15.f8519m = r4;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = "debug_signals";
        r4 = r8.optString(r4);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r15.f8520n = r4;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = "omid_settings";
        r4 = r8.optString(r4);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r15.f8521o = r4;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r13 = r3.mo2220a(r15, r8);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r13 != 0) goto L_0x01ce;
    L_0x01c8:
        r3 = "Failed to retrieve ad assets.";
        com.google.android.gms.internal.ads.zzaok.m10003c(r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        goto L_0x01e7;
    L_0x01ce:
        r14 = new com.google.android.gms.internal.ads.zzpq;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = r15.f8508b;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r5 = r15.f8510d;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r6 = r15.f8512f;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r7 = r15.f8511e;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3 = r15.f8514h;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3 = r3.f8806a;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r10 = r3.f19743k;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3 = r14;
        r9 = r13;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r13.mo4264a(r14);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        goto L_0x01e8;
    L_0x01e7:
        r13 = r1;
    L_0x01e8:
        r3 = r13 instanceof com.google.android.gms.internal.ads.zzpf;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        if (r3 == 0) goto L_0x01fb;
    L_0x01ec:
        r3 = r13;
        r3 = (com.google.android.gms.internal.ads.zzpf) r3;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = new com.google.android.gms.internal.ads.aa;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4.<init>(r15, r3);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3 = r15.f8512f;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r5 = "/nativeAdCustomClick";
        r3.mo2223a(r5, r4);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
    L_0x01fb:
        r2 = r15.m9464a(r13, r2);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3 = r15.f8510d;	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r4 = m9471b(r12);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        r3.zzg(r4);	 Catch:{ CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, CancellationException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        return r2;
    L_0x0209:
        r2 = move-exception;
        r3 = "Error occured while doing native ads initialization.";
        com.google.android.gms.internal.ads.zzaok.m10004c(r3, r2);
        goto L_0x021d;
    L_0x0210:
        r2 = move-exception;
        r3 = "Timeout when loading native ad.";
        com.google.android.gms.internal.ads.zzaok.m10004c(r3, r2);
        goto L_0x021d;
    L_0x0217:
        r2 = move-exception;
        r3 = "Malformed native JSON response.";
        com.google.android.gms.internal.ads.zzaok.m10004c(r3, r2);
    L_0x021d:
        r2 = r15.f8516j;
        if (r2 != 0) goto L_0x0224;
    L_0x0221:
        r15.m9468a(r0);
    L_0x0224:
        r0 = r15.m9464a(r1, r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadd.a():com.google.android.gms.internal.ads.zzakm");
    }

    /* renamed from: b */
    private static zzasg m9471b(zzapi<zzasg> zzapi) {
        try {
            return (zzasg) zzapi.get((long) ((Integer) zzkd.m10713e().m10897a(zznw.bz)).intValue(), TimeUnit.MILLISECONDS);
        } catch (zzapi<zzasg> zzapi2) {
            zzaok.m10004c("", zzapi2);
            Thread.currentThread().interrupt();
            return null;
        } catch (zzapi<zzasg> zzapi22) {
            zzaok.m10004c("", zzapi22);
            return null;
        }
    }

    /* renamed from: a */
    private final void m9470a(zzrg zzrg, String str) {
        try {
            zzrq zzt = this.f8510d.zzt(zzrg.mo2666b());
            if (zzt != null) {
                zzt.mo2685a(zzrg, str);
            }
        } catch (zzrg zzrg2) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 40);
            stringBuilder.append("Failed to call onCustomClick for asset ");
            stringBuilder.append(str);
            stringBuilder.append(".");
            zzaok.m10004c(stringBuilder.toString(), zzrg2);
        }
    }

    /* renamed from: a */
    private final zzakm m9464a(zzpo zzpo, boolean z) {
        int i;
        synchronized (this.f8513g) {
            i = (zzpo == null && r1.f8517k == -2) ? 0 : r1.f8517k;
        }
        return new zzakm(r1.f8514h.f8806a.f19735c, null, r1.f8514h.f8807b.f19788c, i, r1.f8514h.f8807b.f19790e, r1.f8518l, r1.f8514h.f8807b.f19796k, r1.f8514h.f8807b.f19795j, r1.f8514h.f8806a.f19741i, false, null, null, null, null, null, 0, r1.f8514h.f8809d, r1.f8514h.f8807b.f19791f, r1.f8514h.f8811f, r1.f8514h.f8812g, r1.f8514h.f8807b.f19799n, r1.f8519m, i != -2 ? null : zzpo, null, null, null, r1.f8514h.f8807b.f19763D, r1.f8514h.f8807b.f19764E, null, r1.f8514h.f8807b.f19767H, r1.f8520n, r1.f8514h.f8814i, r1.f8514h.f8807b.f19774O, r1.f8514h.f8815j, z, r1.f8514h.f8807b.f19777R, r1.f8514h.f8807b.f19778S, r1.f8521o, r1.f8514h.f8807b.f19781V);
    }

    /* renamed from: a */
    public final zzapi<zzov> m9477a(JSONObject jSONObject) {
        zzadd zzadd = this;
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzaox.m10019a(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer b = m9472b(optJSONObject, "text_color");
        Integer b2 = m9472b(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        int i = (zzadd.f8514h.f8806a.f19757y == null || zzadd.f8514h.f8806a.f19757y.f20340a < 2) ? 1 : zzadd.f8514h.f8806a.f19757y.f20344e;
        boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List arrayList = new ArrayList();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = m9480a(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(m9479a(optJSONObject, "image", false, false));
        }
        zzaps zzaps = new zzaps();
        int size = r0.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (zzapi a : r0) {
            List list = arrayList;
            a.mo1947a(new ad(atomicInteger, size, zzaps, arrayList), zzalm.f8869a);
            arrayList = list;
        }
        return zzaox.m10022a((zzapi) zzaps, new ab(this, optString, b2, b, optInt, optInt3, optInt2, i, optBoolean), zzalm.f8869a);
    }

    /* renamed from: b */
    private static java.lang.Integer m9472b(org.json.JSONObject r2, java.lang.String r3) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = r2.getJSONObject(r3);	 Catch:{ JSONException -> 0x001f }
        r3 = "r";	 Catch:{ JSONException -> 0x001f }
        r3 = r2.getInt(r3);	 Catch:{ JSONException -> 0x001f }
        r0 = "g";	 Catch:{ JSONException -> 0x001f }
        r0 = r2.getInt(r0);	 Catch:{ JSONException -> 0x001f }
        r1 = "b";	 Catch:{ JSONException -> 0x001f }
        r2 = r2.getInt(r1);	 Catch:{ JSONException -> 0x001f }
        r2 = android.graphics.Color.rgb(r3, r0, r2);	 Catch:{ JSONException -> 0x001f }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ JSONException -> 0x001f }
        return r2;
    L_0x001f:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadd.b(org.json.JSONObject, java.lang.String):java.lang.Integer");
    }

    /* renamed from: a */
    public final Future<zzpa> m9481a(JSONObject jSONObject, String str, boolean z) {
        jSONObject = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject.optBoolean("require", true);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return m9465a(jSONObject, optBoolean, z);
    }

    /* renamed from: a */
    public final zzapi<zzpa> m9479a(JSONObject jSONObject, String str, boolean z, boolean z2) {
        jSONObject = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return m9465a(jSONObject, z, z2);
    }

    /* renamed from: a */
    public final List<zzapi<zzpa>> m9480a(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) {
        jSONObject = jSONObject.optJSONArray(str);
        str = new ArrayList();
        if (jSONObject != null) {
            if (jSONObject.length() != 0) {
                z3 = z3 ? jSONObject.length() : true;
                for (boolean z4 = false; z4 < z3; z4++) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(z4);
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    str.add(m9465a(jSONObject2, false, z2));
                }
                return str;
            }
        }
        m9482a(0, false);
        return str;
    }

    /* renamed from: a */
    private final zzapi<zzpa> m9465a(JSONObject jSONObject, boolean z, boolean z2) {
        String string;
        if (z) {
            string = jSONObject.getString(ImagesContract.URL);
        } else {
            string = jSONObject.optString(ImagesContract.URL);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (TextUtils.isEmpty(string) != null) {
            m9482a((int) null, z);
            return zzaox.m10019a(null);
        } else if (z2) {
            return zzaox.m10019a(new zzpa(null, Uri.parse(string), optDouble));
        } else {
            return this.f8509c.m9919a(string, new ac(this, z, optDouble, optBoolean, string));
        }
    }

    /* renamed from: a */
    public final zzapi<zzasg> m9478a(JSONObject jSONObject, String str) {
        str = jSONObject.optJSONObject(str);
        if (str == null) {
            return zzaox.m10019a(null);
        }
        if (TextUtils.isEmpty(str.optString("vast_xml"))) {
            zzaok.m10007e("Required field 'vast_xml' is missing");
            return zzaox.m10019a(null);
        }
        zzadm a = m9462a(this.f8508b, this.f8511e, this.f8514h, this.f8515i, this.f8510d);
        jSONObject = "instream".equals(jSONObject.optString("type"));
        zzapi zzaps = new zzaps();
        zzapn.f8961a.execute(new ae(a, jSONObject, str, zzaps));
        return zzaps;
    }

    /* renamed from: a */
    public final zzapi<zzasg> m9476a(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                zzadm a = m9462a(this.f8508b, this.f8511e, this.f8514h, this.f8515i, this.f8510d);
                z = new zzaps();
                zzapn.f8961a.execute(new af(a, true, z, str, str2));
                return z;
            }
        }
        return zzaox.m10019a((Object) null);
    }

    /* renamed from: b */
    private final boolean m9474b() {
        boolean z;
        synchronized (this.f8513g) {
            z = this.f8516j;
        }
        return z;
    }

    /* renamed from: a */
    private final void m9468a(int i) {
        synchronized (this.f8513g) {
            this.f8516j = true;
            this.f8517k = i;
        }
    }

    /* renamed from: a */
    public final void m9482a(int i, boolean z) {
        if (z) {
            m9468a(i);
        }
    }

    /* renamed from: a */
    static zzasg m9466a(zzapi<zzasg> zzapi) {
        try {
            return (zzasg) zzapi.get((long) ((Integer) zzkd.m10713e().m10897a(zznw.by)).intValue(), TimeUnit.SECONDS);
        } catch (zzapi<zzasg> zzapi2) {
            zzaok.m10004c("InterruptedException occurred while waiting for video to load", zzapi2);
            Thread.currentThread().interrupt();
            return null;
        } catch (zzapi<zzasg> zzapi22) {
            zzaok.m10004c("Exception occurred while waiting for video to load", zzapi22);
            return null;
        }
    }

    /* renamed from: b */
    private static <V> List<V> m9473b(List<zzapi<V>> list) {
        List<V> arrayList = new ArrayList();
        for (zzapi zzapi : list) {
            Object obj = zzapi.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @VisibleForTesting
    /* renamed from: a */
    private static zzadm m9462a(Context context, zzck zzck, zzakn zzakn, zzoj zzoj, zzbb zzbb) {
        return new zzadm(context, zzck, zzakn, zzoj, zzbb);
    }

    public final /* synthetic */ Object call() {
        return m9463a();
    }

    /* renamed from: a */
    final /* synthetic */ zzapi m9475a(String str, Object obj) {
        zzbv.zzel();
        obj = zzasm.m10092a(this.f8508b, zzatt.m10128a(), "native-omid", false, false, this.f8511e, this.f8514h.f8806a.f19743k, this.f8515i, null, this.f8510d.zzbi(), this.f8514h.f8814i);
        zzapi a = zzapr.m26281a(obj);
        obj.mo4782u().mo2393a(new C4102y(a));
        obj.loadData(str, "text/html", "UTF-8");
        return a;
    }
}
