package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzbgy extends IOException {
    public zzbgy(String str) {
        super(str);
    }

    public zzbgy(String str, Exception exception) {
        super(str, exception);
    }

    /* renamed from: a */
    static zzbgy m10445a() {
        return new zzbgy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static zzbgy m10446b() {
        return new zzbgy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static zzbgy m10447c() {
        return new zzbgy("CodedInputStream encountered a malformed varint.");
    }
}
