package android.support.transition;

import android.support.transition.C0293y.C0292a;
import android.view.View;
import android.view.ViewGroup;

public class aa {
    /* renamed from: a */
    private ViewGroup f973a;
    /* renamed from: b */
    private Runnable f974b;

    /* renamed from: a */
    public void m970a() {
        if (m968a(this.f973a) == this && this.f974b != null) {
            this.f974b.run();
        }
    }

    /* renamed from: a */
    static void m969a(View view, aa aaVar) {
        view.setTag(C0292a.transition_current_scene, aaVar);
    }

    /* renamed from: a */
    static aa m968a(View view) {
        return (aa) view.getTag(C0292a.transition_current_scene);
    }
}
