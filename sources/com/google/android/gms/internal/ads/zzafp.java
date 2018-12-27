package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@Class(creator = "AdRequestInfoParcelCreator")
@ParametersAreNonnullByDefault
public final class zzafp extends AbstractSafeParcelable {
    public static final Creator<zzafp> CREATOR = new zzafr();
    @Field(id = 31)
    /* renamed from: A */
    public final long f19707A;
    @Field(id = 33)
    /* renamed from: B */
    public final String f19708B;
    @Field(id = 34)
    /* renamed from: C */
    public final float f19709C;
    @Field(id = 35)
    /* renamed from: D */
    public final int f19710D;
    @Field(id = 36)
    /* renamed from: E */
    public final int f19711E;
    @Field(id = 37)
    /* renamed from: F */
    public final boolean f19712F;
    @Field(id = 38)
    /* renamed from: G */
    public final boolean f19713G;
    @Field(id = 39)
    /* renamed from: H */
    public final String f19714H;
    @Field(id = 40)
    /* renamed from: I */
    public final boolean f19715I;
    @Field(id = 41)
    /* renamed from: J */
    public final String f19716J;
    @Field(id = 42)
    /* renamed from: K */
    public final boolean f19717K;
    @Field(id = 43)
    /* renamed from: L */
    public final int f19718L;
    @Field(id = 44)
    /* renamed from: M */
    public final Bundle f19719M;
    @Field(id = 45)
    /* renamed from: N */
    public final String f19720N;
    @Field(id = 46)
    /* renamed from: O */
    public final zzme f19721O;
    @Field(id = 47)
    /* renamed from: P */
    public final boolean f19722P;
    @Field(id = 48)
    /* renamed from: Q */
    public final Bundle f19723Q;
    @Field(id = 49)
    /* renamed from: R */
    public final String f19724R;
    @Field(id = 50)
    /* renamed from: S */
    public final String f19725S;
    @Field(id = 51)
    /* renamed from: T */
    public final String f19726T;
    @Field(id = 52)
    /* renamed from: U */
    public final boolean f19727U;
    @Field(id = 53)
    /* renamed from: V */
    public final List<Integer> f19728V;
    @Field(id = 54)
    /* renamed from: W */
    public final String f19729W;
    @Field(id = 55)
    /* renamed from: X */
    public final List<String> f19730X;
    @Field(id = 56)
    /* renamed from: Y */
    public final int f19731Y;
    @Field(id = 57)
    /* renamed from: Z */
    public final boolean f19732Z;
    @Field(id = 1)
    /* renamed from: a */
    public final int f19733a;
    @Field(id = 58)
    public final boolean aa;
    @Field(id = 59)
    public final boolean ab;
    @Field(id = 60)
    public final ArrayList<String> ac;
    @Field(id = 61)
    public final String ad;
    @Field(id = 63)
    public final zzti ae;
    @Field(id = 64)
    public final String af;
    @Field(id = 65)
    public final Bundle ag;
    @Field(id = 2)
    /* renamed from: b */
    public final Bundle f19734b;
    @Field(id = 3)
    /* renamed from: c */
    public final zzjk f19735c;
    @Field(id = 4)
    /* renamed from: d */
    public final zzjo f19736d;
    @Field(id = 5)
    /* renamed from: e */
    public final String f19737e;
    @Field(id = 6)
    /* renamed from: f */
    public final ApplicationInfo f19738f;
    @Field(id = 7)
    /* renamed from: g */
    public final PackageInfo f19739g;
    @Field(id = 8)
    /* renamed from: h */
    public final String f19740h;
    @Field(id = 9)
    /* renamed from: i */
    public final String f19741i;
    @Field(id = 10)
    /* renamed from: j */
    public final String f19742j;
    @Field(id = 11)
    /* renamed from: k */
    public final zzaop f19743k;
    @Field(id = 12)
    /* renamed from: l */
    public final Bundle f19744l;
    @Field(id = 13)
    /* renamed from: m */
    public final int f19745m;
    @Field(id = 14)
    /* renamed from: n */
    public final List<String> f19746n;
    @Field(id = 15)
    /* renamed from: o */
    public final Bundle f19747o;
    @Field(id = 16)
    /* renamed from: p */
    public final boolean f19748p;
    @Field(id = 18)
    /* renamed from: q */
    public final int f19749q;
    @Field(id = 19)
    /* renamed from: r */
    public final int f19750r;
    @Field(id = 20)
    /* renamed from: s */
    public final float f19751s;
    @Field(id = 21)
    /* renamed from: t */
    public final String f19752t;
    @Field(id = 25)
    /* renamed from: u */
    public final long f19753u;
    @Field(id = 26)
    /* renamed from: v */
    public final String f19754v;
    @Field(id = 27)
    /* renamed from: w */
    public final List<String> f19755w;
    @Field(id = 28)
    /* renamed from: x */
    public final String f19756x;
    @Field(id = 29)
    /* renamed from: y */
    public final zzpy f19757y;
    @Field(id = 30)
    /* renamed from: z */
    public final List<String> f19758z;

