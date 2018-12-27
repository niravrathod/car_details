package com.google.android.gms.internal.config;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class zzu implements zzk {
    /* renamed from: a */
    private final Map<String, TreeMap<String, byte[]>> f20480a;
    /* renamed from: b */
    private final Status f20481b;
    /* renamed from: c */
    private final long f20482c;
    /* renamed from: d */
    private final List<byte[]> f20483d;

    public zzu(Status status, Map<String, TreeMap<String, byte[]>> map) {
        this(status, (Map) map, -1);
    }

    private zzu(Status status, Map<String, TreeMap<String, byte[]>> map, long j) {
        this(status, map, -1, null);
    }

    public zzu(Status status, Map<String, TreeMap<String, byte[]>> map, long j, List<byte[]> list) {
        this.f20481b = status;
        this.f20480a = map;
        this.f20482c = j;
        this.f20483d = list;
    }

    public zzu(Status status, Map<String, TreeMap<String, byte[]>> map, List<byte[]> list) {
        this(status, map, -1, list);
    }

    /* renamed from: a */
    public final long mo4334a() {
        return this.f20482c;
    }

    /* renamed from: a */
    public final byte[] mo4335a(String str, byte[] bArr, String str2) {
        Object obj = null;
        if (this.f20480a != null) {
            if (this.f20480a.get(str2) != null) {
                if (((TreeMap) this.f20480a.get(str2)).get(str) != null) {
                    obj = 1;
                }
            }
        }
        return obj != null ? (byte[]) ((TreeMap) this.f20480a.get(str2)).get(str) : null;
    }

    /* renamed from: b */
    public final List<byte[]> mo4336b() {
        return this.f20483d;
    }

    /* renamed from: c */
    public final Map<String, Set<String>> mo4337c() {
        Map<String, Set<String>> hashMap = new HashMap();
        if (this.f20480a != null) {
            for (String str : this.f20480a.keySet()) {
                Map map = (Map) this.f20480a.get(str);
                if (map != null) {
                    hashMap.put(str, map.keySet());
                }
            }
        }
        return hashMap;
    }

    public final Status getStatus() {
        return this.f20481b;
    }
}
