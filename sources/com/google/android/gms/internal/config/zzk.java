package com.google.android.gms.internal.config;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface zzk extends Result {
    /* renamed from: a */
    long mo4334a();

    /* renamed from: a */
    byte[] mo4335a(String str, byte[] bArr, String str2);

    /* renamed from: b */
    List<byte[]> mo4336b();

    /* renamed from: c */
    Map<String, Set<String>> mo4337c();

    Status getStatus();
}
