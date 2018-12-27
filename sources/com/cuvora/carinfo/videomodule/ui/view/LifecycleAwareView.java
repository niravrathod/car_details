package com.cuvora.carinfo.videomodule.ui.view;

import android.arch.lifecycle.C0022e;
import android.arch.lifecycle.C0023f;
import android.arch.lifecycle.C0029m;
import android.arch.lifecycle.C3004g;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.C2885g;

public class LifecycleAwareView extends FrameLayout implements C0023f {
    /* renamed from: a */
    private ViewLifeCycleObserver f14972a = new ViewLifeCycleObserver(this);
    /* renamed from: b */
    private C3004g f14973b;

    public final class ViewLifeCycleObserver implements C0022e {
        /* renamed from: a */
        final /* synthetic */ LifecycleAwareView f14971a;

        public ViewLifeCycleObserver(LifecycleAwareView lifecycleAwareView) {
            this.f14971a = lifecycleAwareView;
        }

        @C0029m(a = Event.ON_CREATE)
        public final void onCreate() {
            this.f14971a.m18607d();
        }

        @C0029m(a = Event.ON_START)
        public final void onStart() {
            this.f14971a.m18609f();
        }

        @C0029m(a = Event.ON_STOP)
        public final void onStop() {
            this.f14971a.m18608e();
        }

        @C0029m(a = Event.ON_PAUSE)
        public final void onPause() {
            this.f14971a.mo3932a();
        }

        @C0029m(a = Event.ON_RESUME)
        public final void onResume() {
            this.f14971a.mo3933b();
        }

        @C0029m(a = Event.ON_DESTROY)
        public final void onDestroy() {
            this.f14971a.mo3934c();
        }
    }

    public LifecycleAwareView(Context context, AttributeSet attributeSet) {
        C2885g.m13910b(context, "context");
        super(context, attributeSet);
        if ((context instanceof C0023f) != null) {
            ((C0023f) context).getLifecycle().mo16a(getLifeCycleObserver());
        }
    }

    public ViewLifeCycleObserver getLifeCycleObserver() {
        return this.f14972a;
    }

    public void setLifeCycleObserver(ViewLifeCycleObserver viewLifeCycleObserver) {
        C2885g.m13910b(viewLifeCycleObserver, "<set-?>");
        this.f14972a = viewLifeCycleObserver;
    }

    private final C3004g getLifecycleRegistry() {
        if (this.f14973b == null) {
            this.f14973b = new C3004g(this);
        }
        C3004g c3004g = this.f14973b;
        if (c3004g == null) {
            C2885g.m13906a();
        }
        return c3004g;
    }

    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    /* renamed from: d */
    public void m18607d() {
        getLifecycleRegistry().m14718a(Event.ON_CREATE);
    }

    /* renamed from: b */
    public void mo3933b() {
        getLifecycleRegistry().m14718a(Event.ON_RESUME);
    }

    /* renamed from: e */
    public void m18608e() {
        getLifecycleRegistry().m14718a(Event.ON_STOP);
    }

    /* renamed from: a */
    public void mo3932a() {
        getLifecycleRegistry().m14718a(Event.ON_PAUSE);
    }

    /* renamed from: c */
    public void mo3934c() {
        getLifecycleRegistry().m14718a(Event.ON_DESTROY);
    }

    /* renamed from: f */
    public void m18609f() {
        getLifecycleRegistry().m14718a(Event.ON_START);
    }
}
