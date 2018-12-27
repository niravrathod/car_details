package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzbv extends zzah {
    /* renamed from: a */
    private final zzfa f20678a;
    /* renamed from: b */
    private Boolean f20679b;
    /* renamed from: c */
    private String f20680c;

    public zzbv(zzfa zzfa) {
        this(zzfa, null);
    }

    private zzbv(zzfa zzfa, String str) {
        Preconditions.checkNotNull(zzfa);
        this.f20678a = zzfa;
        this.f20680c = null;
    }

    /* renamed from: b */
    public final void mo3190b(zzh zzh) {
        m27310b(zzh, false);
        m27308a(new C2495u(this, zzh));
    }

    /* renamed from: a */
    public final void mo3183a(zzad zzad, zzh zzh) {
        Preconditions.checkNotNull(zzad);
        m27310b(zzh, false);
        m27308a(new af(this, zzad, zzh));
    }

    @VisibleForTesting
    /* renamed from: b */
    final zzad m27324b(zzad zzad, zzh zzh) {
        Object obj = null;
        if ("_cmp".equals(zzad.f20674a) && zzad.f20675b != null) {
            if (zzad.f20675b.m27301a() != 0) {
                CharSequence d = zzad.f20675b.m27306d("_cis");
                if (!TextUtils.isEmpty(d) && (("referrer broadcast".equals(d) || "referrer API".equals(d)) && this.f20678a.m22794b().m27363m(zzh.f20689a) != null)) {
                    obj = 1;
                }
            }
        }
        if (obj == null) {
            return zzad;
        }
        this.f20678a.mo3172r().m28553v().m12355a("Event has been filtered ", zzad.toString());
        return new zzad("_cmpx", zzad.f20675b, zzad.f20676c, zzad.f20677d);
    }

    /* renamed from: a */
    public final void mo3184a(zzad zzad, String str, String str2) {
        Preconditions.checkNotNull(zzad);
        Preconditions.checkNotEmpty(str);
        m27309a(str, true);
        m27308a(new ag(this, zzad, str));
    }

    /* renamed from: a */
    public final byte[] mo3189a(zzad zzad, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzad);
        m27309a(str, true);
        this.f20678a.mo3172r().m28554w().m12355a("Log and bundle. event", this.f20678a.m22806g().m28503a(zzad.f20674a));
        long nanoTime = this.f20678a.mo3169m().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f20678a.mo3171q().m28569b(new ah(this, zzad, str)).get();
            if (bArr == null) {
                this.f20678a.mo3172r().v_().m12355a("Log and bundle returned null. appId", zzap.m28525a(str));
                bArr = new byte[0];
            }
            this.f20678a.mo3172r().m28554w().m12357a("Log and bundle processed. event, size, time_ms", this.f20678a.m22806g().m28503a(zzad.f20674a), Integer.valueOf(bArr.length), Long.valueOf((this.f20678a.mo3169m().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e) {
            this.f20678a.mo3172r().v_().m12357a("Failed to log and bundle. appId, event, error", zzap.m28525a(str), this.f20678a.m22806g().m28503a(zzad.f20674a), e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo3185a(zzfh zzfh, zzh zzh) {
        Preconditions.checkNotNull(zzfh);
        m27310b(zzh, false);
        if (zzfh.m27328a() == null) {
            m27308a(new ai(this, zzfh, zzh));
        } else {
            m27308a(new aj(this, zzfh, zzh));
        }
    }

    /* renamed from: a */
    public final List<zzfh> mo3177a(zzh zzh, boolean z) {
        m27310b(zzh, false);
        try {
            List<cm> list = (List) this.f20678a.mo3171q().m28566a(new ak(this, zzh)).get();
            List<zzfh> arrayList = new ArrayList(list.size());
            for (cm cmVar : list) {
                if (z || !zzfk.m28606e(cmVar.f10571c)) {
                    arrayList.add(new zzfh(cmVar));
                }
            }
            return arrayList;
        } catch (boolean z2) {
            this.f20678a.mo3172r().v_().m12356a("Failed to get user attributes. appId", zzap.m28525a(zzh.f20689a), z2);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo3186a(zzh zzh) {
        m27310b(zzh, false);
        m27308a(new al(this, zzh));
    }

    /* renamed from: b */
    private final void m27310b(zzh zzh, boolean z) {
        Preconditions.checkNotNull(zzh);
        m27309a(zzh.f20689a, false);
        this.f20678a.m22807h().m28626b(zzh.f20690b, zzh.f20706r);
    }

    /* renamed from: a */
    private final void m27309a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.f20678a.mo3172r().v_().m12354a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (!this.f20679b) {
                    if (!("com.google.android.gms".equals(this.f20680c) || UidVerifier.isGooglePlayServicesUid(this.f20678a.mo3170n(), Binder.getCallingUid()))) {
                        if (!GoogleSignatureVerifier.getInstance(this.f20678a.mo3170n()).isUidGoogleSigned(Binder.getCallingUid())) {
                            z = false;
                            this.f20679b = Boolean.valueOf(z);
                        }
                    }
                    z = true;
                    this.f20679b = Boolean.valueOf(z);
                }
                if (this.f20679b.booleanValue()) {
                    return;
                }
            } catch (boolean z2) {
                this.f20678a.mo3172r().v_().m12355a("Measurement Service called with invalid calling package. appId", zzap.m28525a(str));
                throw z2;
            }
        }
        if (!this.f20680c && GooglePlayServicesUtilLight.uidHasPackageName(this.f20678a.mo3170n(), Binder.getCallingUid(), str)) {
            this.f20680c = str;
        }
        if (!str.equals(this.f20680c)) {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
        }
    }

    /* renamed from: a */
    public final void mo3182a(long j, String str, String str2, String str3) {
        m27308a(new am(this, str2, str3, str, j));
    }

    /* renamed from: c */
    public final String mo3191c(zzh zzh) {
        m27310b(zzh, false);
        return this.f20678a.m22803d(zzh);
    }

    /* renamed from: a */
    public final void mo3188a(zzl zzl, zzh zzh) {
        Preconditions.checkNotNull(zzl);
        Preconditions.checkNotNull(zzl.f20709c);
        m27310b(zzh, false);
        zzl zzl2 = new zzl(zzl);
        zzl2.f20707a = zzh.f20689a;
        if (zzl.f20709c.m27328a() == null) {
            m27308a(new C2496v(this, zzl2, zzh));
        } else {
            m27308a(new C2497w(this, zzl2, zzh));
        }
    }

    /* renamed from: a */
    public final void mo3187a(zzl zzl) {
        Preconditions.checkNotNull(zzl);
        Preconditions.checkNotNull(zzl.f20709c);
        m27309a(zzl.f20707a, true);
        zzl zzl2 = new zzl(zzl);
        if (zzl.f20709c.m27328a() == null) {
            m27308a(new C2498x(this, zzl2));
        } else {
            m27308a(new C2500z(this, zzl2));
        }
    }

    /* renamed from: a */
    public final List<zzfh> mo3181a(String str, String str2, boolean z, zzh zzh) {
        m27310b(zzh, false);
        try {
            List<cm> list = (List) this.f20678a.mo3171q().m28566a(new aa(this, zzh, str, str2)).get();
            str2 = new ArrayList(list.size());
            for (cm cmVar : list) {
                if (z || !zzfk.m28606e(cmVar.f10571c)) {
                    str2.add(new zzfh(cmVar));
                }
            }
            return str2;
        } catch (String str3) {
            this.f20678a.mo3172r().v_().m12356a("Failed to get user attributes. appId", zzap.m28525a(zzh.f20689a), str3);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzfh> mo3180a(String str, String str2, String str3, boolean z) {
        m27309a(str, true);
        try {
            List<cm> list = (List) this.f20678a.mo3171q().m28566a(new ab(this, str, str2, str3)).get();
            str3 = new ArrayList(list.size());
            for (cm cmVar : list) {
                if (z || !zzfk.m28606e(cmVar.f10571c)) {
                    str3.add(new zzfh(cmVar));
                }
            }
            return str3;
        } catch (String str22) {
            this.f20678a.mo3172r().v_().m12356a("Failed to get user attributes. appId", zzap.m28525a(str), str22);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzl> mo3178a(String str, String str2, zzh zzh) {
        m27310b(zzh, false);
        try {
            return (List) this.f20678a.mo3171q().m28566a(new ac(this, zzh, str, str2)).get();
        } catch (String str3) {
            this.f20678a.mo3172r().v_().m12355a("Failed to get conditional user properties", str3);
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final List<zzl> mo3179a(String str, String str2, String str3) {
        m27309a(str, true);
        try {
            return (List) this.f20678a.mo3171q().m28566a(new ad(this, str, str2, str3)).get();
        } catch (String str4) {
            this.f20678a.mo3172r().v_().m12355a("Failed to get conditional user properties", str4);
            return Collections.emptyList();
        }
    }

    /* renamed from: d */
    public final void mo3192d(zzh zzh) {
        m27309a(zzh.f20689a, false);
        m27308a(new ae(this, zzh));
    }

    @VisibleForTesting
    /* renamed from: a */
    private final void m27308a(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (((Boolean) zzaf.aa.m12332b()).booleanValue() && this.f20678a.mo3171q().m28575g()) {
            runnable.run();
        } else {
            this.f20678a.mo3171q().m28568a(runnable);
        }
    }
}
