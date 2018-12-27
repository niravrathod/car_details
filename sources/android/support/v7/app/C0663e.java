package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.C3199a.C0657a;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

/* renamed from: android.support.v7.app.e */
public abstract class C0663e {
    /* renamed from: a */
    private static int f2150a = -1;
    /* renamed from: b */
    private static boolean f2151b = false;

    /* renamed from: a */
    public abstract ActionBar mo512a();

    /* renamed from: a */
    public abstract <T extends View> T mo3797a(int i);

    /* renamed from: a */
    public abstract void mo3799a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo3800a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo3801a(Toolbar toolbar);

    /* renamed from: a */
    public abstract void mo3802a(View view);

    /* renamed from: a */
    public abstract void mo3803a(View view, LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo513a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo514b();

    /* renamed from: b */
    public abstract void mo3806b(int i);

    /* renamed from: b */
    public abstract void mo3807b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo3808b(View view, LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo515c();

    /* renamed from: c */
    public abstract void mo516c(Bundle bundle);

    /* renamed from: c */
    public abstract boolean mo3811c(int i);

    /* renamed from: d */
    public abstract void mo517d();

    /* renamed from: e */
    public abstract void mo3812e();

    /* renamed from: f */
    public abstract void mo3813f();

    /* renamed from: g */
    public abstract void mo518g();

    /* renamed from: h */
    public abstract C0657a mo519h();

    /* renamed from: i */
    public abstract void mo3814i();

    /* renamed from: j */
    public abstract boolean mo520j();

    /* renamed from: a */
    public static C0663e m2650a(Activity activity, C0662d c0662d) {
        return C0663e.m2652a(activity, activity.getWindow(), c0662d);
    }

    /* renamed from: a */
    public static C0663e m2651a(Dialog dialog, C0662d c0662d) {
        return C0663e.m2652a(dialog.getContext(), dialog.getWindow(), c0662d);
    }

    /* renamed from: a */
    private static C0663e m2652a(Context context, Window window, C0662d c0662d) {
        if (VERSION.SDK_INT >= 24) {
            return new C4871g(context, window, c0662d);
        }
        if (VERSION.SDK_INT >= 23) {
            return new C4845i(context, window, c0662d);
        }
        return new C4766h(context, window, c0662d);
    }

    C0663e() {
    }

    /* renamed from: k */
    public static int m2653k() {
        return f2150a;
    }

    /* renamed from: l */
    public static boolean m2654l() {
        return f2151b;
    }
}
