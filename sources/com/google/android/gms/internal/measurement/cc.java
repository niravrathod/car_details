package com.google.android.gms.internal.measurement;

final class cc implements ci {
    /* renamed from: a */
    private ci[] f17449a;

    cc(ci... ciVarArr) {
        this.f17449a = ciVarArr;
    }

    /* renamed from: a */
    public final boolean mo3048a(Class<?> cls) {
        for (ci a : this.f17449a) {
            if (a.mo3048a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final ch mo3049b(Class<?> cls) {
        for (ci ciVar : this.f17449a) {
            if (ciVar.mo3048a(cls)) {
                return ciVar.mo3049b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        cls = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(cls.length() != 0 ? str.concat(cls) : new String(str));
    }
}
