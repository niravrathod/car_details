package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzbdl extends IOException {
    private zzbel zzdys = null;

    public zzbdl(String str) {
        super(str);
    }

    /* renamed from: a */
    public final zzbdl m10349a(zzbel zzbel) {
        this.zzdys = zzbel;
        return this;
    }

    /* renamed from: a */
    static zzbdl m10340a() {
        return new zzbdl("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static zzbdl m10341b() {
        return new zzbdl("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static zzbdl m10342c() {
        return new zzbdl("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static zzbdl m10343d() {
        return new zzbdl("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    static zzbdl m10344e() {
        return new zzbdl("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    static zzbdm m10345f() {
        return new zzbdm("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    static zzbdl m10346g() {
        return new zzbdl("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: h */
    static zzbdl m10347h() {
        return new zzbdl("Failed to parse the message.");
    }

    /* renamed from: i */
    static zzbdl m10348i() {
        return new zzbdl("Protocol message had invalid UTF-8.");
    }
}
