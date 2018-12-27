package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@VisibleForTesting
public final class zzdr extends ch {
    /* renamed from: a */
    private final zzef f21655a;
    /* renamed from: b */
    private zzag f21656b;
    /* renamed from: c */
    private volatile Boolean f21657c;
    /* renamed from: d */
    private final cw f21658d;
    /* renamed from: e */
    private final cd f21659e;
    /* renamed from: f */
    private final List<Runnable> f21660f = new ArrayList();
    /* renamed from: g */
    private final cw f21661g;

    protected zzdr(zzbt zzbt) {
        super(zzbt);
        this.f21659e = new cd(zzbt.mo3169m());
        this.f21655a = new zzef(this);
        this.f21658d = new be(this, zzbt);
        this.f21661g = new bi(this, zzbt);
    }

    /* renamed from: v */
    protected final boolean mo4962v() {
        return false;
    }

    /* renamed from: x */
    public final boolean m29705x() {
        mo4395d();
        m28441E();
        return this.f21656b != null;
    }

    /* renamed from: y */
    protected final void m29706y() {
        mo4395d();
        m28441E();
        m29665a(new bj(this, m29662a(true)));
    }

    @VisibleForTesting
    /* renamed from: a */
    final void m29676a(zzag zzag, AbstractSafeParcelable abstractSafeParcelable, zzh zzh) {
        mo4395d();
        mo4393b();
        m28441E();
        boolean H = m29656H();
        int i = 0;
        int i2 = 100;
        while (i < 1001 && r4 == 100) {
            int size;
            ArrayList arrayList;
            int size2;
            int i3;
            AbstractSafeParcelable abstractSafeParcelable2;
            List arrayList2 = new ArrayList();
            if (H) {
                Object a = mo4846j().m29476a(100);
                if (a != null) {
                    arrayList2.addAll(a);
                    size = a.size();
                    if (abstractSafeParcelable != null && size < 100) {
                        arrayList2.add(abstractSafeParcelable);
                    }
                    arrayList = (ArrayList) arrayList2;
                    size2 = arrayList.size();
                    i3 = 0;
                    while (i3 < size2) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                        if (abstractSafeParcelable2 instanceof zzad) {
                            try {
                                zzag.mo3183a((zzad) abstractSafeParcelable2, zzh);
                            } catch (RemoteException e) {
                                mo3172r().v_().m12355a("Failed to send event to the service", e);
                            }
                        } else if (abstractSafeParcelable2 instanceof zzfh) {
                            try {
                                zzag.mo3185a((zzfh) abstractSafeParcelable2, zzh);
                            } catch (RemoteException e2) {
                                mo3172r().v_().m12355a("Failed to send attribute to the service", e2);
                            }
                        } else if (abstractSafeParcelable2 instanceof zzl) {
                            mo3172r().v_().m12354a("Discarding data. Unrecognized parcel type.");
                        } else {
                            try {
                                zzag.mo3188a((zzl) abstractSafeParcelable2, zzh);
                            } catch (RemoteException e22) {
                                mo3172r().v_().m12355a("Failed to send conditional property to the service", e22);
                            }
                        }
                    }
                    i++;
                    i2 = size;
                }
            }
            size = 0;
            arrayList2.add(abstractSafeParcelable);
            arrayList = (ArrayList) arrayList2;
            size2 = arrayList.size();
            i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                abstractSafeParcelable2 = (AbstractSafeParcelable) obj2;
                if (abstractSafeParcelable2 instanceof zzad) {
                    zzag.mo3183a((zzad) abstractSafeParcelable2, zzh);
                } else if (abstractSafeParcelable2 instanceof zzfh) {
                    zzag.mo3185a((zzfh) abstractSafeParcelable2, zzh);
                } else if (abstractSafeParcelable2 instanceof zzl) {
                    mo3172r().v_().m12354a("Discarding data. Unrecognized parcel type.");
                } else {
                    zzag.mo3188a((zzl) abstractSafeParcelable2, zzh);
                }
            }
            i++;
            i2 = size;
        }
    }

    /* renamed from: a */
    protected final void m29674a(zzad zzad, String str) {
        Preconditions.checkNotNull(zzad);
        mo4395d();
        m28441E();
        boolean H = m29656H();
        boolean z = H && mo4846j().m29478a(zzad);
        m29665a(new bk(this, H, z, zzad, m29662a(true), str));
    }

    /* renamed from: a */
    protected final void m29679a(zzl zzl) {
        Preconditions.checkNotNull(zzl);
        mo4395d();
        m28441E();
        mo3173u();
        m29665a(new bm(this, true, mo4846j().m29480a(zzl), new zzl(zzl), m29662a(true), zzl));
    }

    /* renamed from: a */
    protected final void m29681a(AtomicReference<List<zzl>> atomicReference, String str, String str2, String str3) {
        mo4395d();
        m28441E();
        m29665a(new bn(this, atomicReference, str, str2, str3, m29662a(false)));
    }

    /* renamed from: a */
    protected final void m29682a(AtomicReference<List<zzfh>> atomicReference, String str, String str2, String str3, boolean z) {
        mo4395d();
        m28441E();
        m29665a(new bo(this, atomicReference, str, str2, str3, z, m29662a(false)));
    }

    /* renamed from: a */
    protected final void m29678a(zzfh zzfh) {
        mo4395d();
        m28441E();
        boolean z = m29656H() && mo4846j().m29479a(zzfh);
        m29665a(new bp(this, z, zzfh, m29662a(true)));
    }

    /* renamed from: a */
    protected final void m29683a(AtomicReference<List<zzfh>> atomicReference, boolean z) {
        mo4395d();
        m28441E();
        m29665a(new bq(this, atomicReference, m29662a(false), z));
    }

    /* renamed from: H */
    private final boolean m29656H() {
        mo3173u();
        return true;
    }

    /* renamed from: a */
    public final void m29680a(AtomicReference<String> atomicReference) {
        mo4395d();
        m28441E();
        m29665a(new bf(this, atomicReference, m29662a(false)));
    }

    /* renamed from: z */
    protected final void m29707z() {
        mo4395d();
        m28441E();
        m29665a(new bg(this, m29662a(true)));
    }

    /* renamed from: a */
    protected final void m29677a(zzdn zzdn) {
        mo4395d();
        m28441E();
        m29665a(new bh(this, zzdn));
    }

    /* renamed from: I */
    private final void m29657I() {
        mo4395d();
        this.f21659e.m12242a();
        this.f21658d.m12308a(((Long) zzaf.f10700O.m12332b()).longValue());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    final void m29670A() {
        /*
        r6 = this;
        r6.mo4395d();
        r6.m28441E();
        r0 = r6.m29705x();
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r0 = r6.f21657c;
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x011c;
    L_0x0013:
        r6.mo4395d();
        r6.m28441E();
        r0 = r6.mo4399s();
        r0 = r0.m28460i();
        if (r0 == 0) goto L_0x002c;
    L_0x0023:
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x002c;
    L_0x0029:
        r0 = 1;
        goto L_0x0116;
    L_0x002c:
        r6.mo3173u();
        r0 = r6.mo4843g();
        r0 = r0.m29446B();
        if (r0 != r2) goto L_0x003d;
    L_0x0039:
        r0 = 1;
    L_0x003a:
        r3 = 1;
        goto L_0x00f3;
    L_0x003d:
        r0 = r6.mo3172r();
        r0 = r0.m28555x();
        r3 = "Checking service availability";
        r0.m12354a(r3);
        r0 = r6.mo4398p();
        r3 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance();
        r0 = r0.mo3170n();
        r4 = 12451000; // 0xbdfcb8 float:1.7447567E-38 double:6.1516114E-317;
        r0 = r3.isGooglePlayServicesAvailable(r0, r4);
        r3 = 9;
        if (r0 == r3) goto L_0x00e5;
    L_0x0061:
        r3 = 18;
        if (r0 == r3) goto L_0x00d6;
    L_0x0065:
        switch(r0) {
            case 0: goto L_0x00c7;
            case 1: goto L_0x00b7;
            case 2: goto L_0x008b;
            case 3: goto L_0x007d;
            default: goto L_0x0068;
        };
    L_0x0068:
        r3 = r6.mo3172r();
        r3 = r3.m28540i();
        r4 = "Unexpected service status";
        r0 = java.lang.Integer.valueOf(r0);
        r3.m12355a(r4, r0);
    L_0x0079:
        r0 = 0;
    L_0x007a:
        r3 = 0;
        goto L_0x00f3;
    L_0x007d:
        r0 = r6.mo3172r();
        r0 = r0.m28540i();
        r3 = "Service disabled";
        r0.m12354a(r3);
        goto L_0x0079;
    L_0x008b:
        r0 = r6.mo3172r();
        r0 = r0.m28554w();
        r3 = "Service container out of date";
        r0.m12354a(r3);
        r0 = r6.mo4398p();
        r0 = r0.m28637j();
        r3 = 13000; // 0x32c8 float:1.8217E-41 double:6.423E-320;
        if (r0 >= r3) goto L_0x00a5;
    L_0x00a4:
        goto L_0x00c4;
    L_0x00a5:
        r0 = r6.mo4399s();
        r0 = r0.m28460i();
        if (r0 == 0) goto L_0x00b5;
    L_0x00af:
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0079;
    L_0x00b5:
        r0 = 1;
        goto L_0x007a;
    L_0x00b7:
        r0 = r6.mo3172r();
        r0 = r0.m28555x();
        r3 = "Service missing";
        r0.m12354a(r3);
    L_0x00c4:
        r0 = 0;
        goto L_0x003a;
    L_0x00c7:
        r0 = r6.mo3172r();
        r0 = r0.m28555x();
        r3 = "Service available";
        r0.m12354a(r3);
        goto L_0x0039;
    L_0x00d6:
        r0 = r6.mo3172r();
        r0 = r0.m28540i();
        r3 = "Service updating";
        r0.m12354a(r3);
        goto L_0x0039;
    L_0x00e5:
        r0 = r6.mo3172r();
        r0 = r0.m28540i();
        r3 = "Service invalid";
        r0.m12354a(r3);
        goto L_0x0079;
    L_0x00f3:
        if (r0 != 0) goto L_0x010d;
    L_0x00f5:
        r4 = r6.mo4400t();
        r4 = r4.m27376y();
        if (r4 == 0) goto L_0x010d;
    L_0x00ff:
        r3 = r6.mo3172r();
        r3 = r3.v_();
        r4 = "No way to upload. Consider using the full version of Analytics";
        r3.m12354a(r4);
        r3 = 0;
    L_0x010d:
        if (r3 == 0) goto L_0x0116;
    L_0x010f:
        r3 = r6.mo4399s();
        r3.m28449a(r0);
    L_0x0116:
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f21657c = r0;
    L_0x011c:
        r0 = r6.f21657c;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x012a;
    L_0x0124:
        r0 = r6.f21655a;
        r0.m22749b();
        return;
    L_0x012a:
        r0 = r6.mo4400t();
        r0 = r0.m27376y();
        if (r0 != 0) goto L_0x018a;
    L_0x0134:
        r6.mo3173u();
        r0 = r6.mo3170n();
        r0 = r0.getPackageManager();
        r3 = new android.content.Intent;
        r3.<init>();
        r4 = r6.mo3170n();
        r5 = "com.google.android.gms.measurement.AppMeasurementService";
        r3 = r3.setClassName(r4, r5);
        r4 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r0.queryIntentServices(r3, r4);
        if (r0 == 0) goto L_0x015d;
    L_0x0156:
        r0 = r0.size();
        if (r0 <= 0) goto L_0x015d;
    L_0x015c:
        r1 = 1;
    L_0x015d:
        if (r1 == 0) goto L_0x017d;
    L_0x015f:
        r0 = new android.content.Intent;
        r1 = "com.google.android.gms.measurement.START";
        r0.<init>(r1);
        r1 = new android.content.ComponentName;
        r2 = r6.mo3170n();
        r6.mo3173u();
        r3 = "com.google.android.gms.measurement.AppMeasurementService";
        r1.<init>(r2, r3);
        r0.setComponent(r1);
        r1 = r6.f21655a;
        r1.m22748a(r0);
        return;
    L_0x017d:
        r0 = r6.mo3172r();
        r0 = r0.v_();
        r1 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest";
        r0.m12354a(r1);
    L_0x018a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzdr.A():void");
    }

    /* renamed from: B */
    final Boolean m29671B() {
        return this.f21657c;
    }

    @VisibleForTesting
    /* renamed from: a */
    protected final void m29675a(zzag zzag) {
        mo4395d();
        Preconditions.checkNotNull(zzag);
        this.f21656b = zzag;
        m29657I();
        m29659K();
    }

    /* renamed from: C */
    public final void m29672C() {
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
        r3 = this;
        r3.mo4395d();
        r3.m28441E();
        r0 = com.google.android.gms.measurement.internal.zzn.m27333x();
        if (r0 == 0) goto L_0x0011;
    L_0x000c:
        r0 = r3.f21655a;
        r0.m22747a();
    L_0x0011:
        r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance();	 Catch:{ IllegalStateException -> 0x001e, IllegalStateException -> 0x001e }
        r1 = r3.mo3170n();	 Catch:{ IllegalStateException -> 0x001e, IllegalStateException -> 0x001e }
        r2 = r3.f21655a;	 Catch:{ IllegalStateException -> 0x001e, IllegalStateException -> 0x001e }
        r0.unbindService(r1, r2);	 Catch:{ IllegalStateException -> 0x001e, IllegalStateException -> 0x001e }
    L_0x001e:
        r0 = 0;
        r3.f21656b = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzdr.C():void");
    }

    /* renamed from: a */
    private final void m29663a(ComponentName componentName) {
        mo4395d();
        if (this.f21656b != null) {
            this.f21656b = null;
            mo3172r().m28555x().m12355a("Disconnected from device MeasurementService", componentName);
            mo4395d();
            m29670A();
        }
    }

    /* renamed from: J */
    private final void m29658J() {
        mo4395d();
        if (m29705x()) {
            mo3172r().m28555x().m12354a("Inactivity, disconnecting from the service");
            m29672C();
        }
    }

    /* renamed from: a */
    private final void m29665a(Runnable runnable) {
        mo4395d();
        if (m29705x()) {
            runnable.run();
        } else if (((long) this.f21660f.size()) >= 1000) {
            mo3172r().v_().m12354a("Discarding data. Max runnable queue size reached");
        } else {
            this.f21660f.add(runnable);
            this.f21661g.m12308a(60000);
            m29670A();
        }
    }

    /* renamed from: K */
    private final void m29659K() {
        mo4395d();
        mo3172r().m28555x().m12355a("Processing queued up service tasks", Integer.valueOf(this.f21660f.size()));
        for (Runnable run : this.f21660f) {
            try {
                run.run();
            } catch (Exception e) {
                mo3172r().v_().m12355a("Task exception while flushing queue", e);
            }
        }
        this.f21660f.clear();
        this.f21661g.m12310c();
    }

    /* renamed from: a */
    private final zzh m29662a(boolean z) {
        mo3173u();
        return mo4843g().m29447a(z ? mo3172r().m28556y() : false);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo4392a() {
        super.mo4392a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo4393b() {
        super.mo4393b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo4394c() {
        super.mo4394c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo4395d() {
        super.mo4395d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ zza mo4841e() {
        return super.mo4841e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ zzcs mo4842f() {
        return super.mo4842f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ zzaj mo4843g() {
        return super.mo4843g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ zzdr mo4844h() {
        return super.mo4844h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ zzdo mo4845i() {
        return super.mo4845i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ zzal mo4846j() {
        return super.mo4846j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ zzeq mo4847k() {
        return super.mo4847k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ zzx mo4396l() {
        return super.mo4396l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Clock mo3169m() {
        return super.mo3169m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo3170n() {
        return super.mo3170n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzan mo4397o() {
        return super.mo4397o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ zzfk mo4398p() {
        return super.mo4398p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ zzbo mo3171q() {
        return super.mo3171q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ zzap mo3172r() {
        return super.mo3172r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4832l mo4399s() {
        return super.mo4399s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ zzn mo4400t() {
        return super.mo4400t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ zzk mo3173u() {
        return super.mo3173u();
    }
}
