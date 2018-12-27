package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import org.json.JSONObject;

public final class zzaat extends zzaao {
    /* renamed from: a */
    private final zzaut f19665a;

    public zzaat(zzaut zzaut) {
        this.f19665a = zzaut;
    }

    /* renamed from: a */
    public final void mo2194a(String str, String str2, Bundle bundle, IObjectWrapper iObjectWrapper, zzaaf zzaaf, zzyt zzyt, zzjo zzjo) {
        try {
            zzaup c4091d = new C4091d(this, zzaaf, zzyt);
            zzaaf = this.f19665a;
            zzyt = new zzaus((Context) ObjectWrapper.m26020a(iObjectWrapper), str, m26138b(str2), bundle);
            zzc.zza(zzjo.f20231e, zzjo.f20228b, zzjo.f20227a);
            c4091d.mo1941a(String.valueOf(zzaaf.getClass().getSimpleName()).concat(" does not support banner ads."));
        } catch (String str3) {
            zzaok.m10002b("Adapter failed to render banner ad.", str3);
            str3 = new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo2195a(String str, String str2, Bundle bundle, IObjectWrapper iObjectWrapper, zzaah zzaah, zzyt zzyt) {
        try {
            zzaup c4092e = new C4092e(this, zzaah, zzyt);
            zzaah = this.f19665a;
            zzyt = new zzaus((Context) ObjectWrapper.m26020a(iObjectWrapper), str, m26138b(str2), bundle);
            c4092e.mo1941a(String.valueOf(zzaah.getClass().getSimpleName()).concat(" does not support interstitial ads."));
        } catch (String str3) {
            zzaok.m10002b("Adapter failed to render interstitial ad.", str3);
            str3 = new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo2197a(String str, String str2, Bundle bundle, IObjectWrapper iObjectWrapper, zzaal zzaal, zzyt zzyt) {
        try {
            zzaup c4093f = new C4093f(this, zzaal, zzyt);
            zzaal = this.f19665a;
            zzyt = new zzaus((Context) ObjectWrapper.m26020a(iObjectWrapper), str, m26138b(str2), bundle);
            c4093f.mo1941a(String.valueOf(zzaal.getClass().getSimpleName()).concat(" does not support rewarded ads."));
        } catch (String str3) {
            zzaok.m10002b("Adapter failed to render rewarded ad.", str3);
            str3 = new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo2196a(String str, String str2, Bundle bundle, IObjectWrapper iObjectWrapper, zzaaj zzaaj, zzyt zzyt) {
        try {
            zzaup c4094g = new C4094g(this, zzaaj, zzyt);
            zzaaj = this.f19665a;
            zzyt = new zzaus((Context) ObjectWrapper.m26020a(iObjectWrapper), str, m26138b(str2), bundle);
            c4094g.mo1941a(String.valueOf(zzaaj.getClass().getSimpleName()).concat(" does not support native ads."));
        } catch (String str3) {
            zzaok.m10002b("Adapter failed to render rewarded ad.", str3);
            str3 = new RemoteException();
        }
    }

    /* renamed from: d */
    public final void mo2201d() {
        zzauq zzauq = null;
        try {
            zzauq.m10166a();
        } catch (Throwable th) {
            zzaok.m10002b("", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    /* renamed from: e */
    public final void mo2202e() {
        zzaur zzaur = null;
        try {
            zzaur.m10167a();
        } catch (Throwable th) {
            zzaok.m10002b("", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    /* renamed from: c */
    public final zzly mo2200c() {
        if (!(this.f19665a instanceof zzb)) {
            return null;
        }
        try {
            return ((zzb) this.f19665a).getVideoController();
        } catch (Throwable th) {
            zzaok.m10002b("", th);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo2193a(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzjo zzjo, zzaaq zzaaq) {
        try {
            Object c2437h = new C2437h(this, zzaaq);
            this.f19665a.m10170a(new zzauu((Context) ObjectWrapper.m26020a(iObjectWrapper), new zza(m26137a(str), bundle2), bundle, zzc.zza(zzjo.f20231e, zzjo.f20228b, zzjo.f20227a)), c2437h);
        } catch (IObjectWrapper iObjectWrapper2) {
            zzaok.m10002b("Error generating signals for RTB", iObjectWrapper2);
            iObjectWrapper2 = new RemoteException();
        }
    }

    /* renamed from: a */
    public final zzaaz mo2191a() {
        return zzaaz.m26151a(this.f19665a.m10171b());
    }

    /* renamed from: b */
    public final zzaaz mo2199b() {
        return zzaaz.m26151a(this.f19665a.m10168a());
    }

    /* renamed from: a */
    public final void mo2192a(IObjectWrapper iObjectWrapper) {
        this.f19665a.m10169a((Context) ObjectWrapper.m26020a(iObjectWrapper));
    }

    /* renamed from: a */
    public final void mo2198a(java.lang.String[] r6, android.os.Bundle[] r7) {
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
        r5 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = 0;
    L_0x0006:
        r2 = r6.length;	 Catch:{ IndexOutOfBoundsException -> 0x001d }
        if (r1 >= r2) goto L_0x001c;	 Catch:{ IndexOutOfBoundsException -> 0x001d }
    L_0x0009:
        r2 = new com.google.android.gms.ads.mediation.zza;	 Catch:{ IndexOutOfBoundsException -> 0x001d }
        r3 = r6[r1];	 Catch:{ IndexOutOfBoundsException -> 0x001d }
        r3 = m26137a(r3);	 Catch:{ IndexOutOfBoundsException -> 0x001d }
        r4 = r7[r1];	 Catch:{ IndexOutOfBoundsException -> 0x001d }
        r2.<init>(r3, r4);	 Catch:{ IndexOutOfBoundsException -> 0x001d }
        r0.add(r2);	 Catch:{ IndexOutOfBoundsException -> 0x001d }
        r1 = r1 + 1;
        goto L_0x0006;
    L_0x001c:
        return;
    L_0x001d:
        r6 = new android.os.RemoteException;
        r6.<init>();
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaat.a(java.lang.String[], android.os.Bundle[]):void");
    }

    /* renamed from: a */
    private static int m26137a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1396342996) {
            if (hashCode != -1052618729) {
                if (hashCode != -239580146) {
                    if (hashCode == 604727084) {
                        if (str.equals("interstitial") != null) {
                            str = true;
                            switch (str) {
                                case null:
                                    return com.google.android.gms.ads.zza.zzuq;
                                case 1:
                                    return com.google.android.gms.ads.zza.zzur;
                                case 2:
                                    return com.google.android.gms.ads.zza.zzus;
                                case 3:
                                    return com.google.android.gms.ads.zza.zzut;
                                default:
                                    throw new IllegalArgumentException("Internal Error");
                            }
                        }
                    }
                } else if (str.equals("rewarded") != null) {
                    str = 2;
                    switch (str) {
                        case null:
                            return com.google.android.gms.ads.zza.zzuq;
                        case 1:
                            return com.google.android.gms.ads.zza.zzur;
                        case 2:
                            return com.google.android.gms.ads.zza.zzus;
                        case 3:
                            return com.google.android.gms.ads.zza.zzut;
                        default:
                            throw new IllegalArgumentException("Internal Error");
                    }
                }
            } else if (str.equals("native") != null) {
                str = 3;
                switch (str) {
                    case null:
                        return com.google.android.gms.ads.zza.zzuq;
                    case 1:
                        return com.google.android.gms.ads.zza.zzur;
                    case 2:
                        return com.google.android.gms.ads.zza.zzus;
                    case 3:
                        return com.google.android.gms.ads.zza.zzut;
                    default:
                        throw new IllegalArgumentException("Internal Error");
                }
            }
        } else if (str.equals("banner") != null) {
            str = null;
            switch (str) {
                case null:
                    return com.google.android.gms.ads.zza.zzuq;
                case 1:
                    return com.google.android.gms.ads.zza.zzur;
                case 2:
                    return com.google.android.gms.ads.zza.zzus;
                case 3:
                    return com.google.android.gms.ads.zza.zzut;
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        }
        str = -1;
        switch (str) {
            case null:
                return com.google.android.gms.ads.zza.zzuq;
            case 1:
                return com.google.android.gms.ads.zza.zzur;
            case 2:
                return com.google.android.gms.ads.zza.zzus;
            case 3:
                return com.google.android.gms.ads.zza.zzut;
            default:
                throw new IllegalArgumentException("Internal Error");
        }
    }

    /* renamed from: b */
    private static Bundle m26138b(String str) {
        String str2 = "Server parameters: ";
        String valueOf = String.valueOf(str);
        zzaok.m10007e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            str = new Bundle();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str3 = (String) keys.next();
                str.putString(str3, jSONObject.getString(str3));
            }
            return str;
        } catch (String str4) {
            zzaok.m10002b("", str4);
            throw new RemoteException();
        }
    }
}
