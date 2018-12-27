package android.support.v4.view;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: android.support.v4.view.r */
public class C0560r {
    /* renamed from: a */
    static final C0559j f1774a;

    /* renamed from: android.support.v4.view.r$j */
    static class C0559j {
        /* renamed from: b */
        static Field f1765b;
        /* renamed from: c */
        static boolean f1766c = false;
        /* renamed from: d */
        private static Field f1767d;
        /* renamed from: e */
        private static boolean f1768e;
        /* renamed from: f */
        private static Field f1769f;
        /* renamed from: g */
        private static boolean f1770g;
        /* renamed from: h */
        private static WeakHashMap<View, String> f1771h;
        /* renamed from: i */
        private static final AtomicInteger f1772i = new AtomicInteger(1);
        /* renamed from: a */
        WeakHashMap<View, C0568v> f1773a = null;

        /* renamed from: a */
        public C0571z mo4997a(View view, C0571z c0571z) {
            return c0571z;
        }

        /* renamed from: a */
        public void mo4998a(View view, float f) {
        }

        /* renamed from: a */
        public void mo3767a(View view, int i) {
        }

        /* renamed from: a */
        public void mo5035a(View view, int i, int i2) {
        }

        /* renamed from: a */
        public void mo4896a(View view, Rect rect) {
        }

        /* renamed from: a */
        public void mo5001a(View view, C0554n c0554n) {
        }

        /* renamed from: a */
        public void mo5041a(View view, C0556p c0556p) {
        }

        /* renamed from: a */
        public void mo3772a(View view, boolean z) {
        }

        /* renamed from: a */
        public boolean mo451a(View view) {
            return false;
        }

        /* renamed from: b */
        public C0571z mo5003b(View view, C0571z c0571z) {
            return c0571z;
        }

        /* renamed from: b */
        public void mo5004b(View view, float f) {
        }

        /* renamed from: b */
        public void mo4967b(View view, int i) {
        }

        /* renamed from: b */
        public boolean mo3773b(View view) {
            return false;
        }

        /* renamed from: d */
        public int mo3775d(View view) {
            return 0;
        }

        /* renamed from: h */
        public void mo3779h(View view) {
        }

        /* renamed from: i */
        public boolean mo3780i(View view) {
            return false;
        }

        /* renamed from: j */
        public boolean mo3781j(View view) {
            return true;
        }

        /* renamed from: k */
        public int mo4601k(View view) {
            return 0;
        }

        /* renamed from: n */
        public int mo4604n(View view) {
            return 0;
        }

        /* renamed from: o */
        public boolean mo4605o(View view) {
            return false;
        }

        /* renamed from: q */
        public Rect mo4897q(View view) {
            return null;
        }

        /* renamed from: u */
        public float mo5008u(View view) {
            return 0.0f;
        }

        /* renamed from: v */
        public float mo5009v(View view) {
            return 0.0f;
        }

        C0559j() {
        }

        /* renamed from: a */
        public void m2123a(View view, C0536a c0536a) {
            view.setAccessibilityDelegate(c0536a == null ? null : c0536a.m2013a());
        }

        /* renamed from: B */
        public boolean m2110B(android.view.View r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = f1766c;
            r1 = 0;
            if (r0 == 0) goto L_0x0006;
        L_0x0005:
            return r1;
        L_0x0006:
            r0 = f1765b;
            r2 = 1;
            if (r0 != 0) goto L_0x001e;
        L_0x000b:
            r0 = android.view.View.class;	 Catch:{ Throwable -> 0x001b }
            r3 = "mAccessibilityDelegate";	 Catch:{ Throwable -> 0x001b }
            r0 = r0.getDeclaredField(r3);	 Catch:{ Throwable -> 0x001b }
            f1765b = r0;	 Catch:{ Throwable -> 0x001b }
            r0 = f1765b;	 Catch:{ Throwable -> 0x001b }
            r0.setAccessible(r2);	 Catch:{ Throwable -> 0x001b }
            goto L_0x001e;
        L_0x001b:
            f1766c = r2;
            return r1;
        L_0x001e:
            r0 = f1765b;	 Catch:{ Throwable -> 0x0028 }
            r5 = r0.get(r5);	 Catch:{ Throwable -> 0x0028 }
            if (r5 == 0) goto L_0x0027;
        L_0x0026:
            r1 = 1;
        L_0x0027:
            return r1;
        L_0x0028:
            f1766c = r2;
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.r.j.B(android.view.View):boolean");
        }

