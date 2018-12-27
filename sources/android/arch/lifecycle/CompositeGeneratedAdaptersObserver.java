package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;

public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {
    /* renamed from: a */
    private final C0020c[] f18273a;

    CompositeGeneratedAdaptersObserver(C0020c[] c0020cArr) {
        this.f18273a = c0020cArr;
    }

    /* renamed from: a */
    public void mo3693a(C0023f c0023f, Event event) {
        C0027j c0027j = new C0027j();
        int i = 0;
        for (C0020c a : this.f18273a) {
            a.m56a(c0023f, event, false, c0027j);
        }
        C0020c[] c0020cArr = this.f18273a;
        int length = c0020cArr.length;
        while (i < length) {
            c0020cArr[i].m56a(c0023f, event, true, c0027j);
            i++;
        }
    }
}
