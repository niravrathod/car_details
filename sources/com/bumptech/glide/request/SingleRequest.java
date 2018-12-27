package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p017f.C0431k.C0430a;
import android.util.Log;
import com.bumptech.glide.C1157e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.load.engine.C3490i;
import com.bumptech.glide.load.engine.C3490i.C1268d;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.p064b.C1281a;
import com.bumptech.glide.p055g.C1174e;
import com.bumptech.glide.p055g.C1180j;
import com.bumptech.glide.p055g.p056a.C1167a;
import com.bumptech.glide.p055g.p056a.C1167a.C1164a;
import com.bumptech.glide.p055g.p056a.C1167a.C1165c;
import com.bumptech.glide.p055g.p056a.C1170c;
import com.bumptech.glide.request.p067a.C1304g;
import com.bumptech.glide.request.p067a.C3545h;
import com.bumptech.glide.request.p068b.C1309c;
import java.util.List;

public final class SingleRequest<R> implements C1165c, C1304g, C1310b, C1314f {
    /* renamed from: a */
    private static final C0430a<SingleRequest<?>> f14601a = C1167a.m4842a(150, new C35441());
    /* renamed from: c */
    private static final boolean f14602c = Log.isLoggable("Request", 2);
    /* renamed from: A */
    private int f14603A;
    /* renamed from: B */
    private int f14604B;
    /* renamed from: b */
    private boolean f14605b;
    /* renamed from: d */
    private final String f14606d;
    /* renamed from: e */
    private final C1170c f14607e;
    /* renamed from: f */
    private C1312d<R> f14608f;
    /* renamed from: g */
    private C1311c f14609g;
    /* renamed from: h */
    private Context f14610h;
    /* renamed from: i */
    private C1157e f14611i;
    /* renamed from: j */
    private Object f14612j;
    /* renamed from: k */
    private Class<R> f14613k;
    /* renamed from: l */
    private C1313e f14614l;
    /* renamed from: m */
    private int f14615m;
    /* renamed from: n */
    private int f14616n;
    /* renamed from: o */
    private Priority f14617o;
    /* renamed from: p */
    private C3545h<R> f14618p;
    /* renamed from: q */
    private List<C1312d<R>> f14619q;
    /* renamed from: r */
    private C3490i f14620r;
    /* renamed from: s */
    private C1309c<? super R> f14621s;
    /* renamed from: t */
    private C1277s<R> f14622t;
    /* renamed from: u */
    private C1268d f14623u;
    /* renamed from: v */
    private long f14624v;
    /* renamed from: w */
    private Status f14625w;
    /* renamed from: x */
    private Drawable f14626x;
    /* renamed from: y */
    private Drawable f14627y;
    /* renamed from: z */
    private Drawable f14628z;

    private enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    /* renamed from: com.bumptech.glide.request.SingleRequest$1 */
    class C35441 implements C1164a<SingleRequest<?>> {
        C35441() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo955b() {
            return m17926a();
        }

        /* renamed from: a */
        public SingleRequest<?> m17926a() {
            return new SingleRequest();
        }
    }

    /* renamed from: a */
    public static <R> SingleRequest<R> m17930a(Context context, C1157e c1157e, Object obj, Class<R> cls, C1313e c1313e, int i, int i2, Priority priority, C3545h<R> c3545h, C1312d<R> c1312d, List<C1312d<R>> list, C1311c c1311c, C3490i c3490i, C1309c<? super R> c1309c) {
        SingleRequest<R> singleRequest = (SingleRequest) f14601a.mo338a();
        if (singleRequest == null) {
            singleRequest = new SingleRequest();
        }
        singleRequest.m17936b(context, c1157e, obj, cls, c1313e, i, i2, priority, c3545h, c1312d, list, c1311c, c3490i, c1309c);
        return singleRequest;
    }

    SingleRequest() {
        this.f14606d = f14602c ? String.valueOf(super.hashCode()) : null;
        this.f14607e = C1170c.m4851a();
    }

    /* renamed from: b */
    private void m17936b(Context context, C1157e c1157e, Object obj, Class<R> cls, C1313e c1313e, int i, int i2, Priority priority, C3545h<R> c3545h, C1312d<R> c1312d, List<C1312d<R>> list, C1311c c1311c, C3490i c3490i, C1309c<? super R> c1309c) {
        this.f14610h = context;
        this.f14611i = c1157e;
        this.f14612j = obj;
        this.f14613k = cls;
        this.f14614l = c1313e;
        this.f14615m = i;
        this.f14616n = i2;
        this.f14617o = priority;
        this.f14618p = c3545h;
        this.f14608f = c1312d;
        this.f14619q = list;
        this.f14609g = c1311c;
        this.f14620r = c3490i;
        this.f14621s = c1309c;
        this.f14625w = Status.PENDING;
    }

