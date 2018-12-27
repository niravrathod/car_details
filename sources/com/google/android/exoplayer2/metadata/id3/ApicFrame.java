package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p126c.C2186s;
import java.util.Arrays;

public final class ApicFrame extends Id3Frame {
    public static final Creator<ApicFrame> CREATOR = new C22881();
    /* renamed from: a */
    public final String f19388a;
    /* renamed from: b */
    public final String f19389b;
    /* renamed from: c */
    public final int f19390c;
    /* renamed from: d */
    public final byte[] f19391d;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ApicFrame$1 */
    static class C22881 implements Creator<ApicFrame> {
        C22881() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8408a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8409a(i);
        }

        /* renamed from: a */
        public ApicFrame m8408a(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        /* renamed from: a */
        public ApicFrame[] m8409a(int i) {
            return new ApicFrame[i];
        }
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f19388a = str;
        this.f19389b = str2;
        this.f19390c = i;
        this.f19391d = bArr;
    }

    ApicFrame(Parcel parcel) {
        super("APIC");
        this.f19388a = parcel.readString();
        this.f19389b = parcel.readString();
        this.f19390c = parcel.readInt();
        this.f19391d = parcel.createByteArray();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                ApicFrame apicFrame = (ApicFrame) obj;
                if (this.f19390c != apicFrame.f19390c || !C2186s.m8052a(this.f19388a, apicFrame.f19388a) || !C2186s.m8052a(this.f19389b, apicFrame.f19389b) || Arrays.equals(this.f19391d, apicFrame.f19391d) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((527 + this.f19390c) * 31) + (this.f19388a != null ? this.f19388a.hashCode() : 0)) * 31;
        if (this.f19389b != null) {
            i = this.f19389b.hashCode();
        }
        return ((hashCode + i) * 31) + Arrays.hashCode(this.f19391d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19388a);
        parcel.writeString(this.f19389b);
        parcel.writeInt(this.f19390c);
        parcel.writeByteArray(this.f19391d);
    }
}
