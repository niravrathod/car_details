package com.bumptech.glide.p055g.p056a;

import android.support.v4.p017f.C0431k.C0430a;
import android.support.v4.p017f.C0431k.C3133b;
import android.support.v4.p017f.C0431k.C4435c;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.g.a.a */
public final class C1167a {
    /* renamed from: a */
    private static final C1166d<Object> f3819a = new C33721();

    /* renamed from: com.bumptech.glide.g.a.a$a */
    public interface C1164a<T> {
        /* renamed from: b */
        T mo955b();
    }

    /* renamed from: com.bumptech.glide.g.a.a$c */
    public interface C1165c {
        C1170c e_();
    }

    /* renamed from: com.bumptech.glide.g.a.a$d */
    public interface C1166d<T> {
        /* renamed from: a */
        void mo954a(T t);
    }

    /* renamed from: com.bumptech.glide.g.a.a$1 */
    class C33721 implements C1166d<Object> {
        /* renamed from: a */
        public void mo954a(Object obj) {
        }

        C33721() {
        }
    }

    /* renamed from: com.bumptech.glide.g.a.a$2 */
    class C33732 implements C1164a<List<T>> {
        C33732() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo955b() {
            return m17276a();
        }

        /* renamed from: a */
        public List<T> m17276a() {
            return new ArrayList();
        }
    }

    /* renamed from: com.bumptech.glide.g.a.a$3 */
    class C33743 implements C1166d<List<T>> {
        C33743() {
        }

        /* renamed from: a */
        public void m17279a(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: com.bumptech.glide.g.a.a$b */
    private static final class C3375b<T> implements C0430a<T> {
        /* renamed from: a */
        private final C1164a<T> f14242a;
        /* renamed from: b */
        private final C1166d<T> f14243b;
        /* renamed from: c */
        private final C0430a<T> f14244c;

        C3375b(C0430a<T> c0430a, C1164a<T> c1164a, C1166d<T> c1166d) {
            this.f14244c = c0430a;
            this.f14242a = c1164a;
            this.f14243b = c1166d;
        }

        /* renamed from: a */
        public T mo338a() {
            T a = this.f14244c.mo338a();
            if (a == null) {
                a = this.f14242a.mo955b();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Created new ");
                    stringBuilder.append(a.getClass());
                    Log.v("FactoryPools", stringBuilder.toString());
                }
            }
            if (a instanceof C1165c) {
                ((C1165c) a).e_().mo956a(false);
            }
            return a;
        }

        /* renamed from: a */
        public boolean mo339a(T t) {
            if (t instanceof C1165c) {
                ((C1165c) t).e_().mo956a(true);
            }
            this.f14243b.mo954a(t);
            return this.f14244c.mo339a(t);
        }
    }

    /* renamed from: a */
    public static <T extends C1165c> C0430a<T> m4842a(int i, C1164a<T> c1164a) {
        return C1167a.m4843a(new C3133b(i), (C1164a) c1164a);
    }

    /* renamed from: b */
    public static <T extends C1165c> C0430a<T> m4845b(int i, C1164a<T> c1164a) {
        return C1167a.m4843a(new C4435c(i), (C1164a) c1164a);
    }

    /* renamed from: a */
    public static <T> C0430a<List<T>> m4840a() {
        return C1167a.m4841a(20);
    }

    /* renamed from: a */
    public static <T> C0430a<List<T>> m4841a(int i) {
        return C1167a.m4844a(new C4435c(i), new C33732(), new C33743());
    }

    /* renamed from: a */
    private static <T extends C1165c> C0430a<T> m4843a(C0430a<T> c0430a, C1164a<T> c1164a) {
        return C1167a.m4844a(c0430a, c1164a, C1167a.m4846b());
    }

    /* renamed from: a */
    private static <T> C0430a<T> m4844a(C0430a<T> c0430a, C1164a<T> c1164a, C1166d<T> c1166d) {
        return new C3375b(c0430a, c1164a, c1166d);
    }

    /* renamed from: b */
    private static <T> C1166d<T> m4846b() {
        return f3819a;
    }
}
