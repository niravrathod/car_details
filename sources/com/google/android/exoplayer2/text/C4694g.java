package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.p124a.C3946e;

/* renamed from: com.google.android.exoplayer2.text.g */
public final class C4694g extends C3946e implements Comparable<C4694g> {
    /* renamed from: d */
    public long f19475d;

    public /* synthetic */ int compareTo(Object obj) {
        return m25903a((C4694g) obj);
    }

    public C4694g() {
        super(1);
    }

    /* renamed from: a */
    public int m25903a(C4694g c4694g) {
        long j = this.c - c4694g.c;
        if (j == 0) {
            return null;
        }
        return j > 0 ? true : -1;
    }
}
