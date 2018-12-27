package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.gmsg.zzac;
import com.google.android.gms.ads.internal.gmsg.zzf;
import com.google.android.gms.ads.internal.zzbb;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@zzaer
public final class zzadm {
    /* renamed from: a */
    private final Object f8522a = new Object();
    /* renamed from: b */
    private final Context f8523b;
    /* renamed from: c */
    private final zzck f8524c;
    /* renamed from: d */
    private final zzakn f8525d;
    /* renamed from: e */
    private final zzoj f8526e;
    /* renamed from: f */
    private final zzbb f8527f;
    /* renamed from: g */
    private OnGlobalLayoutListener f8528g;
    /* renamed from: h */
    private OnScrollChangedListener f8529h;
    /* renamed from: i */
    private final DisplayMetrics f8530i;
    /* renamed from: j */
    private zzanp f8531j;
    @GuardedBy("mLock")
    /* renamed from: k */
    private int f8532k = -1;
    @GuardedBy("mLock")
    /* renamed from: l */
    private int f8533l = -1;

    public zzadm(Context context, zzck zzck, zzakn zzakn, zzoj zzoj, zzbb zzbb) {
        this.f8523b = context;
        this.f8524c = zzck;
        this.f8525d = zzakn;
        this.f8526e = zzoj;
        this.f8527f = zzbb;
        this.f8531j = new zzanp(200);
        zzbv.zzek();
        this.f8530i = zzalo.m9777a((WindowManager) context.getSystemService("window"));
    }

    /* renamed from: a */
    private final void m9488a(zzasg zzasg, boolean z) {
        zzasg.mo4740a("/video", zzf.zzbpi);
        zzasg.mo4740a("/videoMeta", zzf.zzbpj);
        zzasg.mo4740a("/precache", new zzarv());
        zzasg.mo4740a("/delayPageLoaded", zzf.zzbpm);
        zzasg.mo4740a("/instrument", zzf.zzbpk);
        zzasg.mo4740a("/log", zzf.zzbpd);
        zzasg.mo4740a("/videoClicked", zzf.zzbpe);
        zzasg.mo4740a("/trackActiveViewUnit", new aj(this));
        zzasg.mo4740a("/untrackActiveViewUnit", new ak(this));
        if (z) {
            zzasg.mo4740a("/open", new zzac(null, null));
        }
    }

    /* renamed from: a */
    private final OnGlobalLayoutListener m9484a(WeakReference<zzasg> weakReference) {
        if (this.f8528g == null) {
            this.f8528g = new al(this, weakReference);
        }
        return this.f8528g;
    }

    /* renamed from: b */
    private final OnScrollChangedListener m9490b(WeakReference<zzasg> weakReference) {
        if (this.f8529h == null) {
            this.f8529h = new am(this, weakReference);
        }
        return this.f8529h;
    }

    /* renamed from: a */
    private final void m9489a(WeakReference<zzasg> weakReference, boolean z) {
        if (weakReference != null) {
            zzasg zzasg = (zzasg) weakReference.get();
            if (zzasg != null) {
                if (zzasg.getView() != null) {
                    if (!z || this.f8531j.m9930a()) {
                        int[] iArr = new int[2];
                        zzasg.getView().getLocationOnScreen(iArr);
                        zzkd.m10709a();
                        int b = zzaoa.m9963b(this.f8530i, iArr[0]);
                        zzkd.m10709a();
                        int b2 = zzaoa.m9963b(this.f8530i, iArr[1]);
                        synchronized (this.f8522a) {
                            if (!(this.f8532k == b && this.f8533l == b2)) {
                                this.f8532k = b;
                                this.f8533l = b2;
                                zzasg.mo4782u().mo2391a(this.f8532k, this.f8533l, z ^ true);
                            }
                        }
                    }
                }
            }
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    private final zzasg m9486a() {
        zzbv.zzel();
        return zzasm.m10092a(this.f8523b, zzatt.m10128a(), "native-video", false, false, this.f8524c, this.f8525d.f8806a.f19743k, this.f8526e, null, this.f8527f.zzbi(), this.f8525d.f8814i);
    }

    /* renamed from: a */
    final /* synthetic */ void m9492a(boolean z, zzaps zzaps, String str, String str2) {
        try {
            zzasg a = m9486a();
            if (z) {
                a.mo4737a(zzatt.m10132c());
            } else {
                a.mo4737a(zzatt.m10131b());
            }
            this.f8527f.zzf(a);
            WeakReference weakReference = new WeakReference(a);
            a.mo4782u().mo2392a(m9484a(weakReference), m9490b(weakReference));
            m9488a(a, z);
            a.mo4782u().mo2393a(new ag(this, zzaps, a));
            a.mo4742a(str, str2, null);
        } catch (boolean z2) {
            zzaok.m10004c("Exception occurred while getting video view", z2);
            zzaps.m21290b(null);
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m9491a(zzaps zzaps, zzasg zzasg, boolean z) {
        this.f8527f.zzdx();
        zzaps.m21290b(zzasg);
    }

    /* renamed from: a */
    final /* synthetic */ void m9493a(boolean z, JSONObject jSONObject, zzaps zzaps) {
        try {
            zzasg a = m9486a();
            if (z) {
                a.mo4737a(zzatt.m10132c());
            } else {
                a.mo4737a(zzatt.m10131b());
            }
            this.f8527f.zzf(a);
            WeakReference weakReference = new WeakReference(a);
            a.mo4782u().mo2392a(m9484a(weakReference), m9490b(weakReference));
            m9488a(a, z);
            a.mo4782u().mo2394a(new ah(a, jSONObject));
            a.mo4782u().mo2393a(new ai(this, zzaps, a));
            a.loadUrl((String) zzkd.m10713e().m10897a(zznw.bx));
        } catch (boolean z2) {
            zzaok.m10004c("Exception occurred while getting video view", z2);
            zzaps.m21290b(false);
        }
    }

    /* renamed from: b */
    final /* synthetic */ void m9494b(zzaps zzaps, zzasg zzasg, boolean z) {
        this.f8527f.zzdx();
        zzaps.m21290b(zzasg);
    }
}
