package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment.SavedState;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: android.support.v4.app.l */
public abstract class C0334l {

    /* renamed from: android.support.v4.app.l$a */
    public interface C0331a {
        /* renamed from: i */
        String mo284i();
    }

    /* renamed from: android.support.v4.app.l$b */
    public static abstract class C0332b {
        /* renamed from: a */
        public void mo12a(C0334l c0334l, Fragment fragment) {
        }

        /* renamed from: a */
        public void m1204a(C0334l c0334l, Fragment fragment, Context context) {
        }

        /* renamed from: a */
        public void mo13a(C0334l c0334l, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: a */
        public void m1206a(C0334l c0334l, Fragment fragment, View view, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo14b(C0334l c0334l, Fragment fragment) {
        }

        /* renamed from: b */
        public void m1208b(C0334l c0334l, Fragment fragment, Context context) {
        }

        /* renamed from: b */
        public void m1209b(C0334l c0334l, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: c */
        public void m1210c(C0334l c0334l, Fragment fragment) {
        }

        /* renamed from: c */
        public void m1211c(C0334l c0334l, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: d */
        public void m1212d(C0334l c0334l, Fragment fragment) {
        }

        /* renamed from: d */
        public void m1213d(C0334l c0334l, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: e */
        public void m1214e(C0334l c0334l, Fragment fragment) {
        }

        /* renamed from: f */
        public void m1215f(C0334l c0334l, Fragment fragment) {
        }

        /* renamed from: g */
        public void m1216g(C0334l c0334l, Fragment fragment) {
        }
    }

    /* renamed from: android.support.v4.app.l$c */
    public interface C0333c {
        /* renamed from: a */
        void mo857a();
    }

    /* renamed from: a */
    public abstract SavedState mo288a(Fragment fragment);

    /* renamed from: a */
    public abstract Fragment mo289a(int i);

    /* renamed from: a */
    public abstract Fragment mo290a(Bundle bundle, String str);

    /* renamed from: a */
    public abstract Fragment mo291a(String str);

    /* renamed from: a */
    public abstract C0347q mo292a();

    /* renamed from: a */
    public abstract void mo293a(int i, int i2);

    /* renamed from: a */
    public abstract void mo294a(Bundle bundle, String str, Fragment fragment);

    /* renamed from: a */
    public abstract void mo295a(C0332b c0332b, boolean z);

    /* renamed from: a */
    public abstract void mo296a(C0333c c0333c);

    /* renamed from: a */
    public abstract void mo297a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract C0331a mo298b(int i);

    /* renamed from: b */
    public abstract void mo299b(C0333c c0333c);

    /* renamed from: b */
    public abstract boolean mo300b();

    /* renamed from: c */
    public abstract void mo301c();

    /* renamed from: d */
    public abstract boolean mo302d();

    /* renamed from: e */
    public abstract int mo303e();

    /* renamed from: f */
    public abstract List<Fragment> mo304f();

    /* renamed from: g */
    public abstract boolean mo305g();

    /* renamed from: h */
    public abstract Fragment mo306h();

    /* renamed from: i */
    public abstract boolean mo307i();
}
