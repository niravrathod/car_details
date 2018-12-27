package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.p007c.p008a.C4399c;
import android.support.p007c.p008a.C4400i;
import android.support.v4.content.C0389b;
import android.support.v4.p009a.C0299a;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.p017f.C0420f;
import android.support.v4.p017f.C0421g;
import android.support.v4.p017f.C0434n;
import android.support.v4.p017f.C3131a;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p020a.C0637a.C0629c;
import android.support.v7.p020a.C0637a.C0631e;
import android.support.v7.p022c.p023a.C0680b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.widget.h */
public final class C0862h {
    /* renamed from: a */
    private static final Mode f2927a = Mode.SRC_IN;
    /* renamed from: b */
    private static C0862h f2928b;
    /* renamed from: c */
    private static final C3263b f2929c = new C3263b(6);
    /* renamed from: d */
    private static final int[] f2930d = new int[]{C0631e.abc_textfield_search_default_mtrl_alpha, C0631e.abc_textfield_default_mtrl_alpha, C0631e.abc_ab_share_pack_mtrl_alpha};
    /* renamed from: e */
    private static final int[] f2931e = new int[]{C0631e.abc_ic_commit_search_api_mtrl_alpha, C0631e.abc_seekbar_tick_mark_material, C0631e.abc_ic_menu_share_mtrl_alpha, C0631e.abc_ic_menu_copy_mtrl_am_alpha, C0631e.abc_ic_menu_cut_mtrl_alpha, C0631e.abc_ic_menu_selectall_mtrl_alpha, C0631e.abc_ic_menu_paste_mtrl_am_alpha};
    /* renamed from: f */
    private static final int[] f2932f = new int[]{C0631e.abc_textfield_activated_mtrl_alpha, C0631e.abc_textfield_search_activated_mtrl_alpha, C0631e.abc_cab_background_top_mtrl_alpha, C0631e.abc_text_cursor_material, C0631e.abc_text_select_handle_left_mtrl_dark, C0631e.abc_text_select_handle_middle_mtrl_dark, C0631e.abc_text_select_handle_right_mtrl_dark, C0631e.abc_text_select_handle_left_mtrl_light, C0631e.abc_text_select_handle_middle_mtrl_light, C0631e.abc_text_select_handle_right_mtrl_light};
    /* renamed from: g */
    private static final int[] f2933g = new int[]{C0631e.abc_popup_background_mtrl_mult, C0631e.abc_cab_background_internal_bg, C0631e.abc_menu_hardkey_panel_mtrl_mult};
    /* renamed from: h */
    private static final int[] f2934h = new int[]{C0631e.abc_tab_indicator_material, C0631e.abc_textfield_search_material};
    /* renamed from: i */
    private static final int[] f2935i = new int[]{C0631e.abc_btn_check_material, C0631e.abc_btn_radio_material};
    /* renamed from: j */
    private WeakHashMap<Context, C0434n<ColorStateList>> f2936j;
    /* renamed from: k */
    private C3131a<String, C0861c> f2937k;
    /* renamed from: l */
    private C0434n<String> f2938l;
    /* renamed from: m */
    private final Object f2939m = new Object();
    /* renamed from: n */
    private final WeakHashMap<Context, C0420f<WeakReference<ConstantState>>> f2940n = new WeakHashMap(0);
    /* renamed from: o */
    private TypedValue f2941o;
    /* renamed from: p */
    private boolean f2942p;

    /* renamed from: android.support.v7.widget.h$c */
    private interface C0861c {
        /* renamed from: a */
        Drawable mo824a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    /* renamed from: android.support.v7.widget.h$a */
    private static class C3262a implements C0861c {
        C3262a() {
        }

        /* renamed from: a */
        public Drawable mo824a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C4399c.m24028a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Context context2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", context2);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.h$b */
    private static class C3263b extends C0421g<Integer, PorterDuffColorFilter> {
        public C3263b(int i) {
            super(i);
        }

        /* renamed from: a */
        PorterDuffColorFilter m16838a(int i, Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(C3263b.m16837b(i, mode)));
        }

