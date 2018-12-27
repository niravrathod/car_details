package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

class as implements at {
    /* renamed from: a */
    private final ViewOverlay f13073a;

    as(View view) {
        this.f13073a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo221a(Drawable drawable) {
        this.f13073a.add(drawable);
    }

    /* renamed from: b */
    public void mo222b(Drawable drawable) {
        this.f13073a.remove(drawable);
    }
}
