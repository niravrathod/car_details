package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@zzaer
@ParametersAreNonnullByDefault
public final class zzow implements OnClickListener {
    /* renamed from: a */
    String f9756a;
    /* renamed from: b */
    Long f9757b;
    /* renamed from: c */
    WeakReference<View> f9758c;
    /* renamed from: d */
    private final zzadw f9759d;
    /* renamed from: e */
    private zzsc f9760e;
    /* renamed from: f */
    private zzu f9761f;

    public zzow(zzadw zzadw) {
        this.f9759d = zzadw;
    }

    /* renamed from: a */
    public final void m10946a(zzsc zzsc) {
        this.f9760e = zzsc;
        if (this.f9761f != null) {
            this.f9759d.mo2226b("/unconfirmedClick", this.f9761f);
        }
        this.f9761f = new sr(this);
        this.f9759d.mo2223a("/unconfirmedClick", this.f9761f);
    }

    /* renamed from: a */
    public final zzsc m10945a() {
        return this.f9760e;
    }

    /* renamed from: b */
    public final void m10947b() {
        if (this.f9760e != null && this.f9757b != null) {
            m10944c();
            try {
                this.f9760e.mo2689a();
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void onClick(View view) {
        if (this.f9758c != null) {
            if (this.f9758c.get() == view) {
                if (this.f9756a != null) {
                    if (this.f9757b != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(FacebookAdapter.KEY_ID, this.f9756a);
                            jSONObject.put("time_interval", zzbv.zzer().currentTimeMillis() - this.f9757b.longValue());
                            jSONObject.put("messageType", "onePointFiveClick");
                            this.f9759d.mo2224a("sendMessageToNativeJs", jSONObject);
                        } catch (View view2) {
                            zzaok.m10002b("Unable to dispatch sendMessageToNativeJs event", view2);
                        }
                    }
                }
                m10944c();
            }
        }
    }

    /* renamed from: c */
    private final void m10944c() {
        this.f9756a = null;
        this.f9757b = null;
        if (this.f9758c != null) {
            View view = (View) this.f9758c.get();
            this.f9758c = null;
            if (view != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
            }
        }
    }
}
