package com.google.android.gms.internal.ads;

final class ls implements ly {
    /* renamed from: a */
    private ly[] f16540a;

    ls(ly... lyVarArr) {
        this.f16540a = lyVarArr;
    }

    /* renamed from: a */
    public final boolean mo2094a(Class<?> cls) {
        for (ly a : this.f16540a) {
            if (a.mo2094a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final lx mo2095b(Class<?> cls) {
        for (ly lyVar : this.f16540a) {
            if (lyVar.mo2094a(cls)) {
                return lyVar.mo2095b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        cls = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(cls.length() != 0 ? str.concat(cls) : new String(str));
    }
}
