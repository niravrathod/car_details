package com.bumptech.glide.request.p067a;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import com.bumptech.glide.p055g.C1178i;
import com.bumptech.glide.request.C1310b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: com.bumptech.glide.request.a.i */
public abstract class C4786i<T extends View, Z> extends C4527a<Z> {
    /* renamed from: b */
    private static boolean f20909b;
    /* renamed from: c */
    private static Integer f20910c;
    /* renamed from: a */
    protected final T f20911a;
    /* renamed from: d */
    private final C1306a f20912d;
    /* renamed from: e */
    private OnAttachStateChangeListener f20913e;
    /* renamed from: f */
    private boolean f20914f;
    /* renamed from: g */
    private boolean f20915g;

    /* renamed from: com.bumptech.glide.request.a.i$a */
    static final class C1306a {
        /* renamed from: a */
        static Integer f4107a;
        /* renamed from: b */
        boolean f4108b;
        /* renamed from: c */
        private final View f4109c;
        /* renamed from: d */
        private final List<C1304g> f4110d = new ArrayList();
        /* renamed from: e */
        private C1305a f4111e;

        /* renamed from: com.bumptech.glide.request.a.i$a$a */
        private static final class C1305a implements OnPreDrawListener {
            /* renamed from: a */
            private final WeakReference<C1306a> f4106a;

            C1305a(C1306a c1306a) {
                this.f4106a = new WeakReference(c1306a);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("OnGlobalLayoutListener called attachStateListener=");
                    stringBuilder.append(this);
                    Log.v("ViewTarget", stringBuilder.toString());
                }
                C1306a c1306a = (C1306a) this.f4106a.get();
                if (c1306a != null) {
                    c1306a.m5265a();
                }
                return true;
            }
        }

        /* renamed from: a */
        private boolean m5261a(int i) {
            if (i <= 0) {
                if (i != Integer.MIN_VALUE) {
                    return false;
                }
            }
            return true;
        }

        C1306a(View view) {
            this.f4109c = view;
        }

        /* renamed from: a */
        private static int m5259a(Context context) {
            if (f4107a == null) {
                context = ((WindowManager) C1178i.m4880a((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                context.getSize(point);
                f4107a = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f4107a.intValue();
        }

        /* renamed from: a */
        private void m5260a(int i, int i2) {
            Iterator it = new ArrayList(this.f4110d).iterator();
            while (it.hasNext()) {
                ((C1304g) it.next()).mo1074a(i, i2);
            }
        }

        /* renamed from: a */
        void m5265a() {
            if (!this.f4110d.isEmpty()) {
                int d = m5264d();
                int c = m5263c();
                if (m5262b(d, c)) {
                    m5260a(d, c);
                    m5267b();
                }
            }
        }

        /* renamed from: a */
        void m5266a(C1304g c1304g) {
            int d = m5264d();
            int c = m5263c();
            if (m5262b(d, c)) {
                c1304g.mo1074a(d, c);
                return;
            }
            if (!this.f4110d.contains(c1304g)) {
                this.f4110d.add(c1304g);
            }
            if (this.f4111e == null) {
                c1304g = this.f4109c.getViewTreeObserver();
                this.f4111e = new C1305a(this);
                c1304g.addOnPreDrawListener(this.f4111e);
            }
        }

        /* renamed from: b */
        void m5268b(C1304g c1304g) {
            this.f4110d.remove(c1304g);
        }

        /* renamed from: b */
        void m5267b() {
            ViewTreeObserver viewTreeObserver = this.f4109c.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f4111e);
            }
            this.f4111e = null;
            this.f4110d.clear();
        }

        /* renamed from: b */
        private boolean m5262b(int i, int i2) {
            return (m5261a(i) == 0 || m5261a(i2) == 0) ? false : true;
        }

        /* renamed from: c */
        private int m5263c() {
            int paddingTop = this.f4109c.getPaddingTop() + this.f4109c.getPaddingBottom();
            LayoutParams layoutParams = this.f4109c.getLayoutParams();
            return m5258a(this.f4109c.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: d */
        private int m5264d() {
            int paddingLeft = this.f4109c.getPaddingLeft() + this.f4109c.getPaddingRight();
            LayoutParams layoutParams = this.f4109c.getLayoutParams();
            return m5258a(this.f4109c.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: a */
        private int m5258a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f4108b && this.f4109c.isLayoutRequested()) {
                return 0;
            }
            i -= i3;
            if (i > 0) {
                return i;
            }
            if (this.f4109c.isLayoutRequested() != 0 || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4) != 0) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return C1306a.m5259a(this.f4109c.getContext());
        }
    }

    public C4786i(T t) {
        this.f20911a = (View) C1178i.m4880a((Object) t);
        this.f20912d = new C1306a(t);
    }

    /* renamed from: b */
    public void mo3908b(Drawable drawable) {
        super.mo3908b(drawable);
        m27745a();
    }

    /* renamed from: a */
    private void m27745a() {
        if (this.f20913e != null) {
            if (!this.f20915g) {
                this.f20911a.addOnAttachStateChangeListener(this.f20913e);
                this.f20915g = true;
            }
        }
    }

    /* renamed from: f */
    private void m27747f() {
        if (this.f20913e != null) {
            if (this.f20915g) {
                this.f20911a.removeOnAttachStateChangeListener(this.f20913e);
                this.f20915g = false;
            }
        }
    }

    /* renamed from: a */
    public void mo4622a(C1304g c1304g) {
        this.f20912d.m5266a(c1304g);
    }

    /* renamed from: b */
    public void mo4623b(C1304g c1304g) {
        this.f20912d.m5268b(c1304g);
    }

    /* renamed from: a */
    public void mo3905a(Drawable drawable) {
        super.mo3905a(drawable);
        this.f20912d.m5267b();
        if (this.f20914f == null) {
            m27747f();
        }
    }

    /* renamed from: a */
    public void mo3906a(C1310b c1310b) {
        mo4901a((Object) c1310b);
    }

    /* renamed from: b */
    public C1310b mo3907b() {
        Object g = m27748g();
        if (g == null) {
            return null;
        }
        if (g instanceof C1310b) {
            return (C1310b) g;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Target for: ");
        stringBuilder.append(this.f20911a);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private void mo4901a(Object obj) {
        if (f20910c == null) {
            f20909b = true;
            this.f20911a.setTag(obj);
            return;
        }
        this.f20911a.setTag(f20910c.intValue(), obj);
    }

    /* renamed from: g */
    private Object m27748g() {
        if (f20910c == null) {
            return this.f20911a.getTag();
        }
        return this.f20911a.getTag(f20910c.intValue());
    }
}
