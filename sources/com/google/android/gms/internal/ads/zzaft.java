package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@Class(creator = "AdResponseParcelCreator")
@ParametersAreNonnullByDefault
public final class zzaft extends AbstractSafeParcelable {
    public static final Creator<zzaft> CREATOR = new zzafu();
    @Field(id = 33)
    /* renamed from: A */
    public final zzajk f19760A;
    @Field(id = 34)
    /* renamed from: B */
    public final List<String> f19761B;
    @Field(id = 35)
    /* renamed from: C */
    public final List<String> f19762C;
    @Field(id = 36)
    /* renamed from: D */
    public final boolean f19763D;
    @Field(id = 37)
    /* renamed from: E */
    public final zzafv f19764E;
    @Field(id = 38)
    /* renamed from: F */
    public final boolean f19765F;
    @Field(id = 39)
    /* renamed from: G */
    public String f19766G;
    @Field(id = 40)
    /* renamed from: H */
    public final List<String> f19767H;
    @Field(id = 42)
    /* renamed from: I */
    public final boolean f19768I;
    @Field(id = 43)
    /* renamed from: J */
    public final String f19769J;
    @Field(id = 44)
    /* renamed from: K */
    public final zzajv f19770K;
    @Field(id = 45)
    /* renamed from: L */
    public final String f19771L;
    @Field(id = 46)
    /* renamed from: M */
    public final boolean f19772M;
    @Field(id = 47)
    /* renamed from: N */
    public final boolean f19773N;
    @Field(id = 49)
    /* renamed from: O */
    public final boolean f19774O;
    @Field(id = 50)
    /* renamed from: P */
    public final int f19775P;
    @Field(id = 51)
    /* renamed from: Q */
    public final boolean f19776Q;
    @Field(id = 52)
    /* renamed from: R */
    public final List<String> f19777R;
    @Field(id = 53)
    /* renamed from: S */
    public final boolean f19778S;
    @Field(id = 54)
    /* renamed from: T */
    public final String f19779T;
    @Field(id = 55)
    /* renamed from: U */
    public String f19780U;
    @Field(id = 56)
    /* renamed from: V */
    public boolean f19781V;
    /* renamed from: W */
    private zzafp f19782W;
    @Field(id = 1)
    /* renamed from: X */
    private final int f19783X;
    @Field(id = 28)
    /* renamed from: Y */
    private zzagf f19784Y;
    @Field(id = 48)
    /* renamed from: Z */
    private Bundle f19785Z;
    @Field(id = 2)
    /* renamed from: a */
    public final String f19786a;
    @Field(id = 3)
    /* renamed from: b */
    public String f19787b;
    @Field(id = 4)
    /* renamed from: c */
    public final List<String> f19788c;
    @Field(id = 5)
    /* renamed from: d */
    public final int f19789d;
    @Field(id = 6)
    /* renamed from: e */
    public final List<String> f19790e;
    @Field(id = 7)
    /* renamed from: f */
    public final long f19791f;
    @Field(id = 8)
    /* renamed from: g */
    public final boolean f19792g;
    @Field(id = 9)
    /* renamed from: h */
    public final long f19793h;
    @Field(id = 10)
    /* renamed from: i */
    public final List<String> f19794i;
    @Field(id = 11)
    /* renamed from: j */
    public final long f19795j;
    @Field(id = 12)
    /* renamed from: k */
    public final int f19796k;
    @Field(id = 13)
    /* renamed from: l */
    public final String f19797l;
    @Field(id = 14)
    /* renamed from: m */
    public final long f19798m;
    @Field(id = 15)
    /* renamed from: n */
    public final String f19799n;
    @Field(id = 18)
    /* renamed from: o */
    public final boolean f19800o;
    @Field(id = 19)
    /* renamed from: p */
    public final String f19801p;
    @Field(id = 21)
    /* renamed from: q */
    public final String f19802q;
    @Field(id = 22)
    /* renamed from: r */
    public final boolean f19803r;
    @Field(id = 23)
    /* renamed from: s */
    public final boolean f19804s;
    @Field(id = 24)
    /* renamed from: t */
    public final boolean f19805t;
    @Field(id = 25)
    /* renamed from: u */
    public final boolean f19806u;
    @Field(id = 26)
    /* renamed from: v */
    public final boolean f19807v;
    @Field(id = 29)
    /* renamed from: w */
    public String f19808w;
    @Field(id = 30)
    /* renamed from: x */
    public final String f19809x;
    @Field(id = 31)
    /* renamed from: y */
    public final boolean f19810y;
    @Field(id = 32)
    /* renamed from: z */
    public final boolean f19811z;

