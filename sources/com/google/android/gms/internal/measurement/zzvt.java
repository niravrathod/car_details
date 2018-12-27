package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class zzvt extends IOException {
    private zzwt zzbzm = null;

    public zzvt(String str) {
        super(str);
    }

    /* renamed from: a */
    public final zzvt m12089a(zzwt zzwt) {
        this.zzbzm = zzwt;
        return this;
    }

    /* renamed from: a */
    static zzvt m12081a() {
        return new zzvt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static zzvt m12082b() {
        return new zzvt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static zzvt m12083c() {
        return new zzvt("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static zzvt m12084d() {
        return new zzvt("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: e */
    static zzvu m12085e() {
        return new zzvu("Protocol message tag had invalid wire type.");
    }

    /* renamed from: f */
    static zzvt m12086f() {
        return new zzvt("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: g */
    static zzvt m12087g() {
        return new zzvt("Failed to parse the message.");
    }

    /* renamed from: h */
    static zzvt m12088h() {
        return new zzvt("Protocol message had invalid UTF-8.");
    }
}
