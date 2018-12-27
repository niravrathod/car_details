package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p126c.C2175k;

public final class PrivateCommand extends SpliceCommand {
    public static final Creator<PrivateCommand> CREATOR = new C22991();
    /* renamed from: a */
    public final long f19417a;
    /* renamed from: b */
    public final long f19418b;
    /* renamed from: c */
    public final byte[] f19419c;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.PrivateCommand$1 */
    static class C22991 implements Creator<PrivateCommand> {
        C22991() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8430a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8431a(i);
        }

        /* renamed from: a */
        public PrivateCommand m8430a(Parcel parcel) {
            return new PrivateCommand(parcel);
        }

        /* renamed from: a */
        public PrivateCommand[] m8431a(int i) {
            return new PrivateCommand[i];
        }
    }

    private PrivateCommand(long j, byte[] bArr, long j2) {
        this.f19417a = j2;
        this.f19418b = j;
        this.f19419c = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.f19417a = parcel.readLong();
        this.f19418b = parcel.readLong();
        this.f19419c = new byte[parcel.readInt()];
        parcel.readByteArray(this.f19419c);
    }

    /* renamed from: a */
    static PrivateCommand m25832a(C2175k c2175k, int i, long j) {
        long l = c2175k.m7991l();
        byte[] bArr = new byte[(i - 4)];
        c2175k.m7975a(bArr, 0, bArr.length);
        return new PrivateCommand(l, bArr, j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f19417a);
        parcel.writeLong(this.f19418b);
        parcel.writeInt(this.f19419c.length);
        parcel.writeByteArray(this.f19419c);
    }
}
