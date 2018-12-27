package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.arch.p001a.p002a.C2997a;
import android.arch.p001a.p003b.C0012b;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class LiveData<T> {
    /* renamed from: b */
    private static final Object f31b = new Object();
    /* renamed from: a */
    private final Object f32a = new Object();
    /* renamed from: c */
    private C0012b<C0028l<T>, C0015a> f33c = new C0012b();
    /* renamed from: d */
    private int f34d = 0;
    /* renamed from: e */
    private volatile Object f35e = f31b;
    /* renamed from: f */
    private volatile Object f36f = f31b;
    /* renamed from: g */
    private int f37g = -1;
    /* renamed from: h */
    private boolean f38h;
    /* renamed from: i */
    private boolean f39i;
    /* renamed from: j */
    private final Runnable f40j = new C00141(this);

    /* renamed from: android.arch.lifecycle.LiveData$1 */
    class C00141 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ LiveData f26a;

        C00141(LiveData liveData) {
            this.f26a = liveData;
        }

        public void run() {
            Object b;
            synchronized (this.f26a.f32a) {
                b = this.f26a.f36f;
                this.f26a.f36f = LiveData.f31b;
            }
            this.f26a.mo19b(b);
        }
    }

    /* renamed from: android.arch.lifecycle.LiveData$a */
    private abstract class C0015a {
        /* renamed from: c */
        final C0028l<T> f27c;
        /* renamed from: d */
        boolean f28d;
        /* renamed from: e */
        int f29e = -1;
        /* renamed from: f */
        final /* synthetic */ LiveData f30f;

        /* renamed from: a */
        abstract boolean mo3694a();

        /* renamed from: a */
        boolean mo3695a(C0023f c0023f) {
            return false;
        }

        /* renamed from: b */
        void mo3696b() {
        }

        C0015a(LiveData liveData, C0028l<T> c0028l) {
            this.f30f = liveData;
            this.f27c = c0028l;
        }

        /* renamed from: a */
        void m26a(boolean z) {
            if (z != this.f28d) {
                this.f28d = z;
                int i = 1;
                z = !this.f30f.f34d;
                LiveData liveData = this.f30f;
                int c = liveData.f34d;
                if (!this.f28d) {
                    i = -1;
                }
                liveData.f34d = c + i;
                if (z && this.f28d) {
                    this.f30f.mo3754b();
                }
                if (!(this.f30f.f34d || this.f28d)) {
                    this.f30f.mo3755c();
                }
                if (this.f28d) {
                    this.f30f.m37b(this);
                }
            }
        }
    }

    class LifecycleBoundObserver extends C0015a implements GenericLifecycleObserver {
        /* renamed from: a */
        final C0023f f18275a;
        /* renamed from: b */
        final /* synthetic */ LiveData f18276b;

        LifecycleBoundObserver(LiveData liveData, C0023f c0023f, C0028l<T> c0028l) {
            this.f18276b = liveData;
            super(liveData, c0028l);
            this.f18275a = c0023f;
        }

        /* renamed from: a */
        boolean mo3694a() {
            return this.f18275a.getLifecycle().mo15a().m22a(State.STARTED);
        }

        /* renamed from: a */
        public void mo3693a(C0023f c0023f, Event event) {
            if (this.f18275a.getLifecycle().mo15a() == State.DESTROYED) {
                this.f18276b.mo3752a(this.c);
            } else {
                m26a((boolean) mo3694a());
            }
        }

        /* renamed from: a */
        boolean mo3695a(C0023f c0023f) {
            return this.f18275a == c0023f ? true : null;
        }

        /* renamed from: b */
        void mo3696b() {
            this.f18275a.getLifecycle().mo17b(this);
        }
    }

    /* renamed from: b */
    protected void mo3754b() {
    }

    /* renamed from: c */
    protected void mo3755c() {
    }

    /* renamed from: a */
    private void m33a(C0015a c0015a) {
        if (!c0015a.f28d) {
            return;
        }
        if (!c0015a.mo3694a()) {
            c0015a.m26a(false);
        } else if (c0015a.f29e < this.f37g) {
            c0015a.f29e = this.f37g;
            c0015a.f27c.mo263a(this.f35e);
        }
    }

    /* renamed from: b */
    private void m37b(C0015a c0015a) {
        if (this.f38h) {
            this.f39i = true;
            return;
        }
        this.f38h = true;
        do {
            this.f39i = false;
            if (c0015a == null) {
                Iterator c = this.f33c.m19c();
                while (c.hasNext()) {
                    m33a((C0015a) ((Entry) c.next()).getValue());
                    if (this.f39i) {
                        break;
                    }
                }
            }
            m33a((C0015a) c0015a);
            c0015a = null;
        } while (this.f39i);
        this.f38h = false;
    }

    /* renamed from: a */
    public void m41a(C0023f c0023f, C0028l<T> c0028l) {
        if (c0023f.getLifecycle().mo15a() != State.DESTROYED) {
            C0022e lifecycleBoundObserver = new LifecycleBoundObserver(this, c0023f, c0028l);
            C0015a c0015a = (C0015a) this.f33c.mo5a(c0028l, lifecycleBoundObserver);
            if (c0015a != null) {
                if (!c0015a.mo3695a(c0023f)) {
                    throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
                }
            }
            if (c0015a == null) {
                c0023f.getLifecycle().mo16a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo3752a(C0028l<T> c0028l) {
        m35a("removeObserver");
        C0015a c0015a = (C0015a) this.f33c.mo6b(c0028l);
        if (c0015a != null) {
            c0015a.mo3696b();
            c0015a.m26a(false);
        }
    }

    /* renamed from: a */
    protected void mo18a(T t) {
        synchronized (this.f32a) {
            Object obj = this.f36f == f31b ? 1 : null;
            this.f36f = t;
        }
        if (obj != null) {
            C2997a.m14678a().mo2b(this.f40j);
        }
    }

    /* renamed from: b */
    protected void mo19b(T t) {
        m35a("setValue");
        this.f37g++;
        this.f35e = t;
        m37b((C0015a) null);
    }

    /* renamed from: a */
    public T m40a() {
        T t = this.f35e;
        return t != f31b ? t : null;
    }

    /* renamed from: d */
    public boolean m47d() {
        return this.f34d > 0;
    }

    /* renamed from: a */
    private static void m35a(String str) {
        if (!C2997a.m14678a().mo3b()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot invoke ");
            stringBuilder.append(str);
            stringBuilder.append(" on a background");
            stringBuilder.append(" thread");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