        /* renamed from: c */
        public void mo3774c(View view) {
            view.postInvalidate();
        }

        /* renamed from: a */
        public void mo3768a(View view, int i, int i2, int i3, int i4) {
            view.postInvalidate(i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo3770a(View view, Runnable runnable) {
            view.postDelayed(runnable, m2112a());
        }

        /* renamed from: a */
        public void mo3771a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, m2112a() + j);
        }

        /* renamed from: a */
        long m2112a() {
            return ValueAnimator.getFrameDelay();
        }

        /* renamed from: a */
        public void mo4599a(View view, Paint paint) {
            view.setLayerType(view.getLayerType(), paint);
            view.invalidate();
        }

        /* renamed from: e */
        public ViewParent mo3776e(View view) {
            return view.getParent();
        }

        /* renamed from: l */
        public int mo4602l(View view) {
            return view.getPaddingLeft();
        }

        /* renamed from: m */
        public int mo4603m(View view) {
            return view.getPaddingRight();
        }

        /* renamed from: b */
        public void mo4600b(View view, int i, int i2, int i3, int i4) {
            view.setPadding(i, i2, i3, i4);
        }

        /* renamed from: f */
        public int mo3777f(android.view.View r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r3 = this;
            r0 = f1768e;
            if (r0 != 0) goto L_0x0016;
        L_0x0004:
            r0 = 1;
            r1 = android.view.View.class;	 Catch:{ NoSuchFieldException -> 0x0014 }
            r2 = "mMinWidth";	 Catch:{ NoSuchFieldException -> 0x0014 }
            r1 = r1.getDeclaredField(r2);	 Catch:{ NoSuchFieldException -> 0x0014 }
            f1767d = r1;	 Catch:{ NoSuchFieldException -> 0x0014 }
            r1 = f1767d;	 Catch:{ NoSuchFieldException -> 0x0014 }
            r1.setAccessible(r0);	 Catch:{ NoSuchFieldException -> 0x0014 }
        L_0x0014:
            f1768e = r0;
        L_0x0016:
            r0 = f1767d;
            if (r0 == 0) goto L_0x0027;
        L_0x001a:
            r0 = f1767d;	 Catch:{ Exception -> 0x0027 }
            r4 = r0.get(r4);	 Catch:{ Exception -> 0x0027 }
            r4 = (java.lang.Integer) r4;	 Catch:{ Exception -> 0x0027 }
            r4 = r4.intValue();	 Catch:{ Exception -> 0x0027 }
            return r4;
        L_0x0027:
            r4 = 0;
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.r.j.f(android.view.View):int");
        }

        /* renamed from: g */
        public int mo3778g(android.view.View r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r3 = this;
            r0 = f1770g;
            if (r0 != 0) goto L_0x0016;
        L_0x0004:
            r0 = 1;
            r1 = android.view.View.class;	 Catch:{ NoSuchFieldException -> 0x0014 }
            r2 = "mMinHeight";	 Catch:{ NoSuchFieldException -> 0x0014 }
            r1 = r1.getDeclaredField(r2);	 Catch:{ NoSuchFieldException -> 0x0014 }
            f1769f = r1;	 Catch:{ NoSuchFieldException -> 0x0014 }
            r1 = f1769f;	 Catch:{ NoSuchFieldException -> 0x0014 }
            r1.setAccessible(r0);	 Catch:{ NoSuchFieldException -> 0x0014 }
        L_0x0014:
            f1770g = r0;
        L_0x0016:
            r0 = f1769f;
            if (r0 == 0) goto L_0x0027;
        L_0x001a:
            r0 = f1769f;	 Catch:{ Exception -> 0x0027 }
            r4 = r0.get(r4);	 Catch:{ Exception -> 0x0027 }
            r4 = (java.lang.Integer) r4;	 Catch:{ Exception -> 0x0027 }
            r4 = r4.intValue();	 Catch:{ Exception -> 0x0027 }
            return r4;
        L_0x0027:
            r4 = 0;
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.r.j.g(android.view.View):int");
        }

        /* renamed from: C */
        public C0568v m2111C(View view) {
            if (this.f1773a == null) {
                this.f1773a = new WeakHashMap();
            }
            C0568v c0568v = (C0568v) this.f1773a.get(view);
            if (c0568v != null) {
                return c0568v;
            }
            c0568v = new C0568v(view);
            this.f1773a.put(view, c0568v);
            return c0568v;
        }

