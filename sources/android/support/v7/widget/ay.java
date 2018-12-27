package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.p014a.C0387b;
import android.support.v4.content.p014a.C0387b.C0386a;
import android.support.v7.p022c.p023a.C0680b;
import android.util.AttributeSet;
import android.util.TypedValue;

public class ay {
    /* renamed from: a */
    private final Context f2849a;
    /* renamed from: b */
    private final TypedArray f2850b;
    /* renamed from: c */
    private TypedValue f2851c;

    /* renamed from: a */
    public static ay m3542a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new ay(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static ay m3543a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new ay(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public static ay m3541a(Context context, int i, int[] iArr) {
        return new ay(context, context.obtainStyledAttributes(i, iArr));
    }

    private ay(Context context, TypedArray typedArray) {
        this.f2849a = context;
        this.f2850b = typedArray;
    }

    /* renamed from: a */
    public Drawable m3547a(int i) {
        if (this.f2850b.hasValue(i)) {
            int resourceId = this.f2850b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0680b.m2703b(this.f2849a, resourceId);
            }
        }
        return this.f2850b.getDrawable(i);
    }

    /* renamed from: b */
    public Drawable m3551b(int i) {
        if (this.f2850b.hasValue(i)) {
            i = this.f2850b.getResourceId(i, 0);
            if (i != 0) {
                return C0862h.m3671a().m3691a(this.f2849a, i, true);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public Typeface m3546a(int i, int i2, C0386a c0386a) {
        i = this.f2850b.getResourceId(i, 0);
        if (i == 0) {
            return 0;
        }
        if (this.f2851c == null) {
            this.f2851c = new TypedValue();
        }
        return C0387b.m1416a(this.f2849a, i, this.f2851c, i2, c0386a);
    }

    /* renamed from: c */
    public CharSequence m3553c(int i) {
        return this.f2850b.getText(i);
    }

    /* renamed from: d */
    public String m3555d(int i) {
        return this.f2850b.getString(i);
    }

    /* renamed from: a */
    public boolean m3549a(int i, boolean z) {
        return this.f2850b.getBoolean(i, z);
    }

    /* renamed from: a */
    public int m3545a(int i, int i2) {
        return this.f2850b.getInt(i, i2);
    }

    /* renamed from: a */
    public float m3544a(int i, float f) {
        return this.f2850b.getFloat(i, f);
    }

    /* renamed from: b */
    public int m3550b(int i, int i2) {
        return this.f2850b.getColor(i, i2);
    }

    /* renamed from: e */
    public ColorStateList m3557e(int i) {
        if (this.f2850b.hasValue(i)) {
            int resourceId = this.f2850b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C0680b.m2700a(this.f2849a, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.f2850b.getColorStateList(i);
    }

    /* renamed from: c */
    public int m3552c(int i, int i2) {
        return this.f2850b.getInteger(i, i2);
    }

    /* renamed from: d */
    public int m3554d(int i, int i2) {
        return this.f2850b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: e */
    public int m3556e(int i, int i2) {
        return this.f2850b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: f */
    public int m3558f(int i, int i2) {
        return this.f2850b.getLayoutDimension(i, i2);
    }

    /* renamed from: g */
    public int m3560g(int i, int i2) {
        return this.f2850b.getResourceId(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] m3559f(int i) {
        return this.f2850b.getTextArray(i);
    }

    /* renamed from: g */
    public boolean m3561g(int i) {
        return this.f2850b.hasValue(i);
    }

    /* renamed from: a */
    public void m3548a() {
        this.f2850b.recycle();
    }
}
