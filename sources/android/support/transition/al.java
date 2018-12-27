package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

class al implements am {
    /* renamed from: a */
    private final ViewGroupOverlay f18400a;

    al(ViewGroup viewGroup) {
        this.f18400a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo221a(Drawable drawable) {
        this.f18400a.add(drawable);
    }

    /* renamed from: b */
    public void mo222b(Drawable drawable) {
        this.f18400a.remove(drawable);
    }

    /* renamed from: a */
    public void mo3737a(View view) {
        this.f18400a.add(view);
    }

    /* renamed from: b */
    public void mo3738b(View view) {
        this.f18400a.remove(view);
    }
}
