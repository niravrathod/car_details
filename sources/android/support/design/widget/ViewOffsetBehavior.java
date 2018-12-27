package android.support.design.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.util.AttributeSet;
import android.view.View;

class ViewOffsetBehavior<V extends View> extends Behavior<V> {
    /* renamed from: a */
    private C0220n f12974a;
    /* renamed from: b */
    private int f12975b = 0;
    /* renamed from: c */
    private int f12976c = 0;

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo112a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo3731b(coordinatorLayout, v, i);
        if (this.f12974a == null) {
            this.f12974a = new C0220n(v);
        }
        this.f12974a.m809a();
        if (this.f12975b != null) {
            this.f12974a.m810a(this.f12975b);
            this.f12975b = 0;
        }
        if (this.f12976c != null) {
            this.f12974a.m812b(this.f12976c);
            this.f12976c = 0;
        }
        return true;
    }

    /* renamed from: b */
    protected void mo3731b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m24121a((View) v, i);
    }

    /* renamed from: a */
    public boolean mo4587a(int i) {
        if (this.f12974a != null) {
            return this.f12974a.m810a(i);
        }
        this.f12975b = i;
        return false;
    }

    /* renamed from: b */
    public int mo4589b() {
        return this.f12974a != null ? this.f12974a.m811b() : 0;
    }
}
