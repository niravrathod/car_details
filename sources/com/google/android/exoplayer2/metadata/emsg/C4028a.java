package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.exoplayer2.metadata.C2284a;
import com.google.android.exoplayer2.metadata.C4690c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p126c.C2175k;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.emsg.a */
public final class C4028a implements C2284a {
    /* renamed from: a */
    public Metadata mo1644a(C4690c c4690c) {
        c4690c = c4690c.b;
        byte[] array = c4690c.array();
        c4690c = c4690c.limit();
        C2175k c2175k = new C2175k(array, c4690c);
        String x = c2175k.m8003x();
        String x2 = c2175k.m8003x();
        long l = c2175k.m7991l();
        c2175k.m7981d(4);
        l = (c2175k.m7991l() * 1000) / l;
        long l2 = c2175k.m7991l();
        byte[] copyOfRange = Arrays.copyOfRange(array, c2175k.m7980d(), c4690c);
        return new Metadata(new EventMessage(x, x2, l, l2, copyOfRange));
    }
}
