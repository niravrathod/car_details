package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p126c.C2186s;
import java.util.Arrays;

public final class PrivFrame extends Id3Frame {
    public static final Creator<PrivFrame> CREATOR = new C22941();
    /* renamed from: a */
    public final String f19411a;
    /* renamed from: b */
    public final byte[] f19412b;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.PrivFrame$1 */
    static class C22941 implements Creator<PrivFrame> {
        C22941() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8420a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8421a(i);
        }

        /* renamed from: a */
        public PrivFrame m8420a(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        /* renamed from: a */
        public PrivFrame[] m8421a(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f19411a = str;
        this.f19412b = bArr;
    }

    PrivFrame(Parcel parcel) {
        super("PRIV");
        this.f19411a = parcel.readString();
        this.f19412b = parcel.createByteArray();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                PrivFrame privFrame = (PrivFrame) obj;
                if (!C2186s.m8052a(this.f19411a, privFrame.f19411a) || Arrays.equals(this.f19412b, privFrame.f19412b) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + (this.f19411a != null ? this.f19411a.hashCode() : 0)) * 31) + Arrays.hashCode(this.f19412b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19411a);
        parcel.writeByteArray(this.f19412b);
    }
}