        /* renamed from: a */
        PorterDuffColorFilter m16839a(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(C3263b.m16837b(i, mode)), porterDuffColorFilter);
        }

        /* renamed from: b */
        private static int m16837b(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    /* renamed from: android.support.v7.widget.h$d */
    private static class C3264d implements C0861c {
        C3264d() {
        }

        /* renamed from: a */
        public Drawable mo824a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C4400i.m24034a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Context context2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", context2);
                return null;
            }
        }
    }

    /* renamed from: a */
    public static C0862h m3671a() {
        if (f2928b == null) {
            f2928b = new C0862h();
            C0862h.m3675a(f2928b);
        }
        return f2928b;
    }

    /* renamed from: a */
    private static void m3675a(C0862h c0862h) {
        if (VERSION.SDK_INT < 24) {
            c0862h.m3676a("vector", new C3264d());
            c0862h.m3676a("animated-vector", new C3262a());
        }
    }

    /* renamed from: a */
    public Drawable m3690a(Context context, int i) {
        return m3691a(context, i, false);
    }

    /* renamed from: a */
    Drawable m3691a(Context context, int i, boolean z) {
        m3689f(context);
        Drawable d = m3685d(context, i);
        if (d == null) {
            d = m3683c(context, i);
        }
        if (d == null) {
            d = C0389b.m1429a(context, i);
        }
        if (d != null) {
            d = m3669a(context, i, z, d);
        }
        if (d != null) {
            C0885y.m3863b(d);
        }
        return d;
    }

    /* renamed from: a */
    public void m3693a(Context context) {
        synchronized (this.f2939m) {
            C0420f c0420f = (C0420f) this.f2940n.get(context);
            if (c0420f != null) {
                c0420f.m1548c();
            }
        }
    }

