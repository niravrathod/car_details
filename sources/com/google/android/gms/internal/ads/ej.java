package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

final /* synthetic */ class ej implements en {
    /* renamed from: a */
    private final String f16466a;
    /* renamed from: b */
    private final String f16467b;
    /* renamed from: c */
    private final Map f16468c;
    /* renamed from: d */
    private final byte[] f16469d;

    ej(String str, String str2, Map map, byte[] bArr) {
        this.f16466a = str;
        this.f16467b = str2;
        this.f16468c = map;
        this.f16469d = bArr;
    }

    /* renamed from: a */
    public final void mo1946a(JsonWriter jsonWriter) {
        zzaoe.m9982a(this.f16466a, this.f16467b, this.f16468c, this.f16469d, jsonWriter);
    }
}
