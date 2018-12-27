package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;

public class SingleGeneratedAdapterObserver implements GenericLifecycleObserver {
    /* renamed from: a */
    private final C0020c f18279a;

    SingleGeneratedAdapterObserver(C0020c c0020c) {
        this.f18279a = c0020c;
    }

    /* renamed from: a */
    public void mo3693a(C0023f c0023f, Event event) {
        this.f18279a.m56a(c0023f, event, false, null);
        this.f18279a.m56a(c0023f, event, true, null);
    }
}
