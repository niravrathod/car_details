package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2183q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceInsertCommand extends SpliceCommand {
    public static final Creator<SpliceInsertCommand> CREATOR = new C23001();
    /* renamed from: a */
    public final long f19420a;
    /* renamed from: b */
    public final boolean f19421b;
    /* renamed from: c */
    public final boolean f19422c;
    /* renamed from: d */
    public final boolean f19423d;
    /* renamed from: e */
    public final boolean f19424e;
    /* renamed from: f */
    public final long f19425f;
    /* renamed from: g */
    public final long f19426g;
    /* renamed from: h */
    public final List<C2301a> f19427h;
    /* renamed from: i */
    public final boolean f19428i;
    /* renamed from: j */
    public final long f19429j;
    /* renamed from: k */
    public final int f19430k;
    /* renamed from: l */
    public final int f19431l;
    /* renamed from: m */
    public final int f19432m;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$1 */
    static class C23001 implements Creator<SpliceInsertCommand> {
        C23001() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8432a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8433a(i);
        }

        /* renamed from: a */
        public SpliceInsertCommand m8432a(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        /* renamed from: a */
        public SpliceInsertCommand[] m8433a(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$a */
    public static final class C2301a {
        /* renamed from: a */
        public final int f7248a;
        /* renamed from: b */
        public final long f7249b;
        /* renamed from: c */
        public final long f7250c;

        private C2301a(int i, long j, long j2) {
            this.f7248a = i;
            this.f7249b = j;
            this.f7250c = j2;
        }

        /* renamed from: a */
        public void m8435a(Parcel parcel) {
            parcel.writeInt(this.f7248a);
            parcel.writeLong(this.f7249b);
            parcel.writeLong(this.f7250c);
        }

        /* renamed from: b */
        public static C2301a m8434b(Parcel parcel) {
            return new C2301a(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }
    }

    private SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C2301a> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f19420a = j;
        this.f19421b = z;
        this.f19422c = z2;
        this.f19423d = z3;
        this.f19424e = z4;
        this.f19425f = j2;
        this.f19426g = j3;
        this.f19427h = Collections.unmodifiableList(list);
        this.f19428i = z5;
        this.f19429j = j4;
        this.f19430k = i;
        this.f19431l = i2;
        this.f19432m = i3;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.f19420a = parcel.readLong();
        boolean z = false;
        this.f19421b = parcel.readByte() == (byte) 1;
        this.f19422c = parcel.readByte() == (byte) 1;
        this.f19423d = parcel.readByte() == (byte) 1;
        this.f19424e = parcel.readByte() == (byte) 1;
        this.f19425f = parcel.readLong();
        this.f19426g = parcel.readLong();
        int readInt = parcel.readInt();
        List arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C2301a.m8434b(parcel));
        }
        this.f19427h = Collections.unmodifiableList(arrayList);
        if (parcel.readByte() == (byte) 1) {
            z = true;
        }
        this.f19428i = z;
        this.f19429j = parcel.readLong();
        this.f19430k = parcel.readInt();
        this.f19431l = parcel.readInt();
        this.f19432m = parcel.readInt();
    }

    /* renamed from: a */
    static SpliceInsertCommand m25833a(C2175k c2175k, long j, C2183q c2183q) {
        List list;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int i;
        int i2;
        int i3;
        boolean z4;
        C2183q c2183q2 = c2183q;
        long l = c2175k.m7991l();
        boolean z5 = (c2175k.m7986g() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z5) {
            list = emptyList;
            z = false;
            z2 = false;
            j2 = -9223372036854775807L;
            z3 = false;
            j3 = -9223372036854775807L;
            i = 0;
            i2 = 0;
            i3 = 0;
            z4 = false;
        } else {
            List list2;
            long a;
            int g = c2175k.m7986g();
            boolean z6 = (g & 128) != 0;
            boolean z7 = (g & 64) != 0;
            Object obj = (g & 32) != 0 ? 1 : null;
            boolean z8 = (g & 16) != 0;
            long a2 = (!z7 || z8) ? -9223372036854775807L : TimeSignalCommand.m25835a(c2175k, j);
            if (z7) {
                list2 = emptyList;
            } else {
                int g2 = c2175k.m7986g();
                list2 = new ArrayList(g2);
                for (int i4 = 0; i4 < g2; i4++) {
                    int g3 = c2175k.m7986g();
                    a = !z8 ? TimeSignalCommand.m25835a(c2175k, j) : -9223372036854775807L;
                    list2.add(new C2301a(g3, a, c2183q2.m8031b(a)));
                }
            }
            if (obj != null) {
                long g4 = (long) c2175k.m7986g();
                z4 = (128 & g4) != 0;
                a = c2175k.m7991l() | ((g4 & 1) << 32);
            } else {
                a = -9223372036854775807L;
                z4 = false;
            }
            i = c2175k.m7987h();
            i2 = c2175k.m7986g();
            i3 = c2175k.m7986g();
            z = z6;
            list = list2;
            long j4 = a;
            z2 = z8;
            j2 = a2;
            z3 = z4;
            j3 = j4;
            z4 = z7;
        }
        return new SpliceInsertCommand(l, z5, z, z4, z2, j2, c2183q2.m8031b(j2), list, z3, j3, i, i2, i3);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f19420a);
        parcel.writeByte((byte) this.f19421b);
        parcel.writeByte((byte) this.f19422c);
        parcel.writeByte((byte) this.f19423d);
        parcel.writeByte((byte) this.f19424e);
        parcel.writeLong(this.f19425f);
        parcel.writeLong(this.f19426g);
        i = this.f19427h.size();
        parcel.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            ((C2301a) this.f19427h.get(i2)).m8435a(parcel);
        }
        parcel.writeByte((byte) this.f19428i);
        parcel.writeLong(this.f19429j);
        parcel.writeInt(this.f19430k);
        parcel.writeInt(this.f19431l);
        parcel.writeInt(this.f19432m);
    }
}
