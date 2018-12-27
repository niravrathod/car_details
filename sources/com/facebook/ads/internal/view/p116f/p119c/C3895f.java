package com.facebook.ads.internal.view.p116f.p119c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.facebook.ads.internal.p101q.p103b.C1940b;
import com.facebook.ads.internal.p101q.p103b.C1941c;
import com.facebook.ads.internal.view.p116f.C3859a;
import com.facebook.ads.internal.view.p116f.p117a.C2039b;
import com.facebook.ads.internal.view.p116f.p118b.C3887v;
import com.facebook.ads.internal.view.p116f.p118b.C3888w;

/* renamed from: com.facebook.ads.internal.view.f.c.f */
public class C3895f extends ImageView implements C2039b {
    /* renamed from: a */
    private static final int f15448a = ((int) (Resources.getSystem().getDisplayMetrics().density * 4.0f));
    /* renamed from: b */
    private final Paint f15449b = new Paint();
    /* renamed from: c */
    private C3859a f15450c;
    /* renamed from: d */
    private final C3888w f15451d = new C46291(this);

    /* renamed from: com.facebook.ads.internal.view.f.c.f$2 */
    class C20562 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C3895f f6355a;

        C20562(C3895f c3895f) {
            this.f6355a = c3895f;
        }

        public void onClick(View view) {
            if (this.f6355a.f15450c != null) {
                C3859a a;
                float f;
                if (this.f6355a.m19336b()) {
                    a = this.f6355a.f15450c;
                    f = 1.0f;
                } else {
                    a = this.f6355a.f15450c;
                    f = 0.0f;
                }
                a.setVolume(f);
                this.f6355a.m19340a();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.f$1 */
    class C46291 extends C3888w {
        /* renamed from: a */
        final /* synthetic */ C3895f f19201a;

        C46291(C3895f c3895f) {
            this.f19201a = c3895f;
        }

        /* renamed from: a */
        public void m25558a(C3887v c3887v) {
            this.f19201a.m19340a();
        }
    }

    public C3895f(Context context) {
        super(context);
        this.f15449b.setColor(-1728053248);
        setColorFilter(-1);
        setPadding(f15448a, f15448a, f15448a, f15448a);
        m19338c();
        setOnClickListener(new C20562(this));
    }

    /* renamed from: b */
    private boolean m19336b() {
        return this.f15450c != null && this.f15450c.getVolume() == 0.0f;
    }

    /* renamed from: c */
    private void m19338c() {
        setImageBitmap(C1941c.m7340a(C1940b.SOUND_ON));
    }

    /* renamed from: d */
    private void m19339d() {
        setImageBitmap(C1941c.m7340a(C1940b.SOUND_OFF));
    }

    /* renamed from: a */
    public final void m19340a() {
        if (this.f15450c != null) {
            if (m19336b()) {
                m19339d();
            } else {
                m19338c();
            }
        }
    }

    /* renamed from: a */
    public void mo1440a(C3859a c3859a) {
        this.f15450c = c3859a;
        if (this.f15450c != null) {
            this.f15450c.getEventBus().m6831a(this.f15451d);
        }
    }

    /* renamed from: b */
    public void mo1441b(C3859a c3859a) {
        if (this.f15450c != null) {
            this.f15450c.getEventBus().m6833b(this.f15451d);
        }
        this.f15450c = null;
    }

    protected void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        canvas.drawCircle((float) width, (float) height, (float) Math.min(width, height), this.f15449b);
        super.onDraw(canvas);
    }
}
