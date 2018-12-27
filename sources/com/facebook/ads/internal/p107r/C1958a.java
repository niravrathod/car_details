package com.facebook.ads.internal.p107r;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.internal.p101q.p102a.C1932s;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.p101q.p102a.C1937x;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.r.a */
public class C1958a {
    /* renamed from: a */
    private static final String f6010a = "a";
    /* renamed from: b */
    private final View f6011b;
    /* renamed from: c */
    private final int f6012c;
    /* renamed from: d */
    private final int f6013d;
    /* renamed from: e */
    private final WeakReference<C1957a> f6014e;
    /* renamed from: f */
    private final Handler f6015f;
    /* renamed from: g */
    private final boolean f6016g;
    /* renamed from: h */
    private Runnable f6017h;
    /* renamed from: i */
    private int f6018i;
    /* renamed from: j */
    private int f6019j;
    /* renamed from: k */
    private boolean f6020k;
    /* renamed from: l */
    private C1959b f6021l;
    /* renamed from: m */
    private Map<String, Integer> f6022m;
    /* renamed from: n */
    private long f6023n;
    /* renamed from: o */
    private int f6024o;

    /* renamed from: com.facebook.ads.internal.r.a$a */
    public static abstract class C1957a {
        /* renamed from: a */
        public abstract void mo1338a();

        /* renamed from: b */
        public void mo1372b() {
        }
    }

    /* renamed from: com.facebook.ads.internal.r.a$b */
    private static final class C3828b extends C1937x<C1958a> {
        C3828b(C1958a c1958a) {
            super(c1958a);
        }

        public void run() {
            C1958a c1958a = (C1958a) m7333a();
            if (c1958a != null) {
                View a = c1958a.f6011b;
                C1957a c1957a = (C1957a) c1958a.f6014e.get();
                if (a != null) {
                    if (c1957a != null) {
                        C1959b a2 = C1958a.m7399a(a, c1958a.f6012c);
                        int i = 0;
                        if (a2.m7424a()) {
                            c1958a.f6024o = c1958a.f6024o + 1;
                        } else {
                            c1958a.f6024o = 0;
                        }
                        Object obj = c1958a.f6024o > c1958a.f6013d ? 1 : null;
                        Object obj2 = (c1958a.f6021l == null || !c1958a.f6021l.m7424a()) ? null : 1;
                        if (!(obj == null && a2.m7424a())) {
                            c1958a.f6021l = a2;
                        }
                        String valueOf = String.valueOf(a2.m7425b());
                        synchronized (c1958a) {
                            if (c1958a.f6022m.containsKey(valueOf)) {
                                i = ((Integer) c1958a.f6022m.get(valueOf)).intValue();
                            }
                            c1958a.f6022m.put(valueOf, Integer.valueOf(i + 1));
                        }
                        if (obj != null && obj2 == null) {
                            c1958a.f6023n = System.currentTimeMillis();
                            c1957a.mo1338a();
                            if (!c1958a.f6016g) {
                                return;
                            }
                        } else if (obj == null && obj2 != null) {
                            c1957a.mo1372b();
                        }
                        if (!(c1958a.f6020k || c1958a.f6017h == null)) {
                            c1958a.f6015f.postDelayed(c1958a.f6017h, (long) c1958a.f6019j);
                        }
                    }
                }
            }
        }
    }

    public C1958a(View view, int i, int i2, boolean z, C1957a c1957a) {
        this.f6015f = new Handler();
        this.f6018i = 0;
        this.f6019j = 1000;
        this.f6020k = true;
        this.f6021l = new C1959b(C1960c.UNKNOWN);
        this.f6022m = new HashMap();
        this.f6023n = 0;
        this.f6024o = 0;
        this.f6011b = view;
        if (this.f6011b.getId() == -1) {
            C1936w.m7327a(this.f6011b);
        }
        this.f6012c = i;
        this.f6014e = new WeakReference(c1957a);
        this.f6016g = z;
        if (i2 < 0) {
            i2 = 0;
        }
        this.f6013d = i2;
    }

