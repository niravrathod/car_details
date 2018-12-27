package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.j */
public class C0614j {
    /* renamed from: a */
    static final C0613b f1962a;

    /* renamed from: android.support.v4.widget.j$b */
    interface C0613b {
        /* renamed from: a */
        ColorStateList mo477a(ImageView imageView);

        /* renamed from: a */
        void mo478a(ImageView imageView, ColorStateList colorStateList);

        /* renamed from: a */
        void mo479a(ImageView imageView, Mode mode);

        /* renamed from: b */
        Mode mo480b(ImageView imageView);
    }

    /* renamed from: android.support.v4.widget.j$a */
    static class C3184a implements C0613b {
        C3184a() {
        }

        /* renamed from: a */
        public ColorStateList mo477a(ImageView imageView) {
            return imageView instanceof C0621q ? ((C0621q) imageView).getSupportImageTintList() : null;
        }

        /* renamed from: a */
        public void mo478a(ImageView imageView, ColorStateList colorStateList) {
            if (imageView instanceof C0621q) {
                ((C0621q) imageView).setSupportImageTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo479a(ImageView imageView, Mode mode) {
            if (imageView instanceof C0621q) {
                ((C0621q) imageView).setSupportImageTintMode(mode);
            }
        }

        /* renamed from: b */
        public Mode mo480b(ImageView imageView) {
            return imageView instanceof C0621q ? ((C0621q) imageView).getSupportImageTintMode() : null;
        }
    }

    /* renamed from: android.support.v4.widget.j$c */
    static class C4448c extends C3184a {
        C4448c() {
        }

        /* renamed from: a */
        public ColorStateList mo477a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: a */
        public void mo478a(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                colorStateList = imageView.getDrawable();
                Object obj = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? null : 1;
                if (colorStateList != null && obj != null) {
                    if (colorStateList.isStateful()) {
                        colorStateList.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(colorStateList);
                }
            }
        }

        /* renamed from: a */
        public void mo479a(ImageView imageView, Mode mode) {
            imageView.setImageTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                mode = imageView.getDrawable();
                Object obj = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? null : 1;
                if (mode != null && obj != null) {
                    if (mode.isStateful()) {
                        mode.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(mode);
                }
            }
        }

        /* renamed from: b */
        public Mode mo480b(ImageView imageView) {
            return imageView.getImageTintMode();
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1962a = new C4448c();
        } else {
            f1962a = new C3184a();
        }
    }

    /* renamed from: a */
    public static ColorStateList m2455a(ImageView imageView) {
        return f1962a.mo477a(imageView);
    }

    /* renamed from: a */
    public static void m2456a(ImageView imageView, ColorStateList colorStateList) {
        f1962a.mo478a(imageView, colorStateList);
    }

    /* renamed from: b */
    public static Mode m2458b(ImageView imageView) {
        return f1962a.mo480b(imageView);
    }

    /* renamed from: a */
    public static void m2457a(ImageView imageView, Mode mode) {
        f1962a.mo479a(imageView, mode);
    }
}
