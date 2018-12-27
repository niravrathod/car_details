package io.fabric.sdk.android.services.p146a;

import android.content.Context;

/* renamed from: io.fabric.sdk.android.services.a.a */
public abstract class C4295a<T> implements C2775c<T> {
    /* renamed from: a */
    private final C2775c<T> f18012a;

    /* renamed from: a */
    protected abstract T mo4533a(Context context);

    /* renamed from: a */
    protected abstract void mo4534a(Context context, T t);

    public C4295a(C2775c<T> c2775c) {
        this.f18012a = c2775c;
    }

    /* renamed from: a */
    public final synchronized T mo3565a(Context context, C2776d<T> c2776d) {
        T a;
        a = mo4533a(context);
        if (a == null) {
            a = this.f18012a != null ? this.f18012a.mo3565a(context, c2776d) : c2776d.load(context);
            m23596b(context, a);
        }
        return a;
    }

    /* renamed from: b */
    private void m23596b(Context context, T t) {
        if (t != null) {
            mo4534a(context, (Object) t);
            return;
        }
        throw new NullPointerException();
    }
}
