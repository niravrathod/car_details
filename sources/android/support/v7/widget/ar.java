package android.support.v7.widget;

import android.support.v7.widget.RecyclerView.C0783i;
import android.support.v7.widget.RecyclerView.C0785k;
import android.support.v7.widget.RecyclerView.C0787m;
import android.support.v7.widget.RecyclerView.C0794r;
import android.support.v7.widget.RecyclerView.C0794r.C0792a;
import android.support.v7.widget.RecyclerView.C0794r.C0793b;
import android.support.v7.widget.RecyclerView.C0795s;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

public abstract class ar extends C0785k {
    /* renamed from: a */
    RecyclerView f13944a;
    /* renamed from: b */
    private Scroller f13945b;
    /* renamed from: c */
    private final C0787m f13946c = new C32591(this);

    /* renamed from: android.support.v7.widget.ar$1 */
    class C32591 extends C0787m {
        /* renamed from: a */
        boolean f13942a = null;
        /* renamed from: b */
        final /* synthetic */ ar f13943b;

        C32591(ar arVar) {
            this.f13943b = arVar;
        }

        /* renamed from: a */
        public void mo786a(RecyclerView recyclerView, int i) {
            super.mo786a(recyclerView, i);
            if (i == 0 && this.f13942a != null) {
                this.f13942a = null;
                this.f13943b.m16761a();
            }
        }

        /* renamed from: a */
        public void mo757a(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f13942a = true;
            }
        }
    }

    /* renamed from: a */
    public abstract int mo3863a(C0783i c0783i, int i, int i2);

    /* renamed from: a */
    public abstract View mo3864a(C0783i c0783i);

    /* renamed from: a */
    public abstract int[] mo3865a(C0783i c0783i, View view);

    /* renamed from: a */
    public boolean mo787a(int i, int i2) {
        C0783i layoutManager = this.f13944a.getLayoutManager();
        boolean z = false;
        if (layoutManager == null || this.f13944a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f13944a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m16757b(layoutManager, i, i2) != 0) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public void m16762a(RecyclerView recyclerView) {
        if (this.f13944a != recyclerView) {
            if (this.f13944a != null) {
                m16758c();
            }
            this.f13944a = recyclerView;
            if (this.f13944a != null) {
                m16756b();
                this.f13945b = new Scroller(this.f13944a.getContext(), new DecelerateInterpolator());
                m16761a();
            }
        }
    }

    /* renamed from: b */
    private void m16756b() {
        if (this.f13944a.getOnFlingListener() == null) {
            this.f13944a.m24639a(this.f13946c);
            this.f13944a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: c */
    private void m16758c() {
        this.f13944a.m24656b(this.f13946c);
        this.f13944a.setOnFlingListener(null);
    }

    /* renamed from: b */
    private boolean m16757b(C0783i c0783i, int i, int i2) {
        if (!(c0783i instanceof C0793b)) {
            return false;
        }
        C0794r c = m16766c(c0783i);
        if (c == null) {
            return false;
        }
        i = mo3863a(c0783i, i, i2);
        if (i == -1) {
            return false;
        }
        c.m3234d(i);
        c0783i.m3055a(c);
        return true;
    }

    /* renamed from: a */
    void m16761a() {
        if (this.f13944a != null) {
            C0783i layoutManager = this.f13944a.getLayoutManager();
            if (layoutManager != null) {
                View a = mo3864a(layoutManager);
                if (a != null) {
                    int[] a2 = mo3865a(layoutManager, a);
                    if (!(a2[0] == 0 && a2[1] == 0)) {
                        this.f13944a.m24630a(a2[0], a2[1]);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    protected C0794r m16766c(C0783i c0783i) {
        return mo3866b(c0783i);
    }

    @Deprecated
    /* renamed from: b */
    protected af mo3866b(C0783i c0783i) {
        if ((c0783i instanceof C0793b) == null) {
            return null;
        }
        return new af(this, this.f13944a.getContext()) {
            /* renamed from: f */
            final /* synthetic */ ar f18647f;

            /* renamed from: a */
            protected void mo765a(View view, C0795s c0795s, C0792a c0792a) {
                if (this.f18647f.f13944a != null) {
                    view = this.f18647f.mo3865a(this.f18647f.f13944a.getLayoutManager(), view);
                    c0795s = view[null];
                    view = view[1];
                    int a = m16681a(Math.max(Math.abs(c0795s), Math.abs(view)));
                    if (a > 0) {
                        c0792a.m3220a(c0795s, view, a, this.b);
                    }
                }
            }

            /* renamed from: a */
            protected float mo3861a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }
        };
    }
}
