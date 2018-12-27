package android.support.constraint.solver;

/* renamed from: android.support.constraint.solver.g */
final class C0100g {

    /* renamed from: android.support.constraint.solver.g$a */
    interface C0099a<T> {
        /* renamed from: a */
        T mo36a();

        /* renamed from: a */
        void mo37a(T[] tArr, int i);

        /* renamed from: a */
        boolean mo38a(T t);
    }

    /* renamed from: android.support.constraint.solver.g$b */
    static class C3022b<T> implements C0099a<T> {
        /* renamed from: a */
        private final Object[] f12759a;
        /* renamed from: b */
        private int f12760b;

        C3022b(int i) {
            if (i > 0) {
                this.f12759a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        /* renamed from: a */
        public T mo36a() {
            if (this.f12760b <= 0) {
                return null;
            }
            int i = this.f12760b - 1;
            T t = this.f12759a[i];
            this.f12759a[i] = null;
            this.f12760b--;
            return t;
        }

        /* renamed from: a */
        public boolean mo38a(T t) {
            if (this.f12760b >= this.f12759a.length) {
                return null;
            }
            this.f12759a[this.f12760b] = t;
            this.f12760b += 1;
            return true;
        }

        /* renamed from: a */
        public void mo37a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                if (this.f12760b < this.f12759a.length) {
                    this.f12759a[this.f12760b] = t;
                    this.f12760b++;
                }
            }
        }
    }
}
