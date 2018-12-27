package io.fabric.sdk.android.services.settings;

import android.annotation.SuppressLint;
import android.content.SharedPreferences.Editor;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import io.fabric.sdk.android.services.common.C2799j;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.p148c.C2787c;
import io.fabric.sdk.android.services.p148c.C4298d;
import org.json.JSONObject;

/* renamed from: io.fabric.sdk.android.services.settings.j */
class C4320j implements C2852r {
    /* renamed from: a */
    private final C2856v f18055a;
    /* renamed from: b */
    private final C2855u f18056b;
    /* renamed from: c */
    private final C2799j f18057c;
    /* renamed from: d */
    private final C2844g f18058d;
    /* renamed from: e */
    private final C2857w f18059e;
    /* renamed from: f */
    private final C2771h f18060f;
    /* renamed from: g */
    private final C2787c f18061g = new C4298d(this.f18060f);

    public C4320j(C2771h c2771h, C2856v c2856v, C2799j c2799j, C2855u c2855u, C2844g c2844g, C2857w c2857w) {
        this.f18060f = c2771h;
        this.f18055a = c2856v;
        this.f18057c = c2799j;
        this.f18056b = c2855u;
        this.f18058d = c2844g;
        this.f18059e = c2857w;
    }

    /* renamed from: a */
    public C2853s mo3596a() {
        return mo3597a(SettingsCacheBehavior.USE_CACHE);
    }

    /* renamed from: a */
    public C2853s mo3597a(SettingsCacheBehavior settingsCacheBehavior) {
        SettingsCacheBehavior settingsCacheBehavior2 = null;
        try {
            if (!(C2766c.m13525i() || m23683d())) {
                settingsCacheBehavior2 = m23677b(settingsCacheBehavior);
            }
            if (settingsCacheBehavior2 == null) {
                settingsCacheBehavior = this.f18059e.mo3599a(this.f18055a);
                if (settingsCacheBehavior != null) {
                    C2853s a = this.f18056b.mo3598a(this.f18057c, settingsCacheBehavior);
                    try {
                        this.f18058d.mo3595a(a.f12061g, settingsCacheBehavior);
                        m23676a(settingsCacheBehavior, "Loaded settings: ");
                        m23680a(m23681b());
                        settingsCacheBehavior2 = a;
                    } catch (Exception e) {
                        settingsCacheBehavior = e;
                        settingsCacheBehavior2 = a;
                        C2766c.m13524h().mo3562e("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", settingsCacheBehavior);
                        return settingsCacheBehavior2;
                    }
                }
            }
            if (settingsCacheBehavior2 == null) {
                return m23677b(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
            }
        } catch (Exception e2) {
            settingsCacheBehavior = e2;
            C2766c.m13524h().mo3562e("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", settingsCacheBehavior);
            return settingsCacheBehavior2;
        }
        return settingsCacheBehavior2;
    }

    /* renamed from: b */
    private C2853s m23677b(SettingsCacheBehavior settingsCacheBehavior) {
        C2853s c2853s = null;
        try {
            if (SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                return null;
            }
            JSONObject a = this.f18058d.mo3594a();
            if (a != null) {
                C2853s a2 = this.f18056b.mo3598a(this.f18057c, a);
                if (a2 != null) {
                    m23676a(a, "Loaded cached settings: ");
                    long a3 = this.f18057c.mo3580a();
                    if (SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior) == null) {
                        if (a2.m13863a(a3) != null) {
                            C2766c.m13524h().mo3554a("Fabric", "Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        C2766c.m13524h().mo3554a("Fabric", "Returning cached settings.");
                        return a2;
                    } catch (Exception e) {
                        settingsCacheBehavior = e;
                        c2853s = a2;
                        C2766c.m13524h().mo3562e("Fabric", "Failed to get cached settings", settingsCacheBehavior);
                        return c2853s;
                    }
                }
                C2766c.m13524h().mo3562e("Fabric", "Failed to transform cached settings data.", null);
                return null;
            }
            C2766c.m13524h().mo3554a("Fabric", "No cached settings data found.");
            return null;
        } catch (Exception e2) {
            settingsCacheBehavior = e2;
            C2766c.m13524h().mo3562e("Fabric", "Failed to get cached settings", settingsCacheBehavior);
            return c2853s;
        }
    }

    /* renamed from: a */
    private void m23676a(JSONObject jSONObject, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(jSONObject.toString());
        C2766c.m13524h().mo3554a("Fabric", stringBuilder.toString());
    }

    /* renamed from: b */
    String m23681b() {
        return CommonUtils.m13608a(CommonUtils.m13637m(this.f18060f.getContext()));
    }

    /* renamed from: c */
    String m23682c() {
        return this.f18061g.mo3576a().getString("existing_instance_identifier", "");
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    boolean m23680a(String str) {
        Editor b = this.f18061g.mo3578b();
        b.putString("existing_instance_identifier", str);
        return this.f18061g.mo3577a(b);
    }

    /* renamed from: d */
    boolean m23683d() {
        return m23682c().equals(m23681b()) ^ 1;
    }
}
