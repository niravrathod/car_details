package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public final class zzabt {
    /* renamed from: a */
    private static final Object f8503a = new Object();
    @GuardedBy("sLock")
    @VisibleForTesting
    /* renamed from: b */
    private static boolean f8504b = false;
    @GuardedBy("sLock")
    @VisibleForTesting
    /* renamed from: c */
    private static boolean f8505c = false;
    @VisibleForTesting
    /* renamed from: d */
    private zzauz f8506d;

    /* renamed from: a */
    public final boolean m9454a(Context context) {
        synchronized (f8503a) {
            if (!((Boolean) zzkd.m10713e().m10897a(zznw.cy)).booleanValue()) {
                return false;
            } else if (f8504b) {
                return true;
            } else {
                try {
                    m9449c(context);
                    context = this.f8506d.mo2415a(ObjectWrapper.m26019a((Object) context));
                    f8504b = context;
                    return context;
                } catch (Context context2) {
                    zzaok.m10006d("#007 Could not call remote method.", context2);
                    return false;
                }
            }
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    private final void m9449c(Context context) {
        synchronized (f8503a) {
            if (((Boolean) zzkd.m10713e().m10897a(zznw.cy)).booleanValue() && !f8505c) {
                try {
                    f8505c = true;
                    this.f8506d = (zzauz) zzaol.m10010a(context, "com.google.android.gms.ads.omid.DynamiteOmid", C4100q.f16608a);
                } catch (Context context2) {
                    zzaok.m10006d("#007 Could not call remote method.", context2);
                }
            }
        }
    }

    /* renamed from: b */
    public final String m9455b(Context context) {
        if (!((Boolean) zzkd.m10713e().m10897a(zznw.cy)).booleanValue()) {
            return null;
        }
        try {
            m9449c(context);
            context = "a.";
            String valueOf = String.valueOf(this.f8506d.mo2413a());
            return valueOf.length() != 0 ? context.concat(valueOf) : new String(context);
        } catch (Context context2) {
            zzaok.m10006d("#007 Could not call remote method.", context2);
            return null;
        }
    }

    /* renamed from: a */
    public final IObjectWrapper m9450a(String str, WebView webView, String str2, String str3, String str4) {
        return m9451a(str, webView, str2, str3, str4, "Google");
    }

    /* renamed from: a */
    public final IObjectWrapper m9451a(String str, WebView webView, String str2, String str3, String str4, String str5) {
        Throwable e;
        synchronized (f8503a) {
            zzabt zzabt;
            try {
                if (((Boolean) zzkd.m10713e().m10897a(zznw.cy)).booleanValue()) {
                    if (f8504b) {
                        try {
                            return this.f8506d.mo2412a(str, ObjectWrapper.m26019a((Object) webView), str2, str3, str4, str5);
                        } catch (Throwable e2) {
                            zzaok.m10006d("#007 Could not call remote method.", e2);
                            return null;
                        }
                    }
                }
                zzabt = this;
                return null;
            } catch (Throwable th) {
                e2 = th;
                throw e2;
            }
        }
    }

    /* renamed from: a */
    public final void m9452a(IObjectWrapper iObjectWrapper) {
        synchronized (f8503a) {
            if (((Boolean) zzkd.m10713e().m10897a(zznw.cy)).booleanValue()) {
                if (f8504b) {
                    try {
                        this.f8506d.mo2416b(iObjectWrapper);
                        return;
                    } catch (IObjectWrapper iObjectWrapper2) {
                        zzaok.m10006d("#007 Could not call remote method.", iObjectWrapper2);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void m9456b(IObjectWrapper iObjectWrapper) {
        synchronized (f8503a) {
            if (((Boolean) zzkd.m10713e().m10897a(zznw.cy)).booleanValue()) {
                if (f8504b) {
                    try {
                        this.f8506d.mo2417c(iObjectWrapper);
                        return;
                    } catch (IObjectWrapper iObjectWrapper2) {
                        zzaok.m10006d("#007 Could not call remote method.", iObjectWrapper2);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m9453a(IObjectWrapper iObjectWrapper, View view) {
        synchronized (f8503a) {
            if (((Boolean) zzkd.m10713e().m10897a(zznw.cy)).booleanValue()) {
                if (f8504b) {
                    try {
                        this.f8506d.mo2414a(iObjectWrapper, ObjectWrapper.m26019a((Object) view));
                        return;
                    } catch (IObjectWrapper iObjectWrapper2) {
                        zzaok.m10006d("#007 Could not call remote method.", iObjectWrapper2);
                        return;
                    }
                }
            }
        }
    }
}
