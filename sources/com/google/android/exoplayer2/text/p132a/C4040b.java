package com.google.android.exoplayer2.text.p132a;

import android.text.Layout.Alignment;
import com.google.android.exoplayer2.text.C2333a;

/* renamed from: com.google.android.exoplayer2.text.a.b */
final class C4040b extends C2333a implements Comparable<C4040b> {
    /* renamed from: m */
    public final int f16265m;

    public /* synthetic */ int compareTo(Object obj) {
        return m20286a((C4040b) obj);
    }

    public C4040b(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.f16265m = i5;
    }

    /* renamed from: a */
    public int m20286a(C4040b c4040b) {
        if (c4040b.f16265m < this.f16265m) {
            return -1;
        }
        return c4040b.f16265m > this.f16265m ? 1 : null;
    }
}
