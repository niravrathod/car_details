package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzzf extends IOException {
    public zzzf(String str) {
        super(str);
    }

    public zzzf(String str, Exception exception) {
        super(str, exception);
    }

    /* renamed from: a */
    static zzzf m12194a() {
        return new zzzf("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static zzzf m12195b() {
        return new zzzf("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static zzzf m12196c() {
        return new zzzf("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static zzzf m12197d() {
        return new zzzf("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
