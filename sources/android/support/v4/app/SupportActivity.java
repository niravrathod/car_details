package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.C0023f;
import android.arch.lifecycle.C0032o;
import android.arch.lifecycle.C3004g;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
import android.os.Bundle;
import android.support.v4.p017f.C0433m;

public class SupportActivity extends Activity implements C0023f {
    /* renamed from: a */
    private C0433m<Class<? extends Object>, Object> f13115a = new C0433m();
    /* renamed from: b */
    private C3004g f13116b = new C3004g(this);

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0032o.m77a((Activity) this);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        this.f13116b.m14719a(State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public Lifecycle getLifecycle() {
        return this.f13116b;
    }
}
