package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v7.widget.RecyclerView.C0783i;
import android.support.v7.widget.RecyclerView.C0783i.C0781a;
import android.support.v7.widget.RecyclerView.C0790o;
import android.support.v7.widget.RecyclerView.C0794r;
import android.support.v7.widget.RecyclerView.C0794r.C0793b;
import android.support.v7.widget.RecyclerView.C0795s;
import android.support.v7.widget.RecyclerView.C0798v;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.List;

public class LinearLayoutManager extends C0783i implements C0793b {
    /* renamed from: a */
    private C0759c f13747a;
    /* renamed from: b */
    private boolean f13748b;
    /* renamed from: c */
    private boolean f13749c;
    /* renamed from: d */
    private boolean f13750d;
    /* renamed from: e */
    private boolean f13751e;
    /* renamed from: f */
    private boolean f13752f;
    /* renamed from: g */
    private final C0758b f13753g;
    /* renamed from: h */
    private int f13754h;
    /* renamed from: i */
    int f13755i;
    /* renamed from: j */
    ai f13756j;
    /* renamed from: k */
    boolean f13757k;
    /* renamed from: l */
    int f13758l;
    /* renamed from: m */
    int f13759m;
    /* renamed from: n */
    SavedState f13760n;
    /* renamed from: o */
    final C0757a f13761o;

    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C07561();
        /* renamed from: a */
        int f2435a;
        /* renamed from: b */
        int f2436b;
        /* renamed from: c */
        boolean f2437c;

        /* renamed from: android.support.v7.widget.LinearLayoutManager$SavedState$1 */
        static class C07561 implements Creator<SavedState> {
            C07561() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m2923a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m2924a(i);
            }

