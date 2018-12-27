package android.support.v7.widget;

import android.os.Build.VERSION;
import android.view.View;

public class ba {
    /* renamed from: a */
    public static void m3562a(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            bb.m3566a(view, charSequence);
        }
    }
}
