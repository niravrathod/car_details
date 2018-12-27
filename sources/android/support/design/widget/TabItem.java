package android.support.design.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.design.C0143a.C0142k;
import android.support.v7.widget.ay;
import android.util.AttributeSet;
import android.view.View;

public final class TabItem extends View {
    /* renamed from: a */
    final CharSequence f624a;
    /* renamed from: b */
    final Drawable f625b;
    /* renamed from: c */
    final int f626c;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context = ay.m3542a(context, attributeSet, C0142k.TabItem);
        this.f624a = context.m3553c(C0142k.TabItem_android_text);
        this.f625b = context.m3547a(C0142k.TabItem_android_icon);
        this.f626c = context.m3560g(C0142k.TabItem_android_layout, 0);
        context.m3548a();
    }
}
