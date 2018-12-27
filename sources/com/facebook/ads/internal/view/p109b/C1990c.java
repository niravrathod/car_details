package com.facebook.ads.internal.view.p109b;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.ads.internal.p107r.C1958a;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.view.b.c */
public class C1990c extends Drawable {
    /* renamed from: a */
    private final Paint f6127a = new Paint();
    /* renamed from: b */
    private final Paint f6128b = new Paint();
    /* renamed from: c */
    private final Path f6129c = new Path();
    /* renamed from: d */
    private final TextPaint f6130d = new TextPaint();
    /* renamed from: e */
    private final Paint f6131e = new Paint();
    /* renamed from: f */
    private int f6132f;
    /* renamed from: g */
    private int f6133g;
    /* renamed from: h */
    private String f6134h;
    /* renamed from: i */
    private int f6135i;
    /* renamed from: j */
    private boolean f6136j;
    /* renamed from: k */
    private String f6137k;
    /* renamed from: l */
    private String f6138l;
    /* renamed from: m */
    private long f6139m;
    /* renamed from: n */
    private final Handler f6140n = new Handler();
    /* renamed from: o */
    private WeakReference<C1958a> f6141o;
    /* renamed from: p */
    private final Runnable f6142p = new C19891(this);

    /* renamed from: com.facebook.ads.internal.view.b.c$1 */
    class C19891 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1990c f6126a;

        C19891(C1990c c1990c) {
            this.f6126a = c1990c;
        }

        public void run() {
            this.f6126a.m7489c();
            if (this.f6126a.f6136j) {
                this.f6126a.f6140n.postDelayed(this.f6126a.f6142p, 250);
            }
        }
    }

    public C1990c() {
        this.f6127a.setColor(Color.argb(127, 36, 36, 36));
        this.f6127a.setStyle(Style.FILL_AND_STROKE);
        this.f6128b.setAntiAlias(true);
        this.f6128b.setColor(Color.argb(191, 0, 255, 0));
        this.f6128b.setStrokeWidth(20.0f);
        this.f6128b.setStyle(Style.STROKE);
        this.f6130d.setAntiAlias(true);
        this.f6130d.setColor(-1);
        this.f6130d.setStyle(Style.FILL_AND_STROKE);
        this.f6130d.setTextSize(30.0f);
        this.f6131e.setColor(Color.argb(212, 0, 0, 0));
        this.f6131e.setStyle(Style.FILL_AND_STROKE);
        m7497b();
    }

    /* renamed from: c */
    private void m7489c() {
        String str;
        float f;
        int i;
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f6132f <= 0) {
            if (!TextUtils.isEmpty(this.f6137k)) {
                stringBuilder.append(this.f6137k);
                stringBuilder.append("\n");
            }
            if (!TextUtils.isEmpty(this.f6138l)) {
                stringBuilder.append(this.f6138l);
                stringBuilder.append("\n");
            }
            stringBuilder.append("Sdk ");
            stringBuilder.append("4.99.0");
            stringBuilder.append(", Loaded ");
            if (this.f6139m > 0) {
                long max = Math.max(0, System.currentTimeMillis() - this.f6139m);
                int i2 = (int) (max / 3600000);
                max %= 3600000;
                int i3 = (int) (max / 60000);
                int i4 = (int) ((max % 60000) / 1000);
                if (i2 > 0) {
                    stringBuilder.append(i2);
                    stringBuilder.append("h ");
                }
                if (i2 > 0 || i3 > 0) {
                    stringBuilder.append(i3);
                    stringBuilder.append("m ");
                }
                stringBuilder.append(i4);
                str = "s ago";
            } else {
                str = "Unknown";
            }
            stringBuilder.append(str);
        } else {
            stringBuilder.append("Card ");
            stringBuilder.append(this.f6133g + 1);
            stringBuilder.append(" of ");
            stringBuilder.append(this.f6132f);
        }
        stringBuilder.append("\nView: ");
        if (this.f6141o != null) {
            if (this.f6141o.get() != null) {
                str = ((C1958a) this.f6141o.get()).m7423d();
                stringBuilder.append(str);
                this.f6134h = stringBuilder.toString();
                f = -2.14748365E9f;
                for (String str2 : this.f6134h.split("\n")) {
                    f = Math.max(f, this.f6130d.measureText(str2, 0, str2.length()));
                }
                this.f6135i = (int) (f + 0.5f);
                invalidateSelf();
            }
        }
        str = "Viewability Checker not set";
        stringBuilder.append(str);
        this.f6134h = stringBuilder.toString();
        f = -2.14748365E9f;
        for (i = 0; i < r2; i++) {
            f = Math.max(f, this.f6130d.measureText(str2, 0, str2.length()));
        }
        this.f6135i = (int) (f + 0.5f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void m7491a(int i, int i2) {
        this.f6132f = i;
        this.f6133g = i2;
        m7489c();
    }

    /* renamed from: a */
    public void m7492a(long j) {
        this.f6139m = j;
        m7489c();
    }

    /* renamed from: a */
    public void m7493a(C1958a c1958a) {
        this.f6141o = new WeakReference(c1958a);
        m7489c();
    }

    /* renamed from: a */
    public void m7494a(String str) {
        this.f6137k = str;
        m7489c();
    }

    /* renamed from: a */
    public void m7495a(boolean z) {
        this.f6136j = z;
        if (this.f6136j) {
            this.f6140n.post(this.f6142p);
        } else {
            this.f6140n.removeCallbacks(this.f6142p);
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public boolean m7496a() {
        return this.f6136j;
    }

    /* renamed from: b */
    public void m7497b() {
        this.f6132f = 0;
        this.f6133g = -1;
        this.f6134h = "Initializing...";
        this.f6135i = 100;
        this.f6137k = null;
        this.f6139m = -1;
        this.f6141o = null;
        m7495a(false);
    }

    /* renamed from: b */
    public void m7498b(String str) {
        this.f6138l = str;
        m7489c();
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this.f6136j) {
            float width = (float) canvas.getWidth();
            float height = (float) canvas.getHeight();
            canvas.drawRect(0.0f, 0.0f, width, height, r0.f6127a);
            StaticLayout staticLayout = new StaticLayout(r0.f6134h, r0.f6130d, r0.f6135i, Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            float width2 = ((float) staticLayout.getWidth()) / 2.0f;
            float height2 = ((float) staticLayout.getHeight()) / 2.0f;
            float f3 = f - width2;
            float f4 = f2 - height2;
            StaticLayout staticLayout2 = staticLayout;
            canvas.drawRect(f3 - 40.0f, f4 - 40.0f, (f + width2) + 40.0f, (f2 + height2) + 40.0f, r0.f6131e);
            canvas.save();
            canvas2.translate(f3, f4);
            staticLayout2.draw(canvas2);
            canvas.restore();
            r0.f6129c.reset();
            r0.f6129c.moveTo(0.0f, 0.0f);
            r0.f6129c.lineTo(width, 0.0f);
            r0.f6129c.lineTo(width, height);
            r0.f6129c.lineTo(0.0f, height);
            r0.f6129c.lineTo(0.0f, 0.0f);
            canvas2.drawPath(r0.f6129c, r0.f6128b);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
