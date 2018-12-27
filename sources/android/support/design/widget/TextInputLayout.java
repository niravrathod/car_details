package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0143a.C0139h;
import android.support.design.C0143a.C0140i;
import android.support.design.C0143a.C0141j;
import android.support.design.C0143a.C0142k;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0536a;
import android.support.v4.view.C0560r;
import android.support.v4.view.p018a.C0532b;
import android.support.v4.widget.C0619o;
import android.support.v4.widget.C0626s;
import android.support.v4.widget.Space;
import android.support.v7.p022c.p023a.C0680b;
import android.support.v7.widget.C0862h;
import android.support.v7.widget.C0885y;
import android.support.v7.widget.ay;
import android.support.v7.widget.bh;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TextInputLayout extends LinearLayout implements bh {
    /* renamed from: A */
    private boolean f12933A;
    /* renamed from: B */
    private Drawable f12934B;
    /* renamed from: C */
    private Drawable f12935C;
    /* renamed from: D */
    private ColorStateList f12936D;
    /* renamed from: E */
    private boolean f12937E;
    /* renamed from: F */
    private Mode f12938F;
    /* renamed from: G */
    private boolean f12939G;
    /* renamed from: H */
    private ColorStateList f12940H;
    /* renamed from: I */
    private ColorStateList f12941I;
    /* renamed from: J */
    private boolean f12942J;
    /* renamed from: K */
    private boolean f12943K;
    /* renamed from: L */
    private ValueAnimator f12944L;
    /* renamed from: M */
    private boolean f12945M;
    /* renamed from: N */
    private boolean f12946N;
    /* renamed from: O */
    private boolean f12947O;
    /* renamed from: a */
    EditText f12948a;
    /* renamed from: b */
    TextView f12949b;
    /* renamed from: c */
    boolean f12950c;
    /* renamed from: d */
    final C0202e f12951d;
    /* renamed from: e */
    private final FrameLayout f12952e;
    /* renamed from: f */
    private CharSequence f12953f;
    /* renamed from: g */
    private boolean f12954g;
    /* renamed from: h */
    private CharSequence f12955h;
    /* renamed from: i */
    private Paint f12956i;
    /* renamed from: j */
    private final Rect f12957j;
    /* renamed from: k */
    private LinearLayout f12958k;
    /* renamed from: l */
    private int f12959l;
    /* renamed from: m */
    private Typeface f12960m;
    /* renamed from: n */
    private boolean f12961n;
    /* renamed from: o */
    private int f12962o;
    /* renamed from: p */
    private boolean f12963p;
    /* renamed from: q */
    private CharSequence f12964q;
    /* renamed from: r */
    private TextView f12965r;
    /* renamed from: s */
    private int f12966s;
    /* renamed from: t */
    private int f12967t;
    /* renamed from: u */
    private int f12968u;
    /* renamed from: v */
    private boolean f12969v;
    /* renamed from: w */
    private boolean f12970w;
    /* renamed from: x */
    private Drawable f12971x;
    /* renamed from: y */
    private CharSequence f12972y;
    /* renamed from: z */
    private CheckableImageButton f12973z;

    /* renamed from: android.support.design.widget.TextInputLayout$1 */
    class C01831 implements TextWatcher {
        /* renamed from: a */
        final /* synthetic */ TextInputLayout f692a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C01831(TextInputLayout textInputLayout) {
            this.f692a = textInputLayout;
        }

        public void afterTextChanged(Editable editable) {
            this.f692a.m15050a(this.f692a.f12947O ^ 1);
            if (this.f692a.f12950c) {
                this.f692a.m15049a(editable.length());
            }
        }
    }

    /* renamed from: android.support.design.widget.TextInputLayout$2 */
    class C01842 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ TextInputLayout f693a;

        C01842(TextInputLayout textInputLayout) {
            this.f693a = textInputLayout;
        }

        public void onAnimationStart(Animator animator) {
            this.f693a.f12949b.setVisibility(0);
        }
    }

    /* renamed from: android.support.design.widget.TextInputLayout$4 */
    class C01864 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ TextInputLayout f696a;

        C01864(TextInputLayout textInputLayout) {
            this.f696a = textInputLayout;
        }

        public void onClick(View view) {
            this.f696a.m15039b(false);
        }
    }

    /* renamed from: android.support.design.widget.TextInputLayout$5 */
    class C01875 implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ TextInputLayout f697a;

        C01875(TextInputLayout textInputLayout) {
            this.f697a = textInputLayout;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f697a.f12951d.m726b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C01881();
        /* renamed from: a */
        CharSequence f12930a;
        /* renamed from: b */
        boolean f12931b;

        /* renamed from: android.support.design.widget.TextInputLayout$SavedState$1 */
        static class C01881 implements ClassLoaderCreator<SavedState> {
            C01881() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m665a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m666a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m667a(i);
            }

            /* renamed from: a */
            public SavedState m666a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState m665a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m667a(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12930a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            classLoader = true;
            if (parcel.readInt() != 1) {
                classLoader = null;
            }
            this.f12931b = classLoader;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f12930a, parcel, i);
            parcel.writeInt(this.f12931b);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TextInputLayout.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" error=");
            stringBuilder.append(this.f12930a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.design.widget.TextInputLayout$a */
    private class C3059a extends C0536a {
        /* renamed from: a */
        final /* synthetic */ TextInputLayout f12932a;

        C3059a(TextInputLayout textInputLayout) {
            this.f12932a = textInputLayout;
        }

        /* renamed from: a */
        public void mo119a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo119a(view, accessibilityEvent);
            accessibilityEvent.setClassName(TextInputLayout.class.getSimpleName());
        }

        /* renamed from: b */
        public void mo143b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo143b(view, accessibilityEvent);
            view = this.f12932a.f12951d.m742j();
            if (!TextUtils.isEmpty(view)) {
                accessibilityEvent.getText().add(view);
            }
        }

        /* renamed from: a */
        public void mo87a(View view, C0532b c0532b) {
            super.mo87a(view, c0532b);
            c0532b.m1965b(TextInputLayout.class.getSimpleName());
            CharSequence j = this.f12932a.f12951d.m742j();
            if (!TextUtils.isEmpty(j)) {
                c0532b.m1971c(j);
            }
            if (this.f12932a.f12948a != null) {
                c0532b.m1974d(this.f12932a.f12948a);
            }
            j = this.f12932a.f12949b != null ? this.f12932a.f12949b.getText() : null;
            if (!TextUtils.isEmpty(j)) {
                c0532b.m1993l(true);
                c0532b.m1978e(j);
            }
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f12957j = new Rect();
        this.f12951d = new C0202e(this);
        C0219m.m807a(context);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.f12952e = new FrameLayout(context);
        this.f12952e.setAddStatesFromChildren(true);
        addView(this.f12952e);
        this.f12951d.m722a(C0189a.f700b);
        this.f12951d.m731b(new AccelerateInterpolator());
        this.f12951d.m727b(8388659);
        context = ay.m3543a(context, attributeSet, C0142k.TextInputLayout, i, C0141j.Widget_Design_TextInputLayout);
        this.f12954g = context.m3549a(C0142k.TextInputLayout_hintEnabled, true);
        setHint(context.m3553c(C0142k.TextInputLayout_android_hint));
        this.f12943K = context.m3549a(C0142k.TextInputLayout_hintAnimationEnabled, true);
        if (context.m3561g(C0142k.TextInputLayout_android_textColorHint) != null) {
            attributeSet = context.m3557e(C0142k.TextInputLayout_android_textColorHint);
            this.f12941I = attributeSet;
            this.f12940H = attributeSet;
        }
        if (context.m3560g(C0142k.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(context.m3560g(C0142k.TextInputLayout_hintTextAppearance, 0));
        }
        this.f12962o = context.m3560g(C0142k.TextInputLayout_errorTextAppearance, 0);
        attributeSet = context.m3549a(C0142k.TextInputLayout_errorEnabled, false);
        boolean a = context.m3549a(C0142k.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(context.m3545a(C0142k.TextInputLayout_counterMaxLength, -1));
        this.f12967t = context.m3560g(C0142k.TextInputLayout_counterTextAppearance, 0);
        this.f12968u = context.m3560g(C0142k.TextInputLayout_counterOverflowTextAppearance, 0);
        this.f12970w = context.m3549a(C0142k.TextInputLayout_passwordToggleEnabled, false);
        this.f12971x = context.m3547a(C0142k.TextInputLayout_passwordToggleDrawable);
        this.f12972y = context.m3553c(C0142k.TextInputLayout_passwordToggleContentDescription);
        if (context.m3561g(C0142k.TextInputLayout_passwordToggleTint)) {
            this.f12937E = true;
            this.f12936D = context.m3557e(C0142k.TextInputLayout_passwordToggleTint);
        }
        if (context.m3561g(C0142k.TextInputLayout_passwordToggleTintMode)) {
            this.f12939G = true;
            this.f12938F = C0221o.m814a(context.m3545a(C0142k.TextInputLayout_passwordToggleTintMode, -1), null);
        }
        context.m3548a();
        setErrorEnabled(attributeSet);
        setCounterEnabled(a);
        m15047h();
        if (C0560r.m2191d(this) == null) {
            C0560r.m2167a((View) this, 1);
        }
        C0560r.m2175a((View) this, new C3059a(this));
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (view instanceof EditText) {
            i = new FrameLayout.LayoutParams(layoutParams);
            i.gravity = (i.gravity & -113) | 16;
            this.f12952e.addView(view, i);
            this.f12952e.setLayoutParams(layoutParams);
            m15030a();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void setTypeface(Typeface typeface) {
        if ((this.f12960m != null && !this.f12960m.equals(typeface)) || (this.f12960m == null && typeface != null)) {
            this.f12960m = typeface;
            this.f12951d.m734c(typeface);
            if (this.f12965r != null) {
                this.f12965r.setTypeface(typeface);
            }
            if (this.f12949b != null) {
                this.f12949b.setTypeface(typeface);
            }
        }
    }

    public Typeface getTypeface() {
        return this.f12960m;
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.f12953f != null) {
            if (this.f12948a != null) {
                CharSequence hint = this.f12948a.getHint();
                this.f12948a.setHint(this.f12953f);
                try {
                    super.dispatchProvideAutofillStructure(viewStructure, i);
                    return;
                } finally {
                    this.f12948a.setHint(hint);
                }
            }
        }
        super.dispatchProvideAutofillStructure(viewStructure, i);
    }

    private void setEditText(EditText editText) {
        if (this.f12948a == null) {
            if (!(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f12948a = editText;
            if (m15045f() == null) {
                this.f12951d.m734c(this.f12948a.getTypeface());
            }
            this.f12951d.m716a(this.f12948a.getTextSize());
            int gravity = this.f12948a.getGravity();
            this.f12951d.m727b((gravity & -113) | 48);
            this.f12951d.m717a(gravity);
            this.f12948a.addTextChangedListener(new C01831(this));
            if (this.f12940H == null) {
                this.f12940H = this.f12948a.getHintTextColors();
            }
            if (!(this.f12954g == null || TextUtils.isEmpty(this.f12955h) == null)) {
                this.f12953f = this.f12948a.getHint();
                setHint(this.f12953f);
                this.f12948a.setHint(null);
            }
            if (this.f12965r != null) {
                m15049a(this.f12948a.getText().length());
            }
            if (this.f12958k != null) {
                m15038b();
            }
            m15044e();
            m15051a((boolean) null, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    /* renamed from: a */
    private void m15030a() {
        int i;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f12952e.getLayoutParams();
        if (this.f12954g) {
            if (this.f12956i == null) {
                this.f12956i = new Paint();
            }
            this.f12956i.setTypeface(this.f12951d.m735d());
            this.f12956i.setTextSize(this.f12951d.m740h());
            i = (int) (-this.f12956i.ascent());
        } else {
            i = 0;
        }
        if (i != layoutParams.topMargin) {
            layoutParams.topMargin = i;
            this.f12952e.requestLayout();
        }
    }

    /* renamed from: a */
    void m15050a(boolean z) {
        m15051a(z, false);
    }

    /* renamed from: a */
    void m15051a(boolean z, boolean z2) {
        boolean isEnabled = isEnabled();
        Object obj = (this.f12948a == null || TextUtils.isEmpty(this.f12948a.getText())) ? null : 1;
        boolean a = m15037a(getDrawableState(), 16842908);
        int isEmpty = 1 ^ TextUtils.isEmpty(getError());
        if (this.f12940H != null) {
            this.f12951d.m729b(this.f12940H);
        }
        if (isEnabled && this.f12969v && this.f12965r != null) {
            this.f12951d.m719a(this.f12965r.getTextColors());
        } else if (isEnabled && a && this.f12941I != null) {
            this.f12951d.m719a(this.f12941I);
        } else if (this.f12940H != null) {
            this.f12951d.m719a(this.f12940H);
        }
        if (obj == null) {
            if (isEnabled()) {
                if (!a) {
                    if (isEmpty != 0) {
                    }
                }
            }
            if (z2 || !this.f12942J) {
                m15043d(z);
                return;
            }
            return;
        }
        if (z2 || this.f12942J) {
            m15041c(z);
        }
    }

    public EditText getEditText() {
        return this.f12948a;
    }

    public void setHint(CharSequence charSequence) {
        if (this.f12954g) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        this.f12955h = charSequence;
        this.f12951d.m723a(charSequence);
    }

    public CharSequence getHint() {
        return this.f12954g ? this.f12955h : null;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f12954g) {
            this.f12954g = z;
            z = this.f12948a.getHint();
            if (!this.f12954g) {
                if (!TextUtils.isEmpty(this.f12955h) && TextUtils.isEmpty(z)) {
                    this.f12948a.setHint(this.f12955h);
                }
                setHintInternal(null);
            } else if (!TextUtils.isEmpty(z)) {
                if (TextUtils.isEmpty(this.f12955h)) {
                    setHint(z);
                }
                this.f12948a.setHint(null);
            }
            if (this.f12948a) {
                m15030a();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f12951d.m733c(i);
        this.f12941I = this.f12951d.m743k();
        if (this.f12948a != 0) {
            m15050a((boolean) 0);
            m15030a();
        }
    }

    /* renamed from: a */
    private void m15034a(TextView textView, int i) {
        if (this.f12958k == null) {
            this.f12958k = new LinearLayout(getContext());
            this.f12958k.setOrientation(0);
            addView(this.f12958k, -1, -2);
            this.f12958k.addView(new Space(getContext()), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f12948a != null) {
                m15038b();
            }
        }
        this.f12958k.setVisibility(0);
        this.f12958k.addView(textView, i);
        this.f12959l++;
    }

    /* renamed from: b */
    private void m15038b() {
        C0560r.m2186b(this.f12958k, C0560r.m2195g(this.f12948a), 0, C0560r.m2196h(this.f12948a), this.f12948a.getPaddingBottom());
    }

    /* renamed from: a */
    private void m15033a(TextView textView) {
        if (this.f12958k != null) {
            this.f12958k.removeView(textView);
            textView = this.f12959l - 1;
            this.f12959l = textView;
            if (textView == null) {
                this.f12958k.setVisibility(8);
            }
        }
    }

    public void setErrorEnabled(boolean r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = r5.f12961n;
        if (r0 == r6) goto L_0x008a;
    L_0x0004:
        r0 = r5.f12949b;
        if (r0 == 0) goto L_0x0011;
    L_0x0008:
        r0 = r5.f12949b;
        r0 = r0.animate();
        r0.cancel();
    L_0x0011:
        r0 = 0;
        if (r6 == 0) goto L_0x007b;
    L_0x0014:
        r1 = new android.support.v7.widget.AppCompatTextView;
        r2 = r5.getContext();
        r1.<init>(r2);
        r5.f12949b = r1;
        r1 = r5.f12949b;
        r2 = android.support.design.C0143a.C0137f.textinput_error;
        r1.setId(r2);
        r1 = r5.f12960m;
        if (r1 == 0) goto L_0x0031;
    L_0x002a:
        r1 = r5.f12949b;
        r2 = r5.f12960m;
        r1.setTypeface(r2);
    L_0x0031:
        r1 = 1;
        r2 = r5.f12949b;	 Catch:{ Exception -> 0x0051 }
        r3 = r5.f12962o;	 Catch:{ Exception -> 0x0051 }
        android.support.v4.widget.C0619o.m2474a(r2, r3);	 Catch:{ Exception -> 0x0051 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0051 }
        r3 = 23;	 Catch:{ Exception -> 0x0051 }
        if (r2 < r3) goto L_0x004f;	 Catch:{ Exception -> 0x0051 }
    L_0x003f:
        r2 = r5.f12949b;	 Catch:{ Exception -> 0x0051 }
        r2 = r2.getTextColors();	 Catch:{ Exception -> 0x0051 }
        r2 = r2.getDefaultColor();	 Catch:{ Exception -> 0x0051 }
        r3 = -65281; // 0xffffffffffff00ff float:NaN double:NaN;
        if (r2 != r3) goto L_0x004f;
    L_0x004e:
        goto L_0x0051;
    L_0x004f:
        r2 = 0;
        goto L_0x0052;
    L_0x0051:
        r2 = 1;
    L_0x0052:
        if (r2 == 0) goto L_0x006a;
    L_0x0054:
        r2 = r5.f12949b;
        r3 = android.support.v7.p020a.C0637a.C0635i.TextAppearance_AppCompat_Caption;
        android.support.v4.widget.C0619o.m2474a(r2, r3);
        r2 = r5.f12949b;
        r3 = r5.getContext();
        r4 = android.support.v7.p020a.C0637a.C0629c.error_color_material;
        r3 = android.support.v4.content.C0389b.m1438c(r3, r4);
        r2.setTextColor(r3);
    L_0x006a:
        r2 = r5.f12949b;
        r3 = 4;
        r2.setVisibility(r3);
        r2 = r5.f12949b;
        android.support.v4.view.C0560r.m2185b(r2, r1);
        r1 = r5.f12949b;
        r5.m15034a(r1, r0);
        goto L_0x0088;
    L_0x007b:
        r5.f12963p = r0;
        r5.m15040c();
        r0 = r5.f12949b;
        r5.m15033a(r0);
        r0 = 0;
        r5.f12949b = r0;
    L_0x0088:
        r5.f12961n = r6;
    L_0x008a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TextInputLayout.setErrorEnabled(boolean):void");
    }

    public void setErrorTextAppearance(int i) {
        this.f12962o = i;
        if (this.f12949b != null) {
            C0619o.m2474a(this.f12949b, i);
        }
    }

    public void setError(CharSequence charSequence) {
        boolean z = C0560r.m2212x(this) && isEnabled() && (this.f12949b == null || !TextUtils.equals(this.f12949b.getText(), charSequence));
        m15035a(charSequence, z);
    }

    /* renamed from: a */
    private void m15035a(final CharSequence charSequence, boolean z) {
        this.f12964q = charSequence;
        if (!this.f12961n) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        this.f12963p = TextUtils.isEmpty(charSequence) ^ true;
        this.f12949b.animate().cancel();
        if (this.f12963p) {
            this.f12949b.setText(charSequence);
            this.f12949b.setVisibility(0);
            if (z) {
                if (this.f12949b.getAlpha() == 1.0f) {
                    this.f12949b.setAlpha(0.0f);
                }
                this.f12949b.animate().alpha(1.0f).setDuration(200).setInterpolator(C0189a.f702d).setListener(new C01842(this)).start();
            } else {
                this.f12949b.setAlpha(1.0f);
            }
        } else if (this.f12949b.getVisibility() == 0) {
            if (z) {
                this.f12949b.animate().alpha(0.0f).setDuration(200).setInterpolator(C0189a.f701c).setListener(new AnimatorListenerAdapter(this) {
                    /* renamed from: b */
                    final /* synthetic */ TextInputLayout f695b;

                    public void onAnimationEnd(Animator animator) {
                        this.f695b.f12949b.setText(charSequence);
                        this.f695b.f12949b.setVisibility(4);
                    }
                }).start();
            } else {
                this.f12949b.setText(charSequence);
                this.f12949b.setVisibility(4);
            }
        }
        m15040c();
        m15050a(z);
    }

    public void setCounterEnabled(boolean r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = r3.f12950c;
        if (r0 == r4) goto L_0x006e;
    L_0x0004:
        if (r4 == 0) goto L_0x0064;
    L_0x0006:
        r0 = new android.support.v7.widget.AppCompatTextView;
        r1 = r3.getContext();
        r0.<init>(r1);
        r3.f12965r = r0;
        r0 = r3.f12965r;
        r1 = android.support.design.C0143a.C0137f.textinput_counter;
        r0.setId(r1);
        r0 = r3.f12960m;
        if (r0 == 0) goto L_0x0023;
    L_0x001c:
        r0 = r3.f12965r;
        r1 = r3.f12960m;
        r0.setTypeface(r1);
    L_0x0023:
        r0 = r3.f12965r;
        r1 = 1;
        r0.setMaxLines(r1);
        r0 = r3.f12965r;	 Catch:{ Exception -> 0x0031 }
        r1 = r3.f12967t;	 Catch:{ Exception -> 0x0031 }
        android.support.v4.widget.C0619o.m2474a(r0, r1);	 Catch:{ Exception -> 0x0031 }
        goto L_0x0047;
    L_0x0031:
        r0 = r3.f12965r;
        r1 = android.support.v7.p020a.C0637a.C0635i.TextAppearance_AppCompat_Caption;
        android.support.v4.widget.C0619o.m2474a(r0, r1);
        r0 = r3.f12965r;
        r1 = r3.getContext();
        r2 = android.support.v7.p020a.C0637a.C0629c.error_color_material;
        r1 = android.support.v4.content.C0389b.m1438c(r1, r2);
        r0.setTextColor(r1);
    L_0x0047:
        r0 = r3.f12965r;
        r1 = -1;
        r3.m15034a(r0, r1);
        r0 = r3.f12948a;
        if (r0 != 0) goto L_0x0056;
    L_0x0051:
        r0 = 0;
        r3.m15049a(r0);
        goto L_0x006c;
    L_0x0056:
        r0 = r3.f12948a;
        r0 = r0.getText();
        r0 = r0.length();
        r3.m15049a(r0);
        goto L_0x006c;
    L_0x0064:
        r0 = r3.f12965r;
        r3.m15033a(r0);
        r0 = 0;
        r3.f12965r = r0;
    L_0x006c:
        r3.f12950c = r4;
    L_0x006e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TextInputLayout.setCounterEnabled(boolean):void");
    }

    public void setCounterMaxLength(int i) {
        if (this.f12966s != i) {
            if (i > 0) {
                this.f12966s = i;
            } else {
                this.f12966s = -1;
            }
            if (this.f12950c != 0) {
                m15049a(this.f12948a == 0 ? 0 : this.f12948a.getText().length());
            }
        }
    }

    public void setEnabled(boolean z) {
        m15032a((ViewGroup) this, z);
        super.setEnabled(z);
    }

    /* renamed from: a */
    private static void m15032a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m15032a((ViewGroup) childAt, z);
            }
        }
    }

    public int getCounterMaxLength() {
        return this.f12966s;
    }

    /* renamed from: a */
    void m15049a(int i) {
        boolean z = this.f12969v;
        if (this.f12966s == -1) {
            this.f12965r.setText(String.valueOf(i));
            this.f12969v = false;
        } else {
            this.f12969v = i > this.f12966s;
            if (z != this.f12969v) {
                C0619o.m2474a(this.f12965r, this.f12969v ? this.f12968u : this.f12967t);
            }
            this.f12965r.setText(getContext().getString(C0140i.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f12966s)}));
        }
        if (this.f12948a != 0 && z != this.f12969v) {
            m15050a(false);
            m15040c();
        }
    }

    /* renamed from: c */
    private void m15040c() {
        if (this.f12948a != null) {
            Drawable background = this.f12948a.getBackground();
            if (background != null) {
                m15042d();
                if (C0885y.m3864c(background)) {
                    background = background.mutate();
                }
                if (this.f12963p && this.f12949b != null) {
                    background.setColorFilter(C0862h.m3667a(this.f12949b.getCurrentTextColor(), Mode.SRC_IN));
                } else if (!this.f12969v || this.f12965r == null) {
                    C0295a.m1060f(background);
                    this.f12948a.refreshDrawableState();
                } else {
                    background.setColorFilter(C0862h.m3667a(this.f12965r.getCurrentTextColor(), Mode.SRC_IN));
                }
            }
        }
    }

    /* renamed from: d */
    private void m15042d() {
        int i = VERSION.SDK_INT;
        if (i == 21 || i == 22) {
            Drawable background = this.f12948a.getBackground();
            if (!(background == null || this.f12945M)) {
                Drawable newDrawable = background.getConstantState().newDrawable();
                if (background instanceof DrawableContainer) {
                    this.f12945M = C0203f.m744a((DrawableContainer) background, newDrawable.getConstantState());
                }
                if (!this.f12945M) {
                    C0560r.m2174a(this.f12948a, newDrawable);
                    this.f12945M = true;
                }
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        if (this.f12963p) {
            savedState.f12930a = getError();
        }
        savedState.f12931b = this.f12933A;
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.m1885a());
            setError(savedState.f12930a);
            if (savedState.f12931b != null) {
                m15039b(true);
            }
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f12947O = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f12947O = null;
    }

    public CharSequence getError() {
        return this.f12961n ? this.f12964q : null;
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f12943K = z;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f12954g) {
            this.f12951d.m720a(canvas);
        }
    }

    protected void onMeasure(int i, int i2) {
        m15044e();
        super.onMeasure(i, i2);
    }

    /* renamed from: e */
    private void m15044e() {
        if (this.f12948a != null) {
            Drawable[] b;
            if (m15046g()) {
                if (this.f12973z == null) {
                    this.f12973z = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C0139h.design_text_input_password_icon, this.f12952e, false);
                    this.f12973z.setImageDrawable(this.f12971x);
                    this.f12973z.setContentDescription(this.f12972y);
                    this.f12952e.addView(this.f12973z);
                    this.f12973z.setOnClickListener(new C01864(this));
                }
                if (this.f12948a != null && C0560r.m2198j(this.f12948a) <= 0) {
                    this.f12948a.setMinimumHeight(C0560r.m2198j(this.f12973z));
                }
                this.f12973z.setVisibility(0);
                this.f12973z.setChecked(this.f12933A);
                if (this.f12934B == null) {
                    this.f12934B = new ColorDrawable();
                }
                this.f12934B.setBounds(0, 0, this.f12973z.getMeasuredWidth(), 1);
                b = C0619o.m2476b(this.f12948a);
                if (b[2] != this.f12934B) {
                    this.f12935C = b[2];
                }
                C0619o.m2475a(this.f12948a, b[0], b[1], this.f12934B, b[3]);
                this.f12973z.setPadding(this.f12948a.getPaddingLeft(), this.f12948a.getPaddingTop(), this.f12948a.getPaddingRight(), this.f12948a.getPaddingBottom());
            } else {
                if (this.f12973z != null && this.f12973z.getVisibility() == 0) {
                    this.f12973z.setVisibility(8);
                }
                if (this.f12934B != null) {
                    b = C0619o.m2476b(this.f12948a);
                    if (b[2] == this.f12934B) {
                        C0619o.m2475a(this.f12948a, b[0], b[1], this.f12935C, b[3]);
                        this.f12934B = null;
                    }
                }
            }
        }
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C0680b.m2703b(getContext(), i) : 0);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f12971x = drawable;
        if (this.f12973z != null) {
            this.f12973z.setImageDrawable(drawable);
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : 0);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f12972y = charSequence;
        if (this.f12973z != null) {
            this.f12973z.setContentDescription(charSequence);
        }
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f12971x;
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f12972y;
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (this.f12970w != z) {
            this.f12970w = z;
            if (!z && this.f12933A && this.f12948a) {
                this.f12948a.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f12933A = false;
            m15044e();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f12936D = colorStateList;
        this.f12937E = true;
        m15047h();
    }

    public void setPasswordVisibilityToggleTintMode(Mode mode) {
        this.f12938F = mode;
        this.f12939G = true;
        m15047h();
    }

    /* renamed from: b */
    private void m15039b(boolean z) {
        if (this.f12970w) {
            int selectionEnd = this.f12948a.getSelectionEnd();
            if (m15045f()) {
                this.f12948a.setTransformationMethod(null);
                this.f12933A = true;
            } else {
                this.f12948a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f12933A = false;
            }
            this.f12973z.setChecked(this.f12933A);
            if (z) {
                this.f12973z.jumpDrawablesToCurrentState();
            }
            this.f12948a.setSelection(selectionEnd);
        }
    }

    /* renamed from: f */
    private boolean m15045f() {
        return this.f12948a != null && (this.f12948a.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: g */
    private boolean m15046g() {
        return this.f12970w && (m15045f() || this.f12933A);
    }

    /* renamed from: h */
    private void m15047h() {
        if (this.f12971x == null) {
            return;
        }
        if (this.f12937E || this.f12939G) {
            this.f12971x = C0295a.m1061g(this.f12971x).mutate();
            if (this.f12937E) {
                C0295a.m1050a(this.f12971x, this.f12936D);
            }
            if (this.f12939G) {
                C0295a.m1053a(this.f12971x, this.f12938F);
            }
            if (this.f12973z != null && this.f12973z.getDrawable() != this.f12971x) {
                this.f12973z.setImageDrawable(this.f12971x);
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f12954g && this.f12948a) {
            z = this.f12957j;
            C0626s.m2535b(this, this.f12948a, z);
            i = z.left + this.f12948a.getCompoundPaddingLeft();
            i3 = z.right - this.f12948a.getCompoundPaddingRight();
            this.f12951d.m718a(i, z.top + this.f12948a.getCompoundPaddingTop(), i3, z.bottom - this.f12948a.getCompoundPaddingBottom());
            this.f12951d.m728b(i, getPaddingTop(), i3, (i4 - i2) - getPaddingBottom());
            this.f12951d.m741i();
        }
    }

    /* renamed from: c */
    private void m15041c(boolean z) {
        if (this.f12944L != null && this.f12944L.isRunning()) {
            this.f12944L.cancel();
        }
        if (z && this.f12943K) {
            m15048a(1.0f);
        } else {
            this.f12951d.m726b(1.0f);
        }
        this.f12942J = false;
    }

    protected void drawableStateChanged() {
        if (!this.f12946N) {
            boolean z = true;
            this.f12946N = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!C0560r.m2212x(this) || !isEnabled()) {
                z = false;
            }
            m15050a(z);
            m15040c();
            if ((this.f12951d != null ? this.f12951d.m724a(drawableState) | 0 : 0) != 0) {
                invalidate();
            }
            this.f12946N = false;
        }
    }

    /* renamed from: d */
    private void m15043d(boolean z) {
        if (this.f12944L != null && this.f12944L.isRunning()) {
            this.f12944L.cancel();
        }
        if (z && this.f12943K) {
            m15048a(0.0f);
        } else {
            this.f12951d.m726b(0.0f);
        }
        this.f12942J = true;
    }

    /* renamed from: a */
    void m15048a(float f) {
        if (this.f12951d.m739g() != f) {
            if (this.f12944L == null) {
                this.f12944L = new ValueAnimator();
                this.f12944L.setInterpolator(C0189a.f699a);
                this.f12944L.setDuration(200);
                this.f12944L.addUpdateListener(new C01875(this));
            }
            this.f12944L.setFloatValues(new float[]{this.f12951d.m739g(), f});
            this.f12944L.start();
        }
    }

    /* renamed from: a */
    private static boolean m15037a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return 1;
            }
        }
        return false;
    }
}
