package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzoj {
    @VisibleForTesting
    /* renamed from: a */
    private boolean f9750a;
    /* renamed from: b */
    private final List<zzoh> f9751b = new LinkedList();
    /* renamed from: c */
    private final Map<String, String> f9752c = new LinkedHashMap();
    /* renamed from: d */
    private final Object f9753d = new Object();
    /* renamed from: e */
    private String f9754e;
    /* renamed from: f */
    private zzoj f9755f;

    public zzoj(boolean z, String str, String str2) {
        this.f9750a = z;
        this.f9752c.put("action", str);
        this.f9752c.put("ad_format", str2);
    }

    /* renamed from: a */
    public final void m10927a(zzoj zzoj) {
        synchronized (this.f9753d) {
            this.f9755f = zzoj;
        }
    }

    /* renamed from: a */
    public final zzoh m10925a() {
        return m10926a(zzbv.zzer().elapsedRealtime());
    }

    /* renamed from: a */
    public final zzoh m10926a(long j) {
        if (this.f9750a) {
            return new zzoh(j, null, null);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean m10931a(zzoh zzoh, String... strArr) {
        if (this.f9750a) {
            if (zzoh != null) {
                return m10930a(zzoh, zzbv.zzer().elapsedRealtime(), strArr);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean m10930a(zzoh zzoh, long j, String... strArr) {
        synchronized (this.f9753d) {
            for (String zzoh2 : strArr) {
                this.f9751b.add(new zzoh(j, zzoh2, zzoh));
            }
        }
        return true;
    }

    /* renamed from: b */
    public final String m10932b() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        synchronized (this.f9753d) {
            for (zzoh zzoh : this.f9751b) {
                long a = zzoh.m10919a();
                String b = zzoh.m10920b();
                zzoh zzoh2 = zzoh2.m10921c();
                if (zzoh2 != null && a > 0) {
                    a -= zzoh2.m10919a();
                    stringBuilder2.append(b);
                    stringBuilder2.append('.');
                    stringBuilder2.append(a);
                    stringBuilder2.append(',');
                }
            }
            this.f9751b.clear();
            if (!TextUtils.isEmpty(this.f9754e)) {
                stringBuilder2.append(this.f9754e);
            } else if (stringBuilder2.length() > 0) {
                stringBuilder2.setLength(stringBuilder2.length() - 1);
            }
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    /* renamed from: a */
    public final void m10928a(String str) {
        if (this.f9750a) {
            synchronized (this.f9753d) {
                this.f9754e = str;
            }
        }
    }

    /* renamed from: a */
    public final void m10929a(String str, String str2) {
        if (this.f9750a) {
            if (!TextUtils.isEmpty(str2)) {
                zznz a = zzbv.zzeo().m9711a();
                if (a != null) {
                    synchronized (this.f9753d) {
                        zzod a2 = a.m10910a(str);
                        Map map = this.f9752c;
                        map.put(str, a2.mo2172a((String) map.get(str), str2));
                    }
                }
            }
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    final Map<String, String> m10933c() {
        synchronized (this.f9753d) {
            Map<String, String> a;
            zznz a2 = zzbv.zzeo().m9711a();
            if (a2 != null) {
                if (this.f9755f != null) {
                    a = a2.m10911a(this.f9752c, this.f9755f.m10933c());
                    return a;
                }
            }
            a = this.f9752c;
            return a;
        }
    }

    /* renamed from: d */
    public final zzoh m10934d() {
        synchronized (this.f9753d) {
        }
        return null;
    }
}
