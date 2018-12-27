package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v4.app.e */
abstract class C4431e extends SupportActivity {
    /* renamed from: a */
    boolean f18415a;

    /* renamed from: a */
    abstract View mo4886a(View view, String str, Context context, AttributeSet attributeSet);

    C4431e() {
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo4886a(view, str, context, attributeSet);
        return a == null ? super.onCreateView(view, str, context, attributeSet) : a;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = mo4886a(null, str, context, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!(this.f18415a || i == -1)) {
            C4431e.m24254b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    /* renamed from: b */
    static void m24254b(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }
}
