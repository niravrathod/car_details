package com.bumptech.glide.p052c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.C0334l;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.p017f.C3131a;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.C1143c;
import com.bumptech.glide.C3377g;
import com.bumptech.glide.p055g.C1180j;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.c.l */
public class C1140l implements Callback {
    /* renamed from: i */
    private static final C1139a f3725i = new C33641();
    /* renamed from: a */
    final Map<FragmentManager, C1138k> f3726a = new HashMap();
    /* renamed from: b */
    final Map<C0334l, C4505o> f3727b = new HashMap();
    /* renamed from: c */
    private volatile C3377g f3728c;
    /* renamed from: d */
    private final Handler f3729d;
    /* renamed from: e */
    private final C1139a f3730e;
    /* renamed from: f */
    private final C3131a<View, Fragment> f3731f = new C3131a();
    /* renamed from: g */
    private final C3131a<View, android.app.Fragment> f3732g = new C3131a();
    /* renamed from: h */
    private final Bundle f3733h = new Bundle();

    /* renamed from: com.bumptech.glide.c.l$a */
    public interface C1139a {
        /* renamed from: a */
        C3377g mo945a(C1143c c1143c, C1136h c1136h, C1141m c1141m, Context context);
    }

    /* renamed from: com.bumptech.glide.c.l$1 */
    class C33641 implements C1139a {
        C33641() {
        }

        /* renamed from: a */
        public C3377g mo945a(C1143c c1143c, C1136h c1136h, C1141m c1141m, Context context) {
            return new C3377g(c1143c, c1136h, c1141m, context);
        }
    }

    public C1140l(C1139a c1139a) {
        if (c1139a == null) {
            c1139a = f3725i;
        }
        this.f3730e = c1139a;
        this.f3729d = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: b */
    private C3377g m4753b(Context context) {
        if (this.f3728c == null) {
            synchronized (this) {
                if (this.f3728c == null) {
                    this.f3728c = this.f3730e.mo945a(C1143c.m4768a(context.getApplicationContext()), new C3359b(), new C3362g(), context.getApplicationContext());
                }
            }
        }
        return this.f3728c;
    }

    /* renamed from: a */
    public C3377g m4757a(Context context) {
        if (context != null) {
            if (C1180j.m4901b() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return m4758a((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return m4756a((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    return m4757a(((ContextWrapper) context).getBaseContext());
                }
            }
            return m4753b(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: a */
    public C3377g m4758a(FragmentActivity fragmentActivity) {
        if (C1180j.m4903c()) {
            return m4757a(fragmentActivity.getApplicationContext());
        }
        C1140l.m4754c(fragmentActivity);
        return m4752a((Context) fragmentActivity, fragmentActivity.m28707f(), null, C1140l.m4755d(fragmentActivity));
    }

    /* renamed from: a */
    public C3377g m4756a(Activity activity) {
        if (C1180j.m4903c()) {
            return m4757a(activity.getApplicationContext());
        }
        C1140l.m4754c(activity);
        return m4751a((Context) activity, activity.getFragmentManager(), null, C1140l.m4755d(activity));
    }

    @TargetApi(17)
    /* renamed from: c */
    private static void m4754c(Activity activity) {
        if (VERSION.SDK_INT < 17) {
            return;
        }
        if (activity.isDestroyed() != null) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    @Deprecated
    /* renamed from: b */
    C1138k m4759b(Activity activity) {
        return m4749a(activity.getFragmentManager(), null, C1140l.m4755d(activity));
    }

    /* renamed from: a */
    private C1138k m4749a(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        C1138k c1138k = (C1138k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (c1138k == null) {
            c1138k = (C1138k) this.f3726a.get(fragmentManager);
            if (c1138k == null) {
                c1138k = new C1138k();
                c1138k.m4744a(fragment);
                if (z) {
                    c1138k.m4743a().m17254a();
                }
                this.f3726a.put(fragmentManager, c1138k);
                fragmentManager.beginTransaction().add(c1138k, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f3729d.obtainMessage(true, fragmentManager).sendToTarget();
            }
        }
        return c1138k;
    }

    @Deprecated
    /* renamed from: a */
    private C3377g m4751a(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        fragmentManager = m4749a(fragmentManager, fragment, z);
        fragment = fragmentManager.m4746b();
        if (fragment != null) {
            return fragment;
        }
        C3377g a = this.f3730e.mo945a(C1143c.m4768a(context), fragmentManager.m4743a(), fragmentManager.m4747c(), context);
        fragmentManager.m4745a(a);
        return a;
    }

    /* renamed from: b */
    C4505o m4760b(FragmentActivity fragmentActivity) {
        return m4750a(fragmentActivity.m28707f(), null, C1140l.m4755d(fragmentActivity));
    }

    /* renamed from: d */
    private static boolean m4755d(Activity activity) {
        return activity.isFinishing() ^ 1;
    }

    /* renamed from: a */
    private C4505o m4750a(C0334l c0334l, Fragment fragment, boolean z) {
        C4505o c4505o = (C4505o) c0334l.mo291a("com.bumptech.glide.manager");
        if (c4505o == null) {
            c4505o = (C4505o) this.f3727b.get(c0334l);
            if (c4505o == null) {
                c4505o = new C4505o();
                c4505o.m24922a(fragment);
                if (z) {
                    c4505o.m24921a().m17254a();
                }
                this.f3727b.put(c0334l, c4505o);
                c0334l.mo292a().mo271a((Fragment) c4505o, "com.bumptech.glide.manager").mo280d();
                this.f3729d.obtainMessage(true, c0334l).sendToTarget();
            }
        }
        return c4505o;
    }

    /* renamed from: a */
    private C3377g m4752a(Context context, C0334l c0334l, Fragment fragment, boolean z) {
        c0334l = m4750a(c0334l, fragment, z);
        fragment = c0334l.m24924b();
        if (fragment != null) {
            return fragment;
        }
        C3377g a = this.f3730e.mo945a(C1143c.m4768a(context), c0334l.m24921a(), c0334l.m24925c(), context);
        c0334l.m24923a(a);
        return a;
    }

    public boolean handleMessage(Message message) {
        Object obj = null;
        boolean z = true;
        switch (message.what) {
            case 1:
                obj = (FragmentManager) message.obj;
                message = this.f3726a.remove(obj);
                break;
            case 2:
                obj = (C0334l) message.obj;
                message = this.f3727b.remove(obj);
                break;
            default:
                z = false;
                message = null;
                break;
        }
        if (z && r5 == null && Log.isLoggable("RMRetriever", 5) != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to remove expected request manager fragment, manager: ");
            stringBuilder.append(obj);
            Log.w("RMRetriever", stringBuilder.toString());
        }
        return z;
    }
}
