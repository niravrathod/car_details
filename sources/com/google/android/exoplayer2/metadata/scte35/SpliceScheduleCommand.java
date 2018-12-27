package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p126c.C2175k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Creator<SpliceScheduleCommand> CREATOR = new C23031();
    /* renamed from: a */
    public final List<C2305b> f19433a;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$1 */
    static class C23031 implements Creator<SpliceScheduleCommand> {
        C23031() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8438a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8439a(i);
        }

        /* renamed from: a */
        public SpliceScheduleCommand m8438a(Parcel parcel) {
            return new SpliceScheduleCommand(parcel);
        }

        /* renamed from: a */
        public SpliceScheduleCommand[] m8439a(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$a */
    public static final class C2304a {
        /* renamed from: a */
        public final int f7251a;
        /* renamed from: b */
        public final long f7252b;

        private C2304a(int i, long j) {
            this.f7251a = i;
            this.f7252b = j;
        }

        /* renamed from: b */
        private static C2304a m8442b(Parcel parcel) {
            return new C2304a(parcel.readInt(), parcel.readLong());
        }

        /* renamed from: c */
        private void m8443c(Parcel parcel) {
            parcel.writeInt(this.f7251a);
            parcel.writeLong(this.f7252b);
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$b */
    public static final class C2305b {
        /* renamed from: a */
        public final long f7253a;
        /* renamed from: b */
        public final boolean f7254b;
        /* renamed from: c */
        public final boolean f7255c;
        /* renamed from: d */
        public final boolean f7256d;
        /* renamed from: e */
        public final long f7257e;
        /* renamed from: f */
        public final List<C2304a> f7258f;
        /* renamed from: g */
        public final boolean f7259g;
        /* renamed from: h */
        public final long f7260h;
        /* renamed from: i */
        public final int f7261i;
        /* renamed from: j */
        public final int f7262j;
        /* renamed from: k */
        public final int f7263k;

        private C2305b(long j, boolean z, boolean z2, boolean z3, List<C2304a> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f7253a = j;
            this.f7254b = z;
            this.f7255c = z2;
            this.f7256d = z3;
            this.f7258f = Collections.unmodifiableList(list);
            this.f7257e = j2;
            this.f7259g = z4;
            this.f7260h = j3;
            this.f7261i = i;
            this.f7262j = i2;
            this.f7263k = i3;
        }

        private C2305b(Parcel parcel) {
            this.f7253a = parcel.readLong();
            boolean z = false;
            this.f7254b = parcel.readByte() == (byte) 1;
            this.f7255c = parcel.readByte() == (byte) 1;
            this.f7256d = parcel.readByte() == (byte) 1;
            int readInt = parcel.readInt();
            List arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C2304a.m8442b(parcel));
            }
            this.f7258f = Collections.unmodifiableList(arrayList);
            this.f7257e = parcel.readLong();
            if (parcel.readByte() == (byte) 1) {
                z = true;
            }
            this.f7259g = z;
            this.f7260h = parcel.readLong();
            this.f7261i = parcel.readInt();
            this.f7262j = parcel.readInt();
            this.f7263k = parcel.readInt();
        }

        /* renamed from: b */
        private static C2305b m8447b(C2175k c2175k) {
            List list;
            boolean z;
            long j;
            boolean z2;
            long j2;
            int i;
            int i2;
            int i3;
            boolean z3;
            long l = c2175k.m7991l();
            boolean z4 = (c2175k.m7986g() & 128) != 0;
            ArrayList arrayList = new ArrayList();
            if (z4) {
                list = arrayList;
                z = false;
                j = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                i3 = 0;
                z3 = false;
            } else {
                boolean z5;
                long l2;
                int g = c2175k.m7986g();
                z2 = (g & 128) != 0;
                boolean z6 = (g & 64) != 0;
                Object obj = (g & 32) != 0 ? 1 : null;
                long l3 = z6 ? c2175k.m7991l() : -9223372036854775807L;
                if (!z6) {
                    int g2 = c2175k.m7986g();
                    ArrayList arrayList2 = new ArrayList(g2);
                    for (int i4 = 0; i4 < g2; i4++) {
                        arrayList2.add(new C2304a(c2175k.m7986g(), c2175k.m7991l()));
                    }
                    arrayList = arrayList2;
                }
                if (obj != null) {
                    long g3 = (long) c2175k.m7986g();
                    z5 = (128 & g3) != 0;
                    l2 = c2175k.m7991l() | ((g3 & 1) << 32);
                } else {
                    z5 = false;
                    l2 = -9223372036854775807L;
                }
                int h = c2175k.m7987h();
                int g4 = c2175k.m7986g();
                i3 = c2175k.m7986g();
                z3 = z6;
                j = l3;
                j2 = l2;
                list = arrayList;
                i = h;
                i2 = g4;
                z = z2;
                z2 = z5;
            }
            return new C2305b(l, z4, z, z3, list, j, z2, j2, i, i2, i3);
        }

        /* renamed from: b */
        private void m8448b(Parcel parcel) {
            parcel.writeLong(this.f7253a);
            parcel.writeByte((byte) this.f7254b);
            parcel.writeByte((byte) this.f7255c);
            parcel.writeByte((byte) this.f7256d);
            int size = this.f7258f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                ((C2304a) this.f7258f.get(i)).m8443c(parcel);
            }
            parcel.writeLong(this.f7257e);
            parcel.writeByte((byte) this.f7259g);
            parcel.writeLong(this.f7260h);
            parcel.writeInt(this.f7261i);
            parcel.writeInt(this.f7262j);
            parcel.writeInt(this.f7263k);
        }

        /* renamed from: c */
        private static C2305b m8449c(Parcel parcel) {
            return new C2305b(parcel);
        }
    }

    private SpliceScheduleCommand(List<C2305b> list) {
        this.f19433a = Collections.unmodifiableList(list);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        List arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C2305b.m8449c(parcel));
        }
        this.f19433a = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static SpliceScheduleCommand m25834a(C2175k c2175k) {
        int g = c2175k.m7986g();
        List arrayList = new ArrayList(g);
        for (int i = 0; i < g; i++) {
            arrayList.add(C2305b.m8447b(c2175k));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = this.f19433a.size();
        parcel.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            ((C2305b) this.f19433a.get(i2)).m8448b(parcel);
        }
    }
}
