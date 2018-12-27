package com.facebook.ads.internal.view.p110c.p111a;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0787m;
import android.support.v7.widget.RecyclerView.C0794r;
import android.support.v7.widget.af;
import android.view.View;
import com.facebook.ads.internal.p107r.C1958a;
import com.facebook.ads.internal.view.component.p112a.p113a.C3849b;
import com.facebook.ads.internal.view.component.p112a.p113a.C3849b.C2003c;
import com.facebook.ads.internal.view.component.p112a.p113a.C3849b.C2004d;
import com.facebook.ads.internal.view.component.p112a.p113a.C3849b.C2005e;
import com.facebook.ads.internal.view.p110c.p111a.C3841d.C1995a;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.ads.internal.view.c.a.a */
public class C3840a extends C0787m {
    /* renamed from: a */
    private final LinearLayoutManager f15308a;
    /* renamed from: b */
    private final int f15309b;
    /* renamed from: c */
    private final C0794r f15310c;
    /* renamed from: d */
    private final Set<Integer> f15311d = new HashSet();
    /* renamed from: e */
    private List<C1994b> f15312e;
    /* renamed from: f */
    private final C1958a f15313f;
    /* renamed from: g */
    private boolean f15314g = true;
    /* renamed from: h */
    private C1995a f15315h;
    /* renamed from: i */
    private boolean f15316i = true;
    /* renamed from: j */
    private boolean f15317j = true;
    /* renamed from: k */
    private boolean f15318k;
    /* renamed from: l */
    private final C2005e f15319l = new C38371(this);
    /* renamed from: m */
    private final C2003c f15320m = new C38382(this);
    /* renamed from: n */
    private final C2004d f15321n = new C38393(this);

    /* renamed from: com.facebook.ads.internal.view.c.a.a$1 */
    class C38371 implements C2005e {
        /* renamed from: a */
        final /* synthetic */ C3840a f15304a;
        /* renamed from: b */
        private float f15305b = 0.0f;

        C38371(C3840a c3840a) {
            this.f15304a = c3840a;
        }

        /* renamed from: a */
        public float mo1426a() {
            return this.f15305b;
        }

