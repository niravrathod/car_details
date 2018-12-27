package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzwb extends ar<String> implements zzwc, RandomAccess {
    /* renamed from: a */
    private static final zzwb f20668a;
    /* renamed from: b */
    private static final zzwc f20669b = f20668a;
    /* renamed from: c */
    private final List<Object> f20670c;

    public zzwb() {
        this(10);
    }

    public zzwb(int i) {
        this(new ArrayList(i));
    }

    private zzwb(ArrayList<Object> arrayList) {
        this.f20670c = arrayList;
    }

    public final int size() {
        return this.f20670c.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        m22174c();
        if (collection instanceof zzwc) {
            collection = ((zzwc) collection).mo3158d();
        }
        i = this.f20670c.addAll(i, collection);
        this.modCount++;
        return i;
    }

    public final void clear() {
        m22174c();
        this.f20670c.clear();
        this.modCount++;
    }

    /* renamed from: a */
    public final void mo3156a(zzud zzud) {
        m22174c();
        this.f20670c.add(zzud);
        this.modCount++;
    }

    /* renamed from: b */
    public final Object mo3157b(int i) {
        return this.f20670c.get(i);
    }

    /* renamed from: a */
    private static String m27272a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzud) {
            return ((zzud) obj).m12018b();
        }
        return zzvo.m12074b((byte[]) obj);
    }

    /* renamed from: d */
    public final List<?> mo3158d() {
        return Collections.unmodifiableList(this.f20670c);
    }

    /* renamed from: e */
    public final zzwc mo3159e() {
        return mo2923a() ? new zzye(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        m22174c();
        return m27272a(this.f20670c.set(i, str));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* synthetic */ Object remove(int i) {
        m22174c();
        Object remove = this.f20670c.remove(i);
        this.modCount++;
        return m27272a(remove);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2923a() {
        return super.mo2923a();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        m22174c();
        this.f20670c.add(i, str);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: a */
    public final /* synthetic */ zzvs mo4339a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f20670c);
            return new zzwb(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f20670c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        String b;
        if (obj instanceof zzud) {
            zzud zzud = (zzud) obj;
            b = zzud.m12018b();
            if (zzud.mo4357c()) {
                this.f20670c.set(i, b);
            }
            return b;
        }
        byte[] bArr = (byte[]) obj;
        b = zzvo.m12074b(bArr);
        if (zzvo.m12073a(bArr)) {
            this.f20670c.set(i, b);
        }
        return b;
    }

    static {
        ar zzwb = new zzwb();
        f20668a = zzwb;
        zzwb.mo2924b();
    }
}
