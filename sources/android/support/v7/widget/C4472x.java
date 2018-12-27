package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v4.view.C0560r;
import android.support.v7.widget.RecyclerView.C0798v;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v7.widget.x */
public class C4472x extends aq {
    /* renamed from: i */
    private static TimeInterpolator f18651i;
    /* renamed from: a */
    ArrayList<ArrayList<C0798v>> f18652a = new ArrayList();
    /* renamed from: b */
    ArrayList<ArrayList<C0884b>> f18653b = new ArrayList();
    /* renamed from: c */
    ArrayList<ArrayList<C0883a>> f18654c = new ArrayList();
    /* renamed from: d */
    ArrayList<C0798v> f18655d = new ArrayList();
    /* renamed from: e */
    ArrayList<C0798v> f18656e = new ArrayList();
    /* renamed from: f */
    ArrayList<C0798v> f18657f = new ArrayList();
    /* renamed from: g */
    ArrayList<C0798v> f18658g = new ArrayList();
    /* renamed from: j */
    private ArrayList<C0798v> f18659j = new ArrayList();
    /* renamed from: k */
    private ArrayList<C0798v> f18660k = new ArrayList();
    /* renamed from: l */
    private ArrayList<C0884b> f18661l = new ArrayList();
    /* renamed from: m */
    private ArrayList<C0883a> f18662m = new ArrayList();

    /* renamed from: android.support.v7.widget.x$a */
    private static class C0883a {
        /* renamed from: a */
        public C0798v f3004a;
        /* renamed from: b */
        public C0798v f3005b;
        /* renamed from: c */
        public int f3006c;
        /* renamed from: d */
        public int f3007d;
        /* renamed from: e */
        public int f3008e;
        /* renamed from: f */
        public int f3009f;

        private C0883a(C0798v c0798v, C0798v c0798v2) {
            this.f3004a = c0798v;
            this.f3005b = c0798v2;
        }

        C0883a(C0798v c0798v, C0798v c0798v2, int i, int i2, int i3, int i4) {
            this(c0798v, c0798v2);
            this.f3006c = i;
            this.f3007d = i2;
            this.f3008e = i3;
            this.f3009f = i4;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ChangeInfo{oldHolder=");
            stringBuilder.append(this.f3004a);
            stringBuilder.append(", newHolder=");
            stringBuilder.append(this.f3005b);
            stringBuilder.append(", fromX=");
            stringBuilder.append(this.f3006c);
            stringBuilder.append(", fromY=");
            stringBuilder.append(this.f3007d);
            stringBuilder.append(", toX=");
            stringBuilder.append(this.f3008e);
            stringBuilder.append(", toY=");
            stringBuilder.append(this.f3009f);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.v7.widget.x$b */
    private static class C0884b {
        /* renamed from: a */
        public C0798v f3010a;
        /* renamed from: b */
        public int f3011b;
        /* renamed from: c */
        public int f3012c;
        /* renamed from: d */
        public int f3013d;
        /* renamed from: e */
        public int f3014e;

        C0884b(C0798v c0798v, int i, int i2, int i3, int i4) {
            this.f3010a = c0798v;
            this.f3011b = i;
            this.f3012c = i2;
            this.f3013d = i3;
            this.f3014e = i4;
        }
    }

    /* renamed from: a */
    public void mo3867a() {
        int isEmpty = this.f18659j.isEmpty() ^ 1;
        int isEmpty2 = this.f18661l.isEmpty() ^ 1;
        int isEmpty3 = this.f18662m.isEmpty() ^ 1;
        int isEmpty4 = this.f18660k.isEmpty() ^ 1;
        if (isEmpty != 0 || isEmpty2 != 0 || isEmpty4 != 0 || isEmpty3 != 0) {
            final ArrayList arrayList;
            Runnable c08751;
            Iterator it = this.f18659j.iterator();
            while (it.hasNext()) {
                m24736u((C0798v) it.next());
            }
            this.f18659j.clear();
            if (isEmpty2 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.f18661l);
                this.f18653b.add(arrayList);
                this.f18661l.clear();
                c08751 = new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C4472x f2977b;

                    public void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C0884b c0884b = (C0884b) it.next();
                            this.f2977b.m24745b(c0884b.f3010a, c0884b.f3011b, c0884b.f3012c, c0884b.f3013d, c0884b.f3014e);
                        }
                        arrayList.clear();
                        this.f2977b.f18653b.remove(arrayList);
                    }
                };
                if (isEmpty != 0) {
                    C0560r.m2179a(((C0884b) arrayList.get(0)).f3010a.f2560a, c08751, m3001g());
                } else {
                    c08751.run();
                }
            }
            if (isEmpty3 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.f18662m);
                this.f18654c.add(arrayList);
                this.f18662m.clear();
                c08751 = new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C4472x f2979b;

