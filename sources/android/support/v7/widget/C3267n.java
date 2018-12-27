package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.p020a.C0637a.C0636j;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.n */
class C3267n extends C0866m {
    /* renamed from: b */
    private aw f13981b;
    /* renamed from: c */
    private aw f13982c;

    C3267n(TextView textView) {
        super(textView);
    }

    /* renamed from: a */
    void mo831a(AttributeSet attributeSet, int i) {
        super.mo831a(attributeSet, i);
        Context context = this.a.getContext();
        C0862h a = C0862h.m3671a();
        attributeSet = context.obtainStyledAttributes(attributeSet, C0636j.AppCompatTextHelper, i, 0);
        if (attributeSet.hasValue(C0636j.AppCompatTextHelper_android_drawableStart) != 0) {
            this.f13981b = C0866m.m3711a(context, a, attributeSet.getResourceId(C0636j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (attributeSet.hasValue(C0636j.AppCompatTextHelper_android_drawableEnd) != 0) {
            this.f13982c = C0866m.m3711a(context, a, attributeSet.getResourceId(C0636j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        attributeSet.recycle();
    }

    /* renamed from: a */
    void mo830a() {
        super.mo830a();
        if (this.f13981b != null || this.f13982c != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            m3722a(compoundDrawablesRelative[0], this.f13981b);
            m3722a(compoundDrawablesRelative[2], this.f13982c);
        }
    }
}
