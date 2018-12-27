package android.support.v7.p028f;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: android.support.v7.f.a */
public class C0694a implements TransformationMethod {
    /* renamed from: a */
    private Locale f2223a;

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public C0694a(Context context) {
        this.f2223a = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        return charSequence != null ? charSequence.toString().toUpperCase(this.f2223a) : null;
    }
}
