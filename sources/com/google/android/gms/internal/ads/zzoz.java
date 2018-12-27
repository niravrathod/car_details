package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzoz extends zztl implements OnGlobalLayoutListener, OnScrollChangedListener, zzpo {
    /* renamed from: a */
    private zzasg f20268a;
    /* renamed from: b */
    private zzpm f20269b;
    /* renamed from: c */
    private boolean f20270c = false;
    /* renamed from: d */
    private boolean f20271d = false;

    public zzoz(zzasg zzasg) {
        this.f20268a = zzasg;
    }

    /* renamed from: a */
    public final String mo4262a() {
        return "";
    }

    /* renamed from: b */
    public final String mo4265b() {
        return "";
    }

    /* renamed from: c */
    public final zzov mo4266c() {
        return null;
    }

    /* renamed from: a */
    public final void mo4264a(zzpm zzpm) {
        this.f20269b = zzpm;
    }

    /* renamed from: d */
    public final View mo4267d() {
        return this.f20268a == null ? null : this.f20268a.getView();
    }

    public final void onGlobalLayout() {
        m26678h();
    }

    public final void onScrollChanged() {
        m26678h();
    }

    /* renamed from: a */
    public final void mo4263a(IObjectWrapper iObjectWrapper, zztm zztm) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.f20270c) {
            zzaok.m10003c("Instream ad is destroyed already.");
            m26676a(zztm, 2);
        } else if (this.f20268a.mo4198b() == null) {
            zzaok.m10003c("Instream internal error: can not get video controller.");
            m26676a(zztm, (int) null);
        } else if (this.f20271d) {
            zzaok.m10003c("Instream ad should not be used again.");
            m26676a(zztm, 1);
        } else {
            this.f20271d = true;
            m26677g();
            ((ViewGroup) ObjectWrapper.m26020a(iObjectWrapper)).addView(this.f20268a.getView(), new LayoutParams(-1, -1));
            zzbv.zzfi();
            zzaqa.m10047a(this.f20268a.getView(), (OnGlobalLayoutListener) this);
            zzbv.zzfi();
            zzaqa.m10048a(this.f20268a.getView(), (OnScrollChangedListener) this);
            m26678h();
            try {
                zztm.mo2744a();
            } catch (IObjectWrapper iObjectWrapper2) {
                zzaok.m10006d("#007 Could not call remote method.", iObjectWrapper2);
            }
        }
    }

    /* renamed from: e */
    public final zzly mo4268e() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.f20270c) {
            zzaok.m10003c("Instream ad is destroyed already.");
            return null;
        } else if (this.f20268a == null) {
            return null;
        } else {
            return this.f20268a.mo4198b();
        }
    }

    /* renamed from: f */
    public final void mo4269f() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.f20270c) {
            m26677g();
            if (this.f20269b != null) {
                this.f20269b.mo2606l();
                this.f20269b.mo2605k();
            }
            this.f20269b = null;
            this.f20268a = null;
            this.f20270c = true;
        }
    }

    /* renamed from: g */
    private final void m26677g() {
        if (this.f20268a != null) {
            ViewParent parent = this.f20268a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView((View) this.f20268a);
            }
        }
    }

    /* renamed from: h */
    private final void m26678h() {
        if (this.f20269b != null && this.f20268a != null) {
            this.f20269b.mo2599c(this.f20268a.getView(), Collections.emptyMap());
        }
    }

    /* renamed from: a */
    private static void m26676a(zztm zztm, int i) {
        try {
            zztm.mo2745a(i);
        } catch (zztm zztm2) {
            zzaok.m10006d("#007 Could not call remote method.", zztm2);
        }
    }
}