                    public void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            this.f2979b.m24739a((C0883a) it.next());
                        }
                        arrayList.clear();
                        this.f2979b.f18654c.remove(arrayList);
                    }
                };
                if (isEmpty != 0) {
                    C0560r.m2179a(((C0883a) arrayList.get(0)).f3004a.f2560a, c08751, m3001g());
                } else {
                    c08751.run();
                }
            }
            if (isEmpty4 != 0) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f18660k);
                this.f18652a.add(arrayList2);
                this.f18660k.clear();
                Runnable c08773 = new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C4472x f2981b;

                    public void run() {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            this.f2981b.m24749c((C0798v) it.next());
                        }
                        arrayList2.clear();
                        this.f2981b.f18652a.remove(arrayList2);
                    }
                };
                if (isEmpty == 0 && isEmpty2 == 0) {
                    if (isEmpty3 == 0) {
                        c08773.run();
                    }
                }
                long j = 0;
                long g = isEmpty != 0 ? m3001g() : 0;
                long e = isEmpty2 != 0 ? m2998e() : 0;
                if (isEmpty3 != 0) {
                    j = m3003h();
                }
                C0560r.m2179a(((C0798v) arrayList2.get(0)).f2560a, c08773, g + Math.max(e, j));
            }
        }
    }

    /* renamed from: a */
    public boolean mo3868a(C0798v c0798v) {
        m24737v(c0798v);
        this.f18659j.add(c0798v);
        return true;
    }

    /* renamed from: u */
    private void m24736u(final C0798v c0798v) {
        final View view = c0798v.f2560a;
        final ViewPropertyAnimator animate = view.animate();
        this.f18657f.add(c0798v);
        animate.setDuration(m3001g()).alpha(0.0f).setListener(new AnimatorListenerAdapter(this) {
            /* renamed from: d */
            final /* synthetic */ C4472x f2985d;

            public void onAnimationStart(Animator animator) {
                this.f2985d.m16745l(c0798v);
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                view.setAlpha(1.0f);
                this.f2985d.m16742i(c0798v);
                this.f2985d.f18657f.remove(c0798v);
                this.f2985d.m24748c();
            }
        }).start();
    }

    /* renamed from: b */
    public boolean mo3873b(C0798v c0798v) {
        m24737v(c0798v);
        c0798v.f2560a.setAlpha(0.0f);
        this.f18660k.add(c0798v);
        return true;
    }

    /* renamed from: c */
    void m24749c(final C0798v c0798v) {
        final View view = c0798v.f2560a;
        final ViewPropertyAnimator animate = view.animate();
        this.f18655d.add(c0798v);
        animate.alpha(1.0f).setDuration(m2999f()).setListener(new AnimatorListenerAdapter(this) {
            /* renamed from: d */
            final /* synthetic */ C4472x f2989d;

            public void onAnimationStart(Animator animator) {
                this.f2989d.m16747n(c0798v);
            }

            public void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                this.f2989d.m16744k(c0798v);
                this.f2989d.f18655d.remove(c0798v);
                this.f2989d.m24748c();
            }
        }).start();
    }

    /* renamed from: a */
    public boolean mo3869a(C0798v c0798v, int i, int i2, int i3, int i4) {
        View view = c0798v.f2560a;
        int translationX = i + ((int) c0798v.f2560a.getTranslationX());
        int translationY = i2 + ((int) c0798v.f2560a.getTranslationY());
        m24737v(c0798v);
        i = i3 - translationX;
        i2 = i4 - translationY;
        if (i == 0 && i2 == 0) {
            m16743j(c0798v);
            return null;
        }
        if (i != 0) {
            view.setTranslationX((float) (-i));
        }
        if (i2 != 0) {
            view.setTranslationY((float) (-i2));
        }
        this.f18661l.add(new C0884b(c0798v, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: b */
    void m24745b(C0798v c0798v, int i, int i2, int i3, int i4) {
        final View view = c0798v.f2560a;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.f18656e.add(c0798v);
        final C0798v c0798v2 = c0798v;
        animate.setDuration(m2998e()).setListener(new AnimatorListenerAdapter(this) {
            /* renamed from: f */
            final /* synthetic */ C4472x f2995f;

            public void onAnimationStart(Animator animator) {
                this.f2995f.m16746m(c0798v2);
            }

            public void onAnimationCancel(Animator animator) {
                if (i5 != null) {
                    view.setTranslationX(0.0f);
                }
                if (i6 != null) {
                    view.setTranslationY(0.0f);
                }
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                this.f2995f.m16743j(c0798v2);
                this.f2995f.f18656e.remove(c0798v2);
                this.f2995f.m24748c();
            }
        }).start();
    }

    /* renamed from: a */
    public boolean mo3870a(C0798v c0798v, C0798v c0798v2, int i, int i2, int i3, int i4) {
        if (c0798v == c0798v2) {
            return mo3869a(c0798v, i, i2, i3, i4);
        }
        float translationX = c0798v.f2560a.getTranslationX();
        float translationY = c0798v.f2560a.getTranslationY();
        float alpha = c0798v.f2560a.getAlpha();
        m24737v(c0798v);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        c0798v.f2560a.setTranslationX(translationX);
        c0798v.f2560a.setTranslationY(translationY);
        c0798v.f2560a.setAlpha(alpha);
        if (c0798v2 != null) {
            m24737v(c0798v2);
            c0798v2.f2560a.setTranslationX((float) (-i5));
            c0798v2.f2560a.setTranslationY((float) (-i6));
            c0798v2.f2560a.setAlpha(0.0f);
        }
        this.f18662m.add(new C0883a(c0798v, c0798v2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: a */
    void m24739a(final C0883a c0883a) {
        View view;
        C0798v c0798v = c0883a.f3004a;
        View view2 = null;
        if (c0798v == null) {
            view = null;
        } else {
            view = c0798v.f2560a;
        }
        C0798v c0798v2 = c0883a.f3005b;
        if (c0798v2 != null) {
            view2 = c0798v2.f2560a;
        }
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(m3003h());
            this.f18658g.add(c0883a.f3004a);
            duration.translationX((float) (c0883a.f3008e - c0883a.f3006c));
            duration.translationY((float) (c0883a.f3009f - c0883a.f3007d));
            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter(this) {
                /* renamed from: d */
                final /* synthetic */ C4472x f2999d;

                public void onAnimationStart(Animator animator) {
                    this.f2999d.m16735b(c0883a.f3004a, true);
                }

                public void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    this.f2999d.m16729a(c0883a.f3004a, true);
                    this.f2999d.f18658g.remove(c0883a.f3004a);
                    this.f2999d.m24748c();
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.f18658g.add(c0883a.f3005b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m3003h()).alpha(1.0f).setListener(new AnimatorListenerAdapter(this) {
                /* renamed from: d */
                final /* synthetic */ C4472x f3003d;

                public void onAnimationStart(Animator animator) {
                    this.f3003d.m16735b(c0883a.f3005b, false);
                }

                public void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    this.f3003d.m16729a(c0883a.f3005b, false);
                    this.f3003d.f18658g.remove(c0883a.f3005b);
                    this.f3003d.m24748c();
                }
            }).start();
        }
    }

    /* renamed from: a */
    private void m24733a(List<C0883a> list, C0798v c0798v) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0883a c0883a = (C0883a) list.get(size);
            if (m24734a(c0883a, c0798v) && c0883a.f3004a == null && c0883a.f3005b == null) {
                list.remove(c0883a);
            }
        }
    }

    /* renamed from: b */
    private void m24735b(C0883a c0883a) {
        if (c0883a.f3004a != null) {
            m24734a(c0883a, c0883a.f3004a);
        }
        if (c0883a.f3005b != null) {
            m24734a(c0883a, c0883a.f3005b);
        }
    }

    /* renamed from: a */
    private boolean m24734a(C0883a c0883a, C0798v c0798v) {
        boolean z = false;
        if (c0883a.f3005b == c0798v) {
            c0883a.f3005b = null;
        } else if (c0883a.f3004a != c0798v) {
            return false;
        } else {
            c0883a.f3004a = null;
            z = true;
        }
        c0798v.f2560a.setAlpha(1.0f);
        c0798v.f2560a.setTranslationX(0.0f);
        c0798v.f2560a.setTranslationY(0.0f);
        m16729a(c0798v, z);
        return true;
    }

    /* renamed from: d */
    public void mo3875d(C0798v c0798v) {
        int size;
        View view = c0798v.f2560a;
        view.animate().cancel();
        for (size = this.f18661l.size() - 1; size >= 0; size--) {
            if (((C0884b) this.f18661l.get(size)).f3010a == c0798v) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m16743j(c0798v);
                this.f18661l.remove(size);
            }
        }
        m24733a(this.f18662m, c0798v);
        if (this.f18659j.remove(c0798v)) {
            view.setAlpha(1.0f);
            m16742i(c0798v);
        }
        if (this.f18660k.remove(c0798v)) {
            view.setAlpha(1.0f);
            m16744k(c0798v);
        }
        for (size = this.f18654c.size() - 1; size >= 0; size--) {
            List list = (ArrayList) this.f18654c.get(size);
            m24733a(list, c0798v);
            if (list.isEmpty()) {
                this.f18654c.remove(size);
            }
        }
        for (size = this.f18653b.size() - 1; size >= 0; size--) {
            ArrayList arrayList = (ArrayList) this.f18653b.get(size);
            int size2 = arrayList.size() - 1;
            while (size2 >= 0) {
                if (((C0884b) arrayList.get(size2)).f3010a == c0798v) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m16743j(c0798v);
                    arrayList.remove(size2);
                    if (arrayList.isEmpty()) {
                        this.f18653b.remove(size);
                    }
                } else {
                    size2--;
                }
            }
        }
        for (size = this.f18652a.size() - 1; size >= 0; size--) {
            ArrayList arrayList2 = (ArrayList) this.f18652a.get(size);
            if (arrayList2.remove(c0798v)) {
                view.setAlpha(1.0f);
                m16744k(c0798v);
                if (arrayList2.isEmpty()) {
                    this.f18652a.remove(size);
                }
            }
        }
        this.f18657f.remove(c0798v);
        this.f18655d.remove(c0798v);
        this.f18658g.remove(c0798v);
        this.f18656e.remove(c0798v);
        m24748c();
    }

    /* renamed from: v */
    private void m24737v(C0798v c0798v) {
        if (f18651i == null) {
            f18651i = new ValueAnimator().getInterpolator();
        }
        c0798v.f2560a.animate().setInterpolator(f18651i);
        mo3875d(c0798v);
    }

    /* renamed from: b */
    public boolean mo3872b() {
        if (this.f18660k.isEmpty() && this.f18662m.isEmpty() && this.f18661l.isEmpty() && this.f18659j.isEmpty() && this.f18656e.isEmpty() && this.f18657f.isEmpty() && this.f18655d.isEmpty() && this.f18658g.isEmpty() && this.f18653b.isEmpty() && this.f18652a.isEmpty()) {
            if (this.f18654c.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    void m24748c() {
        if (!mo3872b()) {
            m3005i();
        }
    }

    /* renamed from: d */
    public void mo3874d() {
        int size;
        for (size = this.f18661l.size() - 1; size >= 0; size--) {
            C0884b c0884b = (C0884b) this.f18661l.get(size);
            View view = c0884b.f3010a.f2560a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m16743j(c0884b.f3010a);
            this.f18661l.remove(size);
        }
        for (size = this.f18659j.size() - 1; size >= 0; size--) {
            m16742i((C0798v) this.f18659j.get(size));
            this.f18659j.remove(size);
        }
        for (size = this.f18660k.size() - 1; size >= 0; size--) {
            C0798v c0798v = (C0798v) this.f18660k.get(size);
            c0798v.f2560a.setAlpha(1.0f);
            m16744k(c0798v);
            this.f18660k.remove(size);
        }
        for (size = this.f18662m.size() - 1; size >= 0; size--) {
            m24735b((C0883a) this.f18662m.get(size));
        }
        this.f18662m.clear();
        if (mo3872b()) {
            ArrayList arrayList;
            for (size = this.f18653b.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = (ArrayList) this.f18653b.get(size);
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    C0884b c0884b2 = (C0884b) arrayList2.get(size2);
                    View view2 = c0884b2.f3010a.f2560a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m16743j(c0884b2.f3010a);
                    arrayList2.remove(size2);
                    if (arrayList2.isEmpty()) {
                        this.f18653b.remove(arrayList2);
                    }
                }
            }
            for (size = this.f18652a.size() - 1; size >= 0; size--) {
                arrayList = (ArrayList) this.f18652a.get(size);
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    C0798v c0798v2 = (C0798v) arrayList.get(size3);
                    c0798v2.f2560a.setAlpha(1.0f);
                    m16744k(c0798v2);
                    arrayList.remove(size3);
                    if (arrayList.isEmpty()) {
                        this.f18652a.remove(arrayList);
                    }
                }
            }
            for (size = this.f18654c.size() - 1; size >= 0; size--) {
                arrayList = (ArrayList) this.f18654c.get(size);
                for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
                    m24735b((C0883a) arrayList.get(size4));
                    if (arrayList.isEmpty()) {
                        this.f18654c.remove(arrayList);
                    }
                }
            }
            m24740a(this.f18657f);
            m24740a(this.f18656e);
            m24740a(this.f18655d);
            m24740a(this.f18658g);
            m3005i();
        }
    }

    /* renamed from: a */
    void m24740a(List<C0798v> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C0798v) list.get(size)).f2560a.animate().cancel();
        }
    }

    /* renamed from: a */
    public boolean mo3871a(C0798v c0798v, List<Object> list) {
        if (list.isEmpty()) {
            if (super.mo3871a(c0798v, (List) list) == null) {
                return null;
            }
        }
        return true;
    }
}
