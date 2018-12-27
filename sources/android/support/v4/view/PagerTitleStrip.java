package android.support.v4.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager.C0518a;
import android.support.v4.view.ViewPager.C0520d;
import android.support.v4.view.ViewPager.C0521e;
import android.support.v4.widget.C0619o;
import android.text.TextUtils.TruncateAt;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;

@C0518a
public class PagerTitleStrip extends ViewGroup {
    /* renamed from: n */
    private static final int[] f1619n = new int[]{16842804, 16842901, 16842904, 16842927};
    /* renamed from: o */
    private static final int[] f1620o = new int[]{16843660};
    /* renamed from: a */
    ViewPager f1621a;
    /* renamed from: b */
    TextView f1622b;
    /* renamed from: c */
    TextView f1623c;
    /* renamed from: d */
    TextView f1624d;
    /* renamed from: e */
    float f1625e;
    /* renamed from: f */
    int f1626f;
    /* renamed from: g */
    private int f1627g;
    /* renamed from: h */
    private int f1628h;
    /* renamed from: i */
    private int f1629i;
    /* renamed from: j */
    private boolean f1630j;
    /* renamed from: k */
    private boolean f1631k;
    /* renamed from: l */
    private final C3157a f1632l;
    /* renamed from: m */
    private WeakReference<C0555o> f1633m;
    /* renamed from: p */
    private int f1634p;

    /* renamed from: android.support.v4.view.PagerTitleStrip$b */
    private static class C0513b extends SingleLineTransformationMethod {
        /* renamed from: a */
        private Locale f1618a;

        C0513b(Context context) {
            this.f1618a = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            charSequence = super.getTransformation(charSequence, view);
            return charSequence != null ? charSequence.toString().toUpperCase(this.f1618a) : null;
        }
    }

    /* renamed from: android.support.v4.view.PagerTitleStrip$a */
    private class C3157a extends DataSetObserver implements C0520d, C0521e {
        /* renamed from: a */
        final /* synthetic */ PagerTitleStrip f13309a;
        /* renamed from: b */
        private int f13310b;

        C3157a(PagerTitleStrip pagerTitleStrip) {
            this.f13309a = pagerTitleStrip;
        }

        /* renamed from: a */
        public void mo138a(int i, float f, int i2) {
            if (f > 1056964608) {
                i++;
            }
            this.f13309a.mo436a(i, f, false);
        }

        /* renamed from: b */
        public void mo139b(int i) {
            if (this.f13310b == 0) {
                this.f13309a.m1887a(this.f13309a.f1621a.getCurrentItem(), this.f13309a.f1621a.getAdapter());
                float f = 0.0f;
                if (this.f13309a.f1625e >= 0) {
                    f = this.f13309a.f1625e;
                }
                this.f13309a.mo436a(this.f13309a.f1621a.getCurrentItem(), f, true);
            }
        }

        /* renamed from: a */
        public void mo137a(int i) {
            this.f13310b = i;
        }

        /* renamed from: a */
        public void mo136a(ViewPager viewPager, C0555o c0555o, C0555o c0555o2) {
            this.f13309a.m1888a(c0555o, c0555o2);
        }

        public void onChanged() {
            this.f13309a.m1887a(this.f13309a.f1621a.getCurrentItem(), this.f13309a.f1621a.getAdapter());
            float f = 0.0f;
            if (this.f13309a.f1625e >= 0.0f) {
                f = this.f13309a.f1625e;
            }
            this.f13309a.mo436a(this.f13309a.f1621a.getCurrentItem(), f, true);
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C0513b(textView.getContext()));
    }

