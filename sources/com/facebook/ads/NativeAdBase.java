package com.facebook.ads;

import android.content.Context;
import android.view.View;
import com.facebook.ads.internal.adapters.ai;
import com.facebook.ads.internal.p095n.C1837d;
import com.facebook.ads.internal.p095n.C1837d.C1836c;
import com.facebook.ads.internal.p095n.C1838e;
import com.facebook.ads.internal.p095n.C1839f;
import com.facebook.ads.internal.protocol.C1900f;
import com.facebook.ads.internal.view.hscroll.C4861b;

public abstract class NativeAdBase implements C1699a {
    /* renamed from: a */
    private final C1837d f15070a;

    public enum MediaCacheFlag {
        NONE(C1838e.NONE),
        ALL(C1838e.ALL);
        
        /* renamed from: a */
        private final C1838e f5111a;

        private MediaCacheFlag(C1838e c1838e) {
            this.f5111a = c1838e;
        }

        /* renamed from: a */
        C1838e m6426a() {
            return this.f5111a;
        }
    }

    /* renamed from: com.facebook.ads.NativeAdBase$a */
    public static class C1696a {
        /* renamed from: a */
        private final C1839f f5112a;

        C1696a(C1839f c1839f) {
            this.f5112a = c1839f;
        }
    }

    /* renamed from: com.facebook.ads.NativeAdBase$1 */
    static class C37521 implements C1836c {
        C37521() {
        }

        /* renamed from: a */
        public boolean mo1296a(View view) {
            if (!((view instanceof MediaViewVideoRenderer) || (view instanceof AdChoicesView))) {
                if (!(view instanceof C4861b)) {
                    return false;
                }
            }
            return true;
        }
    }

    public NativeAdBase(Context context, String str) {
        this.f15070a = new C1837d(context, str, m18719f());
    }

    NativeAdBase(C1837d c1837d) {
        this.f15070a = c1837d;
    }

    /* renamed from: f */
    public static C1836c m18719f() {
        return new C37521();
    }

    /* renamed from: a */
    void m18720a(AdIconView adIconView) {
        if (adIconView != null) {
            this.f15070a.m7001c(true);
        }
    }

    /* renamed from: a */
    void m18721a(MediaView mediaView) {
        if (mediaView != null) {
            this.f15070a.m7000b(true);
        }
    }

    /* renamed from: a */
    public void m18722a(MediaCacheFlag mediaCacheFlag) {
        this.f15070a.m6994a(mediaCacheFlag.m6426a(), null);
    }

    /* renamed from: a */
    void m18723a(C1900f c1900f) {
        this.f15070a.m6995a(c1900f);
    }

    /* renamed from: g */
    C1837d m18724g() {
        return this.f15070a;
    }

    /* renamed from: h */
    ai m18725h() {
        return this.f15070a.m6990a();
    }

    /* renamed from: i */
    public void m18726i() {
        m18722a(MediaCacheFlag.ALL);
    }

    /* renamed from: j */
    public void m18727j() {
        this.f15070a.m6999b();
    }

    /* renamed from: k */
    public C1696a m18728k() {
        return this.f15070a.m7004e() == null ? null : new C1696a(this.f15070a.m7004e());
    }

    /* renamed from: l */
    public C1703i m18729l() {
        return this.f15070a.m7005f() == null ? null : new C1703i(this.f15070a.m7005f());
    }

    /* renamed from: m */
    public String m18730m() {
        return this.f15070a.m7006g();
    }

    /* renamed from: n */
    public String m18731n() {
        return this.f15070a.m7007h();
    }

    /* renamed from: o */
    public String m18732o() {
        return this.f15070a.m7008i();
    }

    /* renamed from: p */
    String m18733p() {
        return this.f15070a.m7014o();
    }

    /* renamed from: q */
    public void m18734q() {
        this.f15070a.m7015p();
    }

    /* renamed from: r */
    public void m18735r() {
        this.f15070a.m7016q();
    }
}
