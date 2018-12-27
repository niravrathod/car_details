package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.model.C0989e;
import com.airbnb.lottie.model.layer.C4772b;
import com.airbnb.lottie.p034b.C0926a;
import com.airbnb.lottie.p034b.C0927b;
import com.airbnb.lottie.p035c.C0943s;
import com.airbnb.lottie.p036d.C0953e;
import com.airbnb.lottie.p036d.C3304c;
import com.airbnb.lottie.p037e.C0961c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.airbnb.lottie.f */
public class C0966f extends Drawable implements Animatable, Callback {
    /* renamed from: c */
    private static final String f3188c = "f";
    /* renamed from: a */
    C0925a f3189a;
    /* renamed from: b */
    C1001o f3190b;
    /* renamed from: d */
    private final Matrix f3191d = new Matrix();
    /* renamed from: e */
    private C0955d f3192e;
    /* renamed from: f */
    private final C3304c f3193f = new C3304c();
    /* renamed from: g */
    private float f3194g = 1.0f;
    /* renamed from: h */
    private final Set<Object> f3195h = new HashSet();
    /* renamed from: i */
    private final ArrayList<C0965a> f3196i = new ArrayList();
    /* renamed from: j */
    private C0927b f3197j;
    /* renamed from: k */
    private String f3198k;
    /* renamed from: l */
    private C0928b f3199l;
    /* renamed from: m */
    private C0926a f3200m;
    /* renamed from: n */
    private boolean f3201n;
    /* renamed from: o */
    private C4772b f3202o;
    /* renamed from: p */
    private int f3203p = 255;
    /* renamed from: q */
    private boolean f3204q;

    /* renamed from: com.airbnb.lottie.f$1 */
    class C09641 implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C0966f f3187a;