    private zzafp(Bundle bundle, zzjk zzjk, zzjo zzjo, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzaop zzaop, Bundle bundle2, int i, List<String> list, List<String> list2, Bundle bundle3, boolean z, int i2, int i3, float f, String str5, long j, String str6, List<String> list3, String str7, zzpy zzpy, long j2, String str8, float f2, boolean z2, int i4, int i5, boolean z3, boolean z4, String str9, String str10, boolean z5, int i6, Bundle bundle4, String str11, zzme zzme, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i7, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList, String str16, zzti zzti, String str17, Bundle bundle6) {
        this(24, bundle, zzjk, zzjo, str, applicationInfo, packageInfo, str2, str3, str4, zzaop, bundle2, i, list, bundle3, z, i2, i3, f, str5, j, str6, list3, str7, zzpy, list2, j2, str8, f2, z2, i4, i5, z3, z4, str9, str10, z5, i6, bundle4, str11, zzme, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i7, z8, z9, z10, arrayList, str16, zzti, str17, bundle6);
    }

    public zzafp(zzafq zzafq, long j, String str, String str2, String str3, String str4) {
        zzafq zzafq2 = zzafq;
        long j2 = j;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        Bundle bundle = zzafq2.f8566a;
        zzjk zzjk = zzafq2.f8567b;
        zzjo zzjo = zzafq2.f8568c;
        this(bundle, zzjk, zzjo, zzafq2.f8569d, zzafq2.f8570e, zzafq2.f8571f, (String) zzaox.m10024a(zzafq2.f8556Q, (Object) ""), zzafq2.f8572g, zzafq2.f8573h, zzafq2.f8575j, zzafq2.f8574i, zzafq2.f8576k, zzafq2.f8577l, zzafq2.f8578m, zzafq2.f8580o, zzafq2.f8581p, zzafq2.f8582q, zzafq2.f8583r, zzafq2.f8584s, zzafq2.f8585t, zzafq2.f8586u, zzafq2.f8587v, zzafq2.f8588w, zzafq2.f8589x, zzafq2.f8590y, j2, zzafq2.f8591z, zzafq2.f8540A, zzafq2.f8541B, zzafq2.f8542C, zzafq2.f8543D, zzafq2.f8544E, zzafq2.f8545F, (String) zzaox.m10025a(zzafq2.f8546G, (Object) "", 1, TimeUnit.SECONDS), zzafq2.f8547H, zzafq2.f8548I, zzafq2.f8549J, zzafq2.f8550K, zzafq2.f8551L, zzafq2.f8552M, zzafq2.f8553N, zzafq2.f8554O, str5, str6, str7, zzafq2.f8555P, zzafq2.f8557R, zzafq2.f8558S, zzafq2.f8579n, zzafq2.f8559T, zzafq2.f8560U, zzafq2.f8561V, zzafq2.f8562W, zzafq2.f8563X, zzafq2.f8564Y, zzafq2.f8565Z, str8, zzafq2.aa);
    }

