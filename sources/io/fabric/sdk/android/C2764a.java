package io.fabric.sdk.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: io.fabric.sdk.android.a */
public class C2764a {
    /* renamed from: a */
    private final Application f11795a;
    /* renamed from: b */
    private C2762a f11796b;

    /* renamed from: io.fabric.sdk.android.a$a */
    private static class C2762a {
        /* renamed from: a */
        private final Set<ActivityLifecycleCallbacks> f11793a = new HashSet();
        /* renamed from: b */
        private final Application f11794b;

        C2762a(Application application) {
            this.f11794b = application;
        }

        @TargetApi(14)
        /* renamed from: a */
        private void m13498a() {
            for (ActivityLifecycleCallbacks unregisterActivityLifecycleCallbacks : this.f11793a) {
                this.f11794b.unregisterActivityLifecycleCallbacks(unregisterActivityLifecycleCallbacks);
            }
        }

        @TargetApi(14)
        /* renamed from: a */
        private boolean m13501a(final C2763b c2763b) {
            if (this.f11794b == null) {
                return null;
            }
            ActivityLifecycleCallbacks c27611 = new ActivityLifecycleCallbacks(this) {
                /* renamed from: b */
                final /* synthetic */ C2762a f11792b;

                public void onActivityCreated(Activity activity, Bundle bundle) {
                    c2763b.mo1103a(activity, bundle);
                }

                public void onActivityStarted(Activity activity) {
                    c2763b.mo1102a(activity);
                }

                public void onActivityResumed(Activity activity) {
                    c2763b.mo1104b(activity);
                }

                public void onActivityPaused(Activity activity) {
                    c2763b.mo1106c(activity);
                }

                public void onActivityStopped(Activity activity) {
                    c2763b.mo1107d(activity);
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    c2763b.mo1105b(activity, bundle);
                }

                public void onActivityDestroyed(Activity activity) {
                    c2763b.mo1108e(activity);
                }
            };
            this.f11794b.registerActivityLifecycleCallbacks(c27611);
            this.f11793a.add(c27611);
            return true;
        }
    }

    /* renamed from: io.fabric.sdk.android.a$b */
    public static abstract class C2763b {
        /* renamed from: a */
        public void mo1102a(Activity activity) {
        }

        /* renamed from: a */
        public void mo1103a(Activity activity, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo1104b(Activity activity) {
        }

        /* renamed from: b */
        public void mo1105b(Activity activity, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo1106c(Activity activity) {
        }

        /* renamed from: d */
        public void mo1107d(Activity activity) {
        }

        /* renamed from: e */
        public void mo1108e(Activity activity) {
        }
    }

    public C2764a(Context context) {
        this.f11795a = (Application) context.getApplicationContext();
        if (VERSION.SDK_INT >= 14) {
            this.f11796b = new C2762a(this.f11795a);
        }
    }

    /* renamed from: a */
    public boolean m13510a(C2763b c2763b) {
        return (this.f11796b == null || this.f11796b.m13501a(c2763b) == null) ? null : true;
    }

    /* renamed from: a */
    public void m13509a() {
        if (this.f11796b != null) {
            this.f11796b.m13498a();
        }
    }
}
