package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@zzaer
public final class zzacy extends zzaco {
    /* renamed from: g */
    protected zzye f21353g;
    /* renamed from: h */
    private zzyn f21354h;
    @VisibleForTesting
    /* renamed from: i */
    private zzxw f21355i;
    /* renamed from: j */
    private zzxy f21356j;
    /* renamed from: k */
    private final zzoj f21357k;
    /* renamed from: l */
    private final zzasg f21358l;
    /* renamed from: m */
    private boolean f21359m;

    zzacy(Context context, zzakn zzakn, zzyn zzyn, zzact zzact, zzoj zzoj, zzasg zzasg) {
        super(context, zzakn, zzact);
        this.f21354h = zzyn;
        this.f21356j = zzakn.f8808c;
        this.f21357k = zzoj;
        this.f21358l = zzasg;
    }

    /* renamed from: a */
    protected final zzakm mo4792a(int i) {
        String str;
        zzxy zzxy;
        zzafv zzafv;
        String str2;
        String str3;
        boolean z;
        long j;
        zzafp zzafp = this.e.f8806a;
        zzjk zzjk = zzafp.f19735c;
        zzasg zzasg = this.f21358l;
        List list = this.f.f19788c;
        List list2 = this.f.f19790e;
        List list3 = this.f.f19794i;
        int i2 = this.f.f19796k;
        long j2 = this.f.f19795j;
        String str4 = zzafp.f19741i;
        boolean z2 = this.f.f19792g;
        zzxx zzxx = this.f21353g != null ? r0.f21353g.f9879b : null;
        zzyq zzyq = r0.f21353g != null ? r0.f21353g.f9880c : null;
        if (r0.f21353g != null) {
            str = r0.f21353g.f9881d;
        } else {
            str = AdMobAdapter.class.getName();
        }
        String str5 = str;
        zzxy zzxy2 = r0.f21356j;
        zzya zzya = r0.f21353g != null ? r0.f21353g.f9882e : null;
        zzxx zzxx2 = zzxx;
        zzyq zzyq2 = zzyq;
        long j3 = r0.f.f19793h;
        zzjo zzjo = r0.e.f8809d;
        long j4 = j3;
        long j5 = r0.f.f19791f;
        long j6 = r0.e.f8811f;
        j3 = r0.f.f19798m;
        String str6 = r0.f.f19799n;
        JSONObject jSONObject = r0.e.f8813h;
        zzajk zzajk = r0.f.f19760A;
        List list4 = r0.f.f19761B;
        List list5 = r0.f.f19762C;
        zzjo zzjo2 = zzjo;
        boolean z3 = r0.f21356j != null ? r0.f21356j.f9871o : false;
        zzafv zzafv2 = r0.f.f19764E;
        if (r0.f21355i != null) {
            List b = r0.f21355i.mo2755b();
            String str7 = "";
            if (b == null) {
                zzxy = zzxy2;
                zzafv = zzafv2;
                str2 = str7.toString();
                str3 = str4;
                z = z2;
                j = j3;
            } else {
                Iterator it = b.iterator();
                String str8 = str7;
                while (it.hasNext()) {
                    Iterator it2;
                    zzafv = zzafv2;
                    zzye zzye = (zzye) it.next();
                    if (zzye != null) {
                        it2 = it;
                        if (zzye.f9879b == null || TextUtils.isEmpty(zzye.f9879b.f9839d)) {
                            zzxy = zzxy2;
                        } else {
                            int i3;
                            String valueOf = String.valueOf(str8);
                            j = j3;
                            String str9 = zzye.f9879b.f9839d;
                            switch (zzye.f9878a) {
                                case -1:
                                    i3 = 4;
                                    break;
                                case 0:
                                    zzxy = zzxy2;
                                    i3 = 0;
                                    break;
                                case 1:
                                    zzxy = zzxy2;
                                    i3 = 1;
                                    break;
                                case 3:
                                    i3 = 2;
                                    break;
                                case 4:
                                    i3 = 3;
                                    break;
                                case 5:
                                    i3 = 5;
                                    break;
                                default:
                                    i3 = 6;
                                    break;
                            }
                            zzxy = zzxy2;
                            long j7 = zzye.f9884g;
                            z = z2;
                            str3 = str4;
                            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str9).length() + 33);
                            stringBuilder.append(str9);
                            stringBuilder.append(".");
                            stringBuilder.append(i3);
                            stringBuilder.append(".");
                            stringBuilder.append(j7);
                            str = stringBuilder.toString();
                            stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length());
                            stringBuilder.append(valueOf);
                            stringBuilder.append(str);
                            stringBuilder.append("_");
                            str8 = stringBuilder.toString();
                            zzafv2 = zzafv;
                            it = it2;
                            j3 = j;
                            zzxy2 = zzxy;
                            z2 = z;
                            str4 = str3;
                        }
                    } else {
                        zzxy = zzxy2;
                        it2 = it;
                    }
                    str3 = str4;
                    z = z2;
                    j = j3;
                    zzafv2 = zzafv;
                    it = it2;
                    j3 = j;
                    zzxy2 = zzxy;
                    z2 = z;
                    str4 = str3;
                }
                zzxy = zzxy2;
                zzafv = zzafv2;
                str3 = str4;
                z = z2;
                j = j3;
                str2 = str8.substring(0, Math.max(0, str8.length() - 1));
            }
        } else {
            zzxy = zzxy2;
            zzafv = zzafv2;
            str3 = str4;
            z = z2;
            j = j3;
            str2 = null;
        }
        return new zzakm(zzjk, zzasg, list, i, list2, list3, i2, j2, str3, z, zzxx2, zzyq2, str5, zzxy, zzya, j4, zzjo2, j5, j6, j, str6, jSONObject, null, zzajk, list4, list5, z3, zzafv, str2, r0.f.f19767H, r0.f.f19771L, r0.e.f8814i, r0.f.f19774O, r0.e.f8815j, r0.f.f19776Q, r0.f.f19777R, r0.f.f19778S, r0.f.f19779T, r0.f.f19781V);
    }

    /* renamed from: a */
    protected final void mo4793a(long j) {
        boolean z;
        ListIterator listIterator;
        StringBuilder stringBuilder;
        synchronized (this.d) {
            if (r1.f21356j.f9869m != -1) {
                long j2 = j;
                zzxw zzyh = new zzyh(r1.b, r1.e.f8806a, r1.f21354h, r1.f21356j, r1.f.f19804s, r1.f.f19811z, r1.f.f19769J, j2, ((Long) zzkd.m10713e().m10897a(zznw.bb)).longValue(), 2, r1.e.f8815j);
            } else {
                zzxw zzyk = new zzyk(r1.b, r1.e.f8806a, r1.f21354h, r1.f21356j, r1.f.f19804s, r1.f.f19811z, r1.f.f19769J, j, ((Long) zzkd.m10713e().m10897a(zznw.bb)).longValue(), r1.f21357k, r1.e.f8815j);
            }
            r1.f21355i = r0;
        }
        List arrayList = new ArrayList(r1.f21356j.f9857a);
        Bundle bundle = r1.e.f8806a.f19735c.f20218m;
        String str = "com.google.ads.mediation.admob.AdMobAdapter";
        if (bundle != null) {
            bundle = bundle.getBundle(str);
            if (bundle != null) {
                z = bundle.getBoolean("_skipMediation");
                if (z) {
                    listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        if (!((zzxx) listIterator.next()).f9838c.contains(str)) {
                            listIterator.remove();
                        }
                    }
                }
                r1.f21353g = r1.f21355i.mo2753a(arrayList);
                switch (r1.f21353g.f9878a) {
                    case 0:
                        if (r1.f21353g.f9879b == null && r1.f21353g.f9879b.f9850o != null) {
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            zzalo.f8872a.post(new C2450v(r1, countDownLatch));
                            try {
                                countDownLatch.await(10, TimeUnit.SECONDS);
                                synchronized (r1.d) {
                                    if (!r1.f21359m) {
                                        throw new zzacr("View could not be prepared", 0);
                                    } else if (r1.f21358l.mo4721A()) {
                                        throw new zzacr("Assets not loaded, web view is destroyed", 0);
                                    }
                                }
                                return;
                            } catch (InterruptedException e) {
                                String valueOf = String.valueOf(e);
                                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
                                stringBuilder.append("Interrupted while waiting for latch : ");
                                stringBuilder.append(valueOf);
                                throw new zzacr(stringBuilder.toString(), 0);
                            }
                        }
                        return;
                    case 1:
                        throw new zzacr("No fill from any mediation ad networks.", 3);
                    default:
                        int i = r1.f21353g.f9878a;
                        stringBuilder = new StringBuilder(40);
                        stringBuilder.append("Unexpected mediation result: ");
                        stringBuilder.append(i);
                        throw new zzacr(stringBuilder.toString(), 0);
                }
            }
        }
        z = false;
        if (z) {
            listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (!((zzxx) listIterator.next()).f9838c.contains(str)) {
                    listIterator.remove();
                }
            }
        }
        r1.f21353g = r1.f21355i.mo2753a(arrayList);
        switch (r1.f21353g.f9878a) {
            case 0:
                if (r1.f21353g.f9879b == null) {
                    break;
                }
                return;
            case 1:
                throw new zzacr("No fill from any mediation ad networks.", 3);
            default:
                int i2 = r1.f21353g.f9878a;
                stringBuilder = new StringBuilder(40);
                stringBuilder.append("Unexpected mediation result: ");
                stringBuilder.append(i2);
                throw new zzacr(stringBuilder.toString(), 0);
        }
    }

    public final void m_() {
        synchronized (this.d) {
            super.m_();
            if (this.f21355i != null) {
                this.f21355i.mo2754a();
            }
        }
    }
}
