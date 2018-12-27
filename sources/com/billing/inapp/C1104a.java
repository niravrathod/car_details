package com.billing.inapp;

import android.content.Context;
import android.util.Log;
import com.android.billingclient.api.C1025g;
import com.billing.inapp.p047a.C3347a.C1101a;
import java.util.List;

/* renamed from: com.billing.inapp.a */
public class C1104a {
    /* renamed from: a */
    private final C3343a f3614a = new C3343a();
    /* renamed from: b */
    private Context f3615b;
    /* renamed from: c */
    private int f3616c;

    /* renamed from: com.billing.inapp.a$a */
    private class C3343a implements C1101a {
        /* renamed from: a */
        final /* synthetic */ C1104a f14184a;

        /* renamed from: a */
        public void mo919a() {
        }

        /* renamed from: a */
        public void mo920a(int i, List<C1025g> list) {
        }

        private C3343a(C1104a c1104a) {
            this.f14184a = c1104a;
        }
    }

    /* renamed from: c */
    public int m4609c() {
        return 0;
    }

    public C1104a(Context context) {
        this.f3615b = context;
    }

    /* renamed from: a */
    public void m4607a() {
        this.f3616c--;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tank is now: ");
        stringBuilder.append(this.f3616c);
        Log.d("MainViewController", stringBuilder.toString());
    }

    /* renamed from: b */
    public boolean m4608b() {
        return this.f3616c <= 0;
    }
}
