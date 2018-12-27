package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@KeepForSdk
@Class(creator = "ExperimentTokensCreator")
@Reserved({1})
public class ExperimentTokens extends AbstractSafeParcelable {
    @KeepForSdk
    public static final Creator<ExperimentTokens> CREATOR = new zzh();
    /* renamed from: a */
    private static final byte[][] f20725a = new byte[0][];
    /* renamed from: b */
    private static final ExperimentTokens f20726b = new ExperimentTokens("", null, f20725a, f20725a, f20725a, f20725a, null, null);
    /* renamed from: k */
    private static final C2503a f20727k = new C4137a();
    /* renamed from: l */
    private static final C2503a f20728l = new C4138b();
    /* renamed from: m */
    private static final C2503a f20729m = new C4139c();
    /* renamed from: n */
    private static final C2503a f20730n = new C4140d();
    @Field(id = 2)
    /* renamed from: c */
    private final String f20731c;
    @Field(id = 3)
    /* renamed from: d */
    private final byte[] f20732d;
    @Field(id = 4)
    /* renamed from: e */
    private final byte[][] f20733e;
    @Field(id = 5)
    /* renamed from: f */
    private final byte[][] f20734f;
    @Field(id = 6)
    /* renamed from: g */
    private final byte[][] f20735g;
    @Field(id = 7)
    /* renamed from: h */
    private final byte[][] f20736h;
    @Field(id = 8)
    /* renamed from: i */
    private final int[] f20737i;
    @Field(id = 9)
    /* renamed from: j */
    private final byte[][] f20738j;

    /* renamed from: com.google.android.gms.phenotype.ExperimentTokens$a */
    private interface C2503a {
    }

    @Constructor
    public ExperimentTokens(@Param(id = 2) String str, @Param(id = 3) byte[] bArr, @Param(id = 4) byte[][] bArr2, @Param(id = 5) byte[][] bArr3, @Param(id = 6) byte[][] bArr4, @Param(id = 7) byte[][] bArr5, @Param(id = 8) int[] iArr, @Param(id = 9) byte[][] bArr6) {
        this.f20731c = str;
        this.f20732d = bArr;
        this.f20733e = bArr2;
        this.f20734f = bArr3;
        this.f20735g = bArr4;
        this.f20736h = bArr5;
        this.f20737i = iArr;
        this.f20738j = bArr6;
    }

    /* renamed from: a */
    private static List<Integer> m27377a(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        List<Integer> arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private static List<String> m27378a(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        List<String> arrayList = new ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private static void m27379a(StringBuilder stringBuilder, String str, byte[][] bArr) {
        stringBuilder.append(str);
        stringBuilder.append(SimpleComparison.EQUAL_TO_OPERATION);
        if (bArr == null) {
            str = "null";
        } else {
            stringBuilder.append("(");
            int length = bArr.length;
            int i = 0;
            Object obj = 1;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (obj == null) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append("'");
                stringBuilder.append(Base64.encodeToString(bArr2, 3));
                stringBuilder.append("'");
                i++;
                obj = null;
            }
            str = ")";
        }
        stringBuilder.append(str);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (zzn.m12396a(this.f20731c, experimentTokens.f20731c) && Arrays.equals(this.f20732d, experimentTokens.f20732d) && zzn.m12396a(m27378a(this.f20733e), m27378a(experimentTokens.f20733e)) && zzn.m12396a(m27378a(this.f20734f), m27378a(experimentTokens.f20734f)) && zzn.m12396a(m27378a(this.f20735g), m27378a(experimentTokens.f20735g)) && zzn.m12396a(m27378a(this.f20736h), m27378a(experimentTokens.f20736h)) && zzn.m12396a(m27377a(this.f20737i), m27377a(experimentTokens.f20737i)) && zzn.m12396a(m27378a(this.f20738j), m27378a(experimentTokens.f20738j))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder("ExperimentTokens");
        stringBuilder.append("(");
        if (this.f20731c == null) {
            str = "null";
        } else {
            str = this.f20731c;
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 2);
            stringBuilder2.append("'");
            stringBuilder2.append(str);
            stringBuilder2.append("'");
            str = stringBuilder2.toString();
        }
        stringBuilder.append(str);
        stringBuilder.append(", ");
        byte[] bArr = this.f20732d;
        stringBuilder.append("direct");
        stringBuilder.append(SimpleComparison.EQUAL_TO_OPERATION);
        if (bArr == null) {
            str = "null";
        } else {
            stringBuilder.append("'");
            stringBuilder.append(Base64.encodeToString(bArr, 3));
            str = "'";
        }
        stringBuilder.append(str);
        stringBuilder.append(", ");
        m27379a(stringBuilder, "GAIA", this.f20733e);
        stringBuilder.append(", ");
        m27379a(stringBuilder, "PSEUDO", this.f20734f);
        stringBuilder.append(", ");
        m27379a(stringBuilder, "ALWAYS", this.f20735g);
        stringBuilder.append(", ");
        m27379a(stringBuilder, "OTHER", this.f20736h);
        stringBuilder.append(", ");
        int[] iArr = this.f20737i;
        stringBuilder.append("weak");
        stringBuilder.append(SimpleComparison.EQUAL_TO_OPERATION);
        if (iArr == null) {
            str = "null";
        } else {
            stringBuilder.append("(");
            int length = iArr.length;
            int i = 0;
            Object obj = 1;
            while (i < length) {
                int i2 = iArr[i];
                if (obj == null) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(i2);
                i++;
                obj = null;
            }
            str = ")";
        }
        stringBuilder.append(str);
        stringBuilder.append(", ");
        m27379a(stringBuilder, "directs", this.f20738j);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f20731c, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f20732d, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 4, this.f20733e, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 5, this.f20734f, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 6, this.f20735g, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 7, this.f20736h, false);
        SafeParcelWriter.writeIntArray(parcel, 8, this.f20737i, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 9, this.f20738j, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