    public zzaft(zzafp zzafp, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, zzajk zzajk, List<String> list4, List<String> list5, boolean z10, zzafv zzafv, boolean z11, String str8, List<String> list6, boolean z12, String str9, zzajv zzajv, String str10, boolean z13, boolean z14, boolean z15, int i2, boolean z16, List<String> list7, boolean z17, String str11, String str12, boolean z18) {
        this(19, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, null, null, str7, z8, z9, zzajk, list4, list5, z10, zzafv, z11, str8, list6, z12, str9, zzajv, str10, z13, z14, null, z15, 0, z16, list7, z17, str11, str12, z18);
        this.f19782W = zzafp;
    }

    public zzaft(zzafp zzafp, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, zzajk zzajk, List<String> list4, List<String> list5, boolean z9, zzafv zzafv, boolean z10, String str7, List<String> list6, boolean z11, String str8, zzajv zzajv, String str9, boolean z12, boolean z13, boolean z14, int i2, boolean z15, List<String> list7, boolean z16, String str10, String str11, boolean z17) {
        this(19, str, str2, list, -2, list2, j, z, -1, list3, j3, i, str3, j4, str4, false, null, str5, z2, z3, z4, z5, false, null, null, str6, z7, z8, zzajk, list4, list5, z9, zzafv, z10, str7, list6, z11, str8, zzajv, str9, z12, z13, null, z14, i2, z15, list7, z16, str10, str11, z17);
        this.f19782W = zzafp;
    }

    public zzaft(int i) {
        this(19, null, null, null, i, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null, null, false);
    }

    public zzaft(int i, long j) {
        this(19, null, null, null, i, null, -1, false, -1, null, j, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null, null, false);
    }

