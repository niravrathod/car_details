package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class zzaq {
    /* renamed from: a */
    private final int f8965a;
    /* renamed from: b */
    private final List<zzl> f8966b;
    /* renamed from: c */
    private final int f8967c;
    /* renamed from: d */
    private final InputStream f8968d;

    public zzaq(int i, List<zzl> list) {
        this(i, list, -1, null);
    }

    public zzaq(int i, List<zzl> list, int i2, InputStream inputStream) {
        this.f8965a = i;
        this.f8966b = list;
        this.f8967c = i2;
        this.f8968d = inputStream;
    }

    /* renamed from: a */
    public final int m10043a() {
        return this.f8965a;
    }

    /* renamed from: b */
    public final List<zzl> m10044b() {
        return Collections.unmodifiableList(this.f8966b);
    }

    /* renamed from: c */
    public final int m10045c() {
        return this.f8967c;
    }

    /* renamed from: d */
    public final InputStream m10046d() {
        return this.f8968d;
    }
}
