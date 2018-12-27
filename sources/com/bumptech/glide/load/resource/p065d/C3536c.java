package com.bumptech.glide.load.resource.p065d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import com.bumptech.glide.C1143c;
import com.bumptech.glide.load.C3500h;
import com.bumptech.glide.load.resource.p065d.C1298g.C1295b;
import com.bumptech.glide.p051b.C1129a;
import com.bumptech.glide.p055g.C1178i;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.d.c */
public class C3536c extends Drawable implements Animatable, C1295b {
    /* renamed from: a */
    private final C1294a f14580a;
    /* renamed from: b */
    private boolean f14581b;
    /* renamed from: c */
    private boolean f14582c;
    /* renamed from: d */
    private boolean f14583d;
    /* renamed from: e */
    private boolean f14584e;
    /* renamed from: f */
    private int f14585f;
    /* renamed from: g */
    private int f14586g;
    /* renamed from: h */
    private boolean f14587h;
    /* renamed from: i */
    private Paint f14588i;
    /* renamed from: j */
    private Rect f14589j;

    /* renamed from: com.bumptech.glide.load.resource.d.c$a */
    static final class C1294a extends ConstantState {
        /* renamed from: a */
        final C1298g f4075a;

        public int getChangingConfigurations() {
            return 0;
        }

        C1294a(C1298g c1298g) {
            this.f4075a = c1298g;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable() {
            return new C3536c(this);
        }
    }

    public int getOpacity() {
        return -2;
    }

    public C3536c(Context context, C1129a c1129a, C3500h<Bitmap> c3500h, int i, int i2, Bitmap bitmap) {
        this(new C1294a(new C1298g(C1143c.m4768a(context), c1129a, i, i2, c3500h, bitmap)));
    }

    C3536c(C1294a c1294a) {
        this.f14584e = true;
        this.f14586g = -1;
        this.f14580a = (C1294a) C1178i.m4880a((Object) c1294a);
    }

    /* renamed from: a */
    public int m17902a() {
        return this.f14580a.f4075a.m5245d();
    }

    /* renamed from: b */
    public Bitmap m17904b() {
        return this.f14580a.f4075a.m5238a();
    }

    /* renamed from: a */
    public void m17903a(C3500h<Bitmap> c3500h, Bitmap bitmap) {
        this.f14580a.f4075a.m5239a(c3500h, bitmap);
    }

    /* renamed from: c */
    public ByteBuffer m17905c() {
        return this.f14580a.f4075a.m5247f();
    }

    /* renamed from: d */
    public int m17906d() {
        return this.f14580a.f4075a.m5248g();
    }

    /* renamed from: e */
    public int m17907e() {
        return this.f14580a.f4075a.m5246e();
    }

    /* renamed from: h */
    private void m17896h() {
        this.f14585f = 0;
    }

    public void start() {
        this.f14582c = true;
        m17896h();
        if (this.f14584e) {
            m17897i();
        }
    }

    public void stop() {
        this.f14582c = false;
        m17898j();
    }

    /* renamed from: i */
    private void m17897i() {
        C1178i.m4884a(this.f14583d ^ true, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f14580a.f4075a.m5248g() == 1) {
            invalidateSelf();
        } else if (!this.f14581b) {
            this.f14581b = true;
            this.f14580a.f4075a.m5241a((C1295b) this);
            invalidateSelf();
        }
    }

    /* renamed from: j */
    private void m17898j() {
        this.f14581b = false;
        this.f14580a.f4075a.m5243b(this);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C1178i.m4884a(this.f14583d ^ 1, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f14584e = z;
        if (!z) {
            m17898j();
        } else if (this.f14582c) {
            m17897i();
        }
        return super.setVisible(z, z2);
    }

    public int getIntrinsicWidth() {
        return this.f14580a.f4075a.m5242b();
    }

    public int getIntrinsicHeight() {
        return this.f14580a.f4075a.m5244c();
    }

    public boolean isRunning() {
        return this.f14581b;
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f14587h = true;
    }

    public void draw(Canvas canvas) {
        if (!this.f14583d) {
            if (this.f14587h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m17899k());
                this.f14587h = false;
            }
            canvas.drawBitmap(this.f14580a.f4075a.m5250i(), null, m17899k(), m17900l());
        }
    }

    public void setAlpha(int i) {
        m17900l().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m17900l().setColorFilter(colorFilter);
    }

    /* renamed from: k */
    private Rect m17899k() {
        if (this.f14589j == null) {
            this.f14589j = new Rect();
        }
        return this.f14589j;
    }

    /* renamed from: l */
    private Paint m17900l() {
        if (this.f14588i == null) {
            this.f14588i = new Paint(2);
        }
        return this.f14588i;
    }

    /* renamed from: m */
    private Callback m17901m() {
        Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: f */
    public void mo1071f() {
        if (m17901m() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m17907e() == m17906d() - 1) {
            this.f14585f++;
        }
        if (this.f14586g != -1 && this.f14585f >= this.f14586g) {
            stop();
        }
    }

    public ConstantState getConstantState() {
        return this.f14580a;
    }

    /* renamed from: g */
    public void m17909g() {
        this.f14583d = true;
        this.f14580a.f4075a.m5249h();
    }
}
