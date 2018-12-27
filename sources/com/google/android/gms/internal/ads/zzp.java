package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public final class zzp {
    /* renamed from: a */
    public final int f9764a;
    /* renamed from: b */
    public final byte[] f9765b;
    /* renamed from: c */
    public final Map<String, String> f9766c;
    /* renamed from: d */
    public final List<zzl> f9767d;
    /* renamed from: e */
    public final boolean f9768e;
    /* renamed from: f */
    private final long f9769f;

    @Deprecated
    public zzp(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        List list;
        if (map == null) {
            list = null;
        } else if (map.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                list.add(new zzl((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(i, bArr, map, list, z, j);
    }

    public zzp(int i, byte[] bArr, boolean z, long j, List<zzl> list) {
        Map map;
        if (list == null) {
            map = null;
        } else if (list.isEmpty()) {
            map = Collections.emptyMap();
        } else {
            map = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (zzl zzl : list) {
                map.put(zzl.m10728a(), zzl.m10729b());
            }
        }
        this(i, bArr, map, list, z, j);
    }

    @Deprecated
    public zzp(byte[] bArr, Map<String, String> map) {
        this(200, bArr, (Map) map, false, 0);
    }

    private zzp(int i, byte[] bArr, Map<String, String> map, List<zzl> list, boolean z, long j) {
        this.f9764a = i;
        this.f9765b = bArr;
        this.f9766c = map;
        if (list == null) {
            this.f9767d = 0;
        } else {
            this.f9767d = Collections.unmodifiableList(list);
        }
        this.f9768e = z;
        this.f9769f = j;
    }
}