        /* renamed from: a */
        public void mo1427a(float f) {
            this.f15305b = f;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.a.a$2 */
    class C38382 implements C2003c {
        /* renamed from: a */
        final /* synthetic */ C3840a f15306a;

        C38382(C3840a c3840a) {
            this.f15306a = c3840a;
        }

        /* renamed from: a */
        public void mo1428a(int i) {
            this.f15306a.m19146a(i, true);
            if (this.f15306a.m19166f()) {
                this.f15306a.m19163d();
            } else {
                this.f15306a.m19144a(i);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.a.a$3 */
    class C38393 implements C2004d {
        /* renamed from: a */
        final /* synthetic */ C3840a f15307a;

        C38393(C3840a c3840a) {
            this.f15307a = c3840a;
        }

        /* renamed from: a */
        public void mo1429a(View view) {
            C3849b c3849b = (C3849b) view;
            c3849b.m19205h();
            if (this.f15307a.f15318k) {
                this.f15307a.f15317j = true;
            }
            if (this.f15307a.f15313f.m7421b() && ((Integer) c3849b.getTag(-1593835536)).intValue() == 0) {
                this.f15307a.f15313f.m7417a();
            }
        }

        /* renamed from: b */
        public void mo1430b(View view) {
            if (this.f15307a.f15318k) {
                this.f15307a.f15317j = false;
            }
        }
    }

    C3840a(C4813c c4813c, int i, List<C1994b> list, C1958a c1958a) {
        this.f15308a = c4813c.getLayoutManager();
        this.f15309b = i;
        this.f15312e = list;
        this.f15313f = c1958a;
        this.f15310c = new af(c4813c.getContext());
        c4813c.m24639a((C0787m) this);
    }

    /* renamed from: a */
    private C3849b m19142a(int i, int i2) {
        return m19143a(i, i2, true);
    }

    /* renamed from: a */
    private C3849b m19143a(int i, int i2, boolean z) {
        C3849b c3849b = null;
        while (i <= i2) {
            C3849b c3849b2 = (C3849b) this.f15308a.mo680c(i);
            if (c3849b2.m19202e()) {
                return null;
            }
            boolean a = C3840a.m19151a((View) c3849b2);
            if (c3849b == null && c3849b2.m19201d() && a && !this.f15311d.contains(Integer.valueOf(i)) && (!z || C3840a.m19158b(c3849b2))) {
                c3849b = c3849b2;
            }
            if (c3849b2.m19201d() && !a) {
                m19146a(i, false);
            }
            i++;
        }
        return c3849b;
    }

    /* renamed from: a */
    private void m19144a(int i) {
        C3849b a = m19143a(i + 1, this.f15308a.m16409o(), false);
        if (a != null) {
            a.m19203f();
            m19155b(((Integer) a.getTag(-1593835536)).intValue());
        }
    }

    /* renamed from: a */
    private void m19145a(int i, int i2, int i3) {
        if (!m19166f()) {
            return;
        }
        if (this.f15315h != null) {
            int n = this.f15308a.m16408n();
            if (n != -1) {
                i = n;
            } else if (i3 >= 0) {
                i = i2;
            }
            this.f15315h.mo1431a(i);
        }
    }

    /* renamed from: a */
    private void m19146a(int i, boolean z) {
        if (z) {
            this.f15311d.add(Integer.valueOf(i));
        } else {
            this.f15311d.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    private static void m19147a(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.5f);
    }

    /* renamed from: a */
    private void m19150a(C3849b c3849b, boolean z) {
        if (m19166f()) {
            C3840a.m19147a((View) c3849b, z);
        }
        if (!z && c3849b.m19202e()) {
            c3849b.m19204g();
        }
    }

    /* renamed from: a */
    private static boolean m19151a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }

    /* renamed from: a */
    private boolean m19154a(C3849b c3849b) {
        if (!this.f15314g || !c3849b.m19201d()) {
            return false;
        }
        this.f15314g = false;
        return true;
    }

    /* renamed from: b */
    private void m19155b(int i) {
        this.f15310c.m3234d(i);
        this.f15308a.m3055a(this.f15310c);
    }

    /* renamed from: b */
    private void m19156b(int i, int i2) {
        while (i <= i2) {
            m19159c(i);
            i++;
        }
    }

    /* renamed from: b */
    private static boolean m19158b(C3849b c3849b) {
        return ((int) (c3849b.getX() + ((float) c3849b.getWidth()))) <= ((int) (((float) c3849b.getWidth()) * 1.3f));
    }

    /* renamed from: c */
    private void m19159c(int i) {
        C3849b c3849b = (C3849b) this.f15308a.mo680c(i);
        if (C3840a.m19151a((View) c3849b)) {
            m19150a(c3849b, true);
        }
        if (m19154a(c3849b)) {
            this.f15319l.mo1427a(((C1994b) this.f15312e.get(((Integer) c3849b.getTag(-1593835536)).intValue())).m7509c().m6553c().m6508f() ? 1.0f : 0.0f);
        }
    }

    /* renamed from: c */
    private void m19160c(int i, int i2) {
        m19164d(i);
        m19164d(i2);
    }

    /* renamed from: d */
    private void m19163d() {
        int n = this.f15308a.m16408n();
        if (n != -1 && n < this.f15312e.size() - 1) {
            m19155b(n + 1);
        }
    }

    /* renamed from: d */
    private void m19164d(int i) {
        C3849b c3849b = (C3849b) this.f15308a.mo680c(i);
        if (!C3840a.m19151a((View) c3849b)) {
            m19150a(c3849b, false);
        }
    }

    /* renamed from: e */
    private void m19165e() {
        if (this.f15317j) {
            C3849b a = m19142a(this.f15308a.m16407m(), this.f15308a.m16409o());
            if (a != null) {
                a.m19203f();
            }
        }
    }

    /* renamed from: f */
    private boolean m19166f() {
        return this.f15309b == 1;
    }

    /* renamed from: a */
    public C2005e m19167a() {
        return this.f15319l;
    }

    /* renamed from: a */
    public void mo786a(RecyclerView recyclerView, int i) {
        super.mo786a(recyclerView, i);
        if (i == 0) {
            this.f15318k = true;
            m19165e();
        }
    }

    /* renamed from: a */
    public void mo757a(RecyclerView recyclerView, int i, int i2) {
        super.mo757a(recyclerView, i, i2);
        this.f15318k = false;
        if (this.f15316i) {
            this.f15318k = true;
            m19165e();
            this.f15316i = false;
        }
        int m = this.f15308a.m16407m();
        i2 = this.f15308a.m16409o();
        m19160c(m, i2);
        m19156b(m, i2);
        m19145a(m, i2, i);
    }

    /* renamed from: a */
    void m19170a(C1995a c1995a) {
        this.f15315h = c1995a;
    }

    /* renamed from: b */
    public C2003c m19171b() {
        return this.f15320m;
    }

    /* renamed from: c */
    public C2004d m19172c() {
        return this.f15321n;
    }
}
