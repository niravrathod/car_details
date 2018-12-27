package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.C0120b;
import android.support.customtabs.C0124d;
import android.support.customtabs.C0125e;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzot implements zzbhx {
    /* renamed from: a */
    private C0125e f17294a;
    /* renamed from: b */
    private C0120b f17295b;
    /* renamed from: c */
    private C0124d f17296c;
    /* renamed from: d */
    private zzou f17297d;

    /* renamed from: a */
    public static boolean m21793a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(((ResolveInfo) queryIntentActivities.get(i)).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zzbhv.m10460a(context));
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m21795a(Activity activity) {
        if (this.f17296c != null) {
            activity.unbindService(this.f17296c);
            this.f17295b = null;
            this.f17294a = null;
            this.f17296c = null;
        }
    }

    /* renamed from: a */
    public final void m21797a(zzou zzou) {
        this.f17297d = zzou;
    }

    /* renamed from: b */
    public final void m21799b(Activity activity) {
        if (this.f17295b == null) {
            String a = zzbhv.m10460a(activity);
            if (a != null) {
                this.f17296c = new zzbhw(this);
                C0120b.m450a(activity, a, this.f17296c);
            }
        }
    }

    /* renamed from: a */
    public final boolean m21798a(Uri uri, Bundle bundle, List<Bundle> list) {
        if (this.f17295b == null) {
            return false;
        }
        if (this.f17295b == null) {
            this.f17294a = null;
        } else if (this.f17294a == null) {
            this.f17294a = this.f17295b.m451a(null);
        }
        bundle = this.f17294a;
        if (bundle == null) {
            return false;
        }
        return bundle.m461a(uri, null, null);
    }

    /* renamed from: a */
    public final void mo2582a(C0120b c0120b) {
        this.f17295b = c0120b;
        this.f17295b.m452a(0);
        if (this.f17297d != null) {
            this.f17297d.mo1942a();
        }
    }

    /* renamed from: a */
    public final void mo2581a() {
        this.f17295b = null;
        this.f17294a = null;
        if (this.f17297d != null) {
            this.f17297d.mo1943b();
        }
    }
}
