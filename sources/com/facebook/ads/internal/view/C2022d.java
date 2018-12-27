package com.facebook.ads.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.p101q.p102a.C1936w;

/* renamed from: com.facebook.ads.internal.view.d */
public class C2022d extends View {
    /* renamed from: a */
    private Paint f6254a;
    /* renamed from: b */
    private Paint f6255b;
    /* renamed from: c */
    private Paint f6256c;
    /* renamed from: d */
    private int f6257d;
    /* renamed from: e */
    private boolean f6258e;

    public C2022d(Context context) {
        this(context, 60, true);
    }

    public C2022d(Context context, int i, boolean z) {
        super(context);
        this.f6257d = i;
        this.f6258e = z;
        if (z) {
            this.f6254a = new Paint();
            this.f6254a.setColor(-3355444);
            this.f6254a.setStyle(Style.STROKE);
            this.f6254a.setStrokeWidth(3.0f);
            this.f6254a.setAntiAlias(true);
            this.f6255b = new Paint();
            this.f6255b.setColor(-1287371708);
            this.f6255b.setStyle(Style.FILL);
            this.f6255b.setAntiAlias(true);
            this.f6256c = new Paint();
            this.f6256c.setColor(-1);
            this.f6256c.setStyle(Style.STROKE);
            this.f6256c.setStrokeWidth(6.0f);
            this.f6256c.setAntiAlias(true);
        }
        m7582a();
    }

    /* renamed from: a */
    private void m7582a() {
        float f = C1936w.f5934b;
        LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (((float) this.f6257d) * f), (int) (((float) this.f6257d) * f));
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        setLayoutParams(layoutParams);
    }

    protected void onDraw(Canvas canvas) {
        if (this.f6258e) {
            if (canvas.isHardwareAccelerated() && VERSION.SDK_INT < 17) {
                setLayerType(1, null);
            }
            int min = Math.min(canvas.getWidth(), canvas.getHeight());
            int i = min / 2;
            int i2 = (i * 2) / 3;
            float f = (float) i;
            canvas.drawCircle(f, f, (float) i2, this.f6254a);
            canvas.drawCircle(f, f, (float) (i2 - 2), this.f6255b);
            min /= 3;
            float f2 = (float) min;
            float f3 = (float) (min * 2);
            Canvas canvas2 = canvas;
            float f4 = f2;
            float f5 = f3;
            canvas2.drawLine(f2, f4, f3, f5, this.f6256c);
            canvas2.drawLine(f3, f4, f2, f5, this.f6256c);
        }
        super.onDraw(canvas);
    }
}
