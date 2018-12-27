package android.support.design.widget;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* renamed from: android.support.design.widget.k */
class C0215k {
    /* renamed from: a */
    private static C0215k f823a;
    /* renamed from: b */
    private final Object f824b = new Object();
    /* renamed from: c */
    private final Handler f825c = new Handler(Looper.getMainLooper(), new C02121(this));
    /* renamed from: d */
    private C0214b f826d;
    /* renamed from: e */
    private C0214b f827e;

    /* renamed from: android.support.design.widget.k$1 */
    class C02121 implements Callback {
        /* renamed from: a */
        final /* synthetic */ C0215k f819a;

        C02121(C0215k c0215k) {
            this.f819a = c0215k;
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return null;
            }
            this.f819a.m797a((C0214b) message.obj);
            return true;
        }
    }

    /* renamed from: android.support.design.widget.k$a */
    interface C0213a {
        /* renamed from: a */
        void mo145a();

        /* renamed from: a */
        void mo146a(int i);
    }

    /* renamed from: android.support.design.widget.k$b */
    private static class C0214b {
        /* renamed from: a */
        final WeakReference<C0213a> f820a;
        /* renamed from: b */
        int f821b;
        /* renamed from: c */
        boolean f822c;

        C0214b(int i, C0213a c0213a) {
            this.f820a = new WeakReference(c0213a);
            this.f821b = i;
        }

        /* renamed from: a */
        boolean m787a(C0213a c0213a) {
            return (c0213a == null || this.f820a.get() != c0213a) ? null : true;
        }
    }

    /* renamed from: a */
    static C0215k m788a() {
        if (f823a == null) {
            f823a = new C0215k();
        }
        return f823a;
    }

    private C0215k() {
    }

    /* renamed from: a */
    public void m794a(int i, C0213a c0213a) {
        synchronized (this.f824b) {
            if (m792f(c0213a)) {
                this.f826d.f821b = i;
                this.f825c.removeCallbacksAndMessages(this.f826d);
                m791b(this.f826d);
                return;
            }
            if (m793g(c0213a)) {
                this.f827e.f821b = i;
            } else {
                this.f827e = new C0214b(i, c0213a);
            }
            if (this.f826d == 0 || m789a(this.f826d, 4) == 0) {
                this.f826d = 0;
                m790b();
                return;
            }
        }
    }

    /* renamed from: a */
    public void m796a(C0213a c0213a, int i) {
        synchronized (this.f824b) {
            if (m792f(c0213a)) {
                m789a(this.f826d, i);
            } else if (m793g(c0213a) != null) {
                m789a(this.f827e, i);
            }
        }
    }

    /* renamed from: a */
    public void m795a(C0213a c0213a) {
        synchronized (this.f824b) {
            if (m792f(c0213a) != null) {
                this.f826d = null;
                if (this.f827e != null) {
                    m790b();
                }
            }
        }
    }

    /* renamed from: b */
    public void m798b(C0213a c0213a) {
        synchronized (this.f824b) {
            if (m792f(c0213a) != null) {
                m791b(this.f826d);
            }
        }
    }

    /* renamed from: c */
    public void m799c(C0213a c0213a) {
        synchronized (this.f824b) {
            if (m792f(c0213a) != null && this.f826d.f822c == null) {
                this.f826d.f822c = true;
                this.f825c.removeCallbacksAndMessages(this.f826d);
            }
        }
    }

    /* renamed from: d */
    public void m800d(C0213a c0213a) {
        synchronized (this.f824b) {
            if (!(m792f(c0213a) == null || this.f826d.f822c == null)) {
                this.f826d.f822c = false;
                m791b(this.f826d);
            }
        }
    }

    /* renamed from: e */
    public boolean m801e(C0213a c0213a) {
        synchronized (this.f824b) {
            if (!m792f(c0213a)) {
                if (m793g(c0213a) == null) {
                    c0213a = null;
                }
            }
            c0213a = true;
        }
        return c0213a;
    }

    /* renamed from: b */
    private void m790b() {
        if (this.f827e != null) {
            this.f826d = this.f827e;
            this.f827e = null;
            C0213a c0213a = (C0213a) this.f826d.f820a.get();
            if (c0213a != null) {
                c0213a.mo145a();
            } else {
                this.f826d = null;
            }
        }
    }

    /* renamed from: a */
    private boolean m789a(C0214b c0214b, int i) {
        C0213a c0213a = (C0213a) c0214b.f820a.get();
        if (c0213a == null) {
            return null;
        }
        this.f825c.removeCallbacksAndMessages(c0214b);
        c0213a.mo146a(i);
        return true;
    }

    /* renamed from: f */
    private boolean m792f(C0213a c0213a) {
        return (this.f826d == null || this.f826d.m787a(c0213a) == null) ? null : true;
    }

    /* renamed from: g */
    private boolean m793g(C0213a c0213a) {
        return (this.f827e == null || this.f827e.m787a(c0213a) == null) ? null : true;
    }

    /* renamed from: b */
    private void m791b(C0214b c0214b) {
        if (c0214b.f821b != -2) {
            int i = 2750;
            if (c0214b.f821b > 0) {
                i = c0214b.f821b;
            } else if (c0214b.f821b == -1) {
                i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            }
            this.f825c.removeCallbacksAndMessages(c0214b);
            this.f825c.sendMessageDelayed(Message.obtain(this.f825c, 0, c0214b), (long) i);
        }
    }

    /* renamed from: a */
    void m797a(C0214b c0214b) {
        synchronized (this.f824b) {
            if (this.f826d == c0214b || this.f827e == c0214b) {
                m789a(c0214b, 2);
            }
        }
    }
}