    /* renamed from: a */
    private static long m3665a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: c */
    private Drawable m3683c(Context context, int i) {
        if (this.f2941o == null) {
            this.f2941o = new TypedValue();
        }
        TypedValue typedValue = this.f2941o;
        context.getResources().getValue(i, typedValue, true);
        long a = C0862h.m3665a(typedValue);
        Drawable a2 = m3670a(context, a);
        if (a2 != null) {
            return a2;
        }
        if (i == C0631e.abc_cab_background_top_material) {
            a2 = new LayerDrawable(new Drawable[]{m3690a(context, C0631e.abc_cab_background_internal_bg), m3690a(context, C0631e.abc_cab_background_top_mtrl_alpha)});
        }
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            m3678a(context, a, a2);
        }
        return a2;
    }

    /* renamed from: a */
    private Drawable m3669a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList b = m3694b(context, i);
        if (b != null) {
            if (C0885y.m3864c(drawable) != null) {
                drawable = drawable.mutate();
            }
            drawable = C0295a.m1061g(drawable);
            C0295a.m1050a(drawable, b);
            Mode a = C0862h.m3666a(i);
            if (a == null) {
                return drawable;
            }
            C0295a.m1053a(drawable, a);
            return drawable;
        } else if (i == C0631e.abc_seekbar_track_material) {
            r6 = (LayerDrawable) drawable;
            C0862h.m3673a(r6.findDrawableByLayerId(16908288), at.m3531a(context, C0627a.colorControlNormal), f2927a);
            C0862h.m3673a(r6.findDrawableByLayerId(16908303), at.m3531a(context, C0627a.colorControlNormal), f2927a);
            C0862h.m3673a(r6.findDrawableByLayerId(16908301), at.m3531a(context, C0627a.colorControlActivated), f2927a);
            return drawable;
        } else {
            if (!(i == C0631e.abc_ratingbar_material || i == C0631e.abc_ratingbar_indicator_material)) {
                if (i != C0631e.abc_ratingbar_small_material) {
                    if (C0862h.m3677a(context, i, drawable) == null && z) {
                        return null;
                    }
                    return drawable;
                }
            }
            r6 = (LayerDrawable) drawable;
            C0862h.m3673a(r6.findDrawableByLayerId(16908288), at.m3535c(context, C0627a.colorControlNormal), f2927a);
            C0862h.m3673a(r6.findDrawableByLayerId(16908303), at.m3531a(context, C0627a.colorControlActivated), f2927a);
            C0862h.m3673a(r6.findDrawableByLayerId(16908301), at.m3531a(context, C0627a.colorControlActivated), f2927a);
            return drawable;
        }
    }

    /* renamed from: d */
    private Drawable m3685d(Context context, int i) {
        if (this.f2937k == null || this.f2937k.isEmpty()) {
            return null;
        }
        if (this.f2938l != null) {
            String str = (String) this.f2938l.m1590a(i);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f2937k.get(str) == null)) {
                return null;
            }
        }
        this.f2938l = new C0434n();
        if (this.f2941o == null) {
            this.f2941o = new TypedValue();
        }
        TypedValue typedValue = this.f2941o;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long a = C0862h.m3665a(typedValue);
        Drawable a2 = m3670a(context, a);
        if (a2 != null) {
            return a2;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                int next;
                String name;
                C0861c c0861c;
                XmlPullParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        if (next != 2) {
                            name = xml.getName();
                            this.f2938l.m1597c(i, name);
                            c0861c = (C0861c) this.f2937k.get(name);
                            if (c0861c != null) {
                                a2 = c0861c.mo824a(context, xml, asAttributeSet, context.getTheme());
                            }
                            if (a2 != null) {
                                a2.setChangingConfigurations(typedValue.changingConfigurations);
                                m3678a(context, a, a2);
                            }
                        } else {
                            throw new XmlPullParserException("No start tag found");
                        }
                    }
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                name = xml.getName();
                this.f2938l.m1597c(i, name);
                c0861c = (C0861c) this.f2937k.get(name);
                if (c0861c != null) {
                    a2 = c0861c.mo824a(context, xml, asAttributeSet, context.getTheme());
                }
                if (a2 != null) {
                    a2.setChangingConfigurations(typedValue.changingConfigurations);
                    m3678a(context, a, a2);
                }
            } catch (Context context2) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", context2);
            }
        }
        if (a2 == null) {
            this.f2938l.m1597c(i, "appcompat_skip_skip");
        }
        return a2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private android.graphics.drawable.Drawable m3670a(android.content.Context r5, long r6) {
        /*
        r4 = this;
        r0 = r4.f2939m;
        monitor-enter(r0);
        r1 = r4.f2940n;	 Catch:{ all -> 0x002f }
        r1 = r1.get(r5);	 Catch:{ all -> 0x002f }
        r1 = (android.support.v4.p017f.C0420f) r1;	 Catch:{ all -> 0x002f }
        r2 = 0;
        if (r1 != 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        return r2;
    L_0x0010:
        r3 = r1.m1539a(r6);	 Catch:{ all -> 0x002f }
        r3 = (java.lang.ref.WeakReference) r3;	 Catch:{ all -> 0x002f }
        if (r3 == 0) goto L_0x002d;
    L_0x0018:
        r3 = r3.get();	 Catch:{ all -> 0x002f }
        r3 = (android.graphics.drawable.Drawable.ConstantState) r3;	 Catch:{ all -> 0x002f }
        if (r3 == 0) goto L_0x002a;
    L_0x0020:
        r5 = r5.getResources();	 Catch:{ all -> 0x002f }
        r5 = r3.newDrawable(r5);	 Catch:{ all -> 0x002f }
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        return r5;
    L_0x002a:
        r1.m1544b(r6);	 Catch:{ all -> 0x002f }
    L_0x002d:
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        return r2;
    L_0x002f:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.h.a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private boolean m3678a(Context context, long j, Drawable drawable) {
        drawable = drawable.getConstantState();
        if (drawable == null) {
            return null;
        }
        synchronized (this.f2939m) {
            C0420f c0420f = (C0420f) this.f2940n.get(context);
            if (c0420f == null) {
                c0420f = new C0420f();
                this.f2940n.put(context, c0420f);
            }
            c0420f.m1545b(j, new WeakReference(drawable));
        }
        return true;
    }

    /* renamed from: a */
    Drawable m3692a(Context context, bd bdVar, int i) {
        Drawable d = m3685d(context, i);
        if (d == null) {
            d = bdVar.m3577a(i);
        }
        return d != null ? m3669a(context, i, null, d) : null;
    }

    /* renamed from: a */
    static boolean m3677a(Context context, int i, Drawable drawable) {
        int round;
        Mode mode = f2927a;
        int i2 = 16842801;
        if (C0862h.m3680a(f2930d, i)) {
            i2 = C0627a.colorControlNormal;
        } else if (C0862h.m3680a(f2932f, i)) {
            i2 = C0627a.colorControlActivated;
        } else if (C0862h.m3680a(f2933g, i)) {
            mode = Mode.MULTIPLY;
        } else {
            if (i == C0631e.abc_list_divider_mtrl_alpha) {
                i2 = 16842800;
                round = Math.round(1109603123);
                i = 1;
            } else if (i != C0631e.abc_dialog_material_background) {
                i = 0;
                round = -1;
                i2 = 0;
            }
            if (i != 0) {
                return false;
            }
            if (C0885y.m3864c(drawable) != 0) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(C0862h.m3667a(at.m3531a(context, i2), mode));
            if (round != -1) {
                drawable.setAlpha(round);
            }
            return true;
        }
        i = 1;
        round = -1;
        if (i != 0) {
            return false;
        }
        if (C0885y.m3864c(drawable) != 0) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(C0862h.m3667a(at.m3531a(context, i2), mode));
        if (round != -1) {
            drawable.setAlpha(round);
        }
        return true;
    }

    /* renamed from: a */
    private void m3676a(String str, C0861c c0861c) {
        if (this.f2937k == null) {
            this.f2937k = new C3131a();
        }
        this.f2937k.put(str, c0861c);
    }

    /* renamed from: a */
    private static boolean m3680a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return 1;
            }
        }
        return false;
    }

    /* renamed from: a */
    static Mode m3666a(int i) {
        return i == C0631e.abc_switch_thumb_material ? Mode.MULTIPLY : 0;
    }

    /* renamed from: b */
    ColorStateList m3694b(Context context, int i) {
        ColorStateList e = m3687e(context, i);
        if (e == null) {
            if (i == C0631e.abc_edit_text_material) {
                e = C0680b.m2700a(context, C0629c.abc_tint_edittext);
            } else if (i == C0631e.abc_switch_track_mtrl_alpha) {
                e = C0680b.m2700a(context, C0629c.abc_tint_switch_track);
            } else if (i == C0631e.abc_switch_thumb_material) {
                e = m3686e(context);
            } else if (i == C0631e.abc_btn_default_mtrl_shape) {
                e = m3681b(context);
            } else if (i == C0631e.abc_btn_borderless_material) {
                e = m3682c(context);
            } else if (i == C0631e.abc_btn_colored_material) {
                e = m3684d(context);
            } else {
                if (i != C0631e.abc_spinner_mtrl_am_alpha) {
                    if (i != C0631e.abc_spinner_textfield_background_material) {
                        if (C0862h.m3680a(f2931e, i)) {
                            e = at.m3534b(context, C0627a.colorControlNormal);
                        } else if (C0862h.m3680a(f2934h, i)) {
                            e = C0680b.m2700a(context, C0629c.abc_tint_default);
                        } else if (C0862h.m3680a(f2935i, i)) {
                            e = C0680b.m2700a(context, C0629c.abc_tint_btn_checkable);
                        } else if (i == C0631e.abc_seekbar_thumb_material) {
                            e = C0680b.m2700a(context, C0629c.abc_tint_seek_thumb);
                        }
                    }
                }
                e = C0680b.m2700a(context, C0629c.abc_tint_spinner);
            }
            if (e != null) {
                m3672a(context, i, e);
            }
        }
        return e;
    }

    /* renamed from: e */
    private ColorStateList m3687e(Context context, int i) {
        ColorStateList colorStateList = null;
        if (this.f2936j == null) {
            return null;
        }
        C0434n c0434n = (C0434n) this.f2936j.get(context);
        if (c0434n != null) {
            colorStateList = (ColorStateList) c0434n.m1590a(i);
        }
        return colorStateList;
    }

    /* renamed from: a */
    private void m3672a(Context context, int i, ColorStateList colorStateList) {
        if (this.f2936j == null) {
            this.f2936j = new WeakHashMap();
        }
        C0434n c0434n = (C0434n) this.f2936j.get(context);
        if (c0434n == null) {
            c0434n = new C0434n();
            this.f2936j.put(context, c0434n);
        }
        c0434n.m1597c(i, colorStateList);
    }

    /* renamed from: b */
    private ColorStateList m3681b(Context context) {
        return m3688f(context, at.m3531a(context, C0627a.colorButtonNormal));
    }

    /* renamed from: c */
    private ColorStateList m3682c(Context context) {
        return m3688f(context, 0);
    }

    /* renamed from: d */
    private ColorStateList m3684d(Context context) {
        return m3688f(context, at.m3531a(context, C0627a.colorAccent));
    }

    /* renamed from: f */
    private ColorStateList m3688f(Context context, int i) {
        r1 = new int[4][];
        r0 = new int[4];
        int a = at.m3531a(context, C0627a.colorControlHighlight);
        context = at.m3535c(context, C0627a.colorButtonNormal);
        r1[0] = at.f2831a;
        r0[0] = context;
        r1[1] = at.f2834d;
        r0[1] = C0299a.m1067a(a, i);
        r1[2] = at.f2832b;
        r0[2] = C0299a.m1067a(a, i);
        r1[3] = at.f2838h;
        r0[3] = i;
        return new ColorStateList(r1, r0);
    }

    /* renamed from: e */
    private ColorStateList m3686e(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList b = at.m3534b(context, C0627a.colorSwitchThumbNormal);
        if (b == null || !b.isStateful()) {
            iArr[0] = at.f2831a;
            iArr2[0] = at.m3535c(context, C0627a.colorSwitchThumbNormal);
            iArr[1] = at.f2835e;
            iArr2[1] = at.m3531a(context, C0627a.colorControlActivated);
            iArr[2] = at.f2838h;
            iArr2[2] = at.m3531a(context, C0627a.colorSwitchThumbNormal);
        } else {
            iArr[0] = at.f2831a;
            iArr2[0] = b.getColorForState(iArr[0], 0);
            iArr[1] = at.f2835e;
            iArr2[1] = at.m3531a(context, C0627a.colorControlActivated);
            iArr[2] = at.f2838h;
            iArr2[2] = b.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: a */
    static void m3674a(Drawable drawable, aw awVar, int[] iArr) {
        if (!C0885y.m3864c(drawable) || drawable.mutate() == drawable) {
            if (!awVar.f2848d) {
                if (!awVar.f2847c) {
                    drawable.clearColorFilter();
                    if (VERSION.SDK_INT <= 23) {
                        drawable.invalidateSelf();
                    }
                    return;
                }
            }
            drawable.setColorFilter(C0862h.m3668a(awVar.f2848d ? awVar.f2845a : null, awVar.f2847c ? awVar.f2846b : f2927a, iArr));
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m3668a(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList != null) {
            if (mode != null) {
                return C0862h.m3667a(colorStateList.getColorForState(iArr, 0), mode);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static PorterDuffColorFilter m3667a(int i, Mode mode) {
        PorterDuffColorFilter a = f2929c.m16838a(i, mode);
        if (a != null) {
            return a;
        }
        a = new PorterDuffColorFilter(i, mode);
        f2929c.m16839a(i, mode, a);
        return a;
    }

    /* renamed from: a */
    private static void m3673a(Drawable drawable, int i, Mode mode) {
        if (C0885y.m3864c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f2927a;
        }
        drawable.setColorFilter(C0862h.m3667a(i, mode));
    }

    /* renamed from: f */
    private void m3689f(Context context) {
        if (!this.f2942p) {
            this.f2942p = true;
            Drawable a = m3690a(context, C0631e.abc_vector_test);
            if (a == null || C0862h.m3679a(a) == null) {
                this.f2942p = null;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: a */
    private static boolean m3679a(Drawable drawable) {
        if (!(drawable instanceof C4400i)) {
            if ("android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName()) == null) {
                return null;
            }
        }
        return true;
    }
}
