package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class ax extends al {
    /* renamed from: a */
    private final WeakReference<Context> f13947a;

    public ax(Context context, Resources resources) {
        super(resources);
        this.f13947a = new WeakReference(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f13947a.get();
        if (!(drawable == null || context == null)) {
            C0862h.m3671a();
            C0862h.m3677a(context, i, drawable);
        }
        return drawable;
    }
}
