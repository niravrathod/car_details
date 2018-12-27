package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.k */
public abstract class C3107k<E> extends C0329i {
    /* renamed from: a */
    private final Activity f13139a;
    /* renamed from: b */
    final Context f13140b;
    /* renamed from: c */
    final int f13141c;
    /* renamed from: d */
    final C3112m f13142d;
    /* renamed from: e */
    private final Handler f13143e;

    /* renamed from: a */
    public View mo259a(int i) {
        return null;
    }

    /* renamed from: a */
    public void mo3742a(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: a */
    public void mo3743a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: a */
    public boolean mo260a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo3744a(Fragment fragment) {
        return true;
    }

    /* renamed from: a */
    public boolean mo3745a(String str) {
        return false;
    }

    /* renamed from: b */
    void mo3747b(Fragment fragment) {
    }

    /* renamed from: d */
    public void mo3748d() {
    }

    /* renamed from: e */
    public boolean mo3749e() {
        return true;
    }

    /* renamed from: g */
    public abstract E mo3751g();

    C3107k(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, fragmentActivity.f21460c, 0);
    }

    C3107k(Activity activity, Context context, Handler handler, int i) {
        this.f13142d = new C3112m();
        this.f13139a = activity;
        this.f13140b = context;
        this.f13143e = handler;
        this.f13141c = i;
    }

    /* renamed from: b */
    public LayoutInflater mo3746b() {
        return LayoutInflater.from(this.f13140b);
    }

    /* renamed from: a */
    public void mo3740a(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f13140b.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: a */
    public void mo3741a(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            C3104a.m15336a(this.f13139a, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            C3107k c3107k = this;
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }

    /* renamed from: f */
    public int mo3750f() {
        return this.f13141c;
    }

    /* renamed from: h */
    Activity m15389h() {
        return this.f13139a;
    }

    /* renamed from: i */
    Context m15390i() {
        return this.f13140b;
    }

    /* renamed from: j */
    Handler m15391j() {
        return this.f13143e;
    }

    /* renamed from: k */
    C3112m m15392k() {
        return this.f13142d;
    }
}
