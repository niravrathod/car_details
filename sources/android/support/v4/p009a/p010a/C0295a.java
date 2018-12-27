package android.support.v4.p009a.p010a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.a.a.a */
public final class C0295a {
    /* renamed from: a */
    private static Method f1038a;
    /* renamed from: b */
    private static boolean f1039b;
    /* renamed from: c */
    private static Method f1040c;
    /* renamed from: d */
    private static boolean f1041d;

    @Deprecated
    /* renamed from: a */
    public static void m1046a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: a */
    public static void m1054a(Drawable drawable, boolean z) {
        if (VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: b */
    public static boolean m1055b(Drawable drawable) {
        return VERSION.SDK_INT >= 19 ? drawable.isAutoMirrored() : null;
    }

    /* renamed from: a */
    public static void m1047a(Drawable drawable, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: a */
    public static void m1049a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m1048a(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof C0296b) {
            ((C0296b) drawable).setTint(i);
        }
    }

    /* renamed from: a */
    public static void m1050a(Drawable drawable, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof C0296b) {
            ((C0296b) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m1053a(Drawable drawable, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof C0296b) {
            ((C0296b) drawable).setTintMode(mode);
        }
    }

    /* renamed from: c */
    public static int m1057c(Drawable drawable) {
        return VERSION.SDK_INT >= 19 ? drawable.getAlpha() : null;
    }

    /* renamed from: a */
    public static void m1051a(Drawable drawable, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: d */
    public static boolean m1058d(Drawable drawable) {
        return VERSION.SDK_INT >= 21 ? drawable.canApplyTheme() : null;
    }

    /* renamed from: e */
    public static ColorFilter m1059e(Drawable drawable) {
        return VERSION.SDK_INT >= 21 ? drawable.getColorFilter() : null;
    }

    /* renamed from: f */
    public static void m1060f(Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
        } else if (VERSION.SDK_INT >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                C0295a.m1060f(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof C0297c) {
                C0295a.m1060f(((C0297c) drawable).mo248a());
            } else if (drawable instanceof DrawableContainer) {
                DrawableContainerState drawableContainerState = (DrawableContainerState) ((DrawableContainer) drawable).getConstantState();
                if (drawableContainerState != null) {
                    int childCount = drawableContainerState.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        Drawable child = drawableContainerState.getChild(i);
                        if (child != null) {
                            C0295a.m1060f(child);
                        }
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    /* renamed from: a */
    public static void m1052a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: g */
    public static Drawable m1061g(Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            return drawable;
        }
        return VERSION.SDK_INT >= 21 ? !(drawable instanceof C0296b) ? new C4757f(drawable) : drawable : VERSION.SDK_INT >= 19 ? !(drawable instanceof C0296b) ? new C4426e(drawable) : drawable : !(drawable instanceof C0296b) ? new C3095d(drawable) : drawable;
    }

    /* renamed from: h */
    public static <T extends Drawable> T m1062h(Drawable drawable) {
        return drawable instanceof C0297c ? ((C0297c) drawable).mo248a() : drawable;
    }

    /* renamed from: b */
    public static boolean m1056b(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (!f1039b) {
            try {
                f1038a = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f1038a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f1039b = true;
        }
        if (f1038a != null) {
            try {
                f1038a.invoke(drawable, new Object[]{Integer.valueOf(i)});
                return true;
            } catch (Drawable drawable2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", drawable2);
                f1038a = null;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static int m1063i(Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (VERSION.SDK_INT < 17) {
            return 0;
        }
        if (!f1041d) {
            try {
                f1040c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f1040c.setAccessible(true);
            } catch (Throwable e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            f1041d = true;
        }
        if (f1040c != null) {
            try {
                return ((Integer) f1040c.invoke(drawable, new Object[0])).intValue();
            } catch (Drawable drawable2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", drawable2);
                f1040c = null;
            }
        }
        return 0;
    }
}