    @Constructor
    zzafp(@Param(id = 1) int i, @Param(id = 2) Bundle bundle, @Param(id = 3) zzjk zzjk, @Param(id = 4) zzjo zzjo, @Param(id = 5) String str, @Param(id = 6) ApplicationInfo applicationInfo, @Param(id = 7) PackageInfo packageInfo, @Param(id = 8) String str2, @Param(id = 9) String str3, @Param(id = 10) String str4, @Param(id = 11) zzaop zzaop, @Param(id = 12) Bundle bundle2, @Param(id = 13) int i2, @Param(id = 14) List<String> list, @Param(id = 15) Bundle bundle3, @Param(id = 16) boolean z, @Param(id = 18) int i3, @Param(id = 19) int i4, @Param(id = 20) float f, @Param(id = 21) String str5, @Param(id = 25) long j, @Param(id = 26) String str6, @Param(id = 27) List<String> list2, @Param(id = 28) String str7, @Param(id = 29) zzpy zzpy, @Param(id = 30) List<String> list3, @Param(id = 31) long j2, @Param(id = 33) String str8, @Param(id = 34) float f2, @Param(id = 40) boolean z2, @Param(id = 35) int i5, @Param(id = 36) int i6, @Param(id = 37) boolean z3, @Param(id = 38) boolean z4, @Param(id = 39) String str9, @Param(id = 41) String str10, @Param(id = 42) boolean z5, @Param(id = 43) int i7, @Param(id = 44) Bundle bundle4, @Param(id = 45) String str11, @Param(id = 46) zzme zzme, @Param(id = 47) boolean z6, @Param(id = 48) Bundle bundle5, @Param(id = 49) String str12, @Param(id = 50) String str13, @Param(id = 51) String str14, @Param(id = 52) boolean z7, @Param(id = 53) List<Integer> list4, @Param(id = 54) String str15, @Param(id = 55) List<String> list5, @Param(id = 56) int i8, @Param(id = 57) boolean z8, @Param(id = 58) boolean z9, @Param(id = 59) boolean z10, @Param(id = 60) ArrayList<String> arrayList, @Param(id = 61) String str16, @Param(id = 63) zzti zzti, @Param(id = 64) String str17, @Param(id = 65) Bundle bundle6) {
        List emptyList;
        this.f19733a = i;
        this.f19734b = bundle;
        this.f19735c = zzjk;
        this.f19736d = zzjo;
        this.f19737e = str;
        this.f19738f = applicationInfo;
        this.f19739g = packageInfo;
        this.f19740h = str2;
        this.f19741i = str3;
        this.f19742j = str4;
        this.f19743k = zzaop;
        this.f19744l = bundle2;
        this.f19745m = i2;
        this.f19746n = list;
        if (list3 == null) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = Collections.unmodifiableList(list3);
        }
        r0.f19758z = emptyList;
        r0.f19747o = bundle3;
        r0.f19748p = z;
        r0.f19749q = i3;
        r0.f19750r = i4;
        r0.f19751s = f;
        r0.f19752t = str5;
        r0.f19753u = j;
        r0.f19754v = str6;
        if (list2 == null) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = Collections.unmodifiableList(list2);
        }
        r0.f19755w = emptyList;
        r0.f19756x = str7;
        r0.f19757y = zzpy;
        r0.f19707A = j2;
        r0.f19708B = str8;
        r0.f19709C = f2;
        r0.f19715I = z2;
        r0.f19710D = i5;
        r0.f19711E = i6;
        r0.f19712F = z3;
        r0.f19713G = z4;
        r0.f19714H = str9;
        r0.f19716J = str10;
        r0.f19717K = z5;
        r0.f19718L = i7;
        r0.f19719M = bundle4;
        r0.f19720N = str11;
        r0.f19721O = zzme;
        r0.f19722P = z6;
        r0.f19723Q = bundle5;
        r0.f19724R = str12;
        r0.f19725S = str13;
        r0.f19726T = str14;
        r0.f19727U = z7;
        r0.f19728V = list4;
        r0.f19729W = str15;
        r0.f19730X = list5;
        r0.f19731Y = i8;
        r0.f19732Z = z8;
        r0.aa = z9;
        r0.ab = z10;
        r0.ac = arrayList;
        r0.ad = str16;
        r0.ae = zzti;
        r0.af = str17;
        r0.ag = bundle6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f19733a);
        SafeParcelWriter.writeBundle(parcel, 2, this.f19734b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f19735c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f19736d, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f19737e, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f19738f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f19739g, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.f19740h, false);
        SafeParcelWriter.writeString(parcel, 9, this.f19741i, false);
        SafeParcelWriter.writeString(parcel, 10, this.f19742j, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f19743k, i, false);
        SafeParcelWriter.writeBundle(parcel, 12, this.f19744l, false);
        SafeParcelWriter.writeInt(parcel, 13, this.f19745m);
        SafeParcelWriter.writeStringList(parcel, 14, this.f19746n, false);
        SafeParcelWriter.writeBundle(parcel, 15, this.f19747o, false);
        SafeParcelWriter.writeBoolean(parcel, 16, this.f19748p);
        SafeParcelWriter.writeInt(parcel, 18, this.f19749q);
        SafeParcelWriter.writeInt(parcel, 19, this.f19750r);
        SafeParcelWriter.writeFloat(parcel, 20, this.f19751s);
        SafeParcelWriter.writeString(parcel, 21, this.f19752t, false);
        SafeParcelWriter.writeLong(parcel, 25, this.f19753u);
        SafeParcelWriter.writeString(parcel, 26, this.f19754v, false);
        SafeParcelWriter.writeStringList(parcel, 27, this.f19755w, false);
        SafeParcelWriter.writeString(parcel, 28, this.f19756x, false);
        SafeParcelWriter.writeParcelable(parcel, 29, this.f19757y, i, false);
        SafeParcelWriter.writeStringList(parcel, 30, this.f19758z, false);
        SafeParcelWriter.writeLong(parcel, 31, this.f19707A);
        SafeParcelWriter.writeString(parcel, 33, this.f19708B, false);
        SafeParcelWriter.writeFloat(parcel, 34, this.f19709C);
        SafeParcelWriter.writeInt(parcel, 35, this.f19710D);
        SafeParcelWriter.writeInt(parcel, 36, this.f19711E);
        SafeParcelWriter.writeBoolean(parcel, 37, this.f19712F);
        SafeParcelWriter.writeBoolean(parcel, 38, this.f19713G);
        SafeParcelWriter.writeString(parcel, 39, this.f19714H, false);
        SafeParcelWriter.writeBoolean(parcel, 40, this.f19715I);
        SafeParcelWriter.writeString(parcel, 41, this.f19716J, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.f19717K);
        SafeParcelWriter.writeInt(parcel, 43, this.f19718L);
        SafeParcelWriter.writeBundle(parcel, 44, this.f19719M, false);
        SafeParcelWriter.writeString(parcel, 45, this.f19720N, false);
        SafeParcelWriter.writeParcelable(parcel, 46, this.f19721O, i, false);
        SafeParcelWriter.writeBoolean(parcel, 47, this.f19722P);
        SafeParcelWriter.writeBundle(parcel, 48, this.f19723Q, false);
        SafeParcelWriter.writeString(parcel, 49, this.f19724R, false);
        SafeParcelWriter.writeString(parcel, 50, this.f19725S, false);
        SafeParcelWriter.writeString(parcel, 51, this.f19726T, false);
        SafeParcelWriter.writeBoolean(parcel, 52, this.f19727U);
        SafeParcelWriter.writeIntegerList(parcel, 53, this.f19728V, false);
        SafeParcelWriter.writeString(parcel, 54, this.f19729W, false);
        SafeParcelWriter.writeStringList(parcel, 55, this.f19730X, false);
        SafeParcelWriter.writeInt(parcel, 56, this.f19731Y);
        SafeParcelWriter.writeBoolean(parcel, 57, this.f19732Z);
        SafeParcelWriter.writeBoolean(parcel, 58, this.aa);
        SafeParcelWriter.writeBoolean(parcel, 59, this.ab);
        SafeParcelWriter.writeStringList(parcel, 60, this.ac, false);
        SafeParcelWriter.writeString(parcel, 61, this.ad, false);
        SafeParcelWriter.writeParcelable(parcel, 63, this.ae, i, false);
        SafeParcelWriter.writeString(parcel, 64, this.af, false);
        SafeParcelWriter.writeBundle(parcel, 65, this.ag, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