        C09641(C0966f c0966f) {
            this.f3187a = c0966f;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f3187a.f3202o != null) {
                this.f3187a.f3202o.mo4618a(this.f3187a.f3193f.m17000d());
            }
        }
    }

    /* renamed from: com.airbnb.lottie.f$a */
    private interface C0965a {
        /* renamed from: a */
        void mo876a(C0955d c0955d);
    }

    /* renamed from: com.airbnb.lottie.f$5 */
    class C33105 implements C0965a {
        /* renamed from: a */
        final /* synthetic */ C0966f f14060a;

        C33105(C0966f c0966f) {
            this.f14060a = c0966f;
        }

        /* renamed from: a */
        public void mo876a(C0955d c0955d) {
            this.f14060a.m4190f();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public C0966f() {
        this.f3193f.addUpdateListener(new C09641(this));
    }

    /* renamed from: a */
    public boolean m4174a() {
        return this.f3201n;
    }

    /* renamed from: a */
    public void m4173a(boolean z) {
        if (this.f3201n != z) {
            if (VERSION.SDK_INT < 19) {
                Log.w(f3188c, "Merge paths are not supported pre-Kit Kat.");
                return;
            }
            this.f3201n = z;
            if (this.f3192e) {
                m4157u();
            }
        }
    }

    /* renamed from: a */
    public void m4172a(String str) {
        this.f3198k = str;
    }

    /* renamed from: b */
    public String m4177b() {
        return this.f3198k;
    }

    /* renamed from: c */
    public void m4181c() {
        if (this.f3197j != null) {
            this.f3197j.m4016a();
        }
    }

    /* renamed from: a */
    public boolean m4175a(C0955d c0955d) {
        if (this.f3192e == c0955d) {
            return null;
        }
        m4187e();
        this.f3192e = c0955d;
        m4157u();
        this.f3193f.m16996a(c0955d);
        m4185d(this.f3193f.getAnimatedFraction());
        m4188e(this.f3194g);
        m4158v();
        Iterator it = new ArrayList(this.f3196i).iterator();
        while (it.hasNext()) {
            ((C0965a) it.next()).mo876a(c0955d);
            it.remove();
        }
        this.f3196i.clear();
        c0955d.m4113a(this.f3204q);
        return true;
    }

    /* renamed from: b */
    public void m4180b(boolean z) {
        this.f3204q = z;
        if (this.f3192e != null) {
            this.f3192e.m4113a(z);
        }
    }

    /* renamed from: d */
    public C0976l m4184d() {
        return this.f3192e != null ? this.f3192e.m4109a() : null;
    }

    /* renamed from: u */
    private void m4157u() {
        this.f3202o = new C4772b(this, C0943s.m4066a(this.f3192e), this.f3192e.m4120g(), this.f3192e);
    }

    /* renamed from: e */
    public void m4187e() {
        m4181c();
        if (this.f3193f.isRunning()) {
            this.f3193f.cancel();
        }
        this.f3192e = null;
        this.f3202o = null;
        this.f3197j = null;
        this.f3193f.m17002f();
        invalidateSelf();
    }

    public void invalidateSelf() {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void setAlpha(int i) {
        this.f3203p = i;
    }

    public int getAlpha() {
        return this.f3203p;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Log.w("LOTTIE", "Use addColorFilter instead.");
    }

    public void draw(Canvas canvas) {
        C0949c.m4078c("Drawable#draw");
        if (this.f3202o != null) {
            float f = this.f3194g;
            float a = m4154a(canvas);
            if (f > a) {
                f = this.f3194g / a;
            } else {
                a = f;
                f = 1.0f;
            }
            if (f > 1.0f) {
                canvas.save();
                float width = ((float) this.f3192e.m4114b().width()) / 2.0f;
                float height = ((float) this.f3192e.m4114b().height()) / 2.0f;
                float f2 = width * a;
                float f3 = height * a;
                canvas.translate((m4201q() * width) - f2, (m4201q() * height) - f3);
                canvas.scale(f, f, f2, f3);
            }
            this.f3191d.reset();
            this.f3191d.preScale(a, a);
            this.f3202o.mo3883a(canvas, this.f3191d, this.f3203p);
            C0949c.m4079d("Drawable#draw");
            if (f > 1.0f) {
                canvas.restore();
            }
        }
    }

    public void start() {
        m4190f();
    }

    public void stop() {
        m4191g();
    }

    public boolean isRunning() {
        return m4198n();
    }

    /* renamed from: f */
    public void m4190f() {
        if (this.f3202o == null) {
            this.f3196i.add(new C33105(this));
        } else {
            this.f3193f.m17005i();
        }
    }

    /* renamed from: g */
    public void m4191g() {
        this.f3196i.clear();
        this.f3193f.m17006j();
    }

    /* renamed from: a */
    public void m4166a(final int i) {
        if (this.f3192e == null) {
            this.f3196i.add(new C0965a(this) {
                /* renamed from: b */
                final /* synthetic */ C0966f f14062b;

                /* renamed from: a */
                public void mo876a(C0955d c0955d) {
                    this.f14062b.m4166a(i);
                }
            });
        } else {
            this.f3193f.m16997b(i);
        }
    }

    /* renamed from: h */
    public float m4192h() {
        return this.f3193f.m17007k();
    }

    /* renamed from: a */
    public void m4164a(final float f) {
        if (this.f3192e == null) {
            this.f3196i.add(new C0965a(this) {
                /* renamed from: b */
                final /* synthetic */ C0966f f14064b;

                /* renamed from: a */
                public void mo876a(C0955d c0955d) {
                    this.f14064b.m4164a(f);
                }
            });
        } else {
            m4166a((int) C0953e.m4090a(this.f3192e.m4117d(), this.f3192e.m4118e(), f));
        }
    }

    /* renamed from: b */
    public void m4179b(final int i) {
        if (this.f3192e == null) {
            this.f3196i.add(new C0965a(this) {
                /* renamed from: b */
                final /* synthetic */ C0966f f14066b;

                /* renamed from: a */
                public void mo876a(C0955d c0955d) {
                    this.f14066b.m4179b(i);
                }
            });
        } else {
            this.f3193f.m16998c(i);
        }
    }

    /* renamed from: i */
    public float m4193i() {
        return this.f3193f.m17008l();
    }

    /* renamed from: b */
    public void m4178b(final float f) {
        if (this.f3192e == null) {
            this.f3196i.add(new C0965a(this) {
                /* renamed from: b */
                final /* synthetic */ C0966f f14068b;

                /* renamed from: a */
                public void mo876a(C0955d c0955d) {
                    this.f14068b.m4178b(f);
                }
            });
        } else {
            m4179b((int) C0953e.m4090a(this.f3192e.m4117d(), this.f3192e.m4118e(), f));
        }
    }

    /* renamed from: a */
    public void m4167a(final int i, final int i2) {
        if (this.f3192e == null) {
            this.f3196i.add(new C0965a(this) {
                /* renamed from: c */
                final /* synthetic */ C0966f f14048c;

                /* renamed from: a */
                public void mo876a(C0955d c0955d) {
                    this.f14048c.m4167a(i, i2);
                }
            });
        } else {
            this.f3193f.m16995a(i, i2);
        }
    }

    /* renamed from: a */
    public void m4165a(final float f, final float f2) {
        if (this.f3192e == null) {
            this.f3196i.add(new C0965a(this) {
                /* renamed from: c */
                final /* synthetic */ C0966f f14051c;

                /* renamed from: a */
                public void mo876a(C0955d c0955d) {
                    this.f14051c.m4165a(f, f2);
                }
            });
        } else {
            m4167a((int) C0953e.m4090a(this.f3192e.m4117d(), this.f3192e.m4118e(), f), (int) C0953e.m4090a(this.f3192e.m4117d(), this.f3192e.m4118e(), f2));
        }
    }

    /* renamed from: c */
    public void m4182c(float f) {
        this.f3193f.m16993a(f);
    }

    /* renamed from: j */
    public float m4194j() {
        return this.f3193f.m17004h();
    }

    /* renamed from: c */
    public void m4183c(final int i) {
        if (this.f3192e == null) {
            this.f3196i.add(new C0965a(this) {
                /* renamed from: b */
                final /* synthetic */ C0966f f14053b;

                /* renamed from: a */
                public void mo876a(C0955d c0955d) {
                    this.f14053b.m4183c(i);
                }
            });
        } else {
            this.f3193f.m16994a(i);
        }
    }

    /* renamed from: k */
    public int m4195k() {
        return (int) this.f3193f.m17001e();
    }

    /* renamed from: d */
    public void m4185d(final float f) {
        if (this.f3192e == null) {
            this.f3196i.add(new C0965a(this) {
                /* renamed from: b */
                final /* synthetic */ C0966f f14055b;

                /* renamed from: a */
                public void mo876a(C0955d c0955d) {
                    this.f14055b.m4185d(f);
                }
            });
        } else {
            m4183c((int) C0953e.m4090a(this.f3192e.m4117d(), this.f3192e.m4118e(), f));
        }
    }

    /* renamed from: d */
    public void m4186d(int i) {
        this.f3193f.setRepeatMode(i);
    }

    /* renamed from: l */
    public int m4196l() {
        return this.f3193f.getRepeatMode();
    }

    /* renamed from: e */
    public void m4189e(int i) {
        this.f3193f.setRepeatCount(i);
    }

    /* renamed from: m */
    public int m4197m() {
        return this.f3193f.getRepeatCount();
    }

    /* renamed from: n */
    public boolean m4198n() {
        return this.f3193f.isRunning();
    }

    /* renamed from: e */
    public void m4188e(float f) {
        this.f3194g = f;
        m4158v();
    }

    /* renamed from: a */
    public void m4169a(C0928b c0928b) {
        this.f3199l = c0928b;
        if (this.f3197j != null) {
            this.f3197j.m4017a(c0928b);
        }
    }

    /* renamed from: a */
    public void m4168a(C0925a c0925a) {
        this.f3189a = c0925a;
        if (this.f3200m != null) {
            this.f3200m.m4013a(c0925a);
        }
    }

    /* renamed from: a */
    public void m4171a(C1001o c1001o) {
        this.f3190b = c1001o;
    }

    /* renamed from: o */
    public C1001o m4199o() {
        return this.f3190b;
    }

    /* renamed from: p */
    public boolean m4200p() {
        return this.f3190b == null && this.f3192e.m4121h().m1592b() > 0;
    }

    /* renamed from: q */
    public float m4201q() {
        return this.f3194g;
    }

    /* renamed from: r */
    public C0955d m4202r() {
        return this.f3192e;
    }

    /* renamed from: v */
    private void m4158v() {
        if (this.f3192e != null) {
            float q = m4201q();
            setBounds(0, 0, (int) (((float) this.f3192e.m4114b().width()) * q), (int) (((float) this.f3192e.m4114b().height()) * q));
        }
    }

    /* renamed from: s */
    public void m4203s() {
        this.f3196i.clear();
        this.f3193f.cancel();
    }

    /* renamed from: t */
    public float m4204t() {
        return this.f3193f.m17000d();
    }

    public int getIntrinsicWidth() {
        return this.f3192e == null ? -1 : (int) (((float) this.f3192e.m4114b().width()) * m4201q());
    }

    public int getIntrinsicHeight() {
        return this.f3192e == null ? -1 : (int) (((float) this.f3192e.m4114b().height()) * m4201q());
    }

    /* renamed from: a */
    public List<C0989e> m4163a(C0989e c0989e) {
        if (this.f3202o == null) {
            Log.w("LOTTIE", "Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        List<C0989e> arrayList = new ArrayList();
        this.f3202o.mo3885a(c0989e, 0, (List) arrayList, new C0989e(new String[0]));
        return arrayList;
    }

    /* renamed from: a */
    public <T> void m4170a(final C0989e c0989e, final T t, final C0961c<T> c0961c) {
        if (this.f3202o == null) {
            this.f3196i.add(new C0965a(this) {
                /* renamed from: d */
                final /* synthetic */ C0966f f14059d;

                /* renamed from: a */
                public void mo876a(C0955d c0955d) {
                    this.f14059d.m4170a(c0989e, t, c0961c);
                }
            });
            return;
        }
        int i = 1;
        if (c0989e.m4268a() != null) {
            c0989e.m4268a().mo3886a(t, c0961c);
        } else {
            c0989e = m4163a(c0989e);
            for (int i2 = 0; i2 < c0989e.size(); i2++) {
                ((C0989e) c0989e.get(i2)).m4268a().mo3886a(t, c0961c);
            }
            i = 1 ^ c0989e.isEmpty();
        }
        if (i != 0) {
            invalidateSelf();
            if (t == C0969i.f3233w) {
                m4185d(m4204t());
            }
        }
    }

    /* renamed from: b */
    public Bitmap m4176b(String str) {
        C0927b w = m4159w();
        return w != null ? w.m4015a(str) : null;
    }

    /* renamed from: w */
    private C0927b m4159w() {
        if (getCallback() == null) {
            return null;
        }
        if (!(this.f3197j == null || this.f3197j.m4018a(m4161y()))) {
            this.f3197j.m4016a();
            this.f3197j = null;
        }
        if (this.f3197j == null) {
            this.f3197j = new C0927b(getCallback(), this.f3198k, this.f3199l, this.f3192e.m4123j());
        }
        return this.f3197j;
    }

    /* renamed from: a */
    public Typeface m4162a(String str, String str2) {
        C0926a x = m4160x();
        return x != null ? x.m4012a(str, str2) : null;
    }

    /* renamed from: x */
    private C0926a m4160x() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f3200m == null) {
            this.f3200m = new C0926a(getCallback(), this.f3189a);
        }
        return this.f3200m;
    }

    /* renamed from: y */
    private Context m4161y() {
        Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public void invalidateDrawable(Drawable drawable) {
        drawable = getCallback();
        if (drawable != null) {
            drawable.invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable = getCallback();
        if (drawable != null) {
            drawable.scheduleDrawable(this, runnable, j);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable = getCallback();
        if (drawable != null) {
            drawable.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: a */
    private float m4154a(Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.f3192e.m4114b().width()), ((float) canvas.getHeight()) / ((float) this.f3192e.m4114b().height()));
    }
}
