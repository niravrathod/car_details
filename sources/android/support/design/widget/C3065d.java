package android.support.design.widget;

import android.graphics.Outline;

/* renamed from: android.support.design.widget.d */
class C3065d extends C0201c {
    C3065d() {
    }

    public void getOutline(Outline outline) {
        copyBounds(this.b);
        outline.setOval(this.b);
    }
}
