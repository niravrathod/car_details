package android.support.v4.content;

import android.content.Context;
import android.support.v4.p017f.C0418d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.content.c */
public class C0392c<D> {
    /* renamed from: f */
    int f1330f;
    /* renamed from: g */
    C0391b<D> f1331g;
    /* renamed from: h */
    C0390a<D> f1332h;
    /* renamed from: i */
    Context f1333i;
    /* renamed from: j */
    boolean f1334j = false;
    /* renamed from: k */
    boolean f1335k = false;
    /* renamed from: l */
    boolean f1336l = true;
    /* renamed from: m */
    boolean f1337m = false;
    /* renamed from: n */
    boolean f1338n = false;

    /* renamed from: android.support.v4.content.c$a */
    public interface C0390a<D> {
        /* renamed from: a */
        void m1440a(C0392c<D> c0392c);
    }

    /* renamed from: android.support.v4.content.c$b */
    public interface C0391b<D> {
        /* renamed from: a */
        void mo3753a(C0392c<D> c0392c, D d);
    }

    /* renamed from: a */
    protected void mo323a() {
    }

    /* renamed from: b */
    protected boolean mo325b() {
        return false;
    }

    /* renamed from: k */
    protected void m1453k() {
    }

    /* renamed from: o */
    protected void m1457o() {
    }

    /* renamed from: q */
    protected void m1459q() {
    }

    /* renamed from: s */
    protected void m1461s() {
    }

    public C0392c(Context context) {
        this.f1333i = context.getApplicationContext();
    }

    /* renamed from: b */
    public void m1446b(D d) {
        if (this.f1331g != null) {
            this.f1331g.mo3753a(this, d);
        }
    }

    /* renamed from: g */
    public void m1449g() {
        if (this.f1332h != null) {
            this.f1332h.m1440a(this);
        }
    }

    /* renamed from: h */
    public Context m1450h() {
        return this.f1333i;
    }

    /* renamed from: a */
    public void m1443a(int i, C0391b<D> c0391b) {
        if (this.f1331g == null) {
            this.f1331g = c0391b;
            this.f1330f = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: a */
    public void m1444a(C0391b<D> c0391b) {
        if (this.f1331g == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f1331g == c0391b) {
            this.f1331g = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    /* renamed from: i */
    public boolean m1451i() {
        return this.f1335k;
    }

    /* renamed from: j */
    public final void m1452j() {
        this.f1334j = true;
        this.f1336l = false;
        this.f1335k = false;
        m1453k();
    }

    /* renamed from: l */
    public boolean m1454l() {
        return mo325b();
    }

    /* renamed from: m */
    public void m1455m() {
        mo323a();
    }

    /* renamed from: n */
    public void m1456n() {
        this.f1334j = false;
        m1457o();
    }

    /* renamed from: p */
    public void m1458p() {
        this.f1335k = true;
        m1459q();
    }

    /* renamed from: r */
    public void m1460r() {
        m1461s();
        this.f1336l = true;
        this.f1334j = false;
        this.f1335k = false;
        this.f1337m = false;
        this.f1338n = false;
    }

    /* renamed from: t */
    public void m1462t() {
        this.f1338n = false;
    }

    /* renamed from: u */
    public void m1463u() {
        if (this.f1338n) {
            m1464v();
        }
    }

    /* renamed from: v */
    public void m1464v() {
        if (this.f1334j) {
            m1455m();
        } else {
            this.f1337m = true;
        }
    }

    /* renamed from: c */
    public String m1448c(D d) {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0418d.m1535a(d, stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0418d.m1535a(this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f1330f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void mo324a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f1330f);
        printWriter.print(" mListener=");
        printWriter.println(this.f1331g);
        if (!(this.f1334j == null && this.f1337m == null && this.f1338n == null)) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f1334j);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f1337m);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f1338n);
        }
        if (this.f1335k != null || this.f1336l != null) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f1335k);
            printWriter.print(" mReset=");
            printWriter.println(this.f1336l);
        }
    }
}