    @Constructor
    zzaft(@Param(id = 1) int i, @Param(id = 2) String str, @Param(id = 3) String str2, @Param(id = 4) List<String> list, @Param(id = 5) int i2, @Param(id = 6) List<String> list2, @Param(id = 7) long j, @Param(id = 8) boolean z, @Param(id = 9) long j2, @Param(id = 10) List<String> list3, @Param(id = 11) long j3, @Param(id = 12) int i3, @Param(id = 13) String str3, @Param(id = 14) long j4, @Param(id = 15) String str4, @Param(id = 18) boolean z2, @Param(id = 19) String str5, @Param(id = 21) String str6, @Param(id = 22) boolean z3, @Param(id = 23) boolean z4, @Param(id = 24) boolean z5, @Param(id = 25) boolean z6, @Param(id = 26) boolean z7, @Param(id = 28) zzagf zzagf, @Param(id = 29) String str7, @Param(id = 30) String str8, @Param(id = 31) boolean z8, @Param(id = 32) boolean z9, @Param(id = 33) zzajk zzajk, @Param(id = 34) List<String> list4, @Param(id = 35) List<String> list5, @Param(id = 36) boolean z10, @Param(id = 37) zzafv zzafv, @Param(id = 38) boolean z11, @Param(id = 39) String str9, @Param(id = 40) List<String> list6, @Param(id = 42) boolean z12, @Param(id = 43) String str10, @Param(id = 44) zzajv zzajv, @Param(id = 45) String str11, @Param(id = 46) boolean z13, @Param(id = 47) boolean z14, @Param(id = 48) Bundle bundle, @Param(id = 49) boolean z15, @Param(id = 50) int i4, @Param(id = 51) boolean z16, @Param(id = 52) List<String> list7, @Param(id = 53) boolean z17, @Param(id = 54) String str12, @Param(id = 55) String str13, @Param(id = 56) boolean z18) {
        this.f19783X = i;
        this.f19786a = str;
        this.f19787b = str2;
        List list8 = null;
        r0.f19788c = list != null ? Collections.unmodifiableList(list) : null;
        r0.f19789d = i2;
        r0.f19790e = list2 != null ? Collections.unmodifiableList(list2) : null;
        r0.f19791f = j;
        r0.f19792g = z;
        r0.f19793h = j2;
        r0.f19794i = list3 != null ? Collections.unmodifiableList(list3) : null;
        r0.f19795j = j3;
        r0.f19796k = i3;
        r0.f19797l = str3;
        r0.f19798m = j4;
        r0.f19799n = str4;
        r0.f19800o = z2;
        r0.f19801p = str5;
        r0.f19802q = str6;
        r0.f19803r = z3;
        r0.f19804s = z4;
        r0.f19805t = z5;
        r0.f19806u = z6;
        r0.f19772M = z13;
        r0.f19807v = z7;
        r0.f19784Y = zzagf;
        r0.f19808w = str7;
        r0.f19809x = str8;
        if (r0.f19787b == null && r0.f19784Y != null) {
            zzagt zzagt = (zzagt) r0.f19784Y.m26180a(zzagt.CREATOR);
            if (!(zzagt == null || TextUtils.isEmpty(zzagt.f19839a))) {
                r0.f19787b = zzagt.f19839a;
            }
        }
        r0.f19810y = z8;
        r0.f19811z = z9;
        r0.f19760A = zzajk;
        r0.f19761B = list4;
        r0.f19762C = list5;
        r0.f19763D = z10;
        r0.f19764E = zzafv;
        r0.f19765F = z11;
        r0.f19766G = str9;
        r0.f19767H = list6;
        r0.f19768I = z12;
        r0.f19769J = str10;
        r0.f19770K = zzajv;
        r0.f19771L = str11;
        r0.f19773N = z14;
        r0.f19785Z = bundle;
        r0.f19774O = z15;
        r0.f19775P = i4;
        r0.f19776Q = z16;
        if (list7 != null) {
            list8 = Collections.unmodifiableList(list7);
        }
        r0.f19777R = list8;
        r0.f19778S = z17;
        r0.f19779T = str12;
        r0.f19780U = str13;
        r0.f19781V = z18;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (!(this.f19782W == null || this.f19782W.f19733a < 9 || TextUtils.isEmpty(this.f19787b))) {
            this.f19784Y = new zzagf(new zzagt(this.f19787b));
            this.f19787b = null;
        }
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f19783X);
        SafeParcelWriter.writeString(parcel, 2, this.f19786a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f19787b, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.f19788c, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f19789d);
        SafeParcelWriter.writeStringList(parcel, 6, this.f19790e, false);
        SafeParcelWriter.writeLong(parcel, 7, this.f19791f);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f19792g);
        SafeParcelWriter.writeLong(parcel, 9, this.f19793h);
        SafeParcelWriter.writeStringList(parcel, 10, this.f19794i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.f19795j);
        SafeParcelWriter.writeInt(parcel, 12, this.f19796k);
        SafeParcelWriter.writeString(parcel, 13, this.f19797l, false);
        SafeParcelWriter.writeLong(parcel, 14, this.f19798m);
        SafeParcelWriter.writeString(parcel, 15, this.f19799n, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.f19800o);
        SafeParcelWriter.writeString(parcel, 19, this.f19801p, false);
        SafeParcelWriter.writeString(parcel, 21, this.f19802q, false);
        SafeParcelWriter.writeBoolean(parcel, 22, this.f19803r);
        SafeParcelWriter.writeBoolean(parcel, 23, this.f19804s);
        SafeParcelWriter.writeBoolean(parcel, 24, this.f19805t);
        SafeParcelWriter.writeBoolean(parcel, 25, this.f19806u);
        SafeParcelWriter.writeBoolean(parcel, 26, this.f19807v);
        SafeParcelWriter.writeParcelable(parcel, 28, this.f19784Y, i, false);
        SafeParcelWriter.writeString(parcel, 29, this.f19808w, false);
        SafeParcelWriter.writeString(parcel, 30, this.f19809x, false);
        SafeParcelWriter.writeBoolean(parcel, 31, this.f19810y);
        SafeParcelWriter.writeBoolean(parcel, 32, this.f19811z);
        SafeParcelWriter.writeParcelable(parcel, 33, this.f19760A, i, false);
        SafeParcelWriter.writeStringList(parcel, 34, this.f19761B, false);
        SafeParcelWriter.writeStringList(parcel, 35, this.f19762C, false);
        SafeParcelWriter.writeBoolean(parcel, 36, this.f19763D);
        SafeParcelWriter.writeParcelable(parcel, 37, this.f19764E, i, false);
        SafeParcelWriter.writeBoolean(parcel, 38, this.f19765F);
        SafeParcelWriter.writeString(parcel, 39, this.f19766G, false);
        SafeParcelWriter.writeStringList(parcel, 40, this.f19767H, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.f19768I);
        SafeParcelWriter.writeString(parcel, 43, this.f19769J, false);
        SafeParcelWriter.writeParcelable(parcel, 44, this.f19770K, i, false);
        SafeParcelWriter.writeString(parcel, 45, this.f19771L, false);
        SafeParcelWriter.writeBoolean(parcel, 46, this.f19772M);
        SafeParcelWriter.writeBoolean(parcel, 47, this.f19773N);
        SafeParcelWriter.writeBundle(parcel, 48, this.f19785Z, false);
        SafeParcelWriter.writeBoolean(parcel, 49, this.f19774O);
        SafeParcelWriter.writeInt(parcel, 50, this.f19775P);
        SafeParcelWriter.writeBoolean(parcel, 51, this.f19776Q);
        SafeParcelWriter.writeStringList(parcel, 52, this.f19777R, false);
        SafeParcelWriter.writeBoolean(parcel, 53, this.f19778S);
        SafeParcelWriter.writeString(parcel, 54, this.f19779T, false);
        SafeParcelWriter.writeString(parcel, 55, this.f19780U, false);
        SafeParcelWriter.writeBoolean(parcel, 56, this.f19781V);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
