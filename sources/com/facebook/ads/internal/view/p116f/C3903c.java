package com.facebook.ads.internal.view.p116f;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings.System;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.facebook.ads.internal.p083b.C1762b;
import com.facebook.ads.internal.p083b.C1764c;
import com.facebook.ads.internal.p083b.C1764c.C1763a;
import com.facebook.ads.internal.p083b.C3792a;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1926p;
import com.facebook.ads.internal.p101q.p102a.C1935v;
import com.facebook.ads.internal.view.p116f.p117a.C2038a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.f.c */
public class C3903c implements C1926p<Bundle> {
    /* renamed from: a */
    private final String f15484a;
    /* renamed from: b */
    private boolean f15485b;
    /* renamed from: c */
    private final Context f15486c;
    /* renamed from: d */
    private final C1827c f15487d;
    /* renamed from: e */
    private final C2042a f15488e;
    /* renamed from: f */
    private final C3792a f15489f;
    /* renamed from: g */
    private int f15490g;
    /* renamed from: h */
    private int f15491h;
    /* renamed from: i */
    private final C2075e f15492i;
    /* renamed from: j */
    private final Map<String, String> f15493j;

    /* renamed from: com.facebook.ads.internal.view.f.c$a */
    public interface C2042a {
        /* renamed from: e */
        boolean mo1444e();

        /* renamed from: f */
        boolean mo1445f();

        int getCurrentPositionInMillis();

        boolean getGlobalVisibleRect(Rect rect);

        long getInitialBufferTime();

        int getMeasuredHeight();

        int getMeasuredWidth();

        C2038a getVideoStartReason();

        float getVolume();
    }

    /* renamed from: com.facebook.ads.internal.view.f.c$b */
    protected enum C2043b {
        PLAY(0),
        SKIP(1),
        TIME(2),
        MRC(3),
        PAUSE(4),
        RESUME(5),
        MUTE(6),
        UNMUTE(7),
        VIEWABLE_IMPRESSION(10);
        
        /* renamed from: j */
        public final int f6329j;

        private C2043b(int i) {
            this.f6329j = i;
        }
    }

    public C3903c(Context context, C1827c c1827c, C2042a c2042a, List<C1762b> list, String str) {
        this(context, c1827c, c2042a, list, str, null);
    }

    public C3903c(Context context, C1827c c1827c, C2042a c2042a, List<C1762b> list, String str, Bundle bundle) {
        this(context, c1827c, c2042a, list, str, bundle, null);
    }

    public C3903c(Context context, C1827c c1827c, C2042a c2042a, List<C1762b> list, String str, Bundle bundle, Map<String, String> map) {
        C2042a c2042a2 = c2042a;
        List<C1762b> list2 = list;
        Bundle bundle2 = bundle;
        this.f15485b = true;
        this.f15490g = 0;
        this.f15491h = 0;
        this.f15486c = context;
        this.f15487d = c1827c;
        this.f15488e = c2042a2;
        this.f15484a = str;
        this.f15493j = map;
        list2.add(new C1762b(this, 0.5d, -1.0d, 2.0d, true) {
            /* renamed from: a */
            final /* synthetic */ C3903c f15434a;

            /* renamed from: a */
            protected void mo1342a(boolean z, boolean z2, C1764c c1764c) {
                if (z2) {
                    this.f15434a.f15487d.mo1360e(this.f15434a.f15484a, this.f15434a.m19378a(C2043b.MRC));
                }
            }
        });
        list2.add(new C1762b(this, 1.0E-7d, -1.0d, 0.001d, false) {
            /* renamed from: a */
            final /* synthetic */ C3903c f15435a;

            /* renamed from: a */
            protected void mo1342a(boolean z, boolean z2, C1764c c1764c) {
                if (z2) {
                    this.f15435a.f15487d.mo1360e(this.f15435a.f15484a, this.f15435a.m19378a(C2043b.VIEWABLE_IMPRESSION));
                }
            }
        });
        if (bundle2 != null) {
            r9.f15489f = new C3792a((View) c2042a2, list2, bundle2.getBundle("adQualityManager"));
            r9.f15490g = bundle2.getInt("lastProgressTimeMS");
            r9.f15491h = bundle2.getInt("lastBoundaryTimeMS");
        } else {
            r9.f15489f = new C3792a((View) c2042a2, list2);
        }
        r9.f15492i = new C2075e(new Handler(), this);
    }

    /* renamed from: a */
    private Map<String, String> m19378a(C2043b c2043b) {
        return m19379a(c2043b, this.f15488e.getCurrentPositionInMillis());
    }

    /* renamed from: a */
    private Map<String, String> m19379a(C2043b c2043b, int i) {
        Map<String, String> c = m19388c(i);
        c.put("action", String.valueOf(c2043b.f6329j));
        return c;
    }

    /* renamed from: a */
    private void mo3983a() {
        this.f15487d.mo1360e(this.f15484a, m19378a(C2043b.MUTE));
    }

    /* renamed from: a */
    private void m19382a(int i, boolean z) {
        if (((double) i) > 0.0d) {
            if (i >= this.f15490g) {
                if (i > this.f15490g) {
                    this.f15489f.m18964a((double) (((float) (i - this.f15490g)) / 1000.0f), (double) m19396d());
                    this.f15490g = i;
                    if (i - this.f15491h >= 5000) {
                        this.f15487d.mo1360e(this.f15484a, m19379a(C2043b.TIME, i));
                        this.f15491h = this.f15490g;
                        this.f15489f.m18963a();
                        return;
                    }
                }
                if (z) {
                    this.f15487d.mo1360e(this.f15484a, m19379a(C2043b.TIME, i));
                }
            }
        }
    }

