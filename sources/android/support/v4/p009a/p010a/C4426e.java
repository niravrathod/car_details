package android.support.v4.p009a.p010a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.p009a.p010a.C3095d.C0298a;

/* renamed from: android.support.v4.a.a.e */
class C4426e extends C3095d {

    /* renamed from: android.support.v4.a.a.e$a */
    private static class C3096a extends C0298a {
        C3096a(C0298a c0298a, Resources resources) {
            super(c0298a, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C4426e(this, resources);
        }
    }

    C4426e(Drawable drawable) {
        super(drawable);
    }

    C4426e(C0298a c0298a, Resources resources) {
        super(c0298a, resources);
    }

    public void setAutoMirrored(boolean z) {
        this.c.setAutoMirrored(z);
    }

    public boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }

    /* renamed from: b */
    C0298a mo3739b() {
        return new C3096a(this.b, null);
    }
}
