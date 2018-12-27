package com.facebook.ads.internal.view.p110c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.internal.p101q.p102a.C1936w;

/* renamed from: com.facebook.ads.internal.view.c.b */
public class C1999b extends RelativeLayout {
    /* renamed from: a */
    private final Paint f6171a = new Paint();
    /* renamed from: b */
    private final RectF f6172b;

    public C1999b(Context context, String str) {
        super(context);
        float f = context.getResources().getDisplayMetrics().density;
        View textView = new TextView(context);
        textView.setTextColor(-16777216);
        textView.setTextSize(16.0f);
        textView.setText(str);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        int i = (int) (f * 6.0f);
        textView.setPadding(i, i, i, i);
        addView(textView);
        this.f6171a.setStyle(Style.FILL);
        this.f6171a.setColor(-1);
        this.f6172b = new RectF();
        C1936w.m7328a((View) this, 0);
    }

    protected void onDraw(Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f6172b.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        f *= 10.0f;
        canvas.drawRoundRect(this.f6172b, f, f, this.f6171a);
        super.onDraw(canvas);
    }
}