            /* renamed from: a */
            public SavedState m2923a(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] m2924a(int i) {
                return new SavedState[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        SavedState(Parcel parcel) {
            this.f2435a = parcel.readInt();
            this.f2436b = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f2437c = z;
        }

        public SavedState(SavedState savedState) {
            this.f2435a = savedState.f2435a;
            this.f2436b = savedState.f2436b;
            this.f2437c = savedState.f2437c;
        }

        /* renamed from: a */
        boolean m2925a() {
            return this.f2435a >= 0;
        }

        /* renamed from: b */
        void m2926b() {
            this.f2435a = -1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2435a);
            parcel.writeInt(this.f2436b);
            parcel.writeInt(this.f2437c);
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$a */
    static class C0757a {
        /* renamed from: a */
        ai f2438a;
        /* renamed from: b */
        int f2439b;
        /* renamed from: c */
        int f2440c;
        /* renamed from: d */
        boolean f2441d;
        /* renamed from: e */
        boolean f2442e;

        C0757a() {
            m2927a();
        }

        /* renamed from: a */
        void m2927a() {
            this.f2439b = -1;
            this.f2440c = Integer.MIN_VALUE;
            this.f2441d = false;
            this.f2442e = false;
        }

        /* renamed from: b */
        void m2930b() {
            int d;
            if (this.f2441d) {
                d = this.f2438a.mo772d();
            } else {
                d = this.f2438a.mo770c();
            }
            this.f2440c = d;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AnchorInfo{mPosition=");
            stringBuilder.append(this.f2439b);
            stringBuilder.append(", mCoordinate=");
            stringBuilder.append(this.f2440c);
            stringBuilder.append(", mLayoutFromEnd=");
            stringBuilder.append(this.f2441d);
            stringBuilder.append(", mValid=");
            stringBuilder.append(this.f2442e);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        /* renamed from: a */
        boolean m2929a(View view, C0795s c0795s) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return (layoutParams.m2940d() || layoutParams.m2942f() < 0 || layoutParams.m2942f() >= c0795s.m3249e()) ? null : true;
        }

        /* renamed from: a */
        public void m2928a(View view, int i) {
            int b = this.f2438a.m3478b();
            if (b >= 0) {
                m2931b(view, i);
                return;
            }
            this.f2439b = i;
            int e;
            if (this.f2441d != 0) {
                i = (this.f2438a.mo772d() - b) - this.f2438a.mo769b(view);
                this.f2440c = this.f2438a.mo772d() - i;
                if (i > 0) {
                    e = this.f2440c - this.f2438a.mo775e(view);
                    b = this.f2438a.mo770c();
                    e -= b + Math.min(this.f2438a.mo767a(view) - b, 0);
                    if (e < 0) {
                        this.f2440c += Math.min(i, -e);
                    }
                }
            } else {
                i = this.f2438a.mo767a(view);
                e = i - this.f2438a.mo770c();
                this.f2440c = i;
                if (e > 0) {
                    view = (this.f2438a.mo772d() - Math.min(0, (this.f2438a.mo772d() - b) - this.f2438a.mo769b(view))) - (i + this.f2438a.mo775e(view));
                    if (view < null) {
                        this.f2440c -= Math.min(e, -view);
                    }
                }
            }
        }

        /* renamed from: b */
        public void m2931b(View view, int i) {
            if (this.f2441d) {
                this.f2440c = this.f2438a.mo769b(view) + this.f2438a.m3478b();
            } else {
                this.f2440c = this.f2438a.mo767a(view);
            }
            this.f2439b = i;
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$b */
    protected static class C0758b {
        /* renamed from: a */
        public int f2443a;
        /* renamed from: b */
        public boolean f2444b;
        /* renamed from: c */
        public boolean f2445c;
        /* renamed from: d */
        public boolean f2446d;

        protected C0758b() {
        }

        /* renamed from: a */
        void m2932a() {
            this.f2443a = 0;
            this.f2444b = false;
            this.f2445c = false;
            this.f2446d = false;
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$c */
    static class C0759c {
        /* renamed from: a */
        boolean f2447a = true;
        /* renamed from: b */
        int f2448b;
        /* renamed from: c */
        int f2449c;
        /* renamed from: d */
        int f2450d;
        /* renamed from: e */
        int f2451e;
        /* renamed from: f */
        int f2452f;
        /* renamed from: g */
        int f2453g;
        /* renamed from: h */
        int f2454h = 0;
        /* renamed from: i */
        boolean f2455i = false;
        /* renamed from: j */
        int f2456j;
        /* renamed from: k */
        List<C0798v> f2457k = null;
        /* renamed from: l */
        boolean f2458l;

        C0759c() {
        }

        /* renamed from: a */
        boolean m2937a(C0795s c0795s) {
            return (this.f2450d < 0 || this.f2450d >= c0795s.m3249e()) ? null : true;
        }

        /* renamed from: a */
        View m2934a(C0790o c0790o) {
            if (this.f2457k != null) {
                return m2933b();
            }
            c0790o = c0790o.m3201c(this.f2450d);
            this.f2450d += this.f2451e;
            return c0790o;
        }

        /* renamed from: b */
        private View m2933b() {
            int size = this.f2457k.size();
            for (int i = 0; i < size; i++) {
                View view = ((C0798v) this.f2457k.get(i)).f2560a;
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if (!layoutParams.m2940d()) {
                    if (this.f2450d == layoutParams.m2942f()) {
                        m2936a(view);
                        return view;
                    }
                }
            }
            return null;
        }

        /* renamed from: a */
        public void m2935a() {
            m2936a(null);
        }

        /* renamed from: a */
        public void m2936a(View view) {
            view = m2938b(view);
            if (view == null) {
                this.f2450d = -1;
            } else {
                this.f2450d = ((LayoutParams) view.getLayoutParams()).m2942f();
            }
        }

        /* renamed from: b */
        public View m2938b(View view) {
            int size = this.f2457k.size();
            View view2 = null;
            int i = BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((C0798v) this.f2457k.get(i2)).f2560a;
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                if (view3 != view) {
                    if (!layoutParams.m2940d()) {
                        int f = (layoutParams.m2942f() - this.f2450d) * this.f2451e;
                        if (f >= 0) {
                            if (f >= i) {
                                continue;
                            } else if (f == 0) {
                                return view3;
                            } else {
                                view2 = view3;
                                i = f;
                            }
                        }
                    }
                }
            }
            return view2;
        }
    }

    /* renamed from: a */
    void mo3854a(C0790o c0790o, C0795s c0795s, C0757a c0757a, int i) {
    }

    /* renamed from: c */
    public boolean mo682c() {
        return true;
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f13755i = 1;
        this.f13749c = false;
        this.f13757k = false;
        this.f13750d = false;
        this.f13751e = true;
        this.f13758l = -1;
        this.f13759m = Integer.MIN_VALUE;
        this.f13760n = null;
        this.f13761o = new C0757a();
        this.f13753g = new C0758b();
        this.f13754h = 2;
        m16379b(i);
        m16381b(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f13755i = 1;
        this.f13749c = false;
        this.f13757k = false;
        this.f13750d = false;
        this.f13751e = true;
        this.f13758l = -1;
        this.f13759m = Integer.MIN_VALUE;
        this.f13760n = null;
        this.f13761o = new C0757a();
        this.f13753g = new C0758b();
        this.f13754h = 2;
        context = C0783i.m3016a(context, attributeSet, i, i2);
        m16379b(context.f2484a);
        m16381b(context.f2486c);
        mo3857a(context.f2487d);
    }

    /* renamed from: a */
    public LayoutParams mo667a() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: a */
    public void mo673a(RecyclerView recyclerView, C0790o c0790o) {
        super.mo673a(recyclerView, c0790o);
        if (this.f13752f != null) {
            m3100c(c0790o);
            c0790o.m3185a();
        }
    }

    /* renamed from: a */
    public void mo675a(AccessibilityEvent accessibilityEvent) {
        super.mo675a(accessibilityEvent);
        if (m3154w() > 0) {
            accessibilityEvent.setFromIndex(m16407m());
            accessibilityEvent.setToIndex(m16409o());
        }
    }

    /* renamed from: d */
    public Parcelable mo685d() {
        if (this.f13760n != null) {
            return new SavedState(this.f13760n);
        }
        Parcelable savedState = new SavedState();
        if (m3154w() > 0) {
            m16403i();
            boolean z = this.f13748b ^ this.f13757k;
            savedState.f2437c = z;
            View O;
            if (z) {
                O = m16330O();
                savedState.f2436b = this.f13756j.mo772d() - this.f13756j.mo769b(O);
                savedState.f2435a = m3110d(O);
            } else {
                O = m16329N();
                savedState.f2435a = m3110d(O);
                savedState.f2436b = this.f13756j.mo767a(O) - this.f13756j.mo770c();
            }
        } else {
            savedState.m2926b();
        }
        return savedState;
    }

    /* renamed from: a */
    public void mo671a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f13760n = (SavedState) parcelable;
            m3147p();
        }
    }

    /* renamed from: e */
    public boolean mo688e() {
        return this.f13755i == 0;
    }

    /* renamed from: f */
    public boolean mo690f() {
        return this.f13755i == 1;
    }

    /* renamed from: a */
    public void mo3857a(boolean z) {
        mo676a(null);
        if (this.f13750d != z) {
            this.f13750d = z;
            m3147p();
        }
    }

    /* renamed from: g */
    public int m16398g() {
        return this.f13755i;
    }

    /* renamed from: b */
    public void m16379b(int i) {
        if (i != 0) {
            if (i != 1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("invalid orientation:");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        mo676a(null);
        if (i != this.f13755i || this.f13756j == null) {
            this.f13756j = ai.m3473a(this, i);
            this.f13761o.f2438a = this.f13756j;
            this.f13755i = i;
            m3147p();
        }
    }

    /* renamed from: M */
    private void m16328M() {
        if (this.f13755i != 1) {
            if (m16402h()) {
                this.f13757k = this.f13749c ^ true;
                return;
            }
        }
        this.f13757k = this.f13749c;
    }

    /* renamed from: b */
    public void m16381b(boolean z) {
        mo676a(null);
        if (z != this.f13749c) {
            this.f13749c = z;
            m3147p();
        }
    }

    /* renamed from: c */
    public View mo680c(int i) {
        int w = m3154w();
        if (w == 0) {
            return 0;
        }
        int d = i - m3110d(m3137j(0));
        if (d >= 0 && d < w) {
            View j = m3137j(d);
            if (m3110d(j) == i) {
                return j;
            }
        }
        return super.mo680c(i);
    }

    /* renamed from: b */
    protected int mo3936b(C0795s c0795s) {
        return c0795s.m3248d() != null ? this.f13756j.mo776f() : null;
    }

    /* renamed from: a */
    public void mo674a(RecyclerView recyclerView, C0795s c0795s, int i) {
        c0795s = new af(recyclerView.getContext());
        c0795s.m3234d(i);
        m3055a((C0794r) c0795s);
    }

    /* renamed from: d */
    public PointF mo684d(int i) {
        if (m3154w() == 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 1;
        if (i < m3110d(m3137j(0))) {
            i2 = 1;
        }
        if (i2 != this.f13757k) {
            i3 = -1;
        }
        if (this.f13755i == 0) {
            return new PointF((float) i3, 0.0f);
        }
        return new PointF(0.0f, (float) i3);
    }

    /* renamed from: c */
    public void mo681c(C0790o c0790o, C0795s c0795s) {
        int i = -1;
        if (!(this.f13760n == null && this.f13758l == -1) && c0795s.m3249e() == 0) {
            m3100c(c0790o);
            return;
        }
        int b;
        int i2;
        View c;
        int a;
        int i3;
        if (this.f13760n != null && this.f13760n.m2925a()) {
            this.f13758l = this.f13760n.f2435a;
        }
        m16403i();
        this.f13747a.f2447a = false;
        m16328M();
        View F = m3030F();
        if (this.f13761o.f2442e && this.f13758l == -1) {
            if (this.f13760n == null) {
                if (F != null && (this.f13756j.mo767a(F) >= this.f13756j.mo772d() || this.f13756j.mo769b(F) <= this.f13756j.mo770c())) {
                    this.f13761o.m2928a(F, m3110d(F));
                }
                b = mo3936b(c0795s);
                if (this.f13747a.f2456j < 0) {
                    i2 = b;
                    b = 0;
                } else {
                    i2 = 0;
                }
                b += this.f13756j.mo770c();
                i2 += this.f13756j.mo778g();
                if (!(!c0795s.m3245a() || this.f13758l == -1 || this.f13759m == Integer.MIN_VALUE)) {
                    c = mo680c(this.f13758l);
                    if (c != null) {
                        if (this.f13757k) {
                            a = this.f13759m - (this.f13756j.mo767a(c) - this.f13756j.mo770c());
                        } else {
                            a = (this.f13756j.mo772d() - this.f13756j.mo769b(c)) - this.f13759m;
                        }
                        if (a <= 0) {
                            b += a;
                        } else {
                            i2 -= a;
                        }
                    }
                }
                if (this.f13761o.f2441d ? this.f13757k : !this.f13757k) {
                    i = 1;
                }
                mo3854a(c0790o, c0795s, this.f13761o, i);
                m3050a(c0790o);
                this.f13747a.f2458l = m16405k();
                this.f13747a.f2455i = c0795s.m3245a();
                if (this.f13761o.f2441d) {
                    m16335a(this.f13761o);
                    this.f13747a.f2454h = i2;
                    m16360a(c0790o, this.f13747a, c0795s, false);
                    i2 = this.f13747a.f2448b;
                    i = this.f13747a.f2450d;
                    if (this.f13747a.f2449c > 0) {
                        b += this.f13747a.f2449c;
                    }
                    m16343b(this.f13761o);
                    this.f13747a.f2454h = b;
                    C0759c c0759c = this.f13747a;
                    c0759c.f2450d += this.f13747a.f2451e;
                    m16360a(c0790o, this.f13747a, c0795s, false);
                    b = this.f13747a.f2448b;
                    if (this.f13747a.f2449c > 0) {
                        i3 = this.f13747a.f2449c;
                        mo3852a(i, i2);
                        this.f13747a.f2454h = i3;
                        m16360a(c0790o, this.f13747a, c0795s, false);
                        i2 = this.f13747a.f2448b;
                    }
                } else {
                    m16343b(this.f13761o);
                    this.f13747a.f2454h = b;
                    m16360a(c0790o, this.f13747a, c0795s, false);
                    b = this.f13747a.f2448b;
                    i = this.f13747a.f2450d;
                    if (this.f13747a.f2449c > 0) {
                        i2 += this.f13747a.f2449c;
                    }
                    m16335a(this.f13761o);
                    this.f13747a.f2454h = i2;
                    C0759c c0759c2 = this.f13747a;
                    c0759c2.f2450d += this.f13747a.f2451e;
                    m16360a(c0790o, this.f13747a, c0795s, false);
                    i2 = this.f13747a.f2448b;
                    if (this.f13747a.f2449c > 0) {
                        i3 = this.f13747a.f2449c;
                        m16350h(i, b);
                        this.f13747a.f2454h = i3;
                        m16360a(c0790o, this.f13747a, c0795s, false);
                        b = this.f13747a.f2448b;
                    }
                }
                if (m3154w() > 0) {
                    if ((this.f13757k ^ this.f13750d) == 0) {
                        i = m16331a(i2, c0790o, c0795s, true);
                        b += i;
                        i2 += i;
                        i = m16341b(b, c0790o, c0795s, false);
                        b += i;
                        i2 += i;
                    } else {
                        i = m16341b(b, c0790o, c0795s, true);
                        b += i;
                        i2 += i;
                        i = m16331a(i2, c0790o, c0795s, false);
                        b += i;
                        i2 += i;
                    }
                }
                m16345b(c0790o, c0795s, b, i2);
                if (c0795s.m3245a() != null) {
                    this.f13756j.m3476a();
                } else {
                    this.f13761o.m2927a();
                }
                this.f13748b = this.f13750d;
            }
        }
        this.f13761o.m2927a();
        this.f13761o.f2441d = this.f13757k ^ this.f13750d;
        m16339a(c0790o, c0795s, this.f13761o);
        this.f13761o.f2442e = true;
        b = mo3936b(c0795s);
        if (this.f13747a.f2456j < 0) {
            i2 = 0;
        } else {
            i2 = b;
            b = 0;
        }
        b += this.f13756j.mo770c();
        i2 += this.f13756j.mo778g();
        c = mo680c(this.f13758l);
        if (c != null) {
            if (this.f13757k) {
                a = this.f13759m - (this.f13756j.mo767a(c) - this.f13756j.mo770c());
            } else {
                a = (this.f13756j.mo772d() - this.f13756j.mo769b(c)) - this.f13759m;
            }
            if (a <= 0) {
                i2 -= a;
            } else {
                b += a;
            }
        }
        i = 1;
        mo3854a(c0790o, c0795s, this.f13761o, i);
        m3050a(c0790o);
        this.f13747a.f2458l = m16405k();
        this.f13747a.f2455i = c0795s.m3245a();
        if (this.f13761o.f2441d) {
            m16335a(this.f13761o);
            this.f13747a.f2454h = i2;
            m16360a(c0790o, this.f13747a, c0795s, false);
            i2 = this.f13747a.f2448b;
            i = this.f13747a.f2450d;
            if (this.f13747a.f2449c > 0) {
                b += this.f13747a.f2449c;
            }
            m16343b(this.f13761o);
            this.f13747a.f2454h = b;
            C0759c c0759c3 = this.f13747a;
            c0759c3.f2450d += this.f13747a.f2451e;
            m16360a(c0790o, this.f13747a, c0795s, false);
            b = this.f13747a.f2448b;
            if (this.f13747a.f2449c > 0) {
                i3 = this.f13747a.f2449c;
                mo3852a(i, i2);
                this.f13747a.f2454h = i3;
                m16360a(c0790o, this.f13747a, c0795s, false);
                i2 = this.f13747a.f2448b;
            }
        } else {
            m16343b(this.f13761o);
            this.f13747a.f2454h = b;
            m16360a(c0790o, this.f13747a, c0795s, false);
            b = this.f13747a.f2448b;
            i = this.f13747a.f2450d;
            if (this.f13747a.f2449c > 0) {
                i2 += this.f13747a.f2449c;
            }
            m16335a(this.f13761o);
            this.f13747a.f2454h = i2;
            C0759c c0759c22 = this.f13747a;
            c0759c22.f2450d += this.f13747a.f2451e;
            m16360a(c0790o, this.f13747a, c0795s, false);
            i2 = this.f13747a.f2448b;
            if (this.f13747a.f2449c > 0) {
                i3 = this.f13747a.f2449c;
                m16350h(i, b);
                this.f13747a.f2454h = i3;
                m16360a(c0790o, this.f13747a, c0795s, false);
                b = this.f13747a.f2448b;
            }
        }
        if (m3154w() > 0) {
            if ((this.f13757k ^ this.f13750d) == 0) {
                i = m16341b(b, c0790o, c0795s, true);
                b += i;
                i2 += i;
                i = m16331a(i2, c0790o, c0795s, false);
                b += i;
                i2 += i;
            } else {
                i = m16331a(i2, c0790o, c0795s, true);
                b += i;
                i2 += i;
                i = m16341b(b, c0790o, c0795s, false);
                b += i;
                i2 += i;
            }
        }
        m16345b(c0790o, c0795s, b, i2);
        if (c0795s.m3245a() != null) {
            this.f13761o.m2927a();
        } else {
            this.f13756j.m3476a();
        }
        this.f13748b = this.f13750d;
    }

    /* renamed from: a */
    public void mo672a(C0795s c0795s) {
        super.mo672a(c0795s);
        this.f13760n = null;
        this.f13758l = -1;
        this.f13759m = Integer.MIN_VALUE;
        this.f13761o.m2927a();
    }

    /* renamed from: b */
    private void m16345b(C0790o c0790o, C0795s c0795s, int i, int i2) {
        LinearLayoutManager linearLayoutManager = this;
        C0790o c0790o2 = c0790o;
        C0795s c0795s2 = c0795s;
        if (!(!c0795s.m3246b() || m3154w() == 0 || c0795s.m3245a())) {
            if (mo678b()) {
                List c = c0790o.m3202c();
                int size = c.size();
                int d = m3110d(m3137j(0));
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    C0798v c0798v = (C0798v) c.get(i5);
                    if (!c0798v.m3298q()) {
                        int i6 = 1;
                        if ((c0798v.i_() < d) != linearLayoutManager.f13757k) {
                            i6 = -1;
                        }
                        if (i6 == -1) {
                            i3 += linearLayoutManager.f13756j.mo775e(c0798v.f2560a);
                        } else {
                            i4 += linearLayoutManager.f13756j.mo775e(c0798v.f2560a);
                        }
                    }
                }
                linearLayoutManager.f13747a.f2457k = c;
                if (i3 > 0) {
                    m16350h(m3110d(m16329N()), i);
                    linearLayoutManager.f13747a.f2454h = i3;
                    linearLayoutManager.f13747a.f2449c = 0;
                    linearLayoutManager.f13747a.m2935a();
                    m16360a(c0790o2, linearLayoutManager.f13747a, c0795s2, false);
                }
                if (i4 > 0) {
                    mo3852a(m3110d(m16330O()), i2);
                    linearLayoutManager.f13747a.f2454h = i4;
                    linearLayoutManager.f13747a.f2449c = 0;
                    linearLayoutManager.f13747a.m2935a();
                    m16360a(c0790o2, linearLayoutManager.f13747a, c0795s2, false);
                }
                linearLayoutManager.f13747a.f2457k = null;
            }
        }
    }

    /* renamed from: a */
    private void m16339a(C0790o c0790o, C0795s c0795s, C0757a c0757a) {
        if (!m16340a(c0795s, c0757a) && m16346b(c0790o, c0795s, c0757a) == null) {
            c0757a.m2930b();
            c0757a.f2439b = this.f13750d != null ? c0795s.m3249e() - 1 : null;
        }
    }

    /* renamed from: b */
    private boolean m16346b(C0790o c0790o, C0795s c0795s, C0757a c0757a) {
        boolean z = false;
        if (m3154w() == 0) {
            return false;
        }
        View F = m3030F();
        if (F != null && c0757a.m2929a(F, c0795s)) {
            c0757a.m2928a(F, m3110d(F));
            return true;
        } else if (this.f13748b != this.f13750d) {
            return false;
        } else {
            View f;
            if (c0757a.f2441d) {
                f = m16347f(c0790o, c0795s);
            } else {
                f = m16348g(c0790o, c0795s);
            }
            if (f == null) {
                return false;
            }
            c0757a.m2931b(f, m3110d(f));
            if (c0795s.m3245a() == null && mo678b() != null) {
                if (this.f13756j.mo767a(f) >= this.f13756j.mo772d() || this.f13756j.mo769b(f) < this.f13756j.mo770c()) {
                    z = true;
                }
                if (z) {
                    if (c0757a.f2441d != null) {
                        c0790o = this.f13756j.mo772d();
                    } else {
                        c0790o = this.f13756j.mo770c();
                    }
                    c0757a.f2440c = c0790o;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private boolean m16340a(C0795s c0795s, C0757a c0757a) {
        boolean z = false;
        if (!c0795s.m3245a()) {
            if (this.f13758l != -1) {
                if (this.f13758l >= 0) {
                    if (this.f13758l < c0795s.m3249e()) {
                        c0757a.f2439b = this.f13758l;
                        if (this.f13760n != null && this.f13760n.m2925a() != null) {
                            c0757a.f2441d = this.f13760n.f2437c;
                            if (c0757a.f2441d != null) {
                                c0757a.f2440c = this.f13756j.mo772d() - this.f13760n.f2436b;
                            } else {
                                c0757a.f2440c = this.f13756j.mo770c() + this.f13760n.f2436b;
                            }
                            return true;
                        } else if (this.f13759m == -2147483648) {
                            View c = mo680c(this.f13758l);
                            if (c == null) {
                                if (m3154w() > null) {
                                    if ((this.f13758l < m3110d((View) m3137j(0)) ? true : null) == this.f13757k) {
                                        z = true;
                                    }
                                    c0757a.f2441d = z;
                                }
                                c0757a.m2930b();
                            } else if (this.f13756j.mo775e(c) > this.f13756j.mo776f()) {
                                c0757a.m2930b();
                                return true;
                            } else if (this.f13756j.mo767a(c) - this.f13756j.mo770c() < 0) {
                                c0757a.f2440c = this.f13756j.mo770c();
                                c0757a.f2441d = false;
                                return true;
                            } else if (this.f13756j.mo772d() - this.f13756j.mo769b(c) < 0) {
                                c0757a.f2440c = this.f13756j.mo772d();
                                c0757a.f2441d = true;
                                return true;
                            } else {
                                if (c0757a.f2441d) {
                                    c0795s = this.f13756j.mo769b(c) + this.f13756j.m3478b();
                                } else {
                                    c0795s = this.f13756j.mo767a(c);
                                }
                                c0757a.f2440c = c0795s;
                            }
                            return true;
                        } else {
                            c0757a.f2441d = this.f13757k;
                            if (this.f13757k != null) {
                                c0757a.f2440c = this.f13756j.mo772d() - this.f13759m;
                            } else {
                                c0757a.f2440c = this.f13756j.mo770c() + this.f13759m;
                            }
                            return true;
                        }
                    }
                }
                this.f13758l = -1;
                this.f13759m = Integer.MIN_VALUE;
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    private int m16331a(int i, C0790o c0790o, C0795s c0795s, boolean z) {
        int d = this.f13756j.mo772d() - i;
        if (d <= 0) {
            return 0;
        }
        c0790o = -m16383c(-d, c0790o, c0795s);
        i += c0790o;
        if (z) {
            int d2 = this.f13756j.mo772d() - i;
            if (d2 > null) {
                this.f13756j.mo768a(d2);
                return d2 + c0790o;
            }
        }
        return c0790o;
    }

    /* renamed from: b */
    private int m16341b(int i, C0790o c0790o, C0795s c0795s, boolean z) {
        int c = i - this.f13756j.mo770c();
        if (c <= 0) {
            return 0;
        }
        c0790o = -m16383c(c, c0790o, c0795s);
        i += c0790o;
        if (z) {
            i -= this.f13756j.mo770c();
            if (i > 0) {
                this.f13756j.mo768a(-i);
                return c0790o - i;
            }
        }
        return c0790o;
    }

    /* renamed from: a */
    private void m16335a(C0757a c0757a) {
        mo3852a(c0757a.f2439b, c0757a.f2440c);
    }

    /* renamed from: a */
    private void mo3852a(int i, int i2) {
        this.f13747a.f2449c = this.f13756j.mo772d() - i2;
        this.f13747a.f2451e = this.f13757k ? -1 : 1;
        this.f13747a.f2450d = i;
        this.f13747a.f2452f = 1;
        this.f13747a.f2448b = i2;
        this.f13747a.f2453g = Integer.MIN_VALUE;
    }

    /* renamed from: b */
    private void m16343b(C0757a c0757a) {
        m16350h(c0757a.f2439b, c0757a.f2440c);
    }

    /* renamed from: h */
    private void m16350h(int i, int i2) {
        this.f13747a.f2449c = i2 - this.f13756j.mo770c();
        this.f13747a.f2450d = i;
        this.f13747a.f2451e = this.f13757k ? 1 : -1;
        this.f13747a.f2452f = -1;
        this.f13747a.f2448b = i2;
        this.f13747a.f2453g = Integer.MIN_VALUE;
    }

    /* renamed from: h */
    protected boolean m16402h() {
        return m3152u() == 1;
    }

    /* renamed from: i */
    void m16403i() {
        if (this.f13747a == null) {
            this.f13747a = m16404j();
        }
    }

    /* renamed from: j */
    C0759c m16404j() {
        return new C0759c();
    }

    /* renamed from: e */
    public void mo687e(int i) {
        this.f13758l = i;
        this.f13759m = Integer.MIN_VALUE;
        if (this.f13760n != 0) {
            this.f13760n.m2926b();
        }
        m3147p();
    }

    /* renamed from: b */
    public void m16380b(int i, int i2) {
        this.f13758l = i;
        this.f13759m = i2;
        if (this.f13760n != 0) {
            this.f13760n.m2926b();
        }
        m3147p();
    }

    /* renamed from: a */
    public int mo666a(int i, C0790o c0790o, C0795s c0795s) {
        if (this.f13755i == 1) {
            return 0;
        }
        return m16383c(i, c0790o, c0795s);
    }

    /* renamed from: b */
    public int mo677b(int i, C0790o c0790o, C0795s c0795s) {
        if (this.f13755i == 0) {
            return 0;
        }
        return m16383c(i, c0790o, c0795s);
    }

    /* renamed from: c */
    public int mo679c(C0795s c0795s) {
        return m16351i(c0795s);
    }

    /* renamed from: d */
    public int mo683d(C0795s c0795s) {
        return m16351i(c0795s);
    }

    /* renamed from: e */
    public int mo686e(C0795s c0795s) {
        return m16353j(c0795s);
    }

    /* renamed from: f */
    public int mo689f(C0795s c0795s) {
        return m16353j(c0795s);
    }

    /* renamed from: g */
    public int mo691g(C0795s c0795s) {
        return m16355k(c0795s);
    }

    /* renamed from: h */
    public int mo692h(C0795s c0795s) {
        return m16355k(c0795s);
    }

    /* renamed from: i */
    private int m16351i(C0795s c0795s) {
        if (m3154w() == 0) {
            return null;
        }
        m16403i();
        return ap.m3529a(c0795s, this.f13756j, m16332a(this.f13751e ^ true, true), m16342b(this.f13751e ^ true, true), this, this.f13751e, this.f13757k);
    }

    /* renamed from: j */
    private int m16353j(C0795s c0795s) {
        if (m3154w() == 0) {
            return null;
        }
        m16403i();
        return ap.m3528a(c0795s, this.f13756j, m16332a(this.f13751e ^ true, true), m16342b(this.f13751e ^ true, true), this, this.f13751e);
    }

    /* renamed from: k */
    private int m16355k(C0795s c0795s) {
        if (m3154w() == 0) {
            return null;
        }
        m16403i();
        return ap.m3530b(c0795s, this.f13756j, m16332a(this.f13751e ^ true, true), m16342b(this.f13751e ^ true, true), this, this.f13751e);
    }

    /* renamed from: a */
    private void m16334a(int i, int i2, boolean z, C0795s c0795s) {
        this.f13747a.f2458l = m16405k();
        this.f13747a.f2454h = mo3936b(c0795s);
        this.f13747a.f2452f = i;
        c0795s = -1;
        View O;
        C0759c c0759c;
        if (i == 1) {
            i = this.f13747a;
            i.f2454h += this.f13756j.mo778g();
            O = m16330O();
            c0759c = this.f13747a;
            if (!this.f13757k) {
                c0795s = true;
            }
            c0759c.f2451e = c0795s;
            this.f13747a.f2450d = m3110d(O) + this.f13747a.f2451e;
            this.f13747a.f2448b = this.f13756j.mo769b(O);
            i = this.f13756j.mo769b(O) - this.f13756j.mo772d();
        } else {
            O = m16329N();
            c0759c = this.f13747a;
            c0759c.f2454h += this.f13756j.mo770c();
            c0759c = this.f13747a;
            if (this.f13757k) {
                c0795s = true;
            }
            c0759c.f2451e = c0795s;
            this.f13747a.f2450d = m3110d(O) + this.f13747a.f2451e;
            this.f13747a.f2448b = this.f13756j.mo767a(O);
            i = (-this.f13756j.mo767a(O)) + this.f13756j.mo770c();
        }
        this.f13747a.f2449c = i2;
        if (z) {
            i2 = this.f13747a;
            i2.f2449c -= i;
        }
        this.f13747a.f2453g = i;
    }

    /* renamed from: k */
    boolean m16405k() {
        return this.f13756j.mo779h() == 0 && this.f13756j.mo774e() == 0;
    }

    /* renamed from: a */
    void mo3856a(C0795s c0795s, C0759c c0759c, C0781a c0781a) {
        int i = c0759c.f2450d;
        if (i >= 0 && i < c0795s.m3249e()) {
            c0781a.mo762b(i, Math.max(null, c0759c.f2453g));
        }
    }

    /* renamed from: a */
    public void mo670a(int i, C0781a c0781a) {
        boolean z;
        int i2;
        int i3 = -1;
        if (this.f13760n == null || !this.f13760n.m2925a()) {
            m16328M();
            z = this.f13757k;
            i2 = this.f13758l == -1 ? z ? i - 1 : 0 : this.f13758l;
        } else {
            z = this.f13760n.f2437c;
            i2 = this.f13760n.f2435a;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f13754h && i2 >= 0 && i2 < i; i4++) {
            c0781a.mo762b(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: f */
    public void mo3935f(int i) {
        this.f13754h = i;
    }

    /* renamed from: a */
    public void mo669a(int i, int i2, C0795s c0795s, C0781a c0781a) {
        if (this.f13755i != 0) {
            i = i2;
        }
        if (m3154w() != 0) {
            if (i != 0) {
                m16403i();
                m16334a(i > 0 ? 1 : -1, Math.abs(i), (boolean) 1, c0795s);
                mo3856a(c0795s, this.f13747a, c0781a);
            }
        }
    }

    /* renamed from: c */
    int m16383c(int i, C0790o c0790o, C0795s c0795s) {
        if (m3154w() != 0) {
            if (i != 0) {
                this.f13747a.f2447a = true;
                m16403i();
                int i2 = i > 0 ? 1 : -1;
                int abs = Math.abs(i);
                m16334a(i2, abs, true, c0795s);
                int a = this.f13747a.f2453g + m16360a(c0790o, this.f13747a, c0795s, false);
                if (a < 0) {
                    return 0;
                }
                if (abs > a) {
                    i = i2 * a;
                }
                this.f13756j.mo768a(-i);
                this.f13747a.f2456j = i;
                return i;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public void mo676a(String str) {
        if (this.f13760n == null) {
            super.mo676a(str);
        }
    }

    /* renamed from: a */
    private void m16337a(C0790o c0790o, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (i2--; i2 >= i; i2--) {
                    m3045a(i2, c0790o);
                }
            } else {
                while (i > i2) {
                    m3045a(i, c0790o);
                    i--;
                }
            }
        }
    }

    /* renamed from: a */
    private void m16336a(C0790o c0790o, int i) {
        if (i >= 0) {
            int w = m3154w();
            if (this.f13757k) {
                w--;
                int i2 = w;
                while (i2 >= 0) {
                    View j = m3137j(i2);
                    if (this.f13756j.mo769b(j) <= i) {
                        if (this.f13756j.mo771c(j) <= i) {
                            i2--;
                        }
                    }
                    m16337a(c0790o, w, i2);
                    return;
                }
            }
            int i3 = 0;
            while (i3 < w) {
                View j2 = m3137j(i3);
                if (this.f13756j.mo769b(j2) <= i) {
                    if (this.f13756j.mo771c(j2) <= i) {
                        i3++;
                    }
                }
                m16337a(c0790o, 0, i3);
                return;
            }
        }
    }

    /* renamed from: b */
    private void m16344b(C0790o c0790o, int i) {
        int w = m3154w();
        if (i >= 0) {
            int e = this.f13756j.mo774e() - i;
            if (this.f13757k != 0) {
                int i2 = 0;
                while (i2 < w) {
                    View j = m3137j(i2);
                    if (this.f13756j.mo767a(j) >= e) {
                        if (this.f13756j.mo773d(j) >= e) {
                            i2++;
                        }
                    }
                    m16337a(c0790o, 0, i2);
                    return;
                }
            }
            w--;
            i = w;
            while (i >= 0) {
                View j2 = m3137j(i);
                if (this.f13756j.mo767a(j2) >= e) {
                    if (this.f13756j.mo773d(j2) >= e) {
                        i--;
                    }
                }
                m16337a(c0790o, w, i);
                return;
            }
        }
    }

    /* renamed from: a */
    private void m16338a(C0790o c0790o, C0759c c0759c) {
        if (c0759c.f2447a) {
            if (!c0759c.f2458l) {
                if (c0759c.f2452f == -1) {
                    m16344b(c0790o, c0759c.f2453g);
                } else {
                    m16336a(c0790o, c0759c.f2453g);
                }
            }
        }
    }

    /* renamed from: a */
    int m16360a(C0790o c0790o, C0759c c0759c, C0795s c0795s, boolean z) {
        int i = c0759c.f2449c;
        if (c0759c.f2453g != Integer.MIN_VALUE) {
            if (c0759c.f2449c < 0) {
                c0759c.f2453g += c0759c.f2449c;
            }
            m16338a(c0790o, c0759c);
        }
        int i2 = c0759c.f2449c + c0759c.f2454h;
        C0758b c0758b = this.f13753g;
        while (true) {
            if ((!c0759c.f2458l && i2 <= 0) || !c0759c.m2937a(c0795s)) {
                break;
            }
            c0758b.m2932a();
            mo3855a(c0790o, c0795s, c0759c, c0758b);
            if (!c0758b.f2444b) {
                c0759c.f2448b += c0758b.f2443a * c0759c.f2452f;
                if (!(c0758b.f2445c && this.f13747a.f2457k == null && c0795s.m3245a())) {
                    c0759c.f2449c -= c0758b.f2443a;
                    i2 -= c0758b.f2443a;
                }
                if (c0759c.f2453g != Integer.MIN_VALUE) {
                    c0759c.f2453g += c0758b.f2443a;
                    if (c0759c.f2449c < 0) {
                        c0759c.f2453g += c0759c.f2449c;
                    }
                    m16338a(c0790o, c0759c);
                }
                if (z && c0758b.f2446d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c0759c.f2449c;
    }

    /* renamed from: a */
    void mo3855a(C0790o c0790o, C0795s c0795s, C0759c c0759c, C0758b c0758b) {
        c0790o = c0759c.m2934a(c0790o);
        if (c0790o == null) {
            c0758b.f2444b = true;
            return;
        }
        int f;
        int i;
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) c0790o.getLayoutParams();
        if (c0759c.f2457k == null) {
            if (this.f13757k == (c0759c.f2452f == -1)) {
                m3093b((View) c0790o);
            } else {
                m3094b((View) c0790o, 0);
            }
        } else {
            if (this.f13757k == (c0759c.f2452f == -1)) {
                m3063a((View) c0790o);
            } else {
                m3064a((View) c0790o, 0);
            }
        }
        m3065a((View) c0790o, 0, 0);
        c0758b.f2443a = this.f13756j.mo775e(c0790o);
        int z;
        if (this.f13755i == 1) {
            if (m16402h()) {
                z = m3157z() - m3028D();
                f = z - this.f13756j.mo777f(c0790o);
            } else {
                f = m3026B();
                z = this.f13756j.mo777f(c0790o) + f;
            }
            if (c0759c.f2452f == -1) {
                i = c0759c.f2448b - c0758b.f2443a;
                i2 = z;
                i3 = c0759c.f2448b;
            } else {
                i3 = c0759c.f2448b + c0758b.f2443a;
                i2 = z;
                i = c0759c.f2448b;
            }
        } else {
            z = m3027C();
            f = this.f13756j.mo777f(c0790o) + z;
            if (c0759c.f2452f == -1) {
                i = z;
                i2 = c0759c.f2448b;
                i3 = f;
                f = c0759c.f2448b - c0758b.f2443a;
            } else {
                i2 = c0759c.f2448b + c0758b.f2443a;
                i = z;
                i3 = f;
                f = c0759c.f2448b;
            }
        }
        m3066a((View) c0790o, f, i, i2, i3);
        if (!(layoutParams.m2940d() == null && layoutParams.m2941e() == null)) {
            c0758b.f2445c = true;
        }
        c0758b.f2446d = c0790o.hasFocusable();
    }

    /* renamed from: l */
    boolean mo693l() {
        return (m3156y() == 1073741824 || m3155x() == 1073741824 || !m3036L()) ? false : true;
    }

    /* renamed from: g */
    int m16399g(int i) {
        int i2 = -1;
        int i3 = Integer.MIN_VALUE;
        if (i == 17) {
            if (this.f13755i != 0) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 33) {
            if (this.f13755i != 1) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 66) {
            if (this.f13755i == 0) {
                i3 = 1;
            }
            return i3;
        } else if (i != 130) {
            switch (i) {
                case 1:
                    return (this.f13755i == 1 || m16402h() == 0) ? -1 : 1;
                case 2:
                    return (this.f13755i == 1 || m16402h() == 0) ? 1 : -1;
                default:
                    return Integer.MIN_VALUE;
            }
        } else {
            if (this.f13755i == 1) {
                i3 = 1;
            }
            return i3;
        }
    }

    /* renamed from: N */
    private View m16329N() {
        return m3137j(this.f13757k ? m3154w() - 1 : 0);
    }

    /* renamed from: O */
    private View m16330O() {
        return m3137j(this.f13757k ? 0 : m3154w() - 1);
    }

    /* renamed from: a */
    private View m16332a(boolean z, boolean z2) {
        if (this.f13757k) {
            return m16362a(m3154w() - 1, -1, z, z2);
        }
        return m16362a(0, m3154w(), z, z2);
    }

    /* renamed from: b */
    private View m16342b(boolean z, boolean z2) {
        if (this.f13757k) {
            return m16362a(0, m3154w(), z, z2);
        }
        return m16362a(m3154w() - 1, -1, z, z2);
    }

    /* renamed from: f */
    private View m16347f(C0790o c0790o, C0795s c0795s) {
        if (this.f13757k) {
            return m16349h(c0790o, c0795s);
        }
        return m16352i(c0790o, c0795s);
    }

    /* renamed from: g */
    private View m16348g(C0790o c0790o, C0795s c0795s) {
        if (this.f13757k) {
            return m16352i(c0790o, c0795s);
        }
        return m16349h(c0790o, c0795s);
    }

    /* renamed from: h */
    private View m16349h(C0790o c0790o, C0795s c0795s) {
        return mo3853a(c0790o, c0795s, 0, m3154w(), c0795s.m3249e());
    }

    /* renamed from: i */
    private View m16352i(C0790o c0790o, C0795s c0795s) {
        return mo3853a(c0790o, c0795s, m3154w() - 1, -1, c0795s.m3249e());
    }

    /* renamed from: a */
    View mo3853a(C0790o c0790o, C0795s c0795s, int i, int i2, int i3) {
        m16403i();
        c0790o = this.f13756j.mo770c();
        c0795s = this.f13756j.mo772d();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View j = m3137j(i);
            int d = m3110d(j);
            if (d >= 0 && d < i3) {
                if (!((LayoutParams) j.getLayoutParams()).m2940d()) {
                    if (this.f13756j.mo767a(j) < c0795s) {
                        if (this.f13756j.mo769b(j) >= c0790o) {
                            return j;
                        }
                    }
                    if (view == null) {
                        view = j;
                    }
                } else if (view2 == null) {
                    view2 = j;
                }
            }
            i += i4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    /* renamed from: j */
    private View m16354j(C0790o c0790o, C0795s c0795s) {
        if (this.f13757k) {
            return m16357l(c0790o, c0795s);
        }
        return m16358m(c0790o, c0795s);
    }

    /* renamed from: k */
    private View m16356k(C0790o c0790o, C0795s c0795s) {
        if (this.f13757k) {
            return m16358m(c0790o, c0795s);
        }
        return m16357l(c0790o, c0795s);
    }

    /* renamed from: l */
    private View m16357l(C0790o c0790o, C0795s c0795s) {
        return m16386c((int) null, m3154w());
    }

    /* renamed from: m */
    private View m16358m(C0790o c0790o, C0795s c0795s) {
        return m16386c(m3154w() - 1, -1);
    }

    /* renamed from: m */
    public int m16407m() {
        View a = m16362a(0, m3154w(), false, true);
        if (a == null) {
            return -1;
        }
        return m3110d(a);
    }

    /* renamed from: n */
    public int m16408n() {
        View a = m16362a(0, m3154w(), true, false);
        if (a == null) {
            return -1;
        }
        return m3110d(a);
    }

    /* renamed from: o */
    public int m16409o() {
        View a = m16362a(m3154w() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return m3110d(a);
    }

    /* renamed from: a */
    View m16362a(int i, int i2, boolean z, boolean z2) {
        m16403i();
        int i3 = 320;
        z = z ? true : true;
        if (!z2) {
            i3 = 0;
        }
        if (this.f13755i) {
            return this.s.m3588a(i, i2, z, i3);
        }
        return this.r.m3588a(i, i2, z, i3);
    }

    /* renamed from: c */
    View m16386c(int i, int i2) {
        m16403i();
        Object obj = i2 > i ? 1 : i2 < i ? -1 : null;
        if (obj == null) {
            return m3137j(i);
        }
        int i3;
        int i4;
        if (this.f13756j.mo767a(m3137j(i)) < this.f13756j.mo770c()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.f13755i == 0) {
            i = this.r.m3588a(i, i2, i3, i4);
        } else {
            i = this.s.m3588a(i, i2, i3, i4);
        }
        return i;
    }

    /* renamed from: a */
    public View mo668a(View view, int i, C0790o c0790o, C0795s c0795s) {
        m16328M();
        if (m3154w() == null) {
            return null;
        }
        int g = m16399g(i);
        if (g == -2147483648) {
            return null;
        }
        m16403i();
        m16403i();
        m16334a(g, (int) (((float) this.f13756j.mo776f()) * 0.33333334f), false, c0795s);
        this.f13747a.f2453g = Integer.MIN_VALUE;
        this.f13747a.f2447a = false;
        m16360a(c0790o, this.f13747a, c0795s, true);
        if (g == -1) {
            c0790o = m16356k(c0790o, c0795s);
        } else {
            c0790o = m16354j(c0790o, c0795s);
        }
        if (g == -1) {
            view = m16329N();
        } else {
            view = m16330O();
        }
        if (view.hasFocusable() == 0) {
            return c0790o;
        }
        if (c0790o == null) {
            return null;
        }
        return view;
    }

    /* renamed from: b */
    public boolean mo678b() {
        return this.f13760n == null && this.f13748b == this.f13750d;
    }
}
