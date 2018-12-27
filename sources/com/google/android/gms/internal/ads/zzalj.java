package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONObject;

@zzaer
public final class zzalj implements zzali {
    /* renamed from: a */
    private final Object f16850a = new Object();
    /* renamed from: b */
    private boolean f16851b;
    /* renamed from: c */
    private final List<Runnable> f16852c = new ArrayList();
    /* renamed from: d */
    private zzapi<?> f16853d;
    @GuardedBy("mLock")
    @Nullable
    /* renamed from: e */
    private zzgn f16854e = null;
    @GuardedBy("mLock")
    @Nullable
    /* renamed from: f */
    private SharedPreferences f16855f;
    @GuardedBy("mLock")
    @Nullable
    /* renamed from: g */
    private Editor f16856g;
    @GuardedBy("mLock")
    /* renamed from: h */
    private boolean f16857h = false;
    @GuardedBy("mLock")
    /* renamed from: i */
    private boolean f16858i = true;
    @GuardedBy("mLock")
    @Nullable
    /* renamed from: j */
    private String f16859j;
    @GuardedBy("mLock")
    @Nullable
    /* renamed from: k */
    private String f16860k;
    @GuardedBy("mLock")
    /* renamed from: l */
    private boolean f16861l = false;
    @GuardedBy("mLock")
    /* renamed from: m */
    private String f16862m = "";
    @GuardedBy("mLock")
    /* renamed from: n */
    private long f16863n = 0;
    @GuardedBy("mLock")
    /* renamed from: o */
    private long f16864o = 0;
    @GuardedBy("mLock")
    /* renamed from: p */
    private long f16865p = 0;
    @GuardedBy("mLock")
    /* renamed from: q */
    private int f16866q = -1;
    @GuardedBy("mLock")
    /* renamed from: r */
    private int f16867r = 0;
    @GuardedBy("mLock")
    /* renamed from: s */
    private Set<String> f16868s = Collections.emptySet();
    @GuardedBy("mLock")
    /* renamed from: t */
    private JSONObject f16869t = new JSONObject();
    @GuardedBy("mLock")
    /* renamed from: u */
    private boolean f16870u = true;
    @GuardedBy("mLock")
    /* renamed from: v */
    private boolean f16871v = true;

    /* renamed from: a */
    public final void m21233a(Context context, String str, boolean z) {
        this.f16853d = zzalm.m9772a(new cz(this, context, "admob"));
        this.f16851b = true;
    }

