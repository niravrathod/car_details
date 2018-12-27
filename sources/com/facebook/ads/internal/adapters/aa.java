package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p104c.C1944a;
import com.facebook.ads.internal.p107r.C1958a;
import java.util.Map;

public class aa extends C1749m {
    /* renamed from: c */
    private static final String f15127c = "aa";
    /* renamed from: d */
    private final C1944a f15128d;
    /* renamed from: e */
    private final C1827c f15129e;
    /* renamed from: f */
    private C3791z f15130f;
    /* renamed from: g */
    private boolean f15131g;

    /* renamed from: com.facebook.ads.internal.adapters.aa$1 */
    class C17381 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ aa f5248a;

        C17381(aa aaVar) {
            this.f5248a = aaVar;
        }

        public void run() {
            if (this.f5248a.f15128d.m7350c()) {
                Log.w(aa.f15127c, "Webview already destroyed, cannot activate");
                return;
            }
            C1944a a = this.f5248a.f15128d;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("javascript:");
            stringBuilder.append(this.f5248a.f15130f.m18957e());
            a.loadUrl(stringBuilder.toString());
        }
    }

    public aa(Context context, C1827c c1827c, C1944a c1944a, C1958a c1958a, C1750n c1750n) {
        super(context, c1750n, c1958a);
        this.f15129e = c1827c;
        this.f15128d = c1944a;
    }

    /* renamed from: a */
    public void m18844a(C3791z c3791z) {
        this.f15130f = c3791z;
    }

    /* renamed from: a */
    protected void mo1332a(Map<String, String> map) {
        if (this.f15130f != null && !TextUtils.isEmpty(this.f15130f.mo1346c())) {
            this.f15129e.mo1355a(this.f15130f.mo1346c(), map);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public synchronized void m18846b() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f15131g;	 Catch:{ all -> 0x002b }
        if (r0 != 0) goto L_0x0029;
    L_0x0005:
        r0 = r2.f15130f;	 Catch:{ all -> 0x002b }
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        goto L_0x0029;
    L_0x000a:
        r0 = 1;
        r2.f15131g = r0;	 Catch:{ all -> 0x002b }
        r0 = r2.f15128d;	 Catch:{ all -> 0x002b }
        if (r0 == 0) goto L_0x0027;
    L_0x0011:
        r0 = r2.f15130f;	 Catch:{ all -> 0x002b }
        r0 = r0.m18957e();	 Catch:{ all -> 0x002b }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x002b }
        if (r0 != 0) goto L_0x0027;
    L_0x001d:
        r0 = r2.f15128d;	 Catch:{ all -> 0x002b }
        r1 = new com.facebook.ads.internal.adapters.aa$1;	 Catch:{ all -> 0x002b }
        r1.<init>(r2);	 Catch:{ all -> 0x002b }
        r0.post(r1);	 Catch:{ all -> 0x002b }
    L_0x0027:
        monitor-exit(r2);
        return;
    L_0x0029:
        monitor-exit(r2);
        return;
    L_0x002b:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.aa.b():void");
    }
}
