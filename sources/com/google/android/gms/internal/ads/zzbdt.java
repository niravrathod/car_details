package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzbdt extends kf<String> implements zzbdu, RandomAccess {
    /* renamed from: a */
    private static final zzbdt f20052a;
    /* renamed from: b */
    private static final zzbdu f20053b = f20052a;
    /* renamed from: c */
    private final List<Object> f20054c;

    public zzbdt() {
        this(10);
    }

    public zzbdt(int i) {
        this(new ArrayList(i));
    }

    private zzbdt(ArrayList<Object> arrayList) {
        this.f20054c = arrayList;
    }

    public final int size() {
        return this.f20054c.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        m20595c();
        if (collection instanceof zzbdu) {
            collection = ((zzbdu) collection).mo2426d();
        }
        i = this.f20054c.addAll(i, collection);
        this.modCount++;
        return i;
    }

    public final void clear() {
        m20595c();
        this.f20054c.clear();
        this.modCount++;
    }

    /* renamed from: a */
    public final void mo2424a(zzbbu zzbbu) {
        m20595c();
        this.f20054c.add(zzbbu);
        this.modCount++;
    }

    /* renamed from: b */
    public final Object mo2425b(int i) {
        return this.f20054c.get(i);
    }

    /* renamed from: a */
    private static String m26509a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzbbu) {
            return ((zzbbu) obj).m10274c();
        }
        return zzbdf.m10333b((byte[]) obj);
    }

    /* renamed from: d */
    public final List<?> mo2426d() {
        return Collections.unmodifiableList(this.f20054c);
    }

    /* renamed from: e */
    public final zzbdu mo2427e() {
        return mo1969a() ? new zzbfx(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        m20595c();
        return m26509a(this.f20054c.set(i, str));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* synthetic */ Object remove(int i) {
        m20595c();
        Object remove = this.f20054c.remove(i);
        this.modCount++;
        return m26509a(remove);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo1969a() {
        return super.mo1969a();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        m20595c();
        this.f20054c.add(i, str);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: a */
    public final /* synthetic */ zzbdk mo4159a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f20054c);
            return new zzbdt(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f20054c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        String c;
        if (obj instanceof zzbbu) {
            zzbbu zzbbu = (zzbbu) obj;
            c = zzbbu.m10274c();
            if (zzbbu.mo4222d()) {
                this.f20054c.set(i, c);
            }
            return c;
        }
        byte[] bArr = (byte[]) obj;
        c = zzbdf.m10333b(bArr);
        if (zzbdf.m10332a(bArr)) {
            this.f20054c.set(i, c);
        }
        return c;
    }

    static {
        kf zzbdt = new zzbdt();
        f20052a = zzbdt;
        zzbdt.mo1970b();
    }
}
