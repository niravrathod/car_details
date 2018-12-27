package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigInteger;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.l */
final class C4832l extends ao {
    @VisibleForTesting
    /* renamed from: a */
    static final Pair<String, Long> f21381a = new Pair("", Long.valueOf(0));
    /* renamed from: b */
    public zzbe f21382b;
    /* renamed from: c */
    public final zzbd f21383c = new zzbd(this, "last_upload", 0);
    /* renamed from: d */
    public final zzbd f21384d = new zzbd(this, "last_upload_attempt", 0);
    /* renamed from: e */
    public final zzbd f21385e = new zzbd(this, "backoff", 0);
    /* renamed from: f */
    public final zzbd f21386f = new zzbd(this, "last_delete_stale", 0);
    /* renamed from: g */
    public final zzbd f21387g = new zzbd(this, "midnight_offset", 0);
    /* renamed from: h */
    public final zzbd f21388h = new zzbd(this, "first_open_time", 0);
    /* renamed from: i */
    public final zzbd f21389i = new zzbd(this, "app_install_time", 0);
    /* renamed from: j */
    public final zzbf f21390j = new zzbf(this, "app_instance_id", null);
    /* renamed from: k */
    public final zzbd f21391k = new zzbd(this, "time_before_start", 10000);
    /* renamed from: l */
    public final zzbd f21392l = new zzbd(this, "session_timeout", 1800000);
    /* renamed from: m */
    public final zzbc f21393m = new zzbc(this, "start_new_session", true);
    /* renamed from: n */
    public final zzbf f21394n = new zzbf(this, "allow_ad_personalization", null);
    /* renamed from: o */
    public final zzbd f21395o = new zzbd(this, "last_pause_time", 0);
    /* renamed from: p */
    public final zzbd f21396p = new zzbd(this, "time_active", 0);
    /* renamed from: q */
    public boolean f21397q;
    /* renamed from: s */
    private SharedPreferences f21398s;
    /* renamed from: t */
    private String f21399t;
    /* renamed from: u */
    private boolean f21400u;
    /* renamed from: v */
    private long f21401v;

    /* renamed from: a */
    final Pair<String, Boolean> m28448a(String str) {
        mo4395d();
        long elapsedRealtime = mo3169m().elapsedRealtime();
        if (this.f21399t != null && elapsedRealtime < this.f21401v) {
            return new Pair(this.f21399t, Boolean.valueOf(this.f21400u));
        }
        this.f21401v = elapsedRealtime + mo4400t().m27336a(str, zzaf.f10721j);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            str = AdvertisingIdClient.getAdvertisingIdInfo(mo3170n());
            if (str != null) {
                this.f21399t = str.getId();
                this.f21400u = str.isLimitAdTrackingEnabled();
            }
            if (this.f21399t == null) {
                this.f21399t = "";
            }
        } catch (String str2) {
            mo3172r().m28554w().m12355a("Unable to get advertising id", str2);
            this.f21399t = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(null);
        return new Pair(this.f21399t, Boolean.valueOf(this.f21400u));
    }

    /* renamed from: e */
    protected final boolean mo4839e() {
        return true;
    }

    /* renamed from: b */
    final String m28450b(String str) {
        mo4395d();
        str = m28448a(str).first;
        if (zzfk.m28609i() == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, zzfk.m28609i().digest(str.getBytes()))});
    }

    C4832l(zzbt zzbt) {
        super(zzbt);
    }

    /* renamed from: f */
    protected final void mo4840f() {
        this.f21398s = mo3170n().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f21397q = this.f21398s.getBoolean("has_been_opened", false);
        if (!this.f21397q) {
            Editor edit = this.f21398s.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f21382b = new zzbe(this, "health_monitor", Math.max(0, ((Long) zzaf.f10722k.m12332b()).longValue()));
    }

    /* renamed from: x */
    private final SharedPreferences m28447x() {
        mo4395d();
        m27280A();
        return this.f21398s;
    }

    /* renamed from: c */
    final void m28452c(String str) {
        mo4395d();
        Editor edit = m28447x().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* renamed from: g */
    final String m28458g() {
        mo4395d();
        return m28447x().getString("gmp_app_id", null);
    }

    /* renamed from: d */
    final void m28454d(String str) {
        mo4395d();
        Editor edit = m28447x().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* renamed from: h */
    final String m28459h() {
        mo4395d();
        return m28447x().getString("admob_app_id", null);
    }

    /* renamed from: i */
    final Boolean m28460i() {
        mo4395d();
        if (m28447x().contains("use_service")) {
            return Boolean.valueOf(m28447x().getBoolean("use_service", false));
        }
        return null;
    }

    /* renamed from: a */
    final void m28449a(boolean z) {
        mo4395d();
        mo3172r().m28555x().m12355a("Setting useService", Boolean.valueOf(z));
        Editor edit = m28447x().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* renamed from: j */
    final void m28461j() {
        mo4395d();
        mo3172r().m28555x().m12354a("Clearing collection preferences.");
        boolean contains = m28447x().contains("measurement_enabled");
        boolean z = true;
        if (contains) {
            z = m28453c(true);
        }
        Editor edit = m28447x().edit();
        edit.clear();
        edit.apply();
        if (contains) {
            m28451b(z);
        }
    }

    /* renamed from: b */
    final void m28451b(boolean z) {
        mo4395d();
        mo3172r().m28555x().m12355a("Setting measurementEnabled", Boolean.valueOf(z));
        Editor edit = m28447x().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* renamed from: c */
    final boolean m28453c(boolean z) {
        mo4395d();
        return m28447x().getBoolean("measurement_enabled", z);
    }

    /* renamed from: k */
    protected final String m28462k() {
        mo4395d();
        String string = m28447x().getString("previous_os_version", null);
        mo4396l().m27280A();
        String str = VERSION.RELEASE;
        if (!(TextUtils.isEmpty(str) || str.equals(string))) {
            Editor edit = m28447x().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* renamed from: d */
    final void m28455d(boolean z) {
        mo4395d();
        mo3172r().m28555x().m12355a("Updating deferred analytics collection", Boolean.valueOf(z));
        Editor edit = m28447x().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* renamed from: v */
    final boolean m28463v() {
        mo4395d();
        return m28447x().getBoolean("deferred_analytics_collection", false);
    }

    /* renamed from: w */
    final boolean m28464w() {
        return this.f21398s.contains("deferred_analytics_collection");
    }
}
