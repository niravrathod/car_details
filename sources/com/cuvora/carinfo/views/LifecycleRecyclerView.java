package com.cuvora.carinfo.views;

import android.arch.lifecycle.C0022e;
import android.arch.lifecycle.C0023f;
import android.arch.lifecycle.C0029m;
import android.arch.lifecycle.C3004g;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import kotlin.jvm.internal.C2885g;

public class LifecycleRecyclerView extends RecyclerView implements C0023f {
    /* renamed from: J */
    private ViewLifeCycleObserver f21081J = new ViewLifeCycleObserver(this);
    /* renamed from: K */
    private C3004g f21082K;

    public final class ViewLifeCycleObserver implements C0022e {
        /* renamed from: a */
        final /* synthetic */ LifecycleRecyclerView f15009a;

        public ViewLifeCycleObserver(LifecycleRecyclerView lifecycleRecyclerView) {
            this.f15009a = lifecycleRecyclerView;
        }

        @C0029m(a = Event.ON_CREATE)
        public final void onCreate() {
            this.f15009a.mo4653A();
        }

        @C0029m(a = Event.ON_START)
        public final void onStart() {
            this.f15009a.mo4657E();
        }

        @C0029m(a = Event.ON_STOP)
        public final void onStop() {
            this.f15009a.mo4655C();
        }

        @C0029m(a = Event.ON_PAUSE)
        public final void onPause() {
            this.f15009a.mo4656D();
        }

        @C0029m(a = Event.ON_RESUME)
        public final void onResume() {
            this.f15009a.mo4654B();
        }

        @C0029m(a = Event.ON_DESTROY)
        public final void onDestroy() {
            this.f15009a.mo4658z();
        }
    }

    public LifecycleRecyclerView(Context context, AttributeSet attributeSet) {
        C2885g.m13910b(context, "context");
        super(context, attributeSet);
        if ((context instanceof C0023f) != null) {
            ((C0023f) context).getLifecycle().mo16a(getLifeCycleObserver());
        }
    }

    public ViewLifeCycleObserver getLifeCycleObserver() {
        return this.f21081J;
    }

    public void setLifeCycleObserver(ViewLifeCycleObserver viewLifeCycleObserver) {
        C2885g.m13910b(viewLifeCycleObserver, "<set-?>");
        this.f21081J = viewLifeCycleObserver;
    }

    private final C3004g getLifecycleRegistry() {
        if (this.f21082K == null) {
            this.f21082K = new C3004g(this);
        }
        C3004g c3004g = this.f21082K;
        if (c3004g == null) {
            C2885g.m13906a();
        }
        return c3004g;
    }

    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    /* renamed from: A */
    public void mo4653A() {
        getLifecycleRegistry().m14718a(Event.ON_CREATE);
    }

    /* renamed from: B */
    public void mo4654B() {
        getLifecycleRegistry().m14718a(Event.ON_RESUME);
    }

    /* renamed from: C */
    public void mo4655C() {
        getLifecycleRegistry().m14718a(Event.ON_STOP);
    }

    /* renamed from: D */
    public void mo4656D() {
        getLifecycleRegistry().m14718a(Event.ON_PAUSE);
    }

    /* renamed from: z */
    public void mo4658z() {
        getLifecycleRegistry().m14718a(Event.ON_DESTROY);
    }

    /* renamed from: E */
    public void mo4657E() {
        getLifecycleRegistry().m14718a(Event.ON_START);
    }
}
