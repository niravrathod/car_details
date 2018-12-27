package android.support.transition;

import android.os.IBinder;

class bc implements be {
    /* renamed from: a */
    private final IBinder f13076a;

    bc(IBinder iBinder) {
        this.f13076a = iBinder;
    }

    public boolean equals(Object obj) {
        return (!(obj instanceof bc) || ((bc) obj).f13076a.equals(this.f13076a) == null) ? null : true;
    }

    public int hashCode() {
        return this.f13076a.hashCode();
    }
}
