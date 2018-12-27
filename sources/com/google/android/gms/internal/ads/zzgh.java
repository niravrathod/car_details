package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzgh {
    /* renamed from: a */
    private final int f9471a;
    /* renamed from: b */
    private final int f9472b;
    /* renamed from: c */
    private final int f9473c;
    /* renamed from: d */
    private final zzgu f9474d;
    /* renamed from: e */
    private final zzhd f9475e;
    /* renamed from: f */
    private final Object f9476f = new Object();
    /* renamed from: g */
    private ArrayList<String> f9477g = new ArrayList();
    /* renamed from: h */
    private ArrayList<String> f9478h = new ArrayList();
    /* renamed from: i */
    private ArrayList<zzgs> f9479i = new ArrayList();
    /* renamed from: j */
    private int f9480j = 0;
    /* renamed from: k */
    private int f9481k = 0;
    /* renamed from: l */
    private int f9482l = 0;
    /* renamed from: m */
    private int f9483m;
    /* renamed from: n */
    private String f9484n = "";
    /* renamed from: o */
    private String f9485o = "";
    /* renamed from: p */
    private String f9486p = "";

    public zzgh(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f9471a = i;
        this.f9472b = i2;
        this.f9473c = i3;
        this.f9474d = new zzgu(i4);
        this.f9475e = new zzhd(i5, i6, i7);
    }

    /* renamed from: a */
    public final boolean m10615a() {
        boolean z;
        synchronized (this.f9476f) {
            z = this.f9482l == 0;
        }
        return z;
    }

    /* renamed from: b */
    public final String m10616b() {
        return this.f9484n;
    }

    /* renamed from: c */
    public final String m10618c() {
        return this.f9485o;
    }

    /* renamed from: d */
    public final String m10619d() {
        return this.f9486p;
    }

    /* renamed from: e */
    public final void m10620e() {
        synchronized (this.f9476f) {
            this.f9483m -= 100;
        }
    }

    /* renamed from: f */
    public final void m10621f() {
        synchronized (this.f9476f) {
            this.f9482l--;
        }
    }

    /* renamed from: g */
    public final void m10622g() {
        synchronized (this.f9476f) {
            this.f9482l++;
        }
    }

    /* renamed from: a */
    public final void m10614a(String str, boolean z, float f, float f2, float f3, float f4) {
        m10612c(str, z, f, f2, f3, f4);
        synchronized (this.f9476f) {
            if (this.f9482l >= false) {
                zzaok.m10001b("ActivityContent: negative number of WebViews.");
            }
            m10623h();
        }
    }

    /* renamed from: b */
    public final void m10617b(String str, boolean z, float f, float f2, float f3, float f4) {
        m10612c(str, z, f, f2, f3, f4);
    }

    /* renamed from: c */
    private final void m10612c(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null) {
            if (str.length() >= this.f9473c) {
                synchronized (this.f9476f) {
                    this.f9477g.add(str);
                    this.f9480j += str.length();
                    if (z) {
                        this.f9478h.add(str);
                        this.f9479i.add(new zzgs(f, f2, f3, f4, this.f9478h.size() - 1));
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final void m10623h() {
        synchronized (this.f9476f) {
            int i = (this.f9480j * this.f9471a) + (this.f9481k * this.f9472b);
            if (i > this.f9483m) {
                this.f9483m = i;
                if (!zzbv.zzeo().m9726k().mo2344b()) {
                    this.f9484n = this.f9474d.m10652a(this.f9477g);
                    this.f9485o = this.f9474d.m10652a(this.f9478h);
                }
                if (!zzbv.zzeo().m9726k().mo2350d()) {
                    this.f9486p = this.f9475e.m10663a(this.f9478h, this.f9479i);
                }
            }
        }
    }

    /* renamed from: i */
    public final int m10624i() {
        return this.f9483m;
    }

    /* renamed from: a */
    public final void m10613a(int i) {
        this.f9481k = i;
    }

    /* renamed from: a */
    private static String m10611a(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty() != 0) {
            return "";
        }
        i = new StringBuilder();
        arrayList = arrayList;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            i.append((String) obj);
            i.append(' ');
            if (i.length() > 100) {
                break;
            }
        }
        i.deleteCharAt(i.length() - 1);
        arrayList = i.toString();
        if (arrayList.length() < 100) {
            return arrayList;
        }
        return arrayList.substring(0, 100);
    }

    public final String toString() {
        int i = this.f9481k;
        int i2 = this.f9483m;
        int i3 = this.f9480j;
        String a = m10611a(this.f9477g, 100);
        String a2 = m10611a(this.f9478h, 100);
        String str = this.f9484n;
        String str2 = this.f9485o;
        String str3 = this.f9486p;
        StringBuilder stringBuilder = new StringBuilder(((((String.valueOf(a).length() + 165) + String.valueOf(a2).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append("ActivityContent fetchId: ");
        stringBuilder.append(i);
        stringBuilder.append(" score:");
        stringBuilder.append(i2);
        stringBuilder.append(" total_length:");
        stringBuilder.append(i3);
        stringBuilder.append("\n text: ");
        stringBuilder.append(a);
        stringBuilder.append("\n viewableText");
        stringBuilder.append(a2);
        stringBuilder.append("\n signture: ");
        stringBuilder.append(str);
        stringBuilder.append("\n viewableSignture: ");
        stringBuilder.append(str2);
        stringBuilder.append("\n viewableSignatureForVertical: ");
        stringBuilder.append(str3);
        return stringBuilder.toString();
    }

    @VisibleForTesting
    /* renamed from: j */
    final int m10625j() {
        return this.f9480j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgh)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzgh zzgh = (zzgh) obj;
        return (zzgh.f9484n == null || zzgh.f9484n.equals(this.f9484n) == null) ? false : true;
    }

    public final int hashCode() {
        return this.f9484n.hashCode();
    }
}
