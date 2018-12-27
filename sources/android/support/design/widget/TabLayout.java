package android.support.design.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.C0143a.C0135d;
import android.support.design.C0143a.C0139h;
import android.support.design.C0143a.C0141j;
import android.support.design.C0143a.C0142k;
import android.support.v4.p017f.C0431k.C0430a;
import android.support.v4.p017f.C0431k.C3133b;
import android.support.v4.p017f.C0431k.C4435c;
import android.support.v4.view.C0555o;
import android.support.v4.view.C0556p;
import android.support.v4.view.C0560r;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C0518a;
import android.support.v4.view.ViewPager.C0520d;
import android.support.v4.view.ViewPager.C0521e;
import android.support.v4.widget.C0619o;
import android.support.v7.app.ActionBar.C0639b;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.p022c.p023a.C0680b;
import android.support.v7.widget.ba;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@C0518a
public class TabLayout extends HorizontalScrollView {
    /* renamed from: n */
    private static final C0430a<C0181e> f661n = new C4435c(16);
    /* renamed from: A */
    private DataSetObserver f662A;
    /* renamed from: B */
    private C3057f f663B;
    /* renamed from: C */
    private C3056a f664C;
    /* renamed from: D */
    private boolean f665D;
    /* renamed from: E */
    private final C0430a<C0182g> f666E;
    /* renamed from: a */
    int f667a;
    /* renamed from: b */
    int f668b;
    /* renamed from: c */
    int f669c;
    /* renamed from: d */
    int f670d;
    /* renamed from: e */
    int f671e;
    /* renamed from: f */
    ColorStateList f672f;
    /* renamed from: g */
    float f673g;
    /* renamed from: h */
    float f674h;
    /* renamed from: i */
    final int f675i;
    /* renamed from: j */
    int f676j;
    /* renamed from: k */
    int f677k;
    /* renamed from: l */
    int f678l;
    /* renamed from: m */
    ViewPager f679m;
    /* renamed from: o */
    private final ArrayList<C0181e> f680o;
    /* renamed from: p */
    private C0181e f681p;
    /* renamed from: q */
    private final C0180d f682q;
    /* renamed from: r */
    private final int f683r;
    /* renamed from: s */
    private final int f684s;
    /* renamed from: t */
    private final int f685t;
    /* renamed from: u */
    private int f686u;
    /* renamed from: v */
    private C0176b f687v;
    /* renamed from: w */
    private final ArrayList<C0176b> f688w;
    /* renamed from: x */
    private C0176b f689x;
    /* renamed from: y */
    private ValueAnimator f690y;
    /* renamed from: z */
    private C0555o f691z;

    /* renamed from: android.support.design.widget.TabLayout$1 */
    class C01751 implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ TabLayout f627a;

