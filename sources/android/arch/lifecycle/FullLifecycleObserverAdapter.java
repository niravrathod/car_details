package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;

class FullLifecycleObserverAdapter implements GenericLifecycleObserver {
    /* renamed from: a */
    private final FullLifecycleObserver f18274a;

    FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver) {
        this.f18274a = fullLifecycleObserver;
    }

    /* renamed from: a */
    public void mo3693a(C0023f c0023f, Event event) {
        switch (event) {
            case ON_CREATE:
                this.f18274a.m14695a(c0023f);
                return;
            case ON_START:
                this.f18274a.m14696b(c0023f);
                return;
            case ON_RESUME:
                this.f18274a.m14697c(c0023f);
                return;
            case ON_PAUSE:
                this.f18274a.m14698d(c0023f);
                return;
            case ON_STOP:
                this.f18274a.m14699e(c0023f);
                return;
            case ON_DESTROY:
                this.f18274a.m14700f(c0023f);
                return;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
