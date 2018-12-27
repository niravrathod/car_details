package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaze.zzb;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class zzavz<P> {
    /* renamed from: a */
    private static final Charset f9040a = Charset.forName("UTF-8");
    /* renamed from: b */
    private ConcurrentMap<String, List<zzawa<P>>> f9041b = new ConcurrentHashMap();
    /* renamed from: c */
    private zzawa<P> f9042c;

    /* renamed from: a */
    public final zzawa<P> m10200a() {
        return this.f9042c;
    }

    /* renamed from: b */
    public final Collection<List<zzawa<P>>> m10203b() {
        return this.f9041b.values();
    }

    /* renamed from: a */
    protected final void m10202a(zzawa<P> zzawa) {
        this.f9042c = zzawa;
    }

    /* renamed from: a */
    protected final zzawa<P> m10201a(P p, zzb zzb) {
        byte[] array;
        switch (ho.f8159a[zzb.m29202e().ordinal()]) {
            case 1:
            case 2:
                array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzb.m29201d()).array();
                break;
            case 3:
                array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzb.m29201d()).array();
                break;
            case 4:
                array = zzavp.f9037a;
                break;
            default:
                throw new GeneralSecurityException("unknown output prefix type");
        }
        zzawa<P> zzawa = new zzawa(p, array, zzb.m29200c(), zzb.m29202e());
        p = new ArrayList();
        p.add(zzawa);
        zzb = new String(zzawa.m10205b(), f9040a);
        List list = (List) this.f9041b.put(zzb, Collections.unmodifiableList(p));
        if (list != null) {
            List arrayList = new ArrayList();
            arrayList.addAll(list);
            arrayList.add(zzawa);
            this.f9041b.put(zzb, Collections.unmodifiableList(arrayList));
        }
        return zzawa;
    }
}