    /* renamed from: a */
    private void m19383a(HashMap<String, String> hashMap) {
        if (this.f15493j != null) {
            hashMap.putAll(this.f15493j);
        }
    }

    /* renamed from: a */
    private void m19384a(Map<String, String> map) {
        map.put("exoplayer", String.valueOf(this.f15488e.mo1444e()));
        map.put("prep", Long.toString(this.f15488e.getInitialBufferTime()));
    }

    /* renamed from: a */
    private void m19385a(Map<String, String> map, int i) {
        map.put("ptime", String.valueOf(((float) this.f15491h) / 1000.0f));
        map.put("time", String.valueOf(((float) i) / 1000.0f));
    }

    /* renamed from: b */
    private void m19387b(Map<String, String> map) {
        C1764c c = this.f15489f.m18966c();
        C1763a c2 = c.m6661c();
        map.put("vwa", String.valueOf(c2.m6652d()));
        map.put("vwm", String.valueOf(c2.m6651c()));
        map.put("vwmax", String.valueOf(c2.m6653e()));
        map.put("vtime_ms", String.valueOf(c2.m6655g() * 1000.0d));
        map.put("mcvt_ms", String.valueOf(c2.m6656h() * 1000.0d));
        C1763a d = c.m6662d();
        map.put("vla", String.valueOf(d.m6652d()));
        map.put("vlm", String.valueOf(d.m6651c()));
        map.put("vlmax", String.valueOf(d.m6653e()));
        map.put("atime_ms", String.valueOf(d.m6655g() * 1000.0d));
        map.put("mcat_ms", String.valueOf(d.m6656h() * 1000.0d));
    }

    /* renamed from: c */
    private Map<String, String> m19388c(int i) {
        HashMap hashMap = new HashMap();
        C1935v.m7324a(hashMap, this.f15488e.getVideoStartReason() == C2038a.AUTO_STARTED, this.f15488e.mo1445f() ^ true);
        m19384a((Map) hashMap);
        m19387b((Map) hashMap);
        m19385a((Map) hashMap, i);
        m19389c((Map) hashMap);
        m19383a(hashMap);
        return hashMap;
    }

    /* renamed from: c */
    private void m19389c(Map<String, String> map) {
        Rect rect = new Rect();
        this.f15488e.getGlobalVisibleRect(rect);
        map.put("pt", String.valueOf(rect.top));
        map.put("pl", String.valueOf(rect.left));
        map.put("ph", String.valueOf(this.f15488e.getMeasuredHeight()));
        map.put("pw", String.valueOf(this.f15488e.getMeasuredWidth()));
        WindowManager windowManager = (WindowManager) this.f15486c.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        map.put("vph", String.valueOf(displayMetrics.heightPixels));
        map.put("vpw", String.valueOf(displayMetrics.widthPixels));
    }

    /* renamed from: k */
    private void m19390k() {
        this.f15487d.mo1360e(this.f15484a, m19378a(C2043b.UNMUTE));
    }

    /* renamed from: a */
    void m19391a(int i) {
        m19382a(i, false);
    }

    /* renamed from: a */
    void m19392a(int i, int i2) {
        m19382a(i, true);
        this.f15491h = i2;
        this.f15490g = i2;
        this.f15489f.m18963a();
        this.f15489f.m18965b();
    }

    /* renamed from: b */
    public void m19393b() {
        this.f15486c.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this.f15492i);
    }

    /* renamed from: b */
    public void m19394b(int i) {
        m19382a(i, true);
        this.f15491h = 0;
        this.f15490g = 0;
        this.f15489f.m18963a();
        this.f15489f.m18965b();
    }

    /* renamed from: c */
    public void m19395c() {
        this.f15486c.getContentResolver().unregisterContentObserver(this.f15492i);
    }

    /* renamed from: d */
    protected float m19396d() {
        return C1935v.m7323a(this.f15486c) * this.f15488e.getVolume();
    }

    /* renamed from: e */
    void m19397e() {
        boolean z;
        if (((double) m19396d()) < 0.05d) {
            if (this.f15485b) {
                mo3983a();
                z = false;
            } else {
                return;
            }
        } else if (!this.f15485b) {
            m19390k();
            z = true;
        } else {
            return;
        }
        this.f15485b = z;
    }

    /* renamed from: f */
    void m19398f() {
        this.f15487d.mo1360e(this.f15484a, m19378a(C2043b.SKIP));
    }

    /* renamed from: g */
    void m19399g() {
        this.f15487d.mo1360e(this.f15484a, m19378a(C2043b.PAUSE));
    }

    /* renamed from: h */
    void m19400h() {
        this.f15487d.mo1360e(this.f15484a, m19378a(C2043b.RESUME));
    }

    /* renamed from: i */
    public Bundle mo1347i() {
        m19392a(m19402j(), m19402j());
        Bundle bundle = new Bundle();
        bundle.putInt("lastProgressTimeMS", this.f15490g);
        bundle.putInt("lastBoundaryTimeMS", this.f15491h);
        bundle.putBundle("adQualityManager", this.f15489f.mo1347i());
        return bundle;
    }

    /* renamed from: j */
    public int m19402j() {
        return this.f15490g;
    }
}
