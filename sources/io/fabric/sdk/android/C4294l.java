package io.fabric.sdk.android;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.services.common.C2796g;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.network.C2834c;
import io.fabric.sdk.android.services.network.C4317b;
import io.fabric.sdk.android.services.settings.C2841d;
import io.fabric.sdk.android.services.settings.C2842e;
import io.fabric.sdk.android.services.settings.C2846n;
import io.fabric.sdk.android.services.settings.C2851q;
import io.fabric.sdk.android.services.settings.C2853s;
import io.fabric.sdk.android.services.settings.C4737h;
import io.fabric.sdk.android.services.settings.C4738x;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: io.fabric.sdk.android.l */
class C4294l extends C2771h<Boolean> {
    /* renamed from: a */
    private final C2834c f18001a = new C4317b();
    /* renamed from: b */
    private PackageManager f18002b;
    /* renamed from: c */
    private String f18003c;
    /* renamed from: d */
    private PackageInfo f18004d;
    /* renamed from: e */
    private String f18005e;
    /* renamed from: f */
    private String f18006f;
    /* renamed from: g */
    private String f18007g;
    /* renamed from: h */
    private String f18008h;
    /* renamed from: i */
    private String f18009i;
    /* renamed from: j */
    private final Future<Map<String, C2773j>> f18010j;
    /* renamed from: k */
    private final Collection<C2771h> f18011k;

    public String getIdentifier() {
        return "io.fabric.sdk.android:fabric";
    }

    public String getVersion() {
        return "1.4.3.25";
    }

    protected /* synthetic */ Object doInBackground() {
        return m23593a();
    }

    public C4294l(Future<Map<String, C2773j>> future, Collection<C2771h> collection) {
        this.f18010j = future;
        this.f18011k = collection;
    }

    protected boolean onPreExecute() {
        try {
            this.f18007g = getIdManager().m13656i();
            this.f18002b = getContext().getPackageManager();
            this.f18003c = getContext().getPackageName();
            this.f18004d = this.f18002b.getPackageInfo(this.f18003c, 0);
            this.f18005e = Integer.toString(this.f18004d.versionCode);
            this.f18006f = this.f18004d.versionName == null ? "0.0" : this.f18004d.versionName;
            this.f18008h = this.f18002b.getApplicationLabel(getContext().getApplicationInfo()).toString();
            this.f18009i = Integer.toString(getContext().getApplicationInfo().targetSdkVersion);
            return true;
        } catch (Throwable e) {
            C2766c.m13524h().mo3562e("Fabric", "Failed init", e);
            return false;
        }
    }

    /* renamed from: a */
    protected Boolean m23593a() {
        boolean a;
        String k = CommonUtils.m13635k(getContext());
        C2853s c = m23591c();
        if (c != null) {
            try {
                Map map;
                if (this.f18010j != null) {
                    map = (Map) this.f18010j.get();
                } else {
                    map = new HashMap();
                }
                a = m23589a(k, c.f12055a, m23594a(map, this.f18011k).values());
            } catch (Throwable e) {
                C2766c.m13524h().mo3562e("Fabric", "Error performing auto configuration.", e);
            }
            return Boolean.valueOf(a);
        }
        a = false;
        return Boolean.valueOf(a);
    }

    /* renamed from: c */
    private C2853s m23591c() {
        try {
            C2851q.m13855a().m13857a(this, this.idManager, this.f18001a, this.f18005e, this.f18006f, m23595b()).m13859c();
            return C2851q.m13855a().m13858b();
        } catch (Throwable e) {
            C2766c.m13524h().mo3562e("Fabric", "Error dealing with settings", e);
            return null;
        }
    }

    /* renamed from: a */
    Map<String, C2773j> m23594a(Map<String, C2773j> map, Collection<C2771h> collection) {
        for (C2771h c2771h : collection) {
            if (!map.containsKey(c2771h.getIdentifier())) {
                map.put(c2771h.getIdentifier(), new C2773j(c2771h.getIdentifier(), c2771h.getVersion(), "binary"));
            }
        }
        return map;
    }

    /* renamed from: a */
    private boolean m23589a(String str, C2842e c2842e, Collection<C2773j> collection) {
        if ("new".equals(c2842e.f12019b)) {
            if (m23590b(str, c2842e, collection) != null) {
                return C2851q.m13855a().m13860d();
            }
            C2766c.m13524h().mo3562e("Fabric", "Failed to create app with Crashlytics service.", null);
            return null;
        } else if ("configured".equals(c2842e.f12019b)) {
            return C2851q.m13855a().m13860d();
        } else {
            if (c2842e.f12023f) {
                C2766c.m13524h().mo3554a("Fabric", "Server says an update is required - forcing a full App update.");
                m23592c(str, c2842e, collection);
            }
            return true;
        }
    }

    /* renamed from: b */
    private boolean m23590b(String str, C2842e c2842e, Collection<C2773j> collection) {
        return new C4737h(this, m23595b(), c2842e.f12020c, this.f18001a).mo4538a(m23587a(C2846n.m13853a(getContext(), str), (Collection) collection));
    }

    /* renamed from: c */
    private boolean m23592c(String str, C2842e c2842e, Collection<C2773j> collection) {
        return m23588a(c2842e, C2846n.m13853a(getContext(), str), (Collection) collection);
    }

    /* renamed from: a */
    private boolean m23588a(C2842e c2842e, C2846n c2846n, Collection<C2773j> collection) {
        return new C4738x(this, m23595b(), c2842e.f12020c, this.f18001a).mo4538a(m23587a(c2846n, (Collection) collection));
    }

    /* renamed from: a */
    private C2841d m23587a(C2846n c2846n, Collection<C2773j> collection) {
        return new C2841d(new C2796g().m13679a(getContext()), getIdManager().m13650c(), this.f18006f, this.f18005e, CommonUtils.m13608a(CommonUtils.m13637m(r1)), this.f18008h, DeliveryMechanism.m13639a(this.f18007g).m13640a(), this.f18009i, "0", c2846n, collection);
    }

    /* renamed from: b */
    String m23595b() {
        return CommonUtils.m13620b(getContext(), "com.crashlytics.ApiEndpoint");
    }
}
