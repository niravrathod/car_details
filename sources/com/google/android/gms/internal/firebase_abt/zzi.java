package com.google.android.gms.internal.firebase_abt;

import java.io.IOException;

public final class zzi extends IOException {
    public zzi(String str) {
        super(str);
    }

    /* renamed from: a */
    static zzi m11478a() {
        return new zzi("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static zzi m11479b() {
        return new zzi("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static zzi m11480c() {
        return new zzi("CodedInputStream encountered a malformed varint.");
    }
}
