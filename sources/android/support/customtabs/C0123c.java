package android.support.customtabs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.C0328g;
import android.support.v4.content.C0389b;
import java.util.ArrayList;

/* renamed from: android.support.customtabs.c */
public final class C0123c {
    /* renamed from: a */
    public final Intent f527a;
    /* renamed from: b */
    public final Bundle f528b;

    /* renamed from: android.support.customtabs.c$a */
    public static final class C0122a {
        /* renamed from: a */
        private final Intent f522a;
        /* renamed from: b */
        private ArrayList<Bundle> f523b;
        /* renamed from: c */
        private Bundle f524c;
        /* renamed from: d */
        private ArrayList<Bundle> f525d;
        /* renamed from: e */
        private boolean f526e;

        public C0122a() {
            this(null);
        }

        public C0122a(C0125e c0125e) {
            this.f522a = new Intent("android.intent.action.VIEW");
            IBinder iBinder = null;
            this.f523b = null;
            this.f524c = null;
            this.f525d = null;
            this.f526e = true;
            if (c0125e != null) {
                this.f522a.setPackage(c0125e.m462b().getPackageName());
            }
            Bundle bundle = new Bundle();
            String str = "android.support.customtabs.extra.SESSION";
            if (c0125e != null) {
                iBinder = c0125e.m460a();
            }
            C0328g.m1171a(bundle, str, iBinder);
            this.f522a.putExtras(bundle);
        }

        /* renamed from: a */
        public C0122a m454a(int i) {
            this.f522a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i);
            return this;
        }

        /* renamed from: a */
        public C0122a m453a() {
            this.f522a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
            return this;
        }

        /* renamed from: a */
        public C0122a m455a(boolean z) {
            this.f522a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z);
            return this;
        }

        /* renamed from: b */
        public C0122a m456b(int i) {
            this.f522a.putExtra("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", i);
            return this;
        }

        /* renamed from: b */
        public C0123c m457b() {
            if (this.f523b != null) {
                this.f522a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", this.f523b);
            }
            if (this.f525d != null) {
                this.f522a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", this.f525d);
            }
            this.f522a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f526e);
            return new C0123c(this.f522a, this.f524c);
        }
    }

    /* renamed from: a */
    public void m458a(Context context, Uri uri) {
        this.f527a.setData(uri);
        C0389b.m1431a(context, this.f527a, this.f528b);
    }

    private C0123c(Intent intent, Bundle bundle) {
        this.f527a = intent;
        this.f528b = bundle;
    }
}
