package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.app.C0663e;
import java.lang.ref.WeakReference;

public class bd extends Resources {
    /* renamed from: a */
    private final WeakReference<Context> f2874a;

    /* renamed from: a */
    public static boolean m3576a() {
        return C0663e.m2654l() && VERSION.SDK_INT <= 20;
    }

    public bd(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f2874a = new WeakReference(context);
    }

    public Drawable getDrawable(int i) {
        Context context = (Context) this.f2874a.get();
        if (context != null) {
            return C0862h.m3671a().m3692a(context, this, i);
        }
        return super.getDrawable(i);
    }

    /* renamed from: a */
    final Drawable m3577a(int i) {
        return super.getDrawable(i);
    }
}
