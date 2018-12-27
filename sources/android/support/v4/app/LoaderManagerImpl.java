package android.support.v4.app;

import android.arch.lifecycle.C0023f;
import android.arch.lifecycle.C0028l;
import android.arch.lifecycle.C0035q;
import android.arch.lifecycle.C0037r;
import android.arch.lifecycle.C0037r.C0036a;
import android.arch.lifecycle.C0038s;
import android.arch.lifecycle.C3006k;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.content.C0392c;
import android.support.v4.content.C0392c.C0391b;
import android.support.v4.p017f.C0418d;
import android.support.v4.p017f.C0434n;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class LoaderManagerImpl extends C0363u {
    /* renamed from: a */
    static boolean f13111a = false;
    /* renamed from: b */
    private final C0023f f13112b;
    /* renamed from: c */
    private final LoaderViewModel f13113c;
    /* renamed from: d */
    private boolean f13114d;

    static class LoaderViewModel extends C0035q {
        /* renamed from: a */
        private static final C0036a f13106a = new C31021();
        /* renamed from: b */
        private C0434n<C4430a> f13107b = new C0434n();

        /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel$1 */
        static class C31021 implements C0036a {
            C31021() {
            }

            /* renamed from: a */
            public <T extends C0035q> T mo261a(Class<T> cls) {
                return new LoaderViewModel();
            }
        }

        LoaderViewModel() {
        }

        /* renamed from: a */
        static LoaderViewModel m15316a(C0038s c0038s) {
            return (LoaderViewModel) new C0037r(c0038s, f13106a).m92a(LoaderViewModel.class);
        }

        /* renamed from: a */
        void m15319a(int i, C4430a c4430a) {
            this.f13107b.m1594b(i, c4430a);
        }

        /* renamed from: a */
        <D> C4430a<D> m15317a(int i) {
            return (C4430a) this.f13107b.m1590a(i);
        }

        /* renamed from: b */
        void m15322b(int i) {
            this.f13107b.m1596c(i);
        }

        /* renamed from: b */
        void m15321b() {
            int b = this.f13107b.m1592b();
            for (int i = 0; i < b; i++) {
                ((C4430a) this.f13107b.m1600f(i)).m24253g();
            }
        }

        /* renamed from: a */
        protected void mo262a() {
            super.mo262a();
            int b = this.f13107b.m1592b();
            for (int i = 0; i < b; i++) {
                ((C4430a) this.f13107b.m1600f(i)).m24245a(true);
            }
            this.f13107b.m1595c();
        }

        /* renamed from: a */
        public void m15320a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f13107b.m1592b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("    ");
                String stringBuilder2 = stringBuilder.toString();
                for (int i = 0; i < this.f13107b.m1592b(); i++) {
                    C4430a c4430a = (C4430a) this.f13107b.m1600f(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f13107b.m1599e(i));
                    printWriter.print(": ");
                    printWriter.println(c4430a.toString());
                    c4430a.m24248a(stringBuilder2, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$b */
    static class C3103b<D> implements C0028l<D> {
        /* renamed from: a */
        private final C0392c<D> f13108a;
        /* renamed from: b */
        private final C0362a<D> f13109b;
        /* renamed from: c */
        private boolean f13110c = false;

        C3103b(C0392c<D> c0392c, C0362a<D> c0362a) {
            this.f13108a = c0392c;
            this.f13109b = c0362a;
        }

        /* renamed from: a */
        public void mo263a(D d) {
            if (LoaderManagerImpl.f13111a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  onLoadFinished in ");
                stringBuilder.append(this.f13108a);
                stringBuilder.append(": ");
                stringBuilder.append(this.f13108a.m1448c(d));
                Log.v("LoaderManager", stringBuilder.toString());
            }
            this.f13109b.mo1160a(this.f13108a, (Object) d);
            this.f13110c = true;
        }

        /* renamed from: a */
        boolean m15325a() {
            return this.f13110c;
        }

        /* renamed from: b */
        void m15326b() {
            if (this.f13110c) {
                if (LoaderManagerImpl.f13111a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("  Resetting: ");
                    stringBuilder.append(this.f13108a);
                    Log.v("LoaderManager", stringBuilder.toString());
                }
                this.f13109b.mo1159a(this.f13108a);
            }
        }

        public String toString() {
            return this.f13109b.toString();
        }

        /* renamed from: a */
        public void m15324a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f13110c);
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$a */
    public static class C4430a<D> extends C3006k<D> implements C0391b<D> {
        /* renamed from: a */
        private final int f18409a;
        /* renamed from: b */
        private final Bundle f18410b;
        /* renamed from: c */
        private final C0392c<D> f18411c;
        /* renamed from: d */
        private C0023f f18412d;
        /* renamed from: e */
        private C3103b<D> f18413e;
        /* renamed from: f */
        private C0392c<D> f18414f;

        C4430a(int i, Bundle bundle, C0392c<D> c0392c, C0392c<D> c0392c2) {
            this.f18409a = i;
            this.f18410b = bundle;
            this.f18411c = c0392c;
            this.f18414f = c0392c2;
            this.f18411c.m1443a(i, this);
        }

        /* renamed from: f */
        C0392c<D> m24252f() {
            return this.f18411c;
        }

        /* renamed from: b */
        protected void mo3754b() {
            if (LoaderManagerImpl.f13111a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Starting: ");
                stringBuilder.append(this);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            this.f18411c.m1452j();
        }

        /* renamed from: c */
        protected void mo3755c() {
            if (LoaderManagerImpl.f13111a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Stopping: ");
                stringBuilder.append(this);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            this.f18411c.m1456n();
        }

        /* renamed from: a */
        C0392c<D> m24244a(C0023f c0023f, C0362a<D> c0362a) {
            Object c3103b = new C3103b(this.f18411c, c0362a);
            m41a(c0023f, (C0028l) c3103b);
            if (this.f18413e != null) {
                mo3752a(this.f18413e);
            }
            this.f18412d = c0023f;
            this.f18413e = c3103b;
            return this.f18411c;
        }

        /* renamed from: g */
        void m24253g() {
            C0023f c0023f = this.f18412d;
            C0028l c0028l = this.f18413e;
            if (c0023f != null && c0028l != null) {
                super.mo3752a(c0028l);
                m41a(c0023f, c0028l);
            }
        }

        /* renamed from: a */
        public void mo3752a(C0028l<D> c0028l) {
            super.mo3752a((C0028l) c0028l);
            this.f18412d = null;
            this.f18413e = null;
        }

        /* renamed from: a */
        C0392c<D> m24245a(boolean z) {
            if (LoaderManagerImpl.f13111a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Destroying: ");
                stringBuilder.append(this);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            this.f18411c.m1454l();
            this.f18411c.m1458p();
            C0028l c0028l = this.f18413e;
            if (c0028l != null) {
                mo3752a(c0028l);
                if (z) {
                    c0028l.m15326b();
                }
            }
            this.f18411c.m1444a(this);
            if ((c0028l == null || c0028l.m15325a()) && !z) {
                return this.f18411c;
            }
            this.f18411c.m1460r();
            return this.f18414f;
        }

        /* renamed from: a */
        public void mo3753a(C0392c<D> c0392c, D d) {
            if (LoaderManagerImpl.f13111a != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onLoadComplete: ");
                stringBuilder.append(this);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo19b(d);
                return;
            }
            if (LoaderManagerImpl.f13111a != null) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo18a(d);
        }

        /* renamed from: b */
        public void mo19b(D d) {
            super.mo19b(d);
            if (this.f18414f != null) {
                this.f18414f.m1460r();
                this.f18414f = null;
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("LoaderInfo{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" #");
            stringBuilder.append(this.f18409a);
            stringBuilder.append(" : ");
            C0418d.m1535a(this.f18411c, stringBuilder);
            stringBuilder.append("}}");
            return stringBuilder.toString();
        }

        /* renamed from: a */
        public void m24248a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f18409a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f18410b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f18411c);
            C0392c c0392c = this.f18411c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("  ");
            c0392c.mo324a(stringBuilder.toString(), fileDescriptor, printWriter, strArr);
            if (this.f18413e != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f18413e);
                fileDescriptor = this.f18413e;
                strArr = new StringBuilder();
                strArr.append(str);
                strArr.append("  ");
                fileDescriptor.m15324a(strArr.toString(), printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m24252f().m1448c(m40a()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m47d());
        }
    }

    LoaderManagerImpl(C0023f c0023f, C0038s c0038s) {
        this.f13112b = c0023f;
        this.f13113c = LoaderViewModel.m15316a(c0038s);
    }

    /* renamed from: a */
    private <D> C0392c<D> m15327a(int i, Bundle bundle, C0362a<D> c0362a, C0392c<D> c0392c) {
        try {
            this.f13114d = true;
            C0392c a = c0362a.mo1158a(i, bundle);
            if (a.getClass().isMemberClass()) {
                if (!Modifier.isStatic(a.getClass().getModifiers())) {
                    bundle = new StringBuilder();
                    bundle.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                    bundle.append(a);
                    throw new IllegalArgumentException(bundle.toString());
                }
            }
            C4430a c4430a = new C4430a(i, bundle, a, c0392c);
            if (f13111a != null) {
                c0392c = new StringBuilder();
                c0392c.append("  Created new loader ");
                c0392c.append(c4430a);
                Log.v("LoaderManager", c0392c.toString());
            }
            this.f13113c.m15319a(i, c4430a);
            return c4430a.m24244a(this.f13112b, (C0362a) c0362a);
        } finally {
            this.f13114d = false;
        }
    }

    /* renamed from: a */
    public <D> C0392c<D> mo264a(int i, Bundle bundle, C0362a<D> c0362a) {
        if (this.f13114d) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f13111a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("restartLoader in ");
                stringBuilder.append(this);
                stringBuilder.append(": args=");
                stringBuilder.append(bundle);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            C4430a a = this.f13113c.m15317a(i);
            C0392c c0392c = null;
            if (a != null) {
                c0392c = a.m24245a(false);
            }
            return m15327a(i, bundle, (C0362a) c0362a, c0392c);
        } else {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
    }

    /* renamed from: a */
    public void mo265a(int i) {
        if (this.f13114d) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f13111a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("destroyLoader in ");
                stringBuilder.append(this);
                stringBuilder.append(" of ");
                stringBuilder.append(i);
                Log.v("LoaderManager", stringBuilder.toString());
            }
            C4430a a = this.f13113c.m15317a(i);
            if (a != null) {
                a.m24245a(true);
                this.f13113c.m15322b(i);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    /* renamed from: a */
    void m15329a() {
        this.f13113c.m15321b();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        C0418d.m1535a(this.f13112b, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void mo266a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f13113c.m15320a(str, fileDescriptor, printWriter, strArr);
    }
}
