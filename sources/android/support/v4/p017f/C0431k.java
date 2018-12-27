package android.support.v4.p017f;

/* renamed from: android.support.v4.f.k */
public final class C0431k {

    /* renamed from: android.support.v4.f.k$a */
    public interface C0430a<T> {
        /* renamed from: a */
        T mo338a();

        /* renamed from: a */
        boolean mo339a(T t);
    }

    /* renamed from: android.support.v4.f.k$b */
    public static class C3133b<T> implements C0430a<T> {
        /* renamed from: a */
        private final Object[] f13235a;
        /* renamed from: b */
        private int f13236b;

        public C3133b(int i) {
            if (i > 0) {
                this.f13235a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        /* renamed from: a */
        public T mo338a() {
            if (this.f13236b <= 0) {
                return null;
            }
            int i = this.f13236b - 1;
            T t = this.f13235a[i];
            this.f13235a[i] = null;
            this.f13236b--;
            return t;
        }

        /* renamed from: a */
        public boolean mo339a(T t) {
            if (m15619b(t)) {
                throw new IllegalStateException("Already in the pool!");
            } else if (this.f13236b >= this.f13235a.length) {
                return null;
            } else {
                this.f13235a[this.f13236b] = t;
                this.f13236b += 1;
                return true;
            }
        }

        /* renamed from: b */
        private boolean m15619b(T t) {
            for (int i = 0; i < this.f13236b; i++) {
                if (this.f13235a[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: android.support.v4.f.k$c */
    public static class C4435c<T> extends C3133b<T> {
        /* renamed from: a */
        private final Object f18418a = new Object();

        public C4435c(int i) {
            super(i);
        }

        /* renamed from: a */
        public T mo338a() {
            T a;
            synchronized (this.f18418a) {
                a = super.mo338a();
            }
            return a;
        }

        /* renamed from: a */
        public boolean mo339a(T t) {
            synchronized (this.f18418a) {
                t = super.mo339a(t);
            }
            return t;
        }
    }
}
