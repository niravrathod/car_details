package com.google.firebase.iid;

import android.support.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.C2572b;
import com.google.firebase.components.C2577a;
import com.google.firebase.components.C2580d;
import com.google.firebase.components.C2581e;
import com.google.firebase.iid.p139a.C2586a;
import com.google.firebase.p137b.C2571d;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
public final class Registrar implements C2580d {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    private static class C4195a implements C2586a {
        /* renamed from: a */
        private final FirebaseInstanceId f17723a;

        public C4195a(FirebaseInstanceId firebaseInstanceId) {
            this.f17723a = firebaseInstanceId;
        }
    }

    @Keep
    public final List<C2577a<?>> getComponents() {
        C2577a c = C2577a.m12628a(FirebaseInstanceId.class).m12625a(C2581e.m12641a(C2572b.class)).m12625a(C2581e.m12641a(C2571d.class)).m12624a(C4198p.f17743a).m12623a().m12627c();
        C2577a c2 = C2577a.m12628a(C2586a.class).m12625a(C2581e.m12641a(FirebaseInstanceId.class)).m12624a(C4199q.f17744a).m12627c();
        return Arrays.asList(new C2577a[]{c, c2});
    }
}
