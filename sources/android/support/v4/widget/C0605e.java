package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.e */
public final class C0605e {
    /* renamed from: a */
    private static final C0604c f1953a;

    /* renamed from: android.support.v4.widget.e$c */
    static class C0604c {
        /* renamed from: a */
        private static Field f1951a;
        /* renamed from: b */
        private static boolean f1952b;

        C0604c() {
        }

        /* renamed from: a */
        public void mo470a(CompoundButton compoundButton, ColorStateList colorStateList) {
            if (compoundButton instanceof C0620p) {
                ((C0620p) compoundButton).setSupportButtonTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo471a(CompoundButton compoundButton, Mode mode) {
            if (compoundButton instanceof C0620p) {
                ((C0620p) compoundButton).setSupportButtonTintMode(mode);
            }
        }

        /* renamed from: a */
        public Drawable mo3790a(CompoundButton compoundButton) {
            if (!f1952b) {
                try {
                    f1951a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    f1951a.setAccessible(true);
                } catch (Throwable e) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
                }
                f1952b = true;
            }
            if (f1951a != null) {
                try {
                    return (Drawable) f1951a.get(compoundButton);
                } catch (CompoundButton compoundButton2) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", compoundButton2);
                    f1951a = null;
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.widget.e$a */
    static class C3181a extends C0604c {
        C3181a() {
        }

        /* renamed from: a */
        public void mo470a(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: a */
        public void mo471a(CompoundButton compoundButton, Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: android.support.v4.widget.e$b */
    static class C4447b extends C3181a {
        C4447b() {
        }

        /* renamed from: a */
        public Drawable mo3790a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    static {
        if (VERSION.SDK_INT >= 23) {
            f1953a = new C4447b();
        } else if (VERSION.SDK_INT >= 21) {
            f1953a = new C3181a();
        } else {
            f1953a = new C0604c();
        }
    }

    /* renamed from: a */
    public static void m2432a(CompoundButton compoundButton, ColorStateList colorStateList) {
        f1953a.mo470a(compoundButton, colorStateList);
    }

    /* renamed from: a */
    public static void m2433a(CompoundButton compoundButton, Mode mode) {
        f1953a.mo471a(compoundButton, mode);
    }

    /* renamed from: a */
    public static Drawable m2431a(CompoundButton compoundButton) {
        return f1953a.mo3790a(compoundButton);
    }
}
