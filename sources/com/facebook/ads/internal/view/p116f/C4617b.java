package com.facebook.ads.internal.view.p116f;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.internal.p083b.C1762b;
import com.facebook.ads.internal.p091j.C1817f;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.view.p116f.C4617b;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3873h;
import com.facebook.ads.internal.view.p116f.p118b.C3875j;
import com.facebook.ads.internal.view.p116f.p118b.C3877l;
import com.facebook.ads.internal.view.p116f.p118b.C3878m;
import com.facebook.ads.internal.view.p116f.p118b.C3879n;
import com.facebook.ads.internal.view.p116f.p118b.C3881p;
import com.facebook.ads.internal.view.p116f.p118b.C3883r;
import com.facebook.ads.internal.view.p116f.p118b.C3884s;
import com.facebook.ads.internal.view.p116f.p118b.C3887v;
import com.facebook.ads.internal.view.p116f.p118b.C3888w;
import com.facebook.ads.internal.view.p116f.p118b.C3889x;
import com.facebook.ads.internal.view.p116f.p118b.C3890y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.f.b */
public class C4617b extends C3903c {
    /* renamed from: a */
    public int f19166a;
    /* renamed from: b */
    private final C3888w f19167b;
    /* renamed from: c */
    private final C1817f<C3883r> f19168c;
    /* renamed from: d */
    private final C1817f<C3873h> f19169d;
    /* renamed from: e */
    private final C1817f<C3875j> f19170e;
    /* renamed from: f */
    private final C1817f<C3879n> f19171f;
    /* renamed from: g */
    private final C1817f<C3867b> f19172g;
    /* renamed from: h */
    private final C1817f<C3881p> f19173h;
    /* renamed from: i */
    private final C1817f<C3889x> f19174i;
    /* renamed from: j */
    private final C1817f<C3890y> f19175j;
    /* renamed from: k */
    private final C1817f<C3884s> f19176k;
    /* renamed from: l */
    private final C3878m f19177l;
    /* renamed from: m */
    private final C3859a f19178m;
    /* renamed from: n */
    private boolean f19179n;

    /* renamed from: com.facebook.ads.internal.view.f.b$7 */
    class C20407 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C4617b f6307a;

        C20407(C4617b c4617b) {
            this.f6307a = c4617b;
        }

