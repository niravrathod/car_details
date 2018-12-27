package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;
import android.os.Handler;

/* renamed from: android.arch.lifecycle.p */
public class C0034p {
    /* renamed from: a */
    private final C3004g f61a;
    /* renamed from: b */
    private final Handler f62b = new Handler();
    /* renamed from: c */
    private C0033a f63c;

    /* renamed from: android.arch.lifecycle.p$a */
    static class C0033a implements Runnable {
        /* renamed from: a */
        final Event f58a;
        /* renamed from: b */
        private final C3004g f59b;
        /* renamed from: c */
        private boolean f60c = false;

        C0033a(C3004g c3004g, Event event) {
            this.f59b = c3004g;
            this.f58a = event;
        }

        public void run() {
            if (!this.f60c) {
                this.f59b.m14718a(this.f58a);
                this.f60c = true;
            }
        }
    }

    public C0034p(C0023f c0023f) {
        this.f61a = new C3004g(c0023f);
    }

    /* renamed from: a */
    private void m84a(Event event) {
        if (this.f63c != null) {
            this.f63c.run();
        }
        this.f63c = new C0033a(this.f61a, event);
        this.f62b.postAtFrontOfQueue(this.f63c);
    }

    /* renamed from: a */
    public void m85a() {
        m84a(Event.ON_CREATE);
    }

    /* renamed from: b */
    public void m86b() {
        m84a(Event.ON_START);
    }

    /* renamed from: c */
    public void m87c() {
        m84a(Event.ON_START);
    }

    /* renamed from: d */
    public void m88d() {
        m84a(Event.ON_STOP);
        m84a(Event.ON_DESTROY);
    }

    /* renamed from: e */
    public Lifecycle m89e() {
        return this.f61a;
    }
}
