package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzyy;
import com.google.android.gms.internal.measurement.zzzg;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zzfa implements ap {
    /* renamed from: a */
    private static volatile zzfa f17608a;
    /* renamed from: b */
    private zzbn f17609b;
    /* renamed from: c */
    private zzat f17610c;
    /* renamed from: d */
    private ct f17611d;
    /* renamed from: e */
    private C2484i f17612e;
    /* renamed from: f */
    private zzew f17613f;
    /* renamed from: g */
    private cq f17614g;
    /* renamed from: h */
    private final zzfg f17615h;
    /* renamed from: i */
    private final zzbt f17616i;
    /* renamed from: j */
    private boolean f17617j;
    /* renamed from: k */
    private boolean f17618k;
    @VisibleForTesting
    /* renamed from: l */
    private long f17619l;
    /* renamed from: m */
    private List<Runnable> f17620m;
    /* renamed from: n */
    private int f17621n;
    /* renamed from: o */
    private int f17622o;
    /* renamed from: p */
    private boolean f17623p;
    /* renamed from: q */
    private boolean f17624q;
    /* renamed from: r */
    private boolean f17625r;
    /* renamed from: s */
    private FileLock f17626s;
    /* renamed from: t */
    private FileChannel f17627t;
    /* renamed from: u */
    private List<Long> f17628u;
    /* renamed from: v */
    private List<Long> f17629v;
    /* renamed from: w */
    private long f17630w;

    /* renamed from: com.google.android.gms.measurement.internal.zzfa$a */
    class C4136a implements cu {
        /* renamed from: a */
        zzgi f17603a;
        /* renamed from: b */
        List<Long> f17604b;
        /* renamed from: c */
        List<zzgf> f17605c;
        /* renamed from: d */
        private long f17606d;
        /* renamed from: e */
        private final /* synthetic */ zzfa f17607e;

        private C4136a(zzfa zzfa) {
            this.f17607e = zzfa;
        }

        /* renamed from: a */
        public final void mo3197a(zzgi zzgi) {
            Preconditions.checkNotNull(zzgi);
            this.f17603a = zzgi;
        }

        /* renamed from: a */
        public final boolean mo3198a(long j, zzgf zzgf) {
            Preconditions.checkNotNull(zzgf);
            if (this.f17605c == null) {
                this.f17605c = new ArrayList();
            }
            if (this.f17604b == null) {
                this.f17604b = new ArrayList();
            }
            if (this.f17605c.size() > 0 && C4136a.m22750a((zzgf) this.f17605c.get(0)) != C4136a.m22750a(zzgf)) {
                return false;
            }
            long e = this.f17606d + ((long) zzgf.m12203e());
            if (e >= ((long) Math.max(0, ((Integer) zzaf.f10728q.m12332b()).intValue()))) {
                return false;
            }
            this.f17606d = e;
            this.f17605c.add(zzgf);
            this.f17604b.add(Long.valueOf(j));
            if (this.f17605c.size() >= Math.max(1, ((Integer) zzaf.f10729r.m12332b()).intValue())) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private static long m22750a(zzgf zzgf) {
            return ((zzgf.f20589c.longValue() / 1000) / 60) / 60;
        }
    }

    /* renamed from: a */
    public static zzfa m22757a(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f17608a == null) {
            synchronized (zzfa.class) {
                if (f17608a == null) {
                    f17608a = new zzfa(new zzff(context));
                }
            }
        }
        return f17608a;
    }

    private zzfa(zzff zzff) {
        this(zzff, null);
    }

    private zzfa(zzff zzff, zzbt zzbt) {
        this.f17617j = null;
        Preconditions.checkNotNull(zzff);
        this.f17616i = zzbt.m22702a(zzff.f10784a, null);
        this.f17630w = -1;
        zzbt = new zzfg(this);
        zzbt.m28439v();
        this.f17615h = zzbt;
        zzbt = new zzat(this);
        zzbt.m28439v();
        this.f17610c = zzbt;
        zzbt = new zzbn(this);
        zzbt.m28439v();
        this.f17609b = zzbt;
        this.f17616i.mo3171q().m28568a(new ci(this, zzff));
    }

    /* renamed from: a */
    private final void m22762a(zzff zzff) {
        this.f17616i.mo3171q().mo4395d();
        zzff = new ct(this);
        zzff.m28439v();
        this.f17611d = zzff;
        this.f17616i.m22720b().m27338a(this.f17609b);
        zzff = new cq(this);
        zzff.m28439v();
        this.f17614g = zzff;
        zzff = new zzew(this);
        zzff.m28439v();
        this.f17613f = zzff;
        this.f17612e = new C2484i(this);
        if (this.f17621n != this.f17622o) {
            this.f17616i.mo3172r().v_().m12356a("Not all upload components initialized", Integer.valueOf(this.f17621n), Integer.valueOf(this.f17622o));
        }
        this.f17617j = true;
    }

    /* renamed from: a */
    protected final void m22782a() {
        this.f17616i.mo3171q().mo4395d();
        m22802d().m29401B();
        if (this.f17616i.m22722c().f21383c.m12360a() == 0) {
            this.f17616i.m22722c().f21383c.m12361a(this.f17616i.mo3169m().currentTimeMillis());
        }
        m22780y();
    }

    /* renamed from: u */
    public final zzk mo3173u() {
        return this.f17616i.mo3173u();
    }

    /* renamed from: b */
    public final zzn m22794b() {
        return this.f17616i.m22720b();
    }

    /* renamed from: r */
    public final zzap mo3172r() {
        return this.f17616i.mo3172r();
    }

    /* renamed from: q */
    public final zzbo mo3171q() {
        return this.f17616i.mo3171q();
    }

    /* renamed from: p */
    private final zzbn m22774p() {
        m22771b(this.f17609b);
        return this.f17609b;
    }

    /* renamed from: c */
    public final zzat m22800c() {
        m22771b(this.f17610c);
        return this.f17610c;
    }

    /* renamed from: d */
    public final ct m22802d() {
        m22771b(this.f17611d);
        return this.f17611d;
    }

    /* renamed from: s */
    private final C2484i m22775s() {
        if (this.f17612e != null) {
            return this.f17612e;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: t */
    private final zzew m22776t() {
        m22771b(this.f17613f);
        return this.f17613f;
    }

    /* renamed from: e */
    public final cq m22804e() {
        m22771b(this.f17614g);
        return this.f17614g;
    }

    /* renamed from: f */
    public final zzfg m22805f() {
        m22771b(this.f17615h);
        return this.f17615h;
    }

    /* renamed from: g */
    public final zzan m22806g() {
        return this.f17616i.m22730k();
    }

    /* renamed from: n */
    public final Context mo3170n() {
        return this.f17616i.mo3170n();
    }

    /* renamed from: m */
    public final Clock mo3169m() {
        return this.f17616i.mo3169m();
    }

    /* renamed from: h */
    public final zzfk m22807h() {
        return this.f17616i.m22729j();
    }

    /* renamed from: v */
    private final void m22777v() {
        this.f17616i.mo3171q().mo4395d();
    }

    /* renamed from: i */
    final void m22808i() {
        if (!this.f17617j) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: b */
    private static void m22771b(cg cgVar) {
        if (cgVar == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!cgVar.m28437j()) {
            cgVar = String.valueOf(cgVar.getClass());
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(cgVar).length() + 27);
            stringBuilder.append("Component not initialized: ");
            stringBuilder.append(cgVar);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    final void m22788a(zzh zzh) {
        m22777v();
        m22808i();
        Preconditions.checkNotEmpty(zzh.f20689a);
        m22773e(zzh);
    }

    /* renamed from: w */
    private final long m22778w() {
        long currentTimeMillis = this.f17616i.mo3169m().currentTimeMillis();
        an c = this.f17616i.m22722c();
        c.m27280A();
        c.mo4395d();
        long a = c.f21387g.m12360a();
        if (a == 0) {
            a = 1 + ((long) c.mo4398p().m28636h().nextInt(86400000));
            c.f21387g.m12361a(a);
        }
        return ((((currentTimeMillis + a) / 1000) / 60) / 60) / 24;
    }

    /* renamed from: a */
    final void m22786a(zzad zzad, String str) {
        zzfa zzfa = this;
        zzad zzad2 = zzad;
        String str2 = str;
        cp b = m22802d().m29425b(str2);
        if (b != null) {
            if (!TextUtils.isEmpty(b.m12279j())) {
                Boolean b2 = m22770b(b);
                if (b2 == null) {
                    if (!"_ui".equals(zzad2.f20674a)) {
                        zzfa.f17616i.mo3172r().m28540i().m12355a("Could not find package. appId", zzap.m28525a(str));
                    }
                } else if (!b2.booleanValue()) {
                    zzfa.f17616i.mo3172r().v_().m12355a("App version does not match; dropping event. appId", zzap.m28525a(str));
                    return;
                }
                zzh zzh = r2;
                cp cpVar = b;
                zzh zzh2 = new zzh(str, b.m12262d(), b.m12279j(), b.m12281k(), b.m12283l(), b.m12285m(), b.m12287n(), null, b.m12290o(), false, cpVar.m12271g(), cpVar.m12247B(), 0, 0, cpVar.m12248C(), cpVar.m12249D(), false, cpVar.m12265e());
                m22785a(zzad2, zzh);
                return;
            }
        }
        zzfa.f17616i.mo3172r().m28554w().m12355a("No app data available; dropping event", str2);
    }

    /* renamed from: a */
    final void m22785a(zzad zzad, zzh zzh) {
        zzfa zzfa = this;
        zzad zzad2 = zzad;
        zzh zzh2 = zzh;
        Preconditions.checkNotNull(zzh);
        Preconditions.checkNotEmpty(zzh2.f20689a);
        m22777v();
        m22808i();
        String str = zzh2.f20689a;
        long j = zzad2.f20677d;
        if (!m22805f().m29782a(zzad2, zzh2)) {
            return;
        }
        if (zzh2.f20696h) {
            m22802d().m29437f();
            try {
                List emptyList;
                an d = m22802d();
                Preconditions.checkNotEmpty(str);
                d.mo4395d();
                d.m28438k();
                if (j < 0) {
                    d.mo3172r().m28540i().m12356a("Invalid time querying timed out conditional properties", zzap.m28525a(str), Long.valueOf(j));
                    emptyList = Collections.emptyList();
                } else {
                    emptyList = d.m29415a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzl zzl : r4) {
                    if (zzl != null) {
                        zzfa.f17616i.mo3172r().m28554w().m12357a("User property timed out", zzl.f20707a, zzfa.f17616i.m22730k().m28507c(zzl.f20709c.f20681a), zzl.f20709c.m27328a());
                        if (zzl.f20713g != null) {
                            m22772b(new zzad(zzl.f20713g, j), zzh2);
                        }
                        m22802d().m29432e(str, zzl.f20709c.f20681a);
                    }
                }
                d = m22802d();
                Preconditions.checkNotEmpty(str);
                d.mo4395d();
                d.m28438k();
                if (j < 0) {
                    d.mo3172r().m28540i().m12356a("Invalid time querying expired conditional properties", zzap.m28525a(str), Long.valueOf(j));
                    emptyList = Collections.emptyList();
                } else {
                    emptyList = d.m29415a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                List arrayList = new ArrayList(r4.size());
                for (zzl zzl2 : r4) {
                    if (zzl2 != null) {
                        zzfa.f17616i.mo3172r().m28554w().m12357a("User property expired", zzl2.f20707a, zzfa.f17616i.m22730k().m28507c(zzl2.f20709c.f20681a), zzl2.f20709c.m27328a());
                        m22802d().m29427b(str, zzl2.f20709c.f20681a);
                        if (zzl2.f20717k != null) {
                            arrayList.add(zzl2.f20717k);
                        }
                        m22802d().m29432e(str, zzl2.f20709c.f20681a);
                    }
                }
                ArrayList arrayList2 = (ArrayList) arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    m22772b(new zzad((zzad) obj, j), zzh2);
                }
                d = m22802d();
                String str2 = zzad2.f20674a;
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotEmpty(str2);
                d.mo4395d();
                d.m28438k();
                List emptyList2;
                if (j < 0) {
                    d.mo3172r().m28540i().m12357a("Invalid time querying triggered conditional properties", zzap.m28525a(str), d.mo4397o().m28503a(str2), Long.valueOf(j));
                    emptyList2 = Collections.emptyList();
                } else {
                    emptyList2 = d.m29415a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                List arrayList3 = new ArrayList(r3.size());
                for (zzl zzl3 : r3) {
                    if (zzl3 != null) {
                        zzfh zzfh = zzl3.f20709c;
                        cm cmVar = r4;
                        cm cmVar2 = new cm(zzl3.f20707a, zzl3.f20708b, zzfh.f20681a, j, zzfh.m27328a());
                        if (m22802d().m29421a(cmVar)) {
                            zzfa.f17616i.mo3172r().m28554w().m12357a("User property triggered", zzl3.f20707a, zzfa.f17616i.m22730k().m28507c(cmVar.f10571c), cmVar.f10573e);
                        } else {
                            zzfa.f17616i.mo3172r().v_().m12357a("Too many active user properties, ignoring", zzap.m28525a(zzl3.f20707a), zzfa.f17616i.m22730k().m28507c(cmVar.f10571c), cmVar.f10573e);
                        }
                        if (zzl3.f20715i != null) {
                            arrayList3.add(zzl3.f20715i);
                        }
                        zzl3.f20709c = new zzfh(cmVar);
                        zzl3.f20711e = true;
                        m22802d().m29422a(zzl3);
                    }
                }
                m22772b(zzad, zzh);
                ArrayList arrayList4 = (ArrayList) arrayList3;
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    m22772b(new zzad((zzad) obj2, j), zzh2);
                }
                m22802d().m29440w();
            } finally {
                m22802d().m29441x();
            }
        } else {
            m22773e(zzh2);
        }
    }

    /* renamed from: b */
    private final void m22772b(zzad zzad, zzh zzh) {
        zzfa zzfa = this;
        zzad zzad2 = zzad;
        zzh zzh2 = zzh;
        Preconditions.checkNotNull(zzh);
        Preconditions.checkNotEmpty(zzh2.f20689a);
        long nanoTime = System.nanoTime();
        m22777v();
        m22808i();
        String str = zzh2.f20689a;
        if (!m22805f().m29782a(zzad2, zzh2)) {
            return;
        }
        if (!zzh2.f20696h) {
            m22773e(zzh2);
        } else if (m22774p().m29535b(str, zzad2.f20674a)) {
            Object obj;
            zzfa.f17616i.mo3172r().m28540i().m12356a("Dropping blacklisted event. appId", zzap.m28525a(str), zzfa.f17616i.m22730k().m28503a(zzad2.f20674a));
            if (!m22774p().m29544f(str)) {
                if (!m22774p().m29546g(str)) {
                    obj = null;
                    if (obj == null && !"_err".equals(zzad2.f20674a)) {
                        zzfa.f17616i.m22729j().m28619a(str, 11, "_ev", zzad2.f20674a, 0);
                    }
                    if (obj != null) {
                        r0 = m22802d().m29425b(str);
                        if (r0 != null) {
                            if (Math.abs(zzfa.f17616i.mo3169m().currentTimeMillis() - Math.max(r0.m12293r(), r0.m12292q())) > ((Long) zzaf.f10693H.m12332b()).longValue()) {
                                zzfa.f17616i.mo3172r().m28554w().m12354a("Fetching config for blacklisted app");
                                m22760a(r0);
                            }
                        }
                    }
                }
            }
            obj = 1;
            zzfa.f17616i.m22729j().m28619a(str, 11, "_ev", zzad2.f20674a, 0);
            if (obj != null) {
                r0 = m22802d().m29425b(str);
                if (r0 != null) {
                    if (Math.abs(zzfa.f17616i.mo3169m().currentTimeMillis() - Math.max(r0.m12293r(), r0.m12292q())) > ((Long) zzaf.f10693H.m12332b()).longValue()) {
                        zzfa.f17616i.mo3172r().m28554w().m12354a("Fetching config for blacklisted app");
                        m22760a(r0);
                    }
                }
            }
        } else {
            if (zzfa.f17616i.mo3172r().m28533a(2)) {
                zzfa.f17616i.mo3172r().m28555x().m12355a("Logging event", zzfa.f17616i.m22730k().m28501a(zzad2));
            }
            m22802d().m29437f();
            m22773e(zzh2);
            if (("_iap".equals(zzad2.f20674a) || "ecommerce_purchase".equals(zzad2.f20674a)) && !m22765a(str, zzad2)) {
                m22802d().m29440w();
                m22802d().m29441x();
                return;
            }
            zzgi zzgi;
            try {
                boolean a = zzfk.m28595a(zzad2.f20674a);
                boolean equals = "_err".equals(zzad2.f20674a);
                zzr a2 = m22802d().m29410a(m22778w(), str, true, a, false, equals, false);
                long intValue = a2.f10787b - ((long) ((Integer) zzaf.f10730s.m12332b()).intValue());
                if (intValue > 0) {
                    if (intValue % 1000 == 1) {
                        zzfa.f17616i.mo3172r().v_().m12356a("Data loss. Too many events logged. appId, count", zzap.m28525a(str), Long.valueOf(a2.f10787b));
                    }
                    m22802d().m29440w();
                    m22802d().m29441x();
                    return;
                }
                if (a) {
                    intValue = a2.f10786a - ((long) ((Integer) zzaf.f10732u.m12332b()).intValue());
                    if (intValue > 0) {
                        if (intValue % 1000 == 1) {
                            zzfa.f17616i.mo3172r().v_().m12356a("Data loss. Too many public events logged. appId, count", zzap.m28525a(str), Long.valueOf(a2.f10786a));
                        }
                        zzfa.f17616i.m22729j().m28619a(str, 16, "_ev", zzad2.f20674a, 0);
                        m22802d().m29440w();
                        m22802d().m29441x();
                        return;
                    }
                }
                if (equals) {
                    intValue = a2.f10789d - ((long) Math.max(0, Math.min(1000000, zzfa.f17616i.m22720b().m27340b(zzh2.f20689a, zzaf.f10731t))));
                    if (intValue > 0) {
                        if (intValue == 1) {
                            zzfa.f17616i.mo3172r().v_().m12356a("Too many error events logged. appId, count", zzap.m28525a(str), Long.valueOf(a2.f10789d));
                        }
                        m22802d().m29440w();
                        m22802d().m29441x();
                        return;
                    }
                }
                Bundle b = zzad2.f20675b.m27303b();
                zzfa.f17616i.m22729j().m28618a(b, "_o", zzad2.f20676c);
                if (zzfa.f17616i.m22729j().m28634f(str)) {
                    zzfa.f17616i.m22729j().m28618a(b, "_dbg", Long.valueOf(1));
                    zzfa.f17616i.m22729j().m28618a(b, "_r", Long.valueOf(1));
                }
                long c = m22802d().m29428c(str);
                if (c > 0) {
                    zzfa.f17616i.mo3172r().m28540i().m12356a("Data lost. Too many events stored on disk, deleted. appId", zzap.m28525a(str), Long.valueOf(c));
                }
                long j = nanoTime;
                zzy zzy = r5;
                boolean z = false;
                zzy zzy2 = new zzy(zzfa.f17616i, zzad2.f20676c, str, zzad2.f20674a, zzad2.f20677d, 0, b);
                cy a3 = m22802d().m29409a(str, zzy.f10792b);
                if (a3 != null) {
                    zzy a4 = zzy.m12395a(zzfa.f17616i, a3.f10616e);
                    a3 = a3.m12312a(a4.f10793c);
                    zzy = a4;
                } else if (m22802d().m29435f(str) < 500 || !a) {
                    cy cyVar = new cy(str, zzy.f10792b, 0, 0, zzy.f10793c, 0, null, null, null, null);
                } else {
                    zzfa.f17616i.mo3172r().v_().m12357a("Too many event names used, ignoring event. appId, name, supported count", zzap.m28525a(str), zzfa.f17616i.m22730k().m28503a(zzy.f10792b), Integer.valueOf(500));
                    zzfa.f17616i.m22729j().m28619a(str, 8, null, null, 0);
                    m22802d().m29441x();
                    return;
                }
                m22802d().m29417a(a3);
                m22777v();
                m22808i();
                Preconditions.checkNotNull(zzy);
                Preconditions.checkNotNull(zzh);
                Preconditions.checkNotEmpty(zzy.f10791a);
                Preconditions.checkArgument(zzy.f10791a.equals(zzh2.f20689a));
                zzgi = new zzgi();
                zzgi.f20613a = Integer.valueOf(1);
                zzgi.f20621i = "android";
                zzgi.f20627o = zzh2.f20689a;
                zzgi.f20626n = zzh2.f20692d;
                zzgi.f20628p = zzh2.f20691c;
                zzgi.f20602C = zzh2.f20698j == -2147483648L ? null : Integer.valueOf((int) zzh2.f20698j);
                zzgi.f20629q = Long.valueOf(zzh2.f20693e);
                zzgi.f20637y = zzh2.f20690b;
                zzgi.f20608I = zzh2.f20706r;
                zzgi.f20634v = zzh2.f20694f == 0 ? null : Long.valueOf(zzh2.f20694f);
                Pair a5 = zzfa.f17616i.m22722c().m28448a(zzh2.f20689a);
                if (a5 == null || TextUtils.isEmpty((CharSequence) a5.first)) {
                    if (!zzfa.f17616i.m22744y().m28650a(zzfa.f17616i.mo3170n()) && zzh2.f20704p) {
                        String string = Secure.getString(zzfa.f17616i.mo3170n().getContentResolver(), "android_id");
                        if (string == null) {
                            zzfa.f17616i.mo3172r().m28540i().m12355a("null secure ID. appId", zzap.m28525a(zzgi.f20627o));
                            string = "null";
                        } else if (string.isEmpty()) {
                            zzfa.f17616i.mo3172r().m28540i().m12355a("empty secure ID. appId", zzap.m28525a(zzgi.f20627o));
                        }
                        zzgi.f20603D = string;
                    }
                } else if (zzh2.f20703o) {
                    zzgi.f20631s = (String) a5.first;
                    zzgi.f20632t = (Boolean) a5.second;
                }
                zzfa.f17616i.m22744y().m27280A();
                zzgi.f20623k = Build.MODEL;
                zzfa.f17616i.m22744y().m27280A();
                zzgi.f20622j = VERSION.RELEASE;
                zzgi.f20625m = Integer.valueOf((int) zzfa.f17616i.m22744y().m28655g());
                zzgi.f20624l = zzfa.f17616i.m22744y().m28656h();
                zzgi.f20630r = null;
                zzgi.f20616d = null;
                zzgi.f20617e = null;
                zzgi.f20618f = null;
                zzgi.f20605F = Long.valueOf(zzh2.f20700l);
                if (zzfa.f17616i.m22710C() && zzn.m27332w()) {
                    zzgi.f20606G = null;
                }
                r0 = m22802d().m29425b(zzh2.f20689a);
                if (r0 == null) {
                    r0 = new cp(zzfa.f17616i, zzh2.f20689a);
                    r0.m12252a(zzfa.f17616i.m22729j().m28638k());
                    r0.m12267e(zzh2.f20699k);
                    r0.m12256b(zzh2.f20690b);
                    r0.m12264d(zzfa.f17616i.m22722c().m28450b(zzh2.f20689a));
                    r0.m12269f(0);
                    r0.m12251a(0);
                    r0.m12255b(0);
                    r0.m12270f(zzh2.f20691c);
                    r0.m12259c(zzh2.f20698j);
                    r0.m12273g(zzh2.f20692d);
                    r0.m12263d(zzh2.f20693e);
                    r0.m12266e(zzh2.f20694f);
                    r0.m12253a(zzh2.f20696h);
                    r0.m12289o(zzh2.f20700l);
                    m22802d().m29416a(r0);
                }
                zzgi.f20633u = r0.m12258c();
                zzgi.f20601B = r0.m12271g();
                List a6 = m22802d().m29412a(zzh2.f20689a);
                zzgi.f20615c = new zzgl[a6.size()];
                for (int i = 0; i < a6.size(); i++) {
                    zzgl zzgl = new zzgl();
                    zzgi.f20615c[i] = zzgl;
                    zzgl.f20648b = ((cm) a6.get(i)).f10571c;
                    zzgl.f20647a = Long.valueOf(((cm) a6.get(i)).f10572d);
                    m22805f().m29780a(zzgl, ((cm) a6.get(i)).f10573e);
                }
                intValue = m22802d().m29407a(zzgi);
                ct d = m22802d();
                if (zzy.f10795e != null) {
                    Iterator it = zzy.f10795e.iterator();
                    while (it.hasNext()) {
                        if ("_r".equals((String) it.next())) {
                            break;
                        }
                    }
                    boolean c2 = m22774p().m29538c(zzy.f10791a, zzy.f10792b);
                    a2 = m22802d().m29410a(m22778w(), zzy.f10791a, false, false, false, false, false);
                    if (c2 && a2.f10790e < ((long) zzfa.f17616i.m22720b().m27335a(zzy.f10791a))) {
                        z = true;
                    }
                }
                if (d.m29423a(zzy, intValue, z)) {
                    zzfa.f17619l = 0;
                }
                m22802d().m29440w();
                if (zzfa.f17616i.mo3172r().m28533a(2)) {
                    zzfa.f17616i.mo3172r().m28555x().m12355a("Event recorded", zzfa.f17616i.m22730k().m28502a(zzy));
                }
                m22802d().m29441x();
                m22780y();
                zzfa.f17616i.mo3172r().m28555x().m12355a("Background event processing time, ms", Long.valueOf(((System.nanoTime() - j) + 500000) / 1000000));
            } catch (IOException e) {
                zzfa.f17616i.mo3172r().v_().m12356a("Data loss. Failed to insert raw event metadata. appId", zzap.m28525a(zzgi.f20627o), e);
            } catch (Throwable th) {
                m22802d().m29441x();
            }
        }
    }

    /* renamed from: a */
    private final boolean m22765a(String str, zzad zzad) {
        long round;
        Object d = zzad.f20675b.m27306d("currency");
        if ("ecommerce_purchase".equals(zzad.f20674a)) {
            double doubleValue = zzad.f20675b.m27305c("value").doubleValue() * 1000000.0d;
            if (doubleValue == 0.0d) {
                doubleValue = (double) zzad.f20675b.m27304b("value").longValue();
                Double.isNaN(doubleValue);
                doubleValue *= 1000000.0d;
            }
            if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                this.f17616i.mo3172r().m28540i().m12356a("Data lost. Currency value is too big. appId", zzap.m28525a(str), Double.valueOf(doubleValue));
                return false;
            }
            round = Math.round(doubleValue);
        } else {
            round = zzad.f20675b.m27304b("value").longValue();
        }
        if (!TextUtils.isEmpty(d)) {
            String toUpperCase = d.toUpperCase(Locale.US);
            if (toUpperCase.matches("[A-Z]{3}")) {
                String valueOf = String.valueOf("_ltv_");
                toUpperCase = String.valueOf(toUpperCase);
                String concat = toUpperCase.length() != 0 ? valueOf.concat(toUpperCase) : new String(valueOf);
                cm c = m22802d().m29429c(str, concat);
                if (c != null) {
                    if (c.f10573e instanceof Long) {
                        c = new cm(str, zzad.f20676c, concat, this.f17616i.mo3169m().currentTimeMillis(), Long.valueOf(((Long) c.f10573e).longValue() + round));
                        if (m22802d().m29421a(c) == null) {
                            this.f17616i.mo3172r().v_().m12357a("Too many unique user properties are set. Ignoring user property. appId", zzap.m28525a(str), this.f17616i.m22730k().m28507c(c.f10571c), c.f10573e);
                            this.f17616i.m22729j().m28619a(str, 9, null, null, 0);
                        }
                    }
                }
                an d2 = m22802d();
                int b = this.f17616i.m22720b().m27340b(str, zzaf.f10698M) - 1;
                Preconditions.checkNotEmpty(str);
                d2.mo4395d();
                d2.m28438k();
                try {
                    d2.m29442y().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str, str, String.valueOf(b)});
                } catch (SQLiteException e) {
                    d2.mo3172r().v_().m12356a("Error pruning currencies. appId", zzap.m28525a(str), e);
                }
                cm cmVar = new cm(str, zzad.f20676c, concat, this.f17616i.mo3169m().currentTimeMillis(), Long.valueOf(round));
                if (m22802d().m29421a(c) == null) {
                    this.f17616i.mo3172r().v_().m12357a("Too many unique user properties are set. Ignoring user property. appId", zzap.m28525a(str), this.f17616i.m22730k().m28507c(c.f10571c), c.f10573e);
                    this.f17616i.m22729j().m28619a(str, 9, null, null, 0);
                }
            }
        }
        return true;
    }

    /* renamed from: j */
    final void m22809j() {
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
        r17 = this;
        r1 = r17;
        r17.m22777v();
        r17.m22808i();
        r0 = 1;
        r1.f17625r = r0;
        r2 = 0;
        r3 = r1.f17616i;	 Catch:{ all -> 0x02db }
        r3.mo3173u();	 Catch:{ all -> 0x02db }
        r3 = r1.f17616i;	 Catch:{ all -> 0x02db }
        r3 = r3.m22743x();	 Catch:{ all -> 0x02db }
        r3 = r3.m29671B();	 Catch:{ all -> 0x02db }
        if (r3 != 0) goto L_0x0032;	 Catch:{ all -> 0x02db }
    L_0x001d:
        r0 = r1.f17616i;	 Catch:{ all -> 0x02db }
        r0 = r0.mo3172r();	 Catch:{ all -> 0x02db }
        r0 = r0.m28540i();	 Catch:{ all -> 0x02db }
        r3 = "Upload data called on the client side before use of service was decided";	 Catch:{ all -> 0x02db }
        r0.m12354a(r3);	 Catch:{ all -> 0x02db }
        r1.f17625r = r2;
        r17.m22781z();
        return;
    L_0x0032:
        r3 = r3.booleanValue();	 Catch:{ all -> 0x02db }
        if (r3 == 0) goto L_0x004d;	 Catch:{ all -> 0x02db }
    L_0x0038:
        r0 = r1.f17616i;	 Catch:{ all -> 0x02db }
        r0 = r0.mo3172r();	 Catch:{ all -> 0x02db }
        r0 = r0.v_();	 Catch:{ all -> 0x02db }
        r3 = "Upload called in the client side when service should be used";	 Catch:{ all -> 0x02db }
        r0.m12354a(r3);	 Catch:{ all -> 0x02db }
        r1.f17625r = r2;
        r17.m22781z();
        return;
    L_0x004d:
        r3 = r1.f17619l;	 Catch:{ all -> 0x02db }
        r5 = 0;	 Catch:{ all -> 0x02db }
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));	 Catch:{ all -> 0x02db }
        if (r7 <= 0) goto L_0x005e;	 Catch:{ all -> 0x02db }
    L_0x0055:
        r17.m22780y();	 Catch:{ all -> 0x02db }
        r1.f17625r = r2;
        r17.m22781z();
        return;
    L_0x005e:
        r17.m22777v();	 Catch:{ all -> 0x02db }
        r3 = r1.f17628u;	 Catch:{ all -> 0x02db }
        if (r3 == 0) goto L_0x0067;	 Catch:{ all -> 0x02db }
    L_0x0065:
        r3 = 1;	 Catch:{ all -> 0x02db }
        goto L_0x0068;	 Catch:{ all -> 0x02db }
    L_0x0067:
        r3 = 0;	 Catch:{ all -> 0x02db }
    L_0x0068:
        if (r3 == 0) goto L_0x007f;	 Catch:{ all -> 0x02db }
    L_0x006a:
        r0 = r1.f17616i;	 Catch:{ all -> 0x02db }
        r0 = r0.mo3172r();	 Catch:{ all -> 0x02db }
        r0 = r0.m28555x();	 Catch:{ all -> 0x02db }
        r3 = "Uploading requested multiple times";	 Catch:{ all -> 0x02db }
        r0.m12354a(r3);	 Catch:{ all -> 0x02db }
        r1.f17625r = r2;
        r17.m22781z();
        return;
    L_0x007f:
        r3 = r17.m22800c();	 Catch:{ all -> 0x02db }
        r3 = r3.m29511f();	 Catch:{ all -> 0x02db }
        if (r3 != 0) goto L_0x00a1;	 Catch:{ all -> 0x02db }
    L_0x0089:
        r0 = r1.f17616i;	 Catch:{ all -> 0x02db }
        r0 = r0.mo3172r();	 Catch:{ all -> 0x02db }
        r0 = r0.m28555x();	 Catch:{ all -> 0x02db }
        r3 = "Network not connected, ignoring upload request";	 Catch:{ all -> 0x02db }
        r0.m12354a(r3);	 Catch:{ all -> 0x02db }
        r17.m22780y();	 Catch:{ all -> 0x02db }
        r1.f17625r = r2;
        r17.m22781z();
        return;
    L_0x00a1:
        r3 = r1.f17616i;	 Catch:{ all -> 0x02db }
        r3 = r3.mo3169m();	 Catch:{ all -> 0x02db }
        r3 = r3.currentTimeMillis();	 Catch:{ all -> 0x02db }
        r7 = com.google.android.gms.measurement.internal.zzn.m27331k();	 Catch:{ all -> 0x02db }
        r9 = 0;	 Catch:{ all -> 0x02db }
        r7 = r3 - r7;	 Catch:{ all -> 0x02db }
        r9 = 0;	 Catch:{ all -> 0x02db }
        r1.m22764a(r9, r7);	 Catch:{ all -> 0x02db }
        r7 = r1.f17616i;	 Catch:{ all -> 0x02db }
        r7 = r7.m22722c();	 Catch:{ all -> 0x02db }
        r7 = r7.f21383c;	 Catch:{ all -> 0x02db }
        r7 = r7.m12360a();	 Catch:{ all -> 0x02db }
        r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));	 Catch:{ all -> 0x02db }
        if (r10 == 0) goto L_0x00e0;	 Catch:{ all -> 0x02db }
    L_0x00c6:
        r5 = r1.f17616i;	 Catch:{ all -> 0x02db }
        r5 = r5.mo3172r();	 Catch:{ all -> 0x02db }
        r5 = r5.m28554w();	 Catch:{ all -> 0x02db }
        r6 = "Uploading events. Elapsed time since last upload attempt (ms)";	 Catch:{ all -> 0x02db }
        r10 = 0;	 Catch:{ all -> 0x02db }
        r7 = r3 - r7;	 Catch:{ all -> 0x02db }
        r7 = java.lang.Math.abs(r7);	 Catch:{ all -> 0x02db }
        r7 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x02db }
        r5.m12355a(r6, r7);	 Catch:{ all -> 0x02db }
    L_0x00e0:
        r5 = r17.m22802d();	 Catch:{ all -> 0x02db }
        r5 = r5.m29443z();	 Catch:{ all -> 0x02db }
        r6 = android.text.TextUtils.isEmpty(r5);	 Catch:{ all -> 0x02db }
        r7 = -1;	 Catch:{ all -> 0x02db }
        if (r6 != 0) goto L_0x02b2;	 Catch:{ all -> 0x02db }
    L_0x00f0:
        r10 = r1.f17630w;	 Catch:{ all -> 0x02db }
        r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1));	 Catch:{ all -> 0x02db }
        if (r6 != 0) goto L_0x0100;	 Catch:{ all -> 0x02db }
    L_0x00f6:
        r6 = r17.m22802d();	 Catch:{ all -> 0x02db }
        r6 = r6.m29406G();	 Catch:{ all -> 0x02db }
        r1.f17630w = r6;	 Catch:{ all -> 0x02db }
    L_0x0100:
        r6 = r1.f17616i;	 Catch:{ all -> 0x02db }
        r6 = r6.m22720b();	 Catch:{ all -> 0x02db }
        r7 = com.google.android.gms.measurement.internal.zzaf.f10726o;	 Catch:{ all -> 0x02db }
        r6 = r6.m27340b(r5, r7);	 Catch:{ all -> 0x02db }
        r7 = r1.f17616i;	 Catch:{ all -> 0x02db }
        r7 = r7.m22720b();	 Catch:{ all -> 0x02db }
        r8 = com.google.android.gms.measurement.internal.zzaf.f10727p;	 Catch:{ all -> 0x02db }
        r7 = r7.m27340b(r5, r8);	 Catch:{ all -> 0x02db }
        r7 = java.lang.Math.max(r2, r7);	 Catch:{ all -> 0x02db }
        r8 = r17.m22802d();	 Catch:{ all -> 0x02db }
        r6 = r8.m29413a(r5, r6, r7);	 Catch:{ all -> 0x02db }
        r7 = r6.isEmpty();	 Catch:{ all -> 0x02db }
        if (r7 != 0) goto L_0x02d5;	 Catch:{ all -> 0x02db }
    L_0x012a:
        r7 = r6.iterator();	 Catch:{ all -> 0x02db }
    L_0x012e:
        r8 = r7.hasNext();	 Catch:{ all -> 0x02db }
        if (r8 == 0) goto L_0x0149;	 Catch:{ all -> 0x02db }
    L_0x0134:
        r8 = r7.next();	 Catch:{ all -> 0x02db }
        r8 = (android.util.Pair) r8;	 Catch:{ all -> 0x02db }
        r8 = r8.first;	 Catch:{ all -> 0x02db }
        r8 = (com.google.android.gms.internal.measurement.zzgi) r8;	 Catch:{ all -> 0x02db }
        r10 = r8.f20631s;	 Catch:{ all -> 0x02db }
        r10 = android.text.TextUtils.isEmpty(r10);	 Catch:{ all -> 0x02db }
        if (r10 != 0) goto L_0x012e;	 Catch:{ all -> 0x02db }
    L_0x0146:
        r7 = r8.f20631s;	 Catch:{ all -> 0x02db }
        goto L_0x014a;	 Catch:{ all -> 0x02db }
    L_0x0149:
        r7 = r9;	 Catch:{ all -> 0x02db }
    L_0x014a:
        if (r7 == 0) goto L_0x0175;	 Catch:{ all -> 0x02db }
    L_0x014c:
        r8 = 0;	 Catch:{ all -> 0x02db }
    L_0x014d:
        r10 = r6.size();	 Catch:{ all -> 0x02db }
        if (r8 >= r10) goto L_0x0175;	 Catch:{ all -> 0x02db }
    L_0x0153:
        r10 = r6.get(r8);	 Catch:{ all -> 0x02db }
        r10 = (android.util.Pair) r10;	 Catch:{ all -> 0x02db }
        r10 = r10.first;	 Catch:{ all -> 0x02db }
        r10 = (com.google.android.gms.internal.measurement.zzgi) r10;	 Catch:{ all -> 0x02db }
        r11 = r10.f20631s;	 Catch:{ all -> 0x02db }
        r11 = android.text.TextUtils.isEmpty(r11);	 Catch:{ all -> 0x02db }
        if (r11 != 0) goto L_0x0172;	 Catch:{ all -> 0x02db }
    L_0x0165:
        r10 = r10.f20631s;	 Catch:{ all -> 0x02db }
        r10 = r10.equals(r7);	 Catch:{ all -> 0x02db }
        if (r10 != 0) goto L_0x0172;	 Catch:{ all -> 0x02db }
    L_0x016d:
        r6 = r6.subList(r2, r8);	 Catch:{ all -> 0x02db }
        goto L_0x0175;	 Catch:{ all -> 0x02db }
    L_0x0172:
        r8 = r8 + 1;	 Catch:{ all -> 0x02db }
        goto L_0x014d;	 Catch:{ all -> 0x02db }
    L_0x0175:
        r7 = new com.google.android.gms.internal.measurement.zzgh;	 Catch:{ all -> 0x02db }
        r7.<init>();	 Catch:{ all -> 0x02db }
        r8 = r6.size();	 Catch:{ all -> 0x02db }
        r8 = new com.google.android.gms.internal.measurement.zzgi[r8];	 Catch:{ all -> 0x02db }
        r7.f20598a = r8;	 Catch:{ all -> 0x02db }
        r8 = new java.util.ArrayList;	 Catch:{ all -> 0x02db }
        r10 = r6.size();	 Catch:{ all -> 0x02db }
        r8.<init>(r10);	 Catch:{ all -> 0x02db }
        r10 = com.google.android.gms.measurement.internal.zzn.m27332w();	 Catch:{ all -> 0x02db }
        if (r10 == 0) goto L_0x019f;	 Catch:{ all -> 0x02db }
    L_0x0191:
        r10 = r1.f17616i;	 Catch:{ all -> 0x02db }
        r10 = r10.m22720b();	 Catch:{ all -> 0x02db }
        r10 = r10.m27344c(r5);	 Catch:{ all -> 0x02db }
        if (r10 == 0) goto L_0x019f;	 Catch:{ all -> 0x02db }
    L_0x019d:
        r10 = 1;	 Catch:{ all -> 0x02db }
        goto L_0x01a0;	 Catch:{ all -> 0x02db }
    L_0x019f:
        r10 = 0;	 Catch:{ all -> 0x02db }
    L_0x01a0:
        r11 = 0;	 Catch:{ all -> 0x02db }
    L_0x01a1:
        r12 = r7.f20598a;	 Catch:{ all -> 0x02db }
        r12 = r12.length;	 Catch:{ all -> 0x02db }
        if (r11 >= r12) goto L_0x01f9;	 Catch:{ all -> 0x02db }
    L_0x01a6:
        r12 = r7.f20598a;	 Catch:{ all -> 0x02db }
        r13 = r6.get(r11);	 Catch:{ all -> 0x02db }
        r13 = (android.util.Pair) r13;	 Catch:{ all -> 0x02db }
        r13 = r13.first;	 Catch:{ all -> 0x02db }
        r13 = (com.google.android.gms.internal.measurement.zzgi) r13;	 Catch:{ all -> 0x02db }
        r12[r11] = r13;	 Catch:{ all -> 0x02db }
        r12 = r6.get(r11);	 Catch:{ all -> 0x02db }
        r12 = (android.util.Pair) r12;	 Catch:{ all -> 0x02db }
        r12 = r12.second;	 Catch:{ all -> 0x02db }
        r12 = (java.lang.Long) r12;	 Catch:{ all -> 0x02db }
        r8.add(r12);	 Catch:{ all -> 0x02db }
        r12 = r7.f20598a;	 Catch:{ all -> 0x02db }
        r12 = r12[r11];	 Catch:{ all -> 0x02db }
        r13 = r1.f17616i;	 Catch:{ all -> 0x02db }
        r13 = r13.m22720b();	 Catch:{ all -> 0x02db }
        r13 = r13.m27350f();	 Catch:{ all -> 0x02db }
        r13 = java.lang.Long.valueOf(r13);	 Catch:{ all -> 0x02db }
        r12.f20630r = r13;	 Catch:{ all -> 0x02db }
        r12 = r7.f20598a;	 Catch:{ all -> 0x02db }
        r12 = r12[r11];	 Catch:{ all -> 0x02db }
        r13 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x02db }
        r12.f20616d = r13;	 Catch:{ all -> 0x02db }
        r12 = r7.f20598a;	 Catch:{ all -> 0x02db }
        r12 = r12[r11];	 Catch:{ all -> 0x02db }
        r13 = r1.f17616i;	 Catch:{ all -> 0x02db }
        r13.mo3173u();	 Catch:{ all -> 0x02db }
        r13 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x02db }
        r12.f20638z = r13;	 Catch:{ all -> 0x02db }
        if (r10 != 0) goto L_0x01f6;	 Catch:{ all -> 0x02db }
    L_0x01f0:
        r12 = r7.f20598a;	 Catch:{ all -> 0x02db }
        r12 = r12[r11];	 Catch:{ all -> 0x02db }
        r12.f20606G = r9;	 Catch:{ all -> 0x02db }
    L_0x01f6:
        r11 = r11 + 1;	 Catch:{ all -> 0x02db }
        goto L_0x01a1;	 Catch:{ all -> 0x02db }
    L_0x01f9:
        r6 = r1.f17616i;	 Catch:{ all -> 0x02db }
        r6 = r6.mo3172r();	 Catch:{ all -> 0x02db }
        r10 = 2;	 Catch:{ all -> 0x02db }
        r6 = r6.m28533a(r10);	 Catch:{ all -> 0x02db }
        if (r6 == 0) goto L_0x020e;	 Catch:{ all -> 0x02db }
    L_0x0206:
        r6 = r17.m22805f();	 Catch:{ all -> 0x02db }
        r9 = r6.m29785b(r7);	 Catch:{ all -> 0x02db }
    L_0x020e:
        r6 = r17.m22805f();	 Catch:{ all -> 0x02db }
        r14 = r6.m29783a(r7);	 Catch:{ all -> 0x02db }
        r6 = com.google.android.gms.measurement.internal.zzaf.f10736y;	 Catch:{ all -> 0x02db }
        r6 = r6.m12332b();	 Catch:{ all -> 0x02db }
        r6 = (java.lang.String) r6;	 Catch:{ all -> 0x02db }
        r13 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x029e }
        r13.<init>(r6);	 Catch:{ MalformedURLException -> 0x029e }
        r10 = r8.isEmpty();	 Catch:{ MalformedURLException -> 0x029e }
        r10 = r10 ^ r0;	 Catch:{ MalformedURLException -> 0x029e }
        com.google.android.gms.common.internal.Preconditions.checkArgument(r10);	 Catch:{ MalformedURLException -> 0x029e }
        r10 = r1.f17628u;	 Catch:{ MalformedURLException -> 0x029e }
        if (r10 == 0) goto L_0x023f;	 Catch:{ MalformedURLException -> 0x029e }
    L_0x022f:
        r8 = r1.f17616i;	 Catch:{ MalformedURLException -> 0x029e }
        r8 = r8.mo3172r();	 Catch:{ MalformedURLException -> 0x029e }
        r8 = r8.v_();	 Catch:{ MalformedURLException -> 0x029e }
        r10 = "Set uploading progress before finishing the previous upload";	 Catch:{ MalformedURLException -> 0x029e }
        r8.m12354a(r10);	 Catch:{ MalformedURLException -> 0x029e }
        goto L_0x0246;	 Catch:{ MalformedURLException -> 0x029e }
    L_0x023f:
        r10 = new java.util.ArrayList;	 Catch:{ MalformedURLException -> 0x029e }
        r10.<init>(r8);	 Catch:{ MalformedURLException -> 0x029e }
        r1.f17628u = r10;	 Catch:{ MalformedURLException -> 0x029e }
    L_0x0246:
        r8 = r1.f17616i;	 Catch:{ MalformedURLException -> 0x029e }
        r8 = r8.m22722c();	 Catch:{ MalformedURLException -> 0x029e }
        r8 = r8.f21384d;	 Catch:{ MalformedURLException -> 0x029e }
        r8.m12361a(r3);	 Catch:{ MalformedURLException -> 0x029e }
        r3 = "?";	 Catch:{ MalformedURLException -> 0x029e }
        r4 = r7.f20598a;	 Catch:{ MalformedURLException -> 0x029e }
        r4 = r4.length;	 Catch:{ MalformedURLException -> 0x029e }
        if (r4 <= 0) goto L_0x025e;	 Catch:{ MalformedURLException -> 0x029e }
    L_0x0258:
        r3 = r7.f20598a;	 Catch:{ MalformedURLException -> 0x029e }
        r3 = r3[r2];	 Catch:{ MalformedURLException -> 0x029e }
        r3 = r3.f20627o;	 Catch:{ MalformedURLException -> 0x029e }
    L_0x025e:
        r4 = r1.f17616i;	 Catch:{ MalformedURLException -> 0x029e }
        r4 = r4.mo3172r();	 Catch:{ MalformedURLException -> 0x029e }
        r4 = r4.m28555x();	 Catch:{ MalformedURLException -> 0x029e }
        r7 = "Uploading data. app, uncompressed size, data";	 Catch:{ MalformedURLException -> 0x029e }
        r8 = r14.length;	 Catch:{ MalformedURLException -> 0x029e }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ MalformedURLException -> 0x029e }
        r4.m12357a(r7, r3, r8, r9);	 Catch:{ MalformedURLException -> 0x029e }
        r1.f17624q = r0;	 Catch:{ MalformedURLException -> 0x029e }
        r11 = r17.m22800c();	 Catch:{ MalformedURLException -> 0x029e }
        r0 = new com.google.android.gms.measurement.internal.cj;	 Catch:{ MalformedURLException -> 0x029e }
        r0.<init>(r1, r5);	 Catch:{ MalformedURLException -> 0x029e }
        r11.mo4395d();	 Catch:{ MalformedURLException -> 0x029e }
        r11.m28438k();	 Catch:{ MalformedURLException -> 0x029e }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r13);	 Catch:{ MalformedURLException -> 0x029e }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r14);	 Catch:{ MalformedURLException -> 0x029e }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r0);	 Catch:{ MalformedURLException -> 0x029e }
        r3 = r11.mo3171q();	 Catch:{ MalformedURLException -> 0x029e }
        r4 = new com.google.android.gms.measurement.internal.h;	 Catch:{ MalformedURLException -> 0x029e }
        r15 = 0;	 Catch:{ MalformedURLException -> 0x029e }
        r10 = r4;	 Catch:{ MalformedURLException -> 0x029e }
        r12 = r5;	 Catch:{ MalformedURLException -> 0x029e }
        r16 = r0;	 Catch:{ MalformedURLException -> 0x029e }
        r10.<init>(r11, r12, r13, r14, r15, r16);	 Catch:{ MalformedURLException -> 0x029e }
        r3.m28571b(r4);	 Catch:{ MalformedURLException -> 0x029e }
        goto L_0x02d5;
    L_0x029e:
        r0 = r1.f17616i;	 Catch:{ all -> 0x02db }
        r0 = r0.mo3172r();	 Catch:{ all -> 0x02db }
        r0 = r0.v_();	 Catch:{ all -> 0x02db }
        r3 = "Failed to parse upload URL. Not uploading. appId";	 Catch:{ all -> 0x02db }
        r4 = com.google.android.gms.measurement.internal.zzap.m28525a(r5);	 Catch:{ all -> 0x02db }
        r0.m12356a(r3, r4, r6);	 Catch:{ all -> 0x02db }
        goto L_0x02d5;	 Catch:{ all -> 0x02db }
    L_0x02b2:
        r1.f17630w = r7;	 Catch:{ all -> 0x02db }
        r0 = r17.m22802d();	 Catch:{ all -> 0x02db }
        r5 = com.google.android.gms.measurement.internal.zzn.m27331k();	 Catch:{ all -> 0x02db }
        r7 = 0;	 Catch:{ all -> 0x02db }
        r3 = r3 - r5;	 Catch:{ all -> 0x02db }
        r0 = r0.m29411a(r3);	 Catch:{ all -> 0x02db }
        r3 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x02db }
        if (r3 != 0) goto L_0x02d5;	 Catch:{ all -> 0x02db }
    L_0x02c8:
        r3 = r17.m22802d();	 Catch:{ all -> 0x02db }
        r0 = r3.m29425b(r0);	 Catch:{ all -> 0x02db }
        if (r0 == 0) goto L_0x02d5;	 Catch:{ all -> 0x02db }
    L_0x02d2:
        r1.m22760a(r0);	 Catch:{ all -> 0x02db }
    L_0x02d5:
        r1.f17625r = r2;
        r17.m22781z();
        return;
    L_0x02db:
        r0 = move-exception;
        r1.f17625r = r2;
        r17.m22781z();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfa.j():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final boolean m22764a(java.lang.String r66, long r67) {
        /*
        r65 = this;
        r1 = r65;
        r2 = r65.m22802d();
        r2.m29437f();
        r2 = new com.google.android.gms.measurement.internal.zzfa$a;	 Catch:{ all -> 0x0ce4 }
        r3 = 0;
        r2.<init>();	 Catch:{ all -> 0x0ce4 }
        r4 = r65.m22802d();	 Catch:{ all -> 0x0ce4 }
        r5 = r1.f17630w;	 Catch:{ all -> 0x0ce4 }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r2);	 Catch:{ all -> 0x0ce4 }
        r4.mo4395d();	 Catch:{ all -> 0x0ce4 }
        r4.m28438k();	 Catch:{ all -> 0x0ce4 }
        r8 = -1;
        r10 = 2;
        r11 = 0;
        r12 = 1;
        r15 = r4.m29442y();	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r13 = android.text.TextUtils.isEmpty(r3);	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        if (r13 == 0) goto L_0x00a1;
    L_0x002d:
        r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r13 == 0) goto L_0x004c;
    L_0x0031:
        r13 = new java.lang.String[r10];	 Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
        r14 = java.lang.String.valueOf(r5);	 Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
        r13[r11] = r14;	 Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
        r14 = java.lang.String.valueOf(r67);	 Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
        r13[r12] = r14;	 Catch:{ SQLiteException -> 0x0046, all -> 0x0040 }
        goto L_0x0054;
    L_0x0040:
        r0 = move-exception;
        r5 = r1;
        r22 = r3;
        goto L_0x027a;
    L_0x0046:
        r0 = move-exception;
        r6 = r3;
        r7 = r6;
    L_0x0049:
        r3 = r0;
        goto L_0x0281;
    L_0x004c:
        r13 = new java.lang.String[r12];	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r14 = java.lang.String.valueOf(r67);	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r13[r11] = r14;	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
    L_0x0054:
        r14 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r14 == 0) goto L_0x005b;
    L_0x0058:
        r14 = "rowid <= ? and ";
        goto L_0x005d;
    L_0x005b:
        r14 = "";
    L_0x005d:
        r16 = java.lang.String.valueOf(r14);	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r7 = r16.length();	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r7 = r7 + 148;
        r3 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r3.<init>(r7);	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r7 = "select app_id, metadata_fingerprint from raw_events where ";
        r3.append(r7);	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r3.append(r14);	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r7 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;";
        r3.append(r7);	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r3 = r3.toString();	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r3 = r15.rawQuery(r3, r13);	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r7 = r3.moveToFirst();	 Catch:{ SQLiteException -> 0x0271, all -> 0x0040 }
        if (r7 != 0) goto L_0x008e;
    L_0x0087:
        if (r3 == 0) goto L_0x0297;
    L_0x0089:
        r3.close();	 Catch:{ all -> 0x0ce4 }
        goto L_0x0297;
    L_0x008e:
        r7 = r3.getString(r11);	 Catch:{ SQLiteException -> 0x0271, all -> 0x0040 }
        r13 = r3.getString(r12);	 Catch:{ SQLiteException -> 0x009e, all -> 0x0040 }
        r3.close();	 Catch:{ SQLiteException -> 0x009e, all -> 0x0040 }
        r23 = r3;
        r3 = r7;
        r7 = r13;
        goto L_0x00fc;
    L_0x009e:
        r0 = move-exception;
        r6 = r3;
        goto L_0x0049;
    L_0x00a1:
        r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r3 == 0) goto L_0x00b1;
    L_0x00a5:
        r3 = new java.lang.String[r10];	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r7 = 0;
        r3[r11] = r7;	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r7 = java.lang.String.valueOf(r5);	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r3[r12] = r7;	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        goto L_0x00b7;
    L_0x00b1:
        r3 = 0;
        r7 = new java.lang.String[]{r3};	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r3 = r7;
    L_0x00b7:
        r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r7 == 0) goto L_0x00be;
    L_0x00bb:
        r7 = " and rowid <= ?";
        goto L_0x00c0;
    L_0x00be:
        r7 = "";
    L_0x00c0:
        r13 = java.lang.String.valueOf(r7);	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r13 = r13.length();	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r13 = r13 + 84;
        r14 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r14.<init>(r13);	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r13 = "select metadata_fingerprint from raw_events where app_id = ?";
        r14.append(r13);	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r14.append(r7);	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r7 = " order by rowid limit 1;";
        r14.append(r7);	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r7 = r14.toString();	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r3 = r15.rawQuery(r7, r3);	 Catch:{ SQLiteException -> 0x027d, all -> 0x0276 }
        r7 = r3.moveToFirst();	 Catch:{ SQLiteException -> 0x0271, all -> 0x0040 }
        if (r7 != 0) goto L_0x00f1;
    L_0x00ea:
        if (r3 == 0) goto L_0x0297;
    L_0x00ec:
        r3.close();	 Catch:{ all -> 0x0ce4 }
        goto L_0x0297;
    L_0x00f1:
        r13 = r3.getString(r11);	 Catch:{ SQLiteException -> 0x0271, all -> 0x0040 }
        r3.close();	 Catch:{ SQLiteException -> 0x0271, all -> 0x0040 }
        r23 = r3;
        r7 = r13;
        r3 = 0;
    L_0x00fc:
        r14 = "raw_events_metadata";
        r13 = "metadata";
        r16 = new java.lang.String[]{r13};	 Catch:{ SQLiteException -> 0x026b, all -> 0x0266 }
        r17 = "app_id = ? and metadata_fingerprint = ?";
        r13 = new java.lang.String[r10];	 Catch:{ SQLiteException -> 0x026b, all -> 0x0266 }
        r13[r11] = r3;	 Catch:{ SQLiteException -> 0x026b, all -> 0x0266 }
        r13[r12] = r7;	 Catch:{ SQLiteException -> 0x026b, all -> 0x0266 }
        r18 = 0;
        r19 = 0;
        r20 = "rowid";
        r21 = "2";
        r24 = r13;
        r13 = r15;
        r25 = r15;
        r15 = r16;
        r16 = r17;
        r17 = r24;
        r15 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21);	 Catch:{ SQLiteException -> 0x026b, all -> 0x0266 }
        r13 = r15.moveToFirst();	 Catch:{ SQLiteException -> 0x0261, all -> 0x025b }
        if (r13 != 0) goto L_0x014c;
    L_0x0129:
        r5 = r4.mo3172r();	 Catch:{ SQLiteException -> 0x0147, all -> 0x0141 }
        r5 = r5.v_();	 Catch:{ SQLiteException -> 0x0147, all -> 0x0141 }
        r6 = "Raw event metadata record is missing. appId";
        r7 = com.google.android.gms.measurement.internal.zzap.m28525a(r3);	 Catch:{ SQLiteException -> 0x0147, all -> 0x0141 }
        r5.m12355a(r6, r7);	 Catch:{ SQLiteException -> 0x0147, all -> 0x0141 }
        if (r15 == 0) goto L_0x0297;
    L_0x013c:
        r15.close();	 Catch:{ all -> 0x0ce4 }
        goto L_0x0297;
    L_0x0141:
        r0 = move-exception;
        r5 = r1;
        r22 = r15;
        goto L_0x027a;
    L_0x0147:
        r0 = move-exception;
        r7 = r3;
        r6 = r15;
        goto L_0x0049;
    L_0x014c:
        r13 = r15.getBlob(r11);	 Catch:{ SQLiteException -> 0x0261, all -> 0x025b }
        r14 = r13.length;	 Catch:{ SQLiteException -> 0x0261, all -> 0x025b }
        r13 = com.google.android.gms.internal.measurement.zzyx.m12125a(r13, r11, r14);	 Catch:{ SQLiteException -> 0x0261, all -> 0x025b }
        r14 = new com.google.android.gms.internal.measurement.zzgi;	 Catch:{ SQLiteException -> 0x0261, all -> 0x025b }
        r14.<init>();	 Catch:{ SQLiteException -> 0x0261, all -> 0x025b }
        r14.mo4347a(r13);	 Catch:{ IOException -> 0x023d }
        r13 = r15.moveToNext();	 Catch:{ SQLiteException -> 0x0261, all -> 0x025b }
        if (r13 == 0) goto L_0x0174;
    L_0x0163:
        r13 = r4.mo3172r();	 Catch:{ SQLiteException -> 0x0147, all -> 0x0141 }
        r13 = r13.m28540i();	 Catch:{ SQLiteException -> 0x0147, all -> 0x0141 }
        r10 = "Get multiple raw event metadata records, expected one. appId";
        r12 = com.google.android.gms.measurement.internal.zzap.m28525a(r3);	 Catch:{ SQLiteException -> 0x0147, all -> 0x0141 }
        r13.m12355a(r10, r12);	 Catch:{ SQLiteException -> 0x0147, all -> 0x0141 }
    L_0x0174:
        r15.close();	 Catch:{ SQLiteException -> 0x0261, all -> 0x025b }
        r2.mo3197a(r14);	 Catch:{ SQLiteException -> 0x0261, all -> 0x025b }
        r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
        if (r10 == 0) goto L_0x0194;
    L_0x017e:
        r10 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
        r12 = 3;
        r13 = new java.lang.String[r12];	 Catch:{ SQLiteException -> 0x0147, all -> 0x0141 }
        r13[r11] = r3;	 Catch:{ SQLiteException -> 0x0147, all -> 0x0141 }
        r12 = 1;
        r13[r12] = r7;	 Catch:{ SQLiteException -> 0x0147, all -> 0x0141 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ SQLiteException -> 0x0147, all -> 0x0141 }
        r6 = 2;
        r13[r6] = r5;	 Catch:{ SQLiteException -> 0x0147, all -> 0x0141 }
        r16 = r10;
        r17 = r13;
        goto L_0x01a2;
    L_0x0194:
        r5 = "app_id = ? and metadata_fingerprint = ?";
        r6 = 2;
        r10 = new java.lang.String[r6];	 Catch:{ SQLiteException -> 0x0261, all -> 0x025b }
        r10[r11] = r3;	 Catch:{ SQLiteException -> 0x0261, all -> 0x025b }
        r6 = 1;
        r10[r6] = r7;	 Catch:{ SQLiteException -> 0x0261, all -> 0x025b }
        r16 = r5;
        r17 = r10;
    L_0x01a2:
        r14 = "raw_events";
        r5 = "rowid";
        r6 = "name";
        r7 = "timestamp";
        r10 = "data";
        r5 = new java.lang.String[]{r5, r6, r7, r10};	 Catch:{ SQLiteException -> 0x0261, all -> 0x025b }
        r18 = 0;
        r19 = 0;
        r20 = "rowid";
        r21 = 0;
        r13 = r25;
        r6 = r15;
        r15 = r5;
        r5 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21);	 Catch:{ SQLiteException -> 0x0259, all -> 0x0257 }
        r6 = r5.moveToFirst();	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        if (r6 != 0) goto L_0x01de;
    L_0x01c6:
        r6 = r4.mo3172r();	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        r6 = r6.m28540i();	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        r7 = "Raw event data disappeared while in transaction. appId";
        r10 = com.google.android.gms.measurement.internal.zzap.m28525a(r3);	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        r6.m12355a(r7, r10);	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        if (r5 == 0) goto L_0x0297;
    L_0x01d9:
        r5.close();	 Catch:{ all -> 0x0ce4 }
        goto L_0x0297;
    L_0x01de:
        r6 = r5.getLong(r11);	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        r10 = 3;
        r12 = r5.getBlob(r10);	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        r10 = r12.length;	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        r10 = com.google.android.gms.internal.measurement.zzyx.m12125a(r12, r11, r10);	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        r12 = new com.google.android.gms.internal.measurement.zzgf;	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        r12.<init>();	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        r12.mo4347a(r10);	 Catch:{ IOException -> 0x0213 }
        r10 = 1;
        r13 = r5.getString(r10);	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        r12.f20588b = r13;	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        r10 = 2;
        r13 = r5.getLong(r10);	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        r10 = java.lang.Long.valueOf(r13);	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        r12.f20589c = r10;	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        r6 = r2.mo3198a(r6, r12);	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        if (r6 != 0) goto L_0x0226;
    L_0x020c:
        if (r5 == 0) goto L_0x0297;
    L_0x020e:
        r5.close();	 Catch:{ all -> 0x0ce4 }
        goto L_0x0297;
    L_0x0213:
        r0 = move-exception;
        r6 = r0;
        r7 = r4.mo3172r();	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        r7 = r7.v_();	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        r10 = "Data loss. Failed to merge raw event. appId";
        r12 = com.google.android.gms.measurement.internal.zzap.m28525a(r3);	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        r7.m12356a(r10, r12, r6);	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
    L_0x0226:
        r6 = r5.moveToNext();	 Catch:{ SQLiteException -> 0x0238, all -> 0x0233 }
        if (r6 != 0) goto L_0x01de;
    L_0x022c:
        if (r5 == 0) goto L_0x0297;
    L_0x022e:
        r5.close();	 Catch:{ all -> 0x0ce4 }
        goto L_0x0297;
    L_0x0233:
        r0 = move-exception;
        r22 = r5;
        r5 = r1;
        goto L_0x027a;
    L_0x0238:
        r0 = move-exception;
        r7 = r3;
        r6 = r5;
        goto L_0x0049;
    L_0x023d:
        r0 = move-exception;
        r5 = r0;
        r6 = r15;
        r7 = r4.mo3172r();	 Catch:{ SQLiteException -> 0x0259, all -> 0x0257 }
        r7 = r7.v_();	 Catch:{ SQLiteException -> 0x0259, all -> 0x0257 }
        r10 = "Data loss. Failed to merge raw event metadata. appId";
        r12 = com.google.android.gms.measurement.internal.zzap.m28525a(r3);	 Catch:{ SQLiteException -> 0x0259, all -> 0x0257 }
        r7.m12356a(r10, r12, r5);	 Catch:{ SQLiteException -> 0x0259, all -> 0x0257 }
        if (r6 == 0) goto L_0x0297;
    L_0x0253:
        r6.close();	 Catch:{ all -> 0x0ce4 }
        goto L_0x0297;
    L_0x0257:
        r0 = move-exception;
        goto L_0x025d;
    L_0x0259:
        r0 = move-exception;
        goto L_0x0263;
    L_0x025b:
        r0 = move-exception;
        r6 = r15;
    L_0x025d:
        r5 = r1;
        r22 = r6;
        goto L_0x027a;
    L_0x0261:
        r0 = move-exception;
        r6 = r15;
    L_0x0263:
        r7 = r3;
        goto L_0x0049;
    L_0x0266:
        r0 = move-exception;
        r5 = r1;
        r22 = r23;
        goto L_0x027a;
    L_0x026b:
        r0 = move-exception;
        r7 = r3;
        r6 = r23;
        goto L_0x0049;
    L_0x0271:
        r0 = move-exception;
        r6 = r3;
        r7 = 0;
        goto L_0x0049;
    L_0x0276:
        r0 = move-exception;
        r5 = r1;
        r22 = 0;
    L_0x027a:
        r1 = r0;
        goto L_0x0cdb;
    L_0x027d:
        r0 = move-exception;
        r3 = r0;
        r6 = 0;
        r7 = 0;
    L_0x0281:
        r4 = r4.mo3172r();	 Catch:{ all -> 0x0cd6 }
        r4 = r4.v_();	 Catch:{ all -> 0x0cd6 }
        r5 = "Data loss. Error selecting raw event. appId";
        r7 = com.google.android.gms.measurement.internal.zzap.m28525a(r7);	 Catch:{ all -> 0x0cd6 }
        r4.m12356a(r5, r7, r3);	 Catch:{ all -> 0x0cd6 }
        if (r6 == 0) goto L_0x0297;
    L_0x0294:
        r6.close();	 Catch:{ all -> 0x0ce4 }
    L_0x0297:
        r3 = r2.f17605c;	 Catch:{ all -> 0x0ce4 }
        if (r3 == 0) goto L_0x02a6;
    L_0x029b:
        r3 = r2.f17605c;	 Catch:{ all -> 0x0ce4 }
        r3 = r3.isEmpty();	 Catch:{ all -> 0x0ce4 }
        if (r3 == 0) goto L_0x02a4;
    L_0x02a3:
        goto L_0x02a6;
    L_0x02a4:
        r3 = 0;
        goto L_0x02a7;
    L_0x02a6:
        r3 = 1;
    L_0x02a7:
        if (r3 != 0) goto L_0x0cc5;
    L_0x02a9:
        r3 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r4 = r2.f17605c;	 Catch:{ all -> 0x0ce4 }
        r4 = r4.size();	 Catch:{ all -> 0x0ce4 }
        r4 = new com.google.android.gms.internal.measurement.zzgf[r4];	 Catch:{ all -> 0x0ce4 }
        r3.f20614b = r4;	 Catch:{ all -> 0x0ce4 }
        r4 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r4 = r4.m22720b();	 Catch:{ all -> 0x0ce4 }
        r5 = r3.f20627o;	 Catch:{ all -> 0x0ce4 }
        r4 = r4.m27349e(r5);	 Catch:{ all -> 0x0ce4 }
        r7 = 0;
        r10 = 0;
        r12 = 0;
        r13 = 0;
    L_0x02c6:
        r15 = r2.f17605c;	 Catch:{ all -> 0x0ce4 }
        r15 = r15.size();	 Catch:{ all -> 0x0ce4 }
        r16 = 1;
        if (r7 >= r15) goto L_0x06d5;
    L_0x02d0:
        r15 = r2.f17605c;	 Catch:{ all -> 0x0ce4 }
        r15 = r15.get(r7);	 Catch:{ all -> 0x0ce4 }
        r15 = (com.google.android.gms.internal.measurement.zzgf) r15;	 Catch:{ all -> 0x0ce4 }
        r8 = r65.m22774p();	 Catch:{ all -> 0x0ce4 }
        r9 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r9 = r9.f20627o;	 Catch:{ all -> 0x0ce4 }
        r5 = r15.f20588b;	 Catch:{ all -> 0x0ce4 }
        r5 = r8.m29535b(r9, r5);	 Catch:{ all -> 0x0ce4 }
        if (r5 == 0) goto L_0x0355;
    L_0x02e8:
        r5 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r5 = r5.mo3172r();	 Catch:{ all -> 0x0ce4 }
        r5 = r5.m28540i();	 Catch:{ all -> 0x0ce4 }
        r6 = "Dropping blacklisted raw event. appId";
        r8 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r8 = r8.f20627o;	 Catch:{ all -> 0x0ce4 }
        r8 = com.google.android.gms.measurement.internal.zzap.m28525a(r8);	 Catch:{ all -> 0x0ce4 }
        r9 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r9 = r9.m22730k();	 Catch:{ all -> 0x0ce4 }
        r11 = r15.f20588b;	 Catch:{ all -> 0x0ce4 }
        r9 = r9.m28503a(r11);	 Catch:{ all -> 0x0ce4 }
        r5.m12356a(r6, r8, r9);	 Catch:{ all -> 0x0ce4 }
        r5 = r65.m22774p();	 Catch:{ all -> 0x0ce4 }
        r6 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.f20627o;	 Catch:{ all -> 0x0ce4 }
        r5 = r5.m29544f(r6);	 Catch:{ all -> 0x0ce4 }
        if (r5 != 0) goto L_0x032a;
    L_0x0319:
        r5 = r65.m22774p();	 Catch:{ all -> 0x0ce4 }
        r6 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.f20627o;	 Catch:{ all -> 0x0ce4 }
        r5 = r5.m29546g(r6);	 Catch:{ all -> 0x0ce4 }
        if (r5 == 0) goto L_0x0328;
    L_0x0327:
        goto L_0x032a;
    L_0x0328:
        r5 = 0;
        goto L_0x032b;
    L_0x032a:
        r5 = 1;
    L_0x032b:
        if (r5 != 0) goto L_0x0350;
    L_0x032d:
        r5 = "_err";
        r6 = r15.f20588b;	 Catch:{ all -> 0x0ce4 }
        r5 = r5.equals(r6);	 Catch:{ all -> 0x0ce4 }
        if (r5 != 0) goto L_0x0350;
    L_0x0337:
        r5 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r16 = r5.m22729j();	 Catch:{ all -> 0x0ce4 }
        r5 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r5 = r5.f20627o;	 Catch:{ all -> 0x0ce4 }
        r18 = 11;
        r19 = "_ev";
        r6 = r15.f20588b;	 Catch:{ all -> 0x0ce4 }
        r21 = 0;
        r17 = r5;
        r20 = r6;
        r16.m28619a(r17, r18, r19, r20, r21);	 Catch:{ all -> 0x0ce4 }
    L_0x0350:
        r40 = r7;
        r9 = 3;
        goto L_0x06ce;
    L_0x0355:
        r5 = r65.m22774p();	 Catch:{ all -> 0x0ce4 }
        r6 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.f20627o;	 Catch:{ all -> 0x0ce4 }
        r8 = r15.f20588b;	 Catch:{ all -> 0x0ce4 }
        r5 = r5.m29538c(r6, r8);	 Catch:{ all -> 0x0ce4 }
        if (r5 != 0) goto L_0x03ad;
    L_0x0365:
        r65.m22805f();	 Catch:{ all -> 0x0ce4 }
        r8 = r15.f20588b;	 Catch:{ all -> 0x0ce4 }
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8);	 Catch:{ all -> 0x0ce4 }
        r9 = r8.hashCode();	 Catch:{ all -> 0x0ce4 }
        r11 = 94660; // 0x171c4 float:1.32647E-40 double:4.67683E-319;
        if (r9 == r11) goto L_0x0395;
    L_0x0376:
        r11 = 95025; // 0x17331 float:1.33158E-40 double:4.69486E-319;
        if (r9 == r11) goto L_0x038b;
    L_0x037b:
        r11 = 95027; // 0x17333 float:1.33161E-40 double:4.69496E-319;
        if (r9 == r11) goto L_0x0381;
    L_0x0380:
        goto L_0x039f;
    L_0x0381:
        r9 = "_ui";
        r8 = r8.equals(r9);	 Catch:{ all -> 0x0ce4 }
        if (r8 == 0) goto L_0x039f;
    L_0x0389:
        r8 = 1;
        goto L_0x03a0;
    L_0x038b:
        r9 = "_ug";
        r8 = r8.equals(r9);	 Catch:{ all -> 0x0ce4 }
        if (r8 == 0) goto L_0x039f;
    L_0x0393:
        r8 = 2;
        goto L_0x03a0;
    L_0x0395:
        r9 = "_in";
        r8 = r8.equals(r9);	 Catch:{ all -> 0x0ce4 }
        if (r8 == 0) goto L_0x039f;
    L_0x039d:
        r8 = 0;
        goto L_0x03a0;
    L_0x039f:
        r8 = -1;
    L_0x03a0:
        switch(r8) {
            case 0: goto L_0x03a5;
            case 1: goto L_0x03a5;
            case 2: goto L_0x03a5;
            default: goto L_0x03a3;
        };	 Catch:{ all -> 0x0ce4 }
    L_0x03a3:
        r8 = 0;
        goto L_0x03a6;
    L_0x03a5:
        r8 = 1;
    L_0x03a6:
        if (r8 == 0) goto L_0x03a9;
    L_0x03a8:
        goto L_0x03ad;
    L_0x03a9:
        r40 = r7;
        goto L_0x05ad;
    L_0x03ad:
        r8 = r15.f20587a;	 Catch:{ all -> 0x0ce4 }
        if (r8 != 0) goto L_0x03b6;
    L_0x03b1:
        r8 = 0;
        r9 = new com.google.android.gms.internal.measurement.zzgg[r8];	 Catch:{ all -> 0x0ce4 }
        r15.f20587a = r9;	 Catch:{ all -> 0x0ce4 }
    L_0x03b6:
        r8 = r15.f20587a;	 Catch:{ all -> 0x0ce4 }
        r9 = r8.length;	 Catch:{ all -> 0x0ce4 }
        r11 = 0;
        r18 = 0;
        r19 = 0;
    L_0x03be:
        if (r11 >= r9) goto L_0x03f2;
    L_0x03c0:
        r6 = r8[r11];	 Catch:{ all -> 0x0ce4 }
        r27 = r8;
        r8 = "_c";
        r28 = r9;
        r9 = r6.f20593a;	 Catch:{ all -> 0x0ce4 }
        r8 = r8.equals(r9);	 Catch:{ all -> 0x0ce4 }
        if (r8 == 0) goto L_0x03d9;
    L_0x03d0:
        r8 = java.lang.Long.valueOf(r16);	 Catch:{ all -> 0x0ce4 }
        r6.f20595c = r8;	 Catch:{ all -> 0x0ce4 }
        r18 = 1;
        goto L_0x03eb;
    L_0x03d9:
        r8 = "_r";
        r9 = r6.f20593a;	 Catch:{ all -> 0x0ce4 }
        r8 = r8.equals(r9);	 Catch:{ all -> 0x0ce4 }
        if (r8 == 0) goto L_0x03eb;
    L_0x03e3:
        r8 = java.lang.Long.valueOf(r16);	 Catch:{ all -> 0x0ce4 }
        r6.f20595c = r8;	 Catch:{ all -> 0x0ce4 }
        r19 = 1;
    L_0x03eb:
        r11 = r11 + 1;
        r8 = r27;
        r9 = r28;
        goto L_0x03be;
    L_0x03f2:
        if (r18 != 0) goto L_0x0434;
    L_0x03f4:
        if (r5 == 0) goto L_0x0434;
    L_0x03f6:
        r6 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.mo3172r();	 Catch:{ all -> 0x0ce4 }
        r6 = r6.m28555x();	 Catch:{ all -> 0x0ce4 }
        r8 = "Marking event as conversion";
        r9 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r9 = r9.m22730k();	 Catch:{ all -> 0x0ce4 }
        r11 = r15.f20588b;	 Catch:{ all -> 0x0ce4 }
        r9 = r9.m28503a(r11);	 Catch:{ all -> 0x0ce4 }
        r6.m12355a(r8, r9);	 Catch:{ all -> 0x0ce4 }
        r6 = r15.f20587a;	 Catch:{ all -> 0x0ce4 }
        r8 = r15.f20587a;	 Catch:{ all -> 0x0ce4 }
        r8 = r8.length;	 Catch:{ all -> 0x0ce4 }
        r9 = 1;
        r8 = r8 + r9;
        r6 = java.util.Arrays.copyOf(r6, r8);	 Catch:{ all -> 0x0ce4 }
        r6 = (com.google.android.gms.internal.measurement.zzgg[]) r6;	 Catch:{ all -> 0x0ce4 }
        r8 = new com.google.android.gms.internal.measurement.zzgg;	 Catch:{ all -> 0x0ce4 }
        r8.<init>();	 Catch:{ all -> 0x0ce4 }
        r9 = "_c";
        r8.f20593a = r9;	 Catch:{ all -> 0x0ce4 }
        r9 = java.lang.Long.valueOf(r16);	 Catch:{ all -> 0x0ce4 }
        r8.f20595c = r9;	 Catch:{ all -> 0x0ce4 }
        r9 = r6.length;	 Catch:{ all -> 0x0ce4 }
        r11 = 1;
        r9 = r9 - r11;
        r6[r9] = r8;	 Catch:{ all -> 0x0ce4 }
        r15.f20587a = r6;	 Catch:{ all -> 0x0ce4 }
    L_0x0434:
        if (r19 != 0) goto L_0x0474;
    L_0x0436:
        r6 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.mo3172r();	 Catch:{ all -> 0x0ce4 }
        r6 = r6.m28555x();	 Catch:{ all -> 0x0ce4 }
        r8 = "Marking event as real-time";
        r9 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r9 = r9.m22730k();	 Catch:{ all -> 0x0ce4 }
        r11 = r15.f20588b;	 Catch:{ all -> 0x0ce4 }
        r9 = r9.m28503a(r11);	 Catch:{ all -> 0x0ce4 }
        r6.m12355a(r8, r9);	 Catch:{ all -> 0x0ce4 }
        r6 = r15.f20587a;	 Catch:{ all -> 0x0ce4 }
        r8 = r15.f20587a;	 Catch:{ all -> 0x0ce4 }
        r8 = r8.length;	 Catch:{ all -> 0x0ce4 }
        r9 = 1;
        r8 = r8 + r9;
        r6 = java.util.Arrays.copyOf(r6, r8);	 Catch:{ all -> 0x0ce4 }
        r6 = (com.google.android.gms.internal.measurement.zzgg[]) r6;	 Catch:{ all -> 0x0ce4 }
        r8 = new com.google.android.gms.internal.measurement.zzgg;	 Catch:{ all -> 0x0ce4 }
        r8.<init>();	 Catch:{ all -> 0x0ce4 }
        r9 = "_r";
        r8.f20593a = r9;	 Catch:{ all -> 0x0ce4 }
        r9 = java.lang.Long.valueOf(r16);	 Catch:{ all -> 0x0ce4 }
        r8.f20595c = r9;	 Catch:{ all -> 0x0ce4 }
        r9 = r6.length;	 Catch:{ all -> 0x0ce4 }
        r11 = 1;
        r9 = r9 - r11;
        r6[r9] = r8;	 Catch:{ all -> 0x0ce4 }
        r15.f20587a = r6;	 Catch:{ all -> 0x0ce4 }
    L_0x0474:
        r27 = r65.m22802d();	 Catch:{ all -> 0x0ce4 }
        r28 = r65.m22778w();	 Catch:{ all -> 0x0ce4 }
        r6 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.f20627o;	 Catch:{ all -> 0x0ce4 }
        r31 = 0;
        r32 = 0;
        r33 = 0;
        r34 = 0;
        r35 = 1;
        r30 = r6;
        r6 = r27.m29410a(r28, r30, r31, r32, r33, r34, r35);	 Catch:{ all -> 0x0ce4 }
        r8 = r6.f10790e;	 Catch:{ all -> 0x0ce4 }
        r6 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.m22720b();	 Catch:{ all -> 0x0ce4 }
        r11 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r11 = r11.f20627o;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.m27335a(r11);	 Catch:{ all -> 0x0ce4 }
        r36 = r12;
        r11 = (long) r6;	 Catch:{ all -> 0x0ce4 }
        r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1));
        if (r6 <= 0) goto L_0x04df;
    L_0x04a7:
        r6 = 0;
    L_0x04a8:
        r8 = r15.f20587a;	 Catch:{ all -> 0x0ce4 }
        r8 = r8.length;	 Catch:{ all -> 0x0ce4 }
        if (r6 >= r8) goto L_0x04dc;
    L_0x04ad:
        r8 = "_r";
        r9 = r15.f20587a;	 Catch:{ all -> 0x0ce4 }
        r9 = r9[r6];	 Catch:{ all -> 0x0ce4 }
        r9 = r9.f20593a;	 Catch:{ all -> 0x0ce4 }
        r8 = r8.equals(r9);	 Catch:{ all -> 0x0ce4 }
        if (r8 == 0) goto L_0x04d9;
    L_0x04bb:
        r8 = r15.f20587a;	 Catch:{ all -> 0x0ce4 }
        r8 = r8.length;	 Catch:{ all -> 0x0ce4 }
        r9 = 1;
        r8 = r8 - r9;
        r8 = new com.google.android.gms.internal.measurement.zzgg[r8];	 Catch:{ all -> 0x0ce4 }
        if (r6 <= 0) goto L_0x04ca;
    L_0x04c4:
        r9 = r15.f20587a;	 Catch:{ all -> 0x0ce4 }
        r11 = 0;
        java.lang.System.arraycopy(r9, r11, r8, r11, r6);	 Catch:{ all -> 0x0ce4 }
    L_0x04ca:
        r9 = r8.length;	 Catch:{ all -> 0x0ce4 }
        if (r6 >= r9) goto L_0x04d6;
    L_0x04cd:
        r9 = r15.f20587a;	 Catch:{ all -> 0x0ce4 }
        r11 = r6 + 1;
        r12 = r8.length;	 Catch:{ all -> 0x0ce4 }
        r12 = r12 - r6;
        java.lang.System.arraycopy(r9, r11, r8, r6, r12);	 Catch:{ all -> 0x0ce4 }
    L_0x04d6:
        r15.f20587a = r8;	 Catch:{ all -> 0x0ce4 }
        goto L_0x04dc;
    L_0x04d9:
        r6 = r6 + 1;
        goto L_0x04a8;
    L_0x04dc:
        r12 = r36;
        goto L_0x04e0;
    L_0x04df:
        r12 = 1;
    L_0x04e0:
        r6 = r15.f20588b;	 Catch:{ all -> 0x0ce4 }
        r6 = com.google.android.gms.measurement.internal.zzfk.m28595a(r6);	 Catch:{ all -> 0x0ce4 }
        if (r6 == 0) goto L_0x05a7;
    L_0x04e8:
        if (r5 == 0) goto L_0x05a7;
    L_0x04ea:
        r27 = r65.m22802d();	 Catch:{ all -> 0x0ce4 }
        r28 = r65.m22778w();	 Catch:{ all -> 0x0ce4 }
        r6 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.f20627o;	 Catch:{ all -> 0x0ce4 }
        r31 = 0;
        r32 = 0;
        r33 = 1;
        r34 = 0;
        r35 = 0;
        r30 = r6;
        r6 = r27.m29410a(r28, r30, r31, r32, r33, r34, r35);	 Catch:{ all -> 0x0ce4 }
        r8 = r6.f10788c;	 Catch:{ all -> 0x0ce4 }
        r6 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.m22720b();	 Catch:{ all -> 0x0ce4 }
        r11 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r11 = r11.f20627o;	 Catch:{ all -> 0x0ce4 }
        r37 = r12;
        r12 = com.google.android.gms.measurement.internal.zzaf.f10733v;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.m27340b(r11, r12);	 Catch:{ all -> 0x0ce4 }
        r11 = (long) r6;	 Catch:{ all -> 0x0ce4 }
        r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1));
        if (r6 <= 0) goto L_0x05a4;
    L_0x051f:
        r6 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.mo3172r();	 Catch:{ all -> 0x0ce4 }
        r6 = r6.m28540i();	 Catch:{ all -> 0x0ce4 }
        r8 = "Too many conversions. Not logging as conversion. appId";
        r9 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r9 = r9.f20627o;	 Catch:{ all -> 0x0ce4 }
        r9 = com.google.android.gms.measurement.internal.zzap.m28525a(r9);	 Catch:{ all -> 0x0ce4 }
        r6.m12355a(r8, r9);	 Catch:{ all -> 0x0ce4 }
        r6 = r15.f20587a;	 Catch:{ all -> 0x0ce4 }
        r8 = r6.length;	 Catch:{ all -> 0x0ce4 }
        r9 = 0;
        r11 = 0;
        r12 = 0;
    L_0x053c:
        if (r9 >= r8) goto L_0x0566;
    L_0x053e:
        r38 = r8;
        r8 = r6[r9];	 Catch:{ all -> 0x0ce4 }
        r39 = r6;
        r6 = "_c";
        r40 = r7;
        r7 = r8.f20593a;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.equals(r7);	 Catch:{ all -> 0x0ce4 }
        if (r6 == 0) goto L_0x0552;
    L_0x0550:
        r12 = r8;
        goto L_0x055d;
    L_0x0552:
        r6 = "_err";
        r7 = r8.f20593a;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.equals(r7);	 Catch:{ all -> 0x0ce4 }
        if (r6 == 0) goto L_0x055d;
    L_0x055c:
        r11 = 1;
    L_0x055d:
        r9 = r9 + 1;
        r8 = r38;
        r6 = r39;
        r7 = r40;
        goto L_0x053c;
    L_0x0566:
        r40 = r7;
        if (r11 == 0) goto L_0x057d;
    L_0x056a:
        if (r12 == 0) goto L_0x057d;
    L_0x056c:
        r6 = r15.f20587a;	 Catch:{ all -> 0x0ce4 }
        r7 = 1;
        r8 = new com.google.android.gms.internal.measurement.zzgg[r7];	 Catch:{ all -> 0x0ce4 }
        r7 = 0;
        r8[r7] = r12;	 Catch:{ all -> 0x0ce4 }
        r6 = com.google.android.gms.common.util.ArrayUtils.removeAll(r6, r8);	 Catch:{ all -> 0x0ce4 }
        r6 = (com.google.android.gms.internal.measurement.zzgg[]) r6;	 Catch:{ all -> 0x0ce4 }
        r15.f20587a = r6;	 Catch:{ all -> 0x0ce4 }
        goto L_0x05ab;
    L_0x057d:
        if (r12 == 0) goto L_0x058c;
    L_0x057f:
        r6 = "_err";
        r12.f20593a = r6;	 Catch:{ all -> 0x0ce4 }
        r6 = 10;
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x0ce4 }
        r12.f20595c = r6;	 Catch:{ all -> 0x0ce4 }
        goto L_0x05ab;
    L_0x058c:
        r6 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.mo3172r();	 Catch:{ all -> 0x0ce4 }
        r6 = r6.v_();	 Catch:{ all -> 0x0ce4 }
        r7 = "Did not find conversion parameter. appId";
        r8 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r8 = r8.f20627o;	 Catch:{ all -> 0x0ce4 }
        r8 = com.google.android.gms.measurement.internal.zzap.m28525a(r8);	 Catch:{ all -> 0x0ce4 }
        r6.m12355a(r7, r8);	 Catch:{ all -> 0x0ce4 }
        goto L_0x05ab;
    L_0x05a4:
        r40 = r7;
        goto L_0x05ab;
    L_0x05a7:
        r40 = r7;
        r37 = r12;
    L_0x05ab:
        r12 = r37;
    L_0x05ad:
        r6 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.m22720b();	 Catch:{ all -> 0x0ce4 }
        r7 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r7 = r7.f20627o;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.m27361l(r7);	 Catch:{ all -> 0x0ce4 }
        if (r6 == 0) goto L_0x066d;
    L_0x05bd:
        if (r5 == 0) goto L_0x066d;
    L_0x05bf:
        r5 = r15.f20587a;	 Catch:{ all -> 0x0ce4 }
        r6 = 0;
        r7 = -1;
        r8 = -1;
    L_0x05c4:
        r9 = r5.length;	 Catch:{ all -> 0x0ce4 }
        if (r6 >= r9) goto L_0x05e5;
    L_0x05c7:
        r9 = "value";
        r11 = r5[r6];	 Catch:{ all -> 0x0ce4 }
        r11 = r11.f20593a;	 Catch:{ all -> 0x0ce4 }
        r9 = r9.equals(r11);	 Catch:{ all -> 0x0ce4 }
        if (r9 == 0) goto L_0x05d5;
    L_0x05d3:
        r7 = r6;
        goto L_0x05e2;
    L_0x05d5:
        r9 = "currency";
        r11 = r5[r6];	 Catch:{ all -> 0x0ce4 }
        r11 = r11.f20593a;	 Catch:{ all -> 0x0ce4 }
        r9 = r9.equals(r11);	 Catch:{ all -> 0x0ce4 }
        if (r9 == 0) goto L_0x05e2;
    L_0x05e1:
        r8 = r6;
    L_0x05e2:
        r6 = r6 + 1;
        goto L_0x05c4;
    L_0x05e5:
        r6 = -1;
        if (r7 == r6) goto L_0x0615;
    L_0x05e8:
        r6 = r5[r7];	 Catch:{ all -> 0x0ce4 }
        r6 = r6.f20595c;	 Catch:{ all -> 0x0ce4 }
        if (r6 != 0) goto L_0x0617;
    L_0x05ee:
        r6 = r5[r7];	 Catch:{ all -> 0x0ce4 }
        r6 = r6.f20596d;	 Catch:{ all -> 0x0ce4 }
        if (r6 != 0) goto L_0x0617;
    L_0x05f4:
        r6 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.mo3172r();	 Catch:{ all -> 0x0ce4 }
        r6 = r6.m28542k();	 Catch:{ all -> 0x0ce4 }
        r8 = "Value must be specified with a numeric type.";
        r6.m12354a(r8);	 Catch:{ all -> 0x0ce4 }
        r5 = m22767a(r5, r7);	 Catch:{ all -> 0x0ce4 }
        r6 = "_c";
        r5 = m22769a(r5, r6);	 Catch:{ all -> 0x0ce4 }
        r6 = 18;
        r7 = "value";
        r5 = m22768a(r5, r6, r7);	 Catch:{ all -> 0x0ce4 }
    L_0x0615:
        r9 = 3;
        goto L_0x066a;
    L_0x0617:
        r6 = -1;
        if (r8 != r6) goto L_0x061d;
    L_0x061a:
        r6 = 1;
        r9 = 3;
        goto L_0x0647;
    L_0x061d:
        r6 = r5[r8];	 Catch:{ all -> 0x0ce4 }
        r6 = r6.f20594b;	 Catch:{ all -> 0x0ce4 }
        if (r6 == 0) goto L_0x0645;
    L_0x0623:
        r8 = r6.length();	 Catch:{ all -> 0x0ce4 }
        r9 = 3;
        if (r8 == r9) goto L_0x062b;
    L_0x062a:
        goto L_0x0646;
    L_0x062b:
        r8 = 0;
    L_0x062c:
        r11 = r6.length();	 Catch:{ all -> 0x0ce4 }
        if (r8 >= r11) goto L_0x0643;
    L_0x0632:
        r11 = r6.codePointAt(r8);	 Catch:{ all -> 0x0ce4 }
        r16 = java.lang.Character.isLetter(r11);	 Catch:{ all -> 0x0ce4 }
        if (r16 != 0) goto L_0x063d;
    L_0x063c:
        goto L_0x0646;
    L_0x063d:
        r11 = java.lang.Character.charCount(r11);	 Catch:{ all -> 0x0ce4 }
        r8 = r8 + r11;
        goto L_0x062c;
    L_0x0643:
        r6 = 0;
        goto L_0x0647;
    L_0x0645:
        r9 = 3;
    L_0x0646:
        r6 = 1;
    L_0x0647:
        if (r6 == 0) goto L_0x066a;
    L_0x0649:
        r6 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.mo3172r();	 Catch:{ all -> 0x0ce4 }
        r6 = r6.m28542k();	 Catch:{ all -> 0x0ce4 }
        r8 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.";
        r6.m12354a(r8);	 Catch:{ all -> 0x0ce4 }
        r5 = m22767a(r5, r7);	 Catch:{ all -> 0x0ce4 }
        r6 = "_c";
        r5 = m22769a(r5, r6);	 Catch:{ all -> 0x0ce4 }
        r6 = 19;
        r7 = "currency";
        r5 = m22768a(r5, r6, r7);	 Catch:{ all -> 0x0ce4 }
    L_0x066a:
        r15.f20587a = r5;	 Catch:{ all -> 0x0ce4 }
        goto L_0x066e;
    L_0x066d:
        r9 = 3;
    L_0x066e:
        if (r4 == 0) goto L_0x06c7;
    L_0x0670:
        r5 = "_e";
        r6 = r15.f20588b;	 Catch:{ all -> 0x0ce4 }
        r5 = r5.equals(r6);	 Catch:{ all -> 0x0ce4 }
        if (r5 == 0) goto L_0x06c7;
    L_0x067a:
        r5 = r15.f20587a;	 Catch:{ all -> 0x0ce4 }
        if (r5 == 0) goto L_0x06b0;
    L_0x067e:
        r5 = r15.f20587a;	 Catch:{ all -> 0x0ce4 }
        r5 = r5.length;	 Catch:{ all -> 0x0ce4 }
        if (r5 != 0) goto L_0x0684;
    L_0x0683:
        goto L_0x06b0;
    L_0x0684:
        r65.m22805f();	 Catch:{ all -> 0x0ce4 }
        r5 = "_et";
        r5 = com.google.android.gms.measurement.internal.zzfg.m29774b(r15, r5);	 Catch:{ all -> 0x0ce4 }
        r5 = (java.lang.Long) r5;	 Catch:{ all -> 0x0ce4 }
        if (r5 != 0) goto L_0x06a9;
    L_0x0691:
        r5 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r5 = r5.mo3172r();	 Catch:{ all -> 0x0ce4 }
        r5 = r5.m28540i();	 Catch:{ all -> 0x0ce4 }
        r6 = "Engagement event does not include duration. appId";
        r7 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r7 = r7.f20627o;	 Catch:{ all -> 0x0ce4 }
        r7 = com.google.android.gms.measurement.internal.zzap.m28525a(r7);	 Catch:{ all -> 0x0ce4 }
        r5.m12355a(r6, r7);	 Catch:{ all -> 0x0ce4 }
        goto L_0x06c7;
    L_0x06a9:
        r5 = r5.longValue();	 Catch:{ all -> 0x0ce4 }
        r7 = 0;
        r13 = r13 + r5;
        goto L_0x06c7;
    L_0x06b0:
        r5 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r5 = r5.mo3172r();	 Catch:{ all -> 0x0ce4 }
        r5 = r5.m28540i();	 Catch:{ all -> 0x0ce4 }
        r6 = "Engagement event does not contain any parameters. appId";
        r7 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r7 = r7.f20627o;	 Catch:{ all -> 0x0ce4 }
        r7 = com.google.android.gms.measurement.internal.zzap.m28525a(r7);	 Catch:{ all -> 0x0ce4 }
        r5.m12355a(r6, r7);	 Catch:{ all -> 0x0ce4 }
    L_0x06c7:
        r5 = r3.f20614b;	 Catch:{ all -> 0x0ce4 }
        r6 = r10 + 1;
        r5[r10] = r15;	 Catch:{ all -> 0x0ce4 }
        r10 = r6;
    L_0x06ce:
        r7 = r40 + 1;
        r8 = -1;
        r11 = 0;
        goto L_0x02c6;
    L_0x06d5:
        r36 = r12;
        r5 = r2.f17605c;	 Catch:{ all -> 0x0ce4 }
        r5 = r5.size();	 Catch:{ all -> 0x0ce4 }
        if (r10 >= r5) goto L_0x06e9;
    L_0x06df:
        r5 = r3.f20614b;	 Catch:{ all -> 0x0ce4 }
        r5 = java.util.Arrays.copyOf(r5, r10);	 Catch:{ all -> 0x0ce4 }
        r5 = (com.google.android.gms.internal.measurement.zzgf[]) r5;	 Catch:{ all -> 0x0ce4 }
        r3.f20614b = r5;	 Catch:{ all -> 0x0ce4 }
    L_0x06e9:
        if (r4 == 0) goto L_0x07b9;
    L_0x06eb:
        r4 = r65.m22802d();	 Catch:{ all -> 0x0ce4 }
        r5 = r3.f20627o;	 Catch:{ all -> 0x0ce4 }
        r6 = "_lte";
        r4 = r4.m29429c(r5, r6);	 Catch:{ all -> 0x0ce4 }
        if (r4 == 0) goto L_0x0725;
    L_0x06f9:
        r5 = r4.f10573e;	 Catch:{ all -> 0x0ce4 }
        if (r5 != 0) goto L_0x06fe;
    L_0x06fd:
        goto L_0x0725;
    L_0x06fe:
        r5 = new com.google.android.gms.measurement.internal.cm;	 Catch:{ all -> 0x0ce4 }
        r7 = r3.f20627o;	 Catch:{ all -> 0x0ce4 }
        r8 = "auto";
        r9 = "_lte";
        r6 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.mo3169m();	 Catch:{ all -> 0x0ce4 }
        r10 = r6.currentTimeMillis();	 Catch:{ all -> 0x0ce4 }
        r4 = r4.f10573e;	 Catch:{ all -> 0x0ce4 }
        r4 = (java.lang.Long) r4;	 Catch:{ all -> 0x0ce4 }
        r18 = r4.longValue();	 Catch:{ all -> 0x0ce4 }
        r4 = 0;
        r18 = r18 + r13;
        r12 = java.lang.Long.valueOf(r18);	 Catch:{ all -> 0x0ce4 }
        r6 = r5;
        r6.<init>(r7, r8, r9, r10, r12);	 Catch:{ all -> 0x0ce4 }
        r4 = r5;
        goto L_0x0742;
    L_0x0725:
        r4 = new com.google.android.gms.measurement.internal.cm;	 Catch:{ all -> 0x0ce4 }
        r5 = r3.f20627o;	 Catch:{ all -> 0x0ce4 }
        r28 = "auto";
        r29 = "_lte";
        r6 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.mo3169m();	 Catch:{ all -> 0x0ce4 }
        r30 = r6.currentTimeMillis();	 Catch:{ all -> 0x0ce4 }
        r32 = java.lang.Long.valueOf(r13);	 Catch:{ all -> 0x0ce4 }
        r26 = r4;
        r27 = r5;
        r26.<init>(r27, r28, r29, r30, r32);	 Catch:{ all -> 0x0ce4 }
    L_0x0742:
        r5 = new com.google.android.gms.internal.measurement.zzgl;	 Catch:{ all -> 0x0ce4 }
        r5.<init>();	 Catch:{ all -> 0x0ce4 }
        r6 = "_lte";
        r5.f20648b = r6;	 Catch:{ all -> 0x0ce4 }
        r6 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r6 = r6.mo3169m();	 Catch:{ all -> 0x0ce4 }
        r6 = r6.currentTimeMillis();	 Catch:{ all -> 0x0ce4 }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x0ce4 }
        r5.f20647a = r6;	 Catch:{ all -> 0x0ce4 }
        r6 = r4.f10573e;	 Catch:{ all -> 0x0ce4 }
        r6 = (java.lang.Long) r6;	 Catch:{ all -> 0x0ce4 }
        r5.f20650d = r6;	 Catch:{ all -> 0x0ce4 }
        r6 = 0;
    L_0x0762:
        r7 = r3.f20615c;	 Catch:{ all -> 0x0ce4 }
        r7 = r7.length;	 Catch:{ all -> 0x0ce4 }
        if (r6 >= r7) goto L_0x077e;
    L_0x0767:
        r7 = "_lte";
        r8 = r3.f20615c;	 Catch:{ all -> 0x0ce4 }
        r8 = r8[r6];	 Catch:{ all -> 0x0ce4 }
        r8 = r8.f20648b;	 Catch:{ all -> 0x0ce4 }
        r7 = r7.equals(r8);	 Catch:{ all -> 0x0ce4 }
        if (r7 == 0) goto L_0x077b;
    L_0x0775:
        r7 = r3.f20615c;	 Catch:{ all -> 0x0ce4 }
        r7[r6] = r5;	 Catch:{ all -> 0x0ce4 }
        r6 = 1;
        goto L_0x077f;
    L_0x077b:
        r6 = r6 + 1;
        goto L_0x0762;
    L_0x077e:
        r6 = 0;
    L_0x077f:
        if (r6 != 0) goto L_0x079b;
    L_0x0781:
        r6 = r3.f20615c;	 Catch:{ all -> 0x0ce4 }
        r7 = r3.f20615c;	 Catch:{ all -> 0x0ce4 }
        r7 = r7.length;	 Catch:{ all -> 0x0ce4 }
        r8 = 1;
        r7 = r7 + r8;
        r6 = java.util.Arrays.copyOf(r6, r7);	 Catch:{ all -> 0x0ce4 }
        r6 = (com.google.android.gms.internal.measurement.zzgl[]) r6;	 Catch:{ all -> 0x0ce4 }
        r3.f20615c = r6;	 Catch:{ all -> 0x0ce4 }
        r6 = r3.f20615c;	 Catch:{ all -> 0x0ce4 }
        r7 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r7 = r7.f20615c;	 Catch:{ all -> 0x0ce4 }
        r7 = r7.length;	 Catch:{ all -> 0x0ce4 }
        r8 = 1;
        r7 = r7 - r8;
        r6[r7] = r5;	 Catch:{ all -> 0x0ce4 }
    L_0x079b:
        r5 = 0;
        r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x07b9;
    L_0x07a1:
        r5 = r65.m22802d();	 Catch:{ all -> 0x0ce4 }
        r5.m29421a(r4);	 Catch:{ all -> 0x0ce4 }
        r5 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r5 = r5.mo3172r();	 Catch:{ all -> 0x0ce4 }
        r5 = r5.m28554w();	 Catch:{ all -> 0x0ce4 }
        r6 = "Updated lifetime engagement user property with value. Value";
        r4 = r4.f10573e;	 Catch:{ all -> 0x0ce4 }
        r5.m12355a(r6, r4);	 Catch:{ all -> 0x0ce4 }
    L_0x07b9:
        r4 = r3.f20627o;	 Catch:{ all -> 0x0ce4 }
        r5 = r3.f20615c;	 Catch:{ all -> 0x0ce4 }
        r6 = r3.f20614b;	 Catch:{ all -> 0x0ce4 }
        r4 = r1.m22766a(r4, r5, r6);	 Catch:{ all -> 0x0ce4 }
        r3.f20600A = r4;	 Catch:{ all -> 0x0ce4 }
        r4 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r4 = r4.m22720b();	 Catch:{ all -> 0x0ce4 }
        r5 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r5 = r5.f20627o;	 Catch:{ all -> 0x0ce4 }
        r4 = r4.m27347d(r5);	 Catch:{ all -> 0x0ce4 }
        if (r4 == 0) goto L_0x0af8;
    L_0x07d5:
        r4 = new java.util.HashMap;	 Catch:{ all -> 0x0af2 }
        r4.<init>();	 Catch:{ all -> 0x0af2 }
        r5 = r3.f20614b;	 Catch:{ all -> 0x0af2 }
        r5 = r5.length;	 Catch:{ all -> 0x0af2 }
        r5 = new com.google.android.gms.internal.measurement.zzgf[r5];	 Catch:{ all -> 0x0af2 }
        r6 = r1.f17616i;	 Catch:{ all -> 0x0af2 }
        r6 = r6.m22729j();	 Catch:{ all -> 0x0af2 }
        r6 = r6.m28636h();	 Catch:{ all -> 0x0af2 }
        r7 = r3.f20614b;	 Catch:{ all -> 0x0af2 }
        r8 = r7.length;	 Catch:{ all -> 0x0af2 }
        r9 = 0;
        r10 = 0;
    L_0x07ee:
        if (r9 >= r8) goto L_0x0ac0;
    L_0x07f0:
        r11 = r7[r9];	 Catch:{ all -> 0x0af2 }
        r12 = r11.f20588b;	 Catch:{ all -> 0x0af2 }
        r13 = "_ep";
        r12 = r12.equals(r13);	 Catch:{ all -> 0x0af2 }
        if (r12 == 0) goto L_0x0879;
    L_0x07fc:
        r65.m22805f();	 Catch:{ all -> 0x0ce4 }
        r12 = "_en";
        r12 = com.google.android.gms.measurement.internal.zzfg.m29774b(r11, r12);	 Catch:{ all -> 0x0ce4 }
        r12 = (java.lang.String) r12;	 Catch:{ all -> 0x0ce4 }
        r13 = r4.get(r12);	 Catch:{ all -> 0x0ce4 }
        r13 = (com.google.android.gms.measurement.internal.cy) r13;	 Catch:{ all -> 0x0ce4 }
        if (r13 != 0) goto L_0x081e;
    L_0x080f:
        r13 = r65.m22802d();	 Catch:{ all -> 0x0ce4 }
        r14 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r14 = r14.f20627o;	 Catch:{ all -> 0x0ce4 }
        r13 = r13.m29409a(r14, r12);	 Catch:{ all -> 0x0ce4 }
        r4.put(r12, r13);	 Catch:{ all -> 0x0ce4 }
    L_0x081e:
        r12 = r13.f10619h;	 Catch:{ all -> 0x0ce4 }
        if (r12 != 0) goto L_0x086b;
    L_0x0822:
        r12 = r13.f10620i;	 Catch:{ all -> 0x0ce4 }
        r14 = r12.longValue();	 Catch:{ all -> 0x0ce4 }
        r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1));
        if (r12 <= 0) goto L_0x083b;
    L_0x082c:
        r65.m22805f();	 Catch:{ all -> 0x0ce4 }
        r12 = r11.f20587a;	 Catch:{ all -> 0x0ce4 }
        r14 = "_sr";
        r15 = r13.f10620i;	 Catch:{ all -> 0x0ce4 }
        r12 = com.google.android.gms.measurement.internal.zzfg.m29773a(r12, r14, r15);	 Catch:{ all -> 0x0ce4 }
        r11.f20587a = r12;	 Catch:{ all -> 0x0ce4 }
    L_0x083b:
        r12 = r13.f10621j;	 Catch:{ all -> 0x0ce4 }
        if (r12 == 0) goto L_0x0858;
    L_0x083f:
        r12 = r13.f10621j;	 Catch:{ all -> 0x0ce4 }
        r12 = r12.booleanValue();	 Catch:{ all -> 0x0ce4 }
        if (r12 == 0) goto L_0x0858;
    L_0x0847:
        r65.m22805f();	 Catch:{ all -> 0x0ce4 }
        r12 = r11.f20587a;	 Catch:{ all -> 0x0ce4 }
        r13 = "_efs";
        r14 = java.lang.Long.valueOf(r16);	 Catch:{ all -> 0x0ce4 }
        r12 = com.google.android.gms.measurement.internal.zzfg.m29773a(r12, r13, r14);	 Catch:{ all -> 0x0ce4 }
        r11.f20587a = r12;	 Catch:{ all -> 0x0ce4 }
    L_0x0858:
        r12 = r10 + 1;
        r5[r10] = r11;	 Catch:{ all -> 0x0ce4 }
        r63 = r2;
        r43 = r3;
        r62 = r6;
        r41 = r7;
        r42 = r8;
        r44 = r9;
        r10 = r12;
        goto L_0x0ab0;
    L_0x086b:
        r63 = r2;
        r43 = r3;
        r62 = r6;
        r41 = r7;
        r42 = r8;
        r44 = r9;
        goto L_0x0ab0;
    L_0x0879:
        r12 = r65.m22774p();	 Catch:{ all -> 0x0af2 }
        r13 = r2.f17603a;	 Catch:{ all -> 0x0af2 }
        r13 = r13.f20627o;	 Catch:{ all -> 0x0af2 }
        r12 = r12.m29542e(r13);	 Catch:{ all -> 0x0af2 }
        r14 = r1.f17616i;	 Catch:{ all -> 0x0af2 }
        r14.m22729j();	 Catch:{ all -> 0x0af2 }
        r14 = r11.f20589c;	 Catch:{ all -> 0x0af2 }
        r14 = r14.longValue();	 Catch:{ all -> 0x0af2 }
        r14 = com.google.android.gms.measurement.internal.zzfk.m28586a(r14, r12);	 Catch:{ all -> 0x0af2 }
        r41 = r7;
        r7 = "_dbg";
        r42 = r8;
        r8 = java.lang.Long.valueOf(r16);	 Catch:{ all -> 0x0af2 }
        r18 = android.text.TextUtils.isEmpty(r7);	 Catch:{ all -> 0x0af2 }
        if (r18 != 0) goto L_0x08ea;
    L_0x08a4:
        if (r8 != 0) goto L_0x08a7;
    L_0x08a6:
        goto L_0x08ea;
    L_0x08a7:
        r43 = r3;
        r3 = r11.f20587a;	 Catch:{ all -> 0x0ce4 }
        r44 = r9;
        r9 = r3.length;	 Catch:{ all -> 0x0ce4 }
        r45 = r12;
        r12 = 0;
    L_0x08b1:
        if (r12 >= r9) goto L_0x08f0;
    L_0x08b3:
        r13 = r3[r12];	 Catch:{ all -> 0x0ce4 }
        r47 = r3;
        r3 = r13.f20593a;	 Catch:{ all -> 0x0ce4 }
        r3 = r7.equals(r3);	 Catch:{ all -> 0x0ce4 }
        if (r3 == 0) goto L_0x08e5;
    L_0x08bf:
        r3 = r8 instanceof java.lang.Long;	 Catch:{ all -> 0x0ce4 }
        if (r3 == 0) goto L_0x08cb;
    L_0x08c3:
        r3 = r13.f20595c;	 Catch:{ all -> 0x0ce4 }
        r3 = r8.equals(r3);	 Catch:{ all -> 0x0ce4 }
        if (r3 != 0) goto L_0x08e3;
    L_0x08cb:
        r3 = r8 instanceof java.lang.String;	 Catch:{ all -> 0x0ce4 }
        if (r3 == 0) goto L_0x08d7;
    L_0x08cf:
        r3 = r13.f20594b;	 Catch:{ all -> 0x0ce4 }
        r3 = r8.equals(r3);	 Catch:{ all -> 0x0ce4 }
        if (r3 != 0) goto L_0x08e3;
    L_0x08d7:
        r3 = r8 instanceof java.lang.Double;	 Catch:{ all -> 0x0ce4 }
        if (r3 == 0) goto L_0x08f0;
    L_0x08db:
        r3 = r13.f20596d;	 Catch:{ all -> 0x0ce4 }
        r3 = r8.equals(r3);	 Catch:{ all -> 0x0ce4 }
        if (r3 == 0) goto L_0x08f0;
    L_0x08e3:
        r3 = 1;
        goto L_0x08f1;
    L_0x08e5:
        r12 = r12 + 1;
        r3 = r47;
        goto L_0x08b1;
    L_0x08ea:
        r43 = r3;
        r44 = r9;
        r45 = r12;
    L_0x08f0:
        r3 = 0;
    L_0x08f1:
        if (r3 != 0) goto L_0x0902;
    L_0x08f3:
        r3 = r65.m22774p();	 Catch:{ all -> 0x0ce4 }
        r7 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r7 = r7.f20627o;	 Catch:{ all -> 0x0ce4 }
        r8 = r11.f20588b;	 Catch:{ all -> 0x0ce4 }
        r12 = r3.m29539d(r7, r8);	 Catch:{ all -> 0x0ce4 }
        goto L_0x0903;
    L_0x0902:
        r12 = 1;
    L_0x0903:
        if (r12 > 0) goto L_0x0925;
    L_0x0905:
        r3 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r3 = r3.mo3172r();	 Catch:{ all -> 0x0ce4 }
        r3 = r3.m28540i();	 Catch:{ all -> 0x0ce4 }
        r7 = "Sample rate must be positive. event, rate";
        r8 = r11.f20588b;	 Catch:{ all -> 0x0ce4 }
        r9 = java.lang.Integer.valueOf(r12);	 Catch:{ all -> 0x0ce4 }
        r3.m12356a(r7, r8, r9);	 Catch:{ all -> 0x0ce4 }
        r3 = r10 + 1;
        r5[r10] = r11;	 Catch:{ all -> 0x0ce4 }
        r63 = r2;
        r10 = r3;
        r62 = r6;
        goto L_0x0ab0;
    L_0x0925:
        r3 = r11.f20588b;	 Catch:{ all -> 0x0af2 }
        r3 = r4.get(r3);	 Catch:{ all -> 0x0af2 }
        r3 = (com.google.android.gms.measurement.internal.cy) r3;	 Catch:{ all -> 0x0af2 }
        if (r3 != 0) goto L_0x0979;
    L_0x092f:
        r3 = r65.m22802d();	 Catch:{ all -> 0x0ce4 }
        r7 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r7 = r7.f20627o;	 Catch:{ all -> 0x0ce4 }
        r8 = r11.f20588b;	 Catch:{ all -> 0x0ce4 }
        r3 = r3.m29409a(r7, r8);	 Catch:{ all -> 0x0ce4 }
        if (r3 != 0) goto L_0x0979;
    L_0x093f:
        r3 = r1.f17616i;	 Catch:{ all -> 0x0ce4 }
        r3 = r3.mo3172r();	 Catch:{ all -> 0x0ce4 }
        r3 = r3.m28540i();	 Catch:{ all -> 0x0ce4 }
        r7 = "Event being bundled has no eventAggregate. appId, eventName";
        r8 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r8 = r8.f20627o;	 Catch:{ all -> 0x0ce4 }
        r9 = r11.f20588b;	 Catch:{ all -> 0x0ce4 }
        r3.m12356a(r7, r8, r9);	 Catch:{ all -> 0x0ce4 }
        r3 = new com.google.android.gms.measurement.internal.cy;	 Catch:{ all -> 0x0ce4 }
        r7 = r2.f17603a;	 Catch:{ all -> 0x0ce4 }
        r7 = r7.f20627o;	 Catch:{ all -> 0x0ce4 }
        r8 = r11.f20588b;	 Catch:{ all -> 0x0ce4 }
        r50 = 1;
        r52 = 1;
        r9 = r11.f20589c;	 Catch:{ all -> 0x0ce4 }
        r54 = r9.longValue();	 Catch:{ all -> 0x0ce4 }
        r56 = 0;
        r58 = 0;
        r59 = 0;
        r60 = 0;
        r61 = 0;
        r47 = r3;
        r48 = r7;
        r49 = r8;
        r47.<init>(r48, r49, r50, r52, r54, r56, r58, r59, r60, r61);	 Catch:{ all -> 0x0ce4 }
    L_0x0979:
        r65.m22805f();	 Catch:{ all -> 0x0af2 }
        r7 = "_eid";
        r7 = com.google.android.gms.measurement.internal.zzfg.m29774b(r11, r7);	 Catch:{ all -> 0x0af2 }
        r7 = (java.lang.Long) r7;	 Catch:{ all -> 0x0af2 }
        if (r7 == 0) goto L_0x0988;
    L_0x0986:
        r8 = 1;
        goto L_0x0989;
    L_0x0988:
        r8 = 0;
    L_0x0989:
        r8 = java.lang.Boolean.valueOf(r8);	 Catch:{ all -> 0x0af2 }
        r9 = 1;
        if (r12 != r9) goto L_0x09b7;
    L_0x0990:
        r7 = r10 + 1;
        r5[r10] = r11;	 Catch:{ all -> 0x0ce4 }
        r8 = r8.booleanValue();	 Catch:{ all -> 0x0ce4 }
        if (r8 == 0) goto L_0x09b0;
    L_0x099a:
        r8 = r3.f10619h;	 Catch:{ all -> 0x0ce4 }
        if (r8 != 0) goto L_0x09a6;
    L_0x099e:
        r8 = r3.f10620i;	 Catch:{ all -> 0x0ce4 }
        if (r8 != 0) goto L_0x09a6;
    L_0x09a2:
        r8 = r3.f10621j;	 Catch:{ all -> 0x0ce4 }
        if (r8 == 0) goto L_0x09b0;
    L_0x09a6:
        r8 = 0;
        r3 = r3.m12314a(r8, r8, r8);	 Catch:{ all -> 0x0ce4 }
        r8 = r11.f20588b;	 Catch:{ all -> 0x0ce4 }
        r4.put(r8, r3);	 Catch:{ all -> 0x0ce4 }
    L_0x09b0:
        r63 = r2;
        r62 = r6;
        r10 = r7;
        goto L_0x0ab0;
    L_0x09b7:
        r9 = r6.nextInt(r12);	 Catch:{ all -> 0x0af2 }
        if (r9 != 0) goto L_0x09f8;
    L_0x09bd:
        r65.m22805f();	 Catch:{ all -> 0x0ce4 }
        r7 = r11.f20587a;	 Catch:{ all -> 0x0ce4 }
        r9 = "_sr";
        r12 = (long) r12;	 Catch:{ all -> 0x0ce4 }
        r62 = r6;
        r6 = java.lang.Long.valueOf(r12);	 Catch:{ all -> 0x0ce4 }
        r6 = com.google.android.gms.measurement.internal.zzfg.m29773a(r7, r9, r6);	 Catch:{ all -> 0x0ce4 }
        r11.f20587a = r6;	 Catch:{ all -> 0x0ce4 }
        r6 = r10 + 1;
        r5[r10] = r11;	 Catch:{ all -> 0x0ce4 }
        r7 = r8.booleanValue();	 Catch:{ all -> 0x0ce4 }
        if (r7 == 0) goto L_0x09e4;
    L_0x09db:
        r7 = java.lang.Long.valueOf(r12);	 Catch:{ all -> 0x0ce4 }
        r8 = 0;
        r3 = r3.m12314a(r8, r7, r8);	 Catch:{ all -> 0x0ce4 }
    L_0x09e4:
        r7 = r11.f20588b;	 Catch:{ all -> 0x0ce4 }
        r8 = r11.f20589c;	 Catch:{ all -> 0x0ce4 }
        r8 = r8.longValue();	 Catch:{ all -> 0x0ce4 }
        r3 = r3.m12313a(r8, r14);	 Catch:{ all -> 0x0ce4 }
        r4.put(r7, r3);	 Catch:{ all -> 0x0ce4 }
        r63 = r2;
        r10 = r6;
        goto L_0x0ab0;
    L_0x09f8:
        r62 = r6;
        r6 = r1.f17616i;	 Catch:{ all -> 0x0af2 }
        r6 = r6.m22720b();	 Catch:{ all -> 0x0af2 }
        r9 = r2.f17603a;	 Catch:{ all -> 0x0af2 }
        r9 = r9.f20627o;	 Catch:{ all -> 0x0af2 }
        r6 = r6.m27365n(r9);	 Catch:{ all -> 0x0af2 }
        if (r6 == 0) goto L_0x0a36;
    L_0x0a0a:
        r6 = r3.f10618g;	 Catch:{ all -> 0x0af2 }
        if (r6 == 0) goto L_0x0a19;
    L_0x0a0e:
        r6 = r3.f10618g;	 Catch:{ all -> 0x0ce4 }
        r18 = r6.longValue();	 Catch:{ all -> 0x0ce4 }
        r63 = r2;
        r64 = r7;
        goto L_0x0a2e;
    L_0x0a19:
        r6 = r1.f17616i;	 Catch:{ all -> 0x0af2 }
        r6.m22729j();	 Catch:{ all -> 0x0af2 }
        r6 = r11.f20590d;	 Catch:{ all -> 0x0af2 }
        r63 = r2;
        r1 = r6.longValue();	 Catch:{ all -> 0x0af2 }
        r64 = r7;
        r6 = r45;
        r18 = com.google.android.gms.measurement.internal.zzfk.m28586a(r1, r6);	 Catch:{ all -> 0x0af2 }
    L_0x0a2e:
        r1 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1));
        if (r1 == 0) goto L_0x0a34;
    L_0x0a32:
        r1 = 1;
        goto L_0x0a50;
    L_0x0a34:
        r1 = 0;
        goto L_0x0a50;
    L_0x0a36:
        r63 = r2;
        r64 = r7;
        r1 = r3.f10617f;	 Catch:{ all -> 0x0af2 }
        r6 = r11.f20589c;	 Catch:{ all -> 0x0af2 }
        r6 = r6.longValue();	 Catch:{ all -> 0x0af2 }
        r9 = 0;
        r6 = r6 - r1;
        r1 = java.lang.Math.abs(r6);	 Catch:{ all -> 0x0af2 }
        r6 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r9 < 0) goto L_0x0a34;
    L_0x0a4f:
        goto L_0x0a32;
    L_0x0a50:
        if (r1 == 0) goto L_0x0a9e;
    L_0x0a52:
        r65.m22805f();	 Catch:{ all -> 0x0af2 }
        r1 = r11.f20587a;	 Catch:{ all -> 0x0af2 }
        r2 = "_efs";
        r6 = java.lang.Long.valueOf(r16);	 Catch:{ all -> 0x0af2 }
        r1 = com.google.android.gms.measurement.internal.zzfg.m29773a(r1, r2, r6);	 Catch:{ all -> 0x0af2 }
        r11.f20587a = r1;	 Catch:{ all -> 0x0af2 }
        r65.m22805f();	 Catch:{ all -> 0x0af2 }
        r1 = r11.f20587a;	 Catch:{ all -> 0x0af2 }
        r2 = "_sr";
        r6 = (long) r12;	 Catch:{ all -> 0x0af2 }
        r9 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x0af2 }
        r1 = com.google.android.gms.measurement.internal.zzfg.m29773a(r1, r2, r9);	 Catch:{ all -> 0x0af2 }
        r11.f20587a = r1;	 Catch:{ all -> 0x0af2 }
        r1 = r10 + 1;
        r5[r10] = r11;	 Catch:{ all -> 0x0af2 }
        r2 = r8.booleanValue();	 Catch:{ all -> 0x0af2 }
        if (r2 == 0) goto L_0x0a8d;
    L_0x0a7f:
        r2 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x0af2 }
        r6 = 1;
        r7 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x0af2 }
        r6 = 0;
        r3 = r3.m12314a(r6, r2, r7);	 Catch:{ all -> 0x0af2 }
    L_0x0a8d:
        r2 = r11.f20588b;	 Catch:{ all -> 0x0af2 }
        r6 = r11.f20589c;	 Catch:{ all -> 0x0af2 }
        r6 = r6.longValue();	 Catch:{ all -> 0x0af2 }
        r3 = r3.m12313a(r6, r14);	 Catch:{ all -> 0x0af2 }
        r4.put(r2, r3);	 Catch:{ all -> 0x0af2 }
        r10 = r1;
        goto L_0x0ab0;
    L_0x0a9e:
        r1 = r8.booleanValue();	 Catch:{ all -> 0x0af2 }
        if (r1 == 0) goto L_0x0ab0;
    L_0x0aa4:
        r1 = r11.f20588b;	 Catch:{ all -> 0x0af2 }
        r7 = r64;
        r2 = 0;
        r3 = r3.m12314a(r7, r2, r2);	 Catch:{ all -> 0x0af2 }
        r4.put(r1, r3);	 Catch:{ all -> 0x0af2 }
    L_0x0ab0:
        r9 = r44 + 1;
        r7 = r41;
        r8 = r42;
        r3 = r43;
        r6 = r62;
        r2 = r63;
        r1 = r65;
        goto L_0x07ee;
    L_0x0ac0:
        r63 = r2;
        r1 = r3;
        r2 = r1.f20614b;	 Catch:{ all -> 0x0af2 }
        r2 = r2.length;	 Catch:{ all -> 0x0af2 }
        if (r10 >= r2) goto L_0x0ad0;
    L_0x0ac8:
        r2 = java.util.Arrays.copyOf(r5, r10);	 Catch:{ all -> 0x0af2 }
        r2 = (com.google.android.gms.internal.measurement.zzgf[]) r2;	 Catch:{ all -> 0x0af2 }
        r1.f20614b = r2;	 Catch:{ all -> 0x0af2 }
    L_0x0ad0:
        r2 = r4.entrySet();	 Catch:{ all -> 0x0af2 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0af2 }
    L_0x0ad8:
        r3 = r2.hasNext();	 Catch:{ all -> 0x0af2 }
        if (r3 == 0) goto L_0x0afb;
    L_0x0ade:
        r3 = r2.next();	 Catch:{ all -> 0x0af2 }
        r3 = (java.util.Map.Entry) r3;	 Catch:{ all -> 0x0af2 }
        r4 = r65.m22802d();	 Catch:{ all -> 0x0af2 }
        r3 = r3.getValue();	 Catch:{ all -> 0x0af2 }
        r3 = (com.google.android.gms.measurement.internal.cy) r3;	 Catch:{ all -> 0x0af2 }
        r4.m29417a(r3);	 Catch:{ all -> 0x0af2 }
        goto L_0x0ad8;
    L_0x0af2:
        r0 = move-exception;
        r1 = r0;
        r5 = r65;
        goto L_0x0ce7;
    L_0x0af8:
        r63 = r2;
        r1 = r3;
    L_0x0afb:
        r2 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x0cc1 }
        r1.f20617e = r2;	 Catch:{ all -> 0x0cc1 }
        r2 = -9223372036854775808;
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x0cc1 }
        r1.f20618f = r2;	 Catch:{ all -> 0x0cc1 }
        r2 = 0;
    L_0x0b0f:
        r3 = r1.f20614b;	 Catch:{ all -> 0x0cc1 }
        r3 = r3.length;	 Catch:{ all -> 0x0cc1 }
        if (r2 >= r3) goto L_0x0b43;
    L_0x0b14:
        r3 = r1.f20614b;	 Catch:{ all -> 0x0af2 }
        r3 = r3[r2];	 Catch:{ all -> 0x0af2 }
        r4 = r3.f20589c;	 Catch:{ all -> 0x0af2 }
        r4 = r4.longValue();	 Catch:{ all -> 0x0af2 }
        r6 = r1.f20617e;	 Catch:{ all -> 0x0af2 }
        r6 = r6.longValue();	 Catch:{ all -> 0x0af2 }
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 >= 0) goto L_0x0b2c;
    L_0x0b28:
        r4 = r3.f20589c;	 Catch:{ all -> 0x0af2 }
        r1.f20617e = r4;	 Catch:{ all -> 0x0af2 }
    L_0x0b2c:
        r4 = r3.f20589c;	 Catch:{ all -> 0x0af2 }
        r4 = r4.longValue();	 Catch:{ all -> 0x0af2 }
        r6 = r1.f20618f;	 Catch:{ all -> 0x0af2 }
        r6 = r6.longValue();	 Catch:{ all -> 0x0af2 }
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 <= 0) goto L_0x0b40;
    L_0x0b3c:
        r3 = r3.f20589c;	 Catch:{ all -> 0x0af2 }
        r1.f20618f = r3;	 Catch:{ all -> 0x0af2 }
    L_0x0b40:
        r2 = r2 + 1;
        goto L_0x0b0f;
    L_0x0b43:
        r2 = r63;
        r3 = r2.f17603a;	 Catch:{ all -> 0x0cc1 }
        r3 = r3.f20627o;	 Catch:{ all -> 0x0cc1 }
        r4 = r65.m22802d();	 Catch:{ all -> 0x0cc1 }
        r4 = r4.m29425b(r3);	 Catch:{ all -> 0x0cc1 }
        if (r4 != 0) goto L_0x0b6d;
    L_0x0b53:
        r5 = r65;
        r4 = r5.f17616i;	 Catch:{ all -> 0x0ce1 }
        r4 = r4.mo3172r();	 Catch:{ all -> 0x0ce1 }
        r4 = r4.v_();	 Catch:{ all -> 0x0ce1 }
        r6 = "Bundling raw events w/o app info. appId";
        r7 = r2.f17603a;	 Catch:{ all -> 0x0ce1 }
        r7 = r7.f20627o;	 Catch:{ all -> 0x0ce1 }
        r7 = com.google.android.gms.measurement.internal.zzap.m28525a(r7);	 Catch:{ all -> 0x0ce1 }
        r4.m12355a(r6, r7);	 Catch:{ all -> 0x0ce1 }
        goto L_0x0bcb;
    L_0x0b6d:
        r5 = r65;
        r6 = r1.f20614b;	 Catch:{ all -> 0x0ce1 }
        r6 = r6.length;	 Catch:{ all -> 0x0ce1 }
        if (r6 <= 0) goto L_0x0bcb;
    L_0x0b74:
        r6 = r4.m12277i();	 Catch:{ all -> 0x0ce1 }
        r8 = 0;
        r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r10 == 0) goto L_0x0b83;
    L_0x0b7e:
        r8 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x0ce1 }
        goto L_0x0b84;
    L_0x0b83:
        r8 = 0;
    L_0x0b84:
        r1.f20620h = r8;	 Catch:{ all -> 0x0ce1 }
        r8 = r4.m12274h();	 Catch:{ all -> 0x0ce1 }
        r10 = 0;
        r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r12 != 0) goto L_0x0b91;
    L_0x0b90:
        goto L_0x0b92;
    L_0x0b91:
        r6 = r8;
    L_0x0b92:
        r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r8 == 0) goto L_0x0b9b;
    L_0x0b96:
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x0ce1 }
        goto L_0x0b9c;
    L_0x0b9b:
        r6 = 0;
    L_0x0b9c:
        r1.f20619g = r6;	 Catch:{ all -> 0x0ce1 }
        r4.m12294s();	 Catch:{ all -> 0x0ce1 }
        r6 = r4.m12291p();	 Catch:{ all -> 0x0ce1 }
        r6 = (int) r6;	 Catch:{ all -> 0x0ce1 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x0ce1 }
        r1.f20635w = r6;	 Catch:{ all -> 0x0ce1 }
        r6 = r1.f20617e;	 Catch:{ all -> 0x0ce1 }
        r6 = r6.longValue();	 Catch:{ all -> 0x0ce1 }
        r4.m12251a(r6);	 Catch:{ all -> 0x0ce1 }
        r6 = r1.f20618f;	 Catch:{ all -> 0x0ce1 }
        r6 = r6.longValue();	 Catch:{ all -> 0x0ce1 }
        r4.m12255b(r6);	 Catch:{ all -> 0x0ce1 }
        r6 = r4.m12246A();	 Catch:{ all -> 0x0ce1 }
        r1.f20636x = r6;	 Catch:{ all -> 0x0ce1 }
        r6 = r65.m22802d();	 Catch:{ all -> 0x0ce1 }
        r6.m29416a(r4);	 Catch:{ all -> 0x0ce1 }
    L_0x0bcb:
        r4 = r1.f20614b;	 Catch:{ all -> 0x0ce1 }
        r4 = r4.length;	 Catch:{ all -> 0x0ce1 }
        if (r4 <= 0) goto L_0x0c20;
    L_0x0bd0:
        r4 = r5.f17616i;	 Catch:{ all -> 0x0ce1 }
        r4.mo3173u();	 Catch:{ all -> 0x0ce1 }
        r4 = r65.m22774p();	 Catch:{ all -> 0x0ce1 }
        r6 = r2.f17603a;	 Catch:{ all -> 0x0ce1 }
        r6 = r6.f20627o;	 Catch:{ all -> 0x0ce1 }
        r4 = r4.m29529a(r6);	 Catch:{ all -> 0x0ce1 }
        if (r4 == 0) goto L_0x0bed;
    L_0x0be3:
        r6 = r4.f20568a;	 Catch:{ all -> 0x0ce1 }
        if (r6 != 0) goto L_0x0be8;
    L_0x0be7:
        goto L_0x0bed;
    L_0x0be8:
        r4 = r4.f20568a;	 Catch:{ all -> 0x0ce1 }
        r1.f20604E = r4;	 Catch:{ all -> 0x0ce1 }
        goto L_0x0c17;
    L_0x0bed:
        r4 = r2.f17603a;	 Catch:{ all -> 0x0ce1 }
        r4 = r4.f20637y;	 Catch:{ all -> 0x0ce1 }
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x0ce1 }
        if (r4 == 0) goto L_0x0c00;
    L_0x0bf7:
        r6 = -1;
        r4 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x0ce1 }
        r1.f20604E = r4;	 Catch:{ all -> 0x0ce1 }
        goto L_0x0c17;
    L_0x0c00:
        r4 = r5.f17616i;	 Catch:{ all -> 0x0ce1 }
        r4 = r4.mo3172r();	 Catch:{ all -> 0x0ce1 }
        r4 = r4.m28540i();	 Catch:{ all -> 0x0ce1 }
        r6 = "Did not find measurement config or missing version info. appId";
        r7 = r2.f17603a;	 Catch:{ all -> 0x0ce1 }
        r7 = r7.f20627o;	 Catch:{ all -> 0x0ce1 }
        r7 = com.google.android.gms.measurement.internal.zzap.m28525a(r7);	 Catch:{ all -> 0x0ce1 }
        r4.m12355a(r6, r7);	 Catch:{ all -> 0x0ce1 }
    L_0x0c17:
        r4 = r65.m22802d();	 Catch:{ all -> 0x0ce1 }
        r12 = r36;
        r4.m29420a(r1, r12);	 Catch:{ all -> 0x0ce1 }
    L_0x0c20:
        r1 = r65.m22802d();	 Catch:{ all -> 0x0ce1 }
        r2 = r2.f17604b;	 Catch:{ all -> 0x0ce1 }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r2);	 Catch:{ all -> 0x0ce1 }
        r1.mo4395d();	 Catch:{ all -> 0x0ce1 }
        r1.m28438k();	 Catch:{ all -> 0x0ce1 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0ce1 }
        r6 = "rowid in (";
        r4.<init>(r6);	 Catch:{ all -> 0x0ce1 }
        r6 = 0;
    L_0x0c37:
        r7 = r2.size();	 Catch:{ all -> 0x0ce1 }
        if (r6 >= r7) goto L_0x0c54;
    L_0x0c3d:
        if (r6 == 0) goto L_0x0c44;
    L_0x0c3f:
        r7 = ",";
        r4.append(r7);	 Catch:{ all -> 0x0ce1 }
    L_0x0c44:
        r7 = r2.get(r6);	 Catch:{ all -> 0x0ce1 }
        r7 = (java.lang.Long) r7;	 Catch:{ all -> 0x0ce1 }
        r7 = r7.longValue();	 Catch:{ all -> 0x0ce1 }
        r4.append(r7);	 Catch:{ all -> 0x0ce1 }
        r6 = r6 + 1;
        goto L_0x0c37;
    L_0x0c54:
        r6 = ")";
        r4.append(r6);	 Catch:{ all -> 0x0ce1 }
        r6 = r1.m29442y();	 Catch:{ all -> 0x0ce1 }
        r7 = "raw_events";
        r4 = r4.toString();	 Catch:{ all -> 0x0ce1 }
        r8 = 0;
        r4 = r6.delete(r7, r4, r8);	 Catch:{ all -> 0x0ce1 }
        r6 = r2.size();	 Catch:{ all -> 0x0ce1 }
        if (r4 == r6) goto L_0x0c87;
    L_0x0c6e:
        r1 = r1.mo3172r();	 Catch:{ all -> 0x0ce1 }
        r1 = r1.v_();	 Catch:{ all -> 0x0ce1 }
        r6 = "Deleted fewer rows from raw events table than expected";
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0ce1 }
        r2 = r2.size();	 Catch:{ all -> 0x0ce1 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x0ce1 }
        r1.m12356a(r6, r4, r2);	 Catch:{ all -> 0x0ce1 }
    L_0x0c87:
        r1 = r65.m22802d();	 Catch:{ all -> 0x0ce1 }
        r2 = r1.m29442y();	 Catch:{ all -> 0x0ce1 }
        r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)";
        r6 = 2;
        r6 = new java.lang.String[r6];	 Catch:{ SQLiteException -> 0x0c9e }
        r7 = 0;
        r6[r7] = r3;	 Catch:{ SQLiteException -> 0x0c9e }
        r7 = 1;
        r6[r7] = r3;	 Catch:{ SQLiteException -> 0x0c9e }
        r2.execSQL(r4, r6);	 Catch:{ SQLiteException -> 0x0c9e }
        goto L_0x0cb1;
    L_0x0c9e:
        r0 = move-exception;
        r2 = r0;
        r1 = r1.mo3172r();	 Catch:{ all -> 0x0ce1 }
        r1 = r1.v_();	 Catch:{ all -> 0x0ce1 }
        r4 = "Failed to remove unused event metadata. appId";
        r3 = com.google.android.gms.measurement.internal.zzap.m28525a(r3);	 Catch:{ all -> 0x0ce1 }
        r1.m12356a(r4, r3, r2);	 Catch:{ all -> 0x0ce1 }
    L_0x0cb1:
        r1 = r65.m22802d();	 Catch:{ all -> 0x0ce1 }
        r1.m29440w();	 Catch:{ all -> 0x0ce1 }
        r1 = r65.m22802d();
        r1.m29441x();
        r1 = 1;
        return r1;
    L_0x0cc1:
        r0 = move-exception;
        r5 = r65;
        goto L_0x0ce6;
    L_0x0cc5:
        r5 = r1;
        r1 = r65.m22802d();	 Catch:{ all -> 0x0ce1 }
        r1.m29440w();	 Catch:{ all -> 0x0ce1 }
        r1 = r65.m22802d();
        r1.m29441x();
        r1 = 0;
        return r1;
    L_0x0cd6:
        r0 = move-exception;
        r5 = r1;
        r1 = r0;
        r22 = r6;
    L_0x0cdb:
        if (r22 == 0) goto L_0x0ce3;
    L_0x0cdd:
        r22.close();	 Catch:{ all -> 0x0ce1 }
        goto L_0x0ce3;
    L_0x0ce1:
        r0 = move-exception;
        goto L_0x0ce6;
    L_0x0ce3:
        throw r1;	 Catch:{ all -> 0x0ce1 }
    L_0x0ce4:
        r0 = move-exception;
        r5 = r1;
    L_0x0ce6:
        r1 = r0;
    L_0x0ce7:
        r2 = r65.m22802d();
        r2.m29441x();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfa.a(java.lang.String, long):boolean");
    }

    @VisibleForTesting
    /* renamed from: a */
    private static zzgg[] m22769a(zzgg[] zzggArr, String str) {
        int i = 0;
        while (i < zzggArr.length) {
            if (str.equals(zzggArr[i].f20593a)) {
                break;
            }
            i++;
        }
        i = -1;
        if (i < 0) {
            return zzggArr;
        }
        return m22767a(zzggArr, i);
    }

    @VisibleForTesting
    /* renamed from: a */
    private static zzgg[] m22767a(zzgg[] zzggArr, int i) {
        Object obj = new zzgg[(zzggArr.length - 1)];
        if (i > 0) {
            System.arraycopy(zzggArr, 0, obj, 0, i);
        }
        if (i < obj.length) {
            System.arraycopy(zzggArr, i + 1, obj, i, obj.length - i);
        }
        return obj;
    }

    @VisibleForTesting
    /* renamed from: a */
    private static zzgg[] m22768a(zzgg[] zzggArr, int i, String str) {
        for (zzgg zzgg : zzggArr) {
            if ("_err".equals(zzgg.f20593a)) {
                return zzggArr;
            }
        }
        Object obj = new zzgg[(zzggArr.length + 2)];
        System.arraycopy(zzggArr, 0, obj, 0, zzggArr.length);
        zzggArr = new zzgg();
        zzggArr.f20593a = "_err";
        zzggArr.f20595c = Long.valueOf((long) i);
        i = new zzgg();
        i.f20593a = "_ev";
        i.f20594b = str;
        obj[obj.length - 2] = zzggArr;
        obj[obj.length - 1] = i;
        return obj;
    }

    /* renamed from: a */
    private final zzgd[] m22766a(String str, zzgl[] zzglArr, zzgf[] zzgfArr) {
        Preconditions.checkNotEmpty(str);
        return m22804e().m29383a(str, zzgfArr, zzglArr);
    }

    @VisibleForTesting
    /* renamed from: a */
    final void m22783a(int i, Throwable th, byte[] bArr, String str) {
        m22777v();
        m22808i();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f17624q = false;
                m22781z();
            }
        }
        List<Long> list = this.f17628u;
        this.f17628u = null;
        int i2 = 1;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.f17616i.m22722c().f21383c.m12361a(this.f17616i.mo3169m().currentTimeMillis());
                this.f17616i.m22722c().f21384d.m12361a(0);
                m22780y();
                this.f17616i.mo3172r().m28555x().m12356a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                m22802d().m29437f();
                try {
                    for (Long l : list) {
                        try {
                            bArr = m22802d();
                            long longValue = l.longValue();
                            bArr.mo4395d();
                            bArr.m28438k();
                            if (bArr.m29442y().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (String str2) {
                            bArr.mo3172r().v_().m12355a("Failed to delete a bundle in a queue table", str2);
                            throw str2;
                        } catch (byte[] bArr2) {
                            if (this.f17629v == null || this.f17629v.contains(l) == null) {
                                throw bArr2;
                            }
                        }
                    }
                    m22802d().m29440w();
                    this.f17629v = null;
                    if (m22800c().m29511f() == 0 || m22779x() == 0) {
                        this.f17630w = -1;
                        m22780y();
                    } else {
                        m22809j();
                    }
                    this.f17619l = 0;
                } finally {
                    m22802d().m29441x();
                }
            } catch (int i3) {
                this.f17616i.mo3172r().v_().m12355a("Database error while trying to delete uploaded bundles", i3);
                this.f17619l = this.f17616i.mo3169m().elapsedRealtime();
                this.f17616i.mo3172r().m28555x().m12355a("Disable upload, time", Long.valueOf(this.f17619l));
            }
        } else {
            this.f17616i.mo3172r().m28555x().m12356a("Network upload failed. Will retry later. code, error", Integer.valueOf(i3), th);
            this.f17616i.m22722c().f21384d.m12361a(this.f17616i.mo3169m().currentTimeMillis());
            if (i3 != 503) {
                if (i3 != 429) {
                    i2 = 0;
                }
            }
            if (i2 != 0) {
                this.f17616i.m22722c().f21385e.m12361a(this.f17616i.mo3169m().currentTimeMillis());
            }
            if (this.f17616i.m22720b().m27353g(str2) != 0) {
                m22802d().m29419a((List) list);
            }
            m22780y();
        }
        this.f17624q = false;
        m22781z();
    }

    /* renamed from: x */
    private final boolean m22779x() {
        m22777v();
        m22808i();
        if (!m22802d().m29404E()) {
            if (TextUtils.isEmpty(m22802d().m29443z())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private final void m22760a(com.google.android.gms.measurement.internal.cp r11) {
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
        r10 = this;
        r10.m22777v();
        r0 = r11.m12262d();
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x002b;
    L_0x000d:
        r0 = com.google.android.gms.measurement.internal.zzn.m27334z();
        if (r0 == 0) goto L_0x001d;
    L_0x0013:
        r0 = r11.m12265e();
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x002b;
    L_0x001d:
        r2 = r11.m12254b();
        r3 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r1 = r10;
        r1.m22792a(r2, r3, r4, r5, r6);
        return;
    L_0x002b:
        r0 = r10.f17616i;
        r0 = r0.m22720b();
        r1 = new android.net.Uri$Builder;
        r1.<init>();
        r2 = r11.m12262d();
        r3 = android.text.TextUtils.isEmpty(r2);
        if (r3 == 0) goto L_0x004a;
    L_0x0040:
        r3 = com.google.android.gms.measurement.internal.zzn.m27334z();
        if (r3 == 0) goto L_0x004a;
    L_0x0046:
        r2 = r11.m12265e();
    L_0x004a:
        r3 = com.google.android.gms.measurement.internal.zzaf.f10724m;
        r3 = r3.m12332b();
        r3 = (java.lang.String) r3;
        r3 = r1.scheme(r3);
        r4 = com.google.android.gms.measurement.internal.zzaf.f10725n;
        r4 = r4.m12332b();
        r4 = (java.lang.String) r4;
        r3 = r3.encodedAuthority(r4);
        r4 = "config/app/";
        r2 = java.lang.String.valueOf(r2);
        r5 = r2.length();
        if (r5 == 0) goto L_0x0073;
    L_0x006e:
        r2 = r4.concat(r2);
        goto L_0x0078;
    L_0x0073:
        r2 = new java.lang.String;
        r2.<init>(r4);
    L_0x0078:
        r2 = r3.path(r2);
        r3 = "app_instance_id";
        r4 = r11.m12258c();
        r2 = r2.appendQueryParameter(r3, r4);
        r3 = "platform";
        r4 = "android";
        r2 = r2.appendQueryParameter(r3, r4);
        r3 = "gmp_version";
        r4 = r0.m27350f();
        r0 = java.lang.String.valueOf(r4);
        r2.appendQueryParameter(r3, r0);
        r0 = r1.build();
        r0 = r0.toString();
        r4 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x0114 }
        r4.<init>(r0);	 Catch:{ MalformedURLException -> 0x0114 }
        r1 = r10.f17616i;	 Catch:{ MalformedURLException -> 0x0114 }
        r1 = r1.mo3172r();	 Catch:{ MalformedURLException -> 0x0114 }
        r1 = r1.m28555x();	 Catch:{ MalformedURLException -> 0x0114 }
        r2 = "Fetching remote configuration";	 Catch:{ MalformedURLException -> 0x0114 }
        r3 = r11.m12254b();	 Catch:{ MalformedURLException -> 0x0114 }
        r1.m12355a(r2, r3);	 Catch:{ MalformedURLException -> 0x0114 }
        r1 = r10.m22774p();	 Catch:{ MalformedURLException -> 0x0114 }
        r2 = r11.m12254b();	 Catch:{ MalformedURLException -> 0x0114 }
        r1 = r1.m29529a(r2);	 Catch:{ MalformedURLException -> 0x0114 }
        r2 = 0;	 Catch:{ MalformedURLException -> 0x0114 }
        r3 = r10.m22774p();	 Catch:{ MalformedURLException -> 0x0114 }
        r5 = r11.m12254b();	 Catch:{ MalformedURLException -> 0x0114 }
        r3 = r3.m29533b(r5);	 Catch:{ MalformedURLException -> 0x0114 }
        if (r1 == 0) goto L_0x00e8;	 Catch:{ MalformedURLException -> 0x0114 }
    L_0x00d6:
        r1 = android.text.TextUtils.isEmpty(r3);	 Catch:{ MalformedURLException -> 0x0114 }
        if (r1 != 0) goto L_0x00e8;	 Catch:{ MalformedURLException -> 0x0114 }
    L_0x00dc:
        r1 = new android.support.v4.f.a;	 Catch:{ MalformedURLException -> 0x0114 }
        r1.<init>();	 Catch:{ MalformedURLException -> 0x0114 }
        r2 = "If-Modified-Since";	 Catch:{ MalformedURLException -> 0x0114 }
        r1.put(r2, r3);	 Catch:{ MalformedURLException -> 0x0114 }
        r6 = r1;	 Catch:{ MalformedURLException -> 0x0114 }
        goto L_0x00e9;	 Catch:{ MalformedURLException -> 0x0114 }
    L_0x00e8:
        r6 = r2;	 Catch:{ MalformedURLException -> 0x0114 }
    L_0x00e9:
        r1 = 1;	 Catch:{ MalformedURLException -> 0x0114 }
        r10.f17623p = r1;	 Catch:{ MalformedURLException -> 0x0114 }
        r2 = r10.m22800c();	 Catch:{ MalformedURLException -> 0x0114 }
        r3 = r11.m12254b();	 Catch:{ MalformedURLException -> 0x0114 }
        r7 = new com.google.android.gms.measurement.internal.ck;	 Catch:{ MalformedURLException -> 0x0114 }
        r7.<init>(r10);	 Catch:{ MalformedURLException -> 0x0114 }
        r2.mo4395d();	 Catch:{ MalformedURLException -> 0x0114 }
        r2.m28438k();	 Catch:{ MalformedURLException -> 0x0114 }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r4);	 Catch:{ MalformedURLException -> 0x0114 }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r7);	 Catch:{ MalformedURLException -> 0x0114 }
        r8 = r2.mo3171q();	 Catch:{ MalformedURLException -> 0x0114 }
        r9 = new com.google.android.gms.measurement.internal.h;	 Catch:{ MalformedURLException -> 0x0114 }
        r5 = 0;	 Catch:{ MalformedURLException -> 0x0114 }
        r1 = r9;	 Catch:{ MalformedURLException -> 0x0114 }
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{ MalformedURLException -> 0x0114 }
        r8.m28571b(r9);	 Catch:{ MalformedURLException -> 0x0114 }
        return;
    L_0x0114:
        r1 = r10.f17616i;
        r1 = r1.mo3172r();
        r1 = r1.v_();
        r2 = "Failed to parse config URL. Not fetching. appId";
        r11 = r11.m12254b();
        r11 = com.google.android.gms.measurement.internal.zzap.m28525a(r11);
        r1.m12356a(r2, r11, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfa.a(com.google.android.gms.measurement.internal.cp):void");
    }

    @VisibleForTesting
    /* renamed from: a */
    final void m22792a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        m22777v();
        m22808i();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f17623p = false;
                m22781z();
            }
        }
        this.f17616i.mo3172r().m28555x().m12355a("onConfigFetched. Response size", Integer.valueOf(bArr.length));
        m22802d().m29437f();
        cp b = m22802d().m29425b(str);
        Object obj = 1;
        Object obj2 = ((i == 200 || i == 204 || i == 304) && th == null) ? 1 : null;
        if (b == null) {
            this.f17616i.mo3172r().m28540i().m12355a("App does not exist in onConfigFetched. appId", zzap.m28525a(str));
        } else {
            if (obj2 == null) {
                if (i != 404) {
                    b.m12275h(this.f17616i.mo3169m().currentTimeMillis());
                    m22802d().m29416a(b);
                    this.f17616i.mo3172r().m28555x().m12356a("Fetching config failed. code, error", Integer.valueOf(i), th);
                    m22774p().m29537c(str);
                    this.f17616i.m22722c().f21384d.m12361a(this.f17616i.mo3169m().currentTimeMillis());
                    if (i != 503) {
                        if (i != 429) {
                            obj = null;
                        }
                    }
                    if (obj != null) {
                        this.f17616i.m22722c().f21385e.m12361a(this.f17616i.mo3169m().currentTimeMillis());
                    }
                    m22780y();
                }
            }
            map = map != null ? (List) map.get("Last-Modified") : null;
            map = (map == null || map.size() <= 0) ? null : (String) map.get(0);
            if (i != 404) {
                if (i != 304) {
                    if (m22774p().m29532a(str, bArr, map) == null) {
                        m22802d().m29441x();
                        this.f17623p = false;
                        m22781z();
                        return;
                    }
                    b.m12272g(this.f17616i.mo3169m().currentTimeMillis());
                    m22802d().m29416a(b);
                    if (i != 404) {
                        this.f17616i.mo3172r().m28542k().m12355a("Config not found. Using empty config. appId", str);
                    } else {
                        this.f17616i.mo3172r().m28555x().m12356a("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                    }
                    if (m22800c().m29511f() != null || m22779x() == null) {
                        m22780y();
                    } else {
                        m22809j();
                    }
                }
            }
            if (m22774p().m29529a(str) == null && m22774p().m29532a(str, null, null) == null) {
                m22802d().m29441x();
                this.f17623p = false;
                m22781z();
                return;
            }
            b.m12272g(this.f17616i.mo3169m().currentTimeMillis());
            m22802d().m29416a(b);
            if (i != 404) {
                this.f17616i.mo3172r().m28555x().m12356a("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
            } else {
                this.f17616i.mo3172r().m28542k().m12355a("Config not found. Using empty config. appId", str);
            }
            if (m22800c().m29511f() != null) {
            }
            m22780y();
        }
        m22802d().m29440w();
        m22802d().m29441x();
        this.f17623p = false;
        m22781z();
    }

    /* renamed from: y */
    private final void m22780y() {
        zzfa zzfa = this;
        m22777v();
        m22808i();
        if (m22754B()) {
            long abs;
            if (zzfa.f17619l > 0) {
                abs = 3600000 - Math.abs(zzfa.f17616i.mo3169m().elapsedRealtime() - zzfa.f17619l);
                if (abs > 0) {
                    zzfa.f17616i.mo3172r().m28555x().m12355a("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                    m22775s().m12319b();
                    m22776t().m29750f();
                    return;
                }
                zzfa.f17619l = 0;
            }
            if (zzfa.f17616i.m22715H()) {
                if (m22779x()) {
                    Object obj;
                    CharSequence v;
                    long max;
                    long a;
                    long a2;
                    long j;
                    long j2;
                    long abs2;
                    long j3;
                    long j4;
                    int i;
                    long currentTimeMillis = zzfa.f17616i.mo3169m().currentTimeMillis();
                    abs = Math.max(0, ((Long) zzaf.f10694I.m12332b()).longValue());
                    if (!m22802d().m29405F()) {
                        if (!m22802d().m29400A()) {
                            obj = null;
                            if (obj == null) {
                                v = zzfa.f17616i.m22720b().m27375v();
                                if (!TextUtils.isEmpty(v) || ".none.".equals(v)) {
                                    max = Math.max(0, ((Long) zzaf.f10688C.m12332b()).longValue());
                                } else {
                                    max = Math.max(0, ((Long) zzaf.f10689D.m12332b()).longValue());
                                }
                            } else {
                                max = Math.max(0, ((Long) zzaf.f10687B.m12332b()).longValue());
                            }
                            a = zzfa.f17616i.m22722c().f21383c.m12360a();
                            a2 = zzfa.f17616i.m22722c().f21384d.m12360a();
                            j = max;
                            j2 = abs;
                            abs = Math.max(m22802d().m29402C(), m22802d().m29403D());
                            if (abs != 0) {
                                abs = currentTimeMillis - Math.abs(abs - currentTimeMillis);
                                abs2 = currentTimeMillis - Math.abs(a - currentTimeMillis);
                                currentTimeMillis -= Math.abs(a2 - currentTimeMillis);
                                abs2 = Math.max(abs2, currentTimeMillis);
                                j3 = abs + j2;
                                if (obj != null && abs2 > 0) {
                                    j3 = Math.min(abs, abs2) + j;
                                }
                                j4 = j;
                                abs2 = m22805f().m29781a(abs2, j4) ? abs2 + j4 : j3;
                                if (currentTimeMillis != 0 && currentTimeMillis >= abs) {
                                    for (i = 0; i < Math.min(20, Math.max(0, ((Integer) zzaf.f10696K.m12332b()).intValue())); i++) {
                                        abs2 += Math.max(0, ((Long) zzaf.f10695J.m12332b()).longValue()) * (1 << i);
                                        if (abs2 > currentTimeMillis) {
                                            break;
                                        }
                                    }
                                }
                                if (abs2 != 0) {
                                    zzfa.f17616i.mo3172r().m28555x().m12354a("Next upload time is 0");
                                    m22775s().m12319b();
                                    m22776t().m29750f();
                                    return;
                                } else if (m22800c().m29511f()) {
                                    currentTimeMillis = zzfa.f17616i.m22722c().f21385e.m12360a();
                                    abs = Math.max(0, ((Long) zzaf.f10737z.m12332b()).longValue());
                                    if (!m22805f().m29781a(currentTimeMillis, abs)) {
                                        abs2 = Math.max(abs2, currentTimeMillis + abs);
                                    }
                                    m22775s().m12319b();
                                    abs2 -= zzfa.f17616i.mo3169m().currentTimeMillis();
                                    if (abs2 <= 0) {
                                        abs2 = Math.max(0, ((Long) zzaf.f10690E.m12332b()).longValue());
                                        zzfa.f17616i.m22722c().f21383c.m12361a(zzfa.f17616i.mo3169m().currentTimeMillis());
                                    }
                                    zzfa.f17616i.mo3172r().m28555x().m12355a("Upload scheduled in approximately ms", Long.valueOf(abs2));
                                    m22776t().m29745a(abs2);
                                    return;
                                } else {
                                    zzfa.f17616i.mo3172r().m28555x().m12354a("No network");
                                    m22775s().m12318a();
                                    m22776t().m29750f();
                                    return;
                                }
                            }
                            abs2 = 0;
                            if (abs2 != 0) {
                                zzfa.f17616i.mo3172r().m28555x().m12354a("Next upload time is 0");
                                m22775s().m12319b();
                                m22776t().m29750f();
                                return;
                            } else if (m22800c().m29511f()) {
                                currentTimeMillis = zzfa.f17616i.m22722c().f21385e.m12360a();
                                abs = Math.max(0, ((Long) zzaf.f10737z.m12332b()).longValue());
                                if (m22805f().m29781a(currentTimeMillis, abs)) {
                                    abs2 = Math.max(abs2, currentTimeMillis + abs);
                                }
                                m22775s().m12319b();
                                abs2 -= zzfa.f17616i.mo3169m().currentTimeMillis();
                                if (abs2 <= 0) {
                                    abs2 = Math.max(0, ((Long) zzaf.f10690E.m12332b()).longValue());
                                    zzfa.f17616i.m22722c().f21383c.m12361a(zzfa.f17616i.mo3169m().currentTimeMillis());
                                }
                                zzfa.f17616i.mo3172r().m28555x().m12355a("Upload scheduled in approximately ms", Long.valueOf(abs2));
                                m22776t().m29745a(abs2);
                                return;
                            } else {
                                zzfa.f17616i.mo3172r().m28555x().m12354a("No network");
                                m22775s().m12318a();
                                m22776t().m29750f();
                                return;
                            }
                        }
                    }
                    obj = 1;
                    if (obj == null) {
                        max = Math.max(0, ((Long) zzaf.f10687B.m12332b()).longValue());
                    } else {
                        v = zzfa.f17616i.m22720b().m27375v();
                        if (TextUtils.isEmpty(v)) {
                        }
                        max = Math.max(0, ((Long) zzaf.f10688C.m12332b()).longValue());
                    }
                    a = zzfa.f17616i.m22722c().f21383c.m12360a();
                    a2 = zzfa.f17616i.m22722c().f21384d.m12360a();
                    j = max;
                    j2 = abs;
                    abs = Math.max(m22802d().m29402C(), m22802d().m29403D());
                    if (abs != 0) {
                        abs = currentTimeMillis - Math.abs(abs - currentTimeMillis);
                        abs2 = currentTimeMillis - Math.abs(a - currentTimeMillis);
                        currentTimeMillis -= Math.abs(a2 - currentTimeMillis);
                        abs2 = Math.max(abs2, currentTimeMillis);
                        j3 = abs + j2;
                        j3 = Math.min(abs, abs2) + j;
                        j4 = j;
                        if (m22805f().m29781a(abs2, j4)) {
                        }
                        for (i = 0; i < Math.min(20, Math.max(0, ((Integer) zzaf.f10696K.m12332b()).intValue())); i++) {
                            abs2 += Math.max(0, ((Long) zzaf.f10695J.m12332b()).longValue()) * (1 << i);
                            if (abs2 > currentTimeMillis) {
                                break;
                            }
                        }
                    }
                    abs2 = 0;
                    if (abs2 != 0) {
                        zzfa.f17616i.mo3172r().m28555x().m12354a("Next upload time is 0");
                        m22775s().m12319b();
                        m22776t().m29750f();
                        return;
                    } else if (m22800c().m29511f()) {
                        zzfa.f17616i.mo3172r().m28555x().m12354a("No network");
                        m22775s().m12318a();
                        m22776t().m29750f();
                        return;
                    } else {
                        currentTimeMillis = zzfa.f17616i.m22722c().f21385e.m12360a();
                        abs = Math.max(0, ((Long) zzaf.f10737z.m12332b()).longValue());
                        if (m22805f().m29781a(currentTimeMillis, abs)) {
                            abs2 = Math.max(abs2, currentTimeMillis + abs);
                        }
                        m22775s().m12319b();
                        abs2 -= zzfa.f17616i.mo3169m().currentTimeMillis();
                        if (abs2 <= 0) {
                            abs2 = Math.max(0, ((Long) zzaf.f10690E.m12332b()).longValue());
                            zzfa.f17616i.m22722c().f21383c.m12361a(zzfa.f17616i.mo3169m().currentTimeMillis());
                        }
                        zzfa.f17616i.mo3172r().m28555x().m12355a("Upload scheduled in approximately ms", Long.valueOf(abs2));
                        m22776t().m29745a(abs2);
                        return;
                    }
                }
            }
            zzfa.f17616i.mo3172r().m28555x().m12354a("Nothing to upload or uploading impossible");
            m22775s().m12319b();
            m22776t().m29750f();
        }
    }

    /* renamed from: a */
    final void m22791a(Runnable runnable) {
        m22777v();
        if (this.f17620m == null) {
            this.f17620m = new ArrayList();
        }
        this.f17620m.add(runnable);
    }

    /* renamed from: z */
    private final void m22781z() {
        m22777v();
        if (!(this.f17623p || this.f17624q)) {
            if (!this.f17625r) {
                this.f17616i.mo3172r().m28555x().m12354a("Stopping uploading service(s)");
                if (this.f17620m != null) {
                    for (Runnable run : this.f17620m) {
                        run.run();
                    }
                    this.f17620m.clear();
                    return;
                }
                return;
            }
        }
        this.f17616i.mo3172r().m28555x().m12357a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f17623p), Boolean.valueOf(this.f17624q), Boolean.valueOf(this.f17625r));
    }

    /* renamed from: b */
    private final java.lang.Boolean m22770b(com.google.android.gms.measurement.internal.cp r9) {
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
        r8 = this;
        r0 = r9.m12281k();	 Catch:{ NameNotFoundException -> 0x005d }
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ NameNotFoundException -> 0x005d }
        r4 = 1;	 Catch:{ NameNotFoundException -> 0x005d }
        r5 = 0;	 Catch:{ NameNotFoundException -> 0x005d }
        r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ NameNotFoundException -> 0x005d }
        if (r6 == 0) goto L_0x002f;	 Catch:{ NameNotFoundException -> 0x005d }
    L_0x000d:
        r0 = r8.f17616i;	 Catch:{ NameNotFoundException -> 0x005d }
        r0 = r0.mo3170n();	 Catch:{ NameNotFoundException -> 0x005d }
        r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0);	 Catch:{ NameNotFoundException -> 0x005d }
        r1 = r9.m12254b();	 Catch:{ NameNotFoundException -> 0x005d }
        r0 = r0.getPackageInfo(r1, r5);	 Catch:{ NameNotFoundException -> 0x005d }
        r0 = r0.versionCode;	 Catch:{ NameNotFoundException -> 0x005d }
        r1 = r9.m12281k();	 Catch:{ NameNotFoundException -> 0x005d }
        r6 = (long) r0;	 Catch:{ NameNotFoundException -> 0x005d }
        r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));	 Catch:{ NameNotFoundException -> 0x005d }
        if (r9 != 0) goto L_0x0058;	 Catch:{ NameNotFoundException -> 0x005d }
    L_0x002a:
        r9 = java.lang.Boolean.valueOf(r4);	 Catch:{ NameNotFoundException -> 0x005d }
        return r9;	 Catch:{ NameNotFoundException -> 0x005d }
    L_0x002f:
        r0 = r8.f17616i;	 Catch:{ NameNotFoundException -> 0x005d }
        r0 = r0.mo3170n();	 Catch:{ NameNotFoundException -> 0x005d }
        r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0);	 Catch:{ NameNotFoundException -> 0x005d }
        r1 = r9.m12254b();	 Catch:{ NameNotFoundException -> 0x005d }
        r0 = r0.getPackageInfo(r1, r5);	 Catch:{ NameNotFoundException -> 0x005d }
        r0 = r0.versionName;	 Catch:{ NameNotFoundException -> 0x005d }
        r1 = r9.m12279j();	 Catch:{ NameNotFoundException -> 0x005d }
        if (r1 == 0) goto L_0x0058;	 Catch:{ NameNotFoundException -> 0x005d }
    L_0x0049:
        r9 = r9.m12279j();	 Catch:{ NameNotFoundException -> 0x005d }
        r9 = r9.equals(r0);	 Catch:{ NameNotFoundException -> 0x005d }
        if (r9 == 0) goto L_0x0058;	 Catch:{ NameNotFoundException -> 0x005d }
    L_0x0053:
        r9 = java.lang.Boolean.valueOf(r4);	 Catch:{ NameNotFoundException -> 0x005d }
        return r9;
    L_0x0058:
        r9 = java.lang.Boolean.valueOf(r5);
        return r9;
    L_0x005d:
        r9 = 0;
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfa.b(com.google.android.gms.measurement.internal.cp):java.lang.Boolean");
    }

    @VisibleForTesting
    /* renamed from: A */
    private final boolean m22753A() {
        m22777v();
        try {
            this.f17627t = new RandomAccessFile(new File(this.f17616i.mo3170n().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f17626s = this.f17627t.tryLock();
            if (this.f17626s != null) {
                this.f17616i.mo3172r().m28555x().m12354a("Storage concurrent access okay");
                return true;
            }
            this.f17616i.mo3172r().v_().m12354a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            this.f17616i.mo3172r().v_().m12355a("Failed to acquire storage lock", e);
        } catch (IOException e2) {
            this.f17616i.mo3172r().v_().m12355a("Failed to access storage lock file", e2);
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    private final int m22755a(FileChannel fileChannel) {
        m22777v();
        if (fileChannel != null) {
            if (fileChannel.isOpen()) {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0);
                    fileChannel = fileChannel.read(allocate);
                    if (fileChannel != 4) {
                        if (fileChannel != -1) {
                            this.f17616i.mo3172r().m28540i().m12355a("Unexpected data length. Bytes read", Integer.valueOf(fileChannel));
                        }
                        return 0;
                    }
                    allocate.flip();
                    fileChannel = allocate.getInt();
                    return fileChannel;
                } catch (FileChannel fileChannel2) {
                    this.f17616i.mo3172r().v_().m12355a("Failed to read from channel", fileChannel2);
                    fileChannel2 = null;
                }
            }
        }
        this.f17616i.mo3172r().v_().m12354a("Bad channel to read from");
        return 0;
    }

    @VisibleForTesting
    /* renamed from: a */
    private final boolean m22763a(int i, FileChannel fileChannel) {
        m22777v();
        if (fileChannel != null) {
            if (fileChannel.isOpen()) {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.putInt(i);
                allocate.flip();
                try {
                    fileChannel.truncate(0);
                    fileChannel.write(allocate);
                    fileChannel.force(true);
                    if (fileChannel.size() != 4) {
                        this.f17616i.mo3172r().v_().m12355a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
                    }
                    return true;
                } catch (int i2) {
                    this.f17616i.mo3172r().v_().m12355a("Failed to write to channel", i2);
                    return false;
                }
            }
        }
        this.f17616i.mo3172r().v_().m12354a("Bad channel to read from");
        return false;
    }

    /* renamed from: k */
    final void m22810k() {
        m22777v();
        m22808i();
        if (!this.f17618k) {
            this.f17616i.mo3172r().m28553v().m12354a("This instance being marked as an uploader");
            m22777v();
            m22808i();
            if (m22754B() && m22753A()) {
                int a = m22755a(this.f17627t);
                int A = this.f17616i.m22745z().m29445A();
                m22777v();
                if (a > A) {
                    this.f17616i.mo3172r().v_().m12356a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(a), Integer.valueOf(A));
                } else if (a < A) {
                    if (m22763a(A, this.f17627t)) {
                        this.f17616i.mo3172r().m28555x().m12356a("Storage version upgraded. Previous, current version", Integer.valueOf(a), Integer.valueOf(A));
                    } else {
                        this.f17616i.mo3172r().v_().m12356a("Storage version upgrade failed. Previous, current version", Integer.valueOf(a), Integer.valueOf(A));
                    }
                }
            }
            this.f17618k = true;
            m22780y();
        }
    }

    /* renamed from: B */
    private final boolean m22754B() {
        m22777v();
        m22808i();
        return this.f17618k;
    }

    @VisibleForTesting
    /* renamed from: b */
    final void m22796b(zzh zzh) {
        if (this.f17628u != null) {
            this.f17629v = new ArrayList();
            this.f17629v.addAll(this.f17628u);
        }
        an d = m22802d();
        String str = zzh.f20689a;
        Preconditions.checkNotEmpty(str);
        d.mo4395d();
        d.m28438k();
        try {
            SQLiteDatabase y = d.m29442y();
            String[] strArr = new String[]{str};
            int delete = ((((((((y.delete("apps", "app_id=?", strArr) + 0) + y.delete("events", "app_id=?", strArr)) + y.delete("user_attributes", "app_id=?", strArr)) + y.delete("conditional_properties", "app_id=?", strArr)) + y.delete("raw_events", "app_id=?", strArr)) + y.delete("raw_events_metadata", "app_id=?", strArr)) + y.delete("queue", "app_id=?", strArr)) + y.delete("audience_filter_values", "app_id=?", strArr)) + y.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                d.mo3172r().m28555x().m12356a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            d.mo3172r().v_().m12356a("Error resetting analytics data. appId, error", zzap.m28525a(str), e);
        }
        zzh a = m22758a(this.f17616i.mo3170n(), zzh.f20689a, zzh.f20690b, zzh.f20696h, zzh.f20703o, zzh.f20704p, zzh.f20701m, zzh.f20706r);
        if (!this.f17616i.m22720b().m27358j(zzh.f20689a) || zzh.f20696h != null) {
            m22801c(a);
        }
    }

    /* renamed from: a */
    private final com.google.android.gms.measurement.internal.zzh m22758a(android.content.Context r27, java.lang.String r28, java.lang.String r29, boolean r30, boolean r31, boolean r32, long r33, java.lang.String r35) {
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
        r26 = this;
        r0 = r26;
        r2 = r28;
        r1 = "Unknown";
        r3 = "Unknown";
        r4 = "Unknown";
        r5 = r27.getPackageManager();
        r6 = 0;
        if (r5 != 0) goto L_0x0021;
    L_0x0011:
        r1 = r0.f17616i;
        r1 = r1.mo3172r();
        r1 = r1.v_();
        r2 = "PackageManager is null, can not log app install information";
        r1.m12354a(r2);
        return r6;
    L_0x0021:
        r5 = r5.getInstallerPackageName(r2);	 Catch:{ IllegalArgumentException -> 0x0027 }
        r1 = r5;
        goto L_0x003a;
    L_0x0027:
        r5 = r0.f17616i;
        r5 = r5.mo3172r();
        r5 = r5.v_();
        r7 = "Error retrieving installer package name. appId";
        r8 = com.google.android.gms.measurement.internal.zzap.m28525a(r28);
        r5.m12355a(r7, r8);
    L_0x003a:
        if (r1 != 0) goto L_0x0040;
    L_0x003c:
        r1 = "manual_install";
    L_0x003e:
        r7 = r1;
        goto L_0x004b;
    L_0x0040:
        r5 = "com.android.vending";
        r5 = r5.equals(r1);
        if (r5 == 0) goto L_0x003e;
    L_0x0048:
        r1 = "";
        goto L_0x003e;
    L_0x004b:
        r1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r27);	 Catch:{ NameNotFoundException -> 0x00c2 }
        r5 = 0;	 Catch:{ NameNotFoundException -> 0x00c2 }
        r1 = r1.getPackageInfo(r2, r5);	 Catch:{ NameNotFoundException -> 0x00c2 }
        if (r1 == 0) goto L_0x0070;	 Catch:{ NameNotFoundException -> 0x00c2 }
    L_0x0056:
        r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r27);	 Catch:{ NameNotFoundException -> 0x00c2 }
        r3 = r3.getApplicationLabel(r2);	 Catch:{ NameNotFoundException -> 0x00c2 }
        r5 = android.text.TextUtils.isEmpty(r3);	 Catch:{ NameNotFoundException -> 0x00c2 }
        if (r5 != 0) goto L_0x0069;	 Catch:{ NameNotFoundException -> 0x00c2 }
    L_0x0064:
        r3 = r3.toString();	 Catch:{ NameNotFoundException -> 0x00c2 }
        r4 = r3;	 Catch:{ NameNotFoundException -> 0x00c2 }
    L_0x0069:
        r3 = r1.versionName;	 Catch:{ NameNotFoundException -> 0x00c2 }
        r1 = r1.versionCode;	 Catch:{ NameNotFoundException -> 0x00c2 }
        r4 = r3;
        r3 = r1;
        goto L_0x0075;
    L_0x0070:
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4 = r3;
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
    L_0x0075:
        r16 = 0;
        r1 = r0.f17616i;
        r1.mo3173u();
        r5 = 0;
        r1 = r0.f17616i;
        r1 = r1.m22720b();
        r1 = r1.m27359k(r2);
        if (r1 == 0) goto L_0x008d;
    L_0x008a:
        r18 = r33;
        goto L_0x008f;
    L_0x008d:
        r18 = r5;
    L_0x008f:
        r25 = new com.google.android.gms.measurement.internal.zzh;
        r1 = r25;
        r5 = (long) r3;
        r3 = r0.f17616i;
        r3 = r3.m22720b();
        r8 = r3.m27350f();
        r3 = r0.f17616i;
        r3 = r3.m22729j();
        r10 = r27;
        r10 = r3.m28610a(r10, r2);
        r12 = 0;
        r14 = 0;
        r15 = "";
        r20 = 0;
        r23 = 0;
        r2 = r28;
        r3 = r29;
        r13 = r30;
        r21 = r31;
        r22 = r32;
        r24 = r35;
        r1.<init>(r2, r3, r4, r5, r7, r8, r10, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24);
        return r25;
    L_0x00c2:
        r1 = r0.f17616i;
        r1 = r1.mo3172r();
        r1 = r1.v_();
        r3 = "Error retrieving newly installed package info. appId, appName";
        r2 = com.google.android.gms.measurement.internal.zzap.m28525a(r28);
        r1.m12356a(r3, r2, r4);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfa.a(android.content.Context, java.lang.String, java.lang.String, boolean, boolean, boolean, long, java.lang.String):com.google.android.gms.measurement.internal.zzh");
    }

    /* renamed from: a */
    final void m22787a(zzfh zzfh, zzh zzh) {
        m22777v();
        m22808i();
        if (!TextUtils.isEmpty(zzh.f20690b) || !TextUtils.isEmpty(zzh.f20706r)) {
            if (zzh.f20696h) {
                if (this.f17616i.m22720b().m27348d(zzh.f20689a, zzaf.am) && "_ap".equals(zzfh.f20681a)) {
                    cm c = m22802d().m29429c(zzh.f20689a, "_ap");
                    if (!(c == null || !"auto".equals(zzfh.f20683c) || "auto".equals(c.f10570b))) {
                        this.f17616i.mo3172r().m28554w().m12354a("Not setting lower priority ad personalization property");
                        return;
                    }
                }
                int c2 = this.f17616i.m22729j().m28627c(zzfh.f20681a);
                if (c2 != 0) {
                    this.f17616i.m22729j();
                    this.f17616i.m22729j().m28619a(zzh.f20689a, c2, "_ev", zzfk.m28589a(zzfh.f20681a, 24, true), zzfh.f20681a != null ? zzfh.f20681a.length() : 0);
                    return;
                }
                int b = this.f17616i.m22729j().m28624b(zzfh.f20681a, zzfh.m27328a());
                if (b != 0) {
                    this.f17616i.m22729j();
                    String a = zzfk.m28589a(zzfh.f20681a, 24, true);
                    zzfh = zzfh.m27328a();
                    int length = (zzfh == null || !((zzfh instanceof String) || (zzfh instanceof CharSequence))) ? 0 : String.valueOf(zzfh).length();
                    this.f17616i.m22729j().m28619a(zzh.f20689a, b, "_ev", a, length);
                    return;
                }
                Object c3 = this.f17616i.m22729j().m28628c(zzfh.f20681a, zzfh.m27328a());
                if (c3 != null) {
                    cm cmVar = new cm(zzh.f20689a, zzfh.f20683c, zzfh.f20681a, zzfh.f20682b, c3);
                    this.f17616i.mo3172r().m28554w().m12356a("Setting user property", this.f17616i.m22730k().m28507c(cmVar.f10571c), c3);
                    m22802d().m29437f();
                    try {
                        m22773e(zzh);
                        zzfh = m22802d().m29421a(cmVar);
                        m22802d().m29440w();
                        if (zzfh != null) {
                            this.f17616i.mo3172r().m28554w().m12356a("User property set", this.f17616i.m22730k().m28507c(cmVar.f10571c), cmVar.f10573e);
                        } else {
                            this.f17616i.mo3172r().v_().m12356a("Too many unique user properties are set. Ignoring user property", this.f17616i.m22730k().m28507c(cmVar.f10571c), cmVar.f10573e);
                            this.f17616i.m22729j().m28619a(zzh.f20689a, 9, null, null, 0);
                        }
                        m22802d().m29441x();
                        return;
                    } catch (Throwable th) {
                        m22802d().m29441x();
                    }
                } else {
                    return;
                }
            }
            m22773e(zzh);
        }
    }

    /* renamed from: b */
    final void m22795b(zzfh zzfh, zzh zzh) {
        m22777v();
        m22808i();
        if (!TextUtils.isEmpty(zzh.f20690b) || !TextUtils.isEmpty(zzh.f20706r)) {
            if (zzh.f20696h) {
                if (this.f17616i.m22720b().m27348d(zzh.f20689a, zzaf.am) && "_ap".equals(zzfh.f20681a)) {
                    cm c = m22802d().m29429c(zzh.f20689a, "_ap");
                    if (!(c == null || !"auto".equals(zzfh.f20683c) || "auto".equals(c.f10570b))) {
                        this.f17616i.mo3172r().m28554w().m12354a("Not removing higher priority ad personalization property");
                        return;
                    }
                }
                this.f17616i.mo3172r().m28554w().m12355a("Removing user property", this.f17616i.m22730k().m28507c(zzfh.f20681a));
                m22802d().m29437f();
                try {
                    m22773e(zzh);
                    m22802d().m29427b(zzh.f20689a, zzfh.f20681a);
                    m22802d().m29440w();
                    this.f17616i.mo3172r().m28554w().m12355a("User property removed", this.f17616i.m22730k().m28507c(zzfh.f20681a));
                } finally {
                    m22802d().m29441x();
                }
            } else {
                m22773e(zzh);
            }
        }
    }

    /* renamed from: a */
    final void m22784a(cg cgVar) {
        this.f17621n++;
    }

    /* renamed from: l */
    final void m22811l() {
        this.f17622o++;
    }

    /* renamed from: o */
    final zzbt m22814o() {
        return this.f17616i;
    }

    /* renamed from: c */
    final void m22801c(zzh zzh) {
        zzfa zzfa = this;
        zzh zzh2 = zzh;
        m22777v();
        m22808i();
        Preconditions.checkNotNull(zzh);
        Preconditions.checkNotEmpty(zzh2.f20689a);
        if (!TextUtils.isEmpty(zzh2.f20690b) || !TextUtils.isEmpty(zzh2.f20706r)) {
            cp b = m22802d().m29425b(zzh2.f20689a);
            if (!(b == null || !TextUtils.isEmpty(b.m12262d()) || TextUtils.isEmpty(zzh2.f20690b))) {
                b.m12272g(0);
                m22802d().m29416a(b);
                m22774p().m29541d(zzh2.f20689a);
            }
            if (zzh2.f20696h) {
                int i;
                long j = zzh2.f20701m;
                if (j == 0) {
                    j = zzfa.f17616i.mo3169m().currentTimeMillis();
                }
                int i2 = zzh2.f20702n;
                if (i2 == 0 || i2 == 1) {
                    i = i2;
                } else {
                    zzfa.f17616i.mo3172r().m28540i().m12356a("Incorrect app type, assuming installed app. appId, appType", zzap.m28525a(zzh2.f20689a), Integer.valueOf(i2));
                    i = 0;
                }
                m22802d().m29437f();
                an d;
                String b2;
                try {
                    b = m22802d().m29425b(zzh2.f20689a);
                    if (b != null) {
                        zzfa.f17616i.m22729j();
                        if (zzfk.m28597a(zzh2.f20690b, b.m12262d(), zzh2.f20706r, b.m12265e())) {
                            zzfa.f17616i.mo3172r().m28540i().m12355a("New GMP App Id passed in. Removing cached database data. appId", zzap.m28525a(b.m12254b()));
                            d = m22802d();
                            b2 = b.m12254b();
                            d.m28438k();
                            d.mo4395d();
                            Preconditions.checkNotEmpty(b2);
                            SQLiteDatabase y = d.m29442y();
                            String[] strArr = new String[]{b2};
                            int delete = ((((((((y.delete("events", "app_id=?", strArr) + 0) + y.delete("user_attributes", "app_id=?", strArr)) + y.delete("conditional_properties", "app_id=?", strArr)) + y.delete("apps", "app_id=?", strArr)) + y.delete("raw_events", "app_id=?", strArr)) + y.delete("raw_events_metadata", "app_id=?", strArr)) + y.delete("event_filters", "app_id=?", strArr)) + y.delete("property_filters", "app_id=?", strArr)) + y.delete("audience_filter_values", "app_id=?", strArr);
                            if (delete > 0) {
                                d.mo3172r().m28555x().m12356a("Deleted application data. app, records", b2, Integer.valueOf(delete));
                            }
                            b = null;
                        }
                    }
                } catch (SQLiteException e) {
                    d.mo3172r().v_().m12356a("Error deleting application data. appId, error", zzap.m28525a(b2), e);
                } catch (Throwable th) {
                    m22802d().m29441x();
                }
                if (b != null) {
                    Bundle bundle;
                    if (b.m12281k() != -2147483648L) {
                        if (b.m12281k() != zzh2.f20698j) {
                            bundle = new Bundle();
                            bundle.putString("_pv", b.m12279j());
                            m22785a(new zzad("_au", new zzaa(bundle), "auto", j), zzh2);
                        }
                    } else if (!(b.m12279j() == null || b.m12279j().equals(zzh2.f20691c))) {
                        bundle = new Bundle();
                        bundle.putString("_pv", b.m12279j());
                        m22785a(new zzad("_au", new zzaa(bundle), "auto", j), zzh2);
                    }
                }
                m22773e(zzh);
                cy a = i == 0 ? m22802d().m29409a(zzh2.f20689a, "_f") : i == 1 ? m22802d().m29409a(zzh2.f20689a, "_v") : null;
                if (a == null) {
                    long j2;
                    Bundle bundle2;
                    long j3 = ((j / 3600000) + 1) * 3600000;
                    if (i == 0) {
                        j2 = 1;
                        m22787a(new zzfh("_fot", j, Long.valueOf(j3), "auto"), zzh2);
                        if (zzfa.f17616i.m22720b().m27363m(zzh2.f20690b)) {
                            m22777v();
                            zzfa.f17616i.m22725f().m12370a(zzh2.f20689a);
                        }
                        m22777v();
                        m22808i();
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("_c", j2);
                        bundle3.putLong("_r", j2);
                        bundle3.putLong("_uwa", 0);
                        bundle3.putLong("_pfo", 0);
                        bundle3.putLong("_sys", 0);
                        bundle3.putLong("_sysu", 0);
                        if (zzfa.f17616i.m22720b().m27358j(zzh2.f20689a) && zzh2.f20705q) {
                            bundle3.putLong("_dac", j2);
                        }
                        if (zzfa.f17616i.mo3170n().getPackageManager() == null) {
                            zzfa.f17616i.mo3172r().v_().m12355a("PackageManager is null, first open report might be inaccurate. appId", zzap.m28525a(zzh2.f20689a));
                        } else {
                            PackageInfo packageInfo;
                            ApplicationInfo applicationInfo;
                            try {
                                packageInfo = Wrappers.packageManager(zzfa.f17616i.mo3170n()).getPackageInfo(zzh2.f20689a, 0);
                            } catch (NameNotFoundException e2) {
                                zzfa.f17616i.mo3172r().v_().m12356a("Package info is null, first open report might be inaccurate. appId", zzap.m28525a(zzh2.f20689a), e2);
                                packageInfo = null;
                            }
                            if (!(packageInfo == null || packageInfo.firstInstallTime == 0)) {
                                Object obj;
                                if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                    bundle3.putLong("_uwa", j2);
                                    obj = null;
                                } else {
                                    obj = 1;
                                }
                                zzfh zzfh = r7;
                                zzfh zzfh2 = new zzfh("_fi", j, Long.valueOf(obj != null ? j2 : 0), "auto");
                                m22787a(zzfh, zzh2);
                            }
                            try {
                                applicationInfo = Wrappers.packageManager(zzfa.f17616i.mo3170n()).getApplicationInfo(zzh2.f20689a, 0);
                            } catch (NameNotFoundException e22) {
                                zzfa.f17616i.mo3172r().v_().m12356a("Application info is null, first open report might be inaccurate. appId", zzap.m28525a(zzh2.f20689a), e22);
                                applicationInfo = null;
                            }
                            if (applicationInfo != null) {
                                if ((applicationInfo.flags & 1) != 0) {
                                    bundle3.putLong("_sys", j2);
                                }
                                if ((applicationInfo.flags & 128) != 0) {
                                    bundle3.putLong("_sysu", j2);
                                }
                            }
                        }
                        an d2 = m22802d();
                        String str = zzh2.f20689a;
                        Preconditions.checkNotEmpty(str);
                        d2.mo4395d();
                        d2.m28438k();
                        long h = d2.m29439h(str, "first_open_count");
                        if (h >= 0) {
                            bundle3.putLong("_pfo", h);
                        }
                        m22785a(new zzad("_f", new zzaa(bundle3), "auto", j), zzh2);
                    } else {
                        j2 = 1;
                        if (i == 1) {
                            m22787a(new zzfh("_fvt", j, Long.valueOf(j3), "auto"), zzh2);
                            m22777v();
                            m22808i();
                            bundle2 = new Bundle();
                            bundle2.putLong("_c", j2);
                            bundle2.putLong("_r", j2);
                            if (zzfa.f17616i.m22720b().m27358j(zzh2.f20689a) && zzh2.f20705q) {
                                bundle2.putLong("_dac", j2);
                            }
                            m22785a(new zzad("_v", new zzaa(bundle2), "auto", j), zzh2);
                        }
                    }
                    bundle2 = new Bundle();
                    bundle2.putLong("_et", j2);
                    m22785a(new zzad("_e", new zzaa(bundle2), "auto", j), zzh2);
                } else if (zzh2.f20697i) {
                    m22785a(new zzad("_cd", new zzaa(new Bundle()), "auto", j), zzh2);
                }
                m22802d().m29440w();
                m22802d().m29441x();
                return;
            }
            m22773e(zzh);
        }
    }

    /* renamed from: a */
    private final zzh m22759a(String str) {
        zzfa zzfa = this;
        String str2 = str;
        cp b = m22802d().m29425b(str2);
        if (b != null) {
            if (!TextUtils.isEmpty(b.m12279j())) {
                Boolean b2 = m22770b(b);
                if (b2 == null || b2.booleanValue()) {
                    cp cpVar = b;
                    return new zzh(str, b.m12262d(), b.m12279j(), b.m12281k(), b.m12283l(), b.m12285m(), b.m12287n(), null, b.m12290o(), false, b.m12271g(), cpVar.m12247B(), 0, 0, cpVar.m12248C(), cpVar.m12249D(), false, cpVar.m12265e());
                }
                zzfa.f17616i.mo3172r().v_().m12355a("App version does not match; dropping. appId", zzap.m28525a(str));
                return null;
            }
        }
        zzfa.f17616i.mo3172r().m28554w().m12355a("No app data available; dropping", str2);
        return null;
    }

    /* renamed from: a */
    final void m22789a(zzl zzl) {
        zzh a = m22759a(zzl.f20707a);
        if (a != null) {
            m22790a(zzl, a);
        }
    }

    /* renamed from: a */
    final void m22790a(zzl zzl, zzh zzh) {
        Preconditions.checkNotNull(zzl);
        Preconditions.checkNotEmpty(zzl.f20707a);
        Preconditions.checkNotNull(zzl.f20708b);
        Preconditions.checkNotNull(zzl.f20709c);
        Preconditions.checkNotEmpty(zzl.f20709c.f20681a);
        m22777v();
        m22808i();
        if (!TextUtils.isEmpty(zzh.f20690b) || !TextUtils.isEmpty(zzh.f20706r)) {
            if (zzh.f20696h) {
                zzl zzl2 = new zzl(zzl);
                zzl = null;
                zzl2.f20711e = false;
                m22802d().m29437f();
                try {
                    zzl d = m22802d().m29430d(zzl2.f20707a, zzl2.f20709c.f20681a);
                    if (!(d == null || d.f20708b.equals(zzl2.f20708b))) {
                        this.f17616i.mo3172r().m28540i().m12357a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f17616i.m22730k().m28507c(zzl2.f20709c.f20681a), zzl2.f20708b, d.f20708b);
                    }
                    if (d != null && d.f20711e) {
                        zzl2.f20708b = d.f20708b;
                        zzl2.f20710d = d.f20710d;
                        zzl2.f20714h = d.f20714h;
                        zzl2.f20712f = d.f20712f;
                        zzl2.f20715i = d.f20715i;
                        zzl2.f20711e = d.f20711e;
                        zzl2.f20709c = new zzfh(zzl2.f20709c.f20681a, d.f20709c.f20682b, zzl2.f20709c.m27328a(), d.f20709c.f20683c);
                    } else if (TextUtils.isEmpty(zzl2.f20712f)) {
                        zzl2.f20709c = new zzfh(zzl2.f20709c.f20681a, zzl2.f20710d, zzl2.f20709c.m27328a(), zzl2.f20709c.f20683c);
                        zzl2.f20711e = true;
                        zzl = true;
                    }
                    if (zzl2.f20711e) {
                        zzfh zzfh = zzl2.f20709c;
                        cm cmVar = new cm(zzl2.f20707a, zzl2.f20708b, zzfh.f20681a, zzfh.f20682b, zzfh.m27328a());
                        if (m22802d().m29421a(cmVar)) {
                            this.f17616i.mo3172r().m28554w().m12357a("User property updated immediately", zzl2.f20707a, this.f17616i.m22730k().m28507c(cmVar.f10571c), cmVar.f10573e);
                        } else {
                            this.f17616i.mo3172r().v_().m12357a("(2)Too many active user properties, ignoring", zzap.m28525a(zzl2.f20707a), this.f17616i.m22730k().m28507c(cmVar.f10571c), cmVar.f10573e);
                        }
                        if (!(zzl == null || zzl2.f20715i == null)) {
                            m22772b(new zzad(zzl2.f20715i, zzl2.f20710d), zzh);
                        }
                    }
                    if (m22802d().m29422a(zzl2) != null) {
                        this.f17616i.mo3172r().m28554w().m12357a("Conditional property added", zzl2.f20707a, this.f17616i.m22730k().m28507c(zzl2.f20709c.f20681a), zzl2.f20709c.m27328a());
                    } else {
                        this.f17616i.mo3172r().v_().m12357a("Too many conditional properties, ignoring", zzap.m28525a(zzl2.f20707a), this.f17616i.m22730k().m28507c(zzl2.f20709c.f20681a), zzl2.f20709c.m27328a());
                    }
                    m22802d().m29440w();
                } finally {
                    m22802d().m29441x();
                }
            } else {
                m22773e(zzh);
            }
        }
    }

    /* renamed from: b */
    final void m22797b(zzl zzl) {
        zzh a = m22759a(zzl.f20707a);
        if (a != null) {
            m22798b(zzl, a);
        }
    }

    /* renamed from: b */
    final void m22798b(zzl zzl, zzh zzh) {
        Preconditions.checkNotNull(zzl);
        Preconditions.checkNotEmpty(zzl.f20707a);
        Preconditions.checkNotNull(zzl.f20709c);
        Preconditions.checkNotEmpty(zzl.f20709c.f20681a);
        m22777v();
        m22808i();
        if (!TextUtils.isEmpty(zzh.f20690b) || !TextUtils.isEmpty(zzh.f20706r)) {
            if (zzh.f20696h) {
                m22802d().m29437f();
                try {
                    m22773e(zzh);
                    zzl d = m22802d().m29430d(zzl.f20707a, zzl.f20709c.f20681a);
                    if (d != null) {
                        this.f17616i.mo3172r().m28554w().m12356a("Removing conditional user property", zzl.f20707a, this.f17616i.m22730k().m28507c(zzl.f20709c.f20681a));
                        m22802d().m29432e(zzl.f20707a, zzl.f20709c.f20681a);
                        if (d.f20711e) {
                            m22802d().m29427b(zzl.f20707a, zzl.f20709c.f20681a);
                        }
                        if (zzl.f20717k != null) {
                            Bundle bundle = null;
                            if (zzl.f20717k.f20675b != null) {
                                bundle = zzl.f20717k.f20675b.m27303b();
                            }
                            Bundle bundle2 = bundle;
                            m22772b(this.f17616i.m22729j().m28614a(zzl.f20707a, zzl.f20717k.f20674a, bundle2, d.f20708b, zzl.f20717k.f20677d, true, false), zzh);
                        }
                    } else {
                        this.f17616i.mo3172r().m28540i().m12356a("Conditional user property doesn't exist", zzap.m28525a(zzl.f20707a), this.f17616i.m22730k().m28507c(zzl.f20709c.f20681a));
                    }
                    m22802d().m29440w();
                } finally {
                    m22802d().m29441x();
                }
            } else {
                m22773e(zzh);
            }
        }
    }

    /* renamed from: e */
    private final cp m22773e(zzh zzh) {
        Object obj;
        m22777v();
        m22808i();
        Preconditions.checkNotNull(zzh);
        Preconditions.checkNotEmpty(zzh.f20689a);
        cp b = m22802d().m29425b(zzh.f20689a);
        String b2 = this.f17616i.m22722c().m28450b(zzh.f20689a);
        if (b == null) {
            b = new cp(this.f17616i, zzh.f20689a);
            b.m12252a(this.f17616i.m22729j().m28638k());
            b.m12264d(b2);
        } else if (b2.equals(b.m12268f())) {
            obj = null;
            if (!TextUtils.equals(zzh.f20690b, b.m12262d())) {
                b.m12256b(zzh.f20690b);
                obj = 1;
            }
            if (!TextUtils.equals(zzh.f20706r, b.m12265e())) {
                b.m12260c(zzh.f20706r);
                obj = 1;
            }
            if (!(TextUtils.isEmpty(zzh.f20699k) || zzh.f20699k.equals(b.m12271g()))) {
                b.m12267e(zzh.f20699k);
                obj = 1;
            }
            if (!(zzh.f20693e == 0 || zzh.f20693e == b.m12285m())) {
                b.m12263d(zzh.f20693e);
                obj = 1;
            }
            if (!(TextUtils.isEmpty(zzh.f20691c) || zzh.f20691c.equals(b.m12279j()))) {
                b.m12270f(zzh.f20691c);
                obj = 1;
            }
            if (zzh.f20698j != b.m12281k()) {
                b.m12259c(zzh.f20698j);
                obj = 1;
            }
            if (!(zzh.f20692d == null || zzh.f20692d.equals(b.m12283l()))) {
                b.m12273g(zzh.f20692d);
                obj = 1;
            }
            if (zzh.f20694f != b.m12287n()) {
                b.m12266e(zzh.f20694f);
                obj = 1;
            }
            if (zzh.f20696h != b.m12290o()) {
                b.m12253a(zzh.f20696h);
                obj = 1;
            }
            if (!(TextUtils.isEmpty(zzh.f20695g) || zzh.f20695g.equals(b.m12301z()))) {
                b.m12276h(zzh.f20695g);
                obj = 1;
            }
            if (zzh.f20700l != b.m12247B()) {
                b.m12289o(zzh.f20700l);
                obj = 1;
            }
            if (zzh.f20703o != b.m12248C()) {
                b.m12257b(zzh.f20703o);
                obj = 1;
            }
            if (zzh.f20704p != b.m12249D()) {
                b.m12261c(zzh.f20704p);
                obj = 1;
            }
            if (obj != null) {
                m22802d().m29416a(b);
            }
            return b;
        } else {
            b.m12264d(b2);
            b.m12252a(this.f17616i.m22729j().m28638k());
        }
        obj = 1;
        if (TextUtils.equals(zzh.f20690b, b.m12262d())) {
            b.m12256b(zzh.f20690b);
            obj = 1;
        }
        if (TextUtils.equals(zzh.f20706r, b.m12265e())) {
            b.m12260c(zzh.f20706r);
            obj = 1;
        }
        b.m12267e(zzh.f20699k);
        obj = 1;
        b.m12263d(zzh.f20693e);
        obj = 1;
        b.m12270f(zzh.f20691c);
        obj = 1;
        if (zzh.f20698j != b.m12281k()) {
            b.m12259c(zzh.f20698j);
            obj = 1;
        }
        b.m12273g(zzh.f20692d);
        obj = 1;
        if (zzh.f20694f != b.m12287n()) {
            b.m12266e(zzh.f20694f);
            obj = 1;
        }
        if (zzh.f20696h != b.m12290o()) {
            b.m12253a(zzh.f20696h);
            obj = 1;
        }
        b.m12276h(zzh.f20695g);
        obj = 1;
        if (zzh.f20700l != b.m12247B()) {
            b.m12289o(zzh.f20700l);
            obj = 1;
        }
        if (zzh.f20703o != b.m12248C()) {
            b.m12257b(zzh.f20703o);
            obj = 1;
        }
        if (zzh.f20704p != b.m12249D()) {
            b.m12261c(zzh.f20704p);
            obj = 1;
        }
        if (obj != null) {
            m22802d().m29416a(b);
        }
        return b;
    }

    /* renamed from: b */
    public final byte[] m22799b(zzad zzad, String str) {
        byte[] bArr;
        zzad zzad2 = zzad;
        String str2 = str;
        m22808i();
        m22777v();
        this.f17616i.m22713F();
        Preconditions.checkNotNull(zzad);
        Preconditions.checkNotEmpty(str);
        zzzg zzgh = new zzgh();
        m22802d().m29437f();
        try {
            cp b = m22802d().m29425b(str2);
            byte[] bArr2;
            if (b == null) {
                r1.f17616i.mo3172r().m28554w().m12355a("Log and bundle not available. package_name", str2);
                bArr2 = new byte[0];
                return bArr2;
            } else if (b.m12290o()) {
                Integer num;
                cm c;
                Bundle bundle;
                zzgi zzgi;
                cp cpVar;
                zzzg zzzg;
                long j;
                if (("_iap".equals(zzad2.f20674a) || "ecommerce_purchase".equals(zzad2.f20674a)) && !m22765a(str2, zzad2)) {
                    r1.f17616i.mo3172r().m28540i().m12355a("Failed to handle purchase event at single event bundle creation. appId", zzap.m28525a(str));
                }
                boolean e = r1.f17616i.m22720b().m27349e(str2);
                Long valueOf = Long.valueOf(0);
                if (e && "_e".equals(zzad2.f20674a)) {
                    if (zzad2.f20675b != null) {
                        if (zzad2.f20675b.m27301a() != 0) {
                            if (zzad2.f20675b.m27304b("_et") == null) {
                                r1.f17616i.mo3172r().m28540i().m12355a("The engagement event does not include duration. appId", zzap.m28525a(str));
                            } else {
                                valueOf = zzad2.f20675b.m27304b("_et");
                            }
                        }
                    }
                    r1.f17616i.mo3172r().m28540i().m12355a("The engagement event does not contain any parameters. appId", zzap.m28525a(str));
                }
                zzgi zzgi2 = new zzgi();
                zzgh.f20598a = new zzgi[]{zzgi2};
                zzgi2.f20613a = Integer.valueOf(1);
                zzgi2.f20621i = "android";
                zzgi2.f20627o = b.m12254b();
                zzgi2.f20626n = b.m12283l();
                zzgi2.f20628p = b.m12279j();
                long k = b.m12281k();
                if (k == -2147483648L) {
                    num = null;
                } else {
                    num = Integer.valueOf((int) k);
                }
                zzgi2.f20602C = num;
                zzgi2.f20629q = Long.valueOf(b.m12285m());
                zzgi2.f20637y = b.m12262d();
                if (TextUtils.isEmpty(zzgi2.f20637y)) {
                    zzgi2.f20608I = b.m12265e();
                }
                zzgi2.f20634v = Long.valueOf(b.m12287n());
                if (r1.f17616i.m22710C() && zzn.m27332w() && r1.f17616i.m22720b().m27344c(zzgi2.f20627o)) {
                    zzgi2.f20606G = null;
                }
                Pair a = r1.f17616i.m22722c().m28448a(b.m12254b());
                if (!(!b.m12248C() || a == null || TextUtils.isEmpty((CharSequence) a.first))) {
                    zzgi2.f20631s = (String) a.first;
                    zzgi2.f20632t = (Boolean) a.second;
                }
                r1.f17616i.m22744y().m27280A();
                zzgi2.f20623k = Build.MODEL;
                r1.f17616i.m22744y().m27280A();
                zzgi2.f20622j = VERSION.RELEASE;
                zzgi2.f20625m = Integer.valueOf((int) r1.f17616i.m22744y().m28655g());
                zzgi2.f20624l = r1.f17616i.m22744y().m28656h();
                zzgi2.f20633u = b.m12258c();
                zzgi2.f20601B = b.m12271g();
                List a2 = m22802d().m29412a(b.m12254b());
                zzgi2.f20615c = new zzgl[a2.size()];
                if (e) {
                    c = m22802d().m29429c(zzgi2.f20627o, "_lte");
                    if (c != null) {
                        if (c.f10573e != null) {
                            if (valueOf.longValue() > 0) {
                                c = new cm(zzgi2.f20627o, "auto", "_lte", r1.f17616i.mo3169m().currentTimeMillis(), Long.valueOf(((Long) c.f10573e).longValue() + valueOf.longValue()));
                            }
                        }
                    }
                    cm cmVar = new cm(zzgi2.f20627o, "auto", "_lte", r1.f17616i.mo3169m().currentTimeMillis(), valueOf);
                } else {
                    c = null;
                }
                String str3 = null;
                for (int i = 0; i < a2.size(); i++) {
                    zzgl zzgl = new zzgl();
                    zzgi2.f20615c[i] = zzgl;
                    zzgl.f20648b = ((cm) a2.get(i)).f10571c;
                    zzgl.f20647a = Long.valueOf(((cm) a2.get(i)).f10572d);
                    m22805f().m29780a(zzgl, ((cm) a2.get(i)).f10573e);
                    if (e && "_lte".equals(zzgl.f20648b)) {
                        zzgl.f20650d = (Long) c.f10573e;
                        zzgl.f20647a = Long.valueOf(r1.f17616i.mo3169m().currentTimeMillis());
                        str3 = zzgl;
                    }
                }
                if (e && r7 == null) {
                    zzgl zzgl2 = new zzgl();
                    zzgl2.f20648b = "_lte";
                    zzgl2.f20647a = Long.valueOf(r1.f17616i.mo3169m().currentTimeMillis());
                    zzgl2.f20650d = (Long) c.f10573e;
                    zzgi2.f20615c = (zzgl[]) Arrays.copyOf(zzgi2.f20615c, zzgi2.f20615c.length + 1);
                    zzgi2.f20615c[zzgi2.f20615c.length - 1] = zzgl2;
                }
                if (valueOf.longValue() > 0) {
                    m22802d().m29421a(c);
                }
                Bundle b2 = zzad2.f20675b.m27303b();
                if ("_iap".equals(zzad2.f20674a)) {
                    b2.putLong("_c", 1);
                    r1.f17616i.mo3172r().m28554w().m12354a("Marking in-app purchase as real-time");
                    b2.putLong("_r", 1);
                }
                b2.putString("_o", zzad2.f20676c);
                if (r1.f17616i.m22729j().m28634f(zzgi2.f20627o)) {
                    r1.f17616i.m22729j().m28618a(b2, "_dbg", Long.valueOf(1));
                    r1.f17616i.m22729j().m28618a(b2, "_r", Long.valueOf(1));
                }
                cy a3 = m22802d().m29409a(str2, zzad2.f20674a);
                if (a3 == null) {
                    cy cyVar = a3;
                    bundle = b2;
                    bArr = null;
                    zzgi = zzgi2;
                    cpVar = b;
                    zzzg = zzgh;
                    a3 = new cy(str, zzad2.f20674a, 1, 0, zzad2.f20677d, 0, null, null, null, null);
                    m22802d().m29417a(cyVar);
                    j = 0;
                } else {
                    bundle = b2;
                    zzgi = zzgi2;
                    cpVar = b;
                    zzzg = zzgh;
                    bArr = null;
                    long j2 = a3.f10616e;
                    m22802d().m29417a(a3.m12312a(zzad2.f20677d).m12311a());
                    j = j2;
                }
                zzy zzy = new zzy(r1.f17616i, zzad2.f20676c, str, zzad2.f20674a, zzad2.f20677d, j, bundle);
                zzgf zzgf = new zzgf();
                zzgi zzgi3 = zzgi;
                zzgi3.f20614b = new zzgf[]{zzgf};
                zzgf.f20589c = Long.valueOf(zzy.f10793c);
                zzgf.f20588b = zzy.f10792b;
                zzgf.f20590d = Long.valueOf(zzy.f10794d);
                zzgf.f20587a = new zzgg[zzy.f10795e.m27301a()];
                Iterator it = zzy.f10795e.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    zzgg zzgg = new zzgg();
                    int i3 = i2 + 1;
                    zzgf.f20587a[i2] = zzgg;
                    zzgg.f20593a = str4;
                    m22805f().m29779a(zzgg, zzy.f10795e.m27302a(str4));
                    i2 = i3;
                }
                zzgi3.f20600A = m22766a(cpVar.m12254b(), zzgi3.f20615c, zzgi3.f20614b);
                zzgi3.f20617e = zzgf.f20589c;
                zzgi3.f20618f = zzgf.f20589c;
                long i4 = cpVar.m12277i();
                zzgi3.f20620h = i4 != 0 ? Long.valueOf(i4) : bArr;
                long h = cpVar.m12274h();
                if (h != 0) {
                    i4 = h;
                }
                zzgi3.f20619g = i4 != 0 ? Long.valueOf(i4) : bArr;
                cpVar.m12294s();
                zzgi3.f20635w = Integer.valueOf((int) cpVar.m12291p());
                zzgi3.f20630r = Long.valueOf(r1.f17616i.m22720b().m27350f());
                zzgi3.f20616d = Long.valueOf(r1.f17616i.mo3169m().currentTimeMillis());
                zzgi3.f20638z = Boolean.TRUE;
                cp cpVar2 = cpVar;
                cpVar2.m12251a(zzgi3.f20617e.longValue());
                cpVar2.m12255b(zzgi3.f20618f.longValue());
                m22802d().m29416a(cpVar2);
                m22802d().m29440w();
                m22802d().m29441x();
                try {
                    bArr2 = new byte[zzzg.m12203e()];
                    zzyy a4 = zzyy.m12153a(bArr2, 0, bArr2.length);
                    zzzg.mo3160a(a4);
                    a4.m12164a();
                    return m22805f().m29787b(bArr2);
                } catch (IOException e2) {
                    r1.f17616i.mo3172r().v_().m12356a("Data loss. Failed to bundle and serialize. appId", zzap.m28525a(str), e2);
                    return bArr;
                }
            } else {
                r1.f17616i.mo3172r().m28554w().m12355a("Log and bundle disabled. package_name", str2);
                bArr2 = new byte[0];
                m22802d().m29441x();
                return bArr2;
            }
        } finally {
            m22802d().m29441x();
        }
    }

    /* renamed from: d */
    final String m22803d(zzh zzh) {
        try {
            return (String) this.f17616i.mo3171q().m28566a(new cl(this, zzh)).get(30000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            this.f17616i.mo3172r().v_().m12356a("Failed to get app instance id. appId", zzap.m28525a(zzh.f20689a), e);
            return null;
        }
    }

    /* renamed from: a */
    final void m22793a(boolean z) {
        m22780y();
    }
}
