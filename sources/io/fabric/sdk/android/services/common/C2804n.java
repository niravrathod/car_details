package io.fabric.sdk.android.services.common;

import android.content.Context;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.services.p146a.C2776d;
import io.fabric.sdk.android.services.p146a.C4732b;

/* renamed from: io.fabric.sdk.android.services.common.n */
public class C2804n {
    /* renamed from: a */
    private final C2776d<String> f11899a = new C43061(this);
    /* renamed from: b */
    private final C4732b<String> f11900b = new C4732b();

    /* renamed from: io.fabric.sdk.android.services.common.n$1 */
    class C43061 implements C2776d<String> {
        /* renamed from: a */
        final /* synthetic */ C2804n f18035a;

        C43061(C2804n c2804n) {
            this.f18035a = c2804n;
        }

        public /* synthetic */ Object load(Context context) {
            return m23626a(context);
        }

        /* renamed from: a */
        public String m23626a(Context context) {
            context = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return context == null ? "" : context;
        }
    }

    /* renamed from: a */
    public String m13696a(Context context) {
        try {
            context = (String) this.f11900b.mo3565a(context, this.f11899a);
            if ("".equals(context)) {
                context = null;
            }
            return context;
        } catch (Context context2) {
            C2766c.m13524h().mo3562e("Fabric", "Failed to determine installer package name", context2);
            return null;
        }
    }
}
