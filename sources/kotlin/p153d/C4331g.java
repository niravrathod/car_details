package kotlin.p153d;

import java.util.Iterator;
import kotlin.jvm.internal.C2885g;
import kotlin.jvm.p154a.C2878b;

/* renamed from: kotlin.d.g */
public final class C4331g<T, R> implements C2873a<R> {
    /* renamed from: a */
    private final C2873a<T> f18068a;
    /* renamed from: b */
    private final C2878b<T, R> f18069b;

    /* renamed from: kotlin.d.g$a */
    public static final class C2876a implements Iterator<R> {
        /* renamed from: a */
        final /* synthetic */ C4331g f12085a;
        /* renamed from: b */
        private final Iterator<T> f12086b;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C2876a(C4331g c4331g) {
            this.f12085a = c4331g;
            this.f12086b = c4331g.f18068a.mo3605a();
        }

        public R next() {
            return this.f12085a.f18069b.mo3931a(this.f12086b.next());
        }

        public boolean hasNext() {
            return this.f12086b.hasNext();
        }
    }

    public C4331g(C2873a<? extends T> c2873a, C2878b<? super T, ? extends R> c2878b) {
        C2885g.m13910b(c2873a, "sequence");
        C2885g.m13910b(c2878b, "transformer");
        this.f18068a = c2873a;
        this.f18069b = c2878b;
    }

    /* renamed from: a */
    public Iterator<R> mo3605a() {
        return new C2876a(this);
    }
}
