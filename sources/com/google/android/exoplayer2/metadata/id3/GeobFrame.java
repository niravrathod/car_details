package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p126c.C2186s;
import java.util.Arrays;

public final class GeobFrame extends Id3Frame {
    public static final Creator<GeobFrame> CREATOR = new C22931();
    /* renamed from: a */
    public final String f19407a;
    /* renamed from: b */
    public final String f19408b;
    /* renamed from: c */
    public final String f19409c;
    /* renamed from: d */
    public final byte[] f19410d;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.GeobFrame$1 */
    static class C22931 implements Creator<GeobFrame> {
        C22931() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8418a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8419a(i);
        }

        /* renamed from: a */
        public GeobFrame m8418a(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        /* renamed from: a */
        public GeobFrame[] m8419a(int i) {
            return new GeobFrame[i];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f19407a = str;
        this.f19408b = str2;
        this.f19409c = str3;
        this.f19410d = bArr;
    }

    GeobFrame(Parcel parcel) {
        super("GEOB");
        this.f19407a = parcel.readString();
        this.f19408b = parcel.readString();
        this.f19409c = parcel.readString();
        this.f19410d = parcel.createByteArray();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                GeobFrame geobFrame = (GeobFrame) obj;
                if (!C2186s.m8052a(this.f19407a, geobFrame.f19407a) || !C2186s.m8052a(this.f19408b, geobFrame.f19408b) || !C2186s.m8052a(this.f19409c, geobFrame.f19409c) || Arrays.equals(this.f19410d, geobFrame.f19410d) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((527 + (this.f19407a != null ? this.f19407a.hashCode() : 0)) * 31) + (this.f19408b != null ? this.f19408b.hashCode() : 0)) * 31;
        if (this.f19409c != null) {
            i = this.f19409c.hashCode();
        }
        return ((hashCode + i) * 31) + Arrays.hashCode(this.f19410d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19407a);
        parcel.writeString(this.f19408b);
        parcel.writeString(this.f19409c);
        parcel.writeByteArray(this.f19410d);
    }
}
