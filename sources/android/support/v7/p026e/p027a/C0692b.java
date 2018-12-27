package android.support.v7.p026e.p027a;

import android.support.v7.p029g.C0702c;
import android.support.v7.p029g.C0702c.C0696a;
import android.support.v7.p029g.C0702c.C0697b;
import android.support.v7.p029g.C0703d;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v7.e.a.b */
public class C0692b<T> {
    /* renamed from: a */
    private final C0703d f2218a;
    /* renamed from: b */
    private final C0689a<T> f2219b;
    /* renamed from: c */
    private List<T> f2220c;
    /* renamed from: d */
    private List<T> f2221d = Collections.emptyList();
    /* renamed from: e */
    private int f2222e;

    public C0692b(C0703d c0703d, C0689a<T> c0689a) {
        this.f2218a = c0703d;
        this.f2219b = c0689a;
    }

    /* renamed from: a */
    public List<T> m2727a() {
        return this.f2221d;
    }

    /* renamed from: a */
    public void m2728a(final List<T> list) {
        if (list != this.f2220c) {
            final int i = this.f2222e + 1;
            this.f2222e = i;
            if (list == null) {
                list = this.f2220c.size();
                this.f2220c = null;
                this.f2221d = Collections.emptyList();
                this.f2218a.mo579b(0, list);
            } else if (this.f2220c == null) {
                this.f2220c = list;
                this.f2221d = Collections.unmodifiableList(list);
                this.f2218a.mo577a(0, list.size());
            } else {
                final List list2 = this.f2220c;
                this.f2219b.m2721b().execute(new Runnable(this) {
                    /* renamed from: d */
                    final /* synthetic */ C0692b f2217d;

                    /* renamed from: android.support.v7.e.a.b$1$1 */
                    class C32121 extends C0696a {
                        /* renamed from: a */
                        final /* synthetic */ C06911 f13489a;

                        C32121(C06911 c06911) {
                            this.f13489a = c06911;
                        }

                        /* renamed from: a */
                        public int mo572a() {
                            return list2.size();
                        }

                        /* renamed from: b */
                        public int mo574b() {
                            return list.size();
                        }

                        /* renamed from: a */
                        public boolean mo573a(int i, int i2) {
                            return this.f13489a.f2217d.f2219b.m2722c().mo1227a(list2.get(i), list.get(i2));
                        }

                        /* renamed from: b */
                        public boolean mo575b(int i, int i2) {
                            return this.f13489a.f2217d.f2219b.m2722c().mo1228b(list2.get(i), list.get(i2));
                        }

                        /* renamed from: c */
                        public Object mo576c(int i, int i2) {
                            return this.f13489a.f2217d.f2219b.m2722c().m2746c(list2.get(i), list.get(i2));
                        }
                    }

                    public void run() {
                        final C0697b a = C0702c.m2747a(new C32121(this));
                        this.f2217d.f2219b.m2720a().execute(new Runnable(this) {
                            /* renamed from: b */
                            final /* synthetic */ C06911 f2213b;

                            public void run() {
                                if (this.f2213b.f2217d.f2222e == i) {
                                    this.f2213b.f2217d.m2725a(list, a);
                                }
                            }
                        });
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private void m2725a(List<T> list, C0697b c0697b) {
        this.f2220c = list;
        this.f2221d = Collections.unmodifiableList(list);
        c0697b.m2743a(this.f2218a);
    }
}
