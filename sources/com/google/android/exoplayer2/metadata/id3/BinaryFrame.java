package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class BinaryFrame extends Id3Frame {
    public static final Creator<BinaryFrame> CREATOR = new C22891();
    /* renamed from: a */
    public final byte[] f19392a;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.BinaryFrame$1 */
    static class C22891 implements Creator<BinaryFrame> {
        C22891() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8410a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8411a(i);
        }

        /* renamed from: a */
        public BinaryFrame m8410a(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        /* renamed from: a */
        public BinaryFrame[] m8411a(int i) {
            return new BinaryFrame[i];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f19392a = bArr;
    }

    BinaryFrame(Parcel parcel) {
        super(parcel.readString());
        this.f19392a = parcel.createByteArray();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                BinaryFrame binaryFrame = (BinaryFrame) obj;
                if (!this.f.equals(binaryFrame.f) || Arrays.equals(this.f19392a, binaryFrame.f19392a) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f.hashCode()) * 31) + Arrays.hashCode(this.f19392a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeByteArray(this.f19392a);
    }
}
