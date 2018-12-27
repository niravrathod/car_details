package com.facebook.ads.internal.view.p116f.p119c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Handler;
import android.view.View;
import com.facebook.ads.internal.view.p116f.C3859a;
import com.facebook.ads.internal.view.p116f.p117a.C2039b;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3868c;
import com.facebook.ads.internal.view.p116f.p118b.C3873h;
import com.facebook.ads.internal.view.p116f.p118b.C3874i;
import com.facebook.ads.internal.view.p116f.p118b.C3875j;
import com.facebook.ads.internal.view.p116f.p118b.C3876k;
import com.facebook.ads.internal.view.p116f.p118b.C3885t;
import com.facebook.ads.internal.view.p116f.p118b.C3886u;

@TargetApi(12)
/* renamed from: com.facebook.ads.internal.view.f.c.d */
public class C3894d implements C2039b {
    /* renamed from: a */
    private final C3874i f15437a;
    /* renamed from: b */
    private final C3876k f15438b;
    /* renamed from: c */
    private final C3868c f15439c;
    /* renamed from: d */
    private final C3886u f15440d;
    /* renamed from: e */
    private final Handler f15441e;
    /* renamed from: f */
    private final boolean f15442f;
    /* renamed from: g */
    private final boolean f15443g;
    /* renamed from: h */
    private View f15444h;
    /* renamed from: i */
    private C2054a f15445i;
    /* renamed from: j */
    private C3859a f15446j;
    /* renamed from: k */
    private boolean f15447k;

    /* renamed from: com.facebook.ads.internal.view.f.c.d$5 */
    class C20535 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C3894d f6349a;

        C20535(C3894d c3894d) {
            this.f6349a = c3894d;
        }

        public void onAnimationEnd(Animator animator) {
            this.f6349a.f15444h.setVisibility(8);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.d$a */
    public enum C2054a {
        VISIBLE,
        INVSIBLE,
        FADE_OUT_ON_PLAY
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.d$1 */
    class C46241 extends C3874i {
        /* renamed from: a */
        final /* synthetic */ C3894d f19191a;

        C46241(C3894d c3894d) {
            this.f19191a = c3894d;
        }

        /* renamed from: a */
        public void m25543a(C3873h c3873h) {
            this.f19191a.m19317a(1, 0);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.d$2 */
    class C46252 extends C3876k {
        /* renamed from: a */
        final /* synthetic */ C3894d f19192a;

        C46252(C3894d c3894d) {
            this.f19192a = c3894d;
        }

        /* renamed from: a */
        public void m25545a(C3875j c3875j) {
            if (this.f19192a.f15447k) {
                if (this.f19192a.f15445i != C2054a.FADE_OUT_ON_PLAY) {
                    if (!this.f19192a.f15442f) {
                        this.f19192a.m19317a(0, 8);
                        return;
                    }
                }
                this.f19192a.f15445i = null;
                this.f19192a.m19323c();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.d$3 */
    class C46263 extends C3868c {
        /* renamed from: a */
        final /* synthetic */ C3894d f19193a;

        C46263(C3894d c3894d) {
            this.f19193a = c3894d;
        }

        /* renamed from: a */
        public void m25547a(C3867b c3867b) {
            if (this.f19193a.f15445i != C2054a.INVSIBLE) {
                this.f19193a.f15444h.setAlpha(1.0f);
                this.f19193a.f15444h.setVisibility(0);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.d$4 */
    class C46274 extends C3886u {
        /* renamed from: a */
        final /* synthetic */ C3894d f19194a;

        /* renamed from: com.facebook.ads.internal.view.f.c.d$4$1 */
        class C20521 extends AnimatorListenerAdapter {
            /* renamed from: a */
            final /* synthetic */ C46274 f6348a;

            /* renamed from: com.facebook.ads.internal.view.f.c.d$4$1$1 */
            class C20511 implements Runnable {
                /* renamed from: a */
                final /* synthetic */ C20521 f6347a;

                C20511(C20521 c20521) {
                    this.f6347a = c20521;
                }

                public void run() {
                    if (!this.f6347a.f6348a.f19194a.f15443g && this.f6347a.f6348a.f19194a.f15447k) {
                        this.f6347a.f6348a.f19194a.m19323c();
                    }
                }
            }

            C20521(C46274 c46274) {
                this.f6348a = c46274;
            }

            public void onAnimationEnd(Animator animator) {
                this.f6348a.f19194a.f15441e.postDelayed(new C20511(this), 2000);
            }
        }

        C46274(C3894d c3894d) {
            this.f19194a = c3894d;
        }

        /* renamed from: a */
        public void m25549a(C3885t c3885t) {
            if (this.f19194a.f15446j != null && c3885t.m19308a().getAction() == 0) {
                this.f19194a.f15441e.removeCallbacksAndMessages(null);
                this.f19194a.m19318a(new C20521(this));
            }
        }
    }

    public C3894d(View view, C2054a c2054a) {
        this(view, c2054a, false);
    }

    public C3894d(View view, C2054a c2054a, boolean z) {
        this(view, c2054a, z, false);
    }

    public C3894d(View view, C2054a c2054a, boolean z, boolean z2) {
        this.f15437a = new C46241(this);
        this.f15438b = new C46252(this);
        this.f15439c = new C46263(this);
        this.f15440d = new C46274(this);
        this.f15447k = true;
        this.f15441e = new Handler();
        this.f15442f = z;
        this.f15443g = z2;
        m19330a(view, c2054a);
    }

    /* renamed from: a */
    private void m19317a(int i, int i2) {
        this.f15441e.removeCallbacksAndMessages(null);
        this.f15444h.clearAnimation();
        this.f15444h.setAlpha((float) i);
        this.f15444h.setVisibility(i2);
    }

    /* renamed from: a */
    private void m19318a(AnimatorListenerAdapter animatorListenerAdapter) {
        this.f15444h.setVisibility(0);
        this.f15444h.animate().alpha(1.0f).setDuration(500).setListener(animatorListenerAdapter);
    }

    /* renamed from: c */
    private void m19323c() {
        this.f15444h.animate().alpha(0.0f).setDuration(500).setListener(new C20535(this));
    }

    /* renamed from: a */
    public void m19330a(View view, C2054a c2054a) {
        int i;
        this.f15445i = c2054a;
        this.f15444h = view;
        this.f15444h.clearAnimation();
        if (c2054a == C2054a.INVSIBLE) {
            this.f15444h.setAlpha(0.0f);
            view = this.f15444h;
            i = 8;
        } else {
            this.f15444h.setAlpha(1.0f);
            view = this.f15444h;
            i = 0;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public void mo1440a(C3859a c3859a) {
        this.f15446j = c3859a;
        c3859a.getEventBus().m6830a(this.f15437a, this.f15438b, this.f15440d, this.f15439c);
    }

    /* renamed from: a */
    public boolean m19332a() {
        return this.f15447k;
    }

    /* renamed from: b */
    public void m19333b() {
        this.f15447k = false;
        m19318a(null);
    }

    /* renamed from: b */
    public void mo1441b(C3859a c3859a) {
        m19317a(1, 0);
        c3859a.getEventBus().m6832b(this.f15439c, this.f15440d, this.f15438b, this.f15437a);
        this.f15446j = null;
    }
}
