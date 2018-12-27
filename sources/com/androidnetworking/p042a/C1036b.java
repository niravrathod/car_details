package com.androidnetworking.p042a;

import android.annotation.SuppressLint;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.LinkedHashMap;

/* renamed from: com.androidnetworking.a.b */
public class C1036b<K, V> {
    /* renamed from: a */
    private final LinkedHashMap<K, V> f3432a;
    /* renamed from: b */
    private int f3433b;
    /* renamed from: c */
    private int f3434c;
    /* renamed from: d */
    private int f3435d;
    /* renamed from: e */
    private int f3436e;
    /* renamed from: f */
    private int f3437f;
    /* renamed from: g */
    private int f3438g;
    /* renamed from: h */
    private int f3439h;

    /* renamed from: a */
    protected int mo898a(K k, V v) {
        return 1;
    }

    /* renamed from: a */
    protected void m4410a(boolean z, K k, V v, V v2) {
    }

    /* renamed from: b */
    protected V m4411b(K k) {
        return null;
    }

    public C1036b(int i) {
        if (i > 0) {
            this.f3434c = i;
            this.f3432a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final V m4408a(K r5) {
        /*
        r4 = this;
        if (r5 == 0) goto L_0x0054;
    L_0x0002:
        monitor-enter(r4);
        r0 = r4.f3432a;	 Catch:{ all -> 0x0051 }
        r0 = r0.get(r5);	 Catch:{ all -> 0x0051 }
        if (r0 == 0) goto L_0x0013;
    L_0x000b:
        r5 = r4.f3438g;	 Catch:{ all -> 0x0051 }
        r5 = r5 + 1;
        r4.f3438g = r5;	 Catch:{ all -> 0x0051 }
        monitor-exit(r4);	 Catch:{ all -> 0x0051 }
        return r0;
    L_0x0013:
        r0 = r4.f3439h;	 Catch:{ all -> 0x0051 }
        r0 = r0 + 1;
        r4.f3439h = r0;	 Catch:{ all -> 0x0051 }
        monitor-exit(r4);	 Catch:{ all -> 0x0051 }
        r0 = r4.m4411b(r5);
        if (r0 != 0) goto L_0x0022;
    L_0x0020:
        r5 = 0;
        return r5;
    L_0x0022:
        monitor-enter(r4);
        r1 = r4.f3436e;	 Catch:{ all -> 0x004e }
        r1 = r1 + 1;
        r4.f3436e = r1;	 Catch:{ all -> 0x004e }
        r1 = r4.f3432a;	 Catch:{ all -> 0x004e }
        r1 = r1.put(r5, r0);	 Catch:{ all -> 0x004e }
        if (r1 == 0) goto L_0x0037;
    L_0x0031:
        r2 = r4.f3432a;	 Catch:{ all -> 0x004e }
        r2.put(r5, r1);	 Catch:{ all -> 0x004e }
        goto L_0x0040;
    L_0x0037:
        r2 = r4.f3433b;	 Catch:{ all -> 0x004e }
        r3 = r4.m4406c(r5, r0);	 Catch:{ all -> 0x004e }
        r2 = r2 + r3;
        r4.f3433b = r2;	 Catch:{ all -> 0x004e }
    L_0x0040:
        monitor-exit(r4);	 Catch:{ all -> 0x004e }
        if (r1 == 0) goto L_0x0048;
    L_0x0043:
        r2 = 0;
        r4.m4410a(r2, r5, r0, r1);
        return r1;
    L_0x0048:
        r5 = r4.f3434c;
        r4.m4409a(r5);
        return r0;
    L_0x004e:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x004e }
        throw r5;
    L_0x0051:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0051 }
        throw r5;
    L_0x0054:
        r5 = new java.lang.NullPointerException;
        r0 = "key == null";
        r5.<init>(r0);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidnetworking.a.b.a(java.lang.Object):V");
    }

    /* renamed from: b */
    public final V m4412b(K k, V v) {
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        V put;
        synchronized (this) {
            this.f3435d++;
            this.f3433b += m4406c(k, v);
            put = this.f3432a.put(k, v);
            if (put != null) {
                this.f3433b -= m4406c(k, put);
            }
        }
        if (put != null) {
            m4410a(false, k, put, v);
        }
        m4409a(this.f3434c);
        return put;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m4409a(int r5) {
        /*
        r4 = this;
    L_0x0000:
        monitor-enter(r4);
        r0 = r4.f3433b;	 Catch:{ all -> 0x0071 }
        if (r0 < 0) goto L_0x0052;
    L_0x0005:
        r0 = r4.f3432a;	 Catch:{ all -> 0x0071 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0071 }
        if (r0 == 0) goto L_0x0011;
    L_0x000d:
        r0 = r4.f3433b;	 Catch:{ all -> 0x0071 }
        if (r0 != 0) goto L_0x0052;
    L_0x0011:
        r0 = r4.f3433b;	 Catch:{ all -> 0x0071 }
        if (r0 <= r5) goto L_0x0050;
    L_0x0015:
        r0 = r4.f3432a;	 Catch:{ all -> 0x0071 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0071 }
        if (r0 == 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0050;
    L_0x001e:
        r0 = r4.f3432a;	 Catch:{ all -> 0x0071 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0071 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0071 }
        r0 = r0.next();	 Catch:{ all -> 0x0071 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0071 }
        r1 = r0.getKey();	 Catch:{ all -> 0x0071 }
        r0 = r0.getValue();	 Catch:{ all -> 0x0071 }
        r2 = r4.f3432a;	 Catch:{ all -> 0x0071 }
        r2.remove(r1);	 Catch:{ all -> 0x0071 }
        r2 = r4.f3433b;	 Catch:{ all -> 0x0071 }
        r3 = r4.m4406c(r1, r0);	 Catch:{ all -> 0x0071 }
        r2 = r2 - r3;
        r4.f3433b = r2;	 Catch:{ all -> 0x0071 }
        r2 = r4.f3437f;	 Catch:{ all -> 0x0071 }
        r3 = 1;
        r2 = r2 + r3;
        r4.f3437f = r2;	 Catch:{ all -> 0x0071 }
        monitor-exit(r4);	 Catch:{ all -> 0x0071 }
        r2 = 0;
        r4.m4410a(r3, r1, r0, r2);
        goto L_0x0000;
    L_0x0050:
        monitor-exit(r4);	 Catch:{ all -> 0x0071 }
        return;
    L_0x0052:
        r5 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0071 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0071 }
        r0.<init>();	 Catch:{ all -> 0x0071 }
        r1 = r4.getClass();	 Catch:{ all -> 0x0071 }
        r1 = r1.getName();	 Catch:{ all -> 0x0071 }
        r0.append(r1);	 Catch:{ all -> 0x0071 }
        r1 = ".sizeOf() is reporting inconsistent results!";
        r0.append(r1);	 Catch:{ all -> 0x0071 }
        r0 = r0.toString();	 Catch:{ all -> 0x0071 }
        r5.<init>(r0);	 Catch:{ all -> 0x0071 }
        throw r5;	 Catch:{ all -> 0x0071 }
    L_0x0071:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0071 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidnetworking.a.b.a(int):void");
    }

    /* renamed from: c */
    private int m4406c(K k, V v) {
        int a = mo898a(k, v);
        if (a >= 0) {
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Negative size: ");
        stringBuilder.append(k);
        stringBuilder.append(SimpleComparison.EQUAL_TO_OPERATION);
        stringBuilder.append(v);
        throw new IllegalStateException(stringBuilder.toString());
    }

    @SuppressLint({"DefaultLocale"})
    public final synchronized String toString() {
        int i;
        i = this.f3438g + this.f3439h;
        i = i != 0 ? (this.f3438g * 100) / i : 0;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f3434c), Integer.valueOf(this.f3438g), Integer.valueOf(this.f3439h), Integer.valueOf(i)});
    }
}