    public PagerTitleStrip(Context context) {
        this(context, null);
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1627g = -1;
        this.f1625e = -1.0f;
        this.f1632l = new C3157a(this);
        View textView = new TextView(context);
        this.f1622b = textView;
        addView(textView);
        textView = new TextView(context);
        this.f1623c = textView;
        addView(textView);
        textView = new TextView(context);
        this.f1624d = textView;
        addView(textView);
        attributeSet = context.obtainStyledAttributes(attributeSet, f1619n);
        boolean z = false;
        int resourceId = attributeSet.getResourceId(0, 0);
        if (resourceId != 0) {
            C0619o.m2474a(this.f1622b, resourceId);
            C0619o.m2474a(this.f1623c, resourceId);
            C0619o.m2474a(this.f1624d, resourceId);
        }
        int dimensionPixelSize = attributeSet.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, (float) dimensionPixelSize);
        }
        if (attributeSet.hasValue(2)) {
            dimensionPixelSize = attributeSet.getColor(2, 0);
            this.f1622b.setTextColor(dimensionPixelSize);
            this.f1623c.setTextColor(dimensionPixelSize);
            this.f1624d.setTextColor(dimensionPixelSize);
        }
        this.f1629i = attributeSet.getInteger(3, 80);
        attributeSet.recycle();
        this.f1626f = this.f1623c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f1622b.setEllipsize(TruncateAt.END);
        this.f1623c.setEllipsize(TruncateAt.END);
        this.f1624d.setEllipsize(TruncateAt.END);
        if (resourceId != 0) {
            attributeSet = context.obtainStyledAttributes(resourceId, f1620o);
            z = attributeSet.getBoolean(0, false);
            attributeSet.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f1622b);
            setSingleLineAllCaps(this.f1623c);
            setSingleLineAllCaps(this.f1624d);
        } else {
            this.f1622b.setSingleLine();
            this.f1623c.setSingleLine();
            this.f1624d.setSingleLine();
        }
        this.f1628h = (int) (context.getResources().getDisplayMetrics().density * 1098907648);
    }

    public void setTextSpacing(int i) {
        this.f1628h = i;
        requestLayout();
    }

    public int getTextSpacing() {
        return this.f1628h;
    }

    public void setNonPrimaryAlpha(float f) {
        this.f1634p = ((int) (f * 255.0f)) & 255;
        f = (this.f1634p << 24) | (this.f1626f & 16777215);
        this.f1622b.setTextColor(f);
        this.f1624d.setTextColor(f);
    }

    public void setTextColor(int i) {
        this.f1626f = i;
        this.f1623c.setTextColor(i);
        i = (this.f1634p << 24) | (this.f1626f & 16777215);
        this.f1622b.setTextColor(i);
        this.f1624d.setTextColor(i);
    }

    public void setTextSize(int i, float f) {
        this.f1622b.setTextSize(i, f);
        this.f1623c.setTextSize(i, f);
        this.f1624d.setTextSize(i, f);
    }

    public void setGravity(int i) {
        this.f1629i = i;
        requestLayout();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            C0555o adapter = viewPager.getAdapter();
            viewPager.m1938c(this.f1632l);
            viewPager.m1929a(this.f1632l);
            this.f1621a = viewPager;
            m1888a(this.f1633m != null ? (C0555o) this.f1633m.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1621a != null) {
            m1888a(this.f1621a.getAdapter(), null);
            this.f1621a.m1938c(null);
            this.f1621a.m1936b(this.f1632l);
            this.f1621a = null;
        }
    }

    /* renamed from: a */
    void m1887a(int i, C0555o c0555o) {
        int b = c0555o != null ? c0555o.mo1187b() : 0;
        this.f1630j = true;
        CharSequence charSequence = null;
        CharSequence c = (i < 1 || c0555o == null) ? null : c0555o.mo3918c(i - 1);
        this.f1622b.setText(c);
        TextView textView = this.f1623c;
        CharSequence c2 = (c0555o == null || i >= b) ? null : c0555o.mo3918c(i);
        textView.setText(c2);
        int i2 = i + 1;
        if (i2 < b && c0555o != null) {
            charSequence = c0555o.mo3918c(i2);
        }
        this.f1624d.setText(charSequence);
        c0555o = MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        b = MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f1622b.measure(c0555o, b);
        this.f1623c.measure(c0555o, b);
        this.f1624d.measure(c0555o, b);
        this.f1627g = i;
        if (this.f1631k == null) {
            mo436a(i, this.f1625e, false);
        }
        this.f1630j = false;
    }

    public void requestLayout() {
        if (!this.f1630j) {
            super.requestLayout();
        }
    }

    /* renamed from: a */
    void m1888a(C0555o c0555o, C0555o c0555o2) {
        if (c0555o != null) {
            c0555o.m2098b(this.f1632l);
            this.f1633m = null;
        }
        if (c0555o2 != null) {
            c0555o2.m2090a(this.f1632l);
            this.f1633m = new WeakReference(c0555o2);
        }
        if (this.f1621a != null) {
            this.f1627g = -1;
            this.f1625e = -1.0f;
            m1887a(this.f1621a.getCurrentItem(), c0555o2);
            requestLayout();
        }
    }

    /* renamed from: a */
    void mo436a(int i, float f, boolean z) {
        int i2 = i;
        float f2 = f;
        if (i2 != this.f1627g) {
            m1887a(i2, r0.f1621a.getAdapter());
        } else if (!z && f2 == r0.f1625e) {
            return;
        }
        r0.f1631k = true;
        i2 = r0.f1622b.getMeasuredWidth();
        int measuredWidth = r0.f1623c.getMeasuredWidth();
        int measuredWidth2 = r0.f1624d.getMeasuredWidth();
        int i3 = measuredWidth / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i4 = paddingRight + i3;
        int i5 = (width - (paddingLeft + i3)) - i4;
        float f3 = 0.5f + f2;
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        i4 = ((width - i4) - ((int) (((float) i5) * f3))) - i3;
        measuredWidth += i4;
        i3 = r0.f1622b.getBaseline();
        i5 = r0.f1623c.getBaseline();
        int baseline = r0.f1624d.getBaseline();
        int max = Math.max(Math.max(i3, i5), baseline);
        i3 = max - i3;
        i5 = max - i5;
        max -= baseline;
        int i6 = measuredWidth2;
        measuredWidth2 = r0.f1624d.getMeasuredHeight() + max;
        int max2 = Math.max(Math.max(r0.f1622b.getMeasuredHeight() + i3, r0.f1623c.getMeasuredHeight() + i5), measuredWidth2);
        measuredWidth2 = r0.f1629i & 112;
        if (measuredWidth2 == 16) {
            height = (((height - paddingTop) - paddingBottom) - max2) / 2;
            i3 += height;
            i5 += height;
            paddingTop = height + max;
        } else if (measuredWidth2 != 80) {
            i3 += paddingTop;
            i5 += paddingTop;
            paddingTop += max;
        } else {
            height = (height - paddingBottom) - max2;
            i3 += height;
            i5 += height;
            paddingTop = height + max;
        }
        r0.f1623c.layout(i4, i5, measuredWidth, r0.f1623c.getMeasuredHeight() + i5);
        max2 = Math.min(paddingLeft, (i4 - r0.f1628h) - i2);
        r0.f1622b.layout(max2, i3, i2 + max2, r0.f1622b.getMeasuredHeight() + i3);
        i2 = Math.max((width - paddingRight) - i6, measuredWidth + r0.f1628h);
        r0.f1624d.layout(i2, paddingTop, i2 + i6, r0.f1624d.getMeasuredHeight() + paddingTop);
        r0.f1625e = f;
        r0.f1631k = false;
    }

    protected void onMeasure(int i, int i2) {
        if (MeasureSpec.getMode(i) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
            int size = MeasureSpec.getSize(i);
            i = getChildMeasureSpec(i, (int) (((float) size) * 0.2f), -2);
            this.f1622b.measure(i, childMeasureSpec);
            this.f1623c.measure(i, childMeasureSpec);
            this.f1624d.measure(i, childMeasureSpec);
            if (MeasureSpec.getMode(i2) == 1073741824) {
                i = MeasureSpec.getSize(i2);
            } else {
                i = Math.max(getMinHeight(), this.f1623c.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i, i2, this.f1623c.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1621a) {
            i = 0;
            if (this.f1625e < false) {
                i = this.f1625e;
            }
            mo436a(this.f1627g, i, 1);
        }
    }

    int getMinHeight() {
        Drawable background = getBackground();
        return background != null ? background.getIntrinsicHeight() : 0;
    }
}
