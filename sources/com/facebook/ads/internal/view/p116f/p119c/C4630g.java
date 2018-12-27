package com.facebook.ads.internal.view.p116f.p119c;

import android.content.Context;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p091j.C1817f;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.p109b.C1991d;
import com.facebook.ads.internal.view.p109b.C1992e;
import com.facebook.ads.internal.view.p116f.p117a.C3858c;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3875j;

/* renamed from: com.facebook.ads.internal.view.f.c.g */
public class C4630g extends C3858c {
    /* renamed from: a */
    private final ImageView f19202a;
    /* renamed from: b */
    private final C1817f<C3875j> f19203b = new C38961(this);
    /* renamed from: c */
    private final C1817f<C3867b> f19204c = new C38972(this);

    /* renamed from: com.facebook.ads.internal.view.f.c.g$1 */
    class C38961 extends C1817f<C3875j> {
        /* renamed from: a */
        final /* synthetic */ C4630g f15452a;

        C38961(C4630g c4630g) {
            this.f15452a = c4630g;
        }

        /* renamed from: a */
        public Class<C3875j> mo1340a() {
            return C3875j.class;
        }

        /* renamed from: a */
        public void m19345a(C3875j c3875j) {
            this.f15452a.setVisibility(8);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.g$2 */
    class C38972 extends C1817f<C3867b> {
        /* renamed from: a */
        final /* synthetic */ C4630g f15453a;

        C38972(C4630g c4630g) {
            this.f15453a = c4630g;
        }

        /* renamed from: a */
        public Class<C3867b> mo1340a() {
            return C3867b.class;
        }

        /* renamed from: a */
        public void m19348a(C3867b c3867b) {
            this.f15453a.setVisibility(0);
        }
    }

    public C4630g(Context context) {
        super(context);
        this.f19202a = new ImageView(context);
        this.f19202a.setScaleType(ScaleType.FIT_CENTER);
        C1936w.m7328a(this.f19202a, -16777216);
        this.f19202a.setLayoutParams(new LayoutParams(-1, -1));
        addView(this.f19202a);
    }

    /* renamed from: a */
    protected void mo3984a() {
        super.mo3984a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().m6830a(this.f19203b, this.f19204c);
        }
    }

    /* renamed from: a */
    public void m25560a(String str, C1992e c1992e) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        C1991d a = new C1991d(this.f19202a).m7499a();
        if (c1992e != null) {
            a.m7501a(c1992e);
        }
        a.m7503a(str);
    }

    /* renamed from: b */
    protected void mo3985b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().m6832b(this.f19204c, this.f19203b);
        }
        super.mo3985b();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f19202a.layout(0, 0, i3 - i, i4 - i2);
    }

    public void setImage(String str) {
        m25560a(str, null);
    }
}
