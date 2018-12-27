package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.b */
class C0844b extends Drawable {
    /* renamed from: a */
    final ActionBarContainer f2854a;

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C0844b(ActionBarContainer actionBarContainer) {
        this.f2854a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        if (!this.f2854a.f2338d) {
            if (this.f2854a.f2335a != null) {
                this.f2854a.f2335a.draw(canvas);
            }
            if (this.f2854a.f2336b != null && this.f2854a.f2339e) {
                this.f2854a.f2336b.draw(canvas);
            }
        } else if (this.f2854a.f2337c != null) {
            this.f2854a.f2337c.draw(canvas);
        }
    }
}
