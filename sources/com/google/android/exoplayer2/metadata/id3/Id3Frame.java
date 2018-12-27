package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.p126c.C2163a;

public abstract class Id3Frame implements Entry {
    /* renamed from: f */
    public final String f16206f;

    public int describeContents() {
        return 0;
    }

    public Id3Frame(String str) {
        this.f16206f = (String) C2163a.m7914a((Object) str);
    }
}
