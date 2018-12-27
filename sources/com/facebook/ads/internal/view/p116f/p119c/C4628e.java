package com.facebook.ads.internal.view.p116f.p119c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.p081a.C1712b;
import com.facebook.ads.internal.p081a.C1713c;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.p116f.p117a.C3858c;
import com.facebook.ads.internal.view.p116f.p118b.C3866a;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.view.f.c.e */
public class C4628e extends C3858c {
    /* renamed from: a */
    private final String f19195a;
    /* renamed from: b */
    private final TextView f19196b = new TextView(getContext());
    /* renamed from: c */
    private final C1827c f19197c;
    /* renamed from: d */
    private final String f19198d;
    /* renamed from: e */
    private final Paint f19199e;
    /* renamed from: f */
    private final RectF f19200f;

    /* renamed from: com.facebook.ads.internal.view.f.c.e$1 */
    class C20551 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4628e f6354a;

        C20551(C4628e c4628e) {
            this.f6354a = c4628e;
        }

        public void onClick(View view) {
            if (this.f6354a.getVideoView() != null) {
                Uri parse = Uri.parse(this.f6354a.f19195a);
                this.f6354a.getVideoView().getEventBus().m6829a(new C3866a(parse));
                C1712b a = C1713c.m6462a(this.f6354a.getContext(), this.f6354a.f19197c, this.f6354a.f19198d, parse, new HashMap());
                if (a != null) {
                    a.mo1328b();
                }
            }
        }
    }

    public C4628e(Context context, String str, C1827c c1827c, String str2, String str3) {
        super(context);
        this.f19195a = str;
        this.f19197c = c1827c;
        this.f19198d = str2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f19196b.setTextColor(-3355444);
        this.f19196b.setTextSize(16.0f);
        this.f19196b.setPadding((int) (displayMetrics.density * 6.0f), (int) (displayMetrics.density * 4.0f), (int) (displayMetrics.density * 6.0f), (int) (displayMetrics.density * 4.0f));
        this.f19199e = new Paint();
        this.f19199e.setStyle(Style.FILL);
        this.f19199e.setColor(-16777216);
        this.f19199e.setAlpha(178);
        this.f19200f = new RectF();
        C1936w.m7328a((View) this, 0);
        this.f19196b.setText(str3);
        addView(this.f19196b, new LayoutParams(-2, -2));
    }

    /* renamed from: a */
    protected void mo3984a() {
        super.mo3984a();
        this.f19196b.setOnClickListener(new C20551(this));
    }

    /* renamed from: b */
    protected void mo3985b() {
        this.f19196b.setOnClickListener(null);
        super.mo3985b();
    }

    protected void onDraw(Canvas canvas) {
        this.f19200f.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        canvas.drawRoundRect(this.f19200f, 0.0f, 0.0f, this.f19199e);
        super.onDraw(canvas);
    }
}