    public C1170c e_() {
        return this.f14607e;
    }

    /* renamed from: h */
    public void mo1084h() {
        m17938j();
        this.f14610h = null;
        this.f14611i = null;
        this.f14612j = null;
        this.f14613k = null;
        this.f14614l = null;
        this.f14615m = -1;
        this.f14616n = -1;
        this.f14618p = null;
        this.f14619q = null;
        this.f14608f = null;
        this.f14609g = null;
        this.f14621s = null;
        this.f14623u = null;
        this.f14626x = null;
        this.f14627y = null;
        this.f14628z = null;
        this.f14603A = -1;
        this.f14604B = -1;
        f14601a.mo339a(this);
    }

    /* renamed from: a */
    public void mo1073a() {
        m17938j();
        this.f14607e.mo957b();
        this.f14624v = C1174e.m4866a();
        if (this.f14612j == null) {
            if (C1180j.m4897a(this.f14615m, this.f14616n)) {
                this.f14603A = this.f14615m;
                this.f14604B = this.f14616n;
            }
            m17931a(new GlideException("Received null model"), m17941m() == null ? 5 : 3);
        } else if (this.f14625w == Status.RUNNING) {
            throw new IllegalArgumentException("Cannot restart a running request");
        } else if (this.f14625w == Status.COMPLETE) {
            mo1076a(this.f14622t, DataSource.MEMORY_CACHE);
        } else {
            this.f14625w = Status.WAITING_FOR_SIZE;
            if (C1180j.m4897a(this.f14615m, this.f14616n)) {
                mo1074a(this.f14615m, this.f14616n);
            } else {
                this.f14618p.mo4622a((C1304g) this);
            }
            if ((this.f14625w == Status.RUNNING || this.f14625w == Status.WAITING_FOR_SIZE) && m17945q()) {
                this.f14618p.mo3908b(m17940l());
            }
            if (f14602c) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("finished run method in ");
                stringBuilder.append(C1174e.m4865a(this.f14624v));
                m17934a(stringBuilder.toString());
            }
        }
    }

    /* renamed from: i */
    private void m17937i() {
        m17938j();
        this.f14607e.mo957b();
        this.f14618p.mo4623b((C1304g) this);
        if (this.f14623u != null) {
            this.f14623u.m5138a();
            this.f14623u = null;
        }
    }

    /* renamed from: j */
    private void m17938j() {
        if (this.f14605b) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: b */
    public void mo1078b() {
        C1180j.m4896a();
        m17938j();
        this.f14607e.mo957b();
        if (this.f14625w != Status.CLEARED) {
            m17937i();
            if (this.f14622t != null) {
                m17932a(this.f14622t);
            }
            if (m17944p()) {
                this.f14618p.mo3905a(m17940l());
            }
            this.f14625w = Status.CLEARED;
        }
    }

    /* renamed from: a */
    private void m17932a(C1277s<?> c1277s) {
        this.f14620r.m17704a((C1277s) c1277s);
        this.f14622t = null;
    }

    /* renamed from: c */
    public boolean mo1079c() {
        if (this.f14625w != Status.RUNNING) {
            if (this.f14625w != Status.WAITING_FOR_SIZE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo1080d() {
        return this.f14625w == Status.COMPLETE;
    }

    /* renamed from: e */
    public boolean mo1081e() {
        return mo1080d();
    }

    /* renamed from: f */
    public boolean mo1082f() {
        return this.f14625w == Status.CLEARED;
    }

    /* renamed from: g */
    public boolean mo1083g() {
        return this.f14625w == Status.FAILED;
    }

    /* renamed from: k */
    private Drawable m17939k() {
        if (this.f14626x == null) {
            this.f14626x = this.f14614l.m5336o();
            if (this.f14626x == null && this.f14614l.m5337p() > 0) {
                this.f14626x = m17929a(this.f14614l.m5337p());
            }
        }
        return this.f14626x;
    }

    /* renamed from: l */
    private Drawable m17940l() {
        if (this.f14627y == null) {
            this.f14627y = this.f14614l.m5339r();
            if (this.f14627y == null && this.f14614l.m5338q() > 0) {
                this.f14627y = m17929a(this.f14614l.m5338q());
            }
        }
        return this.f14627y;
    }

    /* renamed from: m */
    private Drawable m17941m() {
        if (this.f14628z == null) {
            this.f14628z = this.f14614l.m5341t();
            if (this.f14628z == null && this.f14614l.m5340s() > 0) {
                this.f14628z = m17929a(this.f14614l.m5340s());
            }
        }
        return this.f14628z;
    }

    /* renamed from: a */
    private Drawable m17929a(int i) {
        return C1281a.m5158a(this.f14611i, i, this.f14614l.m5342u() != null ? this.f14614l.m5342u() : this.f14610h.getTheme());
    }

    /* renamed from: n */
    private void m17942n() {
        if (m17945q()) {
            Drawable drawable = null;
            if (this.f14612j == null) {
                drawable = m17941m();
            }
            if (drawable == null) {
                drawable = m17939k();
            }
            if (drawable == null) {
                drawable = m17940l();
            }
            this.f14618p.mo3909c(drawable);
        }
    }

    /* renamed from: a */
    public void mo1074a(int i, int i2) {
        this.f14607e.mo957b();
        if (f14602c) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Got onSizeReady in ");
            stringBuilder.append(C1174e.m4865a(r15.f14624v));
            m17934a(stringBuilder.toString());
        }
        if (r15.f14625w == Status.WAITING_FOR_SIZE) {
            r15.f14625w = Status.RUNNING;
            float C = r15.f14614l.m5300C();
            r15.f14603A = m17928a(i, C);
            r15.f14604B = m17928a(i2, C);
            if (f14602c) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("finished setup for calling load in ");
                stringBuilder.append(C1174e.m4865a(r15.f14624v));
                m17934a(stringBuilder.toString());
            }
            C3490i c3490i = r15.f14620r;
            this.f14623u = c3490i.m17700a(r15.f14611i, r15.f14612j, r15.f14614l.m5344w(), r15.f14603A, r15.f14604B, r15.f14614l.m5334m(), r15.f14613k, r15.f14617o, r15.f14614l.m5335n(), r15.f14614l.m5331j(), r15.f14614l.m5332k(), r15.f14614l.m5301D(), r15.f14614l.m5333l(), r15.f14614l.m5343v(), r15.f14614l.m5302E(), r15.f14614l.m5303F(), r15.f14614l.m5304G(), this);
            if (this.f14625w != Status.RUNNING) {
                r1.f14623u = null;
            }
            if (f14602c) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("finished onSizeReady in ");
                stringBuilder.append(C1174e.m4865a(r1.f14624v));
                m17934a(stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    private static int m17928a(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* renamed from: o */
    private boolean m17943o() {
        if (this.f14609g != null) {
            if (!this.f14609g.mo1085b(this)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    private boolean m17944p() {
        if (this.f14609g != null) {
            if (!this.f14609g.mo1087d(this)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    private boolean m17945q() {
        if (this.f14609g != null) {
            if (!this.f14609g.mo1086c(this)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    private boolean m17946r() {
        if (this.f14609g != null) {
            if (this.f14609g.mo1090i()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    private void m17947s() {
        if (this.f14609g != null) {
            this.f14609g.mo1088e(this);
        }
    }

    /* renamed from: t */
    private void m17948t() {
        if (this.f14609g != null) {
            this.f14609g.mo1089f(this);
        }
    }

    /* renamed from: a */
    public void mo1076a(C1277s<?> c1277s, DataSource dataSource) {
        this.f14607e.mo957b();
        this.f14623u = null;
        if (c1277s == null) {
            dataSource = new StringBuilder();
            dataSource.append("Expected to receive a Resource<R> with an object of ");
            dataSource.append(this.f14613k);
            dataSource.append(" inside, but instead got null.");
            mo1075a(new GlideException(dataSource.toString()));
            return;
        }
        Object d = c1277s.mo1046d();
        if (d != null) {
            if (this.f14613k.isAssignableFrom(d.getClass())) {
                if (m17943o()) {
                    m17933a(c1277s, d, dataSource);
                    return;
                }
                m17932a((C1277s) c1277s);
                this.f14625w = Status.COMPLETE;
                return;
            }
        }
        m17932a((C1277s) c1277s);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected to receive an object of ");
        stringBuilder.append(this.f14613k);
        stringBuilder.append(" but instead got ");
        stringBuilder.append(d != null ? d.getClass() : "");
        stringBuilder.append("{");
        stringBuilder.append(d);
        stringBuilder.append("} inside Resource{");
        stringBuilder.append(c1277s);
        stringBuilder.append("}.");
        stringBuilder.append(d != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
        mo1075a(new GlideException(stringBuilder.toString()));
    }

    /* renamed from: a */
    private void m17933a(C1277s<R> c1277s, R r, DataSource dataSource) {
        boolean r2 = m17946r();
        this.f14625w = Status.COMPLETE;
        this.f14622t = c1277s;
        if (this.f14611i.m4820d() <= 3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Finished loading ");
            stringBuilder.append(r.getClass().getSimpleName());
            stringBuilder.append(" from ");
            stringBuilder.append(dataSource);
            stringBuilder.append(" for ");
            stringBuilder.append(this.f14612j);
            stringBuilder.append(" with size [");
            stringBuilder.append(this.f14603A);
            stringBuilder.append("x");
            stringBuilder.append(this.f14604B);
            stringBuilder.append("] in ");
            stringBuilder.append(C1174e.m4865a(this.f14624v));
            stringBuilder.append(" ms");
            Log.d("Glide", stringBuilder.toString());
        }
        c1277s = true;
        this.f14605b = true;
        try {
            int i;
            if (this.f14619q != null) {
                i = 0;
                for (C1312d a : this.f14619q) {
                    i |= a.m5287a(r, this.f14612j, this.f14618p, dataSource, r2);
                }
            } else {
                i = 0;
            }
            if (this.f14608f != null) {
                if (this.f14608f.m5287a(r, this.f14612j, this.f14618p, dataSource, r2)) {
                    if ((c1277s | i) == null) {
                        this.f14618p.mo4900a(r, this.f14621s.mo1091a(dataSource, r2));
                    }
                    this.f14605b = false;
                    m17947s();
                }
            }
            c1277s = null;
            if ((c1277s | i) == null) {
                this.f14618p.mo4900a(r, this.f14621s.mo1091a(dataSource, r2));
            }
            this.f14605b = false;
            m17947s();
        } catch (Throwable th) {
            this.f14605b = false;
        }
    }

    /* renamed from: a */
    public void mo1075a(GlideException glideException) {
        m17931a(glideException, 5);
    }

    /* renamed from: a */
    private void m17931a(GlideException glideException, int i) {
        this.f14607e.mo957b();
        int d = this.f14611i.m4820d();
        if (d <= i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Load failed for ");
            stringBuilder.append(this.f14612j);
            stringBuilder.append(" with size [");
            stringBuilder.append(this.f14603A);
            stringBuilder.append("x");
            stringBuilder.append(this.f14604B);
            stringBuilder.append("]");
            Log.w("Glide", stringBuilder.toString(), glideException);
            if (d <= 4) {
                glideException.m5016a("Glide");
            }
        }
        this.f14623u = 0;
        this.f14625w = Status.FAILED;
        i = 1;
        this.f14605b = true;
        try {
            int i2;
            if (this.f14619q != null) {
                i2 = 0;
                for (C1312d a : this.f14619q) {
                    i2 |= a.m5286a(glideException, this.f14612j, this.f14618p, m17946r());
                }
            } else {
                i2 = 0;
            }
            if (this.f14608f == null || this.f14608f.m5286a(glideException, this.f14612j, this.f14618p, m17946r()) == null) {
                i = 0;
            }
            if ((i2 | i) == null) {
                m17942n();
            }
            this.f14605b = false;
            m17948t();
        } catch (Throwable th) {
            this.f14605b = false;
        }
    }

    /* renamed from: a */
    public boolean mo1077a(C1310b c1310b) {
        boolean z = false;
        if (!(c1310b instanceof SingleRequest)) {
            return false;
        }
        SingleRequest singleRequest = (SingleRequest) c1310b;
        if (this.f14615m == singleRequest.f14615m && this.f14616n == singleRequest.f14616n && C1180j.m4902b(this.f14612j, singleRequest.f14612j) && this.f14613k.equals(singleRequest.f14613k) && this.f14614l.equals(singleRequest.f14614l) && this.f14617o == singleRequest.f14617o && m17935a(this, singleRequest) != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m17935a(SingleRequest<?> singleRequest, SingleRequest<?> singleRequest2) {
        if ((singleRequest.f14619q == null ? null : singleRequest.f14619q.size()) == (singleRequest2.f14619q == null ? null : singleRequest2.f14619q.size())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m17934a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" this: ");
        stringBuilder.append(this.f14606d);
        Log.v("Request", stringBuilder.toString());
    }
}
