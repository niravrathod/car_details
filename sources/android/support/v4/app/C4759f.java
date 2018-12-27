package android.support.v4.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* renamed from: android.support.v4.app.f */
abstract class C4759f extends C4431e {
    /* renamed from: b */
    boolean f20834b;

    C4759f() {
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!(this.f20834b || i == -1)) {
            C4431e.m24254b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!(this.a || i == -1)) {
            C4431e.m24254b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
