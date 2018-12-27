package android.support.v7.widget;

import android.graphics.Outline;

/* renamed from: android.support.v7.widget.c */
class C3260c extends C0844b {
    public C3260c(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    public void getOutline(Outline outline) {
        if (this.a.f2338d) {
            if (this.a.f2337c != null) {
                this.a.f2337c.getOutline(outline);
            }
        } else if (this.a.f2335a != null) {
            this.a.f2335a.getOutline(outline);
        }
    }
}