        public void run() {
            this.f6307a.f19178m.getEventBus().m6832b(this.f6307a.f19167b, this.f6307a.f19171f, this.f6307a.f19168c, this.f6307a.f19170e, this.f6307a.f19169d, this.f6307a.f19172g, this.f6307a.f19173h, this.f6307a.f19174i, this.f6307a.f19175j, this.f6307a.f19177l, this.f6307a.f19176k);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.b$2 */
    class C38602 extends C1817f<C3881p> {
        /* renamed from: a */
        final /* synthetic */ C4617b f15418a;

        C38602(C4617b c4617b) {
            this.f15418a = c4617b;
        }

        /* renamed from: a */
        public Class<C3881p> mo1340a() {
            return C3881p.class;
        }

        /* renamed from: a */
        public void m19280a(C3881p c3881p) {
            this.f15418a.m19392a(c3881p.m19305a(), c3881p.m19306b());
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.b$3 */
    class C38613 extends C1817f<C3889x> {
        /* renamed from: a */
        final /* synthetic */ C4617b f15419a;

        C38613(C4617b c4617b) {
            this.f15419a = c4617b;
        }

        /* renamed from: a */
        public Class<C3889x> mo1340a() {
            return C3889x.class;
        }

        /* renamed from: a */
        public void m19283a(C3889x c3889x) {
            this.f15419a.m19393b();
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.b$4 */
    class C38624 extends C1817f<C3890y> {
        /* renamed from: a */
        final /* synthetic */ C4617b f15420a;

        C38624(C4617b c4617b) {
            this.f15420a = c4617b;
        }

        /* renamed from: a */
        public Class<C3890y> mo1340a() {
            return C3890y.class;
        }

        /* renamed from: a */
        public void m19286a(C3890y c3890y) {
            this.f15420a.m19395c();
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.b$5 */
    class C38635 extends C1817f<C3884s> {
        /* renamed from: a */
        final /* synthetic */ C4617b f15421a;

        C38635(C4617b c4617b) {
            this.f15421a = c4617b;
        }

        /* renamed from: a */
        public Class<C3884s> mo1340a() {
            return C3884s.class;
        }

        /* renamed from: a */
        public void m19289a(C3884s c3884s) {
            this.f15421a.m19392a(this.f15421a.m19402j(), this.f15421a.m19402j());
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.b$8 */
    class C38648 extends C1817f<C3883r> {
        /* renamed from: a */
        static final /* synthetic */ boolean f15422a = (C4617b.class.desiredAssertionStatus() ^ 1);
        /* renamed from: b */
        final /* synthetic */ C4617b f15423b;

        C38648(C4617b c4617b) {
            this.f15423b = c4617b;
        }

        /* renamed from: a */
        public Class<C3883r> mo1340a() {
            return C3883r.class;
        }

        /* renamed from: a */
        public void m19292a(C3883r c3883r) {
            if (!f15422a) {
                if (this.f15423b == null) {
                    throw new AssertionError();
                }
            }
            if (this.f15423b != null) {
                this.f15423b.m19398f();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.b$9 */
    class C38659 extends C1817f<C3873h> {
        /* renamed from: a */
        static final /* synthetic */ boolean f15424a = (C4617b.class.desiredAssertionStatus() ^ 1);
        /* renamed from: b */
        final /* synthetic */ C4617b f15425b;

        C38659(C4617b c4617b) {
            this.f15425b = c4617b;
        }

        /* renamed from: a */
        public Class<C3873h> mo1340a() {
            return C3873h.class;
        }

        /* renamed from: a */
        public void m19295a(C3873h c3873h) {
            if (!f15424a) {
                if (this.f15425b == null) {
                    throw new AssertionError();
                }
            }
            if (this.f15425b != null) {
                this.f15425b.m19399g();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.b$1 */
    class C46151 extends C3888w {
        /* renamed from: a */
        static final /* synthetic */ boolean f19163a = (C4617b.class.desiredAssertionStatus() ^ 1);
        /* renamed from: b */
        final /* synthetic */ C4617b f19164b;

        C46151(C4617b c4617b) {
            this.f19164b = c4617b;
        }

        /* renamed from: a */
        public void m25504a(C3887v c3887v) {
            if (!f19163a) {
                if (this.f19164b == null) {
                    throw new AssertionError();
                }
            }
            if (this.f19164b != null) {
                this.f19164b.m19397e();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.b$6 */
    class C46166 extends C3878m {
        /* renamed from: a */
        final /* synthetic */ C4617b f19165a;

        C46166(C4617b c4617b) {
            this.f19165a = c4617b;
        }

        /* renamed from: a */
        public void m25506a(C3877l c3877l) {
            this.f19165a.f19166a = this.f19165a.f19178m.getDuration();
        }
    }

    public C4617b(Context context, C1827c c1827c, C3859a c3859a, String str) {
        this(context, c1827c, c3859a, new ArrayList(), str);
    }

    public C4617b(Context context, C1827c c1827c, C3859a c3859a, String str, Bundle bundle) {
        this(context, c1827c, c3859a, new ArrayList(), str, bundle, null);
    }

    public C4617b(Context context, C1827c c1827c, C3859a c3859a, String str, Map<String, String> map) {
        this(context, c1827c, c3859a, new ArrayList(), str, null, map);
    }

    public C4617b(Context context, C1827c c1827c, C3859a c3859a, List<C1762b> list, String str) {
        super(context, c1827c, c3859a, list, str);
        this.f19167b = new C46151(this);
        this.f19168c = new C38648(this);
        this.f19169d = new C38659(this);
        this.f19170e = new C1817f<C3875j>(this) {
            /* renamed from: a */
            static final /* synthetic */ boolean f15414a = (C4617b.class.desiredAssertionStatus() ^ 1);
            /* renamed from: b */
            final /* synthetic */ C4617b f15415b;

            {
                this.f15415b = r1;
            }

            /* renamed from: a */
            public Class<C3875j> mo1340a() {
                return C3875j.class;
            }

            /* renamed from: a */
            public void m19271a(C3875j c3875j) {
                if (!f15414a) {
                    if (this.f15415b == null) {
                        throw new AssertionError();
                    }
                }
                if (this.f15415b != null) {
                    if (this.f15415b.f19179n) {
                        this.f15415b.m19400h();
                    } else {
                        this.f15415b.f19179n = true;
                    }
                }
            }
        };
        this.f19171f = new C1817f<C3879n>(this) {
            /* renamed from: a */
            final /* synthetic */ C4617b f15416a;

            {
                this.f15416a = r1;
            }

            /* renamed from: a */
            public Class<C3879n> mo1340a() {
                return C3879n.class;
            }

            /* renamed from: a */
            public void m19274a(C3879n c3879n) {
                int a = c3879n.m19303a();
                if (this.f15416a.f19166a <= 0 || a != this.f15416a.f19178m.getDuration() || this.f15416a.f19178m.getDuration() <= this.f15416a.f19166a) {
                    this.f15416a.m19391a(a);
                }
            }
        };
        this.f19172g = new C1817f<C3867b>(this) {
            /* renamed from: a */
            final /* synthetic */ C4617b f15417a;

            {
                this.f15417a = r1;
            }

            /* renamed from: a */
            public Class<C3867b> mo1340a() {
                return C3867b.class;
            }

            /* renamed from: a */
            public void m19277a(C3867b c3867b) {
                int a = c3867b.m19296a();
                int b = c3867b.m19297b();
                if (this.f15417a.f19166a <= 0 || a != b || b <= this.f15417a.f19166a) {
                    C4617b c4617b;
                    if (b >= a + 500) {
                        c4617b = this.f15417a;
                    } else if (b == 0) {
                        c4617b = this.f15417a;
                        a = this.f15417a.f19166a;
                    } else {
                        this.f15417a.m19394b(b);
                    }
                    c4617b.m19394b(a);
                }
            }
        };
        this.f19173h = new C38602(this);
        this.f19174i = new C38613(this);
        this.f19175j = new C38624(this);
        this.f19176k = new C38635(this);
        this.f19177l = new C46166(this);
        this.f19179n = false;
        this.f19178m = c3859a;
        this.f19178m.getEventBus().m6830a(this.f19167b, this.f19171f, this.f19168c, this.f19170e, this.f19169d, this.f19172g, this.f19173h, this.f19174i, this.f19175j, this.f19177l, this.f19176k);
    }

    public C4617b(Context context, C1827c c1827c, C3859a c3859a, List<C1762b> list, String str, Bundle bundle, Map<String, String> map) {
        super(context, c1827c, c3859a, list, str, bundle, map);
        this.f19167b = new C46151(this);
        this.f19168c = new C38648(this);
        this.f19169d = new C38659(this);
        this.f19170e = /* anonymous class already generated */;
        this.f19171f = /* anonymous class already generated */;
        this.f19172g = /* anonymous class already generated */;
        this.f19173h = new C38602(this);
        this.f19174i = new C38613(this);
        this.f19175j = new C38624(this);
        this.f19176k = new C38635(this);
        this.f19177l = new C46166(this);
        this.f19179n = false;
        this.f19178m = c3859a;
        this.f19178m.getEventBus().m6830a(this.f19167b, this.f19171f, this.f19168c, this.f19170e, this.f19169d, this.f19172g, this.f19173h, this.f19174i, this.f19175j, this.f19176k);
    }

    /* renamed from: a */
    public void mo3983a() {
        this.f19178m.getStateHandler().post(new C20407(this));
    }
}
