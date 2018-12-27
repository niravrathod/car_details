package com.facebook.ads.internal.view.p116f.p119c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.p116f.p117a.C2038a;
import com.facebook.ads.internal.view.p116f.p117a.C3858c;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3868c;
import com.facebook.ads.internal.view.p116f.p118b.C3873h;
import com.facebook.ads.internal.view.p116f.p118b.C3874i;
import com.facebook.ads.internal.view.p116f.p118b.C3875j;
import com.facebook.ads.internal.view.p116f.p118b.C3876k;

/* renamed from: com.facebook.ads.internal.view.f.c.l */
public class C4644l extends C3858c {
    /* renamed from: a */
    private final C3874i f19227a;
    /* renamed from: b */
    private final C3876k f19228b;
    /* renamed from: c */
    private final C3868c f19229c;
    /* renamed from: d */
    private final C2063m f19230d;
    /* renamed from: e */
    private final Paint f19231e;

    /* renamed from: com.facebook.ads.internal.view.f.c.l$4 */
    class C20604 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4644l f6363a;

        C20604(C4644l c4644l) {
            this.f6363a = c4644l;
        }

        public void onClick(View view) {
            if (this.f6363a.getVideoView() != null) {
                switch (this.f6363a.getVideoView().getState()) {
                    case PREPARED:
                    case IDLE:
                    case PAUSED:
                    case PLAYBACK_COMPLETED:
                        this.f6363a.getVideoView().m19255a(C2038a.USER_STARTED);
                        break;
                    case STARTED:
                        this.f6363a.getVideoView().m19258a(true);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.l$1 */
    class C46411 extends C3874i {
        /* renamed from: a */
        final /* synthetic */ C4644l f19224a;

        C46411(C4644l c4644l) {
            this.f19224a = c4644l;
        }

        /* renamed from: a */
        public void m25593a(C3873h c3873h) {
            this.f19224a.f19230d.setChecked(true);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.l$2 */
    class C46422 extends C3876k {
        /* renamed from: a */
        final /* synthetic */ C4644l f19225a;

        C46422(C4644l c4644l) {
            this.f19225a = c4644l;
        }

        /* renamed from: a */
        public void m25595a(C3875j c3875j) {
            this.f19225a.f19230d.setChecked(false);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.l$3 */
    class C46433 extends C3868c {
        /* renamed from: a */
        final /* synthetic */ C4644l f19226a;

        C46433(C4644l c4644l) {
            this.f19226a = c4644l;
        }

        /* renamed from: a */
        public void m25597a(C3867b c3867b) {
            this.f19226a.f19230d.setChecked(true);
        }
    }

    public C4644l(Context context) {
        this(context, false);
    }

    public C4644l(Context context, boolean z) {
        super(context);
        this.f19227a = new C46411(this);
        this.f19228b = new C46422(this);
        this.f19229c = new C46433(this);
        this.f19230d = new C2063m(context, z);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        double d = (double) displayMetrics.density;
        Double.isNaN(d);
        int i = (int) (d * 23.76d);
        double d2 = (double) displayMetrics.density;
        Double.isNaN(d2);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, (int) (d2 * 23.76d));
        layoutParams.addRule(13);
        this.f19230d.setLayoutParams(layoutParams);
        this.f19230d.setChecked(true);
        this.f19231e = new Paint();
        this.f19231e.setStyle(Style.FILL);
        if (z) {
            this.f19231e.setColor(-1728053248);
        } else {
            this.f19231e.setColor(-1);
            this.f19231e.setAlpha(204);
        }
        C1936w.m7328a((View) this, 0);
        addView(this.f19230d);
        setGravity(17);
        double d3 = (double) displayMetrics.density;
        Double.isNaN(d3);
        int i2 = (int) (d3 * 72.0d);
        d3 = (double) displayMetrics.density;
        Double.isNaN(d3);
        LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i2, (int) (d3 * 72.0d));
        layoutParams2.addRule(13);
        setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    protected void mo3984a() {
        super.mo3984a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().m6830a(this.f19227a, this.f19228b, this.f19229c);
        }
        OnClickListener c20604 = new C20604(this);
        this.f19230d.setClickable(false);
        setOnClickListener(c20604);
    }

    /* renamed from: b */
    protected void mo3985b() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().m6832b(this.f19229c, this.f19228b, this.f19227a);
        }
        super.mo3985b();
    }

    protected void onDraw(Canvas canvas) {
        int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2;
        canvas.drawCircle((float) (getPaddingLeft() + min), (float) (getPaddingTop() + min), (float) min, this.f19231e);
        super.onDraw(canvas);
    }
}
