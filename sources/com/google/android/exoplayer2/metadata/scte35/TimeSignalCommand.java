package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2183q;

public final class TimeSignalCommand extends SpliceCommand {
    public static final Creator<TimeSignalCommand> CREATOR = new C23061();
    /* renamed from: a */
    public final long f19434a;
    /* renamed from: b */
    public final long f19435b;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand$1 */
    static class C23061 implements Creator<TimeSignalCommand> {
        C23061() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8450a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8451a(i);
        }

        /* renamed from: a */
        public TimeSignalCommand m8450a(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
        }

        /* renamed from: a */
        public TimeSignalCommand[] m8451a(int i) {
            return new TimeSignalCommand[i];
        }
    }

    private TimeSignalCommand(long j, long j2) {
        this.f19434a = j;
        this.f19435b = j2;
    }

    /* renamed from: a */
    static TimeSignalCommand m25836a(C2175k c2175k, long j, C2183q c2183q) {
        c2175k = m25835a(c2175k, j);
        return new TimeSignalCommand(c2175k, c2183q.m8031b(c2175k));
    }

    /* renamed from: a */
    static long m25835a(C2175k c2175k, long j) {
        long g = (long) c2175k.m7986g();
        return (128 & g) != 0 ? -1 & ((((g & 1) << 32) | c2175k.m7991l()) + j) : 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f19434a);
        parcel.writeLong(this.f19435b);
    }
}