    /* renamed from: o */
    private final void m21228o() {
        if (this.f16853d != null && !this.f16853d.isDone()) {
            try {
                this.f16853d.get(1, TimeUnit.SECONDS);
            } catch (Throwable e) {
                Thread.currentThread().interrupt();
                zzaok.m10004c("Interrupted while waiting for preferences loaded.", e);
            } catch (Throwable e2) {
                zzaok.m10002b("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    /* renamed from: p */
    private final Bundle m21229p() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.f16850a) {
            bundle.putBoolean("use_https", this.f16858i);
            bundle.putBoolean("content_url_opted_out", this.f16870u);
            bundle.putBoolean("content_vertical_opted_out", this.f16871v);
            bundle.putBoolean("auto_collect_location", this.f16861l);
            bundle.putInt("version_code", this.f16867r);
            bundle.putStringArray("never_pool_slots", (String[]) this.f16868s.toArray(new String[this.f16868s.size()]));
            bundle.putString("app_settings_json", this.f16862m);
            bundle.putLong("app_settings_last_update_ms", this.f16863n);
            bundle.putLong("app_last_background_time_ms", this.f16864o);
            bundle.putInt("request_in_session_count", this.f16866q);
            bundle.putLong("first_ad_req_time_ms", this.f16865p);
            bundle.putString("native_advanced_settings", this.f16869t.toString());
            if (this.f16859j != null) {
                bundle.putString("content_url_hashes", this.f16859j);
            }
            if (this.f16860k != null) {
                bundle.putString("content_vertical_hashes", this.f16860k);
            }
        }
        return bundle;
    }

    /* renamed from: a */
    private final void m21227a(Bundle bundle) {
        zzalm.f8869a.execute(new da(this));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo2338a(boolean r4) {
        /*
        r3 = this;
        r3.m21228o();
        r0 = r3.f16850a;
        monitor-enter(r0);
        r1 = r3.f16858i;	 Catch:{ all -> 0x0031 }
        if (r1 != r4) goto L_0x000c;
    L_0x000a:
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        return;
    L_0x000c:
        r3.f16858i = r4;	 Catch:{ all -> 0x0031 }
        r1 = r3.f16856g;	 Catch:{ all -> 0x0031 }
        if (r1 == 0) goto L_0x001e;
    L_0x0012:
        r1 = r3.f16856g;	 Catch:{ all -> 0x0031 }
        r2 = "use_https";
        r1.putBoolean(r2, r4);	 Catch:{ all -> 0x0031 }
        r1 = r3.f16856g;	 Catch:{ all -> 0x0031 }
        r1.apply();	 Catch:{ all -> 0x0031 }
    L_0x001e:
        r1 = r3.f16857h;	 Catch:{ all -> 0x0031 }
        if (r1 != 0) goto L_0x002f;
    L_0x0022:
        r1 = new android.os.Bundle;	 Catch:{ all -> 0x0031 }
        r1.<init>();	 Catch:{ all -> 0x0031 }
        r2 = "use_https";
        r1.putBoolean(r2, r4);	 Catch:{ all -> 0x0031 }
        r3.m21227a(r1);	 Catch:{ all -> 0x0031 }
    L_0x002f:
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        return;
    L_0x0031:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalj.a(boolean):void");
    }

    /* renamed from: a */
    public final boolean mo2339a() {
        boolean z;
        m21228o();
        synchronized (this.f16850a) {
            if (!this.f16858i) {
                if (!this.f16857h) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo2343b(boolean z) {
        m21228o();
        synchronized (this.f16850a) {
            if (this.f16870u == z) {
                return;
            }
            this.f16870u = z;
            if (this.f16856g != null) {
                this.f16856g.putBoolean("content_url_opted_out", z);
                this.f16856g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.f16870u);
            bundle.putBoolean("content_vertical_opted_out", this.f16871v);
            m21227a(bundle);
        }
    }

    /* renamed from: b */
    public final boolean mo2344b() {
        boolean z;
        m21228o();
        synchronized (this.f16850a) {
            z = this.f16870u;
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo2336a(@javax.annotation.Nullable java.lang.String r4) {
        /*
        r3 = this;
        r3.m21228o();
        r0 = r3.f16850a;
        monitor-enter(r0);
        if (r4 == 0) goto L_0x0034;
    L_0x0008:
        r1 = r3.f16859j;	 Catch:{ all -> 0x0032 }
        r1 = r4.equals(r1);	 Catch:{ all -> 0x0032 }
        if (r1 == 0) goto L_0x0011;
    L_0x0010:
        goto L_0x0034;
    L_0x0011:
        r3.f16859j = r4;	 Catch:{ all -> 0x0032 }
        r1 = r3.f16856g;	 Catch:{ all -> 0x0032 }
        if (r1 == 0) goto L_0x0023;
    L_0x0017:
        r1 = r3.f16856g;	 Catch:{ all -> 0x0032 }
        r2 = "content_url_hashes";
        r1.putString(r2, r4);	 Catch:{ all -> 0x0032 }
        r1 = r3.f16856g;	 Catch:{ all -> 0x0032 }
        r1.apply();	 Catch:{ all -> 0x0032 }
    L_0x0023:
        r1 = new android.os.Bundle;	 Catch:{ all -> 0x0032 }
        r1.<init>();	 Catch:{ all -> 0x0032 }
        r2 = "content_url_hashes";
        r1.putString(r2, r4);	 Catch:{ all -> 0x0032 }
        r3.m21227a(r1);	 Catch:{ all -> 0x0032 }
        monitor-exit(r0);	 Catch:{ all -> 0x0032 }
        return;
    L_0x0032:
        r4 = move-exception;
        goto L_0x0036;
    L_0x0034:
        monitor-exit(r0);	 Catch:{ all -> 0x0032 }
        return;
    L_0x0036:
        monitor-exit(r0);	 Catch:{ all -> 0x0032 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalj.a(java.lang.String):void");
    }

    @Nullable
    /* renamed from: c */
    public final String mo2345c() {
        String str;
        m21228o();
        synchronized (this.f16850a) {
            str = this.f16859j;
        }
        return str;
    }

    /* renamed from: c */
    public final void mo2347c(boolean z) {
        m21228o();
        synchronized (this.f16850a) {
            if (this.f16871v == z) {
                return;
            }
            this.f16871v = z;
            if (this.f16856g != null) {
                this.f16856g.putBoolean("content_vertical_opted_out", z);
                this.f16856g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.f16870u);
            bundle.putBoolean("content_vertical_opted_out", this.f16871v);
            m21227a(bundle);
        }
    }

    /* renamed from: d */
    public final boolean mo2350d() {
        boolean z;
        m21228o();
        synchronized (this.f16850a) {
            z = this.f16871v;
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final void mo2342b(@javax.annotation.Nullable java.lang.String r4) {
        /*
        r3 = this;
        r3.m21228o();
        r0 = r3.f16850a;
        monitor-enter(r0);
        if (r4 == 0) goto L_0x0034;
    L_0x0008:
        r1 = r3.f16860k;	 Catch:{ all -> 0x0032 }
        r1 = r4.equals(r1);	 Catch:{ all -> 0x0032 }
        if (r1 == 0) goto L_0x0011;
    L_0x0010:
        goto L_0x0034;
    L_0x0011:
        r3.f16860k = r4;	 Catch:{ all -> 0x0032 }
        r1 = r3.f16856g;	 Catch:{ all -> 0x0032 }
        if (r1 == 0) goto L_0x0023;
    L_0x0017:
        r1 = r3.f16856g;	 Catch:{ all -> 0x0032 }
        r2 = "content_vertical_hashes";
        r1.putString(r2, r4);	 Catch:{ all -> 0x0032 }
        r1 = r3.f16856g;	 Catch:{ all -> 0x0032 }
        r1.apply();	 Catch:{ all -> 0x0032 }
    L_0x0023:
        r1 = new android.os.Bundle;	 Catch:{ all -> 0x0032 }
        r1.<init>();	 Catch:{ all -> 0x0032 }
        r2 = "content_vertical_hashes";
        r1.putString(r2, r4);	 Catch:{ all -> 0x0032 }
        r3.m21227a(r1);	 Catch:{ all -> 0x0032 }
        monitor-exit(r0);	 Catch:{ all -> 0x0032 }
        return;
    L_0x0032:
        r4 = move-exception;
        goto L_0x0036;
    L_0x0034:
        monitor-exit(r0);	 Catch:{ all -> 0x0032 }
        return;
    L_0x0036:
        monitor-exit(r0);	 Catch:{ all -> 0x0032 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalj.b(java.lang.String):void");
    }

    @Nullable
    /* renamed from: e */
    public final String mo2351e() {
        String str;
        m21228o();
        synchronized (this.f16850a) {
            str = this.f16860k;
        }
        return str;
    }

    /* renamed from: d */
    public final void mo2349d(boolean z) {
        m21228o();
        synchronized (this.f16850a) {
            if (this.f16861l == z) {
                return;
            }
            this.f16861l = z;
            if (this.f16856g != null) {
                this.f16856g.putBoolean("auto_collect_location", z);
                this.f16856g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("auto_collect_location", z);
            m21227a(bundle);
        }
    }

    /* renamed from: f */
    public final boolean mo2354f() {
        boolean z;
        m21228o();
        synchronized (this.f16850a) {
            z = this.f16861l;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo2334a(int i) {
        m21228o();
        synchronized (this.f16850a) {
            if (this.f16867r == i) {
                return;
            }
            this.f16867r = i;
            if (this.f16856g != null) {
                this.f16856g.putInt("version_code", i);
                this.f16856g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("version_code", i);
            m21227a(bundle);
        }
    }

    /* renamed from: g */
    public final int mo2355g() {
        int i;
        m21228o();
        synchronized (this.f16850a) {
            i = this.f16867r;
        }
        return i;
    }

    /* renamed from: c */
    public final void mo2346c(String str) {
        m21228o();
        synchronized (this.f16850a) {
            if (this.f16868s.contains(str)) {
                return;
            }
            this.f16868s.add(str);
            if (this.f16856g != null) {
                this.f16856g.putStringSet("never_pool_slots", this.f16868s);
                this.f16856g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putStringArray("never_pool_slots", (String[]) this.f16868s.toArray(new String[this.f16868s.size()]));
            m21227a(bundle);
        }
    }

    /* renamed from: d */
    public final void mo2348d(String str) {
        m21228o();
        synchronized (this.f16850a) {
            if (this.f16868s.contains(str)) {
                this.f16868s.remove(str);
                if (this.f16856g != null) {
                    this.f16856g.putStringSet("never_pool_slots", this.f16868s);
                    this.f16856g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.f16868s.toArray(new String[this.f16868s.size()]));
                m21227a(bundle);
                return;
            }
        }
    }

    /* renamed from: e */
    public final boolean mo2352e(String str) {
        m21228o();
        synchronized (this.f16850a) {
            str = this.f16868s.contains(str);
        }
        return str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: f */
    public final void mo2353f(java.lang.String r6) {
        /*
        r5 = this;
        r5.m21228o();
        r0 = r5.f16850a;
        monitor-enter(r0);
        r1 = com.google.android.gms.ads.internal.zzbv.zzer();	 Catch:{ all -> 0x0060 }
        r1 = r1.currentTimeMillis();	 Catch:{ all -> 0x0060 }
        r5.f16863n = r1;	 Catch:{ all -> 0x0060 }
        if (r6 == 0) goto L_0x005e;
    L_0x0012:
        r3 = r5.f16862m;	 Catch:{ all -> 0x0060 }
        r3 = r6.equals(r3);	 Catch:{ all -> 0x0060 }
        if (r3 == 0) goto L_0x001b;
    L_0x001a:
        goto L_0x005e;
    L_0x001b:
        r5.f16862m = r6;	 Catch:{ all -> 0x0060 }
        r3 = r5.f16856g;	 Catch:{ all -> 0x0060 }
        if (r3 == 0) goto L_0x0034;
    L_0x0021:
        r3 = r5.f16856g;	 Catch:{ all -> 0x0060 }
        r4 = "app_settings_json";
        r3.putString(r4, r6);	 Catch:{ all -> 0x0060 }
        r3 = r5.f16856g;	 Catch:{ all -> 0x0060 }
        r4 = "app_settings_last_update_ms";
        r3.putLong(r4, r1);	 Catch:{ all -> 0x0060 }
        r3 = r5.f16856g;	 Catch:{ all -> 0x0060 }
        r3.apply();	 Catch:{ all -> 0x0060 }
    L_0x0034:
        r3 = new android.os.Bundle;	 Catch:{ all -> 0x0060 }
        r3.<init>();	 Catch:{ all -> 0x0060 }
        r4 = "app_settings_json";
        r3.putString(r4, r6);	 Catch:{ all -> 0x0060 }
        r6 = "app_settings_last_update_ms";
        r3.putLong(r6, r1);	 Catch:{ all -> 0x0060 }
        r5.m21227a(r3);	 Catch:{ all -> 0x0060 }
        r6 = r5.f16852c;	 Catch:{ all -> 0x0060 }
        r6 = r6.iterator();	 Catch:{ all -> 0x0060 }
    L_0x004c:
        r1 = r6.hasNext();	 Catch:{ all -> 0x0060 }
        if (r1 == 0) goto L_0x005c;
    L_0x0052:
        r1 = r6.next();	 Catch:{ all -> 0x0060 }
        r1 = (java.lang.Runnable) r1;	 Catch:{ all -> 0x0060 }
        r1.run();	 Catch:{ all -> 0x0060 }
        goto L_0x004c;
    L_0x005c:
        monitor-exit(r0);	 Catch:{ all -> 0x0060 }
        return;
    L_0x005e:
        monitor-exit(r0);	 Catch:{ all -> 0x0060 }
        return;
    L_0x0060:
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0060 }
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalj.f(java.lang.String):void");
    }

    /* renamed from: h */
    public final zzakq mo2356h() {
        zzakq zzakq;
        m21228o();
        synchronized (this.f16850a) {
            zzakq = new zzakq(this.f16862m, this.f16863n);
        }
        return zzakq;
    }

    /* renamed from: a */
    public final void mo2335a(long j) {
        m21228o();
        synchronized (this.f16850a) {
            if (this.f16864o == j) {
                return;
            }
            this.f16864o = j;
            if (this.f16856g != null) {
                this.f16856g.putLong("app_last_background_time_ms", j);
                this.f16856g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("app_last_background_time_ms", j);
            m21227a(bundle);
        }
    }

    /* renamed from: i */
    public final long mo2357i() {
        long j;
        m21228o();
        synchronized (this.f16850a) {
            j = this.f16864o;
        }
        return j;
    }

    /* renamed from: b */
    public final void mo2340b(int i) {
        m21228o();
        synchronized (this.f16850a) {
            if (this.f16866q == i) {
                return;
            }
            this.f16866q = i;
            if (this.f16856g != null) {
                this.f16856g.putInt("request_in_session_count", i);
                this.f16856g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("request_in_session_count", i);
            m21227a(bundle);
        }
    }

    /* renamed from: j */
    public final int mo2358j() {
        int i;
        m21228o();
        synchronized (this.f16850a) {
            i = this.f16866q;
        }
        return i;
    }

    /* renamed from: b */
    public final void mo2341b(long j) {
        m21228o();
        synchronized (this.f16850a) {
            if (this.f16865p == j) {
                return;
            }
            this.f16865p = j;
            if (this.f16856g != null) {
                this.f16856g.putLong("first_ad_req_time_ms", j);
                this.f16856g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("first_ad_req_time_ms", j);
            m21227a(bundle);
        }
    }

    /* renamed from: k */
    public final long mo2359k() {
        long j;
        m21228o();
        synchronized (this.f16850a) {
            j = this.f16865p;
        }
        return j;
    }

    /* renamed from: a */
    public final void mo2337a(String str, String str2, boolean z) {
        m21228o();
        synchronized (this.f16850a) {
            JSONArray optJSONArray = this.f16869t.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i = 0;
            while (i < optJSONArray.length()) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    return;
                } else if (!str2.equals(optJSONObject.optString("template_id"))) {
                    i++;
                } else if (z && optJSONObject.optBoolean("uses_media_view", false) == z) {
                    return;
                } else {
                    length = i;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", zzbv.zzer().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.f16869t.put(str, optJSONArray);
            } catch (String str3) {
                zzaok.m10004c("Could not update native advanced settings", str3);
            }
            if (this.f16856g != null) {
                this.f16856g.putString("native_advanced_settings", this.f16869t.toString());
                this.f16856g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.f16869t.toString());
            m21227a(bundle);
        }
    }

    /* renamed from: l */
    public final JSONObject mo2360l() {
        JSONObject jSONObject;
        m21228o();
        synchronized (this.f16850a) {
            jSONObject = this.f16869t;
        }
        return jSONObject;
    }

    /* renamed from: m */
    public final void mo2361m() {
        m21228o();
        synchronized (this.f16850a) {
            this.f16869t = new JSONObject();
            if (this.f16856g != null) {
                this.f16856g.remove("native_advanced_settings");
                this.f16856g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            m21227a(bundle);
        }
    }

    @Nullable
    /* renamed from: n */
    public final zzgn mo2362n() {
        if (!this.f16851b || !PlatformVersion.isAtLeastIceCreamSandwich()) {
            return null;
        }
        if (mo2344b() && mo2350d()) {
            return null;
        }
        if (!((Boolean) zzkd.m10713e().m10897a(zznw.f9688M)).booleanValue()) {
            return null;
        }
        synchronized (this.f16850a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f16854e == null) {
                this.f16854e = new zzgn();
            }
            this.f16854e.m10638a();
            zzaok.m10005d("start fetching content...");
            zzgn zzgn = this.f16854e;
            return zzgn;
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m21232a(Context context, String str) {
        boolean z = false;
        context = context.getSharedPreferences(str, 0);
        str = context.edit();
        synchronized (this.f16850a) {
            this.f16855f = context;
            this.f16856g = str;
            if (PlatformVersion.isAtLeastM() != null && NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() == null) {
                z = true;
            }
            this.f16857h = z;
            this.f16858i = this.f16855f.getBoolean("use_https", this.f16858i);
            this.f16870u = this.f16855f.getBoolean("content_url_opted_out", this.f16870u);
            this.f16859j = this.f16855f.getString("content_url_hashes", this.f16859j);
            this.f16861l = this.f16855f.getBoolean("auto_collect_location", this.f16861l);
            this.f16871v = this.f16855f.getBoolean("content_vertical_opted_out", this.f16871v);
            this.f16860k = this.f16855f.getString("content_vertical_hashes", this.f16860k);
            this.f16867r = this.f16855f.getInt("version_code", this.f16867r);
            this.f16862m = this.f16855f.getString("app_settings_json", this.f16862m);
            this.f16863n = this.f16855f.getLong("app_settings_last_update_ms", this.f16863n);
            this.f16864o = this.f16855f.getLong("app_last_background_time_ms", this.f16864o);
            this.f16866q = this.f16855f.getInt("request_in_session_count", this.f16866q);
            this.f16865p = this.f16855f.getLong("first_ad_req_time_ms", this.f16865p);
            this.f16868s = this.f16855f.getStringSet("never_pool_slots", this.f16868s);
            try {
                this.f16869t = new JSONObject(this.f16855f.getString("native_advanced_settings", "{}"));
            } catch (Context context2) {
                zzaok.m10004c("Could not convert native advanced settings to json object", context2);
            }
            m21227a(m21229p());
        }
    }
}
