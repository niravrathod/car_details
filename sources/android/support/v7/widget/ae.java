package android.support.v7.widget;

import android.support.v7.widget.RecyclerView.C0790o;
import android.support.v7.widget.RecyclerView.C0795s;
import android.view.View;

class ae {
    /* renamed from: a */
    boolean f2775a = true;
    /* renamed from: b */
    int f2776b;
    /* renamed from: c */
    int f2777c;
    /* renamed from: d */
    int f2778d;
    /* renamed from: e */
    int f2779e;
    /* renamed from: f */
    int f2780f = 0;
    /* renamed from: g */
    int f2781g = 0;
    /* renamed from: h */
    boolean f2782h;
    /* renamed from: i */
    boolean f2783i;

    ae() {
    }

    /* renamed from: a */
    boolean m3461a(C0795s c0795s) {
        return (this.f2777c < 0 || this.f2777c >= c0795s.m3249e()) ? null : true;
    }

    /* renamed from: a */
    View m3460a(C0790o c0790o) {
        c0790o = c0790o.m3201c(this.f2777c);
        this.f2777c += this.f2778d;
        return c0790o;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LayoutState{mAvailable=");
        stringBuilder.append(this.f2776b);
        stringBuilder.append(", mCurrentPosition=");
        stringBuilder.append(this.f2777c);
        stringBuilder.append(", mItemDirection=");
        stringBuilder.append(this.f2778d);
        stringBuilder.append(", mLayoutDirection=");
        stringBuilder.append(this.f2779e);
        stringBuilder.append(", mStartLine=");
        stringBuilder.append(this.f2780f);
        stringBuilder.append(", mEndLine=");
        stringBuilder.append(this.f2781g);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
