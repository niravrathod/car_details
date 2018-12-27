package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.metadata.C2284a;
import com.google.android.exoplayer2.metadata.C4690c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.p126c.C2174j;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2183q;

/* renamed from: com.google.android.exoplayer2.metadata.scte35.a */
public final class C4030a implements C2284a {
    /* renamed from: a */
    private final C2175k f16209a = new C2175k();
    /* renamed from: b */
    private final C2174j f16210b = new C2174j();
    /* renamed from: c */
    private C2183q f16211c;

    /* renamed from: a */
    public Metadata mo1644a(C4690c c4690c) {
        if (this.f16211c == null || c4690c.f19387d != this.f16211c.m8032c()) {
            this.f16211c = new C2183q(c4690c.c);
            this.f16211c.m8033c(c4690c.c - c4690c.f19387d);
        }
        c4690c = c4690c.b;
        byte[] array = c4690c.array();
        int limit = c4690c.limit();
        this.f16209a.m7974a(array, limit);
        this.f16210b.m7961a(array, limit);
        this.f16210b.m7964b(39);
        long c = (((long) this.f16210b.m7966c(1)) << 32) | ((long) this.f16210b.m7966c(32));
        this.f16210b.m7964b(20);
        c4690c = this.f16210b.m7966c(12);
        int c2 = this.f16210b.m7966c(8);
        TimeSignalCommand timeSignalCommand = null;
        this.f16209a.m7981d(14);
        if (c2 == 0) {
            timeSignalCommand = new SpliceNullCommand();
        } else if (c2 != 255) {
            switch (c2) {
                case 4:
                    timeSignalCommand = SpliceScheduleCommand.m25834a(this.f16209a);
                    break;
                case 5:
                    timeSignalCommand = SpliceInsertCommand.m25833a(this.f16209a, c, this.f16211c);
                    break;
                case 6:
                    timeSignalCommand = TimeSignalCommand.m25836a(this.f16209a, c, this.f16211c);
                    break;
                default:
                    break;
            }
        } else {
            timeSignalCommand = PrivateCommand.m25832a(this.f16209a, c4690c, c);
        }
        if (timeSignalCommand == null) {
            return new Metadata(new Entry[0]);
        }
        return new Metadata(timeSignalCommand);
    }
}
