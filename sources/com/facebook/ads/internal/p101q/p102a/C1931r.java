package com.facebook.ads.internal.p101q.p102a;

import android.os.Handler;
import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;

/* renamed from: com.facebook.ads.internal.q.a.r */
public class C1931r implements OnSystemUiVisibilityChangeListener {
    /* renamed from: a */
    private final View f5909a;
    /* renamed from: b */
    private int f5910b;
    /* renamed from: c */
    private Window f5911c;
    /* renamed from: d */
    private C1930a f5912d = C1930a.DEFAULT;
    /* renamed from: e */
    private final Runnable f5913e = new C19281(this);

    /* renamed from: com.facebook.ads.internal.q.a.r$1 */
    class C19281 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1931r f5904a;

        C19281(C1931r c1931r) {
            this.f5904a = c1931r;
        }

        public void run() {
            this.f5904a.m7309a(false);
        }
    }

    /* renamed from: com.facebook.ads.internal.q.a.r$2 */
    static /* synthetic */ class C19292 {
        /* renamed from: a */
        static final /* synthetic */ int[] f5905a = new int[C1930a.values().length];

        static {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r0 = com.facebook.ads.internal.p101q.p102a.C1931r.C1930a.values();
            r0 = r0.length;
            r0 = new int[r0];
            f5905a = r0;
            r0 = f5905a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.facebook.ads.internal.p101q.p102a.C1931r.C1930a.FULL_SCREEN;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.q.a.r.2.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.ads.internal.q.a.r$a */
    public enum C1930a {
        DEFAULT,
        FULL_SCREEN
    }

    public C1931r(View view) {
        this.f5909a = view;
        this.f5909a.setOnSystemUiVisibilityChangeListener(this);
    }

    /* renamed from: a */
    private void m7307a(int i, boolean z) {
        if (this.f5911c != null) {
            LayoutParams attributes = this.f5911c.getAttributes();
            if (z) {
                i |= attributes.flags;
            } else {
                i = (i ^ -1) & attributes.flags;
            }
            attributes.flags = i;
            this.f5911c.setAttributes(attributes);
        }
    }

    /* renamed from: a */
    private void m7309a(boolean z) {
        if (!C1930a.DEFAULT.equals(this.f5912d)) {
            int i = 3840;
            if (!z) {
                i = 3847;
            }
            Handler handler = this.f5909a.getHandler();
            if (handler != null && z) {
                handler.removeCallbacks(this.f5913e);
                handler.postDelayed(this.f5913e, 2000);
            }
            this.f5909a.setSystemUiVisibility(i);
        }
    }

    /* renamed from: a */
    public void m7310a() {
        this.f5911c = null;
    }

    /* renamed from: a */
    public void m7311a(Window window) {
        this.f5911c = window;
    }

    /* renamed from: a */
    public void m7312a(C1930a c1930a) {
        this.f5912d = c1930a;
        if (C19292.f5905a[this.f5912d.ordinal()] != 1) {
            m7307a(67108864, false);
            m7307a(134217728, false);
            this.f5909a.setSystemUiVisibility(0);
            return;
        }
        m7307a(67108864, true);
        m7307a(134217728, true);
        m7309a(false);
    }

    public void onSystemUiVisibilityChange(int i) {
        int i2 = this.f5910b ^ i;
        this.f5910b = i;
        if ((i2 & 2) != 0 && (i & 2) == 0) {
            m7309a(true);
        }
    }
}
