package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import java.util.List;
import javax.annotation.Nullable;

@zzaer
@Class(creator = "AdRequestParcelCreator")
public final class zzjk extends AbstractSafeParcelable {
    public static final Creator<zzjk> CREATOR = new zzjm();
    @Field(id = 1)
    /* renamed from: a */
    public final int f20206a;
    @Field(id = 2)
    @Deprecated
    /* renamed from: b */
    public final long f20207b;
    @Field(id = 3)
    /* renamed from: c */
    public final Bundle f20208c;
    @Field(id = 4)
    @Deprecated
    /* renamed from: d */
    public final int f20209d;
    @Field(id = 5)
    /* renamed from: e */
    public final List<String> f20210e;
    @Field(id = 6)
    /* renamed from: f */
    public final boolean f20211f;
    @Field(id = 7)
    /* renamed from: g */
    public final int f20212g;
    @Field(id = 8)
    /* renamed from: h */
    public final boolean f20213h;
    @Field(id = 9)
    /* renamed from: i */
    public final String f20214i;
    @Field(id = 10)
    /* renamed from: j */
    public final zznb f20215j;
    @Field(id = 11)
    /* renamed from: k */
    public final Location f20216k;
    @Field(id = 12)
    /* renamed from: l */
    public final String f20217l;
    @Field(id = 13)
    /* renamed from: m */
    public final Bundle f20218m;
    @Field(id = 14)
    /* renamed from: n */
    public final Bundle f20219n;
    @Field(id = 15)
    /* renamed from: o */
    public final List<String> f20220o;
    @Field(id = 16)
    /* renamed from: p */
    public final String f20221p;
    @Field(id = 17)
    /* renamed from: q */
    public final String f20222q;
    @Field(id = 18)
    @Deprecated
    /* renamed from: r */
    public final boolean f20223r;
    @Field(id = 19)
    @Nullable
    /* renamed from: s */
    public final zzje f20224s;
    @Field(id = 20)
    /* renamed from: t */
    public final int f20225t;
    @Field(id = 21)
    @Nullable
    /* renamed from: u */
    public final String f20226u;

    @Constructor
    public zzjk(@Param(id = 1) int i, @Param(id = 2) long j, @Param(id = 3) Bundle bundle, @Param(id = 4) int i2, @Param(id = 5) List<String> list, @Param(id = 6) boolean z, @Param(id = 7) int i3, @Param(id = 8) boolean z2, @Param(id = 9) String str, @Param(id = 10) zznb zznb, @Param(id = 11) Location location, @Param(id = 12) String str2, @Param(id = 13) Bundle bundle2, @Param(id = 14) Bundle bundle3, @Param(id = 15) List<String> list2, @Param(id = 16) String str3, @Param(id = 17) String str4, @Param(id = 18) boolean z3, @Param(id = 19) zzje zzje, @Param(id = 20) int i4, @Param(id = 21) @Nullable String str5) {
        this.f20206a = i;
        this.f20207b = j;
        r0.f20208c = bundle == null ? new Bundle() : bundle;
        r0.f20209d = i2;
        r0.f20210e = list;
        r0.f20211f = z;
        r0.f20212g = i3;
        r0.f20213h = z2;
        r0.f20214i = str;
        r0.f20215j = zznb;
        r0.f20216k = location;
        r0.f20217l = str2;
        r0.f20218m = bundle2 == null ? new Bundle() : bundle2;
        r0.f20219n = bundle3;
        r0.f20220o = list2;
        r0.f20221p = str3;
        r0.f20222q = str4;
        r0.f20223r = z3;
        r0.f20224s = zzje;
        r0.f20225t = i4;
        r0.f20226u = str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f20206a);
        SafeParcelWriter.writeLong(parcel, 2, this.f20207b);
        SafeParcelWriter.writeBundle(parcel, 3, this.f20208c, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f20209d);
        SafeParcelWriter.writeStringList(parcel, 5, this.f20210e, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f20211f);
        SafeParcelWriter.writeInt(parcel, 7, this.f20212g);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f20213h);
        SafeParcelWriter.writeString(parcel, 9, this.f20214i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f20215j, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f20216k, i, false);
        SafeParcelWriter.writeString(parcel, 12, this.f20217l, false);
        SafeParcelWriter.writeBundle(parcel, 13, this.f20218m, false);
        SafeParcelWriter.writeBundle(parcel, 14, this.f20219n, false);
        SafeParcelWriter.writeStringList(parcel, 15, this.f20220o, false);
        SafeParcelWriter.writeString(parcel, 16, this.f20221p, false);
        SafeParcelWriter.writeString(parcel, 17, this.f20222q, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.f20223r);
        SafeParcelWriter.writeParcelable(parcel, 19, this.f20224s, i, false);
        SafeParcelWriter.writeInt(parcel, 20, this.f20225t);
        SafeParcelWriter.writeString(parcel, 21, this.f20226u, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjk)) {
            return false;
        }
        zzjk zzjk = (zzjk) obj;
        if (this.f20206a == zzjk.f20206a && this.f20207b == zzjk.f20207b && Objects.equal(this.f20208c, zzjk.f20208c) && this.f20209d == zzjk.f20209d && Objects.equal(this.f20210e, zzjk.f20210e) && this.f20211f == zzjk.f20211f && this.f20212g == zzjk.f20212g && this.f20213h == zzjk.f20213h && Objects.equal(this.f20214i, zzjk.f20214i) && Objects.equal(this.f20215j, zzjk.f20215j) && Objects.equal(this.f20216k, zzjk.f20216k) && Objects.equal(this.f20217l, zzjk.f20217l) && Objects.equal(this.f20218m, zzjk.f20218m) && Objects.equal(this.f20219n, zzjk.f20219n) && Objects.equal(this.f20220o, zzjk.f20220o) && Objects.equal(this.f20221p, zzjk.f20221p) && Objects.equal(this.f20222q, zzjk.f20222q) && this.f20223r == zzjk.f20223r && this.f20225t == zzjk.f20225t && Objects.equal(this.f20226u, zzjk.f20226u) != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f20206a), Long.valueOf(this.f20207b), this.f20208c, Integer.valueOf(this.f20209d), this.f20210e, Boolean.valueOf(this.f20211f), Integer.valueOf(this.f20212g), Boolean.valueOf(this.f20213h), this.f20214i, this.f20215j, this.f20216k, this.f20217l, this.f20218m, this.f20219n, this.f20220o, this.f20221p, this.f20222q, Boolean.valueOf(this.f20223r), Integer.valueOf(this.f20225t), this.f20226u);
    }

    /* renamed from: a */
    public final zzjk m26613a() {
        Bundle bundle = this.f20218m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle == null) {
            bundle = r0.f20208c;
            r0.f20218m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", r0.f20208c);
        }
        return new zzjk(r0.f20206a, r0.f20207b, bundle, r0.f20209d, r0.f20210e, r0.f20211f, r0.f20212g, r0.f20213h, r0.f20214i, r0.f20215j, r0.f20216k, r0.f20217l, r0.f20218m, r0.f20219n, r0.f20220o, r0.f20221p, r0.f20222q, r0.f20223r, r0.f20224s, r0.f20225t, r0.f20226u);
    }
}
