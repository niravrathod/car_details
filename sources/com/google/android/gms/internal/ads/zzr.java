package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaf.C2453a;
import java.util.Collections;
import java.util.Map;

public abstract class zzr<T> implements Comparable<zzr<T>> {
    /* renamed from: a */
    private final C2453a f9770a;
    /* renamed from: b */
    private final int f9771b;
    /* renamed from: c */
    private final String f9772c;
    /* renamed from: d */
    private final int f9773d;
    /* renamed from: e */
    private final Object f9774e;
    /* renamed from: f */
    private zzy f9775f;
    /* renamed from: g */
    private Integer f9776g;
    /* renamed from: h */
    private zzv f9777h;
    /* renamed from: i */
    private boolean f9778i;
    /* renamed from: j */
    private boolean f9779j;
    /* renamed from: k */
    private boolean f9780k;
    /* renamed from: l */
    private boolean f9781l;
    /* renamed from: m */
    private zzab f9782m;
    /* renamed from: n */
    private zzc f9783n;
    /* renamed from: o */
    private ti f9784o;

    public zzr(int i, String str, zzy zzy) {
        this.f9770a = C2453a.f8534a ? new C2453a() : null;
        this.f9774e = new Object();
        this.f9778i = true;
        int i2 = 0;
        this.f9779j = false;
        this.f9780k = false;
        this.f9781l = false;
        this.f9783n = null;
        this.f9771b = i;
        this.f9772c = str;
        this.f9775f = zzy;
        this.f9782m = new zzh();
        if (TextUtils.isEmpty(str) == 0) {
            i = Uri.parse(str);
            if (i != 0) {
                i = i.getHost();
                if (i != 0) {
                    i2 = i.hashCode();
                }
            }
        }
        this.f9773d = i2;
    }

    /* renamed from: a */
    protected abstract zzx<T> mo2369a(zzp zzp);

    /* renamed from: a */
    protected abstract void mo2370a(T t);

    /* renamed from: a */
    public byte[] mo4154a() {
        return null;
    }

    /* renamed from: c */
    public final int m11031c() {
        return this.f9771b;
    }

    /* renamed from: d */
    public final int m11033d() {
        return this.f9773d;
    }

    /* renamed from: b */
    public final void m11030b(String str) {
        if (C2453a.f8534a) {
            this.f9770a.m9507a(str, Thread.currentThread().getId());
        }
    }

    /* renamed from: c */
    final void m11032c(String str) {
        if (this.f9777h != null) {
            this.f9777h.m11146b(this);
        }
        if (C2453a.f8534a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new tg(this, str, id));
            } else {
                this.f9770a.m9507a(str, id);
                this.f9770a.m9506a(toString());
            }
        }
    }

    /* renamed from: a */
    public final zzr<?> m11022a(zzv zzv) {
        this.f9777h = zzv;
        return this;
    }

    /* renamed from: a */
    public final zzr<?> m11020a(int i) {
        this.f9776g = Integer.valueOf(i);
        return this;
    }

    /* renamed from: e */
    public final String m11034e() {
        return this.f9772c;
    }

    /* renamed from: f */
    public final String m11035f() {
        String str = this.f9772c;
        int i = this.f9771b;
        if (i != 0) {
            if (i != -1) {
                String num = Integer.toString(i);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(num).length() + 1) + String.valueOf(str).length());
                stringBuilder.append(num);
                stringBuilder.append('-');
                stringBuilder.append(str);
                return stringBuilder.toString();
            }
        }
        return str;
    }

    /* renamed from: a */
    public final zzr<?> m11021a(zzc zzc) {
        this.f9783n = zzc;
        return this;
    }

    /* renamed from: g */
    public final zzc m11036g() {
        return this.f9783n;
    }

    /* renamed from: h */
    public final boolean m11037h() {
        synchronized (this.f9774e) {
        }
        return false;
    }

    /* renamed from: b */
    public Map<String, String> mo4155b() {
        return Collections.emptyMap();
    }

    /* renamed from: i */
    public final boolean m11038i() {
        return this.f9778i;
    }

    /* renamed from: j */
    public final int m11039j() {
        return this.f9782m.mo2453a();
    }

    /* renamed from: k */
    public final zzab m11040k() {
        return this.f9782m;
    }

    /* renamed from: l */
    public final void m11041l() {
        synchronized (this.f9774e) {
            this.f9780k = true;
        }
    }

    /* renamed from: m */
    public final boolean m11042m() {
        boolean z;
        synchronized (this.f9774e) {
            z = this.f9780k;
        }
        return z;
    }

    /* renamed from: a */
    public final void m11025a(zzae zzae) {
        synchronized (this.f9774e) {
            zzy zzy = this.f9775f;
        }
        if (zzy != null) {
            zzy.mo1945a(zzae);
        }
    }

    /* renamed from: a */
    final void m11024a(ti tiVar) {
        synchronized (this.f9774e) {
            this.f9784o = tiVar;
        }
    }

    /* renamed from: a */
    final void m11026a(zzx<?> zzx) {
        synchronized (this.f9774e) {
            ti tiVar = this.f9784o;
        }
        if (tiVar != null) {
            tiVar.mo2162a(this, zzx);
        }
    }

    /* renamed from: n */
    final void m11043n() {
        synchronized (this.f9774e) {
            ti tiVar = this.f9784o;
        }
        if (tiVar != null) {
            tiVar.mo2161a(this);
        }
    }

    public String toString() {
        String str = "0x";
        String valueOf = String.valueOf(Integer.toHexString(this.f9773d));
        str = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        m11037h();
        valueOf = "[ ] ";
        String str2 = this.f9772c;
        String valueOf2 = String.valueOf(zzu.NORMAL);
        String valueOf3 = String.valueOf(this.f9776g);
        StringBuilder stringBuilder = new StringBuilder(((((String.valueOf(valueOf).length() + 3) + String.valueOf(str2).length()) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(str2);
        stringBuilder.append(" ");
        stringBuilder.append(str);
        stringBuilder.append(" ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(" ");
        stringBuilder.append(valueOf3);
        return stringBuilder.toString();
    }

    public /* synthetic */ int compareTo(Object obj) {
        zzr zzr = (zzr) obj;
        zzu zzu = zzu.NORMAL;
        zzu zzu2 = zzu.NORMAL;
        return zzu == zzu2 ? this.f9776g.intValue() - zzr.f9776g.intValue() : zzu2.ordinal() - zzu.ordinal();
    }
}
