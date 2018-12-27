package com.bumptech.glide.request.p067a;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.p068b.C1308b;
import com.bumptech.glide.request.p068b.C1308b.C1307a;

/* renamed from: com.bumptech.glide.request.a.d */
public abstract class C4847d<Z> extends C4786i<ImageView, Z> implements C1307a {
    /* renamed from: b */
    private Animatable f21478b;

    /* renamed from: a */
    protected abstract void mo4901a(Z z);

    public C4847d(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: e */
    public void m28726e(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    /* renamed from: b */
    public void mo3908b(Drawable drawable) {
        super.mo3908b(drawable);
        m28717b(null);
        m28726e(drawable);
    }

    /* renamed from: c */
    public void mo3909c(Drawable drawable) {
        super.mo3909c(drawable);
        m28717b(null);
        m28726e(drawable);
    }

    /* renamed from: a */
    public void mo3905a(Drawable drawable) {
        super.mo3905a(drawable);
        if (this.f21478b != null) {
            this.f21478b.stop();
        }
        m28717b(null);
        m28726e(drawable);
    }

    /* renamed from: a */
    public void mo4900a(Z z, C1308b<? super Z> c1308b) {
        if (c1308b != null) {
            if (c1308b.mo1092a(z, this) != null) {
                m28718c((Object) z);
                return;
            }
        }
        m28717b((Object) z);
    }

    /* renamed from: c */
    public void mo946c() {
        if (this.f21478b != null) {
            this.f21478b.start();
        }
    }

    /* renamed from: d */
    public void mo947d() {
        if (this.f21478b != null) {
            this.f21478b.stop();
        }
    }

    /* renamed from: b */
    private void m28717b(Z z) {
        mo4901a((Object) z);
        m28718c((Object) z);
    }

    /* renamed from: c */
    private void m28718c(Z z) {
        if (z instanceof Animatable) {
            this.f21478b = (Animatable) z;
            this.f21478b.start();
            return;
        }
        this.f21478b = null;
    }
}
