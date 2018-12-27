package com.facebook.ads.internal.view.p116f.p119c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.p091j.C1817f;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.p116f.p117a.C3858c;
import com.facebook.ads.internal.view.p116f.p118b.C3879n;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.view.f.c.i */
public class C4636i extends C3858c {
    /* renamed from: a */
    private final C2058a f19214a;
    /* renamed from: b */
    private final int f19215b;
    /* renamed from: c */
    private final String f19216c;
    /* renamed from: d */
    private final String f19217d;
    /* renamed from: e */
    private final AtomicBoolean f19218e;
    /* renamed from: f */
    private final C1817f<C3879n> f19219f = new C38981(this);

    /* renamed from: com.facebook.ads.internal.view.f.c.i$2 */
    class C20572 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4636i f6356a;

        C20572(C4636i c4636i) {
            this.f6356a = c4636i;
        }

        public void onClick(View view) {
            if (!this.f6356a.f19218e.get()) {
                Log.i("SkipPlugin", "User clicked skip before the ads is allowed to skip.");
            } else if (this.f6356a.getVideoView() != null) {
                this.f6356a.getVideoView().m19260c();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.i$a */
    private static class C2058a extends TextView {
        /* renamed from: a */
        private final Paint f6357a = new Paint();
        /* renamed from: b */
        private final Paint f6358b;
        /* renamed from: c */
        private final RectF f6359c;

        public C2058a(Context context) {
            super(context);
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            C1936w.m7328a((View) this, 0);
            setTextColor(-3355444);
            setPadding((int) (displayMetrics.density * 9.0f), (int) (displayMetrics.density * 5.0f), (int) (displayMetrics.density * 9.0f), (int) (displayMetrics.density * 5.0f));
            setTextSize(18.0f);
            this.f6357a.setStyle(Style.STROKE);
            this.f6357a.setColor(-10066330);
            this.f6357a.setStrokeWidth(1.0f);
            this.f6357a.setAntiAlias(true);
            this.f6358b = new Paint();
            this.f6358b.setStyle(Style.FILL);
            this.f6358b.setColor(-1895825408);
            this.f6359c = new RectF();
        }

        protected void onDraw(Canvas canvas) {
            if (getText().length() != 0) {
                int width = getWidth();
                int height = getHeight();
                float f = (float) 0;
                this.f6359c.set(f, f, (float) width, (float) height);
                canvas.drawRoundRect(this.f6359c, 6.0f, 6.0f, this.f6358b);
                float f2 = (float) 2;
                this.f6359c.set(f2, f2, (float) (width - 2), (float) (height - 2));
                canvas.drawRoundRect(this.f6359c, 6.0f, 6.0f, this.f6357a);
                super.onDraw(canvas);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.i$1 */
    class C38981 extends C1817f<C3879n> {
        /* renamed from: a */
        final /* synthetic */ C4636i f15454a;

        C38981(C4636i c4636i) {
            this.f15454a = c4636i;
        }

        /* renamed from: a */
        public Class<C3879n> mo1340a() {
            return C3879n.class;
        }

        /* renamed from: a */
        public void m19351a(C3879n c3879n) {
            if (!this.f15454a.f19218e.get()) {
                if (this.f15454a.getVideoView() != null) {
                    int c = this.f15454a.f19215b - (this.f15454a.getVideoView().getCurrentPositionInMillis() / 1000);
                    if (c > 0) {
                        C2058a f = this.f15454a.f19214a;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(this.f15454a.f19216c);
                        stringBuilder.append(' ');
                        stringBuilder.append(c);
                        f.setText(stringBuilder.toString());
                        return;
                    }
                    this.f15454a.f19214a.setText(this.f15454a.f19217d);
                    this.f15454a.f19218e.set(true);
                }
            }
        }
    }

    public C4636i(Context context, int i, String str, String str2) {
        super(context);
        this.f19215b = i;
        this.f19216c = str;
        this.f19217d = str2;
        this.f19218e = new AtomicBoolean(false);
        this.f19214a = new C2058a(context);
        C2058a c2058a = this.f19214a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f19216c);
        stringBuilder.append(' ');
        stringBuilder.append(i);
        c2058a.setText(stringBuilder.toString());
        addView(this.f19214a, new LayoutParams(-2, -2));
    }

    /* renamed from: a */
    public void mo3984a() {
        super.mo3984a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().m6831a(this.f19219f);
        }
        this.f19214a.setOnClickListener(new C20572(this));
    }

    /* renamed from: b */
    public void mo3985b() {
        if (getVideoView() != null) {
            this.f19214a.setOnClickListener(null);
            getVideoView().getEventBus().m6833b(this.f19219f);
        }
        super.mo3985b();
    }
}
