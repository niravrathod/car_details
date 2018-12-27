package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.C2572b;
import com.google.firebase.analytics.connector.C2561a;
import com.google.firebase.components.C2577a;
import com.google.firebase.components.C2580d;
import com.google.firebase.components.C2581e;
import com.google.firebase.p137b.C2571d;
import java.util.Collections;
import java.util.List;

@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements C2580d {
    @Keep
    @SuppressLint({"MissingPermission"})
    @KeepForSdk
    public List<C2577a<?>> getComponents() {
        return Collections.singletonList(C2577a.m12628a(C2561a.class).m12625a(C2581e.m12641a(C2572b.class)).m12625a(C2581e.m12641a(Context.class)).m12625a(C2581e.m12641a(C2571d.class)).m12624a(C4185a.f17707a).m12626b().m12627c());
    }
}
