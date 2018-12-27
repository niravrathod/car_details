package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertController.C0649a;
import android.support.v7.p020a.C0637a.C0627a;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: android.support.v7.app.c */
public class C4455c extends C3203j implements DialogInterface {
    /* renamed from: a */
    final AlertController f18485a = new AlertController(getContext(), this, getWindow());

    /* renamed from: android.support.v7.app.c$a */
    public static class C0661a {
        /* renamed from: a */
        private final C0649a f2148a;
        /* renamed from: b */
        private final int f2149b;

        public C0661a(Context context) {
            this(context, C4455c.m24413a(context, 0));
        }

        public C0661a(Context context, int i) {
            this.f2148a = new C0649a(new ContextThemeWrapper(context, C4455c.m24413a(context, i)));
            this.f2149b = i;
        }

        /* renamed from: a */
        public Context m2633a() {
            return this.f2148a.f2038a;
        }

        /* renamed from: a */
        public C0661a m2639a(CharSequence charSequence) {
            this.f2148a.f2043f = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0661a m2637a(View view) {
            this.f2148a.f2044g = view;
            return this;
        }

        /* renamed from: b */
        public C0661a m2643b(CharSequence charSequence) {
            this.f2148a.f2045h = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0661a m2636a(Drawable drawable) {
            this.f2148a.f2041d = drawable;
            return this;
        }

        /* renamed from: a */
        public C0661a m2640a(CharSequence charSequence, OnClickListener onClickListener) {
            this.f2148a.f2046i = charSequence;
            this.f2148a.f2048k = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C0661a m2644b(CharSequence charSequence, OnClickListener onClickListener) {
            this.f2148a.f2049l = charSequence;
            this.f2148a.f2051n = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0661a m2641a(boolean z) {
            this.f2148a.f2055r = z;
            return this;
        }

        /* renamed from: a */
        public C0661a m2634a(OnCancelListener onCancelListener) {
            this.f2148a.f2056s = onCancelListener;
            return this;
        }

        /* renamed from: a */
        public C0661a m2635a(OnKeyListener onKeyListener) {
            this.f2148a.f2058u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0661a m2638a(ListAdapter listAdapter, OnClickListener onClickListener) {
            this.f2148a.f2060w = listAdapter;
            this.f2148a.f2061x = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C0661a m2642b(View view) {
            this.f2148a.f2063z = view;
            this.f2148a.f2062y = 0;
            this.f2148a.f2026E = false;
            return this;
        }

        /* renamed from: b */
        public C4455c m2645b() {
            C4455c c4455c = new C4455c(this.f2148a.f2038a, this.f2149b);
            this.f2148a.m2569a(c4455c.f18485a);
            c4455c.setCancelable(this.f2148a.f2055r);
            if (this.f2148a.f2055r) {
                c4455c.setCanceledOnTouchOutside(true);
            }
            c4455c.setOnCancelListener(this.f2148a.f2056s);
            c4455c.setOnDismissListener(this.f2148a.f2057t);
            if (this.f2148a.f2058u != null) {
                c4455c.setOnKeyListener(this.f2148a.f2058u);
            }
            return c4455c;
        }

        /* renamed from: c */
        public C4455c m2646c() {
            C4455c b = m2645b();
            b.show();
            return b;
        }
    }

    protected C4455c(Context context, int i) {
        super(context, C4455c.m24413a(context, i));
    }

    /* renamed from: a */
    static int m24413a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        i = new TypedValue();
        context.getTheme().resolveAttribute(C0627a.alertDialogTheme, i, true);
        return i.resourceId;
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f18485a.m2587a(charSequence);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f18485a.m2582a();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f18485a.m2588a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f18485a.m2592b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