        /* renamed from: a */
        public void mo5002a(View view, String str) {
            if (f1771h == null) {
                f1771h = new WeakHashMap();
            }
            f1771h.put(view, str);
        }

        /* renamed from: t */
        public String mo5007t(View view) {
            if (f1771h == null) {
                return null;
            }
            return (String) f1771h.get(view);
        }

        /* renamed from: w */
        public boolean mo5010w(View view) {
            return view instanceof C0550h ? ((C0550h) view).isNestedScrollingEnabled() : null;
        }

        /* renamed from: a */
        public void mo3769a(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }

        /* renamed from: y */
        public ColorStateList mo5012y(View view) {
            return view instanceof C0557q ? ((C0557q) view).getSupportBackgroundTintList() : null;
        }

        /* renamed from: a */
        public void mo4999a(View view, ColorStateList colorStateList) {
            if (view instanceof C0557q) {
                ((C0557q) view).setSupportBackgroundTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo5000a(View view, Mode mode) {
            if (view instanceof C0557q) {
                ((C0557q) view).setSupportBackgroundTintMode(mode);
            }
        }

        /* renamed from: z */
        public Mode mo5013z(View view) {
            return view instanceof C0557q ? ((C0557q) view).getSupportBackgroundTintMode() : null;
        }

        /* renamed from: x */
        public void mo5011x(View view) {
            if (view instanceof C0550h) {
                ((C0550h) view).stopNestedScroll();
            }
        }

        /* renamed from: r */
        public boolean mo4968r(View view) {
            return (view.getWidth() <= 0 || view.getHeight() <= null) ? null : true;
        }

        /* renamed from: A */
        public float mo4996A(View view) {
            return mo5009v(view) + mo5008u(view);
        }

        /* renamed from: s */
        public boolean mo4969s(View view) {
            return view.getWindowToken() != null ? true : null;
        }

        /* renamed from: c */
        public void mo5005c(View view, int i) {
            view.offsetLeftAndRight(i);
            if (view.getVisibility() == 0) {
                C0559j.m2108D(view);
                view = view.getParent();
                if ((view instanceof View) != 0) {
                    C0559j.m2108D(view);
                }
            }
        }

        /* renamed from: d */
        public void mo5006d(View view, int i) {
            view.offsetTopAndBottom(i);
            if (view.getVisibility() == 0) {
                C0559j.m2108D(view);
                view = view.getParent();
                if ((view instanceof View) != 0) {
                    C0559j.m2108D(view);
                }
            }
        }

        /* renamed from: D */
        private static void m2108D(View view) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
        }

        /* renamed from: p */
        public Display mo4606p(View view) {
            return mo4969s(view) ? ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay() : null;
        }
    }

    /* renamed from: android.support.v4.view.r$a */
    static class C3169a extends C0559j {
        C3169a() {
        }

        /* renamed from: a */
        public boolean mo451a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: android.support.v4.view.r$b */
    static class C4442b extends C3169a {
        C4442b() {
        }

        /* renamed from: b */
        public boolean mo3773b(View view) {
            return view.hasTransientState();
        }

        /* renamed from: a */
        public void mo3772a(View view, boolean z) {
            view.setHasTransientState(z);
        }

