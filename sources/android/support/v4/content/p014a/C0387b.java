package android.support.v4.content.p014a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.p014a.C0383a.C0381a;
import android.support.v4.p009a.C0304c;
import android.util.Log;
import android.util.TypedValue;

/* renamed from: android.support.v4.content.a.b */
public final class C0387b {

    /* renamed from: android.support.v4.content.a.b$a */
    public static abstract class C0386a {
        /* renamed from: a */
        public abstract void mo828a(int i);

        /* renamed from: a */
        public abstract void mo829a(Typeface typeface);

        /* renamed from: a */
        public final void m1415a(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C0386a f1325b;

                public void run() {
                    this.f1325b.mo829a(typeface);
                }
            });
        }

        /* renamed from: a */
        public final void m1413a(final int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C0386a f1327b;

                public void run() {
                    this.f1327b.mo828a(i);
                }
            });
        }
    }

    /* renamed from: a */
    public static Drawable m1419a(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: a */
    public static Typeface m1416a(Context context, int i, TypedValue typedValue, int i2, C0386a c0386a) {
        if (context.isRestricted()) {
            return null;
        }
        return C0387b.m1417a(context, i, typedValue, i2, c0386a, null, true);
    }

    /* renamed from: a */
    private static Typeface m1417a(Context context, int i, TypedValue typedValue, int i2, C0386a c0386a, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        context = C0387b.m1418a(context, resources, typedValue, i, i2, c0386a, handler, z);
        if (context == null) {
            if (c0386a == null) {
                typedValue = new StringBuilder();
                typedValue.append("Font resource ID #0x");
                typedValue.append(Integer.toHexString(i));
                typedValue.append(" could not be retrieved.");
                throw new NotFoundException(typedValue.toString());
            }
        }
        return context;
    }

    /* renamed from: a */
    private static Typeface m1418a(Context context, Resources resources, TypedValue typedValue, int i, int i2, C0386a c0386a, Handler handler, boolean z) {
        StringBuilder stringBuilder;
        Resources resources2 = resources;
        TypedValue typedValue2 = typedValue;
        int i3 = i;
        int i4 = i2;
        C0386a c0386a2 = c0386a;
        Handler handler2 = handler;
        if (typedValue2.string != null) {
            String charSequence = typedValue2.string.toString();
            if (charSequence.startsWith("res/")) {
                Typeface a = C0304c.m1093a(resources, i3, i4);
                if (a != null) {
                    if (c0386a2 != null) {
                        c0386a2.m1415a(a, handler2);
                    }
                    return a;
                }
                try {
                    if (charSequence.toLowerCase().endsWith(".xml")) {
                        C0381a a2 = C0383a.m1405a(resources.getXml(i3), resources);
                        if (a2 != null) {
                            return C0304c.m1092a(context, a2, resources, i, i2, c0386a, handler, z);
                        }
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        if (c0386a2 != null) {
                            c0386a2.m1413a(-3, handler2);
                        }
                        return null;
                    }
                    Context context2 = context;
                    Typeface a3 = C0304c.m1090a(context, resources, i3, charSequence, i4);
                    if (c0386a2 != null) {
                        if (a3 != null) {
                            c0386a2.m1415a(a3, handler2);
                        } else {
                            c0386a2.m1413a(-3, handler2);
                        }
                    }
                    return a3;
                } catch (Throwable e) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to parse xml resource ");
                    stringBuilder.append(charSequence);
                    Log.e("ResourcesCompat", stringBuilder.toString(), e);
                    if (c0386a2 != null) {
                        c0386a2.m1413a(-3, handler2);
                    }
                    return null;
                } catch (Throwable e2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to read xml resource ");
                    stringBuilder.append(charSequence);
                    Log.e("ResourcesCompat", stringBuilder.toString(), e2);
                    if (c0386a2 != null) {
                        c0386a2.m1413a(-3, handler2);
                    }
                    return null;
                }
            }
            if (c0386a2 != null) {
                c0386a2.m1413a(-3, handler2);
            }
            return null;
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Resource \"");
        stringBuilder2.append(resources.getResourceName(i3));
        stringBuilder2.append("\" (");
        stringBuilder2.append(Integer.toHexString(i));
        stringBuilder2.append(") is not a Font: ");
        stringBuilder2.append(typedValue2);
        throw new NotFoundException(stringBuilder2.toString());
    }
}
