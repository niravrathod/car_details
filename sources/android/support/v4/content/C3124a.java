package android.support.v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.p017f.C0435o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: android.support.v4.content.a */
public abstract class C3124a<D> extends C0392c<D> {
    /* renamed from: a */
    volatile C3121a f13218a;
    /* renamed from: b */
    volatile C3121a f13219b;
    /* renamed from: c */
    long f13220c;
    /* renamed from: d */
    long f13221d;
    /* renamed from: e */
    Handler f13222e;
    /* renamed from: o */
    private final Executor f13223o;

    /* renamed from: android.support.v4.content.a$a */
    final class C3121a extends ModernAsyncTask<Void, Void, D> implements Runnable {
        /* renamed from: a */
        boolean f13211a;
        /* renamed from: b */
        final /* synthetic */ C3124a f13212b;
        /* renamed from: d */
        private final CountDownLatch f13213d = new CountDownLatch(1);

        C3121a(C3124a c3124a) {
            this.f13212b = c3124a;
        }

        /* renamed from: a */
        protected D m15573a(Void... voidArr) {
            try {
                return this.f13212b.m15588e();
            } catch (Void[] voidArr2) {
                if (m1397c()) {
                    return null;
                }
                throw voidArr2;
            }
        }

        /* renamed from: a */
        protected void mo321a(D d) {
            try {
                this.f13212b.m15584b(this, d);
            } finally {
                this.f13213d.countDown();
            }
        }

        /* renamed from: b */
        protected void mo322b(D d) {
            try {
                this.f13212b.m15581a(this, d);
            } finally {
                this.f13213d.countDown();
            }
        }

        public void run() {
            this.f13211a = false;
            this.f13212b.m15586c();
        }
    }

    /* renamed from: a */
    public void m15582a(D d) {
    }

    /* renamed from: d */
    public abstract D mo3929d();

    /* renamed from: f */
    public void m15589f() {
    }

    public C3124a(Context context) {
        this(context, ModernAsyncTask.f1310c);
    }

    private C3124a(Context context, Executor executor) {
        super(context);
        this.f13221d = -10000;
        this.f13223o = executor;
    }

    /* renamed from: a */
    protected void mo323a() {
        super.mo323a();
        m1454l();
        this.f13218a = new C3121a(this);
        m15586c();
    }

    /* renamed from: b */
    protected boolean mo325b() {
        if (this.f13218a == null) {
            return false;
        }
        if (!this.j) {
            this.m = true;
        }
        if (this.f13219b != null) {
            if (this.f13218a.f13211a) {
                this.f13218a.f13211a = false;
                this.f13222e.removeCallbacks(this.f13218a);
            }
            this.f13218a = null;
            return false;
        } else if (this.f13218a.f13211a) {
            this.f13218a.f13211a = false;
            this.f13222e.removeCallbacks(this.f13218a);
            this.f13218a = null;
            return false;
        } else {
            boolean a = this.f13218a.m1392a(false);
            if (a) {
                this.f13219b = this.f13218a;
                m15589f();
            }
            this.f13218a = null;
            return a;
        }
    }

    /* renamed from: c */
    void m15586c() {
        if (this.f13219b == null && this.f13218a != null) {
            if (this.f13218a.f13211a) {
                this.f13218a.f13211a = false;
                this.f13222e.removeCallbacks(this.f13218a);
            }
            if (this.f13220c <= 0 || SystemClock.uptimeMillis() >= this.f13221d + this.f13220c) {
                this.f13218a.m1388a(this.f13223o, (Void[]) null);
            } else {
                this.f13218a.f13211a = true;
                this.f13222e.postAtTime(this.f13218a, this.f13221d + this.f13220c);
            }
        }
    }

    /* renamed from: a */
    void m15581a(C3121a c3121a, D d) {
        m15582a(d);
        if (this.f13219b == c3121a) {
            m1463u();
            this.f13221d = SystemClock.uptimeMillis();
            this.f13219b = null;
            m1449g();
            m15586c();
        }
    }

    /* renamed from: b */
    void m15584b(C3121a c3121a, D d) {
        if (this.f13218a != c3121a) {
            m15581a(c3121a, d);
        } else if (m1451i() != null) {
            m15582a(d);
        } else {
            m1462t();
            this.f13221d = SystemClock.uptimeMillis();
            this.f13218a = null;
            m1446b(d);
        }
    }

    /* renamed from: e */
    protected D m15588e() {
        return mo3929d();
    }

    /* renamed from: a */
    public void mo324a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo324a(str, fileDescriptor, printWriter, strArr);
        if (this.f13218a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f13218a);
            printWriter.print(" waiting=");
            printWriter.println(this.f13218a.f13211a);
        }
        if (this.f13219b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f13219b);
            printWriter.print(" waiting=");
            printWriter.println(this.f13219b.f13211a);
        }
        if (this.f13220c != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0435o.m1606a(this.f13220c, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0435o.m1605a(this.f13221d, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