        /* renamed from: c */
        public void mo3774c(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: a */
        public void mo3768a(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo3770a(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: a */
        public void mo3771a(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: d */
        public int mo3775d(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: a */
        public void mo3767a(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }

        /* renamed from: e */
        public ViewParent mo3776e(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: f */
        public int mo3777f(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: g */
        public int mo3778g(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: h */
        public void mo3779h(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: i */
        public boolean mo3780i(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: j */
        public boolean mo3781j(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: a */
        public void mo3769a(View view, Drawable drawable) {
            view.setBackground(drawable);
        }
    }

    /* renamed from: android.support.v4.view.r$c */
    static class C4763c extends C4442b {
        C4763c() {
        }

        /* renamed from: a */
        public void mo4599a(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: k */
        public int mo4601k(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: l */
        public int mo4602l(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: m */
        public int mo4603m(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: b */
        public void mo4600b(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }

        /* renamed from: n */
        public int mo4604n(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: o */
        public boolean mo4605o(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: p */
        public Display mo4606p(View view) {
            return view.getDisplay();
        }
    }

    /* renamed from: android.support.v4.view.r$d */
    static class C4842d extends C4763c {
        C4842d() {
        }

        /* renamed from: a */
        public void mo4896a(View view, Rect rect) {
            view.setClipBounds(rect);
        }

        /* renamed from: q */
        public Rect mo4897q(View view) {
            return view.getClipBounds();
        }
    }

    /* renamed from: android.support.v4.view.r$e */
    static class C4869e extends C4842d {
        C4869e() {
        }

        /* renamed from: b */
        public void mo4967b(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        /* renamed from: a */
        public void mo3767a(View view, int i) {
            view.setImportantForAccessibility(i);
        }

        /* renamed from: r */
        public boolean mo4968r(View view) {
            return view.isLaidOut();
        }

        /* renamed from: s */
        public boolean mo4969s(View view) {
            return view.isAttachedToWindow();
        }
    }

    /* renamed from: android.support.v4.view.r$f */
    static class C4877f extends C4869e {
        /* renamed from: d */
        private static ThreadLocal<Rect> f21694d;

        C4877f() {
        }

        /* renamed from: a */
        public void mo5002a(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: t */
        public String mo5007t(View view) {
            return view.getTransitionName();
        }

        /* renamed from: h */
        public void mo3779h(View view) {
            view.requestApplyInsets();
        }

        /* renamed from: a */
        public void mo4998a(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: u */
        public float mo5008u(View view) {
            return view.getElevation();
        }

        /* renamed from: b */
        public void mo5004b(View view, float f) {
            view.setTranslationZ(f);
        }

        /* renamed from: v */
        public float mo5009v(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: a */
        public void mo5001a(View view, final C0554n c0554n) {
            if (c0554n == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener(this) {
                    /* renamed from: b */
                    final /* synthetic */ C4877f f1764b;

                    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        return (WindowInsets) C0571z.m2250a(c0554n.mo88a(view, C0571z.m2249a((Object) windowInsets)));
                    }
                });
            }
        }

        /* renamed from: w */
        public boolean mo5010w(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: x */
        public void mo5011x(View view) {
            view.stopNestedScroll();
        }

        /* renamed from: y */
        public ColorStateList mo5012y(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: a */
        public void mo4999a(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Object obj;
                colorStateList = view.getBackground();
                if (view.getBackgroundTintList() == null) {
                    if (view.getBackgroundTintMode() == null) {
                        obj = null;
                        if (colorStateList != null && r0 != null) {
                            if (colorStateList.isStateful()) {
                                colorStateList.setState(view.getDrawableState());
                            }
                            view.setBackground(colorStateList);
                            return;
                        }
                    }
                }
                obj = 1;
                if (colorStateList != null) {
                }
            }
        }

        /* renamed from: a */
        public void mo5000a(View view, Mode mode) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Object obj;
                mode = view.getBackground();
                if (view.getBackgroundTintList() == null) {
                    if (view.getBackgroundTintMode() == null) {
                        obj = null;
                        if (mode != null && r0 != null) {
                            if (mode.isStateful()) {
                                mode.setState(view.getDrawableState());
                            }
                            view.setBackground(mode);
                            return;
                        }
                    }
                }
                obj = 1;
                if (mode != null) {
                }
            }
        }

        /* renamed from: z */
        public Mode mo5013z(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: a */
        public C0571z mo4997a(View view, C0571z c0571z) {
            Object obj = (WindowInsets) C0571z.m2250a(c0571z);
            view = view.onApplyWindowInsets(obj);
            if (view != obj) {
                obj = new WindowInsets(view);
            }
            return C0571z.m2249a(obj);
        }

        /* renamed from: b */
        public C0571z mo5003b(View view, C0571z c0571z) {
            Object obj = (WindowInsets) C0571z.m2250a(c0571z);
            view = view.dispatchApplyWindowInsets(obj);
            if (view != obj) {
                obj = new WindowInsets(view);
            }
            return C0571z.m2249a(obj);
        }

        /* renamed from: A */
        public float mo4996A(View view) {
            return view.getZ();
        }

        /* renamed from: c */
        public void mo5005c(View view, int i) {
            int intersects;
            Rect b = C4877f.m29860b();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                intersects = b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ 1;
            } else {
                intersects = 0;
            }
            super.mo5005c(view, i);
            if (intersects != 0 && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) != null) {
                ((View) parent).invalidate(b);
            }
        }

        /* renamed from: d */
        public void mo5006d(View view, int i) {
            int intersects;
            Rect b = C4877f.m29860b();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                intersects = b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ 1;
            } else {
                intersects = 0;
            }
            super.mo5006d(view, i);
            if (intersects != 0 && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) != null) {
                ((View) parent).invalidate(b);
            }
        }

        /* renamed from: b */
        private static Rect m29860b() {
            if (f21694d == null) {
                f21694d = new ThreadLocal();
            }
            Rect rect = (Rect) f21694d.get();
            if (rect == null) {
                rect = new Rect();
                f21694d.set(rect);
            }
            rect.setEmpty();
            return rect;
        }
    }

    /* renamed from: android.support.v4.view.r$g */
    static class C4881g extends C4877f {
        C4881g() {
        }

        /* renamed from: a */
        public void mo5035a(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }

        /* renamed from: c */
        public void mo5005c(View view, int i) {
            view.offsetLeftAndRight(i);
        }

        /* renamed from: d */
        public void mo5006d(View view, int i) {
            view.offsetTopAndBottom(i);
        }
    }

    /* renamed from: android.support.v4.view.r$h */
    static class C4884h extends C4881g {
        C4884h() {
        }

        /* renamed from: a */
        public void mo5041a(View view, C0556p c0556p) {
            view.setPointerIcon((PointerIcon) (c0556p != null ? c0556p.m2107a() : null));
        }
    }

    /* renamed from: android.support.v4.view.r$i */
    static class C4887i extends C4884h {
        C4887i() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 26) {
            f1774a = new C4887i();
        } else if (VERSION.SDK_INT >= 24) {
            f1774a = new C4884h();
        } else if (VERSION.SDK_INT >= 23) {
            f1774a = new C4881g();
        } else if (VERSION.SDK_INT >= 21) {
            f1774a = new C4877f();
        } else if (VERSION.SDK_INT >= 19) {
            f1774a = new C4869e();
        } else if (VERSION.SDK_INT >= 18) {
            f1774a = new C4842d();
        } else if (VERSION.SDK_INT >= 17) {
            f1774a = new C4763c();
        } else if (VERSION.SDK_INT >= 16) {
            f1774a = new C4442b();
        } else if (VERSION.SDK_INT >= 15) {
            f1774a = new C3169a();
        } else {
            f1774a = new C0559j();
        }
    }

    /* renamed from: a */
    public static void m2175a(View view, C0536a c0536a) {
        f1774a.m2123a(view, c0536a);
    }

    /* renamed from: a */
    public static boolean m2182a(View view) {
        return f1774a.m2110B(view);
    }

    /* renamed from: b */
    public static boolean m2188b(View view) {
        return f1774a.mo3773b(view);
    }

    /* renamed from: a */
    public static void m2181a(View view, boolean z) {
        f1774a.mo3772a(view, z);
    }

    /* renamed from: c */
    public static void m2189c(View view) {
        f1774a.mo3774c(view);
    }

    /* renamed from: a */
    public static void m2169a(View view, int i, int i2, int i3, int i4) {
        f1774a.mo3768a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m2178a(View view, Runnable runnable) {
        f1774a.mo3770a(view, runnable);
    }

    /* renamed from: a */
    public static void m2179a(View view, Runnable runnable, long j) {
        f1774a.mo3771a(view, runnable, j);
    }

    /* renamed from: d */
    public static int m2191d(View view) {
        return f1774a.mo3775d(view);
    }

    /* renamed from: a */
    public static void m2167a(View view, int i) {
        f1774a.mo3767a(view, i);
    }

    /* renamed from: a */
    public static void m2171a(View view, Paint paint) {
        f1774a.mo4599a(view, paint);
    }

    /* renamed from: e */
    public static int m2193e(View view) {
        return f1774a.mo4601k(view);
    }

    /* renamed from: f */
    public static ViewParent m2194f(View view) {
        return f1774a.mo3776e(view);
    }

    /* renamed from: b */
    public static void m2185b(View view, int i) {
        f1774a.mo4967b(view, i);
    }

    /* renamed from: g */
    public static int m2195g(View view) {
        return f1774a.mo4602l(view);
    }

    /* renamed from: h */
    public static int m2196h(View view) {
        return f1774a.mo4603m(view);
    }

    /* renamed from: b */
    public static void m2186b(View view, int i, int i2, int i3, int i4) {
        f1774a.mo4600b(view, i, i2, i3, i4);
    }

    /* renamed from: i */
    public static int m2197i(View view) {
        return f1774a.mo3777f(view);
    }

    /* renamed from: j */
    public static int m2198j(View view) {
        return f1774a.mo3778g(view);
    }

    /* renamed from: k */
    public static C0568v m2199k(View view) {
        return f1774a.m2111C(view);
    }

    /* renamed from: a */
    public static void m2166a(View view, float f) {
        f1774a.mo4998a(view, f);
    }

    /* renamed from: l */
    public static float m2200l(View view) {
        return f1774a.mo5008u(view);
    }

    /* renamed from: b */
    public static void m2184b(View view, float f) {
        f1774a.mo5004b(view, f);
    }

    /* renamed from: m */
    public static float m2201m(View view) {
        return f1774a.mo5009v(view);
    }

    /* renamed from: a */
    public static void m2180a(View view, String str) {
        f1774a.mo5002a(view, str);
    }

    /* renamed from: n */
    public static String m2202n(View view) {
        return f1774a.mo5007t(view);
    }

    /* renamed from: o */
    public static int m2203o(View view) {
        return f1774a.mo4604n(view);
    }

    /* renamed from: p */
    public static void m2204p(View view) {
        f1774a.mo3779h(view);
    }

    /* renamed from: q */
    public static boolean m2205q(View view) {
        return f1774a.mo3780i(view);
    }

    @Deprecated
    /* renamed from: b */
    public static void m2187b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: a */
    public static void m2176a(View view, C0554n c0554n) {
        f1774a.mo5001a(view, c0554n);
    }

    /* renamed from: a */
    public static C0571z m2165a(View view, C0571z c0571z) {
        return f1774a.mo4997a(view, c0571z);
    }

    /* renamed from: b */
    public static C0571z m2183b(View view, C0571z c0571z) {
        return f1774a.mo5003b(view, c0571z);
    }

    /* renamed from: r */
    public static boolean m2206r(View view) {
        return f1774a.mo3781j(view);
    }

    /* renamed from: s */
    public static boolean m2207s(View view) {
        return f1774a.mo4605o(view);
    }

    /* renamed from: a */
    public static void m2174a(View view, Drawable drawable) {
        f1774a.mo3769a(view, drawable);
    }

    /* renamed from: t */
    public static ColorStateList m2208t(View view) {
        return f1774a.mo5012y(view);
    }

    /* renamed from: a */
    public static void m2170a(View view, ColorStateList colorStateList) {
        f1774a.mo4999a(view, colorStateList);
    }

    /* renamed from: u */
    public static Mode m2209u(View view) {
        return f1774a.mo5013z(view);
    }

    /* renamed from: a */
    public static void m2172a(View view, Mode mode) {
        f1774a.mo5000a(view, mode);
    }

    /* renamed from: v */
    public static boolean m2210v(View view) {
        return f1774a.mo5010w(view);
    }

    /* renamed from: w */
    public static void m2211w(View view) {
        f1774a.mo5011x(view);
    }

    /* renamed from: x */
    public static boolean m2212x(View view) {
        return f1774a.mo4968r(view);
    }

    /* renamed from: y */
    public static float m2213y(View view) {
        return f1774a.mo4996A(view);
    }

    /* renamed from: c */
    public static void m2190c(View view, int i) {
        f1774a.mo5006d(view, i);
    }

    /* renamed from: d */
    public static void m2192d(View view, int i) {
        f1774a.mo5005c(view, i);
    }

    /* renamed from: a */
    public static void m2173a(View view, Rect rect) {
        f1774a.mo4896a(view, rect);
    }

    /* renamed from: z */
    public static Rect m2214z(View view) {
        return f1774a.mo4897q(view);
    }

    /* renamed from: A */
    public static boolean m2162A(View view) {
        return f1774a.mo4969s(view);
    }

    /* renamed from: B */
    public static boolean m2163B(View view) {
        return f1774a.mo451a(view);
    }

    /* renamed from: a */
    public static void m2168a(View view, int i, int i2) {
        f1774a.mo5035a(view, i, i2);
    }

    /* renamed from: a */
    public static void m2177a(View view, C0556p c0556p) {
        f1774a.mo5041a(view, c0556p);
    }

    /* renamed from: C */
    public static Display m2164C(View view) {
        return f1774a.mo4606p(view);
    }
}
