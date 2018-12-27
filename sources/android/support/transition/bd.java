package android.support.transition;

import android.view.View;
import android.view.WindowId;

class bd implements be {
    /* renamed from: a */
    private final WindowId f13077a;

    bd(View view) {
        this.f13077a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (!(obj instanceof bd) || ((bd) obj).f13077a.equals(this.f13077a) == null) ? null : true;
    }

    public int hashCode() {
        return this.f13077a.hashCode();
    }
}
