package android.arch.lifecycle;

import android.arch.lifecycle.C0018a.C0016a;
import android.arch.lifecycle.Lifecycle.Event;

class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {
    /* renamed from: a */
    private final Object f18277a;
    /* renamed from: b */
    private final C0016a f18278b = C0018a.f45a.m55b(this.f18277a.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f18277a = obj;
    }

    /* renamed from: a */
    public void mo3693a(C0023f c0023f, Event event) {
        this.f18278b.m49a(c0023f, event, this.f18277a);
    }
}