        C01751(TabLayout tabLayout) {
            this.f627a = tabLayout;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f627a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$b */
    public interface C0176b {
        /* renamed from: a */
        void mo140a(C0181e c0181e);

        /* renamed from: b */
        void mo141b(C0181e c0181e);

        /* renamed from: c */
        void mo142c(C0181e c0181e);
    }

    /* renamed from: android.support.design.widget.TabLayout$c */
    private class C0177c extends DataSetObserver {
        /* renamed from: a */
        final /* synthetic */ TabLayout f628a;

        C0177c(TabLayout tabLayout) {
            this.f628a = tabLayout;
        }

        public void onChanged() {
            this.f628a.m664d();
        }

        public void onInvalidated() {
            this.f628a.m664d();
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$d */
    private class C0180d extends LinearLayout {
        /* renamed from: a */
        int f636a = -1;
        /* renamed from: b */
        float f637b;
        /* renamed from: c */
        final /* synthetic */ TabLayout f638c;
        /* renamed from: d */
        private int f639d;
        /* renamed from: e */
        private final Paint f640e;
        /* renamed from: f */
        private int f641f = -1;
        /* renamed from: g */
        private int f642g = -1;
        /* renamed from: h */
        private int f643h = -1;
        /* renamed from: i */
        private ValueAnimator f644i;

        C0180d(TabLayout tabLayout, Context context) {
            this.f638c = tabLayout;
            super(context);
            setWillNotDraw(null);
            this.f640e = new Paint();
        }

        /* renamed from: a */
        void m604a(int i) {
            if (this.f640e.getColor() != i) {
                this.f640e.setColor(i);
                C0560r.m2189c(this);
            }
        }

        /* renamed from: b */
        void m609b(int i) {
            if (this.f639d != i) {
                this.f639d = i;
                C0560r.m2189c(this);
            }
        }

        /* renamed from: a */
        boolean m607a() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        void m605a(int i, float f) {
            if (this.f644i != null && this.f644i.isRunning()) {
                this.f644i.cancel();
            }
            this.f636a = i;
            this.f637b = f;
            m603c();
        }

        /* renamed from: b */
        float m608b() {
            return ((float) this.f636a) + this.f637b;
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.f641f != i) {
                requestLayout();
                this.f641f = i;
            }
        }

        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (MeasureSpec.getMode(i) == 1073741824) {
                Object obj = 1;
                if (this.f638c.f678l == 1 && this.f638c.f677k == 1) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        View childAt = getChildAt(i5);
                        if (childAt.getVisibility() == 0) {
                            i4 = Math.max(i4, childAt.getMeasuredWidth());
                        }
                    }
                    if (i4 > 0) {
                        if (i4 * childCount <= getMeasuredWidth() - (this.f638c.m658b(16) * 2)) {
                            Object obj2 = null;
                            while (i3 < childCount) {
                                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                                if (layoutParams.width != i4 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i4;
                                    layoutParams.weight = 0.0f;
                                    obj2 = 1;
                                }
                                i3++;
                            }
                            obj = obj2;
                        } else {
                            this.f638c.f677k = 0;
                            this.f638c.m657a(false);
                        }
                        if (obj != null) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f644i && this.f644i.isRunning()) {
                this.f644i.cancel();
                m610b(this.f636a, Math.round((1065353216 - this.f644i.getAnimatedFraction()) * ((float) this.f644i.getDuration())));
                return;
            }
            m603c();
        }

        /* renamed from: c */
        private void m603c() {
            int i;
            int i2;
            View childAt = getChildAt(this.f636a);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.f637b > 0.0f && this.f636a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f636a + 1);
                    i = (int) ((this.f637b * ((float) childAt2.getLeft())) + ((1.0f - this.f637b) * ((float) i)));
                    i2 = (int) ((this.f637b * ((float) childAt2.getRight())) + ((1.0f - this.f637b) * ((float) i2)));
                }
            }
            m606a(i, i2);
        }

        /* renamed from: a */
        void m606a(int i, int i2) {
            if (i != this.f642g || i2 != this.f643h) {
                this.f642g = i;
                this.f643h = i2;
                C0560r.m2189c(this);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: b */
        void m610b(final int r10, int r11) {
            /*
            r9 = this;
            r0 = r9.f644i;
            if (r0 == 0) goto L_0x0011;
        L_0x0004:
            r0 = r9.f644i;
            r0 = r0.isRunning();
            if (r0 == 0) goto L_0x0011;
        L_0x000c:
            r0 = r9.f644i;
            r0.cancel();
        L_0x0011:
            r0 = android.support.v4.view.C0560r.m2193e(r9);
            r1 = 1;
            if (r0 != r1) goto L_0x001a;
        L_0x0018:
            r0 = 1;
            goto L_0x001b;
        L_0x001a:
            r0 = 0;
        L_0x001b:
            r2 = r9.getChildAt(r10);
            if (r2 != 0) goto L_0x0025;
        L_0x0021:
            r9.m603c();
            return;
        L_0x0025:
            r6 = r2.getLeft();
            r8 = r2.getRight();
            r2 = r9.f636a;
            r2 = r10 - r2;
            r2 = java.lang.Math.abs(r2);
            if (r2 > r1) goto L_0x003e;
        L_0x0037:
            r0 = r9.f642g;
            r1 = r9.f643h;
            r5 = r0;
            r7 = r1;
            goto L_0x005b;
        L_0x003e:
            r1 = r9.f638c;
            r2 = 24;
            r1 = r1.m658b(r2);
            r2 = r9.f636a;
            if (r10 >= r2) goto L_0x0054;
        L_0x004a:
            if (r0 == 0) goto L_0x0051;
        L_0x004c:
            r0 = r6 - r1;
        L_0x004e:
            r5 = r0;
        L_0x004f:
            r7 = r5;
            goto L_0x005b;
        L_0x0051:
            r1 = r1 + r8;
        L_0x0052:
            r5 = r1;
            goto L_0x004f;
        L_0x0054:
            if (r0 == 0) goto L_0x0058;
        L_0x0056:
            r1 = r1 + r8;
            goto L_0x0052;
        L_0x0058:
            r0 = r6 - r1;
            goto L_0x004e;
        L_0x005b:
            if (r5 != r6) goto L_0x005f;
        L_0x005d:
            if (r7 == r8) goto L_0x008d;
        L_0x005f:
            r0 = new android.animation.ValueAnimator;
            r0.<init>();
            r9.f644i = r0;
            r1 = android.support.design.widget.C0189a.f700b;
            r0.setInterpolator(r1);
            r1 = (long) r11;
            r0.setDuration(r1);
            r11 = 2;
            r11 = new float[r11];
            r11 = {0, 1065353216};
            r0.setFloatValues(r11);
            r11 = new android.support.design.widget.TabLayout$d$1;
            r3 = r11;
            r4 = r9;
            r3.<init>(r4, r5, r6, r7, r8);
            r0.addUpdateListener(r11);
            r11 = new android.support.design.widget.TabLayout$d$2;
            r11.<init>(r9, r10);
            r0.addListener(r11);
            r0.start();
        L_0x008d:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.d.b(int, int):void");
        }

        public void draw(Canvas canvas) {
            super.draw(canvas);
            if (this.f642g >= 0 && this.f643h > this.f642g) {
                canvas.drawRect((float) this.f642g, (float) (getHeight() - this.f639d), (float) this.f643h, (float) getHeight(), this.f640e);
            }
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$e */
    public static final class C0181e {
        /* renamed from: a */
        TabLayout f645a;
        /* renamed from: b */
        C0182g f646b;
        /* renamed from: c */
        private Object f647c;
        /* renamed from: d */
        private Drawable f648d;
        /* renamed from: e */
        private CharSequence f649e;
        /* renamed from: f */
        private CharSequence f650f;
        /* renamed from: g */
        private int f651g = -1;
        /* renamed from: h */
        private View f652h;

        C0181e() {
        }

        /* renamed from: a */
        public View m615a() {
            return this.f652h;
        }

        /* renamed from: a */
        public C0181e m613a(View view) {
            this.f652h = view;
            m624h();
            return this;
        }

        /* renamed from: a */
        public C0181e m611a(int i) {
            return m613a(LayoutInflater.from(this.f646b.getContext()).inflate(i, this.f646b, false));
        }

        /* renamed from: b */
        public Drawable m616b() {
            return this.f648d;
        }

        /* renamed from: c */
        public int m619c() {
            return this.f651g;
        }

        /* renamed from: b */
        void m618b(int i) {
            this.f651g = i;
        }

        /* renamed from: d */
        public CharSequence m620d() {
            return this.f649e;
        }

        /* renamed from: a */
        public C0181e m612a(Drawable drawable) {
            this.f648d = drawable;
            m624h();
            return this;
        }

        /* renamed from: a */
        public C0181e m614a(CharSequence charSequence) {
            this.f649e = charSequence;
            m624h();
            return this;
        }

        /* renamed from: e */
        public void m621e() {
            if (this.f645a != null) {
                this.f645a.m661b(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: f */
        public boolean m622f() {
            if (this.f645a != null) {
                return this.f645a.getSelectedTabPosition() == this.f651g;
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }

        /* renamed from: b */
        public C0181e m617b(CharSequence charSequence) {
            this.f650f = charSequence;
            m624h();
            return this;
        }

        /* renamed from: g */
        public CharSequence m623g() {
            return this.f650f;
        }

        /* renamed from: h */
        void m624h() {
            if (this.f646b != null) {
                this.f646b.m630b();
            }
        }

        /* renamed from: i */
        void m625i() {
            this.f645a = null;
            this.f646b = null;
            this.f647c = null;
            this.f648d = null;
            this.f649e = null;
            this.f650f = null;
            this.f651g = -1;
            this.f652h = null;
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$g */
    class C0182g extends LinearLayout {
        /* renamed from: a */
        final /* synthetic */ TabLayout f653a;
        /* renamed from: b */
        private C0181e f654b;
        /* renamed from: c */
        private TextView f655c;
        /* renamed from: d */
        private ImageView f656d;
        /* renamed from: e */
        private View f657e;
        /* renamed from: f */
        private TextView f658f;
        /* renamed from: g */
        private ImageView f659g;
        /* renamed from: h */
        private int f660h = 2;

        public C0182g(TabLayout tabLayout, Context context) {
            this.f653a = tabLayout;
            super(context);
            if (tabLayout.f675i != 0) {
                C0560r.m2174a((View) this, C0680b.m2703b(context, tabLayout.f675i));
            }
            C0560r.m2186b(this, tabLayout.f667a, tabLayout.f668b, tabLayout.f669c, tabLayout.f670d);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            C0560r.m2177a((View) this, C0556p.m2106a(getContext(), 1002));
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f654b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f654b.m621e();
            return true;
        }

        public void setSelected(boolean z) {
            Object obj = isSelected() != z ? 1 : null;
            super.setSelected(z);
            if (obj != null && z && VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            if (this.f655c != null) {
                this.f655c.setSelected(z);
            }
            if (this.f656d != null) {
                this.f656d.setSelected(z);
            }
            if (this.f657e != null) {
                this.f657e.setSelected(z);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0639b.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0639b.class.getName());
        }

        public void onMeasure(int i, int i2) {
            int size = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            int tabMaxWidth = this.f653a.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(this.f653a.f676j, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f655c != null) {
                getResources();
                float f = this.f653a.f673g;
                mode = this.f660h;
                Object obj = 1;
                if (this.f656d != null && this.f656d.getVisibility() == 0) {
                    mode = 1;
                } else if (this.f655c != null && this.f655c.getLineCount() > 1) {
                    f = this.f653a.f674h;
                }
                float textSize = this.f655c.getTextSize();
                int lineCount = this.f655c.getLineCount();
                int a = C0619o.m2473a(this.f655c);
                if (f != textSize || (a >= 0 && mode != a)) {
                    if (this.f653a.f678l == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.f655c.getLayout();
                        if (layout == null || m626a(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            obj = null;
                        }
                    }
                    if (obj != null) {
                        this.f655c.setTextSize(0, f);
                        this.f655c.setMaxLines(mode);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* renamed from: a */
        void m629a(C0181e c0181e) {
            if (c0181e != this.f654b) {
                this.f654b = c0181e;
                m630b();
            }
        }

        /* renamed from: a */
        void m628a() {
            m629a(null);
            setSelected(false);
        }

        /* renamed from: b */
        final void m630b() {
            C0181e c0181e = this.f654b;
            View a = c0181e != null ? c0181e.m615a() : null;
            if (a != null) {
                C0182g parent = a.getParent();
                if (parent != this) {
                    if (parent != null) {
                        parent.removeView(a);
                    }
                    addView(a);
                }
                this.f657e = a;
                if (this.f655c != null) {
                    this.f655c.setVisibility(8);
                }
                if (this.f656d != null) {
                    this.f656d.setVisibility(8);
                    this.f656d.setImageDrawable(null);
                }
                this.f658f = (TextView) a.findViewById(16908308);
                if (this.f658f != null) {
                    this.f660h = C0619o.m2473a(this.f658f);
                }
                this.f659g = (ImageView) a.findViewById(16908294);
            } else {
                if (this.f657e != null) {
                    removeView(this.f657e);
                    this.f657e = null;
                }
                this.f658f = null;
                this.f659g = null;
            }
            boolean z = false;
            if (this.f657e == null) {
                if (this.f656d == null) {
                    ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C0139h.design_layout_tab_icon, this, false);
                    addView(imageView, 0);
                    this.f656d = imageView;
                }
                if (this.f655c == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C0139h.design_layout_tab_text, this, false);
                    addView(textView);
                    this.f655c = textView;
                    this.f660h = C0619o.m2473a(this.f655c);
                }
                C0619o.m2474a(this.f655c, this.f653a.f671e);
                if (this.f653a.f672f != null) {
                    this.f655c.setTextColor(this.f653a.f672f);
                }
                m627a(this.f655c, this.f656d);
            } else if (!(this.f658f == null && this.f659g == null)) {
                m627a(this.f658f, this.f659g);
            }
            if (c0181e != null && c0181e.m622f()) {
                z = true;
            }
            setSelected(z);
        }

        /* renamed from: a */
        private void m627a(TextView textView, ImageView imageView) {
            CharSequence charSequence = null;
            Drawable b = this.f654b != null ? this.f654b.m616b() : null;
            CharSequence d = this.f654b != null ? this.f654b.m620d() : null;
            CharSequence g = this.f654b != null ? this.f654b.m623g() : null;
            int i = 0;
            if (imageView != null) {
                if (b != null) {
                    imageView.setImageDrawable(b);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(g);
            }
            int isEmpty = TextUtils.isEmpty(d) ^ 1;
            if (textView != null) {
                if (isEmpty != 0) {
                    textView.setText(d);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText(null);
                }
                textView.setContentDescription(g);
            }
            if (imageView != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                if (isEmpty != 0 && imageView.getVisibility() == 0) {
                    i = this.f653a.m658b(8);
                }
                if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    imageView.requestLayout();
                }
            }
            if (isEmpty == 0) {
                charSequence = g;
            }
            ba.m3562a(this, charSequence);
        }

        /* renamed from: a */
        private float m626a(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$a */
    private class C3056a implements C0520d {
        /* renamed from: a */
        final /* synthetic */ TabLayout f12924a;
        /* renamed from: b */
        private boolean f12925b;

        C3056a(TabLayout tabLayout) {
            this.f12924a = tabLayout;
        }

        /* renamed from: a */
        public void mo136a(ViewPager viewPager, C0555o c0555o, C0555o c0555o2) {
            if (this.f12924a.f679m == viewPager) {
                this.f12924a.m656a(c0555o2, this.f12925b);
            }
        }

        /* renamed from: a */
        void m15019a(boolean z) {
            this.f12925b = z;
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$f */
    public static class C3057f implements C0521e {
        /* renamed from: a */
        private final WeakReference<TabLayout> f12926a;
        /* renamed from: b */
        private int f12927b;
        /* renamed from: c */
        private int f12928c;

        public C3057f(TabLayout tabLayout) {
            this.f12926a = new WeakReference(tabLayout);
        }

        /* renamed from: a */
        public void mo137a(int i) {
            this.f12927b = this.f12928c;
            this.f12928c = i;
        }

        /* renamed from: a */
        public void mo138a(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f12926a.get();
            if (tabLayout != null) {
                boolean z;
                boolean z2 = false;
                if (this.f12928c == 2) {
                    if (this.f12927b != 1) {
                        z = false;
                        if (!(this.f12928c == 2 && this.f12927b == 0)) {
                            z2 = true;
                        }
                        tabLayout.m651a(i, f, z, z2);
                    }
                }
                z = true;
                z2 = true;
                tabLayout.m651a(i, f, z, z2);
            }
        }

        /* renamed from: b */
        public void mo139b(int i) {
            TabLayout tabLayout = (TabLayout) this.f12926a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                boolean z;
                if (this.f12928c != 0) {
                    if (this.f12928c != 2 || this.f12927b != 0) {
                        z = false;
                        tabLayout.m662b(tabLayout.m649a(i), z);
                    }
                }
                z = true;
                tabLayout.m662b(tabLayout.m649a(i), z);
            }
        }

        /* renamed from: a */
        void m15020a() {
            this.f12928c = 0;
            this.f12927b = 0;
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$h */
    public static class C3058h implements C0176b {
        /* renamed from: a */
        private final ViewPager f12929a;

        /* renamed from: b */
        public void mo141b(C0181e c0181e) {
        }

        /* renamed from: c */
        public void mo142c(C0181e c0181e) {
        }

        public C3058h(ViewPager viewPager) {
            this.f12929a = viewPager;
        }

        /* renamed from: a */
        public void mo140a(C0181e c0181e) {
            this.f12929a.setCurrentItem(c0181e.m619c());
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f680o = new ArrayList();
        this.f676j = BaseClientBuilder.API_PRIORITY_OTHER;
        this.f688w = new ArrayList();
        this.f666E = new C3133b(12);
        C0219m.m807a(context);
        setHorizontalScrollBarEnabled(false);
        this.f682q = new C0180d(this, context);
        super.addView(this.f682q, 0, new FrameLayout.LayoutParams(-2, -1));
        attributeSet = context.obtainStyledAttributes(attributeSet, C0142k.TabLayout, i, C0141j.Widget_Design_TabLayout);
        this.f682q.m609b(attributeSet.getDimensionPixelSize(C0142k.TabLayout_tabIndicatorHeight, 0));
        this.f682q.m604a(attributeSet.getColor(C0142k.TabLayout_tabIndicatorColor, 0));
        i = attributeSet.getDimensionPixelSize(C0142k.TabLayout_tabPadding, 0);
        this.f670d = i;
        this.f669c = i;
        this.f668b = i;
        this.f667a = i;
        this.f667a = attributeSet.getDimensionPixelSize(C0142k.TabLayout_tabPaddingStart, this.f667a);
        this.f668b = attributeSet.getDimensionPixelSize(C0142k.TabLayout_tabPaddingTop, this.f668b);
        this.f669c = attributeSet.getDimensionPixelSize(C0142k.TabLayout_tabPaddingEnd, this.f669c);
        this.f670d = attributeSet.getDimensionPixelSize(C0142k.TabLayout_tabPaddingBottom, this.f670d);
        this.f671e = attributeSet.getResourceId(C0142k.TabLayout_tabTextAppearance, C0141j.TextAppearance_Design_Tab);
        context = context.obtainStyledAttributes(this.f671e, C0636j.TextAppearance);
        try {
            this.f673g = (float) context.getDimensionPixelSize(C0636j.TextAppearance_android_textSize, 0);
            this.f672f = context.getColorStateList(C0636j.TextAppearance_android_textColor);
            if (attributeSet.hasValue(C0142k.TabLayout_tabTextColor) != null) {
                this.f672f = attributeSet.getColorStateList(C0142k.TabLayout_tabTextColor);
            }
            if (attributeSet.hasValue(C0142k.TabLayout_tabSelectedTextColor) != null) {
                this.f672f = m632a(this.f672f.getDefaultColor(), attributeSet.getColor(C0142k.TabLayout_tabSelectedTextColor, 0));
            }
            this.f683r = attributeSet.getDimensionPixelSize(C0142k.TabLayout_tabMinWidth, -1);
            this.f684s = attributeSet.getDimensionPixelSize(C0142k.TabLayout_tabMaxWidth, -1);
            this.f675i = attributeSet.getResourceId(C0142k.TabLayout_tabBackground, 0);
            this.f686u = attributeSet.getDimensionPixelSize(C0142k.TabLayout_tabContentStart, 0);
            this.f678l = attributeSet.getInt(C0142k.TabLayout_tabMode, 1);
            this.f677k = attributeSet.getInt(C0142k.TabLayout_tabGravity, 0);
            attributeSet.recycle();
            context = getResources();
            this.f674h = (float) context.getDimensionPixelSize(C0135d.design_tab_text_size_2line);
            this.f685t = context.getDimensionPixelSize(C0135d.design_tab_scrollable_min_width);
            m648h();
        } finally {
            context.recycle();
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f682q.m604a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f682q.m609b(i);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        m651a(i, f, z, true);
    }

    /* renamed from: a */
    void m651a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0) {
            if (round < this.f682q.getChildCount()) {
                if (z2) {
                    this.f682q.m605a(i, f);
                }
                if (this.f690y && this.f690y.isRunning()) {
                    this.f690y.cancel();
                }
                scrollTo(m631a(i, f), 0.0f);
                if (z) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    private float getScrollPosition() {
        return this.f682q.m608b();
    }

    /* renamed from: a */
    public void m653a(C0181e c0181e) {
        m655a(c0181e, this.f680o.isEmpty());
    }

    /* renamed from: a */
    public void m655a(C0181e c0181e, boolean z) {
        m654a(c0181e, this.f680o.size(), z);
    }

    /* renamed from: a */
    public void m654a(C0181e c0181e, int i, boolean z) {
        if (c0181e.f645a == this) {
            m634a(c0181e, i);
            m641d(c0181e);
            if (z) {
                c0181e.m621e();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: a */
    private void m633a(TabItem tabItem) {
        C0181e b = mo1263b();
        if (tabItem.f624a != null) {
            b.m614a(tabItem.f624a);
        }
        if (tabItem.f625b != null) {
            b.m612a(tabItem.f625b);
        }
        if (tabItem.f626c != 0) {
            b.m611a(tabItem.f626c);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            b.m617b(tabItem.getContentDescription());
        }
        m653a(b);
    }

    @Deprecated
    public void setOnTabSelectedListener(C0176b c0176b) {
        if (this.f687v != null) {
            m660b(this.f687v);
        }
        this.f687v = c0176b;
        if (c0176b != null) {
            m652a(c0176b);
        }
    }

    /* renamed from: a */
    public void m652a(C0176b c0176b) {
        if (!this.f688w.contains(c0176b)) {
            this.f688w.add(c0176b);
        }
    }

    /* renamed from: b */
    public void m660b(C0176b c0176b) {
        this.f688w.remove(c0176b);
    }

    /* renamed from: a */
    public void m650a() {
        this.f688w.clear();
    }

    /* renamed from: b */
    public C0181e mo1263b() {
        C0181e c0181e = (C0181e) f661n.mo338a();
        if (c0181e == null) {
            c0181e = new C0181e();
        }
        c0181e.f645a = this;
        c0181e.f646b = m638c(c0181e);
        return c0181e;
    }

    public int getTabCount() {
        return this.f680o.size();
    }

    /* renamed from: a */
    public C0181e m649a(int i) {
        if (i >= 0) {
            if (i < getTabCount()) {
                return (C0181e) this.f680o.get(i);
            }
        }
        return 0;
    }

    public int getSelectedTabPosition() {
        return this.f681p != null ? this.f681p.m619c() : -1;
    }

    /* renamed from: c */
    public void m663c() {
        for (int childCount = this.f682q.getChildCount() - 1; childCount >= 0; childCount--) {
            m639c(childCount);
        }
        Iterator it = this.f680o.iterator();
        while (it.hasNext()) {
            C0181e c0181e = (C0181e) it.next();
            it.remove();
            c0181e.m625i();
            f661n.mo339a(c0181e);
        }
        this.f681p = null;
    }

    public void setTabMode(int i) {
        if (i != this.f678l) {
            this.f678l = i;
            m648h();
        }
    }

    public int getTabMode() {
        return this.f678l;
    }

    public void setTabGravity(int i) {
        if (this.f677k != i) {
            this.f677k = i;
            m648h();
        }
    }

    public int getTabGravity() {
        return this.f677k;
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f672f != colorStateList) {
            this.f672f = colorStateList;
            m642e();
        }
    }

    public ColorStateList getTabTextColors() {
        return this.f672f;
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(m632a(i, i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        m635a(viewPager, z, false);
    }

    /* renamed from: a */
    private void m635a(ViewPager viewPager, boolean z, boolean z2) {
        if (this.f679m != null) {
            if (this.f663B != null) {
                this.f679m.m1937b(this.f663B);
            }
            if (this.f664C != null) {
                this.f679m.m1936b(this.f664C);
            }
        }
        if (this.f689x != null) {
            m660b(this.f689x);
            this.f689x = null;
        }
        if (viewPager != null) {
            this.f679m = viewPager;
            if (this.f663B == null) {
                this.f663B = new C3057f(this);
            }
            this.f663B.m15020a();
            viewPager.m1930a(this.f663B);
            this.f689x = new C3058h(viewPager);
            m652a(this.f689x);
            C0555o adapter = viewPager.getAdapter();
            if (adapter != null) {
                m656a(adapter, z);
            }
            if (this.f664C == null) {
                this.f664C = new C3056a(this);
            }
            this.f664C.m15019a(z);
            viewPager.m1929a(this.f664C);
            setScrollPosition(viewPager.getCurrentItem(), false, true);
        } else {
            this.f679m = null;
            m656a(null, false);
        }
        this.f665D = z2;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(C0555o c0555o) {
        m656a(c0555o, false);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f679m == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m635a((ViewPager) parent, true, true);
            }
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f665D) {
            setupWithViewPager(null);
            this.f665D = false;
        }
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f682q.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: a */
    void m656a(C0555o c0555o, boolean z) {
        if (!(this.f691z == null || this.f662A == null)) {
            this.f691z.m2098b(this.f662A);
        }
        this.f691z = c0555o;
        if (z && c0555o != null) {
            if (!this.f662A) {
                this.f662A = new C0177c(this);
            }
            c0555o.m2090a(this.f662A);
        }
        m664d();
    }

    /* renamed from: d */
    void m664d() {
        m663c();
        if (this.f691z != null) {
            int b = this.f691z.mo1187b();
            for (int i = 0; i < b; i++) {
                m655a(mo1263b().m614a(this.f691z.mo3918c(i)), false);
            }
            if (this.f679m != null && b > 0) {
                b = this.f679m.getCurrentItem();
                if (b != getSelectedTabPosition() && b < getTabCount()) {
                    m661b(m649a(b));
                }
            }
        }
    }

    /* renamed from: e */
    private void m642e() {
        int size = this.f680o.size();
        for (int i = 0; i < size; i++) {
            ((C0181e) this.f680o.get(i)).m624h();
        }
    }

    /* renamed from: c */
    private C0182g m638c(C0181e c0181e) {
        C0182g c0182g = this.f666E != null ? (C0182g) this.f666E.mo338a() : null;
        if (c0182g == null) {
            c0182g = new C0182g(this, getContext());
        }
        c0182g.m629a(c0181e);
        c0182g.setFocusable(true);
        c0182g.setMinimumWidth(getTabMinWidth());
        return c0182g;
    }

    /* renamed from: a */
    private void m634a(C0181e c0181e, int i) {
        c0181e.m618b(i);
        this.f680o.add(i, c0181e);
        c0181e = this.f680o.size();
        while (true) {
            i++;
            if (i < c0181e) {
                ((C0181e) this.f680o.get(i)).m618b(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private void m641d(C0181e c0181e) {
        this.f682q.addView(c0181e.f646b, c0181e.m619c(), m644f());
    }

    public void addView(View view) {
        m636a(view);
    }

    public void addView(View view, int i) {
        m636a(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m636a(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m636a(view);
    }

    /* renamed from: a */
    private void m636a(View view) {
        if (view instanceof TabItem) {
            m633a((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: f */
    private LayoutParams m644f() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        m637a(layoutParams);
        return layoutParams;
    }

    /* renamed from: a */
    private void m637a(LayoutParams layoutParams) {
        if (this.f678l == 1 && this.f677k == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    /* renamed from: b */
    int m658b(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r6, int r7) {
        /*
        r5 = this;
        r0 = r5.getDefaultHeight();
        r0 = r5.m658b(r0);
        r1 = r5.getPaddingTop();
        r0 = r0 + r1;
        r1 = r5.getPaddingBottom();
        r0 = r0 + r1;
        r1 = android.view.View.MeasureSpec.getMode(r7);
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r1 == r2) goto L_0x0024;
    L_0x001c:
        if (r1 == 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0030;
    L_0x001f:
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3);
        goto L_0x0030;
    L_0x0024:
        r7 = android.view.View.MeasureSpec.getSize(r7);
        r7 = java.lang.Math.min(r0, r7);
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3);
    L_0x0030:
        r0 = android.view.View.MeasureSpec.getSize(r6);
        r1 = android.view.View.MeasureSpec.getMode(r6);
        if (r1 == 0) goto L_0x004a;
    L_0x003a:
        r1 = r5.f684s;
        if (r1 <= 0) goto L_0x0041;
    L_0x003e:
        r0 = r5.f684s;
        goto L_0x0048;
    L_0x0041:
        r1 = 56;
        r1 = r5.m658b(r1);
        r0 = r0 - r1;
    L_0x0048:
        r5.f676j = r0;
    L_0x004a:
        super.onMeasure(r6, r7);
        r6 = r5.getChildCount();
        r0 = 1;
        if (r6 != r0) goto L_0x0096;
    L_0x0054:
        r6 = 0;
        r1 = r5.getChildAt(r6);
        r2 = r5.f678l;
        switch(r2) {
            case 0: goto L_0x006b;
            case 1: goto L_0x005f;
            default: goto L_0x005e;
        };
    L_0x005e:
        goto L_0x0076;
    L_0x005f:
        r2 = r1.getMeasuredWidth();
        r4 = r5.getMeasuredWidth();
        if (r2 == r4) goto L_0x0076;
    L_0x0069:
        r6 = 1;
        goto L_0x0076;
    L_0x006b:
        r2 = r1.getMeasuredWidth();
        r4 = r5.getMeasuredWidth();
        if (r2 >= r4) goto L_0x0076;
    L_0x0075:
        goto L_0x0069;
    L_0x0076:
        if (r6 == 0) goto L_0x0096;
    L_0x0078:
        r6 = r5.getPaddingTop();
        r0 = r5.getPaddingBottom();
        r6 = r6 + r0;
        r0 = r1.getLayoutParams();
        r0 = r0.height;
        r6 = getChildMeasureSpec(r7, r6, r0);
        r7 = r5.getMeasuredWidth();
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3);
        r1.measure(r7, r6);
    L_0x0096:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.onMeasure(int, int):void");
    }

    /* renamed from: c */
    private void m639c(int i) {
        C0182g c0182g = (C0182g) this.f682q.getChildAt(i);
        this.f682q.removeViewAt(i);
        if (c0182g != null) {
            c0182g.m628a();
            this.f666E.mo339a(c0182g);
        }
        requestLayout();
    }

    /* renamed from: d */
    private void m640d(int i) {
        if (i != -1) {
            if (getWindowToken() != null && C0560r.m2212x(this)) {
                if (!this.f682q.m607a()) {
                    if (getScrollX() != m631a(i, 0.0f)) {
                        m646g();
                        this.f690y.setIntValues(new int[]{r0, r2});
                        this.f690y.start();
                    }
                    this.f682q.m610b(i, 300);
                    return;
                }
            }
            setScrollPosition(i, 0.0f, true);
        }
    }

    /* renamed from: g */
    private void m646g() {
        if (this.f690y == null) {
            this.f690y = new ValueAnimator();
            this.f690y.setInterpolator(C0189a.f700b);
            this.f690y.setDuration(300);
            this.f690y.addUpdateListener(new C01751(this));
        }
    }

    void setScrollAnimatorListener(AnimatorListener animatorListener) {
        m646g();
        this.f690y.addListener(animatorListener);
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f682q.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                this.f682q.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    /* renamed from: b */
    void m661b(C0181e c0181e) {
        m662b(c0181e, true);
    }

    /* renamed from: b */
    void m662b(C0181e c0181e, boolean z) {
        C0181e c0181e2 = this.f681p;
        if (c0181e2 != c0181e) {
            int c = c0181e != null ? c0181e.m619c() : -1;
            if (z) {
                if ((c0181e2 == null || c0181e2.m619c()) && c != -1) {
                    setScrollPosition(c, false, true);
                } else {
                    m640d(c);
                }
                if (c != -1) {
                    setSelectedTabView(c);
                }
            }
            if (c0181e2 != null) {
                m645f(c0181e2);
            }
            this.f681p = c0181e;
            if (c0181e != null) {
                m643e(c0181e);
            }
        } else if (c0181e2 != null) {
            m647g(c0181e);
            m640d(c0181e.m619c());
        }
    }

    /* renamed from: e */
    private void m643e(C0181e c0181e) {
        for (int size = this.f688w.size() - 1; size >= 0; size--) {
            ((C0176b) this.f688w.get(size)).mo140a(c0181e);
        }
    }

    /* renamed from: f */
    private void m645f(C0181e c0181e) {
        for (int size = this.f688w.size() - 1; size >= 0; size--) {
            ((C0176b) this.f688w.get(size)).mo141b(c0181e);
        }
    }

    /* renamed from: g */
    private void m647g(C0181e c0181e) {
        for (int size = this.f688w.size() - 1; size >= 0; size--) {
            ((C0176b) this.f688w.get(size)).mo142c(c0181e);
        }
    }

    /* renamed from: a */
    private int m631a(int i, float f) {
        int i2 = 0;
        if (this.f678l != 0) {
            return 0;
        }
        View childAt = this.f682q.getChildAt(i);
        i++;
        i = i < this.f682q.getChildCount() ? this.f682q.getChildAt(i) : 0;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (i != 0) {
            i2 = i.getWidth();
        }
        i = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        f = (int) ((((float) (width + i2)) * 0.5f) * f);
        return C0560r.m2193e(this) == 0 ? i + f : i - f;
    }

    /* renamed from: h */
    private void m648h() {
        C0560r.m2186b(this.f682q, this.f678l == 0 ? Math.max(0, this.f686u - this.f667a) : 0, 0, 0, 0);
        switch (this.f678l) {
            case 0:
                this.f682q.setGravity(8388611);
                break;
            case 1:
                this.f682q.setGravity(1);
                break;
            default:
                break;
        }
        m657a(true);
    }

    /* renamed from: a */
    void m657a(boolean z) {
        for (int i = 0; i < this.f682q.getChildCount(); i++) {
            View childAt = this.f682q.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m637a((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* renamed from: a */
    private static ColorStateList m632a(int i, int i2) {
        r1 = new int[2][];
        int[] iArr = new int[]{SELECTED_STATE_SET, i2};
        r1[1] = EMPTY_STATE_SET;
        iArr[1] = i;
        return new ColorStateList(r1, iArr);
    }

    private int getDefaultHeight() {
        int size = this.f680o.size();
        Object obj = null;
        for (int i = 0; i < size; i++) {
            C0181e c0181e = (C0181e) this.f680o.get(i);
            if (c0181e != null && c0181e.m616b() != null && !TextUtils.isEmpty(c0181e.m620d())) {
                obj = 1;
                break;
            }
        }
        return obj != null ? 72 : 48;
    }

    private int getTabMinWidth() {
        if (this.f683r != -1) {
            return this.f683r;
        }
        return this.f678l == 0 ? this.f685t : 0;
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    int getTabMaxWidth() {
        return this.f676j;
    }
}