    public C1958a(View view, int i, C1957a c1957a) {
        this(view, i, 0, false, c1957a);
    }

    public C1958a(View view, int i, boolean z, C1957a c1957a) {
        this(view, i, 0, z, c1957a);
    }

    /* renamed from: a */
    static float m7392a(View view) {
        float alpha = view.getAlpha();
        while (view.getParent() instanceof ViewGroup) {
            view = (View) view.getParent();
            float alpha2 = view.getAlpha();
            if (alpha2 < 0.0f) {
                alpha2 = 0.0f;
            }
            if (alpha2 > 1.0f) {
                alpha2 = 1.0f;
            }
            alpha *= alpha2;
        }
        return alpha;
    }

    /* renamed from: a */
    public static int m7393a(int i, View view) {
        int width = view.getWidth() * view.getHeight();
        float f = 100.0f;
        if (width > 0) {
            f = 100.0f / ((float) width);
        }
        return (int) Math.max((double) i, Math.ceil((double) f));
    }

    /* renamed from: a */
    private static int m7395a(Vector<Rect> vector) {
        int size = vector.size();
        int i = size * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        boolean[][] zArr = (boolean[][]) Array.newInstance(boolean.class, new int[]{i, i});
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            Rect rect = (Rect) vector.elementAt(i2);
            int i5 = i3 + 1;
            iArr[i3] = rect.left;
            i3 = i4 + 1;
            iArr2[i4] = rect.bottom;
            i4 = i5 + 1;
            iArr[i5] = rect.right;
            i5 = i3 + 1;
            iArr2[i3] = rect.top;
            i2++;
            i3 = i4;
            i4 = i5;
        }
        Arrays.sort(iArr);
        Arrays.sort(iArr2);
        for (i2 = 0; i2 < size; i2++) {
            Rect rect2 = (Rect) vector.elementAt(i2);
            i4 = C1958a.m7396a(iArr, rect2.left);
            int a = C1958a.m7396a(iArr, rect2.right);
            i5 = C1958a.m7396a(iArr2, rect2.top);
            i3 = C1958a.m7396a(iArr2, rect2.bottom);
            for (i4++; i4 <= a; i4++) {
                for (int i6 = i5 + 1; i6 <= i3; i6++) {
                    zArr[i4][i6] = true;
                }
            }
        }
        int i7 = 0;
        size = 0;
        while (i7 < i) {
            i2 = size;
            for (size = 0; size < i; size++) {
                i2 += zArr[i7][size] ? (iArr[i7] - iArr[i7 - 1]) * (iArr2[size] - iArr2[size - 1]) : 0;
            }
            i7++;
            size = i2;
        }
        return size;
    }

    /* renamed from: a */
    private static int m7396a(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = ((length - i2) / 2) + i2;
            if (iArr[i3] == i) {
                return i3;
            }
            if (iArr[i3] > i) {
                length = i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static com.facebook.ads.internal.p107r.C1959b m7399a(android.view.View r18, int r19) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = r18;
        r1 = 0;
        r2 = 0;
        if (r0 != 0) goto L_0x0013;
    L_0x0006:
        r0 = "mAdView is null.";
        com.facebook.ads.internal.p107r.C1958a.m7401a(r1, r2, r0);
        r0 = new com.facebook.ads.internal.r.b;
        r1 = com.facebook.ads.internal.p107r.C1960c.AD_IS_NULL;
        r0.<init>(r1);
        return r0;
    L_0x0013:
        r3 = r18.getParent();
        if (r3 != 0) goto L_0x0026;
    L_0x0019:
        r1 = "mAdView has no parent.";
        com.facebook.ads.internal.p107r.C1958a.m7401a(r0, r2, r1);
        r0 = new com.facebook.ads.internal.r.b;
        r1 = com.facebook.ads.internal.p107r.C1960c.INVALID_PARENT;
        r0.<init>(r1);
        return r0;
    L_0x0026:
        r3 = r18.isShown();
        if (r3 != 0) goto L_0x0039;
    L_0x002c:
        r1 = "mAdView parent is not set to VISIBLE.";
        com.facebook.ads.internal.p107r.C1958a.m7401a(r0, r2, r1);
        r0 = new com.facebook.ads.internal.r.b;
        r1 = com.facebook.ads.internal.p107r.C1960c.INVALID_PARENT;
        r0.<init>(r1);
        return r0;
    L_0x0039:
        r3 = r18.getWindowVisibility();
        if (r3 == 0) goto L_0x004c;
    L_0x003f:
        r1 = "mAdView window is not set to VISIBLE.";
        com.facebook.ads.internal.p107r.C1958a.m7401a(r0, r2, r1);
        r0 = new com.facebook.ads.internal.r.b;
        r1 = com.facebook.ads.internal.p107r.C1960c.INVALID_WINDOW;
        r0.<init>(r1);
        return r0;
    L_0x004c:
        r3 = r18.getMeasuredWidth();
        if (r3 <= 0) goto L_0x0231;
    L_0x0052:
        r3 = r18.getMeasuredHeight();
        if (r3 > 0) goto L_0x005a;
    L_0x0058:
        goto L_0x0231;
    L_0x005a:
        r3 = com.facebook.ads.internal.p107r.C1958a.m7392a(r18);
        r4 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 >= 0) goto L_0x0072;
    L_0x0065:
        r1 = "mAdView is too transparent.";
        com.facebook.ads.internal.p107r.C1958a.m7401a(r0, r2, r1);
        r0 = new com.facebook.ads.internal.r.b;
        r1 = com.facebook.ads.internal.p107r.C1960c.AD_IS_TRANSPARENT;
        r0.<init>(r1);
        return r0;
    L_0x0072:
        r3 = r18.getWidth();
        r4 = r18.getHeight();
        r5 = 2;
        r6 = new int[r5];
        r0.getLocationOnScreen(r6);	 Catch:{ NullPointerException -> 0x0224 }
        r7 = new android.graphics.Rect;
        r7.<init>();
        r8 = r0.getGlobalVisibleRect(r7);
        if (r8 != 0) goto L_0x0093;
    L_0x008b:
        r0 = new com.facebook.ads.internal.r.b;
        r1 = com.facebook.ads.internal.p107r.C1960c.AD_IS_NOT_VISIBLE;
        r0.<init>(r1);
        return r0;
    L_0x0093:
        r8 = r18.getContext();
        r9 = android.os.Build.VERSION.SDK_INT;
        r10 = 17;
        if (r9 < r10) goto L_0x00b2;
    L_0x009d:
        r9 = "window";
        r9 = r8.getSystemService(r9);
        r9 = (android.view.WindowManager) r9;
        r9 = r9.getDefaultDisplay();
        r10 = new android.util.DisplayMetrics;
        r10.<init>();
        r9.getRealMetrics(r10);
        goto L_0x00ba;
    L_0x00b2:
        r9 = r8.getResources();
        r10 = r9.getDisplayMetrics();
    L_0x00ba:
        r9 = com.facebook.ads.internal.p107r.C1958a.m7403b(r18);
        r11 = com.facebook.ads.internal.p107r.C1958a.m7395a(r9);
        r9.add(r7);
        r9 = com.facebook.ads.internal.p107r.C1958a.m7395a(r9);
        r9 = r9 - r11;
        r11 = r18.getMeasuredHeight();
        r12 = r18.getMeasuredWidth();
        r11 = r11 * r12;
        r9 = (float) r9;
        r12 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r9 = r9 * r12;
        r11 = (float) r11;
        r9 = r9 / r11;
        r11 = com.facebook.ads.internal.p093l.C1820a.m6866u(r8);
        r12 = r19;
        r12 = com.facebook.ads.internal.p107r.C1958a.m7393a(r12, r0);
        r13 = (float) r12;
        r14 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r13 = r13 / r14;
        r14 = 1;
        if (r11 == 0) goto L_0x0111;
    L_0x00ec:
        r3 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1));
        if (r3 >= 0) goto L_0x015a;
    L_0x00f0:
        r1 = java.util.Locale.US;
        r3 = "mAdView visible area is too small [%.2f%% visible, current threshold %.2f%%]";
        r4 = new java.lang.Object[r5];
        r5 = java.lang.Float.valueOf(r9);
        r4[r2] = r5;
        r5 = java.lang.Float.valueOf(r13);
        r4[r14] = r5;
        r1 = java.lang.String.format(r1, r3, r4);
        com.facebook.ads.internal.p107r.C1958a.m7401a(r0, r2, r1);
        r0 = new com.facebook.ads.internal.r.b;
        r1 = com.facebook.ads.internal.p107r.C1960c.AD_INSUFFICIENT_VISIBLE_AREA;
        r0.<init>(r1, r9);
        return r0;
    L_0x0111:
        r11 = r6[r2];
        if (r11 < 0) goto L_0x0216;
    L_0x0115:
        r10 = r10.widthPixels;
        r11 = r6[r2];
        r10 = r10 - r11;
        if (r10 >= r3) goto L_0x011e;
    L_0x011c:
        goto L_0x0216;
    L_0x011e:
        r10 = (double) r4;
        r1 = (double) r12;
        r16 = 4636737291354636288; // 0x4059000000000000 float:0.0 double:100.0;
        java.lang.Double.isNaN(r1);
        r1 = r16 - r1;
        java.lang.Double.isNaN(r10);
        r10 = r10 * r1;
        r10 = r10 / r16;
        r1 = (int) r10;
        r2 = r7.top;
        r3 = r6[r14];
        r2 = r2 - r3;
        if (r2 <= r1) goto L_0x0144;
    L_0x0136:
        r1 = "mAdView is not visible from the top.";
        r2 = 0;
        com.facebook.ads.internal.p107r.C1958a.m7401a(r0, r2, r1);
        r0 = new com.facebook.ads.internal.r.b;
        r1 = com.facebook.ads.internal.p107r.C1960c.AD_OFFSCREEN_TOP;
        r0.<init>(r1, r9);
        return r0;
    L_0x0144:
        r2 = 0;
        r3 = r6[r14];
        r3 = r3 + r4;
        r4 = r7.bottom;
        r3 = r3 - r4;
        if (r3 <= r1) goto L_0x015a;
    L_0x014d:
        r1 = "mAdView is not visible from the bottom.";
        com.facebook.ads.internal.p107r.C1958a.m7401a(r0, r2, r1);
        r0 = new com.facebook.ads.internal.r.b;
        r1 = com.facebook.ads.internal.p107r.C1960c.AD_OFFSCREEN_BOTTOM;
        r0.<init>(r1, r9);
        return r0;
    L_0x015a:
        r1 = com.facebook.ads.internal.p101q.p106e.C1955a.m7386b(r8);
        if (r1 != 0) goto L_0x016d;
    L_0x0160:
        r1 = "Screen is not interactive.";
        com.facebook.ads.internal.p107r.C1958a.m7401a(r0, r2, r1);
        r0 = new com.facebook.ads.internal.r.b;
        r1 = com.facebook.ads.internal.p107r.C1960c.SCREEN_NOT_INTERACTIVE;
        r0.<init>(r1, r9);
        return r0;
    L_0x016d:
        r1 = com.facebook.ads.internal.p101q.p106e.C1956b.m7387a(r8);
        r3 = com.facebook.ads.internal.p101q.p102a.C1938y.m7336b(r1);
        if (r3 == 0) goto L_0x0184;
    L_0x0177:
        r1 = "Keyguard is obstructing view.";
        com.facebook.ads.internal.p107r.C1958a.m7401a(r0, r2, r1);
        r0 = new com.facebook.ads.internal.r.b;
        r1 = com.facebook.ads.internal.p107r.C1960c.AD_IS_OBSTRUCTED_BY_KEYGUARD;
        r0.<init>(r1, r9);
        return r0;
    L_0x0184:
        r3 = com.facebook.ads.internal.p093l.C1820a.m6848c(r8);
        if (r3 == 0) goto L_0x019d;
    L_0x018a:
        r3 = com.facebook.ads.internal.p101q.p102a.C1938y.m7335a(r1);
        if (r3 == 0) goto L_0x019d;
    L_0x0190:
        r3 = "Ad is on top of the Lockscreen.";
        com.facebook.ads.internal.p107r.C1958a.m7401a(r0, r2, r3);
        r0 = new com.facebook.ads.internal.r.b;
        r2 = com.facebook.ads.internal.p107r.C1960c.AD_IN_LOCKSCREEN;
        r0.<init>(r2, r9, r1);
        return r0;
    L_0x019d:
        r2 = com.facebook.ads.internal.p093l.C1820a.m6864s(r8);
        if (r2 == 0) goto L_0x01a9;
    L_0x01a3:
        r2 = com.facebook.ads.internal.p107r.C1961d.m7429a(r18);
        r15 = r2;
        goto L_0x01aa;
    L_0x01a9:
        r15 = 0;
    L_0x01aa:
        if (r15 == 0) goto L_0x01db;
    L_0x01ac:
        r2 = r15.floatValue();
        r3 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 != 0) goto L_0x01c4;
    L_0x01b6:
        r1 = "mAdView is not in the top activity";
        r2 = 0;
        com.facebook.ads.internal.p107r.C1958a.m7401a(r0, r2, r1);
        r0 = new com.facebook.ads.internal.r.b;
        r1 = com.facebook.ads.internal.p107r.C1960c.AD_IS_NOT_IN_ACTIVITY;
        r0.<init>(r1);
        return r0;
    L_0x01c4:
        r2 = 0;
        r3 = r15.floatValue();
        r4 = 0;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 != 0) goto L_0x01db;
    L_0x01ce:
        r1 = "mAdView is not visible";
        com.facebook.ads.internal.p107r.C1958a.m7401a(r0, r2, r1);
        r0 = new com.facebook.ads.internal.r.b;
        r1 = com.facebook.ads.internal.p107r.C1960c.AD_IS_NOT_VISIBLE;
        r0.<init>(r1);
        return r0;
    L_0x01db:
        r2 = com.facebook.ads.internal.p093l.C1820a.m6865t(r8);
        if (r2 == 0) goto L_0x0209;
    L_0x01e1:
        if (r15 == 0) goto L_0x0209;
    L_0x01e3:
        r2 = r15.floatValue();
        r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1));
        if (r2 >= 0) goto L_0x0209;
    L_0x01eb:
        r2 = java.util.Locale.US;
        r3 = "mAdView visible area is too small [%.2f%% visible, current threshold %.2f%%]";
        r4 = new java.lang.Object[r5];
        r5 = 0;
        r4[r5] = r15;
        r6 = java.lang.Float.valueOf(r13);
        r4[r14] = r6;
        r2 = java.lang.String.format(r2, r3, r4);
        com.facebook.ads.internal.p107r.C1958a.m7401a(r0, r5, r2);
        r0 = new com.facebook.ads.internal.r.b;
        r2 = com.facebook.ads.internal.p107r.C1960c.AD_INSUFFICIENT_VISIBLE_AREA;
        r0.<init>(r2, r9, r1);
        return r0;
    L_0x0209:
        r2 = "mAdView is visible.";
        com.facebook.ads.internal.p107r.C1958a.m7401a(r0, r14, r2);
        r0 = new com.facebook.ads.internal.r.b;
        r2 = com.facebook.ads.internal.p107r.C1960c.IS_VIEWABLE;
        r0.<init>(r2, r9, r1);
        return r0;
    L_0x0216:
        r1 = "mAdView is not fully on screen horizontally.";
        r2 = 0;
        com.facebook.ads.internal.p107r.C1958a.m7401a(r0, r2, r1);
        r0 = new com.facebook.ads.internal.r.b;
        r1 = com.facebook.ads.internal.p107r.C1960c.AD_OFFSCREEN_HORIZONTALLY;
        r0.<init>(r1, r9);
        return r0;
    L_0x0224:
        r1 = "Cannot get location on screen.";
        com.facebook.ads.internal.p107r.C1958a.m7401a(r0, r2, r1);
        r0 = new com.facebook.ads.internal.r.b;
        r1 = com.facebook.ads.internal.p107r.C1960c.INVALID_DIMENSIONS;
        r0.<init>(r1);
        return r0;
    L_0x0231:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "mAdView has invisible dimensions (w=";
        r1.append(r2);
        r2 = r18.getMeasuredWidth();
        r1.append(r2);
        r2 = ", h=";
        r1.append(r2);
        r2 = r18.getMeasuredHeight();
        r1.append(r2);
        r1 = r1.toString();
        r2 = 0;
        com.facebook.ads.internal.p107r.C1958a.m7401a(r0, r2, r1);
        r0 = new com.facebook.ads.internal.r.b;
        r1 = com.facebook.ads.internal.p107r.C1960c.INVALID_DIMENSIONS;
        r0.<init>(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.r.a.a(android.view.View, int):com.facebook.ads.internal.r.b");
    }

    /* renamed from: a */
    private static void m7401a(View view, boolean z, String str) {
    }

    /* renamed from: b */
    private static Vector<Rect> m7403b(View view) {
        Vector<Rect> vector = new Vector();
        if (!(view.getParent() instanceof ViewGroup)) {
            return vector;
        }
        View view2 = (ViewGroup) view.getParent();
        int indexOfChild = view2.indexOfChild(view);
        while (true) {
            indexOfChild++;
            if (indexOfChild < view2.getChildCount()) {
                vector.addAll(C1958a.m7405c(view2.getChildAt(indexOfChild)));
            } else {
                vector.addAll(C1958a.m7403b(view2));
                return vector;
            }
        }
    }

    /* renamed from: c */
    private static Vector<Rect> m7405c(View view) {
        Vector<Rect> vector = new Vector();
        if (view.isShown()) {
            if (VERSION.SDK_INT < 11 || view.getAlpha() > 0.0f) {
                if ((view instanceof ViewGroup) && C1958a.m7407d(view)) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        vector.addAll(C1958a.m7405c(viewGroup.getChildAt(i)));
                    }
                    return vector;
                }
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    vector.add(rect);
                }
            }
        }
        return vector;
    }

    /* renamed from: d */
    private static boolean m7407d(View view) {
        if (view.getBackground() != null) {
            if (VERSION.SDK_INT < 19 || view.getBackground().getAlpha() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public synchronized void m7417a() {
        if (this.f6017h != null) {
            m7422c();
        }
        this.f6017h = new C3828b(this);
        this.f6015f.postDelayed(this.f6017h, (long) this.f6018i);
        this.f6020k = false;
        this.f6024o = 0;
        this.f6021l = new C1959b(C1960c.UNKNOWN);
        this.f6022m = new HashMap();
    }

    /* renamed from: a */
    public void m7418a(int i) {
        this.f6018i = i;
    }

    /* renamed from: a */
    public synchronized void m7419a(Map<String, String> map) {
        map.put("vrc", String.valueOf(this.f6021l.m7425b()));
        map.put("vp", String.valueOf(this.f6021l.m7426c()));
        map.put("vh", new JSONObject(this.f6022m).toString());
        map.put("vt", C1932s.m7314a(this.f6023n));
        map.putAll(this.f6021l.m7427d());
    }

    /* renamed from: b */
    public void m7420b(int i) {
        this.f6019j = i;
    }

    /* renamed from: b */
    public synchronized boolean m7421b() {
        return this.f6020k;
    }

    /* renamed from: c */
    public synchronized void m7422c() {
        this.f6015f.removeCallbacks(this.f6017h);
        this.f6017h = null;
        this.f6020k = true;
        this.f6024o = 0;
    }

    /* renamed from: d */
    public synchronized String m7423d() {
        StringBuilder stringBuilder;
        C1960c c1960c = C1960c.values()[this.f6021l.m7425b()];
        stringBuilder = new StringBuilder();
        stringBuilder.append(c1960c.toString());
        stringBuilder.append(String.format(" (%.1f%%)", new Object[]{Float.valueOf(this.f6021l.m7426c() * 100.0f)}));
        return stringBuilder.toString();
    }
}
