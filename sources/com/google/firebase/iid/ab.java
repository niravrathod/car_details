package com.google.firebase.iid;

import android.support.v4.p017f.C3131a;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

final class ab {
    /* renamed from: a */
    private int f10987a = 0;
    /* renamed from: b */
    private final Map<Integer, TaskCompletionSource<Void>> f10988b = new C3131a();
    /* renamed from: c */
    private final C2604x f10989c;

    ab(C2604x c2604x) {
        this.f10989c = c2604x;
    }

    /* renamed from: a */
    final synchronized boolean m12692a() {
        return m12691b() != null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final boolean m12693a(com.google.firebase.iid.FirebaseInstanceId r5) {
        /*
        r4 = this;
    L_0x0000:
        monitor-enter(r4);
        r0 = r4.m12691b();	 Catch:{ all -> 0x0042 }
        r1 = 1;
        if (r0 != 0) goto L_0x0017;
    L_0x0008:
        r5 = com.google.firebase.iid.FirebaseInstanceId.m12665g();	 Catch:{ all -> 0x0042 }
        if (r5 == 0) goto L_0x0015;
    L_0x000e:
        r5 = "FirebaseInstanceId";
        r0 = "topic sync succeeded";
        android.util.Log.d(r5, r0);	 Catch:{ all -> 0x0042 }
    L_0x0015:
        monitor-exit(r4);	 Catch:{ all -> 0x0042 }
        return r1;
    L_0x0017:
        monitor-exit(r4);	 Catch:{ all -> 0x0042 }
        r2 = m12689a(r5, r0);
        if (r2 != 0) goto L_0x0020;
    L_0x001e:
        r5 = 0;
        return r5;
    L_0x0020:
        monitor-enter(r4);
        r2 = r4.f10988b;	 Catch:{ all -> 0x003f }
        r3 = r4.f10987a;	 Catch:{ all -> 0x003f }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x003f }
        r2 = r2.remove(r3);	 Catch:{ all -> 0x003f }
        r2 = (com.google.android.gms.tasks.TaskCompletionSource) r2;	 Catch:{ all -> 0x003f }
        r4.m12690a(r0);	 Catch:{ all -> 0x003f }
        r0 = r4.f10987a;	 Catch:{ all -> 0x003f }
        r0 = r0 + r1;
        r4.f10987a = r0;	 Catch:{ all -> 0x003f }
        monitor-exit(r4);	 Catch:{ all -> 0x003f }
        if (r2 == 0) goto L_0x0000;
    L_0x003a:
        r0 = 0;
        r2.m12419a(r0);
        goto L_0x0000;
    L_0x003f:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x003f }
        throw r5;
    L_0x0042:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0042 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.ab.a(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }

    /* renamed from: b */
    private final String m12691b() {
        synchronized (this.f10989c) {
            Object a = this.f10989c.m12785a();
        }
        if (!TextUtils.isEmpty(a)) {
            String[] split = a.split(",");
            if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                return split[1];
            }
        }
        return null;
    }

    /* renamed from: a */
    private final synchronized boolean m12690a(String str) {
        synchronized (this.f10989c) {
            String a = this.f10989c.m12785a();
            String valueOf = String.valueOf(",");
            String valueOf2 = String.valueOf(str);
            if (a.startsWith(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf))) {
                valueOf = String.valueOf(",");
                str = String.valueOf(str);
                this.f10989c.m12786a(a.substring((str.length() != 0 ? valueOf.concat(str) : new String(valueOf)).length()));
                return true;
            }
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m12689a(FirebaseInstanceId firebaseInstanceId, String str) {
        str = str.split("!");
        if (str.length == 2) {
            String str2 = str[0];
            str = str[1];
            Object obj = -1;
            try {
                int hashCode = str2.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85) {
                        if (str2.equals("U")) {
                            obj = 1;
                        }
                    }
                } else if (str2.equals("S")) {
                    obj = null;
                }
                switch (obj) {
                    case null:
                        firebaseInstanceId.m12672a(str);
                        if (FirebaseInstanceId.m12665g() != null) {
                            Log.d("FirebaseInstanceId", "subscribe operation succeeded");
                            break;
                        }
                        break;
                    case 1:
                        firebaseInstanceId.m12677b(str);
                        if (FirebaseInstanceId.m12665g() != null) {
                            Log.d("FirebaseInstanceId", "unsubscribe operation succeeded");
                            break;
                        }
                        break;
                    default:
                        break;
                }
            } catch (FirebaseInstanceId firebaseInstanceId2) {
                str = "FirebaseInstanceId";
                String str3 = "Topic sync failed: ";
                firebaseInstanceId2 = String.valueOf(firebaseInstanceId2.getMessage());
                Log.e(str, firebaseInstanceId2.length() != 0 ? str3.concat(firebaseInstanceId2) : new String(str3));
                return false;
            }
        }
        return true;
    }
}
