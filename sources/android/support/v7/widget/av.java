package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class av extends ContextWrapper {
    /* renamed from: a */
    private static final Object f2841a = new Object();
    /* renamed from: b */
    private static ArrayList<WeakReference<av>> f2842b;
    /* renamed from: c */
    private final Resources f2843c;
    /* renamed from: d */
    private final Theme f2844d;

    /* renamed from: a */
    public static Context m3538a(Context context) {
        if (!m3539b(context)) {
            return context;
        }
        synchronized (f2841a) {
            if (f2842b == null) {
                f2842b = new ArrayList();
            } else {
                int size;
                WeakReference weakReference;
                for (size = f2842b.size() - 1; size >= 0; size--) {
                    weakReference = (WeakReference) f2842b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f2842b.remove(size);
                    }
                }
                size = f2842b.size() - 1;
                while (size >= 0) {
                    weakReference = (WeakReference) f2842b.get(size);
                    Context context2 = weakReference != null ? (av) weakReference.get() : null;
                    if (context2 == null || context2.getBaseContext() != context) {
                        size--;
                    } else {
                        return context2;
                    }
                }
            }
            Context avVar = new av(context);
            f2842b.add(new WeakReference(avVar));
            return avVar;
        }
    }

    /* renamed from: b */
    private static boolean m3539b(Context context) {
        boolean z = false;
        if (!((context instanceof av) || (context.getResources() instanceof ax))) {
            if ((context.getResources() instanceof bd) == null) {
                if (VERSION.SDK_INT < 21 || bd.m3576a() != null) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    private av(Context context) {
        super(context);
        if (bd.m3576a()) {
            this.f2843c = new bd(this, context.getResources());
            this.f2844d = this.f2843c.newTheme();
            this.f2844d.setTo(context.getTheme());
            return;
        }
        this.f2843c = new ax(this, context.getResources());
        this.f2844d = null;
    }

    public Theme getTheme() {
        return this.f2844d == null ? super.getTheme() : this.f2844d;
    }

    public void setTheme(int i) {
        if (this.f2844d == null) {
            super.setTheme(i);
        } else {
            this.f2844d.applyStyle(i, true);
        }
    }

    public Resources getResources() {
        return this.f2843c;
    }

    public AssetManager getAssets() {
        return this.f2843c.getAssets();
    }
}
