package com.facebook.ads.internal.p081a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.facebook.ads.internal.p094m.C1827c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.a.l */
public class C1719l {
    /* renamed from: a */
    private final C1827c f5166a;
    /* renamed from: b */
    private Application f5167b;
    /* renamed from: c */
    private C1718a f5168c;
    /* renamed from: d */
    private long f5169d = 0;
    /* renamed from: e */
    private String f5170e = null;
    /* renamed from: f */
    private C1711a f5171f = null;

    @TargetApi(14)
    /* renamed from: com.facebook.ads.internal.a.l$a */
    private static class C1718a implements ActivityLifecycleCallbacks {
        /* renamed from: a */
        private final WeakReference<Activity> f5164a;
        /* renamed from: b */
        private C1719l f5165b;

        public C1718a(Activity activity, C1719l c1719l) {
            this.f5164a = new WeakReference(activity);
            this.f5165b = c1719l;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
            if (this.f5165b != null) {
                Activity activity2 = (Activity) this.f5164a.get();
                if (activity2 == null || (activity2 != null && activity.equals(activity2))) {
                    this.f5165b.m6478a();
                    this.f5165b = null;
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    private C1719l(C1827c c1827c, Activity activity, int i) {
        this.f5166a = c1827c;
        this.f5167b = activity.getApplication();
        this.f5168c = new C1718a(activity, this);
    }

    /* renamed from: a */
    public static C1719l m6475a(C1827c c1827c, Activity activity) {
        return C1719l.m6476a(c1827c, activity, VERSION.SDK_INT);
    }

    /* renamed from: a */
    protected static C1719l m6476a(C1827c c1827c, Activity activity, int i) {
        return (activity == null || i < 14) ? null : new C1719l(c1827c, activity, i);
    }

    /* renamed from: a */
    private void m6477a(String str, long j, long j2, C1711a c1711a) {
        Map hashMap = new HashMap();
        hashMap.put("leave_time", Long.toString(j));
        hashMap.put("back_time", Long.toString(j2));
        if (c1711a != null) {
            hashMap.put("outcome", c1711a.name());
        }
        this.f5166a.mo1365j(str, hashMap);
    }

    @TargetApi(14)
    /* renamed from: a */
    public void m6478a() {
        m6477a(this.f5170e, this.f5169d, System.currentTimeMillis(), this.f5171f);
        if (this.f5167b != null && this.f5168c != null) {
            this.f5167b.unregisterActivityLifecycleCallbacks(this.f5168c);
            this.f5168c = null;
            this.f5167b = null;
        }
    }

    /* renamed from: a */
    public void m6479a(C1711a c1711a) {
        this.f5171f = c1711a;
    }

    @TargetApi(14)
    /* renamed from: a */
    public void m6480a(String str) {
        this.f5170e = str;
        if (this.f5168c == null || this.f5167b == null) {
            m6477a(str, -1, -1, C1711a.CANNOT_TRACK);
            return;
        }
        this.f5169d = System.currentTimeMillis();
        this.f5167b.registerActivityLifecycleCallbacks(this.f5168c);
    }
}
