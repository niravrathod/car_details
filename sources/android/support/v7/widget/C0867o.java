package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.v7.p020a.C0637a.C0636j;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v7.widget.o */
class C0867o {
    /* renamed from: a */
    private static final RectF f2959a = new RectF();
    /* renamed from: b */
    private static ConcurrentHashMap<String, Method> f2960b = new ConcurrentHashMap();
    /* renamed from: c */
    private int f2961c = 0;
    /* renamed from: d */
    private boolean f2962d = false;
    /* renamed from: e */
    private float f2963e = -1.0f;
    /* renamed from: f */
    private float f2964f = -1.0f;
    /* renamed from: g */
    private float f2965g = -1.0f;
    /* renamed from: h */
    private int[] f2966h = new int[0];
    /* renamed from: i */
    private boolean f2967i = false;
    /* renamed from: j */
    private TextPaint f2968j;
    /* renamed from: k */
    private final TextView f2969k;
    /* renamed from: l */
    private final Context f2970l;

    C0867o(TextView textView) {
        this.f2969k = textView;
        this.f2970l = this.f2969k.getContext();
    }

    /* renamed from: a */
    void m3752a(AttributeSet attributeSet, int i) {
        attributeSet = this.f2970l.obtainStyledAttributes(attributeSet, C0636j.AppCompatTextView, i, 0);
        if (attributeSet.hasValue(C0636j.AppCompatTextView_autoSizeTextType) != 0) {
            this.f2961c = attributeSet.getInt(C0636j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = attributeSet.hasValue(C0636j.AppCompatTextView_autoSizeStepGranularity) != 0 ? attributeSet.getDimension(C0636j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1082130432;
        float dimension2 = attributeSet.hasValue(C0636j.AppCompatTextView_autoSizeMinTextSize) ? attributeSet.getDimension(C0636j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = attributeSet.hasValue(C0636j.AppCompatTextView_autoSizeMaxTextSize) ? attributeSet.getDimension(C0636j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (attributeSet.hasValue(C0636j.AppCompatTextView_autoSizePresetSizes)) {
            int resourceId = attributeSet.getResourceId(C0636j.AppCompatTextView_autoSizePresetSizes, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = attributeSet.getResources().obtainTypedArray(resourceId);
                m3741a(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        attributeSet.recycle();
        if (m3747k() == null) {
            this.f2961c = 0;
        } else if (this.f2961c == 1) {
            if (this.f2967i == null) {
                attributeSet = this.f2970l.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, attributeSet);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, attributeSet);
                }
                if (dimension == -1082130432) {
                    dimension = 1065353216;
                }
                m3740a(dimension2, dimension3, dimension);
            }
            m3745i();
        }
    }

    /* renamed from: a */
    void m3749a(int i) {
        if (m3747k()) {
            switch (i) {
                case 0:
                    m3746j();
                    return;
                case 1:
                    i = this.f2970l.getResources().getDisplayMetrics();
                    m3740a(TypedValue.applyDimension(2, 12.0f, i), TypedValue.applyDimension(2, 112.0f, i), 1.0f);
                    if (m3745i() != 0) {
                        m3758f();
                        return;
                    }
                    return;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown auto-size text type: ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    void m3751a(int i, int i2, int i3, int i4) {
        if (m3747k()) {
            DisplayMetrics displayMetrics = this.f2970l.getResources().getDisplayMetrics();
            m3740a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m3745i() != 0) {
                m3758f();
            }
        }
    }

    /* renamed from: a */
    void m3753a(int[] iArr, int i) {
        if (m3747k()) {
            int length = iArr.length;
            int i2 = 0;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f2970l.getResources().getDisplayMetrics();
                    while (i2 < length) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                        i2++;
                    }
                }
                this.f2966h = m3743a(iArr2);
                if (m3744h() == 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("None of the preset sizes is valid: ");
                    stringBuilder.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            } else {
                this.f2967i = false;
            }
            if (m3745i() != null) {
                m3758f();
            }
        }
    }

    /* renamed from: a */
    int m3748a() {
        return this.f2961c;
    }

    /* renamed from: b */
    int m3754b() {
        return Math.round(this.f2963e);
    }

    /* renamed from: c */
    int m3755c() {
        return Math.round(this.f2964f);
    }

    /* renamed from: d */
    int m3756d() {
        return Math.round(this.f2965g);
    }

    /* renamed from: e */
    int[] m3757e() {
        return this.f2966h;
    }

    /* renamed from: a */
    private void m3741a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f2966h = m3743a(iArr);
            m3744h();
        }
    }

    /* renamed from: h */
    private boolean m3744h() {
        int length = this.f2966h.length;
        this.f2967i = length > 0;
        if (this.f2967i) {
            this.f2961c = 1;
            this.f2964f = (float) this.f2966h[0];
            this.f2965g = (float) this.f2966h[length - 1];
            this.f2963e = -1.0f;
        }
        return this.f2967i;
    }

    /* renamed from: a */
    private int[] m3743a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        List arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        iArr = arrayList.size();
        int[] iArr2 = new int[iArr];
        for (int i2 = 0; i2 < iArr; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: a */
    private void m3740a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            f3 = new StringBuilder();
            f3.append("Minimum auto-size text size (");
            f3.append(f);
            f3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(f3.toString());
        } else if (f2 <= f) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Maximum auto-size text size (");
            stringBuilder.append(f2);
            stringBuilder.append("px) is less or equal to minimum auto-size ");
            stringBuilder.append("text size (");
            stringBuilder.append(f);
            stringBuilder.append("px)");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (f3 > 0.0f) {
            this.f2961c = 1;
            this.f2964f = f;
            this.f2965g = f2;
            this.f2963e = f3;
            this.f2967i = false;
        } else {
            f2 = new StringBuilder();
            f2.append("The auto-size step granularity (");
            f2.append(f3);
            f2.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(f2.toString());
        }
    }

    /* renamed from: i */
    private boolean m3745i() {
        int i = 0;
        if (m3747k() && this.f2961c == 1) {
            if (!this.f2967i || this.f2966h.length == 0) {
                float round = (float) Math.round(this.f2964f);
                int i2 = 1;
                while (Math.round(this.f2963e + round) <= Math.round(this.f2965g)) {
                    i2++;
                    round += this.f2963e;
                }
                int[] iArr = new int[i2];
                float f = this.f2964f;
                while (i < i2) {
                    iArr[i] = Math.round(f);
                    f += this.f2963e;
                    i++;
                }
                this.f2966h = m3743a(iArr);
            }
            this.f2962d = true;
        } else {
            this.f2962d = false;
        }
        return this.f2962d;
    }

    /* renamed from: f */
    void m3758f() {
        if (m3759g()) {
            if (this.f2962d) {
                if (this.f2969k.getMeasuredHeight() > 0) {
                    if (this.f2969k.getMeasuredWidth() > 0) {
                        int i;
                        if (((Boolean) m3737a(this.f2969k, "getHorizontallyScrolling", Boolean.valueOf(false))).booleanValue()) {
                            i = 1048576;
                        } else {
                            i = (this.f2969k.getMeasuredWidth() - this.f2969k.getTotalPaddingLeft()) - this.f2969k.getTotalPaddingRight();
                        }
                        int height = (this.f2969k.getHeight() - this.f2969k.getCompoundPaddingBottom()) - this.f2969k.getCompoundPaddingTop();
                        if (i > 0) {
                            if (height > 0) {
                                synchronized (f2959a) {
                                    f2959a.setEmpty();
                                    f2959a.right = (float) i;
                                    f2959a.bottom = (float) height;
                                    float a = (float) m3734a(f2959a);
                                    if (a != this.f2969k.getTextSize()) {
                                        m3750a(0, a);
                                    }
                                }
                            }
                        }
                        return;
                    }
                }
                return;
            }
            this.f2962d = true;
        }
    }

    /* renamed from: j */
    private void m3746j() {
        this.f2961c = 0;
        this.f2964f = -1.0f;
        this.f2965g = -1.0f;
        this.f2963e = -1.0f;
        this.f2966h = new int[0];
        this.f2962d = false;
    }

    /* renamed from: a */
    void m3750a(int i, float f) {
        Resources system;
        if (this.f2970l == null) {
            system = Resources.getSystem();
        } else {
            system = this.f2970l.getResources();
        }
        m3739a(TypedValue.applyDimension(i, f, system.getDisplayMetrics()));
    }

    /* renamed from: a */
    private void m3739a(float f) {
        if (f != this.f2969k.getPaint().getTextSize()) {
            this.f2969k.getPaint().setTextSize(f);
            f = VERSION.SDK_INT >= 18 ? this.f2969k.isInLayout() : 0.0f;
            if (this.f2969k.getLayout() != null) {
                this.f2962d = false;
                try {
                    Method a = m3738a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f2969k, new Object[0]);
                    }
                } catch (Throwable e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (f == null) {
                    this.f2969k.requestLayout();
                } else {
                    this.f2969k.forceLayout();
                }
                this.f2969k.invalidate();
            }
        }
    }

    /* renamed from: a */
    private int m3734a(RectF rectF) {
        int length = this.f2966h.length;
        if (length != 0) {
            length--;
            int i = 1;
            int i2 = 0;
            while (i <= length) {
                i2 = (i + length) / 2;
                if (m3742a(this.f2966h[i2], rectF)) {
                    int i3 = i2 + 1;
                    i2 = i;
                    i = i3;
                } else {
                    i2--;
                    length = i2;
                }
            }
            return this.f2966h[i2];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private boolean m3742a(int r6, android.graphics.RectF r7) {
        /*
        r5 = this;
        r0 = r5.f2969k;
        r0 = r0.getText();
        r1 = r5.f2969k;
        r1 = r1.getTransformationMethod();
        if (r1 == 0) goto L_0x0017;
    L_0x000e:
        r2 = r5.f2969k;
        r1 = r1.getTransformation(r0, r2);
        if (r1 == 0) goto L_0x0017;
    L_0x0016:
        r0 = r1;
    L_0x0017:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 16;
        r3 = -1;
        if (r1 < r2) goto L_0x0025;
    L_0x001e:
        r1 = r5.f2969k;
        r1 = r1.getMaxLines();
        goto L_0x0026;
    L_0x0025:
        r1 = -1;
    L_0x0026:
        r2 = r5.f2968j;
        if (r2 != 0) goto L_0x0032;
    L_0x002a:
        r2 = new android.text.TextPaint;
        r2.<init>();
        r5.f2968j = r2;
        goto L_0x0037;
    L_0x0032:
        r2 = r5.f2968j;
        r2.reset();
    L_0x0037:
        r2 = r5.f2968j;
        r4 = r5.f2969k;
        r4 = r4.getPaint();
        r2.set(r4);
        r2 = r5.f2968j;
        r6 = (float) r6;
        r2.setTextSize(r6);
        r6 = r5.f2969k;
        r2 = "getLayoutAlignment";
        r4 = android.text.Layout.Alignment.ALIGN_NORMAL;
        r6 = r5.m3737a(r6, r2, r4);
        r6 = (android.text.Layout.Alignment) r6;
        r2 = android.os.Build.VERSION.SDK_INT;
        r4 = 23;
        if (r2 < r4) goto L_0x0065;
    L_0x005a:
        r2 = r7.right;
        r2 = java.lang.Math.round(r2);
        r6 = r5.m3736a(r0, r6, r2, r1);
        goto L_0x006f;
    L_0x0065:
        r2 = r7.right;
        r2 = java.lang.Math.round(r2);
        r6 = r5.m3735a(r0, r6, r2);
    L_0x006f:
        r2 = 0;
        r4 = 1;
        if (r1 == r3) goto L_0x0089;
    L_0x0073:
        r3 = r6.getLineCount();
        if (r3 > r1) goto L_0x0088;
    L_0x0079:
        r1 = r6.getLineCount();
        r1 = r1 - r4;
        r1 = r6.getLineEnd(r1);
        r0 = r0.length();
        if (r1 == r0) goto L_0x0089;
    L_0x0088:
        return r2;
    L_0x0089:
        r6 = r6.getHeight();
        r6 = (float) r6;
        r7 = r7.bottom;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 <= 0) goto L_0x0095;
    L_0x0094:
        return r2;
    L_0x0095:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.o.a(int, android.graphics.RectF):boolean");
    }

    /* renamed from: a */
    private StaticLayout m3736a(CharSequence charSequence, Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m3737a(this.f2969k, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        charSequence = Builder.obtain(charSequence, 0, charSequence.length(), this.f2968j, i).setAlignment(alignment).setLineSpacing(this.f2969k.getLineSpacingExtra(), this.f2969k.getLineSpacingMultiplier()).setIncludePad(this.f2969k.getIncludeFontPadding()).setBreakStrategy(this.f2969k.getBreakStrategy()).setHyphenationFrequency(this.f2969k.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return charSequence.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    /* renamed from: a */
    private StaticLayout m3735a(CharSequence charSequence, Alignment alignment, int i) {
        float lineSpacingMultiplier;
        float lineSpacingExtra;
        boolean includeFontPadding;
        if (VERSION.SDK_INT >= 16) {
            lineSpacingMultiplier = this.f2969k.getLineSpacingMultiplier();
            lineSpacingExtra = this.f2969k.getLineSpacingExtra();
            includeFontPadding = this.f2969k.getIncludeFontPadding();
        } else {
            lineSpacingMultiplier = ((Float) m3737a(this.f2969k, "getLineSpacingMultiplier", Float.valueOf(1.0f))).floatValue();
            lineSpacingExtra = ((Float) m3737a(this.f2969k, "getLineSpacingExtra", Float.valueOf(0.0f))).floatValue();
            includeFontPadding = ((Boolean) m3737a(this.f2969k, "getIncludeFontPadding", Boolean.valueOf(true))).booleanValue();
        }
        return new StaticLayout(charSequence, this.f2968j, i, alignment, lineSpacingMultiplier, lineSpacingExtra, includeFontPadding);
    }

    /* renamed from: a */
    private <T> T m3737a(Object obj, String str, T t) {
        try {
            return m3738a(str).invoke(obj, new Object[0]);
        } catch (Object obj2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to invoke TextView#");
            stringBuilder.append(str);
            stringBuilder.append("() method");
            Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), obj2);
            return t;
        }
    }

    /* renamed from: a */
    private Method m3738a(String str) {
        try {
            Method method = (Method) f2960b.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    f2960b.put(str, method);
                }
            }
            return method;
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to retrieve TextView#");
            stringBuilder.append(str);
            stringBuilder.append("() method");
            Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), e);
            return null;
        }
    }

    /* renamed from: g */
    boolean m3759g() {
        return m3747k() && this.f2961c != 0;
    }

    /* renamed from: k */
    private boolean m3747k() {
        return !(this.f2969k instanceof AppCompatEditText);
    }
}
