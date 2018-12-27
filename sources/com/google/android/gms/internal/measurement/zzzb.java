package com.google.android.gms.internal.measurement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class zzzb<M extends zzza<M>, T> {
    /* renamed from: a */
    protected final Class<T> f10352a;
    /* renamed from: b */
    public final int f10353b;
    /* renamed from: c */
    protected final boolean f10354c;
    /* renamed from: d */
    private final int f10355d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzzb)) {
            return false;
        }
        zzzb zzzb = (zzzb) obj;
        return this.f10355d == zzzb.f10355d && this.f10352a == zzzb.f10352a && this.f10353b == zzzb.f10353b && this.f10354c == zzzb.f10354c;
    }

    public final int hashCode() {
        return ((((((this.f10355d + 1147) * 31) + this.f10352a.hashCode()) * 31) + this.f10353b) * 31) + this.f10354c;
    }

    /* renamed from: a */
    final T m12180a(List<dz> list) {
        if (list == null) {
            return null;
        }
        if (this.f10354c) {
            List arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                dz dzVar = (dz) list.get(i);
                if (dzVar.f10131b.length != 0) {
                    arrayList.add(m12178a(zzyx.m12124a(dzVar.f10131b)));
                }
            }
            list = arrayList.size();
            if (list == null) {
                return null;
            }
            T cast = this.f10352a.cast(Array.newInstance(this.f10352a.getComponentType(), list));
            for (int i2 = 0; i2 < list; i2++) {
                Array.set(cast, i2, arrayList.get(i2));
            }
            return cast;
        } else if (list.isEmpty()) {
            return null;
        } else {
            return this.f10352a.cast(m12178a(zzyx.m12124a(((dz) list.get(list.size() - 1)).f10131b)));
        }
    }

    /* renamed from: a */
    private final Object m12178a(zzyx zzyx) {
        StringBuilder stringBuilder;
        String valueOf;
        Class componentType = this.f10354c ? this.f10352a.getComponentType() : this.f10352a;
        try {
            zzzg zzzg;
            switch (this.f10355d) {
                case 10:
                    zzzg = (zzzg) componentType.newInstance();
                    zzyx.m12133a(zzzg, this.f10353b >>> 3);
                    return zzzg;
                case 11:
                    zzzg = (zzzg) componentType.newInstance();
                    zzyx.m12132a(zzzg);
                    return zzzg;
                default:
                    int i = this.f10355d;
                    stringBuilder = new StringBuilder(24);
                    stringBuilder.append("Unknown type ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (zzyx zzyx2) {
            valueOf = String.valueOf(componentType);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
            stringBuilder.append("Error creating instance of class ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString(), zzyx2);
        } catch (zzyx zzyx22) {
            valueOf = String.valueOf(componentType);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
            stringBuilder.append("Error creating instance of class ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString(), zzyx22);
        } catch (zzyx zzyx222) {
            throw new IllegalArgumentException("Error reading extension field", zzyx222);
        }
    }

    /* renamed from: a */
    protected final void m12181a(Object obj, zzyy zzyy) {
        try {
            zzyy.m12176c(this.f10353b);
            switch (this.f10355d) {
                case 10:
                    int i = this.f10353b >>> 3;
                    ((zzzg) obj).mo3160a(zzyy);
                    zzyy.m12177c(i, 4);
                    return;
                case 11:
                    zzyy.m12173a((zzzg) obj);
                    return;
                default:
                    zzyy = this.f10355d;
                    StringBuilder stringBuilder = new StringBuilder(24);
                    stringBuilder.append("Unknown type ");
                    stringBuilder.append(zzyy);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (Object obj2) {
            throw new IllegalStateException(obj2);
        }
    }

    /* renamed from: a */
    protected final int m12179a(Object obj) {
        int i = this.f10353b >>> 3;
        switch (this.f10355d) {
            case 10:
                return (zzyy.m12155b(i) << 1) + ((zzzg) obj).m12203e();
            case 11:
                return zzyy.m12157b(i, (zzzg) obj);
            default:
                i = this.f10355d;
                StringBuilder stringBuilder = new StringBuilder(24);
                stringBuilder.append("Unknown type ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
